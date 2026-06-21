package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryFramesDelayResult {
    private final double delaySeconds;
    private final int framesContributingToDelayCount;

    public SentryFramesDelayResult(double d10, int i) {
        this.delaySeconds = d10;
        this.framesContributingToDelayCount = i;
    }

    public double getDelaySeconds() {
        return this.delaySeconds;
    }

    public int getFramesContributingToDelayCount() {
        return this.framesContributingToDelayCount;
    }
}
