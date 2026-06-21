package io.sentry;

import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.SentryFeedbackOptions;
import io.sentry.backpressure.IBackpressureMonitor;
import io.sentry.backpressure.NoOpBackpressureMonitor;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.clientreport.ClientReportRecorder;
import io.sentry.clientreport.DiscardReason;
import io.sentry.clientreport.IClientReportRecorder;
import io.sentry.clientreport.NoOpClientReportRecorder;
import io.sentry.internal.debugmeta.IDebugMetaLoader;
import io.sentry.internal.debugmeta.NoOpDebugMetaLoader;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.modules.IModulesLoader;
import io.sentry.internal.modules.NoOpModulesLoader;
import io.sentry.internal.viewhierarchy.ViewHierarchyExporter;
import io.sentry.logger.DefaultLoggerBatchProcessorFactory;
import io.sentry.logger.ILoggerBatchProcessorFactory;
import io.sentry.metrics.DefaultMetricsBatchProcessorFactory;
import io.sentry.metrics.IMetricsBatchProcessorFactory;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.ITransportGate;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.transport.NoOpTransportGate;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.LoadClass;
import io.sentry.util.Platform;
import io.sentry.util.SampleRateUtils;
import io.sentry.util.StringUtils;
import io.sentry.util.thread.IThreadChecker;
import io.sentry.util.thread.NoOpThreadChecker;
import java.io.File;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class SentryOptions {
    static final SentryLevel DEFAULT_DIAGNOSTIC_LEVEL = SentryLevel.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";

    @NotNull
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;

    @NotNull
    private IBackpressureMonitor backpressureMonitor;

    @Nullable
    private BeforeBreadcrumbCallback beforeBreadcrumb;

    @Nullable
    private BeforeEnvelopeCallback beforeEnvelopeCallback;

    @Nullable
    private BeforeSendCallback beforeSend;

    @Nullable
    private BeforeSendCallback beforeSendFeedback;

    @Nullable
    private BeforeSendReplayCallback beforeSendReplay;

    @Nullable
    private BeforeSendTransactionCallback beforeSendTransaction;

    @NotNull
    private final Set<String> bundleIds;

    @Nullable
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;

    @NotNull
    IClientReportRecorder clientReportRecorder;

    @NotNull
    private CompositePerformanceCollector compositePerformanceCollector;

    @NotNull
    private IConnectionStatusProvider connectionStatusProvider;
    private int connectionTimeoutMillis;

    @NotNull
    private final List<String> contextTags;

    @NotNull
    private IContinuousProfiler continuousProfiler;

    @Nullable
    private Cron cron;

    @NotNull
    private final LazyEvaluator<SentryDateProvider> dateProvider;
    private long deadlineTimeout;
    private boolean debug;

    @NotNull
    private IDebugMetaLoader debugMetaLoader;

    @NotNull
    private ScopeType defaultScopeType;

    @NotNull
    private final List<String> defaultTracePropagationTargets;

    @NotNull
    private SentryLevel diagnosticLevel;

    @Nullable
    private String dist;

    @Nullable
    private String distinctId;

    @NotNull
    private DistributionOptions distribution;

    @NotNull
    private IDistributionApi distributionController;

    @Nullable
    private String dsn;

    @Nullable
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableCacheTracing;
    private boolean enableDatabaseTransactionTracing;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableQueueTracing;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;

    @NotNull
    private IEnvelopeCache envelopeDiskCache;

    @NotNull
    private final LazyEvaluator<IEnvelopeReader> envelopeReader;

    @Nullable
    private String environment;

    @NotNull
    private final List<EventProcessor> eventProcessors;

    @NotNull
    private ISentryExecutorService executorService;

    @NotNull
    private final ExperimentalOptions experimental;

    @NotNull
    private ILogger fatalLogger;

    @NotNull
    private SentryFeedbackOptions feedbackOptions;
    private long flushTimeoutMillis;
    private boolean forceInit;

    @NotNull
    private FullyDisplayedReporter fullyDisplayedReporter;

    @NotNull
    private final List<GestureTargetLocator> gestureTargetLocators;

    @Nullable
    private Boolean globalHubMode;

    @Nullable
    private Long idleTimeout;

    @Nullable
    private List<FilterString> ignoredCheckIns;

    @Nullable
    private List<FilterString> ignoredErrors;

    @NotNull
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;

    @Nullable
    private List<FilterString> ignoredSpanOrigins;

    @Nullable
    private List<FilterString> ignoredTransactions;

    @NotNull
    private final List<String> inAppExcludes;

    @NotNull
    private final List<String> inAppIncludes;

    @NotNull
    private InitPriority initPriority;

    @NotNull
    private Instrumenter instrumenter;

    @NotNull
    private final List<Integration> integrations;

    @Nullable
    private volatile TracesSampler internalTracesSampler;

    @NotNull
    protected final AutoClosableReentrantLock lock;

    @NotNull
    private ILogger logger;

    @NotNull
    private Logs logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;

    @NotNull
    private RequestSize maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;

    @NotNull
    private Metrics metrics;

    @NotNull
    private IModulesLoader modulesLoader;

    @NotNull
    private final List<IScopeObserver> observers;

    @Nullable
    private OnDiscardCallback onDiscard;

    @Nullable
    private OnOversizedEventCallback onOversizedEvent;

    @NotNull
    private SentryOpenTelemetryMode openTelemetryMode;

    @NotNull
    private final List<IOptionsObserver> optionsObservers;

    @Nullable
    private String orgId;

    @NotNull
    private final LazyEvaluator<Dsn> parsedDsn;

    @NotNull
    private final List<IPerformanceCollector> performanceCollectors;
    private boolean printUncaughtStackTrace;

    @NotNull
    private ProfileLifecycle profileLifecycle;

    @Nullable
    private Double profileSessionSampleRate;

    @NotNull
    private IProfileConverter profilerConverter;

    @Nullable
    private Double profilesSampleRate;

    @Nullable
    private ProfilesSamplerCallback profilesSampler;

    @Nullable
    private String profilingTracesDirPath;
    private int profilingTracesHz;

    @Nullable
    private String proguardUuid;
    private boolean propagateTraceparent;

    @Nullable
    private Proxy proxy;
    private int readTimeoutMillis;

    @Nullable
    private String release;

    @NotNull
    private ReplayController replayController;

    @Nullable
    private Double sampleRate;

    @Nullable
    private IScopesStorageFactory scopesStorageFactory;

    @Nullable
    private SdkVersion sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;

    @Nullable
    private String sentryClientName;

    @NotNull
    private final LazyEvaluator<ISerializer> serializer;

    @Nullable
    private String serverName;
    private long sessionFlushTimeoutMillis;

    @NotNull
    private SentryReplayOptions sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;

    @NotNull
    private ISocketTagger socketTagger;

    @NotNull
    private ISpanFactory spanFactory;

    @Nullable
    private String spotlightConnectionUrl;

    @NotNull
    private final AtomicBoolean spotlightIntegrationLoaded;

    @Nullable
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private boolean strictTraceContinuation;

    @NotNull
    private final Map<String, String> tags;

    @NotNull
    private IThreadChecker threadChecker;
    private boolean traceOptionsRequests;

    @Nullable
    private List<String> tracePropagationTargets;
    private boolean traceSampling;

    @Nullable
    private Double tracesSampleRate;

    @Nullable
    private TracesSamplerCallback tracesSampler;

    @NotNull
    private ITransactionProfiler transactionProfiler;

    @NotNull
    private ITransportFactory transportFactory;

    @NotNull
    private ITransportGate transportGate;

    @NotNull
    private IVersionDetector versionDetector;

    @NotNull
    private final List<ViewHierarchyExporter> viewHierarchyExporters;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface BeforeBreadcrumbCallback {
        @Nullable
        Breadcrumb execute(@NotNull Breadcrumb breadcrumb, @NotNull Hint hint);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface BeforeEnvelopeCallback {
        void execute(@NotNull SentryEnvelope sentryEnvelope, @Nullable Hint hint);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface BeforeSendCallback {
        @Nullable
        SentryEvent execute(@NotNull SentryEvent sentryEvent, @NotNull Hint hint);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface BeforeSendReplayCallback {
        @Nullable
        SentryReplayEvent execute(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull Hint hint);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface BeforeSendTransactionCallback {
        @Nullable
        SentryTransaction execute(@NotNull SentryTransaction sentryTransaction, @NotNull Hint hint);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Cron {

        @Nullable
        private Long defaultCheckinMargin;

        @Nullable
        private Long defaultFailureIssueThreshold;

        @Nullable
        private Long defaultMaxRuntime;

        @Nullable
        private Long defaultRecoveryThreshold;

        @Nullable
        private String defaultTimezone;

        @Nullable
        public Long getDefaultCheckinMargin() {
            return this.defaultCheckinMargin;
        }

        @Nullable
        public Long getDefaultFailureIssueThreshold() {
            return this.defaultFailureIssueThreshold;
        }

        @Nullable
        public Long getDefaultMaxRuntime() {
            return this.defaultMaxRuntime;
        }

        @Nullable
        public Long getDefaultRecoveryThreshold() {
            return this.defaultRecoveryThreshold;
        }

        @Nullable
        public String getDefaultTimezone() {
            return this.defaultTimezone;
        }

        public void setDefaultCheckinMargin(@Nullable Long l10) {
            this.defaultCheckinMargin = l10;
        }

        public void setDefaultFailureIssueThreshold(@Nullable Long l10) {
            this.defaultFailureIssueThreshold = l10;
        }

        public void setDefaultMaxRuntime(@Nullable Long l10) {
            this.defaultMaxRuntime = l10;
        }

        public void setDefaultRecoveryThreshold(@Nullable Long l10) {
            this.defaultRecoveryThreshold = l10;
        }

        public void setDefaultTimezone(@Nullable String str) {
            this.defaultTimezone = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class DistributionOptions {
        public String orgAuthToken = "";
        public String orgSlug = "";
        public String projectSlug = "";
        public String sentryBaseUrl = "https://sentry.io";

        @Nullable
        public String buildConfiguration = null;

        @Nullable
        public List<String> installGroupsOverride = null;
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Logs {

        @Nullable
        private BeforeSendLogCallback beforeSend;
        private boolean enable = false;

        @NotNull
        private ILoggerBatchProcessorFactory loggerBatchProcessorFactory = new DefaultLoggerBatchProcessorFactory();

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public interface BeforeSendLogCallback {
            @Nullable
            SentryLogEvent execute(@NotNull SentryLogEvent sentryLogEvent);
        }

        @Nullable
        public BeforeSendLogCallback getBeforeSend() {
            return this.beforeSend;
        }

        @NotNull
        public ILoggerBatchProcessorFactory getLoggerBatchProcessorFactory() {
            return this.loggerBatchProcessorFactory;
        }

        public boolean isEnabled() {
            return this.enable;
        }

        public void setBeforeSend(@Nullable BeforeSendLogCallback beforeSendLogCallback) {
            this.beforeSend = beforeSendLogCallback;
        }

        public void setEnabled(boolean z5) {
            this.enable = z5;
        }

        public void setLoggerBatchProcessorFactory(@NotNull ILoggerBatchProcessorFactory iLoggerBatchProcessorFactory) {
            this.loggerBatchProcessorFactory = iLoggerBatchProcessorFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Metrics {

        @Nullable
        private BeforeSendMetricCallback beforeSend;
        private boolean enable = true;

        @NotNull
        private IMetricsBatchProcessorFactory metricsBatchProcessorFactory = new DefaultMetricsBatchProcessorFactory();

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public interface BeforeSendMetricCallback {
            @Nullable
            SentryMetricsEvent execute(@NotNull SentryMetricsEvent sentryMetricsEvent, @NotNull Hint hint);
        }

        @Nullable
        public BeforeSendMetricCallback getBeforeSend() {
            return this.beforeSend;
        }

        @NotNull
        public IMetricsBatchProcessorFactory getMetricsBatchProcessorFactory() {
            return this.metricsBatchProcessorFactory;
        }

        public boolean isEnabled() {
            return this.enable;
        }

        public void setBeforeSend(@Nullable BeforeSendMetricCallback beforeSendMetricCallback) {
            this.beforeSend = beforeSendMetricCallback;
        }

        public void setEnabled(boolean z5) {
            this.enable = z5;
        }

        public void setMetricsBatchProcessorFactory(@NotNull IMetricsBatchProcessorFactory iMetricsBatchProcessorFactory) {
            this.metricsBatchProcessorFactory = iMetricsBatchProcessorFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface OnDiscardCallback {
        void execute(@NotNull DiscardReason discardReason, @NotNull DataCategory dataCategory, @NotNull Long l10);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface OnOversizedEventCallback {
        @NotNull
        SentryEvent execute(@NotNull SentryEvent sentryEvent, @NotNull Hint hint);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface ProfilesSamplerCallback {
        @Nullable
        Double sample(@NotNull SamplingContext samplingContext);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Proxy {

        @Nullable
        private String host;

        @Nullable
        private String pass;

        @Nullable
        private String port;

        @Nullable
        private Proxy.Type type;

        @Nullable
        private String user;

        public Proxy() {
            this(null, null, null, null, null);
        }

        @Nullable
        public String getHost() {
            return this.host;
        }

        @Nullable
        public String getPass() {
            return this.pass;
        }

        @Nullable
        public String getPort() {
            return this.port;
        }

        @Nullable
        public Proxy.Type getType() {
            return this.type;
        }

        @Nullable
        public String getUser() {
            return this.user;
        }

        public void setHost(@Nullable String str) {
            this.host = str;
        }

        public void setPass(@Nullable String str) {
            this.pass = str;
        }

        public void setPort(@Nullable String str) {
            this.port = str;
        }

        public void setType(@Nullable Proxy.Type type) {
            this.type = type;
        }

        public void setUser(@Nullable String str) {
            this.user = str;
        }

        public Proxy(@Nullable String str, @Nullable String str2) {
            this(str, str2, null, null, null);
        }

        public Proxy(@Nullable String str, @Nullable String str2, @Nullable Proxy.Type type) {
            this(str, str2, type, null, null);
        }

        public Proxy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this(str, str2, null, str3, str4);
        }

        public Proxy(@Nullable String str, @Nullable String str2, @Nullable Proxy.Type type, @Nullable String str3, @Nullable String str4) {
            this.host = str;
            this.port = str2;
            this.type = type;
            this.user = str3;
            this.pass = str4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum RequestSize {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface TracesSamplerCallback {
        @Nullable
        Double sample(@NotNull SamplingContext samplingContext);
    }

    public SentryOptions() {
        this(false);
    }

    private void addPackageInfo() {
        SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry", "8.41.0");
    }

    @NotNull
    private SdkVersion createSdkVersion() {
        SdkVersion sdkVersion = new SdkVersion(BuildConfig.SENTRY_JAVA_SDK_NAME, "8.41.0");
        sdkVersion.setVersion("8.41.0");
        return sdkVersion;
    }

    @NotNull
    public static SentryOptions empty() {
        return new SentryOptions(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Dsn lambda$new$0() {
        return new Dsn(this.dsn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ISerializer lambda$new$1() {
        return new JsonSerializer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IEnvelopeReader lambda$new$2() {
        return new EnvelopeReader(this.serializer.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SentryDateProvider lambda$new$3() {
        return new SentryAutoDateProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(SentryId sentryId, SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
        this.logger.log(SentryLevel.WARNING, "showForm() can only be called in Android.", new Object[0]);
    }

    public void activate() {
        if (this.executorService instanceof NoOpSentryExecutorService) {
            SentryExecutorService sentryExecutorService = new SentryExecutorService(this);
            this.executorService = sentryExecutorService;
            sentryExecutorService.prewarm();
        }
        if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
            try {
                this.integrations.add((Integration) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(null).newInstance(null));
            } catch (Throwable unused) {
            }
        }
    }

    public void addBundleId(@Nullable String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(@NotNull String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(@NotNull EventProcessor eventProcessor) {
        this.eventProcessors.add(eventProcessor);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new FilterString(str));
    }

    public void addIgnoredError(@NotNull String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new FilterString(str));
    }

    public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new FilterString(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new FilterString(str));
    }

    public void addInAppExclude(@NotNull String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(@NotNull String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(@NotNull Integration integration) {
        this.integrations.add(integration);
    }

    public void addOptionsObserver(@NotNull IOptionsObserver iOptionsObserver) {
        this.optionsObservers.add(iOptionsObserver);
    }

    public void addPerformanceCollector(@NotNull IPerformanceCollector iPerformanceCollector) {
        this.performanceCollectors.add(iPerformanceCollector);
    }

    public void addScopeObserver(@NotNull IScopeObserver iScopeObserver) {
        this.observers.add(iScopeObserver);
    }

    public boolean containsIgnoredExceptionForType(@NotNull Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    @Nullable
    public PersistingScopeObserver findPersistingScopeObserver() {
        for (IScopeObserver iScopeObserver : this.observers) {
            if (iScopeObserver instanceof PersistingScopeObserver) {
                return (PersistingScopeObserver) iScopeObserver;
            }
        }
        return null;
    }

    @NotNull
    public IBackpressureMonitor getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    @Nullable
    public BeforeBreadcrumbCallback getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    @Nullable
    public BeforeEnvelopeCallback getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    @Nullable
    public BeforeSendCallback getBeforeSend() {
        return this.beforeSend;
    }

    @Nullable
    public BeforeSendCallback getBeforeSendFeedback() {
        return this.beforeSendFeedback;
    }

    @Nullable
    public BeforeSendReplayCallback getBeforeSendReplay() {
        return this.beforeSendReplay;
    }

    @Nullable
    public BeforeSendTransactionCallback getBeforeSendTransaction() {
        return this.beforeSendTransaction;
    }

    @NotNull
    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    @Nullable
    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    @Nullable
    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    @NotNull
    public IClientReportRecorder getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    @NotNull
    public CompositePerformanceCollector getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    @NotNull
    public IConnectionStatusProvider getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    @NotNull
    public List<String> getContextTags() {
        return this.contextTags;
    }

    @NotNull
    public IContinuousProfiler getContinuousProfiler() {
        return this.continuousProfiler;
    }

    @Nullable
    public Cron getCron() {
        return this.cron;
    }

    @NotNull
    public SentryDateProvider getDateProvider() {
        return this.dateProvider.getValue();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    @NotNull
    public IDebugMetaLoader getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    @NotNull
    public ScopeType getDefaultScopeType() {
        return this.defaultScopeType;
    }

    @NotNull
    public SentryLevel getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    @Nullable
    public String getDist() {
        return this.dist;
    }

    @Nullable
    public String getDistinctId() {
        return this.distinctId;
    }

    @NotNull
    public DistributionOptions getDistribution() {
        return this.distribution;
    }

    @NotNull
    public IDistributionApi getDistributionController() {
        return this.distributionController;
    }

    @Nullable
    public String getDsn() {
        return this.dsn;
    }

    @Nullable
    public String getEffectiveOrgId() {
        String str = this.orgId;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                return strTrim;
            }
        }
        try {
            return retrieveParsedDsn().getOrgId();
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public IEnvelopeCache getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    @NotNull
    public IEnvelopeReader getEnvelopeReader() {
        return this.envelopeReader.getValue();
    }

    @Nullable
    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    @NotNull
    public List<EventProcessor> getEventProcessors() {
        return this.eventProcessors;
    }

    @NotNull
    public ISentryExecutorService getExecutorService() {
        return this.executorService;
    }

    @NotNull
    public ExperimentalOptions getExperimental() {
        return this.experimental;
    }

    @NotNull
    public ILogger getFatalLogger() {
        return this.fatalLogger;
    }

    @NotNull
    public SentryFeedbackOptions getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    @NotNull
    public FullyDisplayedReporter getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<GestureTargetLocator> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    @Nullable
    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    @Nullable
    public List<FilterString> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    @Nullable
    public List<FilterString> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    @NotNull
    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    @Nullable
    public List<FilterString> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    @Nullable
    public List<FilterString> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    @NotNull
    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    @NotNull
    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    @NotNull
    public InitPriority getInitPriority() {
        return this.initPriority;
    }

    @NotNull
    public Instrumenter getInstrumenter() {
        return this.instrumenter;
    }

    @NotNull
    public List<Integration> getIntegrations() {
        return this.integrations;
    }

    @NotNull
    public TracesSampler getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new TracesSampler(this);
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
        return this.internalTracesSampler;
    }

    @NotNull
    public ILogger getLogger() {
        return this.logger;
    }

    @NotNull
    public Logs getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    @NotNull
    public RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    @NotNull
    public Metrics getMetrics() {
        return this.metrics;
    }

    @NotNull
    public IModulesLoader getModulesLoader() {
        return this.modulesLoader;
    }

    @Nullable
    public OnDiscardCallback getOnDiscard() {
        return this.onDiscard;
    }

    @Nullable
    public OnOversizedEventCallback getOnOversizedEvent() {
        return this.onOversizedEvent;
    }

    @NotNull
    public SentryOpenTelemetryMode getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    @NotNull
    public List<IOptionsObserver> getOptionsObservers() {
        return this.optionsObservers;
    }

    @Nullable
    public String getOrgId() {
        return this.orgId;
    }

    @Nullable
    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    @NotNull
    public List<IPerformanceCollector> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    @NotNull
    public ProfileLifecycle getProfileLifecycle() {
        return this.profileLifecycle;
    }

    @Nullable
    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    @NotNull
    public IProfileConverter getProfilerConverter() {
        return this.profilerConverter;
    }

    @Nullable
    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    @Nullable
    public ProfilesSamplerCallback getProfilesSampler() {
        return this.profilesSampler;
    }

    @Nullable
    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    @Nullable
    public String getProguardUuid() {
        return this.proguardUuid;
    }

    @Nullable
    public Proxy getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Nullable
    public String getRelease() {
        return this.release;
    }

    @NotNull
    public ReplayController getReplayController() {
        return this.replayController;
    }

    @Nullable
    public Double getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public List<IScopeObserver> getScopeObservers() {
        return this.observers;
    }

    @Nullable
    public IScopesStorageFactory getScopesStorageFactory() {
        return this.scopesStorageFactory;
    }

    @Nullable
    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public String getSentryClientName() {
        return this.sentryClientName;
    }

    @NotNull
    public ISerializer getSerializer() {
        return this.serializer.getValue();
    }

    @Nullable
    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    @NotNull
    public SentryReplayOptions getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    @NotNull
    public ISocketTagger getSocketTagger() {
        return this.socketTagger;
    }

    @NotNull
    public ISpanFactory getSpanFactory() {
        return this.spanFactory;
    }

    @Nullable
    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @NotNull
    public Map<String, String> getTags() {
        return this.tags;
    }

    @NotNull
    public IThreadChecker getThreadChecker() {
        return this.threadChecker;
    }

    @NotNull
    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    @Nullable
    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    @Nullable
    public TracesSamplerCallback getTracesSampler() {
        return this.tracesSampler;
    }

    @NotNull
    public ITransactionProfiler getTransactionProfiler() {
        return this.transactionProfiler;
    }

    @NotNull
    public ITransportFactory getTransportFactory() {
        return this.transportFactory;
    }

    @NotNull
    public ITransportGate getTransportGate() {
        return this.transportGate;
    }

    @NotNull
    public IVersionDetector getVersionDetector() {
        return this.versionDetector;
    }

    @NotNull
    public final List<ViewHierarchyExporter> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d10;
        return this.profilesSampleRate == null && this.profilesSampler == null && (d10 = this.profileSessionSampleRate) != null && d10.doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableCacheTracing() {
        return this.enableCacheTracing;
    }

    public boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableQueueTracing() {
        return this.enableQueueTracing;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    @Nullable
    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d10 = this.profilesSampleRate;
        return (d10 != null && d10.doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE) || this.profilesSampler != null;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isStrictTraceContinuation() {
        return this.strictTraceContinuation;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(@NotNull ExternalOptions externalOptions) {
        if (externalOptions.getDsn() != null) {
            setDsn(externalOptions.getDsn());
        }
        if (externalOptions.getEnvironment() != null) {
            setEnvironment(externalOptions.getEnvironment());
        }
        if (externalOptions.getRelease() != null) {
            setRelease(externalOptions.getRelease());
        }
        if (externalOptions.getDist() != null) {
            setDist(externalOptions.getDist());
        }
        if (externalOptions.getServerName() != null) {
            setServerName(externalOptions.getServerName());
        }
        if (externalOptions.getProxy() != null) {
            setProxy(externalOptions.getProxy());
        }
        if (externalOptions.getEnableUncaughtExceptionHandler() != null) {
            setEnableUncaughtExceptionHandler(externalOptions.getEnableUncaughtExceptionHandler().booleanValue());
        }
        if (externalOptions.getPrintUncaughtStackTrace() != null) {
            setPrintUncaughtStackTrace(externalOptions.getPrintUncaughtStackTrace().booleanValue());
        }
        if (externalOptions.getSampleRate() != null) {
            setSampleRate(externalOptions.getSampleRate());
        }
        if (externalOptions.getTracesSampleRate() != null) {
            setTracesSampleRate(externalOptions.getTracesSampleRate());
        }
        if (externalOptions.getProfilesSampleRate() != null) {
            setProfilesSampleRate(externalOptions.getProfilesSampleRate());
        }
        if (externalOptions.getDebug() != null) {
            setDebug(externalOptions.getDebug().booleanValue());
        }
        if (externalOptions.getEnableDeduplication() != null) {
            setEnableDeduplication(externalOptions.getEnableDeduplication().booleanValue());
        }
        if (externalOptions.getSendClientReports() != null) {
            setSendClientReports(externalOptions.getSendClientReports().booleanValue());
        }
        if (externalOptions.isForceInit() != null) {
            setForceInit(externalOptions.isForceInit().booleanValue());
        }
        for (Map.Entry entry : new HashMap(externalOptions.getTags()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(externalOptions.getInAppIncludes()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(externalOptions.getInAppExcludes()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(externalOptions.getIgnoredExceptionsForType()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (externalOptions.getTracePropagationTargets() != null) {
            setTracePropagationTargets(new ArrayList(externalOptions.getTracePropagationTargets()));
        }
        Iterator it4 = new ArrayList(externalOptions.getContextTags()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (externalOptions.getProguardUuid() != null) {
            setProguardUuid(externalOptions.getProguardUuid());
        }
        if (externalOptions.getIdleTimeout() != null) {
            setIdleTimeout(externalOptions.getIdleTimeout());
        }
        if (externalOptions.getShutdownTimeoutMillis() != null) {
            setShutdownTimeoutMillis(externalOptions.getShutdownTimeoutMillis().longValue());
        }
        if (externalOptions.getSessionFlushTimeoutMillis() != null) {
            setSessionFlushTimeoutMillis(externalOptions.getSessionFlushTimeoutMillis().longValue());
        }
        Iterator<String> it5 = externalOptions.getBundleIds().iterator();
        while (it5.hasNext()) {
            addBundleId(it5.next());
        }
        if (externalOptions.isEnabled() != null) {
            setEnabled(externalOptions.isEnabled().booleanValue());
        }
        if (externalOptions.isEnablePrettySerializationOutput() != null) {
            setEnablePrettySerializationOutput(externalOptions.isEnablePrettySerializationOutput().booleanValue());
        }
        if (externalOptions.isSendModules() != null) {
            setSendModules(externalOptions.isSendModules().booleanValue());
        }
        if (externalOptions.getIgnoredCheckIns() != null) {
            setIgnoredCheckIns(new ArrayList(externalOptions.getIgnoredCheckIns()));
        }
        if (externalOptions.getIgnoredTransactions() != null) {
            setIgnoredTransactions(new ArrayList(externalOptions.getIgnoredTransactions()));
        }
        if (externalOptions.getIgnoredErrors() != null) {
            setIgnoredErrors(new ArrayList(externalOptions.getIgnoredErrors()));
        }
        if (externalOptions.isEnableBackpressureHandling() != null) {
            setEnableBackpressureHandling(externalOptions.isEnableBackpressureHandling().booleanValue());
        }
        if (externalOptions.isEnableDatabaseTransactionTracing() != null) {
            setEnableDatabaseTransactionTracing(externalOptions.isEnableDatabaseTransactionTracing().booleanValue());
        }
        if (externalOptions.isEnableCacheTracing() != null) {
            setEnableCacheTracing(externalOptions.isEnableCacheTracing().booleanValue());
        }
        if (externalOptions.isEnableQueueTracing() != null) {
            setEnableQueueTracing(externalOptions.isEnableQueueTracing().booleanValue());
        }
        if (externalOptions.getMaxRequestBodySize() != null) {
            setMaxRequestBodySize(externalOptions.getMaxRequestBodySize());
        }
        if (externalOptions.isSendDefaultPii() != null) {
            setSendDefaultPii(externalOptions.isSendDefaultPii().booleanValue());
        }
        if (externalOptions.isCaptureOpenTelemetryEvents() != null) {
            setCaptureOpenTelemetryEvents(externalOptions.isCaptureOpenTelemetryEvents().booleanValue());
        }
        if (externalOptions.isEnableSpotlight() != null) {
            setEnableSpotlight(externalOptions.isEnableSpotlight().booleanValue());
        }
        if (externalOptions.getSpotlightConnectionUrl() != null) {
            setSpotlightConnectionUrl(externalOptions.getSpotlightConnectionUrl());
        }
        if (externalOptions.isGlobalHubMode() != null) {
            setGlobalHubMode(externalOptions.isGlobalHubMode());
        }
        if (externalOptions.getCron() != null) {
            if (getCron() == null) {
                setCron(externalOptions.getCron());
            } else {
                if (externalOptions.getCron().getDefaultCheckinMargin() != null) {
                    getCron().setDefaultCheckinMargin(externalOptions.getCron().getDefaultCheckinMargin());
                }
                if (externalOptions.getCron().getDefaultMaxRuntime() != null) {
                    getCron().setDefaultMaxRuntime(externalOptions.getCron().getDefaultMaxRuntime());
                }
                if (externalOptions.getCron().getDefaultTimezone() != null) {
                    getCron().setDefaultTimezone(externalOptions.getCron().getDefaultTimezone());
                }
                if (externalOptions.getCron().getDefaultFailureIssueThreshold() != null) {
                    getCron().setDefaultFailureIssueThreshold(externalOptions.getCron().getDefaultFailureIssueThreshold());
                }
                if (externalOptions.getCron().getDefaultRecoveryThreshold() != null) {
                    getCron().setDefaultRecoveryThreshold(externalOptions.getCron().getDefaultRecoveryThreshold());
                }
            }
        }
        if (externalOptions.isEnableLogs() != null) {
            getLogs().setEnabled(externalOptions.isEnableLogs().booleanValue());
        }
        if (externalOptions.isEnableMetrics() != null) {
            getMetrics().setEnabled(externalOptions.isEnableMetrics().booleanValue());
        }
        if (externalOptions.getProfileSessionSampleRate() != null) {
            setProfileSessionSampleRate(externalOptions.getProfileSessionSampleRate());
        }
        if (externalOptions.getProfilingTracesDirPath() != null) {
            setProfilingTracesDirPath(externalOptions.getProfilingTracesDirPath());
        }
        if (externalOptions.getProfileLifecycle() != null) {
            setProfileLifecycle(externalOptions.getProfileLifecycle());
        }
        if (externalOptions.isStrictTraceContinuation() != null) {
            setStrictTraceContinuation(externalOptions.isStrictTraceContinuation().booleanValue());
        }
        if (externalOptions.getOrgId() != null) {
            setOrgId(externalOptions.getOrgId());
        }
    }

    @NotNull
    public Dsn retrieveParsedDsn() {
        return this.parsedDsn.getValue();
    }

    public void setAttachServerName(boolean z5) {
        this.attachServerName = z5;
    }

    public void setAttachStacktrace(boolean z5) {
        this.attachStacktrace = z5;
    }

    public void setAttachThreads(boolean z5) {
        this.attachThreads = z5;
    }

    public void setBackpressureMonitor(@NotNull IBackpressureMonitor iBackpressureMonitor) {
        this.backpressureMonitor = iBackpressureMonitor;
    }

    public void setBeforeBreadcrumb(@Nullable BeforeBreadcrumbCallback beforeBreadcrumbCallback) {
        this.beforeBreadcrumb = beforeBreadcrumbCallback;
    }

    public void setBeforeEnvelopeCallback(@Nullable BeforeEnvelopeCallback beforeEnvelopeCallback) {
        this.beforeEnvelopeCallback = beforeEnvelopeCallback;
    }

    public void setBeforeSend(@Nullable BeforeSendCallback beforeSendCallback) {
        this.beforeSend = beforeSendCallback;
    }

    public void setBeforeSendFeedback(@Nullable BeforeSendCallback beforeSendCallback) {
        this.beforeSendFeedback = beforeSendCallback;
    }

    public void setBeforeSendReplay(@Nullable BeforeSendReplayCallback beforeSendReplayCallback) {
        this.beforeSendReplay = beforeSendReplayCallback;
    }

    public void setBeforeSendTransaction(@Nullable BeforeSendTransactionCallback beforeSendTransactionCallback) {
        this.beforeSendTransaction = beforeSendTransactionCallback;
    }

    public void setCacheDirPath(@Nullable String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z5) {
        this.captureOpenTelemetryEvents = z5;
    }

    public void setCompositePerformanceCollector(@NotNull CompositePerformanceCollector compositePerformanceCollector) {
        this.compositePerformanceCollector = compositePerformanceCollector;
    }

    public void setConnectionStatusProvider(@NotNull IConnectionStatusProvider iConnectionStatusProvider) {
        this.connectionStatusProvider = iConnectionStatusProvider;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setContinuousProfiler(@Nullable IContinuousProfiler iContinuousProfiler) {
        if (this.continuousProfiler != NoOpContinuousProfiler.getInstance() || iContinuousProfiler == null) {
            return;
        }
        this.continuousProfiler = iContinuousProfiler;
    }

    public void setCron(@Nullable Cron cron) {
        this.cron = cron;
    }

    public void setDateProvider(@NotNull SentryDateProvider sentryDateProvider) {
        this.dateProvider.setValue(sentryDateProvider);
    }

    public void setDeadlineTimeout(long j10) {
        this.deadlineTimeout = j10;
    }

    public void setDebug(boolean z5) {
        this.debug = z5;
    }

    public void setDebugMetaLoader(@Nullable IDebugMetaLoader iDebugMetaLoader) {
        if (iDebugMetaLoader == null) {
            iDebugMetaLoader = NoOpDebugMetaLoader.getInstance();
        }
        this.debugMetaLoader = iDebugMetaLoader;
    }

    public void setDefaultScopeType(@NotNull ScopeType scopeType) {
        this.defaultScopeType = scopeType;
    }

    public void setDiagnosticLevel(@Nullable SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            sentryLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = sentryLevel;
    }

    public void setDist(@Nullable String str) {
        this.dist = str;
    }

    public void setDistinctId(@Nullable String str) {
        this.distinctId = str;
    }

    public void setDistribution(@NotNull DistributionOptions distributionOptions) {
        if (distributionOptions == null) {
            distributionOptions = new DistributionOptions();
        }
        this.distribution = distributionOptions;
    }

    public void setDistributionController(@Nullable IDistributionApi iDistributionApi) {
        if (iDistributionApi == null) {
            iDistributionApi = NoOpDistributionApi.getInstance();
        }
        this.distributionController = iDistributionApi;
    }

    public void setDsn(@Nullable String str) {
        this.dsn = str != null ? str.trim() : null;
        this.parsedDsn.resetValue();
        this.dsnHash = StringUtils.calculateStringHash(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z5) {
        this.enableAppStartProfiling = z5;
    }

    public void setEnableAutoSessionTracking(boolean z5) {
        this.enableAutoSessionTracking = z5;
    }

    public void setEnableBackpressureHandling(boolean z5) {
        this.enableBackpressureHandling = z5;
    }

    public void setEnableCacheTracing(boolean z5) {
        this.enableCacheTracing = z5;
    }

    public void setEnableDatabaseTransactionTracing(boolean z5) {
        this.enableDatabaseTransactionTracing = z5;
    }

    public void setEnableDeduplication(boolean z5) {
        this.enableDeduplication = z5;
    }

    public void setEnableEventSizeLimiting(boolean z5) {
        this.enableEventSizeLimiting = z5;
    }

    public void setEnableExternalConfiguration(boolean z5) {
        this.enableExternalConfiguration = z5;
    }

    public void setEnablePrettySerializationOutput(boolean z5) {
        this.enablePrettySerializationOutput = z5;
    }

    public void setEnableQueueTracing(boolean z5) {
        this.enableQueueTracing = z5;
    }

    public void setEnableScopePersistence(boolean z5) {
        this.enableScopePersistence = z5;
    }

    public void setEnableScreenTracking(boolean z5) {
        this.enableScreenTracking = z5;
    }

    public void setEnableShutdownHook(boolean z5) {
        this.enableShutdownHook = z5;
    }

    public void setEnableSpotlight(boolean z5) {
        this.enableSpotlight = z5;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z5) {
        this.enableTimeToFullDisplayTracing = z5;
    }

    public void setEnableUncaughtExceptionHandler(boolean z5) {
        this.enableUncaughtExceptionHandler = z5;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z5) {
        this.enableUserInteractionBreadcrumbs = z5;
    }

    public void setEnableUserInteractionTracing(boolean z5) {
        this.enableUserInteractionTracing = z5;
    }

    public void setEnabled(boolean z5) {
        this.enabled = z5;
    }

    public void setEnvelopeDiskCache(@Nullable IEnvelopeCache iEnvelopeCache) {
        if (iEnvelopeCache == null) {
            iEnvelopeCache = NoOpEnvelopeCache.getInstance();
        }
        this.envelopeDiskCache = iEnvelopeCache;
    }

    public void setEnvelopeReader(@Nullable IEnvelopeReader iEnvelopeReader) {
        LazyEvaluator<IEnvelopeReader> lazyEvaluator = this.envelopeReader;
        if (iEnvelopeReader == null) {
            iEnvelopeReader = NoOpEnvelopeReader.getInstance();
        }
        lazyEvaluator.setValue(iEnvelopeReader);
    }

    public void setEnvironment(@Nullable String str) {
        this.environment = str;
    }

    public void setExecutorService(@NotNull ISentryExecutorService iSentryExecutorService) {
        if (iSentryExecutorService != null) {
            this.executorService = iSentryExecutorService;
        }
    }

    public void setFatalLogger(@Nullable ILogger iLogger) {
        if (iLogger == null) {
            iLogger = NoOpLogger.getInstance();
        }
        this.fatalLogger = iLogger;
    }

    public void setFeedbackOptions(@NotNull SentryFeedbackOptions sentryFeedbackOptions) {
        this.feedbackOptions = sentryFeedbackOptions;
    }

    public void setFlushTimeoutMillis(long j10) {
        this.flushTimeoutMillis = j10;
    }

    public void setForceInit(boolean z5) {
        this.forceInit = z5;
    }

    public void setFullyDisplayedReporter(@NotNull FullyDisplayedReporter fullyDisplayedReporter) {
        this.fullyDisplayedReporter = fullyDisplayedReporter;
    }

    public void setGestureTargetLocators(@NotNull List<GestureTargetLocator> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(@Nullable Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(@Nullable Long l10) {
        this.idleTimeout = l10;
    }

    public void setIgnoredCheckIns(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new FilterString(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new FilterString(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new FilterString(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(@Nullable List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new FilterString(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(@NotNull InitPriority initPriority) {
        this.initPriority = initPriority;
    }

    @Deprecated
    public void setInstrumenter(@NotNull Instrumenter instrumenter) {
        this.instrumenter = instrumenter;
    }

    public void setLogger(@Nullable ILogger iLogger) {
        this.logger = iLogger == null ? NoOpLogger.getInstance() : new DiagnosticLogger(this, iLogger);
    }

    public void setLogs(@NotNull Logs logs) {
        this.logs = logs;
    }

    public void setMaxAttachmentSize(long j10) {
        this.maxAttachmentSize = j10;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxFeatureFlags(int i) {
        this.maxFeatureFlags = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(@NotNull RequestSize requestSize) {
        this.maxRequestBodySize = requestSize;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j10) {
        this.maxTraceFileSize = j10;
    }

    public void setMetrics(@NotNull Metrics metrics) {
        this.metrics = metrics;
    }

    public void setModulesLoader(@Nullable IModulesLoader iModulesLoader) {
        if (iModulesLoader == null) {
            iModulesLoader = NoOpModulesLoader.getInstance();
        }
        this.modulesLoader = iModulesLoader;
    }

    public void setOnDiscard(@Nullable OnDiscardCallback onDiscardCallback) {
        this.onDiscard = onDiscardCallback;
    }

    public void setOnOversizedEvent(@Nullable OnOversizedEventCallback onOversizedEventCallback) {
        this.onOversizedEvent = onOversizedEventCallback;
    }

    public void setOpenTelemetryMode(@NotNull SentryOpenTelemetryMode sentryOpenTelemetryMode) {
        this.openTelemetryMode = sentryOpenTelemetryMode;
    }

    public void setOrgId(@Nullable String str) {
        this.orgId = str;
    }

    public void setPrintUncaughtStackTrace(boolean z5) {
        this.printUncaughtStackTrace = z5;
    }

    public void setProfileLifecycle(@NotNull ProfileLifecycle profileLifecycle) {
        this.profileLifecycle = profileLifecycle;
        if (profileLifecycle != ProfileLifecycle.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.log(SentryLevel.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(@Nullable Double d10) {
        if (SampleRateUtils.isValidContinuousProfilesSampleRate(d10)) {
            this.profileSessionSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilerConverter(@NotNull IProfileConverter iProfileConverter) {
        this.profilerConverter = iProfileConverter;
    }

    public void setProfilesSampleRate(@Nullable Double d10) {
        if (SampleRateUtils.isValidProfilesSampleRate(d10)) {
            this.profilesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(@Nullable ProfilesSamplerCallback profilesSamplerCallback) {
        this.profilesSampler = profilesSamplerCallback;
    }

    public void setProfilingTracesDirPath(@Nullable String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i) {
        this.profilingTracesHz = i;
    }

    public void setProguardUuid(@Nullable String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z5) {
        this.propagateTraceparent = z5;
    }

    public void setProxy(@Nullable Proxy proxy) {
        this.proxy = proxy;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(@Nullable String str) {
        this.release = str;
    }

    public void setReplayController(@Nullable ReplayController replayController) {
        if (replayController == null) {
            replayController = NoOpReplayController.getInstance();
        }
        this.replayController = replayController;
    }

    public void setSampleRate(@Nullable Double d10) {
        if (SampleRateUtils.isValidSampleRate(d10)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setScopesStorageFactory(@Nullable IScopesStorageFactory iScopesStorageFactory) {
        this.scopesStorageFactory = iScopesStorageFactory;
    }

    public void setSdkVersion(@Nullable SdkVersion sdkVersion) {
        SdkVersion sdkVersion2 = getSessionReplay().getSdkVersion();
        SdkVersion sdkVersion3 = this.sdkVersion;
        if (sdkVersion3 != null && sdkVersion2 != null && sdkVersion3.equals(sdkVersion2)) {
            getSessionReplay().setSdkVersion(sdkVersion);
        }
        this.sdkVersion = sdkVersion;
    }

    public void setSendClientReports(boolean z5) {
        this.sendClientReports = z5;
        if (z5) {
            this.clientReportRecorder = new ClientReportRecorder(this);
        } else {
            this.clientReportRecorder = new NoOpClientReportRecorder();
        }
    }

    public void setSendDefaultPii(boolean z5) {
        this.sendDefaultPii = z5;
    }

    public void setSendModules(boolean z5) {
        this.sendModules = z5;
    }

    public void setSentryClientName(@Nullable String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(@Nullable ISerializer iSerializer) {
        LazyEvaluator<ISerializer> lazyEvaluator = this.serializer;
        if (iSerializer == null) {
            iSerializer = NoOpSerializer.getInstance();
        }
        lazyEvaluator.setValue(iSerializer);
    }

    public void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j10) {
        this.sessionFlushTimeoutMillis = j10;
    }

    public void setSessionReplay(@NotNull SentryReplayOptions sentryReplayOptions) {
        this.sessionReplay = sentryReplayOptions;
    }

    public void setSessionTrackingIntervalMillis(long j10) {
        this.sessionTrackingIntervalMillis = j10;
    }

    public void setShutdownTimeoutMillis(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setSocketTagger(@Nullable ISocketTagger iSocketTagger) {
        if (iSocketTagger == null) {
            iSocketTagger = NoOpSocketTagger.getInstance();
        }
        this.socketTagger = iSocketTagger;
    }

    public void setSpanFactory(@NotNull ISpanFactory iSpanFactory) {
        this.spanFactory = iSpanFactory;
    }

    public void setSpotlightConnectionUrl(@Nullable String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z5) {
        this.startProfilerOnAppStart = z5;
    }

    public void setStrictTraceContinuation(boolean z5) {
        this.strictTraceContinuation = z5;
    }

    public void setTag(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(@NotNull IThreadChecker iThreadChecker) {
        this.threadChecker = iThreadChecker;
    }

    public void setTraceOptionsRequests(boolean z5) {
        this.traceOptionsRequests = z5;
    }

    public void setTracePropagationTargets(@Nullable List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z5) {
        this.traceSampling = z5;
    }

    public void setTracesSampleRate(@Nullable Double d10) {
        if (SampleRateUtils.isValidTracesSampleRate(d10)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(@Nullable TracesSamplerCallback tracesSamplerCallback) {
        this.tracesSampler = tracesSamplerCallback;
    }

    public void setTransactionProfiler(@Nullable ITransactionProfiler iTransactionProfiler) {
        if (this.transactionProfiler != NoOpTransactionProfiler.getInstance() || iTransactionProfiler == null) {
            return;
        }
        this.transactionProfiler = iTransactionProfiler;
    }

    public void setTransportFactory(@Nullable ITransportFactory iTransportFactory) {
        if (iTransportFactory == null) {
            iTransportFactory = NoOpTransportFactory.getInstance();
        }
        this.transportFactory = iTransportFactory;
    }

    public void setTransportGate(@Nullable ITransportGate iTransportGate) {
        if (iTransportGate == null) {
            iTransportGate = NoOpTransportGate.getInstance();
        }
        this.transportGate = iTransportGate;
    }

    public void setVersionDetector(@NotNull IVersionDetector iVersionDetector) {
        this.versionDetector = iVersionDetector;
    }

    public void setViewHierarchyExporters(@NotNull List<ViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private SentryOptions(boolean z5) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new LazyEvaluator<>(new u(0, this));
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = NoOpLogger.getInstance();
        this.fatalLogger = NoOpLogger.getInstance();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new LazyEvaluator<>(new u(1, this));
        this.envelopeReader = new LazyEvaluator<>(new u(2, this));
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = NoOpTransportFactory.getInstance();
        this.transportGate = NoOpTransportGate.getInstance();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = NoOpSentryExecutorService.getInstance();
        this.spotlightIntegrationLoaded = new AtomicBoolean(false);
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = NoOpEnvelopeCache.getInstance();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.enableEventSizeLimiting = false;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = RequestSize.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = NoOpTransactionProfiler.getInstance();
        this.continuousProfiler = NoOpContinuousProfiler.getInstance();
        this.profilerConverter = NoOpProfileConverter.getInstance();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.strictTraceContinuation = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new ClientReportRecorder(this);
        this.modulesLoader = NoOpModulesLoader.getInstance();
        this.debugMetaLoader = NoOpDebugMetaLoader.getInstance();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = Instrumenter.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = NoOpThreadChecker.getInstance();
        this.traceOptionsRequests = true;
        this.enableDatabaseTransactionTracing = false;
        this.enableCacheTracing = false;
        this.enableQueueTracing = false;
        this.dateProvider = new LazyEvaluator<>(new g(2));
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = NoOpCompositePerformanceCollector.getInstance();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = FullyDisplayedReporter.getInstance();
        this.connectionStatusProvider = new NoOpConnectionStatusProvider();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = NoOpBackpressureMonitor.getInstance();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = NoOpSpanFactory.getInstance();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = NoOpReplayController.getInstance();
        this.distributionController = NoOpDistributionApi.getInstance();
        this.enableScreenTracking = true;
        this.defaultScopeType = ScopeType.ISOLATION;
        this.initPriority = InitPriority.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new AutoClosableReentrantLock();
        this.openTelemetryMode = SentryOpenTelemetryMode.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = NoopVersionDetector.getInstance();
        this.profileLifecycle = ProfileLifecycle.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.logs = new Logs();
        this.metrics = new Metrics();
        this.socketTagger = NoOpSocketTagger.getInstance();
        this.distribution = new DistributionOptions();
        SdkVersion sdkVersionCreateSdkVersion = createSdkVersion();
        this.experimental = new ExperimentalOptions(z5, sdkVersionCreateSdkVersion);
        this.sessionReplay = new SentryReplayOptions(z5, sdkVersionCreateSdkVersion);
        this.feedbackOptions = new SentryFeedbackOptions(new b(3, this));
        if (z5) {
            return;
        }
        setSpanFactory(SpanFactoryFactory.create(new LoadClass(), NoOpLogger.getInstance()));
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList.add(new MainEventProcessor(this));
        copyOnWriteArrayList.add(new DuplicateEventDetectionEventProcessor(this));
        if (Platform.isJvm()) {
            copyOnWriteArrayList.add(new SentryRuntimeEventProcessor());
        }
        setSentryClientName("sentry.java/8.41.0");
        setSdkVersion(sdkVersionCreateSdkVersion);
        addPackageInfo();
    }
}
