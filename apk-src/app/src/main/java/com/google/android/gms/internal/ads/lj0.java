package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lj0 extends jj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10 f7537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a60 f7538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gk0 f7539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g80 f7540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n90 f7541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n70 f7542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f7543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y70 f7544h;
    public final oj0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ei0 f7545j;

    public lj0(n10 n10Var, a60 a60Var, gk0 gk0Var, g80 g80Var, n90 n90Var, n70 n70Var, ViewGroup viewGroup, y70 y70Var, oj0 oj0Var, ei0 ei0Var) {
        this.f7537a = n10Var;
        this.f7538b = a60Var;
        this.f7539c = gk0Var;
        this.f7540d = g80Var;
        this.f7541e = n90Var;
        this.f7542f = n70Var;
        this.f7543g = viewGroup;
        this.f7544h = y70Var;
        this.i = oj0Var;
        this.f7545j = ei0Var;
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final or0 c(iq0 iq0Var, Bundle bundle, xp0 xp0Var, eq0 eq0Var) {
        a60 a60Var = this.f7538b;
        a60Var.f2787b = iq0Var;
        a60Var.f2788c = bundle;
        a60Var.f2790e = new oq0(10, eq0Var, xp0Var, this.i, false);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3106m4)).booleanValue()) {
            a60Var.f2791f = this.f7545j;
        }
        n10 n10Var = this.f7537a.f8104b;
        a60 a60Var2 = new a60(a60Var);
        n90 n90Var = new n90(8, this.f7542f, this.f7544h);
        cf cfVar = new cf(16, this.f7543g);
        g80 g80Var = this.f7540d;
        gr.L(g80Var, g80.class);
        gk0 gk0Var = this.f7539c;
        gr.L(gk0Var, gk0.class);
        gk0 gk0Var2 = new gk0(26);
        n90 n90Var2 = this.f7541e;
        gr.L(n90Var2, n90.class);
        b50 b50Var = (b50) new s10(n10Var, cfVar, n90Var2, new l80(16), g80Var, a60Var2, gk0Var2, gk0Var, n90Var, null, null).f10147s.j();
        return b50Var.c(b50Var.b());
    }
}
