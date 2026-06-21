package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nq implements lx, kx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qq f8428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xr0 f8429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq f8430d;

    public /* synthetic */ nq(rq rqVar, qq qqVar, xr0 xr0Var) {
        this.f8428b = qqVar;
        this.f8429c = xr0Var;
        this.f8430d = rqVar;
    }

    @Override // com.google.android.gms.internal.ads.lx, com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        bs0 bs0Var;
        t9.c0.m("loadNewJavascriptEngine (success): Trying to acquire lock");
        rq rqVar = this.f8430d;
        synchronized (rqVar.f10020b) {
            try {
                t9.c0.m("loadNewJavascriptEngine (success): Lock acquired");
                rqVar.f10019a = 0;
                qq qqVar = (qq) rqVar.f10025g;
                if (qqVar != null && this.f8428b != qqVar) {
                    t9.c0.m("New JS engine is loaded, marking previous one as destroyable.");
                    ((qq) rqVar.f10025g).j();
                }
                rqVar.f10025g = this.f8428b;
                if (((Boolean) vl.f11415d.r()).booleanValue() && (bs0Var = (bs0) rqVar.f10024f) != null) {
                    xr0 xr0Var = this.f8429c;
                    xr0Var.a(true);
                    bs0Var.b(xr0Var.p());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t9.c0.m("loadNewJavascriptEngine (success): Lock released");
    }

    @Override // com.google.android.gms.internal.ads.kx, com.google.android.gms.internal.ads.vm, com.google.android.gms.internal.ads.al0
    /* JADX INFO: renamed from: h */
    public void mo4h() {
        bs0 bs0Var;
        t9.c0.m("loadNewJavascriptEngine (failure): Trying to acquire lock");
        rq rqVar = this.f8430d;
        synchronized (rqVar.f10020b) {
            try {
                t9.c0.m("loadNewJavascriptEngine (failure): Lock acquired");
                rqVar.f10019a = 1;
                t9.c0.m("Failed loading new engine. Marking new engine destroyable.");
                this.f8428b.j();
                if (((Boolean) vl.f11415d.r()).booleanValue() && (bs0Var = (bs0) rqVar.f10024f) != null) {
                    xr0 xr0Var = this.f8429c;
                    xr0Var.f("Failed loading new engine");
                    xr0Var.a(false);
                    bs0Var.b(xr0Var.p());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t9.c0.m("loadNewJavascriptEngine (failure): Lock released");
    }
}
