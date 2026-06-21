package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x30 extends r40 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f11994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f11995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sz f11996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final yp0 f11997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q40 f11998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final na0 f11999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80 f12000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final js1 f12001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Executor f12002t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q9.g3 f12003u;

    public x30(sa saVar, Context context, yp0 yp0Var, View view, sz szVar, q40 q40Var, na0 na0Var, w80 w80Var, js1 js1Var, Executor executor) {
        super(saVar);
        this.f11994l = context;
        this.f11995m = view;
        this.f11996n = szVar;
        this.f11997o = yp0Var;
        this.f11998p = q40Var;
        this.f11999q = na0Var;
        this.f12000r = w80Var;
        this.f12001s = js1Var;
        this.f12002t = executor;
    }

    @Override // com.google.android.gms.internal.ads.r40
    public final void a() {
        this.f12002t.execute(new h30(1, this));
        super.a();
    }

    public final yp0 c() {
        q9.g3 g3Var = this.f12003u;
        if (g3Var != null) {
            return g3Var.f31882j ? new yp0(-3, 0, true) : new yp0(g3Var.f31879f, g3Var.f31876c, false);
        }
        xp0 xp0Var = this.f9697b;
        if (xp0Var.f12232c0) {
            for (String str : xp0Var.f12227a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f11995m;
            return new yp0(view.getWidth(), view.getHeight(), false);
        }
        return (yp0) xp0Var.f12258r.get(0);
    }

    public final int d() {
        wk wkVar = al.U8;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && this.f9697b.f12240g0) {
            if (!((Boolean) sVar.f31970c.a(al.V8)).booleanValue()) {
                return 0;
            }
        }
        return ((zp0) this.f9696a.f5033b.f4348d).f13057c;
    }
}
