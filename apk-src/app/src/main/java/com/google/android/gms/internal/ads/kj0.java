package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kj0 extends jj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10 f7237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a60 f7238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g80 f7239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oj0 f7240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ei0 f7241e;

    public kj0(n10 n10Var, a60 a60Var, g80 g80Var, oj0 oj0Var, ei0 ei0Var) {
        this.f7237a = n10Var;
        this.f7238b = a60Var;
        this.f7239c = g80Var;
        this.f7240d = oj0Var;
        this.f7241e = ei0Var;
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final or0 c(iq0 iq0Var, Bundle bundle, xp0 xp0Var, eq0 eq0Var) {
        a60 a60Var = this.f7238b;
        a60Var.f2787b = iq0Var;
        a60Var.f2788c = bundle;
        a60Var.f2790e = new oq0(10, eq0Var, xp0Var, this.f7240d, false);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3106m4)).booleanValue()) {
            a60Var.f2791f = this.f7241e;
        }
        n10 n10Var = this.f7237a.f8104b;
        a60 a60Var2 = new a60(a60Var);
        g80 g80Var = this.f7239c;
        gr.L(g80Var, g80.class);
        b50 b50VarH = new q10(n10Var, new l80(16), g80Var, a60Var2, new gk0(26), null, null).h();
        return b50VarH.c(b50VarH.b());
    }
}
