package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f12678d = new ThreadLocal();

    public yo0() {
        b(0L);
    }

    public final synchronized long a() {
        long j10 = this.f12675a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized void b(long j10) {
        this.f12675a = j10;
        this.f12676b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f12677c = -9223372036854775807L;
    }

    public final synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f12677c;
            if (j11 != -9223372036854775807L) {
                long jU = cq0.u(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = (4294967296L + jU) / 8589934592L;
                long j13 = (((-1) + j12) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                j10 = Math.abs(j13 - jU) < Math.abs(j14 - jU) ? j13 : j14;
            }
            return e(cq0.u(j10, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long d(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f12677c;
            if (j11 != -9223372036854775807L) {
                long jU = cq0.u(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = jU / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 = j13 >= jU ? j13 : ((j12 + 1) * 8589934592L) + j10;
            }
            return e(cq0.u(j10, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long e(long j10) {
        long j11;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f12676b != -9223372036854775807L)) {
                    long jLongValue = this.f12675a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l10 = (Long) this.f12678d.get();
                        if (l10 == null) {
                            throw null;
                        }
                        jLongValue = l10.longValue();
                    }
                    this.f12676b = jLongValue - j10;
                    notifyAll();
                }
                this.f12677c = j10;
                j11 = j10 + this.f12676b;
            }
            return j11;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
