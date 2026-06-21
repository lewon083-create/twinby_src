package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hj0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f6157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f6158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ls1 f6159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f6160e;

    public /* synthetic */ hj0(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, Object obj, int i) {
        this.f6156a = i;
        this.f6157b = ls1Var;
        this.f6158c = ls1Var2;
        this.f6159d = ls1Var3;
        this.f6160e = (qs1) obj;
    }

    public com.google.android.gms.internal.consent_sdk.c a() {
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6160e.j();
        t40 t40Var = (t40) this.f6157b.j();
        oj0 oj0Var = (oj0) this.f6158c.j();
        at0 at0Var = (at0) this.f6159d.j();
        com.google.android.gms.internal.consent_sdk.c cVar = new com.google.android.gms.internal.consent_sdk.c();
        cVar.f13342f = new y81();
        cVar.f13343g = new AtomicBoolean();
        cVar.f13337a = gxVar;
        cVar.f13338b = scheduledExecutorService;
        cVar.f13339c = t40Var;
        cVar.f13340d = oj0Var;
        cVar.f13341e = at0Var;
        return cVar;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final /* bridge */ /* synthetic */ Object j() {
        switch (this.f6156a) {
            case 0:
                return a();
            case 1:
                js1 js1VarB = ls1.b(this.f6157b);
                js1 js1VarB2 = ls1.b(this.f6158c);
                js1 js1VarB3 = ls1.b(this.f6159d);
                ux0 ux0Var = (ux0) this.f6160e.j();
                return new q01(js1VarB, js1VarB2, js1VarB3, ux0Var.L().z(), ux0Var.L().C());
            default:
                return new v11((my0) this.f6157b.j(), (my0) this.f6158c.j(), ls1.b(this.f6159d), (j21) this.f6160e.j());
        }
    }

    public hj0(qs1 qs1Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3) {
        this.f6156a = 0;
        this.f6160e = qs1Var;
        this.f6157b = ls1Var;
        this.f6158c = ls1Var2;
        this.f6159d = ls1Var3;
    }
}
