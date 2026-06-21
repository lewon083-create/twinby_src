package io.sentry;

import io.sentry.hints.AbnormalExit;
import io.sentry.hints.Cached;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.HintUtils;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class MainEventProcessor implements EventProcessor, Closeable {

    @Nullable
    private volatile HostnameCache hostnameCache = null;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final SentryExceptionFactory sentryExceptionFactory;

    @NotNull
    private final SentryThreadFactory sentryThreadFactory;

    public MainEventProcessor(@NotNull SentryOptions sentryOptions) {
        this.options = sentryOptions;
        SentryStackTraceFactory sentryStackTraceFactory = new SentryStackTraceFactory(sentryOptions);
        this.sentryExceptionFactory = new SentryExceptionFactory(sentryStackTraceFactory);
        this.sentryThreadFactory = new SentryThreadFactory(sentryStackTraceFactory);
    }

    private void ensureHostnameCache() {
        if (this.hostnameCache == null) {
            this.hostnameCache = HostnameCache.getInstance();
        }
    }

    private boolean isCachedHint(@NotNull Hint hint) {
        return HintUtils.hasType(hint, Cached.class);
    }

    private void mergeUser(@NotNull SentryBaseEvent sentryBaseEvent) {
        User user = sentryBaseEvent.getUser();
        if (user == null) {
            user = new User();
            sentryBaseEvent.setUser(user);
        }
        if (user.getIpAddress() == null && this.options.isSendDefaultPii()) {
            user.setIpAddress(IpAddressUtils.DEFAULT_IP_ADDRESS);
        }
    }

    private void processNonCachedEvent(@NotNull SentryBaseEvent sentryBaseEvent) {
        setRelease(sentryBaseEvent);
        setEnvironment(sentryBaseEvent);
        setServerName(sentryBaseEvent);
        setDist(sentryBaseEvent);
        setSdk(sentryBaseEvent);
        setTags(sentryBaseEvent);
        mergeUser(sentryBaseEvent);
    }

    private void setCommons(@NotNull SentryBaseEvent sentryBaseEvent) {
        setPlatform(sentryBaseEvent);
    }

    private void setDebugMeta(@NotNull SentryBaseEvent sentryBaseEvent) {
        DebugMeta debugMetaBuildDebugMeta = DebugMeta.buildDebugMeta(sentryBaseEvent.getDebugMeta(), this.options);
        if (debugMetaBuildDebugMeta != null) {
            sentryBaseEvent.setDebugMeta(debugMetaBuildDebugMeta);
        }
    }

    private void setDist(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist(this.options.getDist());
        }
    }

    private void setEnvironment(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getEnvironment() == null) {
            sentryBaseEvent.setEnvironment(this.options.getEnvironment());
        }
    }

    private void setExceptions(@NotNull SentryEvent sentryEvent) {
        Throwable throwableMechanism = sentryEvent.getThrowableMechanism();
        if (throwableMechanism != null) {
            sentryEvent.setExceptions(this.sentryExceptionFactory.getSentryExceptions(throwableMechanism));
        }
    }

    private void setModules(@NotNull SentryEvent sentryEvent) {
        Map<String, String> orLoadModules = this.options.getModulesLoader().getOrLoadModules();
        if (orLoadModules == null) {
            return;
        }
        Map<String, String> modules = sentryEvent.getModules();
        if (modules == null) {
            sentryEvent.setModules(orLoadModules);
        } else {
            modules.putAll(orLoadModules);
        }
    }

    private void setPlatform(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getPlatform() == null) {
            sentryBaseEvent.setPlatform("java");
        }
    }

    private void setRelease(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getRelease() == null) {
            sentryBaseEvent.setRelease(this.options.getRelease());
        }
    }

    private void setSdk(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getSdk() == null) {
            sentryBaseEvent.setSdk(this.options.getSdkVersion());
        }
    }

    private void setServerName(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getServerName() == null) {
            sentryBaseEvent.setServerName(this.options.getServerName());
        }
        if (this.options.isAttachServerName() && sentryBaseEvent.getServerName() == null) {
            ensureHostnameCache();
            if (this.hostnameCache != null) {
                sentryBaseEvent.setServerName(this.hostnameCache.getHostname());
            }
        }
    }

    private void setTags(@NotNull SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getTags() == null) {
            sentryBaseEvent.setTags(new HashMap(this.options.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.options.getTags().entrySet()) {
            if (!sentryBaseEvent.getTags().containsKey(entry.getKey())) {
                sentryBaseEvent.setTag(entry.getKey(), entry.getValue());
            }
        }
    }

    private void setThreads(@NotNull SentryEvent sentryEvent, @NotNull Hint hint) {
        boolean zIgnoreCurrentThread;
        if (sentryEvent.getThreads() == null) {
            List<SentryException> exceptions = sentryEvent.getExceptions();
            ArrayList arrayList = null;
            if (exceptions != null && !exceptions.isEmpty()) {
                for (SentryException sentryException : exceptions) {
                    if (sentryException.getMechanism() != null && sentryException.getThreadId() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(sentryException.getThreadId());
                    }
                }
            }
            if (this.options.isAttachThreads() || HintUtils.hasType(hint, AbnormalExit.class)) {
                Object sentrySdkHint = HintUtils.getSentrySdkHint(hint);
                boolean zIsAttachStacktrace = this.options.isAttachStacktrace();
                if (sentrySdkHint instanceof AbnormalExit) {
                    zIgnoreCurrentThread = ((AbnormalExit) sentrySdkHint).ignoreCurrentThread();
                    zIsAttachStacktrace = true;
                } else {
                    zIgnoreCurrentThread = false;
                }
                sentryEvent.setThreads(this.sentryThreadFactory.getCurrentThreads(arrayList, zIgnoreCurrentThread, zIsAttachStacktrace));
                return;
            }
            if (this.options.isAttachStacktrace()) {
                if ((exceptions == null || exceptions.isEmpty()) && !isCachedHint(hint)) {
                    sentryEvent.setThreads(this.sentryThreadFactory.getCurrentThread(this.options.isAttachStacktrace()));
                }
            }
        }
    }

    private boolean shouldApplyScopeData(@NotNull SentryBaseEvent sentryBaseEvent, @NotNull Hint hint) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", sentryBaseEvent.getEventId());
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hostnameCache != null) {
            this.hostnameCache.close();
        }
    }

    @Nullable
    public HostnameCache getHostnameCache() {
        return this.hostnameCache;
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public Long getOrder() {
        return 0L;
    }

    public boolean isClosed() {
        if (this.hostnameCache != null) {
            return this.hostnameCache.isClosed();
        }
        return true;
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public SentryLogEvent process(@NotNull SentryLogEvent sentryLogEvent) {
        return sentryLogEvent;
    }

    @Override // io.sentry.EventProcessor
    @NotNull
    public SentryEvent process(@NotNull SentryEvent sentryEvent, @NotNull Hint hint) {
        setCommons(sentryEvent);
        setExceptions(sentryEvent);
        setDebugMeta(sentryEvent);
        setModules(sentryEvent);
        if (shouldApplyScopeData(sentryEvent, hint)) {
            processNonCachedEvent(sentryEvent);
            setThreads(sentryEvent, hint);
        }
        return sentryEvent;
    }

    @Override // io.sentry.EventProcessor
    @NotNull
    public SentryTransaction process(@NotNull SentryTransaction sentryTransaction, @NotNull Hint hint) {
        setCommons(sentryTransaction);
        setDebugMeta(sentryTransaction);
        if (shouldApplyScopeData(sentryTransaction, hint)) {
            processNonCachedEvent(sentryTransaction);
        }
        return sentryTransaction;
    }

    @Override // io.sentry.EventProcessor
    @NotNull
    public SentryReplayEvent process(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull Hint hint) {
        setCommons(sentryReplayEvent);
        if (shouldApplyScopeData(sentryReplayEvent, hint)) {
            processNonCachedEvent(sentryReplayEvent);
            SdkVersion sdkVersion = this.options.getSessionReplay().getSdkVersion();
            if (sdkVersion != null) {
                sentryReplayEvent.setSdk(sdkVersion);
            }
        }
        return sentryReplayEvent;
    }
}
