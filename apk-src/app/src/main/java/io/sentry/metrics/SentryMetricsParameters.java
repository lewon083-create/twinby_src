package io.sentry.metrics;

import io.sentry.Hint;
import io.sentry.SentryAttributes;
import io.sentry.SentryDate;
import io.sentry.SpanContext;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryMetricsParameters {

    @Nullable
    private SentryAttributes attributes;

    @Nullable
    private SentryDate timestamp;

    @NotNull
    private String origin = SpanContext.DEFAULT_ORIGIN;

    @Nullable
    private Hint hint = null;

    @NotNull
    public static SentryMetricsParameters create(@Nullable SentryDate sentryDate, @Nullable SentryAttributes sentryAttributes) {
        SentryMetricsParameters sentryMetricsParameters = new SentryMetricsParameters();
        sentryMetricsParameters.setTimestamp(sentryDate);
        sentryMetricsParameters.setAttributes(sentryAttributes);
        return sentryMetricsParameters;
    }

    @Nullable
    public SentryAttributes getAttributes() {
        return this.attributes;
    }

    @Nullable
    public Hint getHint() {
        return this.hint;
    }

    @NotNull
    public String getOrigin() {
        return this.origin;
    }

    @Nullable
    public SentryDate getTimestamp() {
        return this.timestamp;
    }

    public void setAttributes(@Nullable SentryAttributes sentryAttributes) {
        this.attributes = sentryAttributes;
    }

    public void setHint(@Nullable Hint hint) {
        this.hint = hint;
    }

    public void setOrigin(@NotNull String str) {
        this.origin = str;
    }

    public void setTimestamp(@Nullable SentryDate sentryDate) {
        this.timestamp = sentryDate;
    }

    @NotNull
    public static SentryMetricsParameters create(@Nullable SentryAttributes sentryAttributes) {
        return create(null, sentryAttributes);
    }

    @NotNull
    public static SentryMetricsParameters create(@Nullable Map<String, Object> map) {
        return create(null, SentryAttributes.fromMap(map));
    }
}
