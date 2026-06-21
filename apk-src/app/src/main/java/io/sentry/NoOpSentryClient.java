package io.sentry;

import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.RateLimiter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class NoOpSentryClient implements ISentryClient {
    private static final NoOpSentryClient instance = new NoOpSentryClient();

    private NoOpSentryClient() {
    }

    public static NoOpSentryClient getInstance() {
        return instance;
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureCheckIn(@NotNull CheckIn checkIn, @Nullable IScope iScope, @Nullable Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureEnvelope(@NotNull SentryEnvelope sentryEnvelope, @Nullable Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureEvent(@NotNull SentryEvent sentryEvent, @Nullable IScope iScope, @Nullable Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureFeedback(@NotNull Feedback feedback, @Nullable Hint hint, @NotNull IScope iScope) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureProfileChunk(@NotNull ProfileChunk profileChunk, @Nullable IScope iScope) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureReplayEvent(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable IScope iScope, @Nullable Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    @NotNull
    public SentryId captureTransaction(@NotNull SentryTransaction sentryTransaction, @Nullable TraceContext traceContext, @Nullable IScope iScope, @Nullable Hint hint, @Nullable ProfilingTraceData profilingTraceData) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    public void close() {
    }

    @Override // io.sentry.ISentryClient
    @Nullable
    public RateLimiter getRateLimiter() {
        return null;
    }

    @Override // io.sentry.ISentryClient
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.ISentryClient
    public void close(boolean z5) {
    }

    @Override // io.sentry.ISentryClient
    public void captureBatchedLogEvents(@NotNull SentryLogEvents sentryLogEvents) {
    }

    @Override // io.sentry.ISentryClient
    public void captureBatchedMetricsEvents(@NotNull SentryMetricsEvents sentryMetricsEvents) {
    }

    @Override // io.sentry.ISentryClient
    @Deprecated
    public void captureUserFeedback(@NotNull UserFeedback userFeedback) {
    }

    @Override // io.sentry.ISentryClient
    public void flush(long j10) {
    }

    @Override // io.sentry.ISentryClient
    public void captureLog(@NotNull SentryLogEvent sentryLogEvent, @Nullable IScope iScope) {
    }

    @Override // io.sentry.ISentryClient
    public void captureSession(@NotNull Session session, @Nullable Hint hint) {
    }

    @Override // io.sentry.ISentryClient
    public void captureMetric(@NotNull SentryMetricsEvent sentryMetricsEvent, @Nullable IScope iScope, @Nullable Hint hint) {
    }
}
