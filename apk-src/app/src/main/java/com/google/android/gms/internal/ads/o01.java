package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o01 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns1 f8536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f8537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ns1 f8538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ls1 f8539e;

    public /* synthetic */ o01(int i, ls1 ls1Var, ls1 ls1Var2, ns1 ns1Var, ns1 ns1Var2) {
        this.f8535a = i;
        this.f8536b = ns1Var;
        this.f8537c = ls1Var;
        this.f8539e = ls1Var2;
        this.f8538d = ns1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f8535a) {
            case 0:
                return new n01((Context) this.f8536b.f8433a, (j21) this.f8537c.j(), (nz0) this.f8539e.j(), (ux0) this.f8538d.f8433a);
            case 1:
                return new b21((Context) this.f8536b.f8433a, (j21) this.f8537c.j(), (ux0) this.f8538d.f8433a, (r81) this.f8539e.j());
            default:
                return new b21((Context) this.f8536b.f8433a, (j21) this.f8537c.j(), (r81) this.f8539e.j(), (ux0) this.f8538d.f8433a);
        }
    }

    public o01(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, ls1 ls1Var2) {
        this.f8535a = 1;
        this.f8536b = ns1Var;
        this.f8537c = ls1Var;
        this.f8538d = ns1Var2;
        this.f8539e = ls1Var2;
    }
}
