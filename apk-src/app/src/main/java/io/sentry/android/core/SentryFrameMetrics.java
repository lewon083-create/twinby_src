package io.sentry.android.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class SentryFrameMetrics {
    private int frozenFrameCount;
    private long frozenFrameDelayNanos;
    private int slowFrameCount;
    private long slowFrameDelayNanos;
    private long totalDurationNanos;

    public SentryFrameMetrics() {
    }

    public void addFrame(long j10, long j11, boolean z5, boolean z10) {
        this.totalDurationNanos += j10;
        if (z10) {
            this.frozenFrameDelayNanos += j11;
            this.frozenFrameCount++;
        } else if (z5) {
            this.slowFrameDelayNanos += j11;
            this.slowFrameCount++;
        }
    }

    public void clear() {
        this.slowFrameCount = 0;
        this.slowFrameDelayNanos = 0L;
        this.frozenFrameCount = 0;
        this.frozenFrameDelayNanos = 0L;
        this.totalDurationNanos = 0L;
    }

    public boolean containsValidData() {
        return this.slowFrameCount >= 0 && this.slowFrameDelayNanos >= 0 && this.frozenFrameCount >= 0 && this.frozenFrameDelayNanos >= 0 && this.totalDurationNanos >= 0;
    }

    @NotNull
    public SentryFrameMetrics diffTo(@NotNull SentryFrameMetrics sentryFrameMetrics) {
        return new SentryFrameMetrics(this.slowFrameCount - sentryFrameMetrics.slowFrameCount, this.slowFrameDelayNanos - sentryFrameMetrics.slowFrameDelayNanos, this.frozenFrameCount - sentryFrameMetrics.frozenFrameCount, this.frozenFrameDelayNanos - sentryFrameMetrics.frozenFrameDelayNanos, this.totalDurationNanos - sentryFrameMetrics.totalDurationNanos);
    }

    @NotNull
    public SentryFrameMetrics duplicate() {
        return new SentryFrameMetrics(this.slowFrameCount, this.slowFrameDelayNanos, this.frozenFrameCount, this.frozenFrameDelayNanos, this.totalDurationNanos);
    }

    public int getFrozenFrameCount() {
        return this.frozenFrameCount;
    }

    public long getFrozenFrameDelayNanos() {
        return this.frozenFrameDelayNanos;
    }

    public int getSlowFrameCount() {
        return this.slowFrameCount;
    }

    public long getSlowFrameDelayNanos() {
        return this.slowFrameDelayNanos;
    }

    public int getSlowFrozenFrameCount() {
        return this.slowFrameCount + this.frozenFrameCount;
    }

    public long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }

    public SentryFrameMetrics(int i, long j10, int i10, long j11, long j12) {
        this.slowFrameCount = i;
        this.slowFrameDelayNanos = j10;
        this.frozenFrameCount = i10;
        this.frozenFrameDelayNanos = j11;
        this.totalDurationNanos = j12;
    }
}
