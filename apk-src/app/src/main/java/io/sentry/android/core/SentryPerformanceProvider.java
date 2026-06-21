package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.IContinuousProfiler;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ITransactionProfiler;
import io.sentry.JsonSerializer;
import io.sentry.Sentry;
import io.sentry.SentryAppStartProfilingOptions;
import io.sentry.SentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.TracesSampler;
import io.sentry.TracesSamplingDecision;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryPerformanceProvider extends EmptySecureContentProvider {
    private static final long sdkInitMillis = SystemClock.uptimeMillis();

    @Nullable
    private Application app;

    @NotNull
    private final BuildInfoProvider buildInfoProvider;

    @NotNull
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    @NotNull
    private final ILogger logger;

    public SentryPerformanceProvider(@NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider) {
        this.logger = iLogger;
        this.buildInfoProvider = buildInfoProvider;
    }

    private void createAndStartContinuousProfiler(@NotNull Context context, @NotNull SentryAppStartProfilingOptions sentryAppStartProfilingOptions, @NotNull AppStartMetrics appStartMetrics) {
        if (!sentryAppStartProfilingOptions.isContinuousProfileSampled()) {
            this.logger.log(SentryLevel.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        AndroidContinuousProfiler androidContinuousProfiler = new AndroidContinuousProfiler(this.buildInfoProvider, new SentryFrameMetricsCollector(context.getApplicationContext(), this.logger, this.buildInfoProvider), this.logger, sentryAppStartProfilingOptions.getProfilingTracesDirPath(), sentryAppStartProfilingOptions.getProfilingTracesHz(), new v(new SentryExecutorService(), 1));
        appStartMetrics.setAppStartProfiler(null);
        appStartMetrics.setAppStartContinuousProfiler(androidContinuousProfiler);
        this.logger.log(SentryLevel.DEBUG, "App start continuous profiling started.", new Object[0]);
        SentryOptions sentryOptionsEmpty = SentryOptions.empty();
        sentryOptionsEmpty.setProfileSessionSampleRate(Double.valueOf(sentryAppStartProfilingOptions.isContinuousProfileSampled() ? 1.0d : ConfigValue.DOUBLE_DEFAULT_VALUE));
        androidContinuousProfiler.startProfiler(sentryAppStartProfilingOptions.getProfileLifecycle(), new TracesSampler(sentryOptionsEmpty));
    }

    private void createAndStartTransactionProfiler(@NotNull Context context, @NotNull SentryAppStartProfilingOptions sentryAppStartProfilingOptions, @NotNull AppStartMetrics appStartMetrics) {
        TracesSamplingDecision tracesSamplingDecision = new TracesSamplingDecision(Boolean.valueOf(sentryAppStartProfilingOptions.isTraceSampled()), sentryAppStartProfilingOptions.getTraceSampleRate(), Boolean.valueOf(sentryAppStartProfilingOptions.isProfileSampled()), sentryAppStartProfilingOptions.getProfileSampleRate());
        appStartMetrics.setAppStartSamplingDecision(tracesSamplingDecision);
        if (!tracesSamplingDecision.getProfileSampled().booleanValue() || !tracesSamplingDecision.getSampled().booleanValue()) {
            this.logger.log(SentryLevel.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        AndroidTransactionProfiler androidTransactionProfiler = new AndroidTransactionProfiler(context, this.buildInfoProvider, new SentryFrameMetricsCollector(context, this.logger, this.buildInfoProvider), this.logger, sentryAppStartProfilingOptions.getProfilingTracesDirPath(), sentryAppStartProfilingOptions.isProfilingEnabled(), sentryAppStartProfilingOptions.getProfilingTracesHz(), new v(new SentryExecutorService(), 0));
        appStartMetrics.setAppStartContinuousProfiler(null);
        appStartMetrics.setAppStartProfiler(androidTransactionProfiler);
        this.logger.log(SentryLevel.DEBUG, "App start profiling started.", new Object[0]);
        androidTransactionProfiler.start();
    }

    private void launchAppStartProfiler(@NotNull AppStartMetrics appStartMetrics) {
        Context context = getContext();
        if (context == null) {
            this.logger.log(SentryLevel.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return;
        }
        File file = new File(AndroidOptionsInitializer.getCacheDir(context), Sentry.APP_START_PROFILING_CONFIG_FILE_NAME);
        if (file.exists() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    SentryAppStartProfilingOptions sentryAppStartProfilingOptions = (SentryAppStartProfilingOptions) new JsonSerializer(SentryOptions.empty()).deserialize(bufferedReader, SentryAppStartProfilingOptions.class);
                    if (sentryAppStartProfilingOptions == null) {
                        this.logger.log(SentryLevel.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                    } else if (sentryAppStartProfilingOptions.isContinuousProfilingEnabled() && sentryAppStartProfilingOptions.isStartProfilerOnAppStart()) {
                        createAndStartContinuousProfiler(context, sentryAppStartProfilingOptions, appStartMetrics);
                    } else if (!sentryAppStartProfilingOptions.isProfilingEnabled()) {
                        this.logger.log(SentryLevel.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                    } else if (sentryAppStartProfilingOptions.isEnableAppStartProfiling()) {
                        createAndStartTransactionProfiler(context, sentryAppStartProfilingOptions, appStartMetrics);
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e3) {
                this.logger.log(SentryLevel.ERROR, "App start profiling config file not found. ", e3);
            } catch (Throwable th4) {
                this.logger.log(SentryLevel.ERROR, "Error reading app start profiling config file. ", th4);
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void onAppLaunched(@Nullable Context context, @NotNull AppStartMetrics appStartMetrics) {
        appStartMetrics.getSdkInitTimeSpan().setStartedAt(sdkInitMillis);
        if (this.buildInfoProvider.getSdkInfoVersion() >= 24) {
            appStartMetrics.getAppStartTimeSpan().setStartedAt(Process.getStartUptimeMillis());
        }
        if (context instanceof Application) {
            this.app = (Application) context;
        }
        Application application = this.app;
        if (application == null) {
            return;
        }
        appStartMetrics.registerLifecycleCallbacks(application);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        onAppLaunched(getContext(), appStartMetrics);
        launchAppStartProfiler(appStartMetrics);
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = AppStartMetrics.staticLock.acquire();
        try {
            ITransactionProfiler appStartProfiler = AppStartMetrics.getInstance().getAppStartProfiler();
            if (appStartProfiler != null) {
                appStartProfiler.close();
            }
            IContinuousProfiler appStartContinuousProfiler = AppStartMetrics.getInstance().getAppStartContinuousProfiler();
            if (appStartContinuousProfiler != null) {
                appStartContinuousProfiler.close(true);
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

    public SentryPerformanceProvider() {
        AndroidLogger androidLogger = new AndroidLogger();
        this.logger = androidLogger;
        this.buildInfoProvider = new BuildInfoProvider(androidLogger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ISentryExecutorService lambda$createAndStartContinuousProfiler$0(SentryExecutorService sentryExecutorService) {
        return sentryExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ISentryExecutorService lambda$createAndStartTransactionProfiler$1(SentryExecutorService sentryExecutorService) {
        return sentryExecutorService;
    }
}
