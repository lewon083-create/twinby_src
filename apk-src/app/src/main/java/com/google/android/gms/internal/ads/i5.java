package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i5 implements h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f6369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f6370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6373e;

    public i5(long[] jArr, long[] jArr2, long j10, long j11, int i) {
        this.f6369a = jArr;
        this.f6370b = jArr2;
        this.f6371c = j10;
        this.f6372d = j11;
        this.f6373e = i;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        long[] jArr = this.f6369a;
        int iQ = cq0.q(jArr, j10, true);
        long j11 = jArr[iQ];
        long[] jArr2 = this.f6370b;
        p2 p2Var = new p2(j11, jArr2[iQ]);
        if (j11 >= j10 || iQ == jArr.length - 1) {
            return new n2(p2Var, p2Var);
        }
        int i = iQ + 1;
        return new n2(p2Var, new p2(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long c() {
        return this.f6372d;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        return this.f6371c;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int k() {
        return this.f6373e;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final long m(long j10) {
        return this.f6369a[cq0.q(this.f6370b, j10, true)];
    }
}
