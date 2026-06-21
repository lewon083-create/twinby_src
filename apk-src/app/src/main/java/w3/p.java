package w3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t9.q f35087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t9.q f35088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f35089l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, t9.q qVar, t9.q qVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.f35087j = qVar;
        this.f35088k = qVar2;
        this.f35089l = j13;
    }

    @Override // w3.s
    public final j a(m mVar) {
        t9.q qVar = this.f35087j;
        if (qVar == null) {
            return this.f35094a;
        }
        j3.o oVar = mVar.f35076b;
        return new j(qVar.a(oVar.f26323a, 0L, oVar.f26331j, 0L), 0L, -1L);
    }

    @Override // w3.n
    public final long d(long j10) {
        if (this.f35083f != null) {
            return r0.size();
        }
        long j11 = this.f35089l;
        if (j11 != -1) {
            return (j11 - this.f35081d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f35095b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f35082e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = cd.a.f2264a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // w3.n
    public final j h(k kVar, long j10) {
        long j11 = this.f35081d;
        List list = this.f35083f;
        long j12 = list != null ? ((q) list.get((int) (j10 - j11))).f35090a : (j10 - j11) * this.f35082e;
        j3.o oVar = kVar.f35076b;
        return new j(this.f35088k.a(oVar.f26323a, j10, oVar.f26331j, j12), 0L, -1L);
    }
}
