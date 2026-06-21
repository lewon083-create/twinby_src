package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SentryDate implements Comparable<SentryDate> {
    public long diff(@NotNull SentryDate sentryDate) {
        return nanoTimestamp() - sentryDate.nanoTimestamp();
    }

    public final boolean isAfter(@NotNull SentryDate sentryDate) {
        return diff(sentryDate) > 0;
    }

    public final boolean isBefore(@NotNull SentryDate sentryDate) {
        return diff(sentryDate) < 0;
    }

    public long laterDateNanosTimestampByDiff(@Nullable SentryDate sentryDate) {
        return (sentryDate == null || compareTo(sentryDate) >= 0) ? nanoTimestamp() : sentryDate.nanoTimestamp();
    }

    public abstract long nanoTimestamp();

    @Override // java.lang.Comparable
    public int compareTo(@NotNull SentryDate sentryDate) {
        return Long.valueOf(nanoTimestamp()).compareTo(Long.valueOf(sentryDate.nanoTimestamp()));
    }
}
