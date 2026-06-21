package io.sentry.logger;

import io.sentry.SentryAttributes;
import io.sentry.SentryDate;
import io.sentry.SpanContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryLogParameters {

    @Nullable
    private SentryAttributes attributes;

    @NotNull
    private String origin = SpanContext.DEFAULT_ORIGIN;

    @Nullable
    private SentryDate timestamp;

    @NotNull
    public static SentryLogParameters create(@Nullable SentryDate sentryDate, @Nullable SentryAttributes sentryAttributes) {
        SentryLogParameters sentryLogParameters = new SentryLogParameters();
        sentryLogParameters.setTimestamp(sentryDate);
        sentryLogParameters.setAttributes(sentryAttributes);
        return sentryLogParameters;
    }

    @Nullable
    public SentryAttributes getAttributes() {
        return this.attributes;
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

    public void setOrigin(@NotNull String str) {
        this.origin = str;
    }

    public void setTimestamp(@Nullable SentryDate sentryDate) {
        this.timestamp = sentryDate;
    }

    @NotNull
    public static SentryLogParameters create(@Nullable SentryAttributes sentryAttributes) {
        return create(null, sentryAttributes);
    }
}
