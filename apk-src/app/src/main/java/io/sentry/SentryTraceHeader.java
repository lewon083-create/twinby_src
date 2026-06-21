package io.sentry;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.exception.InvalidSentryTraceHeaderException;
import io.sentry.protocol.SentryId;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryTraceHeader {
    private static final Pattern SENTRY_TRACEPARENT_HEADER_REGEX = Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    public static final String SENTRY_TRACE_HEADER = "sentry-trace";

    @Nullable
    private final Boolean sampled;

    @NotNull
    private final SpanId spanId;

    @NotNull
    private final SentryId traceId;

    public SentryTraceHeader(@NotNull SentryId sentryId, @NotNull SpanId spanId, @Nullable Boolean bool) {
        this.traceId = sentryId;
        this.spanId = spanId;
        this.sampled = bool;
    }

    @NotNull
    public String getName() {
        return SENTRY_TRACE_HEADER;
    }

    @NotNull
    public SpanId getSpanId() {
        return this.spanId;
    }

    @NotNull
    public SentryId getTraceId() {
        return this.traceId;
    }

    @NotNull
    public String getValue() {
        Boolean bool = this.sampled;
        if (bool == null) {
            return this.traceId + "-" + this.spanId;
        }
        return this.traceId + "-" + this.spanId + "-" + (bool.booleanValue() ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
    }

    @Nullable
    public Boolean isSampled() {
        return this.sampled;
    }

    public SentryTraceHeader(@NotNull String str) throws InvalidSentryTraceHeaderException {
        Matcher matcher = SENTRY_TRACEPARENT_HEADER_REGEX.matcher(str);
        if (matcher.matches()) {
            this.traceId = new SentryId(matcher.group(1));
            this.spanId = new SpanId(matcher.group(2));
            String strGroup = matcher.group(3);
            this.sampled = strGroup == null ? null : Boolean.valueOf("1".equals(strGroup.substring(1)));
            return;
        }
        throw new InvalidSentryTraceHeaderException(str);
    }
}
