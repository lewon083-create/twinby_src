package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gz0 implements oy0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ux0 f5987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz0 f5988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dz0 f5989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f5990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j21 f5991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f5992g = new AtomicReference();

    public gz0(ux0 ux0Var, fz0 fz0Var, dz0 dz0Var, ExecutorService executorService, j21 j21Var) {
        this.f5987b = ux0Var;
        this.f5988c = fz0Var;
        this.f5989d = dz0Var;
        this.f5990e = executorService;
        this.f5991f = j21Var;
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final ed.d h() {
        ux0 ux0Var = this.f5987b;
        int iC = ux0Var.C();
        boolean zE = ux0Var.E();
        fz0 fz0Var = this.f5988c;
        fz0Var.getClass();
        i81 i81VarS = i81.s(vv.B(new ez0(fz0Var, iC), fz0Var.f5525d));
        n20 n20Var = n20.f8164n;
        f81 f81Var = f81.f5272b;
        r71 r71VarJ = vv.J(i81VarS, n20Var, f81Var);
        if (zE && iC != 2) {
            r71VarJ = vv.J(vv.G(i81.s(r71VarJ), Throwable.class, u5.f10834u, f81Var), new np(fz0Var), f81Var);
        }
        s71 s71VarK = vv.K(i81.s(r71VarJ), new ju(9, this), f81Var);
        s71VarK.a(new l81(0, s71VarK, new xo0(6, this)), this.f5990e);
        return s71VarK;
    }
}
