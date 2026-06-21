package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ic1 extends hc1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f6462d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ic1(ut utVar) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.f6462d = jArr3;
        l91 l91Var = (l91) utVar.f11061c;
        rs.j(jArr, (long[]) l91Var.f7466d, (long[]) l91Var.f7465c);
        rs.o(jArr2, (long[]) l91Var.f7466d, (long[]) l91Var.f7465c);
        System.arraycopy((long[]) l91Var.f7467e, 0, jArr3, 0, 10);
        rs.D(jArr4, (long[]) utVar.f11062d, jc1.f6820b);
    }

    @Override // com.google.android.gms.internal.ads.hc1
    public final void a(long[] jArr, long[] jArr2) {
        rs.D(jArr, jArr2, this.f6462d);
    }
}
