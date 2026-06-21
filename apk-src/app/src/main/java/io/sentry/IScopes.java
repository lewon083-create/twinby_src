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
public interface IScopes {
    void addBreadcrumb(@NotNull Breadcrumb breadcrumb);

    void addBreadcrumb(@NotNull Breadcrumb breadcrumb, @Nullable Hint hint);

    default void addBreadcrumb(@NotNull String str) {
        addBreadcrumb(new Breadcrumb(str));
    }

    void addFeatureFlag(@Nullable String str, @Nullable Boolean bool);

    void bindClient(@NotNull ISentryClient iSentryClient);

    @NotNull
    SentryId captureCheckIn(@NotNull CheckIn checkIn);

    @NotNull
    default SentryId captureEnvelope(@NotNull SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, new Hint());
    }

    @NotNull
    SentryId captureEnvelope(@NotNull SentryEnvelope sentryEnvelope, @Nullable Hint hint);

    @NotNull
    default SentryId captureEvent(@NotNull SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, new Hint());
    }

    @NotNull
    SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint);

    @NotNull
    SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint, @NotNull ScopeCallback scopeCallback);

    @NotNull
    default SentryId captureException(@NotNull Throwable th2) {
        return captureException(th2, new Hint());
    }

    @NotNull
    SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint);

    @NotNull
    SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint, @NotNull ScopeCallback scopeCallback);

    @NotNull
    default SentryId captureFeedback(@NotNull Feedback feedback) {
        return captureFeedback(feedback, null);
    }

    @NotNull
    SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint, @Nullable ScopeCallback scopeCallback);

    @NotNull
    default SentryId captureMessage(@NotNull String str) {
        return captureMessage(str, SentryLevel.INFO);
    }

    @NotNull
    SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel);

    @NotNull
    SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel, @NotNull ScopeCallback scopeCallback);

    @NotNull
    SentryId captureProfileChunk(@NotNull ProfileChunk profileChunk);

    @NotNull
    SentryId captureReplay(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable Hint hint);

    @NotNull
    default SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext, @Nullable Hint hint) {
        return captureTransaction(sentryTransaction, traceContext, hint, null);
    }

    @NotNull
    SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext, @Nullable Hint hint, @Nullable ProfilingTraceData profilingTraceData);

    @Deprecated
    void captureUserFeedback(@NotNull UserFeedback userFeedback);

    void clearBreadcrumbs();

    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: clone */
    IHub m609clone();

    void close();

    void close(boolean z5);

    default void configureScope(@NotNull ScopeCallback scopeCallback) {
        configureScope(null, scopeCallback);
    }

    void configureScope(@Nullable ScopeType scopeType, @NotNull ScopeCallback scopeCallback);

    @Nullable
    TransactionContext continueTrace(@Nullable String str, @Nullable List<String> list);

    void endSession();

    @NotNull
    IFeedbackApi feedback();

    void flush(long j10);

    @NotNull
    IScopes forkedCurrentScope(@NotNull String str);

    @NotNull
    IScopes forkedRootScopes(@NotNull String str);

    @NotNull
    IScopes forkedScopes(@NotNull String str);

    @Nullable
    BaggageHeader getBaggage();

    @NotNull
    IScope getGlobalScope();

    @NotNull
    IScope getIsolationScope();

    @NotNull
    SentryId getLastEventId();

    @NotNull
    SentryOptions getOptions();

    @Nullable
    IScopes getParentScopes();

    @Nullable
    RateLimiter getRateLimiter();

    @NotNull
    IScope getScope();

    @Nullable
    ISpan getSpan();

    @Nullable
    SentryTraceHeader getTraceparent();

    @Nullable
    ITransaction getTransaction();

    boolean isAncestorOf(@Nullable IScopes iScopes);

    @Nullable
    Boolean isCrashedLastRun();

    boolean isEnabled();

    boolean isHealthy();

    default boolean isNoOp() {
        return false;
    }

    @NotNull
    ILoggerApi logger();

    @NotNull
    ISentryLifecycleToken makeCurrent();

    @NotNull
    IMetricsApi metrics();

    @Deprecated
    void popScope();

    @NotNull
    ISentryLifecycleToken pushIsolationScope();

    @NotNull
    ISentryLifecycleToken pushScope();

    void removeAttribute(@Nullable String str);

    void removeExtra(@Nullable String str);

    void removeTag(@Nullable String str);

    void reportFullyDisplayed();

    void setActiveSpan(@Nullable ISpan iSpan);

    void setAttribute(@Nullable SentryAttribute sentryAttribute);

    void setAttribute(@Nullable String str, @Nullable Object obj);

    void setAttributes(@Nullable SentryAttributes sentryAttributes);

    void setExtra(@Nullable String str, @Nullable String str2);

    void setFingerprint(@NotNull List<String> list);

    void setLevel(@Nullable SentryLevel sentryLevel);

    void setSpanContext(@NotNull Throwable th2, @NotNull ISpan iSpan, @NotNull String str);

    void setTag(@Nullable String str, @Nullable String str2);

    void setTransaction(@Nullable String str);

    void setUser(@Nullable User user);

    void startProfiler();

    void startSession();

    @NotNull
    default ITransaction startTransaction(@NotNull TransactionContext transactionContext) {
        return startTransaction(transactionContext, new TransactionOptions());
    }

    @NotNull
    ITransaction startTransaction(@NotNull TransactionContext transactionContext, @NotNull TransactionOptions transactionOptions);

    void stopProfiler();

    void withIsolationScope(@NotNull ScopeCallback scopeCallback);

    void withScope(@NotNull ScopeCallback scopeCallback);

    default void addBreadcrumb(@NotNull String str, @NotNull String str2) {
        Breadcrumb breadcrumb = new Breadcrumb(str);
        breadcrumb.setCategory(str2);
        addBreadcrumb(breadcrumb);
    }

    @NotNull
    default SentryId captureEvent(@NotNull SentryEvent sentryEvent, @NotNull ScopeCallback scopeCallback) {
        return captureEvent(sentryEvent, new Hint(), scopeCallback);
    }

    @NotNull
    default SentryId captureException(@NotNull Throwable th2, @NotNull ScopeCallback scopeCallback) {
        return captureException(th2, new Hint(), scopeCallback);
    }

    @NotNull
    default SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint) {
        return captureFeedback(feedback, hint, null);
    }

    @NotNull
    default SentryId captureMessage(@NotNull String str, @NotNull ScopeCallback scopeCallback) {
        return captureMessage(str, SentryLevel.INFO, scopeCallback);
    }

    @NotNull
    default SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable Hint hint) {
        return captureTransaction(sentryTransaction, null, hint);
    }

    @NotNull
    default ITransaction startTransaction(@NotNull String str, @NotNull String str2) {
        return startTransaction(str, str2, new TransactionOptions());
    }

    @NotNull
    default SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext) {
        return captureTransaction(sentryTransaction, traceContext, null);
    }

    @NotNull
    default ITransaction startTransaction(@NotNull String str, @NotNull String str2, @NotNull TransactionOptions transactionOptions) {
        return startTransaction(new TransactionContext(str, str2), transactionOptions);
    }
}
