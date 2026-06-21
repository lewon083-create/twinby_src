package yads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hx2 extends fx2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ya3 f39357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ya3 f39358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f39359l;

    public hx2(rl2 rl2Var, long j10, long j11, long j12, long j13, long j14, List list, long j15, ya3 ya3Var, ya3 ya3Var2, long j16, long j17) {
        super(rl2Var, j10, j11, j12, j14, list, j15, j16, j17);
        this.f39357j = ya3Var;
        this.f39358k = ya3Var2;
        this.f39359l = j13;
    }

    @Override // yads.kx2
    public final rl2 a(no2 no2Var) {
        ya3 ya3Var = this.f39357j;
        if (ya3Var == null) {
            return this.f40377a;
        }
        nx0 nx0Var = no2Var.f41309a;
        return new rl2(ya3Var.a(nx0Var.f41365b, 0L, nx0Var.i, 0L), 0L, -1L);
    }

    @Override // yads.fx2
    public final long a(long j10) {
        if (this.f38572f != null) {
            return r0.size();
        }
        long j11 = this.f39359l;
        if (j11 != -1) {
            return (j11 - this.f38570d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f40378b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f38571e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = kp.f40300a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // yads.fx2
    public final rl2 a(long j10, no2 no2Var) {
        long j11;
        List list = this.f38572f;
        if (list != null) {
            j11 = ((ix2) list.get((int) (j10 - this.f38570d))).f39665a;
        } else {
            j11 = (j10 - this.f38570d) * this.f38571e;
        }
        long j12 = j11;
        ya3 ya3Var = this.f39358k;
        nx0 nx0Var = no2Var.f41309a;
        return new rl2(ya3Var.a(nx0Var.f41365b, j10, nx0Var.i, j12), 0L, -1L);
    }
}
