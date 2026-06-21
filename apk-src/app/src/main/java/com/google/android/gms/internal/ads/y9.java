package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9 f12546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12550e;

    public y9(x9 x9Var, int i, long j10, long j11) {
        this.f12546a = x9Var;
        this.f12547b = i;
        this.f12548c = j10;
        long j12 = (j11 - j10) / ((long) x9Var.f12081c);
        this.f12549d = j12;
        this.f12550e = a(j12);
    }

    public final long a(long j10) {
        return cq0.u(j10 * ((long) this.f12547b), 1000000L, this.f12546a.f12080b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        long j11 = this.f12547b;
        x9 x9Var = this.f12546a;
        long j12 = (((long) x9Var.f12080b) * j10) / (j11 * 1000000);
        String str = cq0.f4293a;
        long j13 = this.f12549d - 1;
        long jMax = Math.max(0L, Math.min(j12, j13));
        long j14 = x9Var.f12081c;
        long jA = a(jMax);
        long j15 = this.f12548c;
        p2 p2Var = new p2(jA, (jMax * j14) + j15);
        if (jA >= j10 || jMax == j13) {
            return new n2(p2Var, p2Var);
        }
        long j16 = jMax + 1;
        return new n2(p2Var, new p2(a(j16), (j14 * j16) + j15));
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        return this.f12550e;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        return true;
    }
}
