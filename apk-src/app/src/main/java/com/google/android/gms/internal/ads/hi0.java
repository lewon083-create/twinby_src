package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hi0 implements zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q10 f6147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yc0 f6148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iq0 f6149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f6150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u9.a f6151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xo f6152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6153g = ((Boolean) q9.s.f31967e.f31970c.a(al.f2988ea)).booleanValue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ph0 f6154h;
    public final qd0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sd0 f6155j;

    public hi0(q10 q10Var, Executor executor, yc0 yc0Var, iq0 iq0Var, u9.a aVar, xo xoVar, ph0 ph0Var, qd0 qd0Var, sd0 sd0Var) {
        this.f6147a = q10Var;
        this.f6150d = executor;
        this.f6148b = yc0Var;
        this.f6149c = iq0Var;
        this.f6151e = aVar;
        this.f6152f = xoVar;
        this.f6154h = ph0Var;
        this.i = qd0Var;
        this.f6155j = sd0Var;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(eq0 eq0Var, xp0 xp0Var) {
        bq0 bq0Var = xp0Var.f12260s;
        return (bq0Var == null || bq0Var.f3852a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final ed.d b(eq0 eq0Var, xp0 xp0Var) {
        l80 l80Var = new l80(15);
        n81 n81Var = n81.f8237c;
        v40 v40Var = new v40(this, xp0Var, eq0Var, l80Var, 3);
        Executor executor = this.f6150d;
        r71 r71VarJ = vv.J(n81Var, v40Var, executor);
        r71VarJ.a(new ke(4), executor);
        return r71VarJ;
    }
}
