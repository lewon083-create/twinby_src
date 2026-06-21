package io.sentry;

import java.time.Instant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryInstantDate extends SentryDate {

    @NotNull
    private final Instant date;

    public SentryInstantDate() {
        this(Instant.now());
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return DateUtils.secondsToNanos(this.date.getEpochSecond()) + ((long) this.date.getNano());
    }

    public SentryInstantDate(@NotNull Instant instant) {
        this.date = instant;
    }
}
