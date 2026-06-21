package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f12138b;

    public /* synthetic */ xe0(ls1 ls1Var, int i) {
        this.f12137a = i;
        this.f12138b = ls1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f12137a) {
            case 0:
                we0 we0Var = (we0) this.f12138b.j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new s80(we0Var, gxVar);
            case 1:
                we0 we0Var2 = (we0) this.f12138b.j();
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                return new s80(we0Var2, gxVar2);
            case 2:
                we0 we0Var3 = (we0) this.f12138b.j();
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                return new s80(we0Var3, gxVar3);
            case 3:
                return new s80((vf0) this.f12138b.j(), hx.f6285g);
            case 4:
                return new s80((vf0) this.f12138b.j(), hx.f6285g);
            case 5:
                return new s80((vf0) this.f12138b.j(), hx.f6285g);
            case 6:
                Context context = (Context) this.f12138b.j();
                gx gxVar4 = hx.f6279a;
                gr.G(gxVar4);
                return new dg0(context, gxVar4, 0);
            case 7:
                dh0 dh0Var = (dh0) this.f12138b.j();
                gx gxVar5 = hx.f6279a;
                gr.G(gxVar5);
                return new s80(dh0Var, gxVar5);
            case 8:
                dh0 dh0Var2 = (dh0) this.f12138b.j();
                gx gxVar6 = hx.f6279a;
                gr.G(gxVar6);
                return new s80(dh0Var2, gxVar6);
            case 9:
                return new jq0((xe) this.f12138b.j());
            case 10:
                return new s80((rq0) this.f12138b.j(), hx.f6285g);
            case 11:
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f12138b.j()));
                gr.G(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
                return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
            case 12:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f12138b.j();
                gx gxVar7 = hx.f6279a;
                gr.G(gxVar7);
                return new mr0(scheduledExecutorService, gxVar7);
            case 13:
                return new zs0((kh0) this.f12138b.j());
            case 14:
                return new nz0((j21) this.f12138b.j());
            default:
                return new e21();
        }
    }
}
