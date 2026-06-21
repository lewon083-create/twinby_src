package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ox1 implements gz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gz1 f8852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ px1 f8854c;

    public ox1(px1 px1Var, gz1 gz1Var) {
        this.f8854c = px1Var;
        this.f8852a = gz1Var;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final int a(zd1 zd1Var, zq1 zq1Var, int i) {
        px1 px1Var = this.f8854c;
        if (px1Var.o()) {
            return -3;
        }
        if (this.f8853b) {
            zq1Var.f7316c = 4;
            return -4;
        }
        long jF = px1Var.f();
        int iA = this.f8852a.a(zd1Var, zq1Var, i);
        if (iA != -5) {
            long j10 = px1Var.f9205f;
            if (j10 == Long.MIN_VALUE || ((iA != -4 || zq1Var.f13081h < j10) && !(iA == -3 && jF == Long.MIN_VALUE && !zq1Var.f13080g))) {
                return iA;
            }
            zq1Var.r();
            zq1Var.f7316c = 4;
            this.f8853b = true;
            return -4;
        }
        jx1 jx1Var = (jx1) zd1Var.f12972d;
        jx1Var.getClass();
        int i10 = jx1Var.I;
        int i11 = jx1Var.H;
        if (i11 == 0) {
            if (i10 == 0) {
                return -5;
            }
            i11 = 0;
        }
        if (px1Var.f9205f != Long.MIN_VALUE) {
            i10 = 0;
        }
        ow1 ow1Var = new ow1(jx1Var);
        ow1Var.G = i11;
        ow1Var.H = i10;
        zd1Var.f12972d = new jx1(ow1Var);
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final boolean j() {
        return !this.f8854c.o() && this.f8852a.j();
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void l() {
        this.f8852a.l();
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final int m(long j10) {
        if (this.f8854c.o()) {
            return -3;
        }
        return this.f8852a.m(j10);
    }
}
