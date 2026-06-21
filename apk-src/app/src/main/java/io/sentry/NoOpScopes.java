package io.sentry;

import io.sentry.logger.ILoggerApi;
import io.sentry.logger.NoOpLoggerApi;
import io.sentry.metrics.IMetricsApi;
import io.sentry.metrics.NoOpMetricsApi;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import io.sentry.util.LazyEvaluator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpScopes implements IScopes {
    private static final NoOpScopes instance = new NoOpScopes();

    @NotNull
    private final LazyEvaluator<SentryOptions> emptyOptions = new LazyEvaluator<>(new g(1));

    private NoOpScopes() {
    }

    public static NoOpScopes getInstance() {
        return instance;
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb) {
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureCheckIn(@NotNull CheckIn checkIn) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureEnvelope(@NotNull SentryEnvelope sentryEnvelope, @Nullable Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint, @Nullable ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureProfileChunk(@NotNull ProfileChunk profileChunk) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureReplay(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext, @Nullable Hint hint, @Nullable ProfilingTraceData profilingTraceData) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public void close() {
    }

    @Override // io.sentry.IScopes
    @Nullable
    public TransactionContext continueTrace(@Nullable String str, @Nullable List<String> list) {
        return null;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IFeedbackApi feedback() {
        return NoOpFeedbackApi.getInstance();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScopes forkedCurrentScope(@NotNull String str) {
        return getInstance();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScopes forkedRootScopes(@NotNull String str) {
        return getInstance();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScopes forkedScopes(@NotNull String str) {
        return getInstance();
    }

    @Override // io.sentry.IScopes
    @Nullable
    public BaggageHeader getBaggage() {
        return null;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScope getGlobalScope() {
        return NoOpScope.getInstance();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScope getIsolationScope() {
        return NoOpScope.getInstance();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId getLastEventId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryOptions getOptions() {
        return this.emptyOptions.getValue();
    }

    @Override // io.sentry.IScopes
    @Nullable
    public IScopes getParentScopes() {
        return null;
    }

    @Override // io.sentry.IScopes
    @Nullable
    public RateLimiter getRateLimiter() {
        return null;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScope getScope() {
        return NoOpScope.getInstance();
    }

    @Override // io.sentry.IScopes
    @Nullable
    public ISpan getSpan() {
        return null;
    }

    @Override // io.sentry.IScopes
    @Nullable
    public SentryTraceHeader getTraceparent() {
        return null;
    }

    @Override // io.sentry.IScopes
    @Nullable
    public ITransaction getTransaction() {
        return null;
    }

    @Override // io.sentry.IScopes
    public boolean isAncestorOf(@Nullable IScopes iScopes) {
        return false;
    }

    @Override // io.sentry.IScopes
    @Nullable
    public Boolean isCrashedLastRun() {
        return null;
    }

    @Override // io.sentry.IScopes
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.IScopes
    public boolean isHealthy() {
        return true;
    }

    @Override // io.sentry.IScopes
    public boolean isNoOp() {
        return true;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ILoggerApi logger() {
        return NoOpLoggerApi.getInstance();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ISentryLifecycleToken makeCurrent() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IMetricsApi metrics() {
        return NoOpMetricsApi.getInstance();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ISentryLifecycleToken pushIsolationScope() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ISentryLifecycleToken pushScope() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    public void setAttribute(@Nullable SentryAttribute sentryAttribute) {
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ITransaction startTransaction(@NotNull TransactionContext transactionContext, @NotNull TransactionOptions transactionOptions) {
        return NoOpTransaction.getInstance();
    }

    @Override // io.sentry.IScopes
    public void withIsolationScope(@NotNull ScopeCallback scopeCallback) {
        scopeCallback.run(NoOpScope.getInstance());
    }

    @Override // io.sentry.IScopes
    public void withScope(@NotNull ScopeCallback scopeCallback) {
        scopeCallback.run(NoOpScope.getInstance());
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb, @Nullable Hint hint) {
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint, @NotNull ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint, @NotNull ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel, @NotNull ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IHub m606clone() {
        return NoOpHub.getInstance();
    }

    @Override // io.sentry.IScopes
    public void close(boolean z5) {
    }

    @Override // io.sentry.IScopes
    public void setAttribute(@Nullable String str, @Nullable Object obj) {
    }

    @Override // io.sentry.IScopes
    public void clearBreadcrumbs() {
    }

    @Override // io.sentry.IScopes
    public void endSession() {
    }

    @Override // io.sentry.IScopes
    @Deprecated
    public void popScope() {
    }

    @Override // io.sentry.IScopes
    public void reportFullyDisplayed() {
    }

    @Override // io.sentry.IScopes
    public void startProfiler() {
    }

    @Override // io.sentry.IScopes
    public void startSession() {
    }

    @Override // io.sentry.IScopes
    public void stopProfiler() {
    }

    @Override // io.sentry.IScopes
    public void bindClient(@NotNull ISentryClient iSentryClient) {
    }

    @Override // io.sentry.IScopes
    @Deprecated
    public void captureUserFeedback(@NotNull UserFeedback userFeedback) {
    }

    @Override // io.sentry.IScopes
    public void flush(long j10) {
    }

    @Override // io.sentry.IScopes
    public void removeAttribute(@Nullable String str) {
    }

    @Override // io.sentry.IScopes
    public void removeExtra(@Nullable String str) {
    }

    @Override // io.sentry.IScopes
    public void removeTag(@Nullable String str) {
    }

    @Override // io.sentry.IScopes
    public void setActiveSpan(@Nullable ISpan iSpan) {
    }

    @Override // io.sentry.IScopes
    public void setAttributes(@Nullable SentryAttributes sentryAttributes) {
    }

    @Override // io.sentry.IScopes
    public void setFingerprint(@NotNull List<String> list) {
    }

    @Override // io.sentry.IScopes
    public void setLevel(@Nullable SentryLevel sentryLevel) {
    }

    @Override // io.sentry.IScopes
    public void setTransaction(@Nullable String str) {
    }

    @Override // io.sentry.IScopes
    public void setUser(@Nullable User user) {
    }

    @Override // io.sentry.IScopes
    public void addFeatureFlag(@Nullable String str, @Nullable Boolean bool) {
    }

    @Override // io.sentry.IScopes
    public void configureScope(@Nullable ScopeType scopeType, @NotNull ScopeCallback scopeCallback) {
    }

    @Override // io.sentry.IScopes
    public void setExtra(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.IScopes
    public void setTag(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.IScopes
    public void setSpanContext(@NotNull Throwable th2, @NotNull ISpan iSpan, @NotNull String str) {
    }
}
