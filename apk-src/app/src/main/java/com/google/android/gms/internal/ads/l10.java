package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l10 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d10 f7372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f7373b;

    public l10(d10 d10Var, ls1 ls1Var) {
        this.f7372a = d10Var;
        this.f7373b = ls1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k7 j() {
        Context contextA = this.f7372a.a();
        bs0 bs0Var = (bs0) this.f7373b.j();
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        p9.k kVar = p9.k.C;
        wq wqVarE = kVar.f31311r.e(contextA, u9.a.c(), bs0Var);
        fp fpVar = nz.f8507m;
        wqVarE.getClass();
        return new k7(contextA, kVar.f31311r.e(contextA, u9.a.c(), bs0Var).a("google.afma.sdkConstants.getSdkConstants", fpVar, fpVar), u9.a.c(), gxVar);
    }
}
