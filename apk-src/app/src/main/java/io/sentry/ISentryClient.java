package io.sentry;

import io.sentry.protocol.Feedback;
import io.sentry.protocol.Message;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.RateLimiter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ISentryClient {
    void captureBatchedLogEvents(@NotNull SentryLogEvents sentryLogEvents);

    void captureBatchedMetricsEvents(@NotNull SentryMetricsEvents sentryMetricsEvents);

    @NotNull
    SentryId captureCheckIn(@NotNull CheckIn checkIn, @Nullable IScope iScope, @Nullable Hint hint);

    @Nullable
    default SentryId captureEnvelope(@NotNull SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, null);
    }

    @Nullable
    SentryId captureEnvelope(@NotNull SentryEnvelope sentryEnvelope, @Nullable Hint hint);

    @NotNull
    default SentryId captureEvent(@NotNull SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, null, null);
    }

    @NotNull
    SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable IScope iScope, @Nullable Hint hint);

    @NotNull
    default SentryId captureException(@NotNull Throwable th2) {
        return captureException(th2, null, null);
    }

    @NotNull
    SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint, @NotNull IScope iScope);

    void captureLog(@NotNull SentryLogEvent sentryLogEvent, @Nullable IScope iScope);

    @NotNull
    default SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel, @Nullable IScope iScope) {
        SentryEvent sentryEvent = new SentryEvent();
        Message message = new Message();
        message.setFormatted(str);
        sentryEvent.setMessage(message);
        sentryEvent.setLevel(sentryLevel);
        return captureEvent(sentryEvent, iScope);
    }

    void captureMetric(@NotNull SentryMetricsEvent sentryMetricsEvent, @Nullable IScope iScope, @Nullable Hint hint);

    @NotNull
    SentryId captureProfileChunk(@NotNull ProfileChunk profileChunk, @Nullable IScope iScope);

    @NotNull
    SentryId captureReplayEvent(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable IScope iScope, @Nullable Hint hint);

    default void captureSession(@NotNull Session session) {
        captureSession(session, null);
    }

    void captureSession(@NotNull Session session, @Nullable Hint hint);

    @NotNull
    default SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable IScope iScope, @Nullable Hint hint) {
        return captureTransaction(sentryTransaction, null, iScope, hint);
    }

    @NotNull
    SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext, @Nullable IScope iScope, @Nullable Hint hint, @Nullable ProfilingTraceData profilingTraceData);

    @Deprecated
    void captureUserFeedback(@NotNull UserFeedback userFeedback);

    void close();

    void close(boolean z5);

    void flush(long j10);

    @Nullable
    RateLimiter getRateLimiter();

    boolean isEnabled();

    default boolean isHealthy() {
        return true;
    }

    @NotNull
    default SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable IScope iScope) {
        return captureEvent(sentryEvent, iScope, null);
    }

    @NotNull
    default SentryId captureException(@NotNull Throwable th2, @Nullable IScope iScope, @Nullable Hint hint) {
        return captureEvent(new SentryEvent(th2), iScope, hint);
    }

    @NotNull
    default SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext, @Nullable IScope iScope, @Nullable Hint hint) {
        return captureTransaction(sentryTransaction, traceContext, iScope, hint, null);
    }

    @NotNull
    default SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable Hint hint) {
        return captureEvent(sentryEvent, null, hint);
    }

    @NotNull
    default SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext) {
        return captureTransaction(sentryTransaction, traceContext, null, null);
    }

    @NotNull
    default SentryId captureException(@NotNull Throwable th2, @Nullable Hint hint) {
        return captureException(th2, null, hint);
    }

    @NotNull
    default SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction) {
        return captureTransaction(sentryTransaction, null, null, null);
    }

    @NotNull
    default SentryId captureException(@NotNull Throwable th2, @Nullable IScope iScope) {
        return captureException(th2, iScope, null);
    }

    @NotNull
    default SentryId captureMessage(@NotNull String str, @NotNull SentryLevel sentryLevel) {
        return captureMessage(str, sentryLevel, null);
    }
}
