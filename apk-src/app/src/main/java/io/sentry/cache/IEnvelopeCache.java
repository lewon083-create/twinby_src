package io.sentry.cache;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IEnvelopeCache extends Iterable<SentryEnvelope> {
    void discard(@NotNull SentryEnvelope sentryEnvelope);

    @Deprecated
    default void store(@NotNull SentryEnvelope sentryEnvelope) {
        storeEnvelope(sentryEnvelope, new Hint());
    }

    @Deprecated
    void store(@NotNull SentryEnvelope sentryEnvelope, @NotNull Hint hint);

    default boolean storeEnvelope(@NotNull SentryEnvelope sentryEnvelope, @NotNull Hint hint) {
        store(sentryEnvelope, hint);
        return true;
    }
}
