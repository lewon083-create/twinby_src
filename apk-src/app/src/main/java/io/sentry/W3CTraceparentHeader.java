package io.sentry;

import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class W3CTraceparentHeader {
    public static final String TRACEPARENT_HEADER = "traceparent";

    @Nullable
    private final Boolean sampled;

    @NotNull
    private final SpanId spanId;

    @NotNull
    private final SentryId traceId;

    public W3CTraceparentHeader(@NotNull SentryId sentryId, @NotNull SpanId spanId, @Nullable Boolean bool) {
        this.traceId = sentryId;
        this.spanId = spanId;
        this.sampled = bool;
    }

    @NotNull
    public String getName() {
        return TRACEPARENT_HEADER;
    }

    @NotNull
    public String getValue() {
        Boolean bool = this.sampled;
        String str = (bool == null || !bool.booleanValue()) ? "00" : "01";
        return "00-" + this.traceId + "-" + this.spanId + "-" + str;
    }
}
