package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qj0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f9516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f9517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f9518d;

    public /* synthetic */ qj0(qs1 qs1Var, qs1 qs1Var2, qs1 qs1Var3, int i) {
        this.f9515a = i;
        this.f9516b = qs1Var;
        this.f9517c = qs1Var2;
        this.f9518d = qs1Var3;
    }

    public gl0 a() {
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        return new gl0(gxVar, (gd0) this.f9516b.j(), (se0) this.f9517c.j(), (ql0) this.f9518d.j(), 2);
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f9515a) {
            case 0:
                return new oq0(22, (nq0) this.f9516b.j(), (fd0) this.f9517c.j(), (sd0) this.f9518d.j(), false);
            case 1:
                return a();
            case 2:
                Context contextA = ((d10) this.f9516b).a();
                bx bxVar = (bx) this.f9517c.j();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f9518d.j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new wl0(contextA, bxVar, scheduledExecutorService, gxVar);
            case 3:
                Object dl0Var = new dl0(0, ((d10) ((fl0) this.f9516b).f5382a).a());
                im0 im0Var = (im0) this.f9517c.j();
                if (true == ((List) this.f9518d.j()).contains("2")) {
                    dl0Var = im0Var;
                }
                gr.G(dl0Var);
                return dl0Var;
            case 4:
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                jm0 jm0Var = new jm0(gxVar2, 2);
                im0 im0Var2 = (im0) this.f9516b.j();
                List list = (List) this.f9517c.j();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f9518d.j();
                if (list.contains("24")) {
                    return new hl0(im0Var2, ((Integer) q9.s.f31967e.f31970c.a(al.f3217td)).intValue(), scheduledExecutorService2);
                }
                return new hl0(jm0Var, ((Integer) q9.s.f31967e.f31970c.a(al.f3217td)).intValue(), scheduledExecutorService2);
            case 5:
                Object objJ = ((bn0) this.f9516b).j();
                im0 im0Var3 = (im0) this.f9517c.j();
                if (true == ((List) this.f9518d.j()).contains("29")) {
                    objJ = im0Var3;
                }
                gr.G(objJ);
                return objJ;
            case 6:
                return new z01((Context) this.f9516b.j(), (ux0) this.f9517c.j(), (z11) this.f9518d.j());
            case 7:
                return new y01((Context) this.f9516b.j(), (ExecutorService) this.f9517c.j(), (qy0) this.f9518d.j());
            default:
                return new y11((j21) this.f9517c.j(), ((ux0) this.f9518d.j()).L().A());
        }
    }
}
