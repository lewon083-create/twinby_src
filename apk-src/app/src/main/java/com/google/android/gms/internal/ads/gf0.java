package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gf0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d10 f5790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j10 f5791c;

    public /* synthetic */ gf0(d10 d10Var, j10 j10Var, int i) {
        this.f5789a = i;
        this.f5790b = d10Var;
        this.f5791c = j10Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f5789a) {
            case 0:
                return new hf0(this.f5790b.a(), this.f5791c.a());
            default:
                Context contextA = this.f5790b.a();
                u9.a aVarA = this.f5791c.a();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new tf0(contextA, aVarA, gxVar);
        }
    }
}
