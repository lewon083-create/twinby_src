package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f7278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n10 f7279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uk0 f7280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final np0 f7281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gl f7282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bs0 f7283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hq0 f7284h;
    public or0 i;

    public kp0(Context context, Executor executor, n10 n10Var, uk0 uk0Var, np0 np0Var, hq0 hq0Var) {
        this.f7277a = context;
        this.f7278b = executor;
        this.f7279c = n10Var;
        this.f7280d = uk0Var;
        this.f7284h = hq0Var;
        this.f7281e = np0Var;
        this.f7283g = n10Var.c();
    }

    public final boolean a(q9.d3 d3Var, String str, gr grVar, al0 al0Var) {
        w10 w10Var;
        as0 as0Var;
        Executor executor = this.f7278b;
        if (str == null) {
            u9.i.e("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new h30(25, this));
            return false;
        }
        if (b()) {
            return false;
        }
        wk wkVar = al.Q2;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            q9.r.a();
        }
        boolean zBooleanValue = ((Boolean) ykVar2.a(al.fa)).booleanValue();
        n10 n10Var = this.f7279c;
        if (zBooleanValue && d3Var.f31806g) {
            ((ff0) n10Var.f8149z.j()).b(true);
        }
        q9.g3 g3Var = ((hp0) grVar).f6210d;
        Pair pair = new Pair("api-call", Long.valueOf(d3Var.A));
        p9.k.C.f31304k.getClass();
        Bundle bundleN = gr.n(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        hq0 hq0Var = this.f7284h;
        hq0Var.f6214c = str;
        hq0Var.f6213b = g3Var;
        hq0Var.f6212a = d3Var;
        hq0Var.f6230t = bundleN;
        iq0 iq0VarA = hq0Var.a();
        int iP = fs1.P(iq0VarA);
        Context context = this.f7277a;
        xr0 xr0VarI = xr0.i(context, iP, 4, d3Var);
        boolean zBooleanValue2 = ((Boolean) ykVar2.a(al.f3125n9)).booleanValue();
        uk0 uk0Var = this.f7280d;
        if (zBooleanValue2) {
            n10 n10Var2 = n10Var.f8104b;
            a60 a60Var = new a60();
            a60Var.f2786a = context;
            a60Var.f2787b = iq0VarA;
            a60 a60Var2 = new a60(a60Var);
            f80 f80Var = new f80();
            f80Var.d(uk0Var, executor);
            f80Var.b(uk0Var, executor);
            w10Var = new w10(n10Var2, new l80(16), new g80(f80Var), a60Var2, new gk0(26), new gk0(0, this.f7282f), null, null);
        } else {
            f80 f80Var2 = new f80();
            HashSet hashSet = (HashSet) f80Var2.f5265h;
            HashSet hashSet2 = (HashSet) f80Var2.f5262e;
            np0 np0Var = this.f7281e;
            if (np0Var != null) {
                hashSet2.add(new s80(np0Var, executor));
                hashSet.add(new s80(np0Var, executor));
                f80Var2.a(np0Var, executor);
            }
            n10 n10Var3 = n10Var.f8104b;
            a60 a60Var3 = new a60();
            a60Var3.f2786a = context;
            a60Var3.f2787b = iq0VarA;
            a60 a60Var4 = new a60(a60Var3);
            f80Var2.d(uk0Var, executor);
            hashSet2.add(new s80(uk0Var, executor));
            hashSet.add(new s80(uk0Var, executor));
            f80Var2.a(uk0Var, executor);
            ((HashSet) f80Var2.f5260c).add(new s80(uk0Var, executor));
            f80Var2.c(uk0Var, executor);
            f80Var2.b(uk0Var, executor);
            ((HashSet) f80Var2.f5269m).add(new s80(uk0Var, executor));
            ((HashSet) f80Var2.f5268l).add(new s80(uk0Var, executor));
            w10Var = new w10(n10Var3, new l80(16), new g80(f80Var2), a60Var4, new gk0(26), new gk0(0, this.f7282f), null, null);
        }
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            as0Var = (as0) w10Var.i.j();
            as0Var.i(4);
            as0Var.c(d3Var.f31815q);
            as0Var.d(d3Var.f31812n);
        } else {
            as0Var = null;
        }
        b50 b50Var = (b50) w10Var.f11583n.j();
        or0 or0VarC = b50Var.c(b50Var.b());
        this.i = or0VarC;
        or0VarC.a(new l81(0, or0VarC, new z7(this, al0Var, as0Var, xr0VarI, w10Var, 7, false)), executor);
        return true;
    }

    public final boolean b() {
        or0 or0Var = this.i;
        return (or0Var == null || or0Var.f8767d.isDone()) ? false : true;
    }
}
