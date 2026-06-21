package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f10010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n10 f10011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final np0 f10012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ep0 f10013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fq0 f10014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bs0 f10015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hq0 f10016h;
    public ed.d i;

    public rp0(Context context, Executor executor, n10 n10Var, ep0 ep0Var, np0 np0Var, hq0 hq0Var, fq0 fq0Var) {
        this.f10009a = context;
        this.f10010b = executor;
        this.f10011c = n10Var;
        this.f10013e = ep0Var;
        this.f10012d = np0Var;
        this.f10016h = hq0Var;
        this.f10014f = fq0Var;
        this.f10015g = n10Var.c();
    }

    public final boolean a(q9.d3 d3Var, String str, gr grVar, al0 al0Var) {
        as0 as0Var;
        Executor executor = this.f10010b;
        if (str == null) {
            u9.i.e("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new h30(27, this));
            return false;
        }
        ed.d dVar = this.i;
        if (dVar != null && !dVar.isDone()) {
            return false;
        }
        wk wkVar = al.Q2;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            q9.r.a();
        }
        boolean zBooleanValue = ((Boolean) vl.f11414c.r()).booleanValue();
        ep0 ep0Var = this.f10013e;
        if (!zBooleanValue || ep0Var.g() == null) {
            as0Var = null;
        } else {
            as0Var = (as0) ((z10) ep0Var.g()).f12825g.j();
            as0Var.i(5);
            as0Var.c(d3Var.f31815q);
            as0Var.d(d3Var.f31812n);
        }
        boolean z5 = d3Var.f31806g;
        Context context = this.f10009a;
        gr.E(context, z5);
        if (((Boolean) sVar.f31970c.a(al.fa)).booleanValue() && z5) {
            ((ff0) this.f10011c.f8149z.j()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(d3Var.A));
        p9.k.C.f31304k.getClass();
        Bundle bundleN = gr.n(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        hq0 hq0Var = this.f10016h;
        hq0Var.f6214c = str;
        hq0Var.f6213b = new q9.g3("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
        hq0Var.f6212a = d3Var;
        hq0Var.f6230t = bundleN;
        iq0 iq0VarA = hq0Var.a();
        xr0 xr0VarI = xr0.i(context, fs1.P(iq0VarA), 5, d3Var);
        qp0 qp0Var = new qp0();
        qp0Var.f9572a = iq0VarA;
        ed.d dVarX = ep0Var.x(new n90(16, qp0Var, null, false), new pp0(0, this));
        this.i = dVarX;
        dVarX.a(new l81(0, dVarX, new z7(this, al0Var, as0Var, xr0VarI, qp0Var, 8, false)), executor);
        return true;
    }

    public final p10 b(cp0 cp0Var) {
        p10 p10Var = new p10(this.f10011c.f8104b, 1);
        a60 a60Var = new a60();
        a60Var.f2786a = this.f10009a;
        a60Var.f2787b = ((qp0) cp0Var).f9572a;
        a60Var.f2789d = this.f10014f;
        p10Var.f8882f = new a60(a60Var);
        p10Var.f8881e = new g80(new f80());
        return p10Var;
    }
}
