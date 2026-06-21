package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.PerformanceCollectionData;
import io.sentry.SentryLevel;
import io.sentry.SentryNanotimeDate;
import io.sentry.SentryUUID;
import io.sentry.TransactionOptions;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.profilemeasurements.ProfileMeasurementValue;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AndroidProfiler {
    private static final int BUFFER_SIZE_BYTES = 3000000;
    private static final int PROFILING_TIMEOUT_MILLIS = 30000;

    @NotNull
    private final SentryFrameMetricsCollector frameMetricsCollector;

    @Nullable
    private String frameMetricsCollectorId;
    private final int intervalUs;

    @NotNull
    private final ILogger logger;

    @Nullable
    private final LazyEvaluator.Evaluator<ISentryExecutorService> timeoutExecutorServiceSupplier;

    @NotNull
    private final File traceFilesDir;
    private long profileStartNanos = 0;

    @Nullable
    private Future<?> scheduledFinish = null;

    @Nullable
    private File traceFile = null;

    @NotNull
    private final ArrayDeque<ProfileMeasurementValue> screenFrameRateMeasurements = new ArrayDeque<>();

    @NotNull
    private final ArrayDeque<ProfileMeasurementValue> slowFrameRenderMeasurements = new ArrayDeque<>();

    @NotNull
    private final ArrayDeque<ProfileMeasurementValue> frozenFrameRenderMeasurements = new ArrayDeque<>();

    @NotNull
    private final Map<String, ProfileMeasurement> measurementsMap = new HashMap();
    private volatile boolean isRunning = false;

    @NotNull
    protected final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class ProfileEndData {
        public final boolean didTimeout;
        public final long endCpuMillis;
        public final long endNanos;

        @NotNull
        public final Map<String, ProfileMeasurement> measurementsMap;

        @NotNull
        public final File traceFile;

        public ProfileEndData(long j10, long j11, boolean z5, @NotNull File file, @NotNull Map<String, ProfileMeasurement> map) {
            this.endNanos = j10;
            this.traceFile = file;
            this.endCpuMillis = j11;
            this.measurementsMap = map;
            this.didTimeout = z5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class ProfileStartData {
        public final long startCpuMillis;
        public final long startNanos;

        @NotNull
        public final Date startTimestamp;

        public ProfileStartData(long j10, long j11, @NotNull Date date) {
            this.startNanos = j10;
            this.startCpuMillis = j11;
            this.startTimestamp = date;
        }
    }

    public AndroidProfiler(@NotNull String str, int i, @NotNull SentryFrameMetricsCollector sentryFrameMetricsCollector, @Nullable LazyEvaluator.Evaluator<ISentryExecutorService> evaluator, @NotNull ILogger iLogger) {
        this.traceFilesDir = new File((String) Objects.requireNonNull(str, "TracesFilesDirPath is required"));
        this.intervalUs = i;
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required");
        this.timeoutExecutorServiceSupplier = evaluator;
        this.frameMetricsCollector = (SentryFrameMetricsCollector) Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        endAndCollect(true, null);
    }

    @SuppressLint({"NewApi"})
    private void putPerformanceCollectionDataInMeasurements(@Nullable List<PerformanceCollectionData> list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.profileStartNanos) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    for (PerformanceCollectionData performanceCollectionData : list) {
                        long nanoTimestamp = performanceCollectionData.getNanoTimestamp();
                        long j10 = nanoTimestamp + jElapsedRealtimeNanos;
                        Double cpuUsagePercentage = performanceCollectionData.getCpuUsagePercentage();
                        Long usedHeapMemory = performanceCollectionData.getUsedHeapMemory();
                        Long usedNativeMemory = performanceCollectionData.getUsedNativeMemory();
                        if (cpuUsagePercentage != null) {
                            arrayDeque3.add(new ProfileMeasurementValue(Long.valueOf(j10), cpuUsagePercentage, nanoTimestamp));
                        }
                        if (usedHeapMemory != null) {
                            arrayDeque.add(new ProfileMeasurementValue(Long.valueOf(j10), usedHeapMemory, nanoTimestamp));
                        }
                        if (usedNativeMemory != null) {
                            arrayDeque2.add(new ProfileMeasurementValue(Long.valueOf(j10), usedNativeMemory, nanoTimestamp));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_CPU_USAGE, new ProfileMeasurement("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_MEMORY_FOOTPRINT, new ProfileMeasurement("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.measurementsMap.put(ProfileMeasurement.ID_MEMORY_NATIVE_FOOTPRINT, new ProfileMeasurement("byte", arrayDeque2));
        }
    }

    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            Future<?> future = this.scheduledFinish;
            if (future != null) {
                future.cancel(true);
                this.scheduledFinish = null;
            }
            if (this.isRunning) {
                endAndCollect(true, null);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public ProfileEndData endAndCollect(boolean z5, @Nullable List<PerformanceCollectionData> list) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.isRunning) {
                this.logger.log(SentryLevel.WARNING, "Profiler not running", new Object[0]);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                } catch (Throwable th2) {
                }
            }
            this.isRunning = false;
            this.frameMetricsCollector.stopCollection(this.frameMetricsCollectorId);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.traceFile == null) {
                this.logger.log(SentryLevel.ERROR, "Trace file does not exists", new Object[0]);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            if (!this.slowFrameRenderMeasurements.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_SLOW_FRAME_RENDERS, new ProfileMeasurement("nanosecond", this.slowFrameRenderMeasurements));
            }
            if (!this.frozenFrameRenderMeasurements.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_FROZEN_FRAME_RENDERS, new ProfileMeasurement("nanosecond", this.frozenFrameRenderMeasurements));
            }
            if (!this.screenFrameRateMeasurements.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_SCREEN_FRAME_RATES, new ProfileMeasurement(ProfileMeasurement.UNIT_HZ, this.screenFrameRateMeasurements));
            }
            putPerformanceCollectionDataInMeasurements(list);
            Future<?> future = this.scheduledFinish;
            if (future != null) {
                future.cancel(true);
                this.scheduledFinish = null;
            }
            ProfileEndData profileEndData = new ProfileEndData(jElapsedRealtimeNanos, elapsedCpuTime, z5, this.traceFile, this.measurementsMap);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return profileEndData;
        } finally {
        }
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public ProfileStartData start() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            int i = this.intervalUs;
            if (i == 0) {
                this.logger.log(SentryLevel.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return null;
                }
            } else if (this.isRunning) {
                this.logger.log(SentryLevel.WARNING, "Profiling has already started...", new Object[0]);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return null;
                }
            } else {
                this.traceFile = new File(this.traceFilesDir, SentryUUID.generateSentryId() + ".trace");
                this.measurementsMap.clear();
                this.screenFrameRateMeasurements.clear();
                this.slowFrameRenderMeasurements.clear();
                this.frozenFrameRenderMeasurements.clear();
                this.frameMetricsCollectorId = this.frameMetricsCollector.startCollection(new SentryFrameMetricsCollector.FrameMetricsCollectorListener() { // from class: io.sentry.android.core.AndroidProfiler.1
                    float lastRefreshRate = 0.0f;

                    @Override // io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener
                    public void onFrameMetricCollected(long j10, long j11, long j12, long j13, boolean z5, boolean z10, float f10) {
                        long jNanoTimestamp = new SentryNanotimeDate().nanoTimestamp();
                        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() + (j11 - System.nanoTime())) - AndroidProfiler.this.profileStartNanos;
                        if (jElapsedRealtimeNanos < 0) {
                            return;
                        }
                        if (z10) {
                            AndroidProfiler.this.frozenFrameRenderMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(jElapsedRealtimeNanos), Long.valueOf(j12), jNanoTimestamp));
                        } else if (z5) {
                            AndroidProfiler.this.slowFrameRenderMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(jElapsedRealtimeNanos), Long.valueOf(j12), jNanoTimestamp));
                        }
                        if (f10 != this.lastRefreshRate) {
                            this.lastRefreshRate = f10;
                            AndroidProfiler.this.screenFrameRateMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(jElapsedRealtimeNanos), Float.valueOf(f10), jNanoTimestamp));
                        }
                    }
                });
                try {
                    LazyEvaluator.Evaluator<ISentryExecutorService> evaluator = this.timeoutExecutorServiceSupplier;
                    if (evaluator != null) {
                        this.scheduledFinish = evaluator.evaluate().schedule(new d(2, this), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION);
                    }
                } catch (RejectedExecutionException e3) {
                    this.logger.log(SentryLevel.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e3);
                }
                this.profileStartNanos = SystemClock.elapsedRealtimeNanos();
                Date currentDateTime = DateUtils.getCurrentDateTime();
                long elapsedCpuTime = Process.getElapsedCpuTime();
                try {
                    Debug.startMethodTracingSampling(this.traceFile.getPath(), BUFFER_SIZE_BYTES, this.intervalUs);
                    this.isRunning = true;
                    ProfileStartData profileStartData = new ProfileStartData(this.profileStartNanos, elapsedCpuTime, currentDateTime);
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                    return profileStartData;
                } catch (Throwable th2) {
                    endAndCollect(false, null);
                    this.logger.log(SentryLevel.ERROR, "Unable to start a profile: ", th2);
                    this.isRunning = false;
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                }
            }
            return null;
        } finally {
        }
    }
}
