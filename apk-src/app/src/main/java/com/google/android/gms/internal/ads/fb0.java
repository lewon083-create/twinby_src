package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fb0 implements r60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja0 f5306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ka0 f5307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f5308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f5309e;

    public fb0(ja0 ja0Var, ka0 ka0Var, Executor executor, gx gxVar) {
        this.f5306b = ja0Var;
        this.f5307c = ka0Var;
        this.f5308d = executor;
        this.f5309e = gxVar;
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void z() {
        ed.d dVar;
        ed.d dVar2;
        jx jxVar;
        if (this.f5307c.f7162e) {
            ja0 ja0Var = this.f5306b;
            wh0 wh0VarK = ja0Var.k();
            if (wh0VarK == null) {
                synchronized (ja0Var) {
                    dVar = ja0Var.f6777m;
                }
                if (dVar != null && ((Boolean) q9.s.f31967e.f31970c.a(al.f3031h6)).booleanValue()) {
                    synchronized (ja0Var) {
                        dVar2 = ja0Var.f6777m;
                    }
                    synchronized (ja0Var) {
                        jxVar = ja0Var.f6778n;
                    }
                    if (dVar2 == null || jxVar == null) {
                        return;
                    }
                    a81 a81Var = new a81(x41.w(new ed.d[]{dVar2, jxVar}), false);
                    a81Var.a(new l81(0, a81Var, new kx0(17, this)), this.f5309e);
                    return;
                }
            }
            if (wh0VarK != null) {
                sz szVarJ = ja0Var.j();
                sz szVarH = ja0Var.h();
                if (szVarJ == null) {
                    szVarJ = szVarH == null ? null : szVarH;
                }
                if (szVarJ != null) {
                    this.f5308d.execute(new c00(szVarJ, 5));
                }
            }
        }
    }
}
