package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j50 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6720a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d10 f6721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j10 f6722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ls1 f6723d;

    public j50(d10 d10Var, j10 j10Var, ls1 ls1Var) {
        this.f6721b = d10Var;
        this.f6722c = j10Var;
        this.f6723d = ls1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f6720a) {
            case 0:
                Context contextA = this.f6721b.a();
                bs0 bs0Var = (bs0) this.f6723d.j();
                u9.a aVarA = this.f6722c.a();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new i50(contextA, bs0Var, aVarA, gxVar);
            default:
                wq wqVarN = new cw(6).n(this.f6721b.a(), this.f6722c.a(), (bs0) this.f6723d.j());
                gr.G(wqVarN);
                return wqVarN;
        }
    }

    public j50(d10 d10Var, ls1 ls1Var, j10 j10Var) {
        this.f6721b = d10Var;
        this.f6723d = ls1Var;
        this.f6722c = j10Var;
    }
}
