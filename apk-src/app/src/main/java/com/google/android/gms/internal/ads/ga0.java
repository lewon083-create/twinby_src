package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ga0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c50 f5727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f5728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p20 f5729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ms1 f5730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ta0 f5731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f5732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qs1 f5733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ls1 f5734h;
    public final ls1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ls1 f5735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ls1 f5736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ls1 f5737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final oa0 f5738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qs1 f5739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qs1 f5740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qs1 f5741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ls1 f5742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ls1 f5743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qs1 f5744s;

    public ga0(c50 c50Var, ls1 ls1Var, p20 p20Var, ms1 ms1Var, ta0 ta0Var, qs1 qs1Var, p90 p90Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, ls1 ls1Var6, oa0 oa0Var, ls1 ls1Var7, j10 j10Var, d10 d10Var, ls1 ls1Var8, ls1 ls1Var9, ls1 ls1Var10) {
        this.f5727a = c50Var;
        this.f5728b = ls1Var;
        this.f5729c = p20Var;
        this.f5730d = ms1Var;
        this.f5731e = ta0Var;
        this.f5732f = qs1Var;
        this.f5733g = p90Var;
        this.f5734h = ls1Var2;
        this.i = ls1Var3;
        this.f5735j = ls1Var4;
        this.f5736k = ls1Var5;
        this.f5737l = ls1Var6;
        this.f5738m = oa0Var;
        this.f5739n = ls1Var7;
        this.f5740o = j10Var;
        this.f5741p = d10Var;
        this.f5742q = ls1Var8;
        this.f5743r = ls1Var9;
        this.f5744s = ls1Var10;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        sa saVarA = this.f5727a.a();
        Executor executor = (Executor) this.f5728b.j();
        ja0 ja0VarA = this.f5729c.a();
        ma0 ma0Var = (ma0) this.f5730d.j();
        sa0 sa0VarA = this.f5731e.a();
        la0 la0Var = (la0) this.f5732f.j();
        na0 na0Var = (na0) ((p90) this.f5733g).f8994a.f8248c;
        gr.G(na0Var);
        js1 js1VarB = ls1.b(this.f5734h);
        js1 js1VarB2 = ls1.b(this.i);
        js1 js1VarB3 = ls1.b(this.f5735j);
        js1 js1VarB4 = ls1.b(this.f5736k);
        js1 js1VarB5 = ls1.b(this.f5737l);
        oa0 oa0Var = this.f5738m;
        dw dwVar = new dw(((d10) oa0Var.f8651c).a(), oa0Var.f8650b.a().f6575g);
        xe xeVar = (xe) this.f5739n.j();
        u9.a aVarA = ((j10) this.f5740o).a();
        Context contextA = ((d10) this.f5741p).a();
        ha0 ha0Var = (ha0) this.f5742q.j();
        vk0 vk0Var = (vk0) this.f5743r.j();
        return new fa0(saVarA, executor, ja0VarA, ma0Var, sa0VarA, la0Var, na0Var, js1VarB, js1VarB2, js1VarB3, js1VarB4, js1VarB5, dwVar, xeVar, aVarA, contextA, ha0Var, vk0Var);
    }
}
