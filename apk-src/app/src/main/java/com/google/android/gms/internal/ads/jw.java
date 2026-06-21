package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jw implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f6950c;

    public /* synthetic */ jw(Object obj, qs1 qs1Var, int i) {
        this.f6948a = i;
        this.f6949b = obj;
        this.f6950c = qs1Var;
    }

    public ut a() {
        return new ut(16, new ch0(((d10) ((i20) this.f6949b).f6343b).a()), (r81) this.f6950c.j());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        View view;
        switch (this.f6948a) {
            case 0:
                Context context = (Context) ((ns1) this.f6949b).f8433a;
                bw bwVar = (bw) this.f6950c;
                return new iw(context, new n90(5, (ua.a) bwVar.f3924c.f8433a, (zv) bwVar.f3923b.j()));
            case 1:
                return new n90(7, ((os1) this.f6949b).j(), ((os1) this.f6950c).j());
            case 2:
                return ((cw) this.f6949b).v(((rs1) this.f6950c).j());
            case 3:
                return new hl0(((aw) this.f6949b).c(), ((Integer) q9.s.f31967e.f31970c.a(al.Hd)).intValue(), (ScheduledExecutorService) this.f6950c.j());
            case 4:
                return new hl0(new dl0(2, ((tc0) this.f6949b).f10589b.a()), ((Integer) q9.s.f31967e.f31970c.a(al.Md)).intValue(), (ScheduledExecutorService) this.f6950c.j());
            case 5:
                return new hl0(((aw) this.f6949b).d(), ((Integer) q9.s.f31967e.f31970c.a(al.Id)).intValue(), (ScheduledExecutorService) this.f6950c.j());
            case 6:
                Boolean bool = (Boolean) q9.s.f31967e.f31970c.a(al.f3225u6);
                bool.booleanValue();
                return true == bool.booleanValue() ? ((y30) this.f6949b).c() : ((ml) this.f6950c).b();
            case 7:
                return new g40((sz) ((b40) this.f6949b).f3578b.f4350f, (Executor) this.f6950c.j());
            case 8:
                String str = (String) ((ls1) this.f6950c).j();
                ei0 ei0Var = ((a60) this.f6949b).f2791f;
                return ei0Var != null ? ei0Var : new ei0(str);
            case 9:
                ((d10) this.f6950c).a();
                Context context2 = ((a60) this.f6949b).f2786a;
                gr.G(context2);
                return context2;
            case 10:
                Set setJ = ((rs1) this.f6950c).j();
                g80 g80Var = (g80) this.f6949b;
                if (g80Var.f5698p == null) {
                    g80Var.f5698p = new k60(setJ);
                }
                k60 k60Var = g80Var.f5698p;
                gr.G(k60Var);
                return k60Var;
            case 11:
                return new c90((cd0) ((qs1) this.f6949b).j(), ((y40) this.f6950c).f12492b.s());
            case 12:
                Set setU = ((ut) this.f6949b).u((q50) ((ls1) this.f6950c).j());
                gr.G(setU);
                return setU;
            case 13:
                return new s80(new z30(1, (sz) ((ut) this.f6949b).f11062d), (Executor) this.f6950c.j());
            case 14:
                xp0 xp0VarA = ((y40) this.f6949b).a();
                JSONObject jSONObject = (JSONObject) ((v90) this.f6950c).f11316b.f4347c;
                gr.G(jSONObject);
                return new ka0(xp0VarA, jSONObject);
            case 15:
                return new s80(new oc0(((z90) this.f6949b).f12920b.a()), (Executor) this.f6950c.j());
            case 16:
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new oq0(13, gxVar, ((rb0) this.f6949b).j(), (qd0) ((ls1) this.f6950c).j(), false);
            case 17:
                fa0 fa0Var = (fa0) ((wm0) this.f6949b).j();
                ja0 ja0VarA = ((p20) this.f6950c).a();
                zb0 zb0Var = new zb0("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                synchronized (ja0VarA) {
                    view = ja0VarA.f6779o;
                }
                zb0Var.f12940b = view;
                zb0Var.f12941c = ja0VarA.r();
                zb0Var.f12942d = fa0Var;
                zb0Var.f12943e = false;
                zb0Var.f12944f = false;
                if (ja0VarA.h() != null) {
                    ja0VarA.h().H0(zb0Var);
                }
                return zb0Var;
            case 18:
                return new pc0((w60) ((ls1) this.f6949b).j(), ((y40) this.f6950c).a());
            case 19:
                return new gd0(oq0.l(((c10) this.f6949b).f3994b.a()), (fd0) ((ls1) this.f6950c).j());
            case 20:
                return new ld0((si) ((ls1) this.f6949b).j(), ((os1) this.f6950c).j());
            case 21:
                return new he0((u10) ((ns1) this.f6949b).f8433a, new gk0(21, (hp) ((ge0) this.f6950c).f5787b.f8433a));
            case 22:
                gx gxVar2 = hx.f6280b;
                gr.G(gxVar2);
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                return new cw(gxVar2, gxVar3, new dg0((Context) ((xe0) this.f6949b).f12138b.j(), gxVar3, 0), ls1.b((j40) this.f6950c), 16, false);
            case 23:
                Map map = ((ps1) this.f6949b).f7291a;
                gx gxVar4 = hx.f6279a;
                gr.G(gxVar4);
                return new mg0(map, gxVar4, new p70(((h60) this.f6950c).f6039b.j()));
            case 24:
                gx gxVar5 = hx.f6279a;
                gr.G(gxVar5);
                return new oq0(14, gxVar5, ((i20) this.f6949b).a(), ls1.b((j40) this.f6950c), false);
            case 25:
                return a();
            case 26:
                return new dh0(((j40) this.f6949b).b(), ((a10) this.f6950c).j());
            case 27:
                return new fh0(((jw) this.f6949b).a(), ((a10) this.f6950c).j());
            case 28:
                eh0 eh0Var = (eh0) ((ls1) this.f6949b).j();
                jw jwVar = (jw) this.f6950c;
                return new ld0(eh0Var, new fh0(((jw) jwVar.f6949b).a(), ((a10) jwVar.f6950c).j()));
            default:
                return new hl0(((p50) this.f6949b).a(), ((Integer) q9.s.f31967e.f31970c.a(al.Ed)).intValue(), (ScheduledExecutorService) this.f6950c.j());
        }
    }
}
