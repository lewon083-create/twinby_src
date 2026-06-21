package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Span implements ISpan {

    @NotNull
    private final SpanContext context;

    @NotNull
    private final SpanOptions options;

    @NotNull
    private final IScopes scopes;

    @Nullable
    private SpanFinishedCallback spanFinishedCallback;

    @NotNull
    private SentryDate startTimestamp;

    @Nullable
    private Throwable throwable;

    @Nullable
    private SentryDate timestamp;

    @NotNull
    private final SentryTracer transaction;
    private boolean finished = false;

    @NotNull
    private final AtomicBoolean isFinishing = new AtomicBoolean(false);

    @NotNull
    private final Map<String, Object> data = new ConcurrentHashMap();

    @NotNull
    private final Map<String, MeasurementValue> measurements = new ConcurrentHashMap();

    @NotNull
    private final Contexts contexts = new Contexts();

    public Span(@NotNull SentryTracer sentryTracer, @NotNull IScopes iScopes, @NotNull SpanContext spanContext, @NotNull SpanOptions spanOptions, @Nullable SpanFinishedCallback spanFinishedCallback) {
        this.context = spanContext;
        spanContext.setOrigin(spanOptions.getOrigin());
        this.transaction = (SentryTracer) Objects.requireNonNull(sentryTracer, "transaction is required");
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        this.options = spanOptions;
        this.spanFinishedCallback = spanFinishedCallback;
        SentryDate startTimestamp = spanOptions.getStartTimestamp();
        if (startTimestamp != null) {
            this.startTimestamp = startTimestamp;
        } else {
            this.startTimestamp = iScopes.getOptions().getDateProvider().now();
        }
    }

    @NotNull
    private List<Span> getDirectChildren() {
        ArrayList arrayList = new ArrayList();
        for (Span span : this.transaction.getSpans()) {
            if (span.getParentSpanId() != null && span.getParentSpanId().equals(getSpanId())) {
                arrayList.add(span);
            }
        }
        return arrayList;
    }

    private void updateStartDate(@NotNull SentryDate sentryDate) {
        this.startTimestamp = sentryDate;
    }

    @Override // io.sentry.ISpan
    public void addFeatureFlag(@Nullable String str, @Nullable Boolean bool) {
        this.context.addFeatureFlag(str, bool);
    }

    @Override // io.sentry.ISpan
    public void finish() {
        finish(this.context.getStatus());
    }

    @Override // io.sentry.ISpan
    @NotNull
    public Contexts getContexts() {
        return this.contexts;
    }

    @NotNull
    public Map<String, Object> getData() {
        return this.data;
    }

    @Override // io.sentry.ISpan
    @Nullable
    public String getDescription() {
        return this.context.getDescription();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public SentryDate getFinishDate() {
        return this.timestamp;
    }

    @NotNull
    public Map<String, MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public String getOperation() {
        return this.context.getOperation();
    }

    @NotNull
    public SpanOptions getOptions() {
        return this.options;
    }

    @Nullable
    public SpanId getParentSpanId() {
        return this.context.getParentSpanId();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public TracesSamplingDecision getSamplingDecision() {
        return this.context.getSamplingDecision();
    }

    @Override // io.sentry.ISpan
    @NotNull
    public SpanContext getSpanContext() {
        return this.context;
    }

    @Nullable
    public SpanFinishedCallback getSpanFinishedCallback() {
        return this.spanFinishedCallback;
    }

    @NotNull
    public SpanId getSpanId() {
        return this.context.getSpanId();
    }

    @Override // io.sentry.ISpan
    @NotNull
    public SentryDate getStartDate() {
        return this.startTimestamp;
    }

    @Override // io.sentry.ISpan
    @Nullable
    public SpanStatus getStatus() {
        return this.context.getStatus();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public String getTag(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.context.getTags().get(str);
    }

    public Map<String, String> getTags() {
        return this.context.getTags();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public Throwable getThrowable() {
        return this.throwable;
    }

    @NotNull
    public SentryId getTraceId() {
        return this.context.getTraceId();
    }

    @Override // io.sentry.ISpan
    public boolean isFinished() {
        return this.finished;
    }

    @Override // io.sentry.ISpan
    public boolean isNoOp() {
        return false;
    }

    @Nullable
    public Boolean isProfileSampled() {
        return this.context.getProfileSampled();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public Boolean isSampled() {
        return this.context.getSampled();
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISentryLifecycleToken makeCurrent() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.ISpan
    public void setContext(@Nullable String str, @Nullable Object obj) {
        this.contexts.put(str, obj);
    }

    @Override // io.sentry.ISpan
    public void setData(@Nullable String str, @Nullable Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.data.remove(str);
        } else {
            this.data.put(str, obj);
        }
    }

    @Override // io.sentry.ISpan
    public void setDescription(@Nullable String str) {
        this.context.setDescription(str);
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(@NotNull String str, @NotNull Number number) {
        if (isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.measurements.put(str, new MeasurementValue(number, null));
        if (this.transaction.getRoot() != this) {
            this.transaction.setMeasurementFromChild(str, number);
        }
    }

    @Override // io.sentry.ISpan
    public void setOperation(@NotNull String str) {
        this.context.setOperation(str);
    }

    public void setSpanFinishedCallback(@Nullable SpanFinishedCallback spanFinishedCallback) {
        this.spanFinishedCallback = spanFinishedCallback;
    }

    @Override // io.sentry.ISpan
    public void setStatus(@Nullable SpanStatus spanStatus) {
        this.context.setStatus(spanStatus);
    }

    @Override // io.sentry.ISpan
    public void setTag(@Nullable String str, @Nullable String str2) {
        this.context.setTag(str, str2);
    }

    @Override // io.sentry.ISpan
    public void setThrowable(@Nullable Throwable th2) {
        this.throwable = th2;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str) {
        return startChild(str, (String) null);
    }

    @Override // io.sentry.ISpan
    @Nullable
    public BaggageHeader toBaggageHeader(@Nullable List<String> list) {
        return this.transaction.toBaggageHeader(list);
    }

    @Override // io.sentry.ISpan
    @NotNull
    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(this.context.getTraceId(), this.context.getSpanId(), this.context.getSampled());
    }

    @Override // io.sentry.ISpan
    @Nullable
    public TraceContext traceContext() {
        return this.transaction.traceContext();
    }

    @Override // io.sentry.ISpan
    public boolean updateEndDate(@NotNull SentryDate sentryDate) {
        if (this.timestamp == null) {
            return false;
        }
        this.timestamp = sentryDate;
        return true;
    }

    @Override // io.sentry.ISpan
    public void finish(@Nullable SpanStatus spanStatus) {
        finish(spanStatus, this.scopes.getOptions().getDateProvider().now());
    }

    @Override // io.sentry.ISpan
    @Nullable
    public Object getData(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.data.get(str);
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter, @NotNull SpanOptions spanOptions) {
        return this.finished ? NoOpSpan.getInstance() : this.transaction.startChild(this.context.getSpanId(), str, str2, sentryDate, instrumenter, spanOptions);
    }

    @Override // io.sentry.ISpan
    public void finish(@Nullable SpanStatus spanStatus, @Nullable SentryDate sentryDate) {
        List<Span> directChildren;
        SentryDate sentryDate2;
        if (this.finished || !this.isFinishing.compareAndSet(false, true)) {
            return;
        }
        this.context.setStatus(spanStatus);
        if (sentryDate == null) {
            sentryDate = this.scopes.getOptions().getDateProvider().now();
        }
        this.timestamp = sentryDate;
        if (this.options.isTrimStart() || this.options.isTrimEnd()) {
            if (this.transaction.getRoot().getSpanId().equals(getSpanId())) {
                directChildren = this.transaction.getChildren();
            } else {
                directChildren = getDirectChildren();
            }
            SentryDate startDate = null;
            SentryDate finishDate = null;
            for (Span span : directChildren) {
                if (startDate == null || span.getStartDate().isBefore(startDate)) {
                    startDate = span.getStartDate();
                }
                if (finishDate == null || (span.getFinishDate() != null && span.getFinishDate().isAfter(finishDate))) {
                    finishDate = span.getFinishDate();
                }
            }
            if (this.options.isTrimStart() && startDate != null && this.startTimestamp.isBefore(startDate)) {
                updateStartDate(startDate);
            }
            if (this.options.isTrimEnd() && finishDate != null && ((sentryDate2 = this.timestamp) == null || sentryDate2.isAfter(finishDate))) {
                updateEndDate(finishDate);
            }
        }
        Throwable th2 = this.throwable;
        if (th2 != null) {
            this.scopes.setSpanContext(th2, this, this.transaction.getName());
        }
        SpanFinishedCallback spanFinishedCallback = this.spanFinishedCallback;
        if (spanFinishedCallback != null) {
            spanFinishedCallback.execute(this);
        }
        this.finished = true;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2) {
        if (this.finished) {
            return NoOpSpan.getInstance();
        }
        return this.transaction.startChild(this.context.getSpanId(), str, str2);
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(@NotNull String str, @NotNull Number number, @NotNull MeasurementUnit measurementUnit) {
        if (isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.measurements.put(str, new MeasurementValue(number, measurementUnit.apiName()));
        if (this.transaction.getRoot() != this) {
            this.transaction.setMeasurementFromChild(str, number, measurementUnit);
        }
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @NotNull SpanOptions spanOptions) {
        if (this.finished) {
            return NoOpSpan.getInstance();
        }
        return this.transaction.startChild(this.context.getSpanId(), str, str2, spanOptions);
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull SpanContext spanContext, @NotNull SpanOptions spanOptions) {
        return this.transaction.startChild(spanContext, spanOptions);
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter) {
        return startChild(str, str2, sentryDate, instrumenter, new SpanOptions());
    }

    public Span(@NotNull TransactionContext transactionContext, @NotNull SentryTracer sentryTracer, @NotNull IScopes iScopes, @NotNull SpanOptions spanOptions) {
        SpanContext spanContext = (SpanContext) Objects.requireNonNull(transactionContext, "context is required");
        this.context = spanContext;
        spanContext.setOrigin(spanOptions.getOrigin());
        this.transaction = (SentryTracer) Objects.requireNonNull(sentryTracer, "sentryTracer is required");
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "scopes are required");
        this.spanFinishedCallback = null;
        SentryDate startTimestamp = spanOptions.getStartTimestamp();
        if (startTimestamp != null) {
            this.startTimestamp = startTimestamp;
        } else {
            this.startTimestamp = iScopes.getOptions().getDateProvider().now();
        }
        this.options = spanOptions;
    }
}
