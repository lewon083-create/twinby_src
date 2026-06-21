package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l90 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f7458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f7459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f7460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f7461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f7462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qs1 f7463g;

    public l90(d10 d10Var, ls1 ls1Var, qs1 qs1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4) {
        this.f7457a = 11;
        this.f7460d = d10Var;
        this.f7459c = ls1Var;
        this.f7458b = qs1Var;
        this.f7461e = ls1Var2;
        this.f7462f = ls1Var3;
        this.f7463g = ls1Var4;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f7457a) {
            case 0:
                d40 d40Var = (d40) this.f7460d;
                dw dwVar = new dw(((d10) d40Var.f4452b).a(), ((d60) d40Var.f4453c).a().f6575g);
                Context contextA = ((d10) this.f7458b).a();
                fw fwVar = (fw) this.f7459c.j();
                sz szVar = (sz) ((e90) this.f7462f).f4889b.f11062d;
                return new k90(dwVar, contextA, fwVar, szVar == null ? null : szVar.u(), (ti) this.f7461e.j(), ((y40) this.f7463g).a());
            case 1:
                n10 n10Var = (n10) this.f7458b.j();
                a60 a60VarA = ((b60) this.f7460d).f3656b.a();
                g80 g80Var = ((h80) this.f7461e).f6052b;
                n90 n90Var = (n90) ((p20) this.f7462f).f8890b;
                n70 n70VarJ = ((v30) this.f7459c).j();
                oj0 oj0Var = (oj0) ((ls1) this.f7463g).j();
                n10 n10Var2 = n10Var.f8104b;
                a60 a60Var = new a60(a60VarA);
                gk0 gk0Var = null;
                gk0 gk0Var2 = new gk0(0, gk0Var);
                n90 n90Var2 = new n90(8, n70VarJ, (Object) null);
                cf cfVar = new cf(16, (Object) null);
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3149p4)).booleanValue()) {
                    gk0Var = new gk0(26);
                    gk0Var.f5837c = oj0Var;
                }
                gr.L(g80Var, g80.class);
                if (gk0Var == null) {
                    gk0Var = new gk0(26);
                }
                gr.L(n90Var, n90.class);
                t40 t40Var = (t40) new s10(n10Var2, cfVar, n90Var, new l80(16), g80Var, a60Var, gk0Var, gk0Var2, n90Var2, null, null).f10146r.j();
                gr.G(t40Var);
                return t40Var;
            case 2:
                Context contextA2 = ((d10) this.f7458b).a();
                iq0 iq0VarA = ((d60) this.f7460d).a();
                jw jwVar = (jw) this.f7461e;
                gx gxVar = hx.f6280b;
                gr.G(gxVar);
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                cw cwVar = new cw(gxVar, gxVar2, new dg0((Context) ((xe0) jwVar.f6949b).f12138b.j(), gxVar2, 0), ls1.b((j40) jwVar.f6950c), 16, false);
                gr.G(gxVar2);
                return new bg0(contextA2, iq0VarA, cwVar, gxVar2, (ScheduledExecutorService) this.f7459c.j(), (eh0) ((ls1) this.f7462f).j(), (as0) ((ls1) this.f7463g).j());
            case 3:
                return new ij0((n10) this.f7458b.j(), (n90) ((p20) this.f7460d).f8890b, ((b60) this.f7459c).f3656b.a(), ((h80) this.f7461e).f6052b, (oj0) ((ls1) this.f7462f).j(), (ei0) ((ls1) this.f7463g).j());
            case 4:
                return new ij0((n10) this.f7458b.j(), ((b60) this.f7460d).f3656b.a(), ((hk0) this.f7459c).f6166b, ((h80) this.f7461e).f6052b, (oj0) ((ls1) this.f7462f).j(), (ei0) ((ls1) this.f7463g).j());
            case 5:
                return new ij0((n10) this.f7458b.j(), ((b60) this.f7460d).f3656b.a(), ((h80) this.f7459c).f6052b, ((b60) this.f7461e).f3656b.f2789d, (oj0) ((ls1) this.f7462f).j(), (ei0) ((ls1) this.f7463g).j());
            case 6:
                t9.e0 e0VarJ = ((a10) this.f7458b).j();
                Context contextA3 = ((d10) this.f7459c).a();
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                return new xn0(e0VarJ, contextA3, gxVar3, (ScheduledExecutorService) this.f7461e.j(), new yh0(((d10) ((i20) this.f7460d).f6343b).a()), ((d60) this.f7462f).a(), ((j10) this.f7463g).a());
            case 7:
                bx bxVar = (bx) this.f7458b.j();
                boolean z5 = ((ku) ((ho0) this.f7460d).f6205b.f15621d).f7306l;
                gx gxVar4 = hx.f6279a;
                gr.G(gxVar4);
                gr.G(((ku) ((ho0) this.f7461e).f6205b.f15621d).f7300e);
                return new io0(bxVar, z5, gxVar4, (ScheduledExecutorService) this.f7459c.j(), ((ho0) this.f7462f).f6205b.v(), ((ku) ((ho0) this.f7463g).f6205b.f15621d).f7310p);
            case 8:
                return new no0((Context) ((ns1) this.f7460d).f8433a, (Executor) this.f7458b.j(), (n10) this.f7459c.j(), ((fp0) this.f7462f).a(), (mo0) ((ls1) this.f7463g).j(), new hq0(), ((j10) this.f7461e).a());
            case 9:
                return new rp0((Context) ((ns1) this.f7460d).f8433a, (Executor) this.f7458b.j(), (n10) this.f7459c.j(), ((fp0) this.f7461e).a(), (np0) ((ls1) this.f7462f).j(), new hq0(), (fq0) ((ls1) this.f7463g).j());
            case 10:
                return new lq0((bt0) this.f7458b.j(), (zs0) this.f7459c.j(), ((y40) this.f7463g).a(), ((y40) this.f7460d).f12492b.s(), (w20) ((ls1) this.f7462f).j(), (as0) this.f7461e.j());
            case 11:
                Context contextA4 = ((d10) this.f7460d).a();
                gx gxVar5 = hx.f6279a;
                gr.G(gxVar5);
                return new bt0(contextA4, gxVar5, (s81) ((ls1) this.f7459c).j(), (u9.l) this.f7458b.j(), (zs0) ((ls1) this.f7461e).j(), (bs0) ((ls1) this.f7462f).j(), (w00) ((ls1) this.f7463g).j());
            case 12:
                return new i01((jd) ((ns1) this.f7460d).f8433a, (wz0) this.f7458b.j(), (by0) ((ns1) this.f7461e).f8433a, (Context) ((ns1) this.f7462f).f8433a, (Map) ((ns1) this.f7463g).f8433a, (j21) this.f7459c.j());
            case 13:
                w11 w11Var = (w11) ((ls1) this.f7460d).j();
                j11 j11Var = (j11) ((ls1) this.f7462f).j();
                m11 m11Var = (m11) ((ls1) this.f7463g).j();
                j21 j21Var = (j21) this.f7458b.j();
                fy0 fy0Var = (fy0) this.f7459c.j();
                ux0 ux0Var = (ux0) this.f7461e.j();
                return new x01(w11Var, j11Var, m11Var, j21Var, fy0Var, ux0Var.L().D(), ux0Var.L().E(), ux0Var.L().F());
            default:
                return new j11((Context) this.f7458b.j(), (ExecutorService) this.f7459c.j(), (ux0) this.f7461e.j(), (ey0) this.f7460d.j(), (j21) this.f7462f.j(), (l11) ((ls1) this.f7463g).j());
        }
    }

    public l90(d40 d40Var, d10 d10Var, ls1 ls1Var, e90 e90Var, ms1 ms1Var, y40 y40Var) {
        this.f7457a = 0;
        this.f7460d = d40Var;
        this.f7458b = d10Var;
        this.f7459c = ls1Var;
        this.f7462f = e90Var;
        this.f7461e = ms1Var;
        this.f7463g = y40Var;
    }

    public l90(ls1 ls1Var, ls1 ls1Var2, y40 y40Var, y40 y40Var2, ls1 ls1Var3, ls1 ls1Var4) {
        this.f7457a = 10;
        this.f7458b = ls1Var;
        this.f7459c = ls1Var2;
        this.f7463g = y40Var;
        this.f7460d = y40Var2;
        this.f7462f = ls1Var3;
        this.f7461e = ls1Var4;
    }

    public l90(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, ns1 ns1Var) {
        this.f7457a = 13;
        this.f7460d = ls1Var;
        this.f7462f = ls1Var2;
        this.f7463g = ls1Var3;
        this.f7458b = ls1Var4;
        this.f7459c = ls1Var5;
        this.f7461e = ns1Var;
    }

    public l90(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, fp0 fp0Var, ls1 ls1Var2, j10 j10Var) {
        this.f7457a = 8;
        this.f7460d = ns1Var;
        this.f7458b = ls1Var;
        this.f7459c = ns1Var2;
        this.f7462f = fp0Var;
        this.f7463g = ls1Var2;
        this.f7461e = j10Var;
    }

    public l90(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, fp0 fp0Var, ls1 ls1Var2, ls1 ls1Var3) {
        this.f7457a = 9;
        this.f7460d = ns1Var;
        this.f7458b = ls1Var;
        this.f7459c = ns1Var2;
        this.f7461e = fp0Var;
        this.f7462f = ls1Var2;
        this.f7463g = ls1Var3;
    }

    public l90(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, ns1 ns1Var3, ns1 ns1Var4, ls1 ls1Var2) {
        this.f7457a = 12;
        this.f7460d = ns1Var;
        this.f7458b = ls1Var;
        this.f7461e = ns1Var2;
        this.f7462f = ns1Var3;
        this.f7463g = ns1Var4;
        this.f7459c = ls1Var2;
    }

    public l90(qs1 qs1Var, b60 b60Var, h80 h80Var, p20 p20Var, qs1 qs1Var2, ls1 ls1Var) {
        this.f7457a = 1;
        this.f7458b = qs1Var;
        this.f7460d = b60Var;
        this.f7461e = h80Var;
        this.f7462f = p20Var;
        this.f7459c = qs1Var2;
        this.f7463g = ls1Var;
    }

    public /* synthetic */ l90(qs1 qs1Var, ms1 ms1Var, ms1 ms1Var2, ms1 ms1Var3, ls1 ls1Var, ls1 ls1Var2, int i) {
        this.f7457a = i;
        this.f7458b = qs1Var;
        this.f7460d = ms1Var;
        this.f7459c = ms1Var2;
        this.f7461e = ms1Var3;
        this.f7462f = ls1Var;
        this.f7463g = ls1Var2;
    }

    public /* synthetic */ l90(qs1 qs1Var, ms1 ms1Var, ms1 ms1Var2, qs1 qs1Var2, qs1 qs1Var3, qs1 qs1Var4, int i) {
        this.f7457a = i;
        this.f7458b = qs1Var;
        this.f7460d = ms1Var;
        this.f7461e = ms1Var2;
        this.f7459c = qs1Var2;
        this.f7462f = qs1Var3;
        this.f7463g = qs1Var4;
    }

    public /* synthetic */ l90(qs1 qs1Var, qs1 qs1Var2, qs1 qs1Var3, qs1 qs1Var4, qs1 qs1Var5, qs1 qs1Var6, int i) {
        this.f7457a = i;
        this.f7458b = qs1Var;
        this.f7459c = qs1Var2;
        this.f7461e = qs1Var3;
        this.f7460d = qs1Var4;
        this.f7462f = qs1Var5;
        this.f7463g = qs1Var6;
    }
}
