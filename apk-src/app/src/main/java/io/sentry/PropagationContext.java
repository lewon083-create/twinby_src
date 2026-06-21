package io.sentry;

import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.exception.InvalidSentryTraceHeaderException;
import io.sentry.protocol.SentryId;
import io.sentry.util.TracingUtils;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class PropagationContext {

    @NotNull
    private final Baggage baggage;

    @Nullable
    private SpanId parentSpanId;

    @Nullable
    private Boolean sampled;

    @NotNull
    private SpanId spanId;

    @NotNull
    private SentryId traceId;

    public PropagationContext() {
        this(new SentryId(), new SpanId(), null, null, null);
    }

    @NotNull
    public static PropagationContext fromExistingTrace(@NotNull String str, @NotNull String str2, @Nullable Double d10, @Nullable Double d11) {
        return new PropagationContext(new SentryId(str), new SpanId(), new SpanId(str2), TracingUtils.ensureBaggage(null, null, d10, d11), null);
    }

    public static PropagationContext fromHeaders(@NotNull ILogger iLogger, @Nullable String str, @Nullable String str2, @Nullable SentryOptions sentryOptions) {
        return fromHeaders(iLogger, str, (List<String>) Arrays.asList(str2), sentryOptions);
    }

    @NotNull
    public Baggage getBaggage() {
        return this.baggage;
    }

    @Nullable
    public SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    @NotNull
    public Double getSampleRand() {
        Double sampleRand = this.baggage.getSampleRand();
        return Double.valueOf(sampleRand == null ? ConfigValue.DOUBLE_DEFAULT_VALUE : sampleRand.doubleValue());
    }

    @NotNull
    public SpanId getSpanId() {
        return this.spanId;
    }

    @NotNull
    public SentryId getTraceId() {
        return this.traceId;
    }

    @Nullable
    public Boolean isSampled() {
        return this.sampled;
    }

    public void setParentSpanId(@Nullable SpanId spanId) {
        this.parentSpanId = spanId;
    }

    public void setSampled(@Nullable Boolean bool) {
        this.sampled = bool;
    }

    public void setSpanId(@NotNull SpanId spanId) {
        this.spanId = spanId;
    }

    public void setTraceId(@NotNull SentryId sentryId) {
        this.traceId = sentryId;
    }

    @NotNull
    public SpanContext toSpanContext() {
        SpanContext spanContext = new SpanContext(this.traceId, this.spanId, "default", null, null);
        spanContext.setOrigin("auto");
        return spanContext;
    }

    @Nullable
    public TraceContext traceContext() {
        return this.baggage.toTraceContext();
    }

    public PropagationContext(@NotNull PropagationContext propagationContext) {
        this(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.getParentSpanId(), propagationContext.getBaggage(), propagationContext.isSampled());
    }

    @NotNull
    public static PropagationContext fromHeaders(@NotNull ILogger iLogger, @Nullable String str, @Nullable List<String> list, @Nullable SentryOptions sentryOptions) {
        if (str == null) {
            return new PropagationContext();
        }
        try {
            return fromHeaders(new SentryTraceHeader(str), Baggage.fromHeader(list, iLogger), (SpanId) null, sentryOptions);
        } catch (InvalidSentryTraceHeaderException e3) {
            iLogger.log(SentryLevel.DEBUG, e3, "Failed to parse Sentry trace header: %s", e3.getMessage());
            return new PropagationContext();
        }
    }

    public PropagationContext(@NotNull SentryId sentryId, @NotNull SpanId spanId, @Nullable SpanId spanId2, @Nullable Baggage baggage, @Nullable Boolean bool) {
        this.traceId = sentryId;
        this.spanId = spanId;
        this.parentSpanId = spanId2;
        this.baggage = TracingUtils.ensureBaggage(baggage, bool, null, null);
        this.sampled = bool;
    }

    @NotNull
    public static PropagationContext fromHeaders(@NotNull SentryTraceHeader sentryTraceHeader, @Nullable Baggage baggage, @Nullable SpanId spanId, @Nullable SentryOptions sentryOptions) {
        if (sentryOptions != null && !TracingUtils.shouldContinueTrace(sentryOptions, baggage)) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Not continuing trace due to strict org ID validation failure.", new Object[0]);
            return new PropagationContext();
        }
        if (spanId == null) {
            spanId = new SpanId();
        }
        return new PropagationContext(sentryTraceHeader.getTraceId(), spanId, sentryTraceHeader.getSpanId(), baggage, sentryTraceHeader.isSampled());
    }
}
