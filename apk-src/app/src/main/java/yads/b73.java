package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f36951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f36952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f36953d = new ThreadLocal();

    public b73(long j10) {
        c(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f36951b == -9223372036854775807L) {
                long jLongValue = this.f36950a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f36953d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f36951b = jLongValue - j10;
                notifyAll();
            }
            this.f36952c = j10;
            return j10 + this.f36951b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f36952c;
            if (j11 != -9223372036854775807L) {
                long j12 = (j11 * 90000) / 1000000;
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return a((j10 * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(long j10) {
        this.f36950a = j10;
        this.f36951b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f36952c = -9223372036854775807L;
    }

    public final synchronized long b() {
        return this.f36951b;
    }

    public final synchronized long a() {
        long j10;
        j10 = this.f36950a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }
}
