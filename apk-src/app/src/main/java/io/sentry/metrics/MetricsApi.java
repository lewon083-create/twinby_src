package io.sentry.metrics;

import io.sentry.HostnameCache;
import io.sentry.IScope;
import io.sentry.ISpan;
import io.sentry.PropagationContext;
import io.sentry.Scopes;
import io.sentry.SentryAttribute;
import io.sentry.SentryAttributeType;
import io.sentry.SentryAttributes;
import io.sentry.SentryDate;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SentryMetricsEvent;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.SpanId;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.Platform;
import io.sentry.util.TracingUtils;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class MetricsApi implements IMetricsApi {

    @NotNull
    private final Scopes scopes;

    public MetricsApi(@NotNull Scopes scopes) {
        this.scopes = scopes;
    }

    private void captureMetrics(@NotNull SentryMetricsParameters sentryMetricsParameters, @Nullable String str, @Nullable String str2, @Nullable Double d10, @Nullable String str3) {
        SentryOptions options = this.scopes.getOptions();
        try {
            if (!this.scopes.isEnabled()) {
                options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'metrics' call is a no-op.", new Object[0]);
                return;
            }
            if (!options.getMetrics().isEnabled()) {
                options.getLogger().log(SentryLevel.WARNING, "Sentry Metrics is disabled and this 'metrics' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null || str2 == null || d10 == null) {
                return;
            }
            SentryDate timestamp = sentryMetricsParameters.getTimestamp();
            if (timestamp == null) {
                timestamp = options.getDateProvider().now();
            }
            SentryDate sentryDate = timestamp;
            IScope combinedScopeView = this.scopes.getCombinedScopeView();
            PropagationContext propagationContext = combinedScopeView.getPropagationContext();
            ISpan span = combinedScopeView.getSpan();
            if (span == null) {
                TracingUtils.maybeUpdateBaggage(combinedScopeView, options);
            }
            SentryId traceId = span == null ? propagationContext.getTraceId() : span.getSpanContext().getTraceId();
            SpanId spanId = span == null ? propagationContext.getSpanId() : span.getSpanContext().getSpanId();
            SentryMetricsEvent sentryMetricsEvent = new SentryMetricsEvent(traceId, sentryDate, str, str2, d10);
            sentryMetricsEvent.setSpanId(spanId);
            sentryMetricsEvent.setUnit(str3);
            sentryMetricsEvent.setAttributes(createAttributes(sentryMetricsParameters));
            this.scopes.getClient().captureMetric(sentryMetricsEvent, combinedScopeView, sentryMetricsParameters.getHint());
        } catch (Throwable th2) {
            options.getLogger().log(SentryLevel.ERROR, "Error while capturing metrics event", th2);
        }
    }

    @NotNull
    private HashMap<String, SentryLogEventAttributeValue> createAttributes(@NotNull SentryMetricsParameters sentryMetricsParameters) {
        HashMap<String, SentryLogEventAttributeValue> map = new HashMap<>();
        for (SentryAttribute sentryAttribute : this.scopes.getCombinedScopeView().getAttributes().values()) {
            map.put(sentryAttribute.getName(), SentryLogEventAttributeValue.fromAttribute(sentryAttribute));
        }
        String origin = sentryMetricsParameters.getOrigin();
        if (!SpanContext.DEFAULT_ORIGIN.equalsIgnoreCase(origin)) {
            map.put("sentry.origin", new SentryLogEventAttributeValue(SentryAttributeType.STRING, origin));
        }
        SentryAttributes attributes = sentryMetricsParameters.getAttributes();
        if (attributes != null) {
            for (SentryAttribute sentryAttribute2 : attributes.getAttributes().values()) {
                map.put(sentryAttribute2.getName(), SentryLogEventAttributeValue.fromAttribute(sentryAttribute2));
            }
        }
        SdkVersion sdkVersion = this.scopes.getOptions().getSdkVersion();
        if (sdkVersion != null) {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            map.put("sentry.sdk.name", new SentryLogEventAttributeValue(sentryAttributeType, sdkVersion.getName()));
            map.put("sentry.sdk.version", new SentryLogEventAttributeValue(sentryAttributeType, sdkVersion.getVersion()));
        }
        String environment = this.scopes.getOptions().getEnvironment();
        if (environment != null) {
            map.put("sentry.environment", new SentryLogEventAttributeValue(SentryAttributeType.STRING, environment));
        }
        SentryId replayId = this.scopes.getCombinedScopeView().getReplayId();
        SentryId sentryId = SentryId.EMPTY_ID;
        if (sentryId.equals(replayId)) {
            SentryId replayId2 = this.scopes.getOptions().getReplayController().getReplayId();
            if (!sentryId.equals(replayId2)) {
                map.put("sentry.replay_id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, replayId2.toString()));
                map.put("sentry._internal.replay_is_buffering", new SentryLogEventAttributeValue(SentryAttributeType.BOOLEAN, Boolean.TRUE));
            }
        } else {
            map.put("sentry.replay_id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, replayId.toString()));
        }
        String release = this.scopes.getOptions().getRelease();
        if (release != null) {
            map.put("sentry.release", new SentryLogEventAttributeValue(SentryAttributeType.STRING, release));
        }
        if (Platform.isJvm()) {
            setServerName(map);
        }
        setUser(map);
        return map;
    }

    private void setServerName(@NotNull HashMap<String, SentryLogEventAttributeValue> map) {
        String hostname;
        SentryOptions options = this.scopes.getOptions();
        String serverName = options.getServerName();
        if (serverName != null) {
            map.put("server.address", new SentryLogEventAttributeValue(SentryAttributeType.STRING, serverName));
        } else {
            if (!options.isAttachServerName() || (hostname = HostnameCache.getInstance().getHostname()) == null) {
                return;
            }
            map.put("server.address", new SentryLogEventAttributeValue(SentryAttributeType.STRING, hostname));
        }
    }

    private void setUser(@NotNull HashMap<String, SentryLogEventAttributeValue> map) {
        User user = this.scopes.getCombinedScopeView().getUser();
        if (user == null) {
            String distinctId = this.scopes.getOptions().getDistinctId();
            if (distinctId != null) {
                map.put("user.id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, distinctId));
                return;
            }
            return;
        }
        String id2 = user.getId();
        if (id2 != null) {
            map.put("user.id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, id2));
        }
        String username = user.getUsername();
        if (username != null) {
            map.put("user.name", new SentryLogEventAttributeValue(SentryAttributeType.STRING, username));
        }
        String email = user.getEmail();
        if (email != null) {
            map.put("user.email", new SentryLogEventAttributeValue(SentryAttributeType.STRING, email));
        }
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(@NotNull String str) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", Double.valueOf(1.0d), null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(@NotNull String str, @Nullable Double d10) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "distribution", d10, null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(@NotNull String str, @Nullable Double d10) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "gauge", d10, null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(@NotNull String str, @Nullable Double d10) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", d10, null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(@NotNull String str, @Nullable Double d10, @Nullable String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "distribution", d10, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(@NotNull String str, @Nullable Double d10, @Nullable String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "gauge", d10, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(@NotNull String str, @Nullable String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", Double.valueOf(1.0d), str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(@NotNull String str, @Nullable Double d10, @Nullable String str2, @NotNull SentryMetricsParameters sentryMetricsParameters) {
        captureMetrics(sentryMetricsParameters, str, "distribution", d10, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(@NotNull String str, @Nullable Double d10, @Nullable String str2, @NotNull SentryMetricsParameters sentryMetricsParameters) {
        captureMetrics(sentryMetricsParameters, str, "gauge", d10, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(@NotNull String str, @Nullable Double d10, @Nullable String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", d10, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(@NotNull String str, @Nullable Double d10, @Nullable String str2, @NotNull SentryMetricsParameters sentryMetricsParameters) {
        captureMetrics(sentryMetricsParameters, str, "counter", d10, str2);
    }
}
