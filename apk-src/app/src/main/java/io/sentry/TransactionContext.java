package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.Objects;
import io.sentry.util.TracingUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class TransactionContext extends SpanContext {

    @NotNull
    private static final TransactionNameSource DEFAULT_NAME_SOURCE = TransactionNameSource.CUSTOM;

    @NotNull
    private static final String DEFAULT_OPERATION = "default";

    @NotNull
    public static final String DEFAULT_TRANSACTION_NAME = "<unlabeled transaction>";
    private boolean isForNextAppStart;

    @NotNull
    private String name;

    @Nullable
    private TracesSamplingDecision parentSamplingDecision;

    @NotNull
    private TransactionNameSource transactionNameSource;

    public TransactionContext(@NotNull String str, @NotNull String str2) {
        this(str, str2, (TracesSamplingDecision) null);
    }

    public static TransactionContext fromPropagationContext(@NotNull PropagationContext propagationContext) {
        Boolean boolIsSampled = propagationContext.isSampled();
        Baggage baggage = propagationContext.getBaggage();
        return new TransactionContext(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.getParentSpanId(), boolIsSampled == null ? null : new TracesSamplingDecision(boolIsSampled, baggage.getSampleRate(), propagationContext.getSampleRand()), baggage);
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public Boolean getParentSampled() {
        TracesSamplingDecision tracesSamplingDecision = this.parentSamplingDecision;
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampled();
    }

    @Nullable
    public TracesSamplingDecision getParentSamplingDecision() {
        return this.parentSamplingDecision;
    }

    @NotNull
    public TransactionNameSource getTransactionNameSource() {
        return this.transactionNameSource;
    }

    public boolean isForNextAppStart() {
        return this.isForNextAppStart;
    }

    public void setForNextAppStart(boolean z5) {
        this.isForNextAppStart = z5;
    }

    public void setName(@NotNull String str) {
        this.name = (String) Objects.requireNonNull(str, "name is required");
    }

    public void setParentSampled(@Nullable Boolean bool) {
        if (bool == null) {
            this.parentSamplingDecision = null;
        } else {
            this.parentSamplingDecision = new TracesSamplingDecision(bool);
        }
    }

    public void setTransactionNameSource(@NotNull TransactionNameSource transactionNameSource) {
        this.transactionNameSource = transactionNameSource;
    }

    public TransactionContext(@NotNull String str, @NotNull TransactionNameSource transactionNameSource, @NotNull String str2) {
        this(str, transactionNameSource, str2, null);
    }

    public TransactionContext(@NotNull String str, @NotNull String str2, @Nullable TracesSamplingDecision tracesSamplingDecision) {
        this(str, TransactionNameSource.CUSTOM, str2, tracesSamplingDecision);
    }

    public void setParentSampled(@Nullable Boolean bool, @Nullable Boolean bool2) {
        if (bool == null) {
            this.parentSamplingDecision = null;
        } else if (bool2 == null) {
            this.parentSamplingDecision = new TracesSamplingDecision(bool);
        } else {
            this.parentSamplingDecision = new TracesSamplingDecision(bool, null, bool2, null);
        }
    }

    public TransactionContext(@NotNull String str, @NotNull TransactionNameSource transactionNameSource, @NotNull String str2, @Nullable TracesSamplingDecision tracesSamplingDecision) {
        super(str2);
        this.isForNextAppStart = false;
        this.name = (String) Objects.requireNonNull(str, "name is required");
        this.transactionNameSource = transactionNameSource;
        setSamplingDecision(tracesSamplingDecision);
        this.baggage = TracingUtils.ensureBaggage(null, tracesSamplingDecision);
    }

    public TransactionContext(@NotNull SentryId sentryId, @NotNull SpanId spanId, @Nullable SpanId spanId2, @Nullable TracesSamplingDecision tracesSamplingDecision, @Nullable Baggage baggage) {
        super(sentryId, spanId, DEFAULT_OPERATION, spanId2, null);
        this.isForNextAppStart = false;
        this.name = DEFAULT_TRANSACTION_NAME;
        this.parentSamplingDecision = tracesSamplingDecision;
        this.transactionNameSource = DEFAULT_NAME_SOURCE;
        this.baggage = TracingUtils.ensureBaggage(baggage, tracesSamplingDecision);
    }
}
