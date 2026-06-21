package io.sentry;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryNanotimeDate extends SentryDate {

    @NotNull
    private final Date date;
    private final long nanos;

    public SentryNanotimeDate() {
        this(DateUtils.getCurrentDateTime(), System.nanoTime());
    }

    private long nanotimeDiff(@NotNull SentryNanotimeDate sentryNanotimeDate, @NotNull SentryNanotimeDate sentryNanotimeDate2) {
        return sentryNanotimeDate.nanoTimestamp() + (sentryNanotimeDate2.nanos - sentryNanotimeDate.nanos);
    }

    @Override // io.sentry.SentryDate
    public long diff(@NotNull SentryDate sentryDate) {
        return sentryDate instanceof SentryNanotimeDate ? this.nanos - ((SentryNanotimeDate) sentryDate).nanos : super.diff(sentryDate);
    }

    @Override // io.sentry.SentryDate
    public long laterDateNanosTimestampByDiff(@Nullable SentryDate sentryDate) {
        if (sentryDate == null || !(sentryDate instanceof SentryNanotimeDate)) {
            return super.laterDateNanosTimestampByDiff(sentryDate);
        }
        SentryNanotimeDate sentryNanotimeDate = (SentryNanotimeDate) sentryDate;
        return compareTo(sentryDate) < 0 ? nanotimeDiff(this, sentryNanotimeDate) : nanotimeDiff(sentryNanotimeDate, this);
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return DateUtils.dateToNanos(this.date);
    }

    public SentryNanotimeDate(@NotNull Date date, long j10) {
        this.date = date;
        this.nanos = j10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.sentry.SentryDate, java.lang.Comparable
    public int compareTo(@NotNull SentryDate sentryDate) {
        if (!(sentryDate instanceof SentryNanotimeDate)) {
            return super.compareTo(sentryDate);
        }
        SentryNanotimeDate sentryNanotimeDate = (SentryNanotimeDate) sentryDate;
        long time = this.date.getTime();
        long time2 = sentryNanotimeDate.date.getTime();
        return time == time2 ? Long.valueOf(this.nanos).compareTo(Long.valueOf(sentryNanotimeDate.nanos)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }
}
