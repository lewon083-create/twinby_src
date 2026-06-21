package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 implements zh0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc0 f12998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iq0 f12999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f13000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u9.a f13001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xo f13002g;
    public final ph0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qd0 f13004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sd0 f13005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f13006l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12996a = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13003h = ((Boolean) q9.s.f31967e.f31970c.a(al.f2988ea)).booleanValue();

    public zi0(Context context, u9.a aVar, iq0 iq0Var, Executor executor, w10 w10Var, yc0 yc0Var, xo xoVar, ph0 ph0Var, qd0 qd0Var, sd0 sd0Var) {
        this.f12997b = context;
        this.f12999d = iq0Var;
        this.f13006l = w10Var;
        this.f13000e = executor;
        this.f13001f = aVar;
        this.f12998c = yc0Var;
        this.f13002g = xoVar;
        this.i = ph0Var;
        this.f13004j = qd0Var;
        this.f13005k = sd0Var;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(eq0 eq0Var, xp0 xp0Var) {
        switch (this.f12996a) {
            case 0:
                bq0 bq0Var = xp0Var.f12260s;
                if (bq0Var == null || bq0Var.f3852a == null) {
                }
                break;
            default:
                bq0 bq0Var2 = xp0Var.f12260s;
                if (bq0Var2 == null || bq0Var2.f3852a == null) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final ed.d b(eq0 eq0Var, xp0 xp0Var) {
        switch (this.f12996a) {
            case 0:
                l80 l80Var = new l80(15);
                n81 n81Var = n81.f8237c;
                v40 v40Var = new v40(this, xp0Var, eq0Var, l80Var, 7);
                Executor executor = this.f13000e;
                r71 r71VarJ = vv.J(n81Var, v40Var, executor);
                r71VarJ.a(new ke(5), executor);
                return r71VarJ;
            default:
                l80 l80Var2 = new l80(15);
                n81 n81Var2 = n81.f8237c;
                v40 v40Var2 = new v40(this, xp0Var, eq0Var, l80Var2, 9);
                Executor executor2 = this.f13000e;
                r71 r71VarJ2 = vv.J(n81Var2, v40Var2, executor2);
                r71VarJ2.a(new ke(6), executor2);
                return r71VarJ2;
        }
    }

    public zi0(Context context, u9.a aVar, iq0 iq0Var, Executor executor, z10 z10Var, yc0 yc0Var, xo xoVar, ph0 ph0Var, qd0 qd0Var, sd0 sd0Var) {
        this.f12997b = context;
        this.f12999d = iq0Var;
        this.f13006l = z10Var;
        this.f13000e = executor;
        this.f13001f = aVar;
        this.f12998c = yc0Var;
        this.f13002g = xoVar;
        this.i = ph0Var;
        this.f13004j = qd0Var;
        this.f13005k = sd0Var;
    }
}
