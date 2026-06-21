package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y30 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12476a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f12477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f12478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f12479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f12480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f12481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qs1 f12482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qs1 f12483h;
    public final qs1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qs1 f12484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qs1 f12485k;

    public y30(c50 c50Var, ls1 ls1Var, b40 b40Var, b40 b40Var2, b40 b40Var3, b40 b40Var4, p90 p90Var, ls1 ls1Var2, wm0 wm0Var, ls1 ls1Var3) {
        this.f12481f = c50Var;
        this.f12477b = ls1Var;
        this.f12482g = b40Var;
        this.f12483h = b40Var2;
        this.i = b40Var3;
        this.f12484j = b40Var4;
        this.f12479d = p90Var;
        this.f12478c = ls1Var2;
        this.f12485k = wm0Var;
        this.f12480e = ls1Var3;
    }

    public x30 a() {
        sa saVarA = ((c50) this.f12481f).a();
        Context context = (Context) this.f12477b.j();
        yp0 yp0Var = (yp0) ((b40) this.f12482g).f3578b.f4349e;
        gr.G(yp0Var);
        View view = (View) ((b40) this.f12483h).f3578b.f4348d;
        gr.G(view);
        sz szVar = (sz) ((b40) this.i).f3578b.f4350f;
        q40 q40Var = (q40) ((b40) this.f12484j).f3578b.f4347c;
        na0 na0Var = (na0) ((p90) this.f12479d).f8994a.f8248c;
        gr.G(na0Var);
        return new x30(saVarA, context, yp0Var, view, szVar, q40Var, na0Var, (w80) ((ls1) this.f12478c).j(), ls1.b((wm0) this.f12485k), (Executor) this.f12480e.j());
    }

    public cg0 b() {
        n10 n10Var = (n10) this.f12477b.j();
        Context contextA = ((d10) this.f12479d).a();
        u9.a aVarA = ((j10) this.f12480e).a();
        iq0 iq0VarA = ((d60) this.f12481f).a();
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        return new cg0(n10Var, contextA, aVarA, iq0VarA, gxVar, (String) ((ms1) this.f12482g).j(), (as0) ((ls1) this.f12478c).j(), (qd0) ((ls1) this.f12483h).j(), new fp(14), (ScheduledExecutorService) this.i.j(), (bt0) this.f12484j.j(), new p70(((h60) this.f12485k).f6039b.j()));
    }

    public lj0 c() {
        return new lj0((n10) this.f12477b.j(), ((b60) this.f12481f).f3656b.a(), ((hk0) this.f12479d).f6166b, ((h80) this.f12480e).f6052b, (n90) ((p20) this.f12482g).f8890b, (n70) ((o40) this.f12483h).f8607a.f8248c, (ViewGroup) ((cf) ((p20) this.i).f8890b).f4193c, (y70) ((ls1) this.f12478c).j(), (oj0) ((ls1) this.f12484j).j(), (ei0) ((ls1) this.f12485k).j());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f12476a) {
            case 0:
                return a();
            case 1:
                return new xb0(((d60) this.f12481f).a(), (Executor) this.f12477b.j(), (yc0) ((ls1) this.f12478c).j(), (Context) ((ls1) this.f12482g).j(), (sd0) this.f12479d.j(), (bt0) this.f12480e.j(), (kh0) this.f12483h.j(), (nc0) ((ls1) this.i).j(), (qd0) ((ls1) this.f12484j).j(), (de0) this.f12485k.j());
            case 2:
                return new mc0((g60) ((ls1) this.f12478c).j(), (w60) ((ls1) this.f12481f).j(), (c70) this.f12477b.j(), (f70) ((ls1) this.f12482g).j(), (x70) this.f12479d.j(), (u80) ((ls1) this.f12483h).j(), (sd0) this.f12480e.j(), (bt0) this.i.j(), (kh0) this.f12484j.j(), (w20) ((ls1) this.f12485k).j());
            case 3:
                return b();
            case 4:
                return c();
            default:
                return new mz0((r81) this.f12477b.j(), (nz0) this.f12479d.j(), (wz0) this.f12480e.j(), (by0) ((ns1) this.f12481f).f8433a, (String) ((ns1) this.f12482g).f8433a, (jd) ((ns1) this.f12483h).f8433a, (rs1) this.i, (rs1) this.f12484j, (rs1) this.f12478c, (j21) this.f12485k.j());
        }
    }

    public y30(d60 d60Var, qs1 qs1Var, ls1 ls1Var, ls1 ls1Var2, qs1 qs1Var2, qs1 qs1Var3, qs1 qs1Var4, ls1 ls1Var3, ls1 ls1Var4, qs1 qs1Var5) {
        this.f12481f = d60Var;
        this.f12477b = qs1Var;
        this.f12478c = ls1Var;
        this.f12482g = ls1Var2;
        this.f12479d = qs1Var2;
        this.f12480e = qs1Var3;
        this.f12483h = qs1Var4;
        this.i = ls1Var3;
        this.f12484j = ls1Var4;
        this.f12485k = qs1Var5;
    }

    public y30(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, ls1 ls1Var6, ls1 ls1Var7, ls1 ls1Var8, ls1 ls1Var9, ls1 ls1Var10) {
        this.f12478c = ls1Var;
        this.f12481f = ls1Var2;
        this.f12477b = ls1Var3;
        this.f12482g = ls1Var4;
        this.f12479d = ls1Var5;
        this.f12483h = ls1Var6;
        this.f12480e = ls1Var7;
        this.i = ls1Var8;
        this.f12484j = ls1Var9;
        this.f12485k = ls1Var10;
    }

    public y30(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ns1 ns1Var, ns1 ns1Var2, ns1 ns1Var3, rs1 rs1Var, rs1 rs1Var2, rs1 rs1Var3, ls1 ls1Var4) {
        this.f12477b = ls1Var;
        this.f12479d = ls1Var2;
        this.f12480e = ls1Var3;
        this.f12481f = ns1Var;
        this.f12482g = ns1Var2;
        this.f12483h = ns1Var3;
        this.i = rs1Var;
        this.f12484j = rs1Var2;
        this.f12478c = rs1Var3;
        this.f12485k = ls1Var4;
    }

    public y30(qs1 qs1Var, b60 b60Var, hk0 hk0Var, h80 h80Var, p20 p20Var, o40 o40Var, p20 p20Var2, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3) {
        this.f12477b = qs1Var;
        this.f12481f = b60Var;
        this.f12479d = hk0Var;
        this.f12480e = h80Var;
        this.f12482g = p20Var;
        this.f12483h = o40Var;
        this.i = p20Var2;
        this.f12478c = ls1Var;
        this.f12484j = ls1Var2;
        this.f12485k = ls1Var3;
    }

    public y30(qs1 qs1Var, qs1 qs1Var2, qs1 qs1Var3, d60 d60Var, ms1 ms1Var, ls1 ls1Var, ls1 ls1Var2, qs1 qs1Var4, qs1 qs1Var5, h60 h60Var) {
        this.f12477b = qs1Var;
        this.f12479d = qs1Var2;
        this.f12480e = qs1Var3;
        this.f12481f = d60Var;
        this.f12482g = ms1Var;
        this.f12478c = ls1Var;
        this.f12483h = ls1Var2;
        this.i = qs1Var4;
        this.f12484j = qs1Var5;
        this.f12485k = h60Var;
    }
}
