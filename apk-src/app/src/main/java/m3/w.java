package m3;

import com.google.android.gms.internal.measurement.h5;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f28602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f28605d = new ThreadLocal();

    public w(long j10) {
        f(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long jLongValue = this.f28602a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f28605d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f28603b = jLongValue - j10;
                notifyAll();
            }
            this.f28604c = j10;
            return j10 + this.f28603b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f28604c;
            if (j11 != -9223372036854775807L) {
                String str = z.f28608a;
                long jU = z.U(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = (4294967296L + jU) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                j10 = Math.abs(j13 - jU) < Math.abs(j14 - jU) ? j13 : j14;
            }
            long j15 = j10;
            String str2 = z.f28608a;
            return a(z.U(j15, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f28604c;
            if (j11 != -9223372036854775807L) {
                String str = z.f28608a;
                long jU = z.U(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = jU / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 = j13 >= jU ? j13 : ((j12 + 1) * 8589934592L) + j10;
            }
            long j14 = j10;
            String str2 = z.f28608a;
            return a(z.U(j14, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long d() {
        long j10;
        j10 = this.f28602a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized boolean e() {
        return this.f28603b != -9223372036854775807L;
    }

    public final synchronized void f(long j10) {
        this.f28602a = j10;
        this.f28603b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f28604c = -9223372036854775807L;
    }

    public final synchronized void g(long j10, boolean z5) {
        try {
            h5.r(this.f28602a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z5) {
                this.f28605d.set(Long.valueOf(j10));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
