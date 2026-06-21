package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class fx2 extends kx2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f38571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f38572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f38573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f38574h;
    public final long i;

    public fx2(rl2 rl2Var, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(rl2Var, j10, j11);
        this.f38570d = j12;
        this.f38571e = j13;
        this.f38572f = list;
        this.i = j14;
        this.f38573g = j15;
        this.f38574h = j16;
    }

    public abstract long a(long j10);

    public final long a(long j10, long j11) {
        if (a(j10) == -1) {
            long j12 = this.f38573g;
            if (j12 != -9223372036854775807L) {
                return Math.max(this.f38570d, c((j11 - this.f38574h) - j12, j10));
            }
        }
        return this.f38570d;
    }

    public abstract rl2 a(long j10, no2 no2Var);

    public final long b(long j10, long j11) {
        List list = this.f38572f;
        if (list != null) {
            return (((ix2) list.get((int) (j10 - this.f38570d))).f39666b * 1000000) / this.f40378b;
        }
        long jA = a(j11);
        return (jA == -1 || j10 != (this.f38570d + jA) - 1) ? (this.f38571e * 1000000) / this.f40378b : j11 - b(j10);
    }

    public final long c(long j10, long j11) {
        long j12 = this.f38570d;
        long jA = a(j11);
        if (jA != 0) {
            if (this.f38572f != null) {
                long j13 = (jA + j12) - 1;
                long j14 = j12;
                while (j14 <= j13) {
                    long j15 = ((j13 - j14) / 2) + j14;
                    long jB = b(j15);
                    if (jB < j10) {
                        j14 = j15 + 1;
                    } else {
                        if (jB <= j10) {
                            return j15;
                        }
                        j13 = j15 - 1;
                    }
                }
                return j14 == j12 ? j14 : j13;
            }
            long j16 = (j10 / ((this.f38571e * 1000000) / this.f40378b)) + this.f38570d;
            if (j16 >= j12) {
                return jA == -1 ? j16 : Math.min(j16, (j12 + jA) - 1);
            }
        }
        return j12;
    }

    public final long b(long j10) {
        long j11;
        List list = this.f38572f;
        if (list != null) {
            j11 = ((ix2) list.get((int) (j10 - this.f38570d))).f39665a - this.f40379c;
        } else {
            j11 = (j10 - this.f38570d) * this.f38571e;
        }
        return lb3.a(j11, 1000000L, this.f40378b);
    }

    public boolean b() {
        return this.f38572f != null;
    }
}
