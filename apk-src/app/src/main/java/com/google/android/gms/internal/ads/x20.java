package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x20 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11983a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f11984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f11985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f11986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f11987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f11988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qs1 f11989g;

    public x20(d10 d10Var, a10 a10Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4) {
        this.f11986d = d10Var;
        this.f11987e = a10Var;
        this.f11984b = ls1Var;
        this.f11985c = ls1Var2;
        this.f11988f = ls1Var3;
        this.f11989g = ls1Var4;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f11983a) {
            case 0:
                Context contextA = ((d10) this.f11986d).a();
                t9.e0 e0VarJ = ((a10) this.f11987e).j();
                xh0 xh0Var = (xh0) this.f11984b.j();
                bd0 bd0Var = (bd0) this.f11985c.j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new w20(contextA, e0VarJ, xh0Var, bd0Var, gxVar, (r81) this.f11988f.j(), (ScheduledExecutorService) this.f11989g.j());
            default:
                return new g11((w11) this.f11984b.j(), (v11) this.f11985c.j(), (z11) this.f11986d.j(), (j21) this.f11987e.j(), (ux0) this.f11988f.j(), (ExecutorService) this.f11989g.j());
        }
    }

    public x20(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ns1 ns1Var, ns1 ns1Var2) {
        this.f11984b = ls1Var;
        this.f11985c = ls1Var2;
        this.f11986d = ls1Var3;
        this.f11987e = ls1Var4;
        this.f11988f = ns1Var;
        this.f11989g = ns1Var2;
    }
}
