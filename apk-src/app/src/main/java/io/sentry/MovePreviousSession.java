package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class MovePreviousSession implements Runnable {

    @NotNull
    private final SentryOptions options;

    public MovePreviousSession(@NotNull SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.options.getCacheDirPath();
        if (cacheDirPath == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        IEnvelopeCache envelopeDiskCache = this.options.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof EnvelopeCache) {
            EnvelopeCache envelopeCache = (EnvelopeCache) envelopeDiskCache;
            envelopeCache.movePreviousSession(EnvelopeCache.getCurrentSessionFile(cacheDirPath), EnvelopeCache.getPreviousSessionFile(cacheDirPath));
            envelopeCache.flushPreviousSession();
        }
    }
}
