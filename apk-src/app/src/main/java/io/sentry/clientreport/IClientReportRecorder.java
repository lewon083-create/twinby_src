package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IClientReportRecorder {
    @NotNull
    SentryEnvelope attachReportToEnvelope(@NotNull SentryEnvelope sentryEnvelope);

    void recordLostEnvelope(@NotNull DiscardReason discardReason, @Nullable SentryEnvelope sentryEnvelope);

    void recordLostEnvelopeItem(@NotNull DiscardReason discardReason, @Nullable SentryEnvelopeItem sentryEnvelopeItem);

    void recordLostEvent(@NotNull DiscardReason discardReason, @NotNull DataCategory dataCategory);

    void recordLostEvent(@NotNull DiscardReason discardReason, @NotNull DataCategory dataCategory, long j10);
}
