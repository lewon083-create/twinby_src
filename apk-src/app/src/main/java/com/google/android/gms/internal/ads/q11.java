package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q11 implements n11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my0 f9283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final my0 f9284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final my0 f9285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final my0 f9286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final js1 f9287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final js1 f9288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f9289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f9290h;
    public final j21 i;

    public q11(my0 my0Var, my0 my0Var2, js1 js1Var, my0 my0Var3, my0 my0Var4, js1 js1Var2, File file, ExecutorService executorService, j21 j21Var) {
        this.f9283a = my0Var;
        this.f9285c = my0Var2;
        this.f9287e = js1Var;
        this.f9284b = my0Var3;
        this.f9286d = my0Var4;
        this.f9288f = js1Var2;
        this.f9289g = file;
        this.f9290h = executorService;
        this.i = j21Var;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final ed.d a(bz0 bz0Var, byte[] bArr, byte[] bArr2) {
        c91 c91VarA = ((my0) this.f9288f.j()).a(bArr);
        j21 j21Var = this.i;
        j21Var.e(15307, c91VarA);
        c91 c91VarA2 = this.f9286d.a(bArr2);
        j21Var.e(15305, c91VarA2);
        return vv.J(i81.s(new a81(x41.w(new ed.d[]{c91VarA, c91VarA2}), true)), new p11(this, bz0Var, 1), f81.f5272b);
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final ed.d b(bz0 bz0Var, byte[] bArr) {
        c91 c91VarA = this.f9286d.a(bArr);
        this.i.e(15305, c91VarA);
        return vv.J(i81.s(c91VarA), new p11(this, bz0Var, 0), f81.f5272b);
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final ed.d h() {
        return vv.B(new do0(7, this), this.f9290h);
    }

    @Override // com.google.android.gms.internal.ads.n11
    public final ed.d i() {
        my0 my0Var = this.f9283a;
        my0Var.getClass();
        s71 s71VarK = vv.K(i81.s(vv.B(new do0(4, my0Var), my0Var.f8039b)), new ju(13, this), f81.f5272b);
        this.i.e(15314, s71VarK);
        return s71VarK;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final c91 j() {
        my0 my0Var = this.f9283a;
        my0Var.getClass();
        c91 c91VarB = vv.B(new do0(4, my0Var), my0Var.f8039b);
        this.i.e(15302, c91VarB);
        return c91VarB;
    }
}
