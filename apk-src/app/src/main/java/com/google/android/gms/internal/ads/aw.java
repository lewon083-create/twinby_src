package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class aw implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f3440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f3441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f3442d;

    public /* synthetic */ aw(qs1 qs1Var, qs1 qs1Var2, qs1 qs1Var3, int i) {
        this.f3439a = i;
        this.f3440b = qs1Var;
        this.f3441c = qs1Var2;
        this.f3442d = qs1Var3;
    }

    public z7 a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f3440b.j();
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        gx gxVar2 = hx.f6280b;
        gr.G(gxVar2);
        Context contextA = ((d10) ((i20) this.f3441c).f6343b).a();
        gr.G(gxVar);
        return new z7(scheduledExecutorService, gxVar, gxVar2, new dg0(contextA, gxVar, 1), ls1.b((j40) this.f3442d), 3);
    }

    public cw b() {
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        qb0 qb0VarA = ((rb0) this.f3440b).j();
        jw jwVar = (jw) this.f3441c;
        gr.G(gxVar);
        return new cw(gxVar, qb0VarA, new oq0(13, gxVar, ((rb0) jwVar.f6949b).j(), (qd0) ((ls1) jwVar.f6950c).j(), false), (qd0) ((ls1) this.f3442d).j(), 13, false);
    }

    public gl0 c() {
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        return new gl0(gxVar, ((d10) this.f3440b).a(), ((d60) this.f3441c).a(), (ViewGroup) ((cf) ((p20) this.f3442d).f8890b).f4193c, 0);
    }

    public gl0 d() {
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        return new gl0(gxVar, (ViewGroup) ((cf) ((p20) this.f3440b).f8890b).f4193c, (Context) ((ls1) this.f3441c).j(), ((rs1) this.f3442d).j());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        Set setSingleton;
        switch (this.f3439a) {
            case 0:
                t9.e0 e0Var = (t9.e0) ((ns1) this.f3441c).f8433a;
                return new zv(e0Var);
            case 1:
                wk wkVar = al.T;
                q9.s sVar = q9.s.f31967e;
                Integer num = (Integer) sVar.f31970c.a(wkVar);
                num.getClass();
                int iIntValue = num.intValue();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((ls1) this.f3440b).j();
                kx0 kx0VarA = ((g10) this.f3441c).a();
                ua.a aVar = (ua.a) ((ls1) this.f3442d).j();
                if (((Boolean) sVar.f31970c.a(al.O)).booleanValue()) {
                    return new dt0(iIntValue, scheduledExecutorService, kx0VarA, aVar);
                }
                return null;
            case 2:
                u9.a aVarA = ((j10) this.f3440b).a();
                JSONObject jSONObject = (JSONObject) ((ls1) this.f3441c).j();
                String str = (String) ((ms1) this.f3442d).j();
                boolean zEquals = "native".equals(str);
                t9.g0 g0Var = p9.k.C.f31297c;
                return new dh(UUID.randomUUID().toString(), aVarA, str, jSONObject, zEquals);
            case 3:
                return new e40((sz) ((b40) this.f3440b).f3578b.f4350f, (sd0) this.f3441c.j(), ((y40) this.f3442d).a());
            case 4:
                Context context = (Context) this.f3440b.j();
                u9.a aVarA2 = ((j10) this.f3441c).a();
                xp0 xp0VarA = ((y40) this.f3442d).a();
                uv uvVar = xp0VarA.A;
                if (uvVar == null) {
                    return null;
                }
                bq0 bq0Var = xp0VarA.f12260s;
                return new tv(context, aVarA2, uvVar, bq0Var != null ? bq0Var.f3853b : null);
            case 5:
                n60 n60Var = new n60(((h60) this.f3440b).f6039b.j());
                Set setJ = ((rs1) this.f3441c).j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new o60(n60Var, setJ, gxVar, (ScheduledExecutorService) this.f3442d.j());
            case 6:
                return new g70(((rs1) this.f3440b).j(), ((y40) this.f3441c).a(), ((y40) this.f3442d).b());
            case 7:
                return new t80((Context) this.f3440b.j(), ((rs1) this.f3441c).j(), ((y40) this.f3442d).a());
            case 8:
                ja0 ja0VarA = ((p20) this.f3440b).a();
                ka0 ka0Var = (ka0) ((k50) this.f3441c).f7123b.j();
                gr.G(ka0Var);
                Executor executor = (Executor) this.f3442d.j();
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                return new fb0(ja0VarA, ka0Var, executor, gxVar2);
            case 9:
                return b();
            case 10:
                int i = ((d60) this.f3442d).a().f6583p.f28052c;
                if (i != 0) {
                    return i + (-1) != 0 ? ((ml) this.f3441c).b() : ((ml) this.f3440b).b();
                }
                throw null;
            case 11:
                String str2 = ((ku) ((ho0) this.f3440b).f6205b.f15621d).i;
                gr.G(str2);
                Context contextA = ((d10) this.f3441c).a();
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                Map mapJ = ((os1) this.f3442d).j();
                if (((Boolean) q9.s.f31967e.f31970c.a(al.U5)).booleanValue()) {
                    si siVar = new si(new com.google.android.gms.internal.measurement.i4(contextA, 6));
                    synchronized (siVar) {
                        if (siVar.f10298c) {
                            try {
                                ok okVar = siVar.f10297b;
                                okVar.b();
                                ((pk) okVar.f9560c).A(str2);
                            } catch (NullPointerException e3) {
                                p9.k.C.f31302h.d("AdMobClearcutLogger.modify", e3);
                            }
                        }
                    }
                    setSingleton = Collections.singleton(new s80(new ld0(siVar, mapJ), gxVar3));
                } else {
                    setSingleton = Collections.EMPTY_SET;
                }
                gr.G(setSingleton);
                return setSingleton;
            case 12:
                return new vd0((qd0) ((ls1) this.f3440b).j(), ((rs1) this.f3441c).j(), (ua.a) this.f3442d.j());
            case 13:
                gx gxVar4 = hx.f6279a;
                gr.G(gxVar4);
                u9.l lVar = (u9.l) this.f3440b.j();
                aa.d0 d0Var = (aa.d0) this.f3441c;
                return new wd0(gxVar4, lVar, new ka.k((Context) d0Var.f571b.j(), (u9.a) ((j10) d0Var.f572c).j()), new ba.a(), ((d10) this.f3442d).a());
            case 14:
                Context contextA2 = ((d10) this.f3440b).a();
                WeakReference weakReference = ((b10) this.f3441c).f3555b.f12811d;
                gr.G(weakReference);
                hf0 hf0Var = (hf0) ((ls1) this.f3442d).j();
                gx gxVar5 = hx.f6279a;
                gr.G(gxVar5);
                return new pf0(contextA2, weakReference, hf0Var, gxVar5);
            case 15:
                return a();
            case 16:
                return c();
            case 17:
                c10 c10Var = (c10) this.f3440b;
                gx gxVar6 = hx.f6279a;
                gr.G(gxVar6);
                rl0 rl0Var = new rl0(gxVar6, c10Var.f3994b.a(), 2);
                ua.a aVar2 = (ua.a) ((ls1) this.f3441c).j();
                gr.G(gxVar6);
                return new im0(rl0Var, ((Long) sl.f10325c.r()).longValue(), aVar2, gxVar6, (sd0) ((ls1) this.f3442d).j());
            case 18:
                Context contextA3 = ((c10) this.f3440b).f3994b.a();
                gx gxVar7 = hx.f6279a;
                gr.G(gxVar7);
                rl0 rl0Var2 = new rl0(contextA3, gxVar7, 6);
                ua.a aVar3 = (ua.a) ((ls1) this.f3441c).j();
                gr.G(gxVar7);
                return new im0(rl0Var2, 2147483647L, aVar3, gxVar7, (sd0) ((ls1) this.f3442d).j());
            case 19:
                g10 g10Var = (g10) this.f3440b;
                gx gxVar8 = hx.f6279a;
                gr.G(gxVar8);
                ml0 ml0Var = new ml0(gxVar8, g10Var.f5593b.a(), (tf0) g10Var.f5594c.j(), 4);
                ua.a aVar4 = (ua.a) ((ls1) this.f3441c).j();
                gr.G(gxVar8);
                return new im0(ml0Var, ((Long) sl.f10326d.r()).longValue(), aVar4, gxVar8, (sd0) ((ls1) this.f3442d).j());
            case 20:
                dl0 dl0Var = new dl0(0, ((d10) ((fl0) this.f3440b).f5382a).a());
                ua.a aVar5 = (ua.a) ((ls1) this.f3441c).j();
                gx gxVar9 = hx.f6279a;
                gr.G(gxVar9);
                return new im0(dl0Var, 2147483647L, aVar5, gxVar9, (sd0) ((ls1) this.f3442d).j());
            case 21:
                tl0 tl0VarA = ((vl0) this.f3440b).j();
                ua.a aVar6 = (ua.a) ((ls1) this.f3441c).j();
                gx gxVar10 = hx.f6279a;
                gr.G(gxVar10);
                return new im0(tl0VarA, ((Long) sl.f10323a.r()).longValue(), aVar6, gxVar10, (sd0) ((ls1) this.f3442d).j());
            case 22:
                tl0 tl0VarA2 = ((bm0) this.f3440b).j();
                ua.a aVar7 = (ua.a) ((ls1) this.f3441c).j();
                gx gxVar11 = hx.f6279a;
                gr.G(gxVar11);
                return new im0(tl0VarA2, 2147483647L, aVar7, gxVar11, (sd0) ((ls1) this.f3442d).j());
            case 23:
                rl0 rl0VarJ = ((dm0) this.f3440b).j();
                ua.a aVar8 = (ua.a) ((ls1) this.f3441c).j();
                gx gxVar12 = hx.f6279a;
                gr.G(gxVar12);
                return new im0(rl0VarJ, ((Long) sl.f10324b.r()).longValue(), aVar8, gxVar12, (sd0) ((ls1) this.f3442d).j());
            case 24:
                tl0 tl0VarJ = ((um0) this.f3440b).j();
                ua.a aVar9 = (ua.a) ((ls1) this.f3441c).j();
                gx gxVar13 = hx.f6279a;
                gr.G(gxVar13);
                return new im0(tl0VarJ, ((Long) sl.f10327e.r()).longValue(), aVar9, gxVar13, (sd0) ((ls1) this.f3442d).j());
            case 25:
                ml0 ml0VarJ = ((bn0) this.f3440b).j();
                ua.a aVar10 = (ua.a) ((ls1) this.f3441c).j();
                gx gxVar14 = hx.f6279a;
                gr.G(gxVar14);
                return new im0(ml0VarJ, 2147483647L, aVar10, gxVar14, (sd0) ((ls1) this.f3442d).j());
            case 26:
                gl0 gl0VarA = ((mn0) this.f3440b).j();
                ua.a aVar11 = (ua.a) ((ls1) this.f3441c).j();
                gx gxVar15 = hx.f6279a;
                gr.G(gxVar15);
                return new im0(gl0VarA, ((Long) sl.f10329g.r()).longValue(), aVar11, gxVar15, (sd0) ((ls1) this.f3442d).j());
            case 27:
                rl0 rl0VarJ2 = ((wn0) this.f3440b).j();
                ua.a aVar12 = (ua.a) ((ls1) this.f3441c).j();
                gx gxVar16 = hx.f6279a;
                gr.G(gxVar16);
                return new im0(rl0VarJ2, ((Long) sl.f10330h.r()).longValue(), aVar12, gxVar16, (sd0) ((ls1) this.f3442d).j());
            case 28:
                return d();
            default:
                gr.G(((ku) ((ho0) this.f3440b).f6205b.f15621d).f7300e);
                bx bxVar = (bx) this.f3441c.j();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f3442d.j();
                gx gxVar17 = hx.f6279a;
                gr.G(gxVar17);
                return new ml0(bxVar, scheduledExecutorService2, gxVar17);
        }
    }
}
