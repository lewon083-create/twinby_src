package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j40 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f6706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f6707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f6708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f6709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6710f;

    public j40(d10 d10Var, j10 j10Var, y40 y40Var, ms1 ms1Var, ls1 ls1Var) {
        this.f6705a = 10;
        this.f6708d = d10Var;
        this.f6709e = j10Var;
        this.f6707c = y40Var;
        this.f6710f = ms1Var;
        this.f6706b = ls1Var;
    }

    public e60 a() {
        return new e60(((y40) this.f6707c).a(), (String) ((y40) this.f6710f).f12492b.f8764e, (ei0) this.f6708d.j(), ((y40) this.f6706b).f12492b.s(), (String) this.f6709e.j());
    }

    public gh0 b() {
        return new gh0(((d10) this.f6708d).a(), ((aa.m) this.f6710f).a(), (eh0) ((ls1) this.f6706b).j(), ((jw) this.f6707c).a(), ((a10) this.f6709e).j());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f6705a) {
            case 0:
                return new i40(((d10) this.f6708d).a(), (sz) ((b40) this.f6710f).f3578b.f4350f, ((y40) this.f6707c).a(), ((j10) this.f6709e).a(), (vh0) ((ls1) this.f6706b).j());
            case 1:
                q60 q60Var = (q60) ((ls1) this.f6706b).j();
                xp0 xp0VarA = ((y40) this.f6707c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6708d.j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new q50(q60Var, xp0VarA, scheduledExecutorService, gxVar, (String) ((y40) this.f6709e).f12492b.f8764e, (i70) ((ls1) this.f6710f).j());
            case 2:
                return new v50(((y40) this.f6710f).b(), ((y40) this.f6707c).a(), (ua.a) this.f6708d.j(), (sd0) this.f6709e.j(), (ScheduledExecutorService) this.f6706b.j());
            case 3:
                return a();
            case 4:
                return new i90(((d10) this.f6708d).a(), (sz) ((e90) this.f6710f).f4889b.f11062d, ((y40) this.f6707c).a(), ((j10) this.f6709e).a(), (vh0) ((ls1) this.f6706b).j());
            case 5:
                Map mapJ = ((os1) this.f6708d).j();
                Map mapJ2 = ((os1) this.f6709e).j();
                Map mapJ3 = ((os1) this.f6710f).j();
                na0 na0Var = (na0) ((p90) this.f6707c).f8994a.f8248c;
                gr.G(na0Var);
                return new m90(mapJ, mapJ2, mapJ3, (ls1) this.f6706b, na0Var);
            case 6:
                return new vb0((Executor) this.f6708d.j(), (q30) ((ls1) this.f6706b).j(), (t80) ((ls1) this.f6709e).j(), (w20) ((ls1) this.f6710f).j(), (r50) ((ls1) this.f6707c).j());
            case 7:
                Context contextA = ((d10) this.f6708d).a();
                String packageName = ((d10) ((i20) this.f6710f).f6343b).a().getPackageName();
                gr.G(packageName);
                u9.a aVarA = ((j10) this.f6709e).a();
                ti tiVar = (ti) this.f6707c.j();
                String str = (String) ((ls1) this.f6706b).j();
                si siVar = new si(new com.google.android.gms.internal.measurement.i4(contextA, 6));
                jj jjVarA = kj.A();
                int i = aVarA.f34366c;
                jjVarA.b();
                ((kj) jjVarA.f9560c).B(i);
                int i10 = aVarA.f34367d;
                jjVarA.b();
                ((kj) jjVarA.f9560c).C(i10);
                int i11 = true != aVarA.f34368e ? 2 : 0;
                jjVarA.b();
                ((kj) jjVarA.f9560c).z(i11);
                siVar.a(new cw(tiVar, packageName, (kj) jjVarA.d(), str, 15, false));
                return siVar;
            case 8:
                Context contextA2 = ((d10) this.f6708d).a();
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                fp fpVar = new fp(14);
                n10 n10Var = (n10) ((h10) this.f6709e).f6001a.f8433a;
                gr.G(n10Var);
                return new xg0(contextA2, gxVar2, fpVar, n10Var, new ox0(26, ((l10) ((i20) this.f6710f).f6343b).j()), (ArrayDeque) this.f6707c.j(), (bs0) this.f6706b.j());
            case 9:
                return b();
            case 10:
                return new vh0(((d10) this.f6708d).a(), ((j10) this.f6709e).a(), ((y40) this.f6707c).a(), (sz) ((ms1) this.f6710f).j(), (sd0) this.f6706b.j());
            case 11:
                return new vi0((Context) ((ls1) this.f6706b).j(), (Executor) this.f6708d.j(), (w10) ((ns1) this.f6710f).f8433a, (wp0) this.f6709e.j(), (sd0) this.f6707c.j());
            case 12:
                return new kj0((n10) this.f6708d.j(), ((b60) this.f6709e).f3656b.a(), ((h80) this.f6710f).f6052b, (oj0) ((ls1) this.f6706b).j(), (ei0) ((ls1) this.f6707c).j());
            case 13:
                ua.a aVar = (ua.a) this.f6708d.j();
                qj0 qj0Var = (qj0) this.f6707c;
                oq0 oq0Var = new oq0(22, (nq0) qj0Var.f9516b.j(), (fd0) qj0Var.f9517c.j(), (sd0) qj0Var.f9518d.j(), false);
                ei0 ei0Var = (ei0) ((ls1) this.f6706b).j();
                bt0 bt0Var = (bt0) this.f6709e.j();
                oj0 oj0Var = (oj0) ((gk0) this.f6710f).f5837c;
                return oj0Var != null ? oj0Var : new oj0(aVar, oq0Var, ei0Var, bt0Var);
            case 14:
                return new vi0((Context) ((ls1) this.f6706b).j(), (s10) ((ns1) this.f6709e).f8433a, (rr0) ((ls1) this.f6710f).j(), (r81) this.f6708d.j(), (gl) ((hk0) this.f6707c).f6166b.f5837c);
            case 15:
                return new pk0((Context) this.f6708d.j(), (q9.y) ((o90) this.f6709e).f8643a.f8249d, ((d60) ((qs1) this.f6710f)).a(), ((y30) ((p20) this.f6707c).f8890b).a(), (sd0) this.f6706b.j());
            case 16:
                vw vwVar = new vw();
                Context contextA3 = ((d10) this.f6708d).a();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f6709e.j();
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                return new zn0(vwVar, contextA3, scheduledExecutorService2, gxVar3, ((ho0) this.f6710f).f6205b.f15620c, ((ku) ((ho0) this.f6707c).f6205b.f15621d).f7307m, ((ku) ((ho0) this.f6706b).f6205b.f15621d).f7306l);
            case 17:
                return new kp0((Context) ((ns1) this.f6710f).f8433a, (Executor) this.f6708d.j(), (n10) this.f6709e.j(), (uk0) ((ls1) this.f6706b).j(), (np0) ((ls1) this.f6707c).j(), new hq0());
            case 18:
                return new ft0((qt0) ((ls1) this.f6706b).j(), ((g10) this.f6708d).a(), ((d10) this.f6709e).a(), (ua.a) ((ls1) this.f6710f).j(), (dt0) ((ls1) this.f6707c).j());
            case 19:
                Context context = (Context) ((ns1) this.f6708d).f8433a;
                fy0 fy0Var = (fy0) ((ls1) this.f6706b).j();
                ExecutorService executorService = (ExecutorService) ((ns1) this.f6709e).f8433a;
                ey0 ey0Var = (ey0) ((ls1) this.f6710f).j();
                ux0 ux0Var = (ux0) ((ns1) this.f6707c).f8433a;
                return new xy0(context, fy0Var, executorService, ey0Var, new Random(), ux0Var.H().z(), ux0Var.H().B(), ux0Var.H().C(), ux0Var.H().A(), ux0Var.F(), ux0Var.C() - 1);
            case 20:
                return new fz0(ls1.b((ls1) this.f6706b), ls1.b((ls1) this.f6708d), ls1.b((ls1) this.f6709e), (ExecutorService) ((ns1) this.f6710f).f8433a, (j21) ((ls1) this.f6707c).j());
            case 21:
                return new gz0((ux0) ((ns1) this.f6708d).f8433a, (fz0) ((ls1) this.f6706b).j(), (dz0) ((ls1) this.f6709e).j(), (ExecutorService) ((ns1) this.f6710f).f8433a, (j21) ((ls1) this.f6707c).j());
            default:
                return new zz0((jd) ((ns1) this.f6710f).f8433a, (wz0) this.f6708d.j(), (Map) ((ns1) this.f6707c).f8433a, (Context) this.f6709e.j(), (j21) this.f6706b.j());
        }
    }

    public j40(d10 d10Var, i20 i20Var, j10 j10Var, qs1 qs1Var, ls1 ls1Var) {
        this.f6705a = 7;
        this.f6708d = d10Var;
        this.f6710f = i20Var;
        this.f6709e = j10Var;
        this.f6707c = qs1Var;
        this.f6706b = ls1Var;
    }

    public /* synthetic */ j40(d10 d10Var, ms1 ms1Var, y40 y40Var, j10 j10Var, ls1 ls1Var, int i) {
        this.f6705a = i;
        this.f6708d = d10Var;
        this.f6710f = ms1Var;
        this.f6707c = y40Var;
        this.f6709e = j10Var;
        this.f6706b = ls1Var;
    }

    public j40(y40 y40Var, y40 y40Var2, ls1 ls1Var, y40 y40Var3, ls1 ls1Var2) {
        this.f6705a = 3;
        this.f6707c = y40Var;
        this.f6710f = y40Var2;
        this.f6708d = ls1Var;
        this.f6706b = y40Var3;
        this.f6709e = ls1Var2;
    }

    public j40(y40 y40Var, y40 y40Var2, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3) {
        this.f6705a = 2;
        this.f6710f = y40Var;
        this.f6707c = y40Var2;
        this.f6708d = ls1Var;
        this.f6709e = ls1Var2;
        this.f6706b = ls1Var3;
    }

    public j40(gk0 gk0Var, qs1 qs1Var, qj0 qj0Var, ls1 ls1Var, qs1 qs1Var2) {
        this.f6705a = 13;
        this.f6710f = gk0Var;
        this.f6708d = qs1Var;
        this.f6707c = qj0Var;
        this.f6706b = ls1Var;
        this.f6709e = qs1Var2;
    }

    public j40(ls1 ls1Var, y40 y40Var, ls1 ls1Var2, y40 y40Var2, ls1 ls1Var3) {
        this.f6705a = 1;
        this.f6706b = ls1Var;
        this.f6707c = y40Var;
        this.f6708d = ls1Var2;
        this.f6709e = y40Var2;
        this.f6710f = ls1Var3;
    }

    public j40(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ns1 ns1Var) {
        this.f6705a = 11;
        this.f6706b = ls1Var;
        this.f6708d = ls1Var2;
        this.f6710f = ns1Var;
        this.f6709e = ls1Var3;
        this.f6707c = ls1Var4;
    }

    public j40(ls1 ls1Var, ns1 ns1Var, ls1 ls1Var2, qs1 qs1Var, hk0 hk0Var) {
        this.f6705a = 14;
        this.f6706b = ls1Var;
        this.f6709e = ns1Var;
        this.f6710f = ls1Var2;
        this.f6708d = qs1Var;
        this.f6707c = hk0Var;
    }

    public /* synthetic */ j40(ls1 ls1Var, qs1 qs1Var, qs1 qs1Var2, Object obj, ls1 ls1Var2, int i) {
        this.f6705a = i;
        this.f6706b = ls1Var;
        this.f6708d = qs1Var;
        this.f6709e = qs1Var2;
        this.f6710f = obj;
        this.f6707c = ls1Var2;
    }

    public /* synthetic */ j40(ms1 ms1Var, ms1 ms1Var2, ms1 ms1Var3, ls1 ls1Var, qs1 qs1Var, int i) {
        this.f6705a = i;
        this.f6708d = ms1Var;
        this.f6709e = ms1Var2;
        this.f6710f = ms1Var3;
        this.f6706b = ls1Var;
        this.f6707c = qs1Var;
    }

    public j40(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, ls1 ls1Var2, ls1 ls1Var3) {
        this.f6705a = 17;
        this.f6710f = ns1Var;
        this.f6708d = ls1Var;
        this.f6709e = ns1Var2;
        this.f6706b = ls1Var2;
        this.f6707c = ls1Var3;
    }

    public j40(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, ns1 ns1Var3, ls1 ls1Var2) {
        this.f6705a = 22;
        this.f6710f = ns1Var;
        this.f6708d = ls1Var;
        this.f6707c = ns1Var2;
        this.f6709e = ns1Var3;
        this.f6706b = ls1Var2;
    }

    public j40(qs1 qs1Var, aa.m mVar, ls1 ls1Var, jw jwVar, qs1 qs1Var2) {
        this.f6705a = 9;
        this.f6708d = qs1Var;
        this.f6710f = mVar;
        this.f6706b = ls1Var;
        this.f6707c = jwVar;
        this.f6709e = qs1Var2;
    }

    public /* synthetic */ j40(qs1 qs1Var, qs1 qs1Var2, ms1 ms1Var, qs1 qs1Var3, qs1 qs1Var4, int i) {
        this.f6705a = i;
        this.f6708d = qs1Var;
        this.f6709e = qs1Var2;
        this.f6710f = ms1Var;
        this.f6707c = qs1Var3;
        this.f6706b = qs1Var4;
    }

    public /* synthetic */ j40(Object obj, ls1 ls1Var, Object obj2, Object obj3, Object obj4, int i) {
        this.f6705a = i;
        this.f6708d = (qs1) obj;
        this.f6706b = ls1Var;
        this.f6709e = (qs1) obj2;
        this.f6710f = obj3;
        this.f6707c = (qs1) obj4;
    }
}
