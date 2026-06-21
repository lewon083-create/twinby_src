package io.sentry.android.core;

import io.sentry.CompositePerformanceCollector;
import io.sentry.DataCategory;
import io.sentry.IConnectionStatusProvider;
import io.sentry.IContinuousProfiler;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.NoOpScopes;
import io.sentry.ProfileChunk;
import io.sentry.ProfileLifecycle;
import io.sentry.Sentry;
import io.sentry.SentryDate;
import io.sentry.SentryLevel;
import io.sentry.SentryNanotimeDate;
import io.sentry.SentryOptions;
import io.sentry.TracesSampler;
import io.sentry.android.core.AndroidProfiler;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.protocol.SentryId;
import io.sentry.transport.RateLimiter;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.SentryRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AndroidContinuousProfiler implements IContinuousProfiler, RateLimiter.IRateLimitObserver {
    private static final long MAX_CHUNK_DURATION_MILLIS = 60000;

    @NotNull
    private final BuildInfoProvider buildInfoProvider;

    @NotNull
    private SentryId chunkId;

    @NotNull
    private final LazyEvaluator.Evaluator<ISentryExecutorService> executorServiceSupplier;

    @NotNull
    private final SentryFrameMetricsCollector frameMetricsCollector;

    @NotNull
    private final AtomicBoolean isClosed;
    private boolean isSampled;
    private final AutoClosableReentrantLock lock;

    @NotNull
    private final ILogger logger;
    private final AutoClosableReentrantLock payloadLock;

    @Nullable
    private CompositePerformanceCollector performanceCollector;

    @NotNull
    private SentryId profilerId;

    @Nullable
    private final String profilingTracesDirPath;
    private final int profilingTracesHz;
    private int rootSpanCounter;

    @Nullable
    private IScopes scopes;
    private volatile boolean shouldSample;
    private boolean shouldStop;

    @NotNull
    private SentryDate startProfileChunkTimestamp;

    @Nullable
    private Future<?> stopFuture;
    private boolean isInitialized = false;

    @Nullable
    private AndroidProfiler profiler = null;
    private boolean isRunning = false;

    @NotNull
    private final List<ProfileChunk.Builder> payloadBuilders = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.android.core.AndroidContinuousProfiler$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$ProfileLifecycle;

        static {
            int[] iArr = new int[ProfileLifecycle.values().length];
            $SwitchMap$io$sentry$ProfileLifecycle = iArr;
            try {
                iArr[ProfileLifecycle.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$ProfileLifecycle[ProfileLifecycle.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AndroidContinuousProfiler(@NotNull BuildInfoProvider buildInfoProvider, @NotNull SentryFrameMetricsCollector sentryFrameMetricsCollector, @NotNull ILogger iLogger, @Nullable String str, int i, @NotNull LazyEvaluator.Evaluator<ISentryExecutorService> evaluator) {
        SentryId sentryId = SentryId.EMPTY_ID;
        this.profilerId = sentryId;
        this.chunkId = sentryId;
        this.isClosed = new AtomicBoolean(false);
        this.startProfileChunkTimestamp = new SentryNanotimeDate();
        this.shouldSample = true;
        this.shouldStop = false;
        this.isSampled = false;
        this.rootSpanCounter = 0;
        this.lock = new AutoClosableReentrantLock();
        this.payloadLock = new AutoClosableReentrantLock();
        this.logger = iLogger;
        this.frameMetricsCollector = sentryFrameMetricsCollector;
        this.buildInfoProvider = buildInfoProvider;
        this.profilingTracesDirPath = str;
        this.profilingTracesHz = i;
        this.executorServiceSupplier = evaluator;
    }

    private void init() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        String str = this.profilingTracesDirPath;
        if (str == null) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i = this.profilingTracesHz;
        if (i <= 0) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
        } else {
            this.profiler = new AndroidProfiler(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.profilingTracesHz, this.frameMetricsCollector, null, this.logger);
        }
    }

    private void initScopes() {
        IScopes iScopes = this.scopes;
        if ((iScopes == null || iScopes == NoOpScopes.getInstance()) && Sentry.getCurrentScopes() != NoOpScopes.getInstance()) {
            this.scopes = Sentry.getCurrentScopes();
            this.performanceCollector = Sentry.getCurrentScopes().getOptions().getCompositePerformanceCollector();
            RateLimiter rateLimiter = this.scopes.getRateLimiter();
            if (rateLimiter != null) {
                rateLimiter.addRateLimitObserver(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendChunks$1(SentryOptions sentryOptions, IScopes iScopes) {
        if (this.isClosed.get()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.payloadBuilders.size());
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.payloadLock.acquire();
        try {
            Iterator<ProfileChunk.Builder> it = this.payloadBuilders.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().build(sentryOptions));
            }
            this.payloadBuilders.clear();
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                iScopes.captureProfileChunk((ProfileChunk) it2.next());
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        stop(true);
    }

    private void sendChunks(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        try {
            sentryOptions.getExecutorService().submit(new u(this, sentryOptions, iScopes, 2));
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to send profile chunks.", th2);
        }
    }

    private void start() {
        initScopes();
        if (this.buildInfoProvider.getSdkInfoVersion() < 22) {
            return;
        }
        init();
        if (this.profiler == null) {
            return;
        }
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            RateLimiter rateLimiter = iScopes.getRateLimiter();
            if (rateLimiter != null && (rateLimiter.isActiveForCategory(DataCategory.All) || rateLimiter.isActiveForCategory(DataCategory.ProfileChunkUi))) {
                this.logger.log(SentryLevel.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                stop(false);
                return;
            } else {
                if (this.scopes.getOptions().getConnectionStatusProvider().getConnectionStatus() == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                    this.logger.log(SentryLevel.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    stop(false);
                    return;
                }
                this.startProfileChunkTimestamp = this.scopes.getOptions().getDateProvider().now();
            }
        } else {
            this.startProfileChunkTimestamp = new SentryNanotimeDate();
        }
        if (this.profiler.start() == null) {
            return;
        }
        this.isRunning = true;
        SentryId sentryId = this.profilerId;
        SentryId sentryId2 = SentryId.EMPTY_ID;
        if (sentryId.equals(sentryId2)) {
            this.profilerId = new SentryId();
        }
        if (this.chunkId.equals(sentryId2)) {
            this.chunkId = new SentryId();
        }
        CompositePerformanceCollector compositePerformanceCollector = this.performanceCollector;
        if (compositePerformanceCollector != null) {
            compositePerformanceCollector.start(this.chunkId.toString());
        }
        try {
            this.stopFuture = this.executorServiceSupplier.evaluate().schedule(new d(1, this), MAX_CHUNK_DURATION_MILLIS);
        } catch (RejectedExecutionException e3) {
            this.logger.log(SentryLevel.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e3);
            this.shouldStop = true;
        }
    }

    private void stop(boolean z5) {
        initScopes();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            Future<?> future = this.stopFuture;
            if (future != null) {
                future.cancel(true);
            }
            if (this.profiler != null && this.isRunning) {
                if (this.buildInfoProvider.getSdkInfoVersion() < 22) {
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                        return;
                    }
                    return;
                }
                CompositePerformanceCollector compositePerformanceCollector = this.performanceCollector;
                AndroidProfiler.ProfileEndData profileEndDataEndAndCollect = this.profiler.endAndCollect(false, compositePerformanceCollector != null ? compositePerformanceCollector.stop(this.chunkId.toString()) : null);
                if (profileEndDataEndAndCollect == null) {
                    this.logger.log(SentryLevel.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    iSentryLifecycleTokenAcquire = this.payloadLock.acquire();
                    try {
                        this.payloadBuilders.add(new ProfileChunk.Builder(this.profilerId, this.chunkId, profileEndDataEndAndCollect.measurementsMap, profileEndDataEndAndCollect.traceFile, this.startProfileChunkTimestamp, "android"));
                        if (iSentryLifecycleTokenAcquire != null) {
                            iSentryLifecycleTokenAcquire.close();
                        }
                    } finally {
                        if (iSentryLifecycleTokenAcquire == null) {
                            throw th;
                        }
                        try {
                            iSentryLifecycleTokenAcquire.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                this.isRunning = false;
                SentryId sentryId = SentryId.EMPTY_ID;
                this.chunkId = sentryId;
                IScopes iScopes = this.scopes;
                if (iScopes != null) {
                    sendChunks(iScopes, iScopes.getOptions());
                }
                if (!z5 || this.shouldStop) {
                    this.profilerId = sentryId;
                    this.logger.log(SentryLevel.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    this.logger.log(SentryLevel.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    start();
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            SentryId sentryId2 = SentryId.EMPTY_ID;
            this.profilerId = sentryId2;
            this.chunkId = sentryId2;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } finally {
        }
    }

    @Override // io.sentry.IContinuousProfiler
    public void close(boolean z5) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.rootSpanCounter = 0;
            this.shouldStop = true;
            if (z5) {
                stop(false);
                this.isClosed.set(true);
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

    @Override // io.sentry.IContinuousProfiler
    @NotNull
    public SentryId getChunkId() {
        return this.chunkId;
    }

    @Override // io.sentry.IContinuousProfiler
    @NotNull
    public SentryId getProfilerId() {
        return this.profilerId;
    }

    public int getRootSpanCounter() {
        return this.rootSpanCounter;
    }

    @Nullable
    public Future<?> getStopFuture() {
        return this.stopFuture;
    }

    @Override // io.sentry.IContinuousProfiler
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override // io.sentry.transport.RateLimiter.IRateLimitObserver
    public void onRateLimitChanged(@NotNull RateLimiter rateLimiter) {
        if (rateLimiter.isActiveForCategory(DataCategory.All) || rateLimiter.isActiveForCategory(DataCategory.ProfileChunkUi)) {
            this.logger.log(SentryLevel.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            stop(false);
        }
    }

    @Override // io.sentry.IContinuousProfiler
    public void reevaluateSampling() {
        this.shouldSample = true;
    }

    @Override // io.sentry.IContinuousProfiler
    public void startProfiler(@NotNull ProfileLifecycle profileLifecycle, @NotNull TracesSampler tracesSampler) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.shouldSample) {
                this.isSampled = tracesSampler.sampleSessionProfile(SentryRandom.current().nextDouble());
                this.shouldSample = false;
            }
            if (!this.isSampled) {
                this.logger.log(SentryLevel.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            int i = AnonymousClass1.$SwitchMap$io$sentry$ProfileLifecycle[profileLifecycle.ordinal()];
            if (i == 1) {
                if (this.rootSpanCounter < 0) {
                    this.rootSpanCounter = 0;
                }
                this.rootSpanCounter++;
            } else if (i == 2 && isRunning()) {
                this.logger.log(SentryLevel.DEBUG, "Profiler is already running.", new Object[0]);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            if (!isRunning()) {
                this.logger.log(SentryLevel.DEBUG, "Started Profiler.", new Object[0]);
                start();
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

    @Override // io.sentry.IContinuousProfiler
    public void stopProfiler(@NotNull ProfileLifecycle profileLifecycle) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            int i = AnonymousClass1.$SwitchMap$io$sentry$ProfileLifecycle[profileLifecycle.ordinal()];
            if (i == 1) {
                int i10 = this.rootSpanCounter - 1;
                this.rootSpanCounter = i10;
                if (i10 > 0) {
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                        return;
                    }
                    return;
                } else {
                    if (i10 < 0) {
                        this.rootSpanCounter = 0;
                    }
                    this.shouldStop = true;
                }
            } else if (i == 2) {
                this.shouldStop = true;
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
