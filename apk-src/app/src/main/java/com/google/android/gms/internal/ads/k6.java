package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l6 f7126a;

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        l6 l6Var = this.f7126a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) ((t6) l6Var.f7407m).f10503e) * j10) / 1000000);
        long j11 = l6Var.f7398c;
        long j12 = l6Var.f7397b;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(j11 - j12)).divide(BigInteger.valueOf(l6Var.f7400e)).longValue() + j12;
        String str = cq0.f4293a;
        p2 p2Var = new p2(j10, Math.max(j12, Math.min(jLongValue - 30000, j11 - 1)));
        return new n2(p2Var, p2Var);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        l6 l6Var = this.f7126a;
        t6 t6Var = (t6) l6Var.f7407m;
        return (l6Var.f7400e * 1000000) / ((long) t6Var.f10503e);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        return true;
    }
}
