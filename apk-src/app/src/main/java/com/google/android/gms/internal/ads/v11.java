package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v11 implements m11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my0 f11205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final my0 f11206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final js1 f11207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j21 f11208d;

    public v11(my0 my0Var, my0 my0Var2, js1 js1Var, j21 j21Var) {
        this.f11205a = my0Var;
        this.f11206b = my0Var2;
        this.f11207c = js1Var;
        this.f11208d = j21Var;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final ed.d a(bz0 bz0Var, byte[] bArr, byte[] bArr2) {
        c91 c91VarA = ((my0) this.f11207c.j()).a(bArr);
        j21 j21Var = this.f11208d;
        j21Var.e(20307, c91VarA);
        c91 c91VarA2 = this.f11206b.a(bArr2);
        j21Var.e(20305, c91VarA2);
        return vv.J(i81.s(new a81(x41.w(new ed.d[]{c91VarA, c91VarA2}), true)), new u11(this, bz0Var, 0), f81.f5272b);
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final ed.d b(bz0 bz0Var, byte[] bArr) {
        c91 c91VarA = this.f11206b.a(bArr);
        this.f11208d.e(20305, c91VarA);
        return vv.J(i81.s(c91VarA), new u11(this, bz0Var, 1), f81.f5272b);
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final ed.d h() {
        return vv.d(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final c91 j() {
        my0 my0Var = this.f11205a;
        my0Var.getClass();
        c91 c91VarB = vv.B(new do0(4, my0Var), my0Var.f8039b);
        this.f11208d.e(20302, c91VarB);
        return c91VarB;
    }
}
