package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kz1 implements gz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gz1 f7351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7352b;

    public kz1(gz1 gz1Var, long j10) {
        this.f7351a = gz1Var;
        this.f7352b = j10;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final int a(zd1 zd1Var, zq1 zq1Var, int i) {
        int iA = this.f7351a.a(zd1Var, zq1Var, i);
        if (iA != -4) {
            return iA;
        }
        zq1Var.f13081h += this.f7352b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final boolean j() {
        return this.f7351a.j();
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void l() {
        this.f7351a.l();
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final int m(long j10) {
        return this.f7351a.m(j10 - this.f7352b);
    }
}
