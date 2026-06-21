package io.sentry;

import io.sentry.logger.ILoggerApi;
import io.sentry.metrics.IMetricsApi;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ScopesAdapter implements IScopes {
    private static final ScopesAdapter INSTANCE = new ScopesAdapter();

    private ScopesAdapter() {
    }

    public static ScopesAdapter getInstance() {
        return INSTANCE;
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb, @Nullable Hint hint) {
        Sentry.addBreadcrumb(breadcrumb, hint);
    }

    @Override // io.sentry.IScopes
    public void addFeatureFlag(@Nullable String str, @Nullable Boolean bool) {
        Sentry.addFeatureFlag(str, bool);
    }

    @Override // io.sentry.IScopes
    public void bindClient(@NotNull ISentryClient iSentryClient) {
        Sentry.bindClient(iSentryClient);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureCheckIn(@NotNull CheckIn checkIn) {
        return Sentry.captureCheckIn(checkIn);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureEnvelope(@NotNull SentryEnvelope sentryEnvelope, @Nullable Hint hint) {
        return Sentry.getCurrentScopes().captureEnvelope(sentryEnvelope, hint);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint) {
        return Sentry.captureEvent(sentryEvent, hint);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint) {
        return Sentry.captureException(th2, hint);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureFeedback(@NotNull Feedback feedback) {
        return Sentry.feedback().capture(feedback);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel) {
        return Sentry.captureMessage(str, sentryLevel);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureProfileChunk(@NotNull ProfileChunk profileChunk) {
        return Sentry.getCurrentScopes().captureProfileChunk(profileChunk);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureReplay(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable Hint hint) {
        return Sentry.getCurrentScopes().captureReplay(sentryReplayEvent, hint);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext, @Nullable Hint hint, @Nullable ProfilingTraceData profilingTraceData) {
        return Sentry.getCurrentScopes().captureTransaction(sentryTransaction, traceContext, hint, profilingTraceData);
    }

    @Override // io.sentry.IScopes
    @Deprecated
    public void captureUserFeedback(@NotNull UserFeedback userFeedback) {
        Sentry.captureUserFeedback(userFeedback);
    }

    @Override // io.sentry.IScopes
    public void clearBreadcrumbs() {
        Sentry.clearBreadcrumbs();
    }

    @Override // io.sentry.IScopes
    public void close(boolean z5) {
        Sentry.close();
    }

    @Override // io.sentry.IScopes
    public void configureScope(@Nullable ScopeType scopeType, @NotNull ScopeCallback scopeCallback) {
        Sentry.configureScope(scopeType, scopeCallback);
    }

    @Override // io.sentry.IScopes
    @Nullable
    public TransactionContext continueTrace(@Nullable String str, @Nullable List<String> list) {
        return Sentry.continueTrace(str, list);
    }

    @Override // io.sentry.IScopes
    public void endSession() {
        Sentry.endSession();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IFeedbackApi feedback() {
        return Sentry.getCurrentScopes().feedback();
    }

    @Override // io.sentry.IScopes
    public void flush(long j10) {
        Sentry.flush(j10);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScopes forkedCurrentScope(@NotNull String str) {
        return Sentry.forkedCurrentScope(str);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScopes forkedRootScopes(@NotNull String str) {
        return Sentry.forkedRootScopes(str);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScopes forkedScopes(@NotNull String str) {
        return Sentry.forkedScopes(str);
    }

    @Override // io.sentry.IScopes
    @Nullable
    public BaggageHeader getBaggage() {
        return Sentry.getBaggage();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScope getGlobalScope() {
        return Sentry.getGlobalScope();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScope getIsolationScope() {
        return Sentry.getCurrentScopes().getIsolationScope();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId getLastEventId() {
        return Sentry.getLastEventId();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryOptions getOptions() {
        return Sentry.getCurrentScopes().getOptions();
    }

    @Override // io.sentry.IScopes
    @Nullable
    public IScopes getParentScopes() {
        return Sentry.getCurrentScopes().getParentScopes();
    }

    @Override // io.sentry.IScopes
    @Nullable
    public RateLimiter getRateLimiter() {
        return Sentry.getCurrentScopes().getRateLimiter();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IScope getScope() {
        return Sentry.getCurrentScopes().getScope();
    }

    @Override // io.sentry.IScopes
    @Nullable
    public ISpan getSpan() {
        return Sentry.getCurrentScopes().getSpan();
    }

    @Override // io.sentry.IScopes
    @Nullable
    public SentryTraceHeader getTraceparent() {
        return Sentry.getTraceparent();
    }

    @Override // io.sentry.IScopes
    @Nullable
    public ITransaction getTransaction() {
        return Sentry.getCurrentScopes().getTransaction();
    }

    @Override // io.sentry.IScopes
    public boolean isAncestorOf(@Nullable IScopes iScopes) {
        return Sentry.getCurrentScopes().isAncestorOf(iScopes);
    }

    @Override // io.sentry.IScopes
    @Nullable
    public Boolean isCrashedLastRun() {
        return Sentry.isCrashedLastRun();
    }

    @Override // io.sentry.IScopes
    public boolean isEnabled() {
        return Sentry.isEnabled();
    }

    @Override // io.sentry.IScopes
    public boolean isHealthy() {
        return Sentry.isHealthy();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ILoggerApi logger() {
        return Sentry.getCurrentScopes().logger();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ISentryLifecycleToken makeCurrent() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public IMetricsApi metrics() {
        return Sentry.getCurrentScopes().metrics();
    }

    @Override // io.sentry.IScopes
    @Deprecated
    public void popScope() {
        Sentry.popScope();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ISentryLifecycleToken pushIsolationScope() {
        return Sentry.pushIsolationScope();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ISentryLifecycleToken pushScope() {
        return Sentry.pushScope();
    }

    @Override // io.sentry.IScopes
    public void removeAttribute(@Nullable String str) {
        Sentry.removeAttribute(str);
    }

    @Override // io.sentry.IScopes
    public void removeExtra(@Nullable String str) {
        Sentry.removeExtra(str);
    }

    @Override // io.sentry.IScopes
    public void removeTag(@Nullable String str) {
        Sentry.removeTag(str);
    }

    @Override // io.sentry.IScopes
    public void reportFullyDisplayed() {
        Sentry.reportFullyDisplayed();
    }

    @Override // io.sentry.IScopes
    public void setActiveSpan(@Nullable ISpan iSpan) {
        Sentry.getCurrentScopes().setActiveSpan(iSpan);
    }

    @Override // io.sentry.IScopes
    public void setAttribute(@Nullable String str, @Nullable Object obj) {
        Sentry.setAttribute(str, obj);
    }

    @Override // io.sentry.IScopes
    public void setAttributes(@Nullable SentryAttributes sentryAttributes) {
        Sentry.setAttributes(sentryAttributes);
    }

    @Override // io.sentry.IScopes
    public void setExtra(@Nullable String str, @Nullable String str2) {
        Sentry.setExtra(str, str2);
    }

    @Override // io.sentry.IScopes
    public void setFingerprint(@NotNull List<String> list) {
        Sentry.setFingerprint(list);
    }

    @Override // io.sentry.IScopes
    public void setLevel(@Nullable SentryLevel sentryLevel) {
        Sentry.setLevel(sentryLevel);
    }

    @Override // io.sentry.IScopes
    public void setSpanContext(@NotNull Throwable th2, @NotNull ISpan iSpan, @NotNull String str) {
        Sentry.getCurrentScopes().setSpanContext(th2, iSpan, str);
    }

    @Override // io.sentry.IScopes
    public void setTag(@Nullable String str, @Nullable String str2) {
        Sentry.setTag(str, str2);
    }

    @Override // io.sentry.IScopes
    public void setTransaction(@Nullable String str) {
        Sentry.setTransaction(str);
    }

    @Override // io.sentry.IScopes
    public void setUser(@Nullable User user) {
        Sentry.setUser(user);
    }

    @Override // io.sentry.IScopes
    public void startProfiler() {
        Sentry.startProfiler();
    }

    @Override // io.sentry.IScopes
    public void startSession() {
        Sentry.startSession();
    }

    @Override // io.sentry.IScopes
    @NotNull
    public ITransaction startTransaction(@NotNull TransactionContext transactionContext, @NotNull TransactionOptions transactionOptions) {
        return Sentry.startTransaction(transactionContext, transactionOptions);
    }

    @Override // io.sentry.IScopes
    public void stopProfiler() {
        Sentry.stopProfiler();
    }

    @Override // io.sentry.IScopes
    public void withIsolationScope(@NotNull ScopeCallback scopeCallback) {
        Sentry.withIsolationScope(scopeCallback);
    }

    @Override // io.sentry.IScopes
    public void withScope(@NotNull ScopeCallback scopeCallback) {
        Sentry.withScope(scopeCallback);
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(@NotNull Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, new Hint());
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint, @NotNull ScopeCallback scopeCallback) {
        return Sentry.captureEvent(sentryEvent, hint, scopeCallback);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint, @NotNull ScopeCallback scopeCallback) {
        return Sentry.captureException(th2, hint, scopeCallback);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint) {
        return Sentry.feedback().capture(feedback, hint);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel, @NotNull ScopeCallback scopeCallback) {
        return Sentry.captureMessage(str, sentryLevel, scopeCallback);
    }

    @Override // io.sentry.IScopes
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IHub m609clone() {
        return Sentry.getCurrentScopes().m603clone();
    }

    @Override // io.sentry.IScopes
    public void close() {
        Sentry.close();
    }

    @Override // io.sentry.IScopes
    public void setAttribute(@Nullable SentryAttribute sentryAttribute) {
        Sentry.setAttribute(sentryAttribute);
    }

    @Override // io.sentry.IScopes
    @NotNull
    public SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint, @Nullable ScopeCallback scopeCallback) {
        return Sentry.feedback().capture(feedback, hint, scopeCallback);
    }
}
