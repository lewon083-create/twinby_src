package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d40 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f4452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f4453c;

    public /* synthetic */ d40(qs1 qs1Var, qs1 qs1Var2, int i) {
        this.f4451a = i;
        this.f4452b = qs1Var;
        this.f4453c = qs1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f4451a) {
            case 0:
                return new dw(((d10) this.f4452b).a(), ((d60) this.f4453c).a().f6575g);
            case 1:
                return new f50((h50) this.f4452b.j(), ((d60) this.f4453c).a());
            case 2:
                return new dw(((d10) this.f4452b).a(), ((d60) this.f4453c).a().f6575g);
            case 3:
                t9.u uVar = (t9.u) this.f4452b.j();
                ua.a aVar = (ua.a) this.f4453c.j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new jb0(uVar, aVar, gxVar);
            case 4:
                return new ae0((zd0) this.f4452b.j(), (n10) this.f4453c.j());
            case 5:
                return new vf0(((d10) this.f4452b).a(), (sd0) this.f4453c.j());
            case 6:
                return new kg0(((d10) this.f4452b).a(), (fw) this.f4453c.j());
            case 7:
                return new hl0((im0) this.f4452b.j(), ((Integer) q9.s.f31967e.f31970c.a(al.f3304zd)).intValue(), (ScheduledExecutorService) this.f4453c.j());
            case 8:
                return new hl0((im0) this.f4452b.j(), ((Integer) q9.s.f31967e.f31970c.a(al.f3113md)).intValue(), (ScheduledExecutorService) this.f4453c.j());
            case 9:
                fw fwVar = (fw) this.f4452b.j();
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                return new ml0(fwVar, gxVar2, ((d10) this.f4453c).a(), 3);
            case 10:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f4452b.j();
                ((d10) this.f4453c).a();
                return new dl0(6, scheduledExecutorService);
            case 11:
                return new rq0(((d10) this.f4452b).a(), ((k10) this.f4453c).j());
            default:
                return new ur0(((d10) this.f4452b).a(), (as0) this.f4453c.j());
        }
    }
}
