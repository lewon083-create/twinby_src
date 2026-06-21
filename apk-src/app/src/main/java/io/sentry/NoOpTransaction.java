package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpTransaction implements ITransaction {
    private static final NoOpTransaction instance = new NoOpTransaction();

    private NoOpTransaction() {
    }

    public static NoOpTransaction getInstance() {
        return instance;
    }

    @Override // io.sentry.ISpan
    public void finish() {
    }

    @Override // io.sentry.ISpan
    @NotNull
    public Contexts getContexts() {
        return new Contexts();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public Object getData(@Nullable String str) {
        return null;
    }

    @Override // io.sentry.ISpan
    @Nullable
    public String getDescription() {
        return null;
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public SentryId getEventId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public SentryDate getFinishDate() {
        return new SentryNanotimeDate();
    }

    @Override // io.sentry.ITransaction
    @Nullable
    public ISpan getLatestActiveSpan() {
        return null;
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public String getName() {
        return "";
    }

    @Override // io.sentry.ISpan
    @NotNull
    public String getOperation() {
        return "";
    }

    @Override // io.sentry.ISpan
    @Nullable
    public TracesSamplingDecision getSamplingDecision() {
        return null;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public SpanContext getSpanContext() {
        return new SpanContext(SentryId.EMPTY_ID, SpanId.EMPTY_ID, "op", null, null);
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public List<Span> getSpans() {
        return Collections.EMPTY_LIST;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public SentryDate getStartDate() {
        return new SentryNanotimeDate();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public SpanStatus getStatus() {
        return null;
    }

    @Override // io.sentry.ISpan
    @Nullable
    public String getTag(@Nullable String str) {
        return null;
    }

    @Override // io.sentry.ISpan
    @Nullable
    public Throwable getThrowable() {
        return null;
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public TransactionNameSource getTransactionNameSource() {
        return TransactionNameSource.CUSTOM;
    }

    @Override // io.sentry.ISpan
    public boolean isFinished() {
        return true;
    }

    @Override // io.sentry.ISpan
    public boolean isNoOp() {
        return true;
    }

    @Override // io.sentry.ITransaction
    @Nullable
    public Boolean isProfileSampled() {
        return null;
    }

    @Override // io.sentry.ISpan
    @Nullable
    public Boolean isSampled() {
        return null;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISentryLifecycleToken makeCurrent() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(@NotNull String str, @NotNull Number number) {
    }

    @Override // io.sentry.ITransaction
    public void setName(@NotNull String str) {
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpan
    @Nullable
    public BaggageHeader toBaggageHeader(@Nullable List<String> list) {
        return null;
    }

    @Override // io.sentry.ISpan
    @NotNull
    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(SentryId.EMPTY_ID, SpanId.EMPTY_ID, Boolean.FALSE);
    }

    @Override // io.sentry.ISpan
    @NotNull
    public TraceContext traceContext() {
        return new TraceContext(SentryId.EMPTY_ID, "");
    }

    @Override // io.sentry.ISpan
    public boolean updateEndDate(@NotNull SentryDate sentryDate) {
        return false;
    }

    @Override // io.sentry.ISpan
    public void finish(@Nullable SpanStatus spanStatus) {
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(@NotNull String str, @NotNull Number number, @NotNull MeasurementUnit measurementUnit) {
    }

    @Override // io.sentry.ITransaction
    public void setName(@NotNull String str, @NotNull TransactionNameSource transactionNameSource) {
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @NotNull SpanOptions spanOptions) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpan
    public void finish(@Nullable SpanStatus spanStatus, @Nullable SentryDate sentryDate) {
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull SpanContext spanContext, @NotNull SpanOptions spanOptions) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ITransaction
    public void finish(@Nullable SpanStatus spanStatus, @Nullable SentryDate sentryDate, boolean z5, @Nullable Hint hint) {
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate, @NotNull Instrumenter instrumenter, @NotNull SpanOptions spanOptions) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpan
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ITransaction
    @NotNull
    public ISpan startChild(@NotNull String str, @Nullable String str2, @Nullable SentryDate sentryDate) {
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ITransaction
    public void scheduleFinish() {
    }

    @Override // io.sentry.ISpan
    public void setDescription(@Nullable String str) {
    }

    @Override // io.sentry.ISpan
    public void setOperation(@NotNull String str) {
    }

    @Override // io.sentry.ISpan
    public void setStatus(@Nullable SpanStatus spanStatus) {
    }

    @Override // io.sentry.ISpan
    public void setThrowable(@Nullable Throwable th2) {
    }

    @Override // io.sentry.ISpan
    public void addFeatureFlag(@Nullable String str, @Nullable Boolean bool) {
    }

    @Override // io.sentry.ISpan
    public void setContext(@Nullable String str, @Nullable Object obj) {
    }

    @Override // io.sentry.ISpan
    public void setData(@Nullable String str, @Nullable Object obj) {
    }

    @Override // io.sentry.ISpan
    public void setTag(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.ITransaction
    public void forceFinish(@NotNull SpanStatus spanStatus, boolean z5, @Nullable Hint hint) {
    }
}
