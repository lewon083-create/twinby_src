package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gy implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jy f5979c;

    public /* synthetic */ gy(jy jyVar, int i) {
        this.f5978b = i;
        this.f5979c = jyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5978b) {
            case 0:
                vx vxVar = this.f5979c.f6993h;
                if (vxVar != null) {
                    vxVar.e();
                }
                break;
            case 1:
                vx vxVar2 = this.f5979c.f6993h;
                if (vxVar2 != null) {
                    vxVar2.k();
                }
                break;
            case 2:
                vx vxVar3 = this.f5979c.f6993h;
                if (vxVar3 != null) {
                    vxVar3.h();
                }
                break;
            case 3:
                vx vxVar4 = this.f5979c.f6993h;
                if (vxVar4 != null) {
                    vxVar4.f();
                }
                break;
            case 4:
                vx vxVar5 = this.f5979c.f6993h;
                if (vxVar5 != null) {
                    vxVar5.g();
                }
                break;
            case 5:
                vx vxVar6 = this.f5979c.f6993h;
                if (vxVar6 != null) {
                    ux uxVar = vxVar6.f11509f;
                    uxVar.f11124d = false;
                    t9.d0 d0Var = t9.g0.f33596l;
                    d0Var.removeCallbacks(uxVar);
                    d0Var.postDelayed(uxVar, 250L);
                    d0Var.post(new tx(vxVar6, 0));
                }
                break;
            case 6:
                vx vxVar7 = this.f5979c.f6993h;
                if (vxVar7 != null) {
                    vxVar7.i();
                }
                break;
            default:
                jy jyVar = this.f5979c;
                fy fyVar = jyVar.f10425c;
                float f10 = fyVar.f5502c ? fyVar.f5504e ? 0.0f : fyVar.f5505f : 0.0f;
                jz jzVar = jyVar.f6994j;
                if (jzVar == null) {
                    u9.i.h("Trying to set volume before player is initialized.");
                } else {
                    try {
                        vu1 vu1Var = jzVar.f7016h;
                        if (vu1Var != null) {
                            vu1Var.f11492e.b();
                            vu1Var.f11491d.F1(f10);
                        }
                    } catch (IOException e3) {
                        u9.i.i("", e3);
                        return;
                    }
                }
                break;
        }
    }
}
