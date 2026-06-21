package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c10 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d10 f3994b;

    public /* synthetic */ c10(d10 d10Var, int i) {
        this.f3993a = i;
        this.f3994b = d10Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f3993a) {
            case 0:
                ApplicationInfo applicationInfo = this.f3994b.a().getApplicationInfo();
                gr.G(applicationInfo);
                return applicationInfo;
            case 1:
                return new hv0(this.f3994b.a(), p9.k.C.f31313t.i());
            case 2:
                return oq0.l(this.f3994b.a());
            case 3:
                return new ue0(this.f3994b.a());
            case 4:
                return new qf0(this.f3994b.a());
            case 5:
                return new rf0(this.f3994b.a());
            case 6:
                Context contextA = this.f3994b.a();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new kh0(contextA, gxVar);
            case 7:
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                return new rl0(gxVar2, this.f3994b.a(), 2);
            case 8:
                Context contextA2 = this.f3994b.a();
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                return new rl0(contextA2, gxVar3, 6);
            default:
                return new co0(this.f3994b.a());
        }
    }
}
