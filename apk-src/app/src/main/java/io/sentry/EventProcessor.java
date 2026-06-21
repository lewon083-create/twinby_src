package io.sentry;

import io.sentry.protocol.SentryTransaction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface EventProcessor {
    @Nullable
    default Long getOrder() {
        return null;
    }

    @Nullable
    default SentryEvent process(@NotNull SentryEvent sentryEvent, @NotNull Hint hint) {
        return sentryEvent;
    }

    @Nullable
    default SentryLogEvent process(@NotNull SentryLogEvent sentryLogEvent) {
        return sentryLogEvent;
    }

    @Nullable
    default SentryMetricsEvent process(@NotNull SentryMetricsEvent sentryMetricsEvent, @NotNull Hint hint) {
        return sentryMetricsEvent;
    }

    @Nullable
    default SentryReplayEvent process(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull Hint hint) {
        return sentryReplayEvent;
    }

    @Nullable
    default SentryTransaction process(@NotNull SentryTransaction sentryTransaction, @NotNull Hint hint) {
        return sentryTransaction;
    }
}
