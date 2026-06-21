package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ox implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qx f8848c;

    public /* synthetic */ ox(qx qxVar, int i) {
        this.f8847b = i;
        this.f8848c = qxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8847b) {
            case 0:
                vx vxVar = this.f8848c.f9633r;
                if (vxVar != null) {
                    vxVar.h();
                }
                break;
            case 1:
                vx vxVar2 = this.f8848c.f9633r;
                if (vxVar2 != null) {
                    ux uxVar = vxVar2.f11509f;
                    uxVar.f11124d = false;
                    t9.d0 d0Var = t9.g0.f33596l;
                    d0Var.removeCallbacks(uxVar);
                    d0Var.postDelayed(uxVar, 250L);
                    d0Var.post(new tx(vxVar2, 0));
                }
                break;
            case 2:
                qx qxVar = this.f8848c;
                vx vxVar3 = qxVar.f9633r;
                if (vxVar3 != null) {
                    vxVar3.g();
                    qxVar.f9633r.i();
                }
                break;
            case 3:
                qx qxVar2 = this.f8848c;
                vx vxVar4 = qxVar2.f9633r;
                if (vxVar4 != null) {
                    if (!qxVar2.f9634s) {
                        vxVar4.k();
                        qxVar2.f9634s = true;
                    }
                    qxVar2.f9633r.f();
                }
                break;
            default:
                vx vxVar5 = this.f8848c.f9633r;
                if (vxVar5 != null) {
                    vxVar5.g();
                }
                break;
        }
    }
}
