package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oa0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8649a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d60 f8650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f8651c;

    public oa0(d10 d10Var, d60 d60Var) {
        this.f8651c = d10Var;
        this.f8650b = d60Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f8649a) {
            case 0:
                return new dw(((d10) this.f8651c).a(), this.f8650b.a().f6575g);
            default:
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new ml0(gxVar, this.f8650b.a(), ((k10) this.f8651c).j(), 1);
        }
    }

    public oa0(d60 d60Var, qs1 qs1Var) {
        this.f8650b = d60Var;
        this.f8651c = qs1Var;
    }
}
