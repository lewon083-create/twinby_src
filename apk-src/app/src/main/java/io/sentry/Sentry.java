package io.sentry;

import io.sentry.SentryFeedbackOptions;
import io.sentry.backpressure.BackpressureMonitor;
import io.sentry.backpressure.NoOpBackpressureMonitor;
import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.config.PropertiesProviderFactory;
import io.sentry.internal.debugmeta.NoOpDebugMetaLoader;
import io.sentry.internal.debugmeta.ResourcesDebugMetaLoader;
import io.sentry.internal.modules.CompositeModulesLoader;
import io.sentry.internal.modules.IModulesLoader;
import io.sentry.internal.modules.ManifestModulesLoader;
import io.sentry.internal.modules.NoOpModulesLoader;
import io.sentry.internal.modules.ResourcesModulesLoader;
import io.sentry.logger.ILoggerApi;
import io.sentry.metrics.IMetricsApi;
import io.sentry.opentelemetry.OpenTelemetryUtil;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.DebugMetaPropertiesApplier;
import io.sentry.util.FileUtils;
import io.sentry.util.InitUtil;
import io.sentry.util.LoadClass;
import io.sentry.util.Platform;
import io.sentry.util.SentryRandom;
import io.sentry.util.thread.NoOpThreadChecker;
import io.sentry.util.thread.ThreadChecker;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Sentry {

    @NotNull
    public static final String APP_START_PROFILING_CONFIG_FILE_NAME = "app_start_profiling_config";
    private static final boolean GLOBAL_HUB_DEFAULT_MODE = false;

    @NotNull
    private static volatile IScopesStorage scopesStorage = NoOpScopesStorage.getInstance();

    @NotNull
    private static volatile IScopes rootScopes = NoOpScopes.getInstance();

    @NotNull
    private static final IScope globalScope = new Scope(SentryOptions.empty());
    private static volatile boolean globalHubMode = false;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final long classCreationTimestamp = System.currentTimeMillis();
    private static final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface OptionsConfiguration<T extends SentryOptions> {
        void configure(@NotNull T t10);
    }

    private Sentry() {
    }

    public static void addBreadcrumb(@NotNull Breadcrumb breadcrumb, @Nullable Hint hint) {
        getCurrentScopes().addBreadcrumb(breadcrumb, hint);
    }

    public static void addFeatureFlag(@Nullable String str, @Nullable Boolean bool) {
        getCurrentScopes().addFeatureFlag(str, bool);
    }

    private static <T extends SentryOptions> void applyOptionsConfiguration(OptionsConfiguration<T> optionsConfiguration, T t10) {
        try {
            optionsConfiguration.configure(t10);
        } catch (Throwable th2) {
            t10.getLogger().log(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
    }

    public static void bindClient(@NotNull ISentryClient iSentryClient) {
        getCurrentScopes().bindClient(iSentryClient);
    }

    @NotNull
    public static SentryId captureCheckIn(@NotNull CheckIn checkIn) {
        return getCurrentScopes().captureCheckIn(checkIn);
    }

    @NotNull
    public static SentryId captureEvent(@NotNull SentryEvent sentryEvent) {
        return getCurrentScopes().captureEvent(sentryEvent);
    }

    @NotNull
    public static SentryId captureException(@NotNull Throwable th2) {
        return getCurrentScopes().captureException(th2);
    }

    @Deprecated
    @NotNull
    public static SentryId captureFeedback(@NotNull Feedback feedback) {
        return feedback().capture(feedback);
    }

    @NotNull
    public static SentryId captureMessage(@NotNull String str) {
        return getCurrentScopes().captureMessage(str);
    }

    @Deprecated
    public static void captureUserFeedback(@NotNull UserFeedback userFeedback) {
        getCurrentScopes().captureUserFeedback(userFeedback);
    }

    public static void clearBreadcrumbs() {
        getCurrentScopes().clearBreadcrumbs();
    }

    public static void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = lock.acquire();
        try {
            IScopes currentScopes = getCurrentScopes();
            rootScopes = NoOpScopes.getInstance();
            getScopesStorage().close();
            currentScopes.close(false);
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

    public static void configureScope(@NotNull ScopeCallback scopeCallback) {
        configureScope(null, scopeCallback);
    }

    @Nullable
    public static TransactionContext continueTrace(@Nullable String str, @Nullable List<String> list) {
        return getCurrentScopes().continueTrace(str, list);
    }

    @NotNull
    public static IDistributionApi distribution() {
        return getCurrentScopes().getScope().getOptions().getDistributionController();
    }

    public static void endSession() {
        getCurrentScopes().endSession();
    }

    @NotNull
    public static IFeedbackApi feedback() {
        return getCurrentScopes().feedback();
    }

    private static void finalizePreviousSession(@NotNull SentryOptions sentryOptions, @NotNull IScopes iScopes) {
        try {
            sentryOptions.getExecutorService().submit(new PreviousSessionFinalizer(sentryOptions, iScopes));
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to finalize previous session.", th2);
        }
    }

    public static void flush(long j10) {
        getCurrentScopes().flush(j10);
    }

    @NotNull
    public static IScopes forkedCurrentScope(@NotNull String str) {
        return getCurrentScopes().forkedCurrentScope(str);
    }

    @NotNull
    public static IScopes forkedRootScopes(@NotNull String str) {
        return globalHubMode ? rootScopes : rootScopes.forkedScopes(str);
    }

    @NotNull
    public static IScopes forkedScopes(@NotNull String str) {
        return getCurrentScopes().forkedScopes(str);
    }

    @Nullable
    public static BaggageHeader getBaggage() {
        return getCurrentScopes().getBaggage();
    }

    @Deprecated
    @NotNull
    public static IHub getCurrentHub() {
        return new HubScopesWrapper(getCurrentScopes());
    }

    @NotNull
    public static IScopes getCurrentScopes() {
        return getCurrentScopes(true);
    }

    @NotNull
    public static IScope getGlobalScope() {
        return globalScope;
    }

    @NotNull
    public static SentryId getLastEventId() {
        return getCurrentScopes().getLastEventId();
    }

    @NotNull
    private static IScopesStorage getScopesStorage() {
        return scopesStorage;
    }

    @Nullable
    public static ISpan getSpan() {
        return (globalHubMode && Platform.isAndroid()) ? getCurrentScopes().getTransaction() : getCurrentScopes().getSpan();
    }

    @Nullable
    public static SentryTraceHeader getTraceparent() {
        return getCurrentScopes().getTraceparent();
    }

    private static void handleAppStartProfilingConfig(@NotNull SentryOptions sentryOptions, @NotNull ISentryExecutorService iSentryExecutorService) {
        try {
            iSentryExecutorService.submit(new l(sentryOptions, 0));
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th2);
        }
    }

    public static void init() {
        init((OptionsConfiguration<SentryOptions>) new f(5), false);
    }

    private static void initConfigurations(@NotNull SentryOptions sentryOptions) {
        ILogger logger = sentryOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.INFO;
        logger.log(sentryLevel, "Initializing SDK with DSN: '%s'", sentryOptions.getDsn());
        String outboxPath = sentryOptions.getOutboxPath();
        int i = 0;
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.log(sentryLevel, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (sentryOptions.getEnvelopeDiskCache() instanceof NoOpEnvelopeCache) {
                sentryOptions.setEnvelopeDiskCache(EnvelopeCache.create(sentryOptions));
            }
        }
        String profilingTracesDirPath = sentryOptions.getProfilingTracesDirPath();
        if ((sentryOptions.isProfilingEnabled() || sentryOptions.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                sentryOptions.getExecutorService().submit(new m(i, file));
            } catch (RejectedExecutionException e3) {
                sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e3);
            }
        }
        IModulesLoader modulesLoader = sentryOptions.getModulesLoader();
        if (!sentryOptions.isSendModules()) {
            sentryOptions.setModulesLoader(NoOpModulesLoader.getInstance());
        } else if (modulesLoader instanceof NoOpModulesLoader) {
            sentryOptions.setModulesLoader(new CompositeModulesLoader(Arrays.asList(new ManifestModulesLoader(sentryOptions.getLogger()), new ResourcesModulesLoader(sentryOptions.getLogger())), sentryOptions.getLogger()));
        }
        if (sentryOptions.getDebugMetaLoader() instanceof NoOpDebugMetaLoader) {
            sentryOptions.setDebugMetaLoader(new ResourcesDebugMetaLoader(sentryOptions.getLogger()));
        }
        DebugMetaPropertiesApplier.apply(sentryOptions, sentryOptions.getDebugMetaLoader().loadDebugMeta());
        if (sentryOptions.getThreadChecker() instanceof NoOpThreadChecker) {
            sentryOptions.setThreadChecker(ThreadChecker.getInstance());
        }
        if (sentryOptions.getPerformanceCollectors().isEmpty()) {
            sentryOptions.addPerformanceCollector(new JavaMemoryCollector());
        }
        if (sentryOptions.isEnableBackpressureHandling() && Platform.isJvm()) {
            if (sentryOptions.getBackpressureMonitor() instanceof NoOpBackpressureMonitor) {
                sentryOptions.setBackpressureMonitor(new BackpressureMonitor(sentryOptions, ScopesAdapter.getInstance()));
            }
            sentryOptions.getBackpressureMonitor().start();
        }
        initJvmContinuousProfiling(sentryOptions);
        sentryOptions.getLogger().log(SentryLevel.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(sentryOptions.isContinuousProfilingEnabled()), sentryOptions.getProfileLifecycle());
    }

    private static void initFatalLogger(@NotNull SentryOptions sentryOptions) {
        if (sentryOptions.getFatalLogger() instanceof NoOpLogger) {
            sentryOptions.setFatalLogger(new SystemOutLogger());
        }
    }

    private static void initForOpenTelemetryMaybe(SentryOptions sentryOptions) {
        OpenTelemetryUtil.updateOpenTelemetryModeIfAuto(sentryOptions, new LoadClass());
        if (SentryOpenTelemetryMode.OFF == sentryOptions.getOpenTelemetryMode()) {
            sentryOptions.setSpanFactory(new DefaultSpanFactory());
        }
        initScopesStorage(sentryOptions);
        OpenTelemetryUtil.applyIgnoredSpanOrigins(sentryOptions);
    }

    private static void initJvmContinuousProfiling(@NotNull SentryOptions sentryOptions) {
        InitUtil.initializeProfiler(sentryOptions);
        InitUtil.initializeProfileConverter(sentryOptions);
    }

    private static void initLogger(@NotNull SentryOptions sentryOptions) {
        if (sentryOptions.isDebug() && (sentryOptions.getLogger() instanceof NoOpLogger)) {
            sentryOptions.setLogger(new SystemOutLogger());
        }
    }

    private static void initScopesStorage(SentryOptions sentryOptions) {
        getScopesStorage().close();
        if (sentryOptions.getScopesStorageFactory() != null) {
            scopesStorage = sentryOptions.getScopesStorageFactory().create(sentryOptions);
            scopesStorage.init();
        } else if (SentryOpenTelemetryMode.OFF == sentryOptions.getOpenTelemetryMode()) {
            scopesStorage = new DefaultScopesStorage();
        } else {
            scopesStorage = ScopesStorageFactory.create(new LoadClass(), NoOpLogger.getInstance());
        }
    }

    @Nullable
    public static Boolean isCrashedLastRun() {
        return getCurrentScopes().isCrashedLastRun();
    }

    public static boolean isEnabled() {
        return getCurrentScopes().isEnabled();
    }

    public static boolean isHealthy() {
        return getCurrentScopes().isHealthy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleAppStartProfilingConfig$3(SentryOptions sentryOptions) {
        String cacheDirPathWithoutDsn = sentryOptions.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, APP_START_PROFILING_CONFIG_FILE_NAME);
            try {
                FileUtils.deleteRecursively(file);
                if (sentryOptions.isEnableAppStartProfiling() || sentryOptions.isStartProfilerOnAppStart()) {
                    if (!sentryOptions.isStartProfilerOnAppStart() && !sentryOptions.isTracingEnabled()) {
                        sentryOptions.getLogger().log(SentryLevel.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        SentryAppStartProfilingOptions sentryAppStartProfilingOptions = new SentryAppStartProfilingOptions(sentryOptions, sentryOptions.isEnableAppStartProfiling() ? sampleAppStartProfiling(sentryOptions) : new TracesSamplingDecision(Boolean.FALSE));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, UTF_8));
                            try {
                                sentryOptions.getSerializer().serialize(sentryAppStartProfilingOptions, bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                sentryOptions.getLogger().log(SentryLevel.ERROR, "Unable to create app start profiling config file. ", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initConfigurations$5(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() < classCreationTimestamp - TimeUnit.MINUTES.toMillis(5L)) {
                FileUtils.deleteRecursively(file2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyOptionsObservers$4(SentryOptions sentryOptions) {
        for (IOptionsObserver iOptionsObserver : sentryOptions.getOptionsObservers()) {
            iOptionsObserver.setRelease(sentryOptions.getRelease());
            iOptionsObserver.setProguardUuid(sentryOptions.getProguardUuid());
            iOptionsObserver.setSdkVersion(sentryOptions.getSdkVersion());
            iOptionsObserver.setDist(sentryOptions.getDist());
            iOptionsObserver.setEnvironment(sentryOptions.getEnvironment());
            iOptionsObserver.setTags(sentryOptions.getTags());
            iOptionsObserver.setReplayErrorSampleRate(sentryOptions.getSessionReplay().getOnErrorSampleRate());
        }
        PersistingScopeObserver persistingScopeObserverFindPersistingScopeObserver = sentryOptions.findPersistingScopeObserver();
        if (persistingScopeObserverFindPersistingScopeObserver != null) {
            persistingScopeObserverFindPersistingScopeObserver.resetCache();
        }
    }

    @NotNull
    public static ILoggerApi logger() {
        return getCurrentScopes().logger();
    }

    @NotNull
    public static IMetricsApi metrics() {
        return getCurrentScopes().metrics();
    }

    private static void movePreviousSession(@NotNull SentryOptions sentryOptions) {
        try {
            sentryOptions.getExecutorService().submit(new MovePreviousSession(sentryOptions));
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to move previous session.", th2);
        }
    }

    private static void notifyOptionsObservers(@NotNull SentryOptions sentryOptions) {
        try {
            sentryOptions.getExecutorService().submit(new l(sentryOptions, 1));
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to notify options observers.", th2);
        }
    }

    @Deprecated
    public static void popScope() {
        if (globalHubMode) {
            return;
        }
        getCurrentScopes().popScope();
    }

    private static boolean preInitConfigurations(@NotNull SentryOptions sentryOptions) {
        if (sentryOptions.isEnableExternalConfiguration()) {
            sentryOptions.merge(ExternalOptions.from(PropertiesProviderFactory.create(), sentryOptions.getLogger()));
        }
        String dsn = sentryOptions.getDsn();
        if (!sentryOptions.isEnabled() || (dsn != null && dsn.isEmpty())) {
            close();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        sentryOptions.retrieveParsedDsn();
        return true;
    }

    @NotNull
    public static ISentryLifecycleToken pushIsolationScope() {
        return !globalHubMode ? getCurrentScopes().pushIsolationScope() : NoOpScopesLifecycleToken.getInstance();
    }

    @NotNull
    public static ISentryLifecycleToken pushScope() {
        return !globalHubMode ? getCurrentScopes().pushScope() : NoOpScopesLifecycleToken.getInstance();
    }

    public static void removeAttribute(@Nullable String str) {
        getCurrentScopes().removeAttribute(str);
    }

    public static void removeExtra(@Nullable String str) {
        getCurrentScopes().removeExtra(str);
    }

    public static void removeTag(@Nullable String str) {
        getCurrentScopes().removeTag(str);
    }

    @NotNull
    public static IReplayApi replay() {
        return getCurrentScopes().getScope().getOptions().getReplayController();
    }

    public static void reportFullyDisplayed() {
        getCurrentScopes().reportFullyDisplayed();
    }

    @NotNull
    private static TracesSamplingDecision sampleAppStartProfiling(@NotNull SentryOptions sentryOptions) {
        TransactionContext transactionContext = new TransactionContext("app.launch", "profile");
        transactionContext.setForNextAppStart(true);
        return sentryOptions.getInternalTracesSampler().sample(new SamplingContext(transactionContext, null, Double.valueOf(SentryRandom.current().nextDouble()), null));
    }

    public static void setAttribute(@Nullable String str, @Nullable Object obj) {
        getCurrentScopes().setAttribute(str, obj);
    }

    public static void setAttributes(@Nullable SentryAttributes sentryAttributes) {
        getCurrentScopes().setAttributes(sentryAttributes);
    }

    @Deprecated
    @NotNull
    public static ISentryLifecycleToken setCurrentHub(@NotNull IHub iHub) {
        return setCurrentScopes(iHub);
    }

    @NotNull
    public static ISentryLifecycleToken setCurrentScopes(@NotNull IScopes iScopes) {
        return getScopesStorage().set(iScopes);
    }

    public static void setExtra(@Nullable String str, @Nullable String str2) {
        getCurrentScopes().setExtra(str, str2);
    }

    public static void setFingerprint(@NotNull List<String> list) {
        getCurrentScopes().setFingerprint(list);
    }

    public static void setLevel(@Nullable SentryLevel sentryLevel) {
        getCurrentScopes().setLevel(sentryLevel);
    }

    public static void setTag(@Nullable String str, @Nullable String str2) {
        getCurrentScopes().setTag(str, str2);
    }

    public static void setTransaction(@Nullable String str) {
        getCurrentScopes().setTransaction(str);
    }

    public static void setUser(@Nullable User user) {
        getCurrentScopes().setUser(user);
    }

    @Deprecated
    public static void showUserFeedbackDialog() {
        feedback().show();
    }

    public static void startProfiler() {
        getCurrentScopes().startProfiler();
    }

    public static void startSession() {
        getCurrentScopes().startSession();
    }

    @NotNull
    public static ITransaction startTransaction(@NotNull String str, @NotNull String str2) {
        return getCurrentScopes().startTransaction(str, str2);
    }

    public static void stopProfiler() {
        getCurrentScopes().stopProfiler();
    }

    public static void withIsolationScope(@NotNull ScopeCallback scopeCallback) {
        getCurrentScopes().withIsolationScope(scopeCallback);
    }

    public static void withScope(@NotNull ScopeCallback scopeCallback) {
        getCurrentScopes().withScope(scopeCallback);
    }

    public static void addBreadcrumb(@NotNull Breadcrumb breadcrumb) {
        getCurrentScopes().addBreadcrumb(breadcrumb);
    }

    @NotNull
    public static SentryId captureEvent(@NotNull SentryEvent sentryEvent, @NotNull ScopeCallback scopeCallback) {
        return getCurrentScopes().captureEvent(sentryEvent, scopeCallback);
    }

    @NotNull
    public static SentryId captureException(@NotNull Throwable th2, @NotNull ScopeCallback scopeCallback) {
        return getCurrentScopes().captureException(th2, scopeCallback);
    }

    @Deprecated
    @NotNull
    public static SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint) {
        return feedback().capture(feedback, hint);
    }

    @NotNull
    public static SentryId captureMessage(@NotNull String str, @NotNull ScopeCallback scopeCallback) {
        return getCurrentScopes().captureMessage(str, scopeCallback);
    }

    public static void configureScope(@Nullable ScopeType scopeType, @NotNull ScopeCallback scopeCallback) {
        getCurrentScopes().configureScope(scopeType, scopeCallback);
    }

    @NotNull
    public static IScopes getCurrentScopes(boolean z5) {
        if (globalHubMode) {
            return rootScopes;
        }
        IScopes iScopes = getScopesStorage().get();
        if (iScopes != null && !iScopes.isNoOp()) {
            return iScopes;
        }
        if (!z5) {
            return NoOpScopes.getInstance();
        }
        IScopes iScopesForkedScopes = rootScopes.forkedScopes("getCurrentScopes");
        getScopesStorage().set(iScopesForkedScopes);
        return iScopesForkedScopes;
    }

    public static void init(@NotNull String str) {
        init(new b(2, str));
    }

    public static void setAttribute(@Nullable SentryAttribute sentryAttribute) {
        getCurrentScopes().setAttribute(sentryAttribute);
    }

    @Deprecated
    public static void showUserFeedbackDialog(@Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
        feedback().show(optionsConfigurator);
    }

    @NotNull
    public static ITransaction startTransaction(@NotNull String str, @NotNull String str2, @NotNull TransactionOptions transactionOptions) {
        return getCurrentScopes().startTransaction(str, str2, transactionOptions);
    }

    public static void addBreadcrumb(@NotNull String str) {
        getCurrentScopes().addBreadcrumb(str);
    }

    @NotNull
    public static SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint) {
        return getCurrentScopes().captureEvent(sentryEvent, hint);
    }

    @NotNull
    public static SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint) {
        return getCurrentScopes().captureException(th2, hint);
    }

    @Deprecated
    @NotNull
    public static SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint, @Nullable ScopeCallback scopeCallback) {
        return feedback().capture(feedback, hint, scopeCallback);
    }

    @NotNull
    public static SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel) {
        return getCurrentScopes().captureMessage(str, sentryLevel);
    }

    public static <T extends SentryOptions> void init(@NotNull OptionsContainer<T> optionsContainer, @NotNull OptionsConfiguration<T> optionsConfiguration) {
        init(optionsContainer, optionsConfiguration, false);
    }

    @Deprecated
    public static void showUserFeedbackDialog(@Nullable SentryId sentryId, @Nullable SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
        feedback().show(sentryId, optionsConfigurator);
    }

    @NotNull
    public static ITransaction startTransaction(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull TransactionOptions transactionOptions) {
        ITransaction iTransactionStartTransaction = getCurrentScopes().startTransaction(str, str2, transactionOptions);
        iTransactionStartTransaction.setDescription(str3);
        return iTransactionStartTransaction;
    }

    public static void addBreadcrumb(@NotNull String str, @NotNull String str2) {
        getCurrentScopes().addBreadcrumb(str, str2);
    }

    @NotNull
    public static SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint, @NotNull ScopeCallback scopeCallback) {
        return getCurrentScopes().captureEvent(sentryEvent, hint, scopeCallback);
    }

    @NotNull
    public static SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint, @NotNull ScopeCallback scopeCallback) {
        return getCurrentScopes().captureException(th2, hint, scopeCallback);
    }

    @NotNull
    public static SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel, @NotNull ScopeCallback scopeCallback) {
        return getCurrentScopes().captureMessage(str, sentryLevel, scopeCallback);
    }

    public static <T extends SentryOptions> void init(@NotNull OptionsContainer<T> optionsContainer, @NotNull OptionsConfiguration<T> optionsConfiguration, boolean z5) {
        T tCreateInstance = optionsContainer.createInstance();
        applyOptionsConfiguration(optionsConfiguration, tCreateInstance);
        init(tCreateInstance, z5);
    }

    @NotNull
    public static ITransaction startTransaction(@NotNull TransactionContext transactionContext) {
        return getCurrentScopes().startTransaction(transactionContext);
    }

    @NotNull
    public static ITransaction startTransaction(@NotNull TransactionContext transactionContext, @NotNull TransactionOptions transactionOptions) {
        return getCurrentScopes().startTransaction(transactionContext, transactionOptions);
    }

    public static void init(@NotNull OptionsConfiguration<SentryOptions> optionsConfiguration) {
        init(optionsConfiguration, false);
    }

    public static void init(@NotNull OptionsConfiguration<SentryOptions> optionsConfiguration, boolean z5) {
        SentryOptions sentryOptions = new SentryOptions();
        applyOptionsConfiguration(optionsConfiguration, sentryOptions);
        init(sentryOptions, z5);
    }

    public static void init(@NotNull SentryOptions sentryOptions) {
        init(sentryOptions, false);
    }

    private static void init(@NotNull SentryOptions sentryOptions, boolean z5) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = lock.acquire();
        try {
            if (!sentryOptions.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && Platform.isAndroid()) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(sentryOptions.getClass().getName()));
            }
            if (!preInitConfigurations(sentryOptions)) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            Boolean boolIsGlobalHubMode = sentryOptions.isGlobalHubMode();
            if (boolIsGlobalHubMode != null) {
                z5 = boolIsGlobalHubMode.booleanValue();
            }
            sentryOptions.getLogger().log(SentryLevel.INFO, "GlobalHubMode: '%s'", String.valueOf(z5));
            globalHubMode = z5;
            initFatalLogger(sentryOptions);
            IScope iScope = globalScope;
            if (InitUtil.shouldInit(iScope.getOptions(), sentryOptions, isEnabled())) {
                if (isEnabled()) {
                    sentryOptions.getLogger().log(SentryLevel.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                sentryOptions.activate();
                getCurrentScopes().close(true);
                iScope.replaceOptions(sentryOptions);
                rootScopes = new Scopes(new Scope(sentryOptions), new Scope(sentryOptions), iScope, "Sentry.init");
                initLogger(sentryOptions);
                initForOpenTelemetryMaybe(sentryOptions);
                getScopesStorage().set(rootScopes);
                initConfigurations(sentryOptions);
                iScope.bindClient(new SentryClient(sentryOptions));
                if (sentryOptions.getExecutorService().isClosed()) {
                    sentryOptions.setExecutorService(new SentryExecutorService(sentryOptions));
                    sentryOptions.getExecutorService().prewarm();
                }
                try {
                    sentryOptions.getExecutorService().submit(new l(sentryOptions, 2));
                } catch (RejectedExecutionException e3) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e3);
                }
                movePreviousSession(sentryOptions);
                for (Integration integration : sentryOptions.getIntegrations()) {
                    try {
                        integration.register(ScopesAdapter.getInstance(), sentryOptions);
                    } catch (Throwable th2) {
                        sentryOptions.getLogger().log(SentryLevel.WARNING, "Failed to register the integration " + integration.getClass().getName(), th2);
                    }
                }
                notifyOptionsObservers(sentryOptions);
                finalizePreviousSession(sentryOptions, ScopesAdapter.getInstance());
                handleAppStartProfilingConfig(sentryOptions, sentryOptions.getExecutorService());
                ILogger logger = sentryOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                logger.log(sentryLevel, "Using openTelemetryMode %s", sentryOptions.getOpenTelemetryMode());
                sentryOptions.getLogger().log(sentryLevel, "Using span factory %s", sentryOptions.getSpanFactory().getClass().getName());
                sentryOptions.getLogger().log(sentryLevel, "Using scopes storage %s", scopesStorage.getClass().getName());
            } else {
                sentryOptions.getLogger().log(SentryLevel.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th3) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
