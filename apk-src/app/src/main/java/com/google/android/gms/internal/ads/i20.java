package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i20 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f6343b;

    public /* synthetic */ i20(qs1 qs1Var, int i) {
        this.f6342a = i;
        this.f6343b = qs1Var;
    }

    public jg0 a() {
        Context contextA = ((d10) this.f6343b).a();
        jg0 jg0Var = new jg0();
        jg0Var.i = 1;
        jg0Var.f6138g = new ki(contextA, p9.k.C.f31313t.i(), jg0Var, jg0Var, 2);
        return jg0Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        Object e51Var;
        int i = this.f6342a;
        int i10 = 0;
        int i11 = 1;
        qs1 qs1Var = this.f6343b;
        switch (i) {
            case 0:
                return new t9.u(((d10) qs1Var).a());
            case 1:
                return new l20(((a10) qs1Var).j(), 0);
            case 2:
                return new l20(((a10) qs1Var).j(), 1);
            case 3:
                return new m20((ff0) qs1Var.j(), 0);
            case 4:
                return new q20(0, (ff0) qs1Var.j());
            case 5:
                return new t20(((d10) qs1Var).a());
            case 6:
                return new o20(i11, (wp0) qs1Var.j());
            case 7:
                cw cwVarO = cw.o(((h20) qs1Var).f6003a.a());
                return new q20(1, new n90(5, (ua.a) cwVarO.f4347c, (zv) ((ls1) cwVarO.f4349e).j()));
            case 8:
                return new m20((ff0) qs1Var.j(), 1);
            case 9:
                return new br(((wq) qs1Var.j()).f11874a);
            case 10:
                return new s80(new z30(i10, (n70) ((o40) qs1Var).f8607a.f8248c), hx.f6285g);
            case 11:
                return new s80((i50) qs1Var.j(), hx.f6285g);
            case 12:
                return new s80((i50) qs1Var.j(), hx.f6285g);
            case 13:
                return ((v30) qs1Var).j();
            case 14:
                u9.a aVarA = ((j10) qs1Var).a();
                t9.g0 g0Var = p9.k.C.f31297c;
                return new dh(UUID.randomUUID().toString(), aVarA, "native", new JSONObject(), true);
            case 15:
                String packageName = ((d10) qs1Var).a().getPackageName();
                gr.G(packageName);
                return packageName;
            case 16:
                Context contextA = ((d10) qs1Var).a();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new dg0(contextA, gxVar, 1);
            case 17:
                return a();
            case 18:
                return new ox0(26, ((l10) qs1Var).j());
            case 19:
                return new ch0(((d10) qs1Var).a());
            case 20:
                return new xh0(((d10) qs1Var).a());
            case 21:
                return new yh0(((d10) qs1Var).a());
            case 22:
                return new jk0((gd0) qs1Var.j());
            case 23:
                return new uk0((sd0) qs1Var.j());
            case 24:
                return new dl0(1, (Set) qs1Var.j());
            case 25:
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                return new rl0(gxVar2, ((d10) qs1Var).a(), 0);
            case 26:
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                jm0 jm0Var = new jm0(gxVar3, 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) qs1Var.j();
                if (((Boolean) q9.s.f31967e.f31970c.a(al.O4)).booleanValue()) {
                    hl0 hl0Var = new hl0(jm0Var, ((Integer) r3.f31970c.a(al.P4)).intValue(), scheduledExecutorService);
                    int i12 = d51.f4468d;
                    e51Var = new e51(hl0Var);
                } else {
                    int i13 = d51.f4468d;
                    e51Var = x51.f12049k;
                }
                gr.G(e51Var);
                return e51Var;
            case 27:
                gx gxVar4 = hx.f6279a;
                gr.G(gxVar4);
                return new hl0(new jm0(gxVar4, 1), ((Integer) q9.s.f31967e.f31970c.a(al.f3261wd)).intValue(), (ScheduledExecutorService) qs1Var.j());
            case 28:
                Context contextA2 = ((d10) qs1Var).a();
                gx gxVar5 = hx.f6279a;
                gr.G(gxVar5);
                return new rl0(contextA2, gxVar5, 3);
            default:
                gx gxVar6 = hx.f6279a;
                gr.G(gxVar6);
                return new rl0(gxVar6, ((d10) qs1Var).a(), 4);
        }
    }
}
