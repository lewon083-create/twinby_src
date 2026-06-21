package io.sentry.android.core;

import android.net.TrafficStats;
import io.sentry.ISocketTagger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidSocketTagger implements ISocketTagger {
    private static final int SENTRY_TAG = 61441;
    private static final AndroidSocketTagger instance = new AndroidSocketTagger();

    private AndroidSocketTagger() {
    }

    public static AndroidSocketTagger getInstance() {
        return instance;
    }

    @Override // io.sentry.ISocketTagger
    public void tagSockets() {
        TrafficStats.setThreadStatsTag(SENTRY_TAG);
    }

    @Override // io.sentry.ISocketTagger
    public void untagSockets() {
        TrafficStats.clearThreadStatsTag();
    }
}
