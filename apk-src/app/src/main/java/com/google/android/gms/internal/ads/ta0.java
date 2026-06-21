package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ta0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10565a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f10566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f10567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f10568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f10569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f10570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qs1 f10571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qs1 f10572h;
    public final qs1 i;

    public ta0(a10 a10Var, d60 d60Var, qs1 qs1Var, p20 p20Var, ms1 ms1Var, ms1 ms1Var2, ls1 ls1Var, ls1 ls1Var2) {
        this.f10567c = a10Var;
        this.f10570f = d60Var;
        this.f10568d = qs1Var;
        this.f10571g = p20Var;
        this.f10572h = ms1Var;
        this.i = ms1Var2;
        this.f10569e = ls1Var;
        this.f10566b = ls1Var2;
    }

    public sa0 a() {
        t9.e0 e0VarJ = ((a10) this.f10567c).j();
        iq0 iq0VarA = ((d60) this.f10570f).a();
        la0 la0Var = (la0) this.f10568d.j();
        ja0 ja0VarA = ((p20) this.f10571g).a();
        za0 za0Var = (za0) ((ms1) this.f10572h).j();
        db0 db0Var = (db0) ((ms1) this.i).j();
        Executor executor = (Executor) this.f10569e.j();
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        return new sa0(e0VarJ, iq0VarA, la0Var, ja0VarA, za0Var, db0Var, executor, gxVar, (ha0) this.f10566b.j());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f10565a) {
            case 0:
                return a();
            case 1:
                return new ic0((g60) this.f10566b.j(), (w60) ((ls1) this.f10569e).j(), (c70) this.f10567c.j(), (f70) ((ls1) this.f10570f).j(), (x70) this.f10568d.j(), ((y40) this.f10571g).a(), ((y40) this.f10572h).f12492b.s(), (w20) ((ls1) this.i).j());
            case 2:
                return new ff0((hf0) this.f10566b.j(), (qf0) ((ls1) this.f10567c).j(), (ue0) ((ls1) this.f10568d).j(), ((d10) this.f10569e).a(), ((j10) this.f10570f).a(), (bf0) ((ls1) this.f10571g).j(), (pf0) ((ls1) this.f10572h).j(), new gw(), new gw(), ((e10) this.i).j());
            default:
                return new tp0((String) ((ns1) this.f10570f).f8433a, (rp0) this.f10566b.j(), (Context) ((ns1) this.f10571g).f8433a, (np0) ((ls1) this.f10572h).j(), (fq0) ((ls1) this.i).j(), ((j10) this.f10567c).a(), (xe) this.f10568d.j(), (sd0) this.f10569e.j());
        }
    }

    public ta0(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, d10 d10Var, j10 j10Var, ls1 ls1Var4, ls1 ls1Var5, e10 e10Var) {
        this.f10566b = ls1Var;
        this.f10567c = ls1Var2;
        this.f10568d = ls1Var3;
        this.f10569e = d10Var;
        this.f10570f = j10Var;
        this.f10571g = ls1Var4;
        this.f10572h = ls1Var5;
        this.i = e10Var;
    }

    public ta0(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, y40 y40Var, y40 y40Var2, ls1 ls1Var6) {
        this.f10566b = ls1Var;
        this.f10569e = ls1Var2;
        this.f10567c = ls1Var3;
        this.f10570f = ls1Var4;
        this.f10568d = ls1Var5;
        this.f10571g = y40Var;
        this.f10572h = y40Var2;
        this.i = ls1Var6;
    }

    public ta0(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, ls1 ls1Var2, ls1 ls1Var3, j10 j10Var, ls1 ls1Var4, ls1 ls1Var5) {
        this.f10570f = ns1Var;
        this.f10566b = ls1Var;
        this.f10571g = ns1Var2;
        this.f10572h = ls1Var2;
        this.i = ls1Var3;
        this.f10567c = j10Var;
        this.f10568d = ls1Var4;
        this.f10569e = ls1Var5;
    }
}
