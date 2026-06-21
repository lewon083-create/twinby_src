package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.DateUtils;
import io.sentry.SentryDate;
import io.sentry.SentryLongDate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class TimeSpan implements Comparable<TimeSpan> {

    @Nullable
    private String description;
    private long startUnixTimeMs;
    private long startUptimeMs;
    private long stopUptimeMs;

    @Nullable
    public String getDescription() {
        return this.description;
    }

    public long getDurationMs() {
        if (hasStopped()) {
            return this.stopUptimeMs - this.startUptimeMs;
        }
        return 0L;
    }

    @Nullable
    public SentryDate getProjectedStopTimestamp() {
        if (hasStopped()) {
            return new SentryLongDate(DateUtils.millisToNanos(getProjectedStopTimestampMs()));
        }
        return null;
    }

    public long getProjectedStopTimestampMs() {
        if (!hasStarted()) {
            return 0L;
        }
        return getDurationMs() + this.startUnixTimeMs;
    }

    public double getProjectedStopTimestampSecs() {
        return DateUtils.millisToSeconds(getProjectedStopTimestampMs());
    }

    @Nullable
    public SentryDate getStartTimestamp() {
        if (hasStarted()) {
            return new SentryLongDate(DateUtils.millisToNanos(getStartTimestampMs()));
        }
        return null;
    }

    public long getStartTimestampMs() {
        return this.startUnixTimeMs;
    }

    public double getStartTimestampSecs() {
        return DateUtils.millisToSeconds(this.startUnixTimeMs);
    }

    public long getStartUptimeMs() {
        return this.startUptimeMs;
    }

    public boolean hasNotStarted() {
        return this.startUptimeMs == 0;
    }

    public boolean hasNotStopped() {
        return this.stopUptimeMs == 0;
    }

    public boolean hasStarted() {
        return this.startUptimeMs != 0;
    }

    public boolean hasStopped() {
        return this.stopUptimeMs != 0;
    }

    public void reset() {
        this.description = null;
        this.startUptimeMs = 0L;
        this.stopUptimeMs = 0L;
        this.startUnixTimeMs = 0L;
    }

    public void setDescription(@Nullable String str) {
        this.description = str;
    }

    public void setStartUnixTimeMs(long j10) {
        this.startUnixTimeMs = j10;
    }

    public void setStartedAt(long j10) {
        this.startUptimeMs = j10;
        this.startUnixTimeMs = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.startUptimeMs);
    }

    public void setStoppedAt(long j10) {
        this.stopUptimeMs = j10;
    }

    public void setup(@Nullable String str, long j10, long j11, long j12) {
        this.description = str;
        this.startUnixTimeMs = j10;
        this.startUptimeMs = j11;
        this.stopUptimeMs = j12;
    }

    public void start() {
        this.startUptimeMs = SystemClock.uptimeMillis();
        this.startUnixTimeMs = System.currentTimeMillis();
    }

    public void stop() {
        this.stopUptimeMs = SystemClock.uptimeMillis();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull TimeSpan timeSpan) {
        return Long.compare(this.startUnixTimeMs, timeSpan.startUnixTimeMs);
    }
}
