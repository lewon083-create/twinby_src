package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ITransaction;
import io.sentry.ITransactionProfiler;
import io.sentry.PerformanceCollectionData;
import io.sentry.ProfilingTraceData;
import io.sentry.ProfilingTransactionData;
import io.sentry.ScopesAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AndroidProfiler;
import io.sentry.android.core.internal.util.CpuInfoUtils;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class AndroidTransactionProfiler implements ITransactionProfiler {

    @NotNull
    private final BuildInfoProvider buildInfoProvider;

    @NotNull
    private final Context context;

    @Nullable
    private volatile ProfilingTransactionData currentProfilingTransactionData;

    @NotNull
    private final LazyEvaluator.Evaluator<ISentryExecutorService> executorServiceSupplier;

    @NotNull
    private final SentryFrameMetricsCollector frameMetricsCollector;
    private boolean isInitialized;
    private final boolean isProfilingEnabled;

    @NotNull
    private final AtomicBoolean isRunning;

    @NotNull
    private final AutoClosableReentrantLock lock;

    @NotNull
    private final ILogger logger;
    private long profileStartCpuMillis;
    private long profileStartNanos;

    @NotNull
    private Date profileStartTimestamp;

    @Nullable
    private volatile AndroidProfiler profiler;

    @Nullable
    private final String profilingTracesDirPath;
    private final int profilingTracesHz;

    public AndroidTransactionProfiler(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull BuildInfoProvider buildInfoProvider, @NotNull SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this(context, buildInfoProvider, sentryFrameMetricsCollector, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), new j(sentryAndroidOptions, 2));
    }

    private void init() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        if (!this.isProfilingEnabled) {
            this.logger.log(SentryLevel.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.profilingTracesDirPath;
        if (str == null) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i = this.profilingTracesHz;
        if (i <= 0) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
        } else {
            this.profiler = new AndroidProfiler(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.profilingTracesHz, this.frameMetricsCollector, this.executorServiceSupplier, this.logger);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$onTransactionFinish$2() {
        return CpuInfoUtils.getInstance().readMaxFrequencies();
    }

    @SuppressLint({"NewApi"})
    private boolean onFirstStart() {
        AndroidProfiler.ProfileStartData profileStartDataStart;
        if (this.profiler == null || (profileStartDataStart = this.profiler.start()) == null) {
            return false;
        }
        this.profileStartNanos = profileStartDataStart.startNanos;
        this.profileStartCpuMillis = profileStartDataStart.startCpuMillis;
        this.profileStartTimestamp = profileStartDataStart.startTimestamp;
        return true;
    }

    @Override // io.sentry.ITransactionProfiler
    public void bindTransaction(@NotNull ITransaction iTransaction) {
        if (this.isRunning.get() && this.currentProfilingTransactionData == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                if (this.isRunning.get() && this.currentProfilingTransactionData == null) {
                    this.currentProfilingTransactionData = new ProfilingTransactionData(iTransaction, Long.valueOf(this.profileStartNanos), Long.valueOf(this.profileStartCpuMillis));
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
    }

    @Override // io.sentry.ITransactionProfiler
    public void close() {
        AndroidTransactionProfiler androidTransactionProfiler;
        ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
        if (profilingTransactionData != null) {
            androidTransactionProfiler = this;
            androidTransactionProfiler.onTransactionFinish(profilingTransactionData.getName(), profilingTransactionData.getId(), profilingTransactionData.getTraceId(), true, null, ScopesAdapter.getInstance().getOptions());
        } else {
            androidTransactionProfiler = this;
        }
        androidTransactionProfiler.isRunning.set(false);
        if (androidTransactionProfiler.profiler != null) {
            androidTransactionProfiler.profiler.close();
        }
    }

    @Override // io.sentry.ITransactionProfiler
    public boolean isRunning() {
        return this.isRunning.get();
    }

    @Override // io.sentry.ITransactionProfiler
    @Nullable
    public ProfilingTraceData onTransactionFinish(@NotNull ITransaction iTransaction, @Nullable List<PerformanceCollectionData> list, @NotNull SentryOptions sentryOptions) {
        return onTransactionFinish(iTransaction.getName(), iTransaction.getEventId().toString(), iTransaction.getSpanContext().getTraceId().toString(), false, list, sentryOptions);
    }

    @Override // io.sentry.ITransactionProfiler
    public void start() {
        if (this.buildInfoProvider.getSdkInfoVersion() >= 22 && !this.isRunning.getAndSet(true)) {
            init();
            if (onFirstStart()) {
                this.logger.log(SentryLevel.DEBUG, "Profiler started.", new Object[0]);
                return;
            }
            if (this.profiler != null && this.profiler.isRunning()) {
                this.logger.log(SentryLevel.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
                return;
            }
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                this.currentProfilingTransactionData = null;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                this.isRunning.set(false);
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
    }

    @SuppressLint({"NewApi"})
    @Nullable
    private ProfilingTraceData onTransactionFinish(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z5, @Nullable List<PerformanceCollectionData> list, @NotNull SentryOptions sentryOptions) {
        String string;
        String str4;
        if (this.buildInfoProvider.getSdkInfoVersion() < 22 || this.profiler == null) {
            return null;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
            if (profilingTransactionData != null && profilingTransactionData.getId().equals(str2)) {
                this.currentProfilingTransactionData = null;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                this.logger.log(SentryLevel.DEBUG, "Transaction %s (%s) finished.", str, str3);
                AndroidProfiler.ProfileEndData profileEndDataEndAndCollect = this.profiler.endAndCollect(false, list);
                this.isRunning.set(false);
                if (profileEndDataEndAndCollect == null) {
                    return null;
                }
                long j10 = profileEndDataEndAndCollect.endNanos - this.profileStartNanos;
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(profilingTransactionData);
                profilingTransactionData.notifyFinish(Long.valueOf(profileEndDataEndAndCollect.endNanos), Long.valueOf(this.profileStartNanos), Long.valueOf(profileEndDataEndAndCollect.endCpuMillis), Long.valueOf(this.profileStartCpuMillis));
                Long totalMemory = sentryOptions instanceof SentryAndroidOptions ? DeviceInfoUtil.getInstance(this.context, (SentryAndroidOptions) sentryOptions).getTotalMemory() : null;
                if (totalMemory != null) {
                    string = Long.toString(totalMemory.longValue());
                } else {
                    string = CommonUrlParts.Values.FALSE_INTEGER;
                }
                String str5 = string;
                String[] strArr = Build.SUPPORTED_ABIS;
                File file = profileEndDataEndAndCollect.traceFile;
                Date date = this.profileStartTimestamp;
                String string2 = Long.toString(j10);
                int sdkInfoVersion = this.buildInfoProvider.getSdkInfoVersion();
                String str6 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                l lVar = new l();
                String manufacturer = this.buildInfoProvider.getManufacturer();
                String model = this.buildInfoProvider.getModel();
                String versionRelease = this.buildInfoProvider.getVersionRelease();
                Boolean boolIsEmulator = this.buildInfoProvider.isEmulator();
                String proguardUuid = sentryOptions.getProguardUuid();
                String release = sentryOptions.getRelease();
                String environment = sentryOptions.getEnvironment();
                if (!profileEndDataEndAndCollect.didTimeout && !z5) {
                    str4 = ProfilingTraceData.TRUNCATION_REASON_NORMAL;
                } else {
                    str4 = ProfilingTraceData.TRUNCATION_REASON_TIMEOUT;
                }
                return new ProfilingTraceData(file, date, arrayList, str, str2, str3, string2, sdkInfoVersion, str6, lVar, manufacturer, model, versionRelease, boolIsEmulator, str5, proguardUuid, release, environment, str4, profileEndDataEndAndCollect.measurementsMap);
            }
            this.logger.log(SentryLevel.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return null;
        } finally {
        }
    }

    public AndroidTransactionProfiler(@NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider, @NotNull SentryFrameMetricsCollector sentryFrameMetricsCollector, @NotNull ILogger iLogger, @Nullable String str, boolean z5, int i, @NotNull ISentryExecutorService iSentryExecutorService) {
        this(context, buildInfoProvider, sentryFrameMetricsCollector, iLogger, str, z5, i, new m(0, iSentryExecutorService));
    }

    public AndroidTransactionProfiler(@NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider, @NotNull SentryFrameMetricsCollector sentryFrameMetricsCollector, @NotNull ILogger iLogger, @Nullable String str, boolean z5, int i, @NotNull LazyEvaluator.Evaluator<ISentryExecutorService> evaluator) {
        this.isInitialized = false;
        this.isRunning = new AtomicBoolean(false);
        this.profiler = null;
        this.lock = new AutoClosableReentrantLock();
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The application context is required");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "ILogger is required");
        this.frameMetricsCollector = (SentryFrameMetricsCollector) Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.profilingTracesDirPath = str;
        this.isProfilingEnabled = z5;
        this.profilingTracesHz = i;
        this.executorServiceSupplier = (LazyEvaluator.Evaluator) Objects.requireNonNull(evaluator, "A supplier for ISentryExecutorService is required.");
        this.profileStartTimestamp = DateUtils.getCurrentDateTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ISentryExecutorService lambda$new$1(ISentryExecutorService iSentryExecutorService) {
        return iSentryExecutorService;
    }
}
