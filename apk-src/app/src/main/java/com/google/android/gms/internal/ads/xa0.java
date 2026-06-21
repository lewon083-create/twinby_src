package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xa0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12092a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f12093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v90 f12094c;

    public xa0(v90 v90Var, ls1 ls1Var) {
        this.f12094c = v90Var;
        this.f12093b = ls1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f12092a) {
            case 0:
                kc0 kc0Var = (kc0) this.f12094c.f11316b.f4348d;
                gr.G(kc0Var);
                return new wa0(kc0Var, (ua.a) this.f12093b.j());
            default:
                yc0 yc0Var = (yc0) this.f12093b.j();
                kc0 kc0Var2 = (kc0) this.f12094c.f11316b.f4348d;
                gr.G(kc0Var2);
                return new db0(yc0Var, kc0Var2);
        }
    }

    public xa0(ls1 ls1Var, v90 v90Var) {
        this.f12093b = ls1Var;
        this.f12094c = v90Var;
    }
}
