package io.sentry;

import io.sentry.SentryBaseEvent;
import io.sentry.SentryOptions;
import io.sentry.config.PropertiesProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExternalOptions {
    private static final String PROXY_PORT_DEFAULT = "80";

    @Nullable
    private Boolean captureOpenTelemetryEvents;

    @Nullable
    private SentryOptions.Cron cron;

    @Nullable
    private Boolean debug;

    @Nullable
    private String dist;

    @Nullable
    private String dsn;

    @Nullable
    private Boolean enableBackpressureHandling;

    @Nullable
    private Boolean enableCacheTracing;

    @Nullable
    private Boolean enableDatabaseTransactionTracing;

    @Nullable
    private Boolean enableDeduplication;

    @Nullable
    private Boolean enableLogs;

    @Nullable
    private Boolean enableMetrics;

    @Nullable
    private Boolean enablePrettySerializationOutput;

    @Nullable
    private Boolean enableQueueTracing;

    @Nullable
    private Boolean enableSpotlight;

    @Nullable
    private Boolean enableUncaughtExceptionHandler;

    @Nullable
    private Boolean enabled;

    @Nullable
    private String environment;

    @Nullable
    private Boolean forceInit;

    @Nullable
    private Boolean globalHubMode;

    @Nullable
    private Long idleTimeout;

    @Nullable
    private List<String> ignoredCheckIns;

    @Nullable
    private List<String> ignoredErrors;

    @Nullable
    private List<String> ignoredTransactions;

    @Nullable
    private SentryOptions.RequestSize maxRequestBodySize;

    @Nullable
    private String orgId;

    @Nullable
    private Boolean printUncaughtStackTrace;

    @Nullable
    private ProfileLifecycle profileLifecycle;

    @Nullable
    private Double profileSessionSampleRate;

    @Nullable
    private Double profilesSampleRate;

    @Nullable
    private String profilingTracesDirPath;

    @Nullable
    private String proguardUuid;

    @Nullable
    private SentryOptions.Proxy proxy;

    @Nullable
    private String release;

    @Nullable
    private Double sampleRate;

    @Nullable
    private Boolean sendClientReports;

    @Nullable
    private Boolean sendDefaultPii;

    @Nullable
    private Boolean sendModules;

    @Nullable
    private String serverName;

    @Nullable
    private Long sessionFlushTimeoutMillis;

    @Nullable
    private Long shutdownTimeoutMillis;

    @Nullable
    private String spotlightConnectionUrl;

    @Nullable
    private Boolean strictTraceContinuation;

    @Nullable
    private Double tracesSampleRate;

    @NotNull
    private final Map<String, String> tags = new ConcurrentHashMap();

    @NotNull
    private final List<String> inAppExcludes = new CopyOnWriteArrayList();

    @NotNull
    private final List<String> inAppIncludes = new CopyOnWriteArrayList();

    @Nullable
    private List<String> tracePropagationTargets = null;

    @NotNull
    private final List<String> contextTags = new CopyOnWriteArrayList();

    @NotNull
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();

    @NotNull
    private Set<String> bundleIds = new CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static ExternalOptions from(@NotNull PropertiesProvider propertiesProvider, @NotNull ILogger iLogger) {
        ExternalOptions externalOptions = new ExternalOptions();
        externalOptions.setDsn(propertiesProvider.getProperty("dsn"));
        externalOptions.setEnvironment(propertiesProvider.getProperty("environment"));
        externalOptions.setRelease(propertiesProvider.getProperty("release"));
        externalOptions.setDist(propertiesProvider.getProperty(SentryBaseEvent.JsonKeys.DIST));
        externalOptions.setServerName(propertiesProvider.getProperty("servername"));
        externalOptions.setEnableUncaughtExceptionHandler(propertiesProvider.getBooleanProperty("uncaught.handler.enabled"));
        externalOptions.setPrintUncaughtStackTrace(propertiesProvider.getBooleanProperty("uncaught.handler.print-stacktrace"));
        externalOptions.setSampleRate(propertiesProvider.getDoubleProperty("sample-rate"));
        externalOptions.setTracesSampleRate(propertiesProvider.getDoubleProperty("traces-sample-rate"));
        externalOptions.setProfilesSampleRate(propertiesProvider.getDoubleProperty("profiles-sample-rate"));
        externalOptions.setDebug(propertiesProvider.getBooleanProperty("debug"));
        externalOptions.setEnableDeduplication(propertiesProvider.getBooleanProperty("enable-deduplication"));
        externalOptions.setSendClientReports(propertiesProvider.getBooleanProperty("send-client-reports"));
        externalOptions.setForceInit(propertiesProvider.getBooleanProperty("force-init"));
        String property = propertiesProvider.getProperty("max-request-body-size");
        if (property != null) {
            externalOptions.setMaxRequestBodySize(SentryOptions.RequestSize.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : propertiesProvider.getMap("tags").entrySet()) {
            externalOptions.setTag(entry.getKey(), entry.getValue());
        }
        String property2 = propertiesProvider.getProperty("proxy.host");
        String property3 = propertiesProvider.getProperty("proxy.user");
        String property4 = propertiesProvider.getProperty("proxy.pass");
        String property5 = propertiesProvider.getProperty("proxy.port", PROXY_PORT_DEFAULT);
        if (property2 != null) {
            externalOptions.setProxy(new SentryOptions.Proxy(property2, property5, property3, property4));
        }
        Iterator<String> it = propertiesProvider.getList("in-app-includes").iterator();
        while (it.hasNext()) {
            externalOptions.addInAppInclude(it.next());
        }
        Iterator<String> it2 = propertiesProvider.getList("in-app-excludes").iterator();
        while (it2.hasNext()) {
            externalOptions.addInAppExclude(it2.next());
        }
        List<String> list = propertiesProvider.getProperty("trace-propagation-targets") != null ? propertiesProvider.getList("trace-propagation-targets") : null;
        if (list == null && propertiesProvider.getProperty("tracing-origins") != null) {
            list = propertiesProvider.getList("tracing-origins");
        }
        if (list != null) {
            Iterator<String> it3 = list.iterator();
            while (it3.hasNext()) {
                externalOptions.addTracePropagationTarget(it3.next());
            }
        }
        Iterator<String> it4 = propertiesProvider.getList("context-tags").iterator();
        while (it4.hasNext()) {
            externalOptions.addContextTag(it4.next());
        }
        externalOptions.setProguardUuid(propertiesProvider.getProperty("proguard-uuid"));
        Iterator<String> it5 = propertiesProvider.getList("bundle-ids").iterator();
        while (it5.hasNext()) {
            externalOptions.addBundleId(it5.next());
        }
        externalOptions.setIdleTimeout(propertiesProvider.getLongProperty("idle-timeout"));
        externalOptions.setShutdownTimeoutMillis(propertiesProvider.getLongProperty("shutdown-timeout-millis"));
        externalOptions.setSessionFlushTimeoutMillis(propertiesProvider.getLongProperty("session-flush-timeout-millis"));
        externalOptions.setIgnoredErrors(propertiesProvider.getListOrNull("ignored-errors"));
        externalOptions.setEnabled(propertiesProvider.getBooleanProperty("enabled"));
        externalOptions.setEnablePrettySerializationOutput(propertiesProvider.getBooleanProperty("enable-pretty-serialization-output"));
        externalOptions.setSendModules(propertiesProvider.getBooleanProperty("send-modules"));
        externalOptions.setSendDefaultPii(propertiesProvider.getBooleanProperty("send-default-pii"));
        externalOptions.setIgnoredCheckIns(propertiesProvider.getListOrNull("ignored-checkins"));
        externalOptions.setIgnoredTransactions(propertiesProvider.getListOrNull("ignored-transactions"));
        externalOptions.setEnableBackpressureHandling(propertiesProvider.getBooleanProperty("enable-backpressure-handling"));
        externalOptions.setEnableDatabaseTransactionTracing(propertiesProvider.getBooleanProperty("enable-database-transaction-tracing"));
        externalOptions.setEnableCacheTracing(propertiesProvider.getBooleanProperty("enable-cache-tracing"));
        externalOptions.setEnableQueueTracing(propertiesProvider.getBooleanProperty("enable-queue-tracing"));
        externalOptions.setGlobalHubMode(propertiesProvider.getBooleanProperty("global-hub-mode"));
        externalOptions.setCaptureOpenTelemetryEvents(propertiesProvider.getBooleanProperty("capture-open-telemetry-events"));
        externalOptions.setEnableLogs(propertiesProvider.getBooleanProperty("logs.enabled"));
        externalOptions.setEnableMetrics(propertiesProvider.getBooleanProperty("metrics.enabled"));
        for (String str : propertiesProvider.getList("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    externalOptions.addIgnoredExceptionForType(cls);
                } else {
                    iLogger.log(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.log(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        Long longProperty = propertiesProvider.getLongProperty("cron.default-checkin-margin");
        Long longProperty2 = propertiesProvider.getLongProperty("cron.default-max-runtime");
        String property6 = propertiesProvider.getProperty("cron.default-timezone");
        Long longProperty3 = propertiesProvider.getLongProperty("cron.default-failure-issue-threshold");
        Long longProperty4 = propertiesProvider.getLongProperty("cron.default-recovery-threshold");
        if (longProperty != null || longProperty2 != null || property6 != null || longProperty3 != null || longProperty4 != null) {
            SentryOptions.Cron cron = new SentryOptions.Cron();
            cron.setDefaultCheckinMargin(longProperty);
            cron.setDefaultMaxRuntime(longProperty2);
            cron.setDefaultTimezone(property6);
            cron.setDefaultFailureIssueThreshold(longProperty3);
            cron.setDefaultRecoveryThreshold(longProperty4);
            externalOptions.setCron(cron);
        }
        externalOptions.setStrictTraceContinuation(propertiesProvider.getBooleanProperty("enable-strict-trace-continuation"));
        externalOptions.setOrgId(propertiesProvider.getProperty("org-id"));
        externalOptions.setEnableSpotlight(propertiesProvider.getBooleanProperty("enable-spotlight"));
        externalOptions.setSpotlightConnectionUrl(propertiesProvider.getProperty("spotlight-connection-url"));
        externalOptions.setProfileSessionSampleRate(propertiesProvider.getDoubleProperty("profile-session-sample-rate"));
        externalOptions.setProfilingTracesDirPath(propertiesProvider.getProperty("profiling-traces-dir-path"));
        String property7 = propertiesProvider.getProperty("profile-lifecycle");
        if (property7 != null && !property7.isEmpty()) {
            externalOptions.setProfileLifecycle(ProfileLifecycle.valueOf(property7.toUpperCase()));
        }
        return externalOptions;
    }

    public void addBundleId(@NotNull String str) {
        this.bundleIds.add(str);
    }

    public void addContextTag(@NotNull String str) {
        this.contextTags.add(str);
    }

    public void addIgnoredExceptionForType(@NotNull Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(@NotNull String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(@NotNull String str) {
        this.inAppIncludes.add(str);
    }

    public void addTracePropagationTarget(@NotNull String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.tracePropagationTargets.add(str);
    }

    @NotNull
    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    @NotNull
    public List<String> getContextTags() {
        return this.contextTags;
    }

    @Nullable
    public SentryOptions.Cron getCron() {
        return this.cron;
    }

    @Nullable
    public Boolean getDebug() {
        return this.debug;
    }

    @Nullable
    public String getDist() {
        return this.dist;
    }

    @Nullable
    public String getDsn() {
        return this.dsn;
    }

    @Nullable
    public Boolean getEnableDeduplication() {
        return this.enableDeduplication;
    }

    @Nullable
    public Boolean getEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    @Nullable
    public String getEnvironment() {
        return this.environment;
    }

    @Nullable
    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    @Nullable
    public List<String> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    @Nullable
    public List<String> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    @NotNull
    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    @Nullable
    public List<String> getIgnoredTransactions() {
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

    @Nullable
    public SentryOptions.RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    @Nullable
    public String getOrgId() {
        return this.orgId;
    }

    @Nullable
    public Boolean getPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    @Nullable
    public ProfileLifecycle getProfileLifecycle() {
        return this.profileLifecycle;
    }

    @Nullable
    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    @Nullable
    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    @Nullable
    public String getProfilingTracesDirPath() {
        return this.profilingTracesDirPath;
    }

    @Nullable
    public String getProguardUuid() {
        return this.proguardUuid;
    }

    @Nullable
    public SentryOptions.Proxy getProxy() {
        return this.proxy;
    }

    @Nullable
    public String getRelease() {
        return this.release;
    }

    @Nullable
    public Double getSampleRate() {
        return this.sampleRate;
    }

    @Nullable
    public Boolean getSendClientReports() {
        return this.sendClientReports;
    }

    @Nullable
    public String getServerName() {
        return this.serverName;
    }

    @Nullable
    public Long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    @Nullable
    public Long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    @Nullable
    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    @NotNull
    public Map<String, String> getTags() {
        return this.tags;
    }

    @Nullable
    public List<String> getTracePropagationTargets() {
        return this.tracePropagationTargets;
    }

    @Nullable
    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    @Nullable
    public Boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    @Nullable
    public Boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    @Nullable
    public Boolean isEnableCacheTracing() {
        return this.enableCacheTracing;
    }

    @Nullable
    public Boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
    }

    @Nullable
    public Boolean isEnableLogs() {
        return this.enableLogs;
    }

    @Nullable
    public Boolean isEnableMetrics() {
        return this.enableMetrics;
    }

    @Nullable
    public Boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    @Nullable
    public Boolean isEnableQueueTracing() {
        return this.enableQueueTracing;
    }

    @Nullable
    public Boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    @Nullable
    public Boolean isEnabled() {
        return this.enabled;
    }

    @Nullable
    public Boolean isForceInit() {
        return this.forceInit;
    }

    @Nullable
    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    @Nullable
    public Boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    @Nullable
    public Boolean isSendModules() {
        return this.sendModules;
    }

    @Nullable
    public Boolean isStrictTraceContinuation() {
        return this.strictTraceContinuation;
    }

    public void setCaptureOpenTelemetryEvents(@Nullable Boolean bool) {
        this.captureOpenTelemetryEvents = bool;
    }

    public void setCron(@Nullable SentryOptions.Cron cron) {
        this.cron = cron;
    }

    public void setDebug(@Nullable Boolean bool) {
        this.debug = bool;
    }

    public void setDist(@Nullable String str) {
        this.dist = str;
    }

    public void setDsn(@Nullable String str) {
        this.dsn = str;
    }

    public void setEnableBackpressureHandling(@Nullable Boolean bool) {
        this.enableBackpressureHandling = bool;
    }

    public void setEnableCacheTracing(@Nullable Boolean bool) {
        this.enableCacheTracing = bool;
    }

    public void setEnableDatabaseTransactionTracing(@Nullable Boolean bool) {
        this.enableDatabaseTransactionTracing = bool;
    }

    public void setEnableDeduplication(@Nullable Boolean bool) {
        this.enableDeduplication = bool;
    }

    public void setEnableLogs(@Nullable Boolean bool) {
        this.enableLogs = bool;
    }

    public void setEnableMetrics(@Nullable Boolean bool) {
        this.enableMetrics = bool;
    }

    public void setEnablePrettySerializationOutput(@Nullable Boolean bool) {
        this.enablePrettySerializationOutput = bool;
    }

    public void setEnableQueueTracing(@Nullable Boolean bool) {
        this.enableQueueTracing = bool;
    }

    public void setEnableSpotlight(@Nullable Boolean bool) {
        this.enableSpotlight = bool;
    }

    public void setEnableUncaughtExceptionHandler(@Nullable Boolean bool) {
        this.enableUncaughtExceptionHandler = bool;
    }

    public void setEnabled(@Nullable Boolean bool) {
        this.enabled = bool;
    }

    public void setEnvironment(@Nullable String str) {
        this.environment = str;
    }

    public void setForceInit(@Nullable Boolean bool) {
        this.forceInit = bool;
    }

    public void setGlobalHubMode(@Nullable Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(@Nullable Long l10) {
        this.idleTimeout = l10;
    }

    public void setIgnoredCheckIns(@Nullable List<String> list) {
        this.ignoredCheckIns = list;
    }

    public void setIgnoredErrors(@Nullable List<String> list) {
        this.ignoredErrors = list;
    }

    public void setIgnoredTransactions(@Nullable List<String> list) {
        this.ignoredTransactions = list;
    }

    public void setMaxRequestBodySize(@Nullable SentryOptions.RequestSize requestSize) {
        this.maxRequestBodySize = requestSize;
    }

    public void setOrgId(@Nullable String str) {
        this.orgId = str;
    }

    public void setPrintUncaughtStackTrace(@Nullable Boolean bool) {
        this.printUncaughtStackTrace = bool;
    }

    public void setProfileLifecycle(@Nullable ProfileLifecycle profileLifecycle) {
        this.profileLifecycle = profileLifecycle;
    }

    public void setProfileSessionSampleRate(@Nullable Double d10) {
        this.profileSessionSampleRate = d10;
    }

    public void setProfilesSampleRate(@Nullable Double d10) {
        this.profilesSampleRate = d10;
    }

    public void setProfilingTracesDirPath(@Nullable String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProguardUuid(@Nullable String str) {
        this.proguardUuid = str;
    }

    public void setProxy(@Nullable SentryOptions.Proxy proxy) {
        this.proxy = proxy;
    }

    public void setRelease(@Nullable String str) {
        this.release = str;
    }

    public void setSampleRate(@Nullable Double d10) {
        this.sampleRate = d10;
    }

    public void setSendClientReports(@Nullable Boolean bool) {
        this.sendClientReports = bool;
    }

    public void setSendDefaultPii(@Nullable Boolean bool) {
        this.sendDefaultPii = bool;
    }

    public void setSendModules(@Nullable Boolean bool) {
        this.sendModules = bool;
    }

    public void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(@Nullable Long l10) {
        this.sessionFlushTimeoutMillis = l10;
    }

    public void setShutdownTimeoutMillis(@Nullable Long l10) {
        this.shutdownTimeoutMillis = l10;
    }

    public void setSpotlightConnectionUrl(@Nullable String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setStrictTraceContinuation(@Nullable Boolean bool) {
        this.strictTraceContinuation = bool;
    }

    public void setTag(@NotNull String str, @NotNull String str2) {
        this.tags.put(str, str2);
    }

    public void setTracesSampleRate(@Nullable Double d10) {
        this.tracesSampleRate = d10;
    }
}
