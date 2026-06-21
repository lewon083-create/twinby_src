package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.CompositePerformanceCollector;
import io.sentry.DeduplicateMultithreadedEventProcessor;
import io.sentry.DefaultCompositePerformanceCollector;
import io.sentry.DefaultVersionDetector;
import io.sentry.IContinuousProfiler;
import io.sentry.ILogger;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ITransactionProfiler;
import io.sentry.NoOpCompositePerformanceCollector;
import io.sentry.NoOpConnectionStatusProvider;
import io.sentry.NoOpContinuousProfiler;
import io.sentry.NoOpReplayBreadcrumbConverter;
import io.sentry.NoOpSocketTagger;
import io.sentry.NoOpTransactionProfiler;
import io.sentry.NoopVersionDetector;
import io.sentry.ScopeType;
import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.SendFireAndForgetEnvelopeSender;
import io.sentry.SendFireAndForgetOutboxSender;
import io.sentry.SentryLevel;
import io.sentry.SentryOpenTelemetryMode;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.anr.AnrProfileRotationHelper;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.debugmeta.AssetsDebugMetaLoader;
import io.sentry.android.core.internal.gestures.AndroidViewGestureTargetLocator;
import io.sentry.android.core.internal.modules.AssetsModulesLoader;
import io.sentry.android.core.internal.util.AndroidConnectionStatusProvider;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.DefaultReplayBreadcrumbConverter;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.cache.PersistingOptionsObserver;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.internal.debugmeta.NoOpDebugMetaLoader;
import io.sentry.internal.modules.NoOpModulesLoader;
import io.sentry.protocol.SentryId;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.transport.NoOpTransportGate;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import io.sentry.util.thread.NoOpThreadChecker;
import java.io.File;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class AndroidOptionsInitializer {
    static final String COMPOSE_CLASS_NAME = "androidx.compose.ui.node.Owner";
    static final long DEFAULT_FLUSH_TIMEOUT_MS = 4000;
    static final String SENTRY_COMPOSE_GESTURE_INTEGRATION_CLASS_NAME = "io.sentry.compose.gestures.ComposeGestureTargetLocator";
    static final String SENTRY_COMPOSE_VIEW_HIERARCHY_INTEGRATION_CLASS_NAME = "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter";

    private AndroidOptionsInitializer() {
    }

    @NotNull
    public static File getCacheDir(@NotNull Context context) {
        return new File(context.getCacheDir(), "sentry");
    }

    @NotNull
    private static String getSentryReleaseVersion(@NotNull PackageInfo packageInfo, @NotNull String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageInfo.packageName);
        sb2.append("@");
        return t.z.g(sb2, packageInfo.versionName, "+", str);
    }

    public static void initializeIntegrationsAndProcessors(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull io.sentry.util.LoadClass loadClass, @NotNull ActivityFramesTracker activityFramesTracker, boolean z5) {
        initializeIntegrationsAndProcessors(sentryAndroidOptions, context, new BuildInfoProvider(new AndroidLogger()), loadClass, activityFramesTracker, z5);
    }

    public static void installDefaultIntegrations(@NotNull Context context, @NotNull final SentryAndroidOptions sentryAndroidOptions, @NotNull BuildInfoProvider buildInfoProvider, @NotNull io.sentry.util.LoadClass loadClass, @NotNull ActivityFramesTracker activityFramesTracker, boolean z5, boolean z10, boolean z11, boolean z12) {
        LazyEvaluator lazyEvaluator = new LazyEvaluator(new j(sentryAndroidOptions, 1));
        final int i = 0;
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new SendFireAndForgetEnvelopeSender(new SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath() { // from class: io.sentry.android.core.k
            @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath
            public final String getDirPath() {
                switch (i) {
                    case 0:
                        return sentryAndroidOptions.getCacheDirPath();
                    default:
                        return sentryAndroidOptions.getOutboxPath();
                }
            }
        }), lazyEvaluator));
        sentryAndroidOptions.addIntegration(new NdkIntegration(loadClass.loadClass(NdkIntegration.SENTRY_NDK_CLASS_NAME, sentryAndroidOptions.getLogger())));
        if (buildInfoProvider.getSdkInfoVersion() >= 31) {
            sentryAndroidOptions.addIntegration(new TombstoneIntegration(context));
        }
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.getOutboxFileObserver());
        final int i10 = 1;
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new SendFireAndForgetOutboxSender(new SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath() { // from class: io.sentry.android.core.k
            @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath
            public final String getDirPath() {
                switch (i10) {
                    case 0:
                        return sentryAndroidOptions.getCacheDirPath();
                    default:
                        return sentryAndroidOptions.getOutboxPath();
                }
            }
        }), lazyEvaluator));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(AnrIntegrationFactory.create(context, buildInfoProvider));
        sentryAndroidOptions.addIntegration(new AnrProfilingIntegration());
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, buildInfoProvider, activityFramesTracker));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, loadClass));
            sentryAndroidOptions.addIntegration(new FeedbackShakeIntegration(application));
            if (z5) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z10) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, buildInfoProvider));
        if (z11) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, CurrentDateProvider.getInstance());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z12) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().setFormHandler(new SentryAndroidOptions.AndroidUserFeedbackFormHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$installDefaultIntegrations$1(SentryAndroidOptions sentryAndroidOptions) {
        return Boolean.valueOf(AndroidEnvelopeCache.hasStartupCrashMarker(sentryAndroidOptions));
    }

    public static void loadDefaultAndMetadataOptions(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context) {
        AndroidLogger androidLogger = new AndroidLogger();
        loadDefaultAndMetadataOptions(sentryAndroidOptions, context, androidLogger, new BuildInfoProvider(androidLogger));
    }

    private static void readDefaultOptionValues(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider) {
        PackageInfo packageInfo = ContextUtils.getPackageInfo(context, buildInfoProvider);
        if (packageInfo != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(getSentryReleaseVersion(packageInfo, ContextUtils.getVersionCode(packageInfo, buildInfoProvider)));
            }
            String str = packageInfo.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(Installation.id(context));
            } catch (RuntimeException e3) {
                sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Could not generate distinct Id.", e3);
            }
        }
    }

    private static void setupProfiler(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider, @Nullable ITransactionProfiler iTransactionProfiler, @Nullable IContinuousProfiler iContinuousProfiler, @NotNull CompositePerformanceCollector compositePerformanceCollector) {
        if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
            sentryAndroidOptions.setContinuousProfiler(NoOpContinuousProfiler.getInstance());
            if (iContinuousProfiler != null) {
                iContinuousProfiler.close(true);
            }
            if (iTransactionProfiler != null) {
                sentryAndroidOptions.setTransactionProfiler(iTransactionProfiler);
                return;
            } else {
                sentryAndroidOptions.setTransactionProfiler(new AndroidTransactionProfiler(context, sentryAndroidOptions, buildInfoProvider, (SentryFrameMetricsCollector) Objects.requireNonNull(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
                return;
            }
        }
        sentryAndroidOptions.setTransactionProfiler(NoOpTransactionProfiler.getInstance());
        if (iTransactionProfiler != null) {
            iTransactionProfiler.close();
        }
        if (iContinuousProfiler == null) {
            sentryAndroidOptions.setContinuousProfiler(new AndroidContinuousProfiler(buildInfoProvider, (SentryFrameMetricsCollector) Objects.requireNonNull(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required"), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new j(sentryAndroidOptions, 0)));
            return;
        }
        sentryAndroidOptions.setContinuousProfiler(iContinuousProfiler);
        SentryId chunkId = iContinuousProfiler.getChunkId();
        if (!iContinuousProfiler.isRunning() || chunkId.equals(SentryId.EMPTY_ID)) {
            return;
        }
        compositePerformanceCollector.start(chunkId.toString());
    }

    public static void initializeIntegrationsAndProcessors(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider, @NotNull io.sentry.util.LoadClass loadClass, @NotNull ActivityFramesTracker activityFramesTracker, boolean z5) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof NoOpEnvelopeCache)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new AndroidEnvelopeCache(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof NoOpConnectionStatusProvider) {
            sentryAndroidOptions.setConnectionStatusProvider(new AndroidConnectionStatusProvider(context, sentryAndroidOptions, buildInfoProvider, AndroidCurrentDateProvider.getInstance()));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new PersistingScopeObserver(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new PersistingOptionsObserver(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new DeduplicateMultithreadedEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new DefaultAndroidEventProcessor(context, buildInfoProvider, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new PerformanceAndroidEventProcessor(sentryAndroidOptions, activityFramesTracker));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, buildInfoProvider, z5));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new ApplicationExitInfoEventProcessor(context, sentryAndroidOptions, buildInfoProvider));
        if (sentryAndroidOptions.getTransportGate() instanceof NoOpTransportGate) {
            sentryAndroidOptions.setTransportGate(new AndroidTransportGate(sentryAndroidOptions));
        }
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        if (sentryAndroidOptions.getModulesLoader() instanceof NoOpModulesLoader) {
            sentryAndroidOptions.setModulesLoader(new AssetsModulesLoader(context, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof NoOpDebugMetaLoader) {
            sentryAndroidOptions.setDebugMetaLoader(new AssetsDebugMetaLoader(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof NoopVersionDetector) {
            sentryAndroidOptions.setVersionDetector(new DefaultVersionDetector(sentryAndroidOptions));
        }
        LazyEvaluator<Boolean> lazyEvaluatorIsClassAvailableLazy = loadClass.isClassAvailableLazy("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean zIsClassAvailable = loadClass.isClassAvailable(COMPOSE_CLASS_NAME, sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new AndroidViewGestureTargetLocator(lazyEvaluatorIsClassAvailableLazy));
            if (zIsClassAvailable && loadClass.isClassAvailable(SENTRY_COMPOSE_GESTURE_INTEGRATION_CLASS_NAME, sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zIsClassAvailable && loadClass.isClassAvailable(SENTRY_COMPOSE_VIEW_HIERARCHY_INTEGRATION_CLASS_NAME, sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof NoOpThreadChecker) {
            sentryAndroidOptions.setThreadChecker(AndroidThreadChecker.getInstance());
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof NoOpSocketTagger) {
            sentryAndroidOptions.setSocketTagger(AndroidSocketTagger.getInstance());
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new AndroidMemoryCollector());
            sentryAndroidOptions.addPerformanceCollector(new AndroidCpuCollector(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                sentryAndroidOptions.addPerformanceCollector(new SpanFrameMetricsCollector(sentryAndroidOptions, (SentryFrameMetricsCollector) Objects.requireNonNull(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof NoOpCompositePerformanceCollector) {
            sentryAndroidOptions.setCompositePerformanceCollector(new DefaultCompositePerformanceCollector(sentryAndroidOptions));
        }
        if (z5 && (sentryAndroidOptions.getReplayController().getBreadcrumbConverter() instanceof NoOpReplayBreadcrumbConverter)) {
            sentryAndroidOptions.getReplayController().setBreadcrumbConverter(new DefaultReplayBreadcrumbConverter(sentryAndroidOptions));
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = AppStartMetrics.staticLock.acquire();
        try {
            ITransactionProfiler appStartProfiler = appStartMetrics.getAppStartProfiler();
            IContinuousProfiler appStartContinuousProfiler = appStartMetrics.getAppStartContinuousProfiler();
            appStartMetrics.setAppStartProfiler(null);
            appStartMetrics.setAppStartContinuousProfiler(null);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            setupProfiler(sentryAndroidOptions, context, buildInfoProvider, appStartProfiler, appStartContinuousProfiler, sentryAndroidOptions.getCompositePerformanceCollector());
        } finally {
        }
    }

    public static void loadDefaultAndMetadataOptions(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider) {
        Objects.requireNonNull(context, "The context is required.");
        Context applicationContext = ContextUtils.getApplicationContext(context);
        Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        Objects.requireNonNull(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setFatalLogger(new AndroidFatalLogger());
        sentryAndroidOptions.setDefaultScopeType(ScopeType.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(SentryOpenTelemetryMode.OFF);
        sentryAndroidOptions.setDateProvider(new SentryAndroidDateProvider());
        sentryAndroidOptions.getLogs().setLoggerBatchProcessorFactory(new AndroidLoggerBatchProcessorFactory());
        sentryAndroidOptions.getMetrics().setMetricsBatchProcessorFactory(new AndroidMetricsBatchProcessorFactory());
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new SentryFrameMetricsCollector(applicationContext, iLogger, buildInfoProvider));
        ManifestMetadataReader.applyMetadata(applicationContext, sentryAndroidOptions, buildInfoProvider);
        sentryAndroidOptions.setCacheDirPath(getCacheDir(applicationContext).getAbsolutePath());
        AnrProfileRotationHelper.rotate();
        readDefaultOptionValues(sentryAndroidOptions, applicationContext, buildInfoProvider);
        AppState.getInstance().registerLifecycleObserver(sentryAndroidOptions);
        sentryAndroidOptions.activate();
    }
}
