package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryLongDate extends SentryDate {
    private final long nanos;

    public SentryLongDate(long j10) {
        this.nanos = j10;
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return this.nanos;
    }
}
