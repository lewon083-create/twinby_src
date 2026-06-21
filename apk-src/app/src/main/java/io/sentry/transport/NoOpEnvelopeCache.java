package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import io.sentry.cache.IEnvelopeCache;
import java.util.Collections;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpEnvelopeCache implements IEnvelopeCache {
    private static final NoOpEnvelopeCache instance = new NoOpEnvelopeCache();

    public static NoOpEnvelopeCache getInstance() {
        return instance;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<SentryEnvelope> iterator() {
        return Collections.emptyIterator();
    }

    @Override // io.sentry.cache.IEnvelopeCache
    public boolean storeEnvelope(@NotNull SentryEnvelope sentryEnvelope, @NotNull Hint hint) {
        return false;
    }

    @Override // io.sentry.cache.IEnvelopeCache
    public void discard(@NotNull SentryEnvelope sentryEnvelope) {
    }

    @Override // io.sentry.cache.IEnvelopeCache
    public void store(@NotNull SentryEnvelope sentryEnvelope, @NotNull Hint hint) {
    }
}
