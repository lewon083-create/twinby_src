package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vp0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f11438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11440d;

    public /* synthetic */ vp0(int i, ls1 ls1Var, ls1 ls1Var2, Object obj) {
        this.f11437a = i;
        this.f11438b = ls1Var;
        this.f11439c = ls1Var2;
        this.f11440d = obj;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f11437a) {
            case 0:
                return new up0((rp0) this.f11438b.j(), (np0) ((ls1) this.f11439c).j(), (fq0) ((ls1) this.f11440d).j());
            case 1:
                fy0 fy0Var = ((ux0) ((ns1) this.f11440d).f8433a).W() ? (fy0) ls1.b(this.f11438b).j() : (fy0) ls1.b((ls1) this.f11439c).j();
                gr.G(fy0Var);
                return fy0Var;
            default:
                Context context = (Context) ((ns1) this.f11439c).f8433a;
                return new h21(context, (ExecutorService) ((ns1) this.f11440d).f8433a, h21.f6004h);
        }
    }

    public vp0(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2) {
        this.f11437a = 2;
        this.f11439c = ns1Var;
        this.f11438b = ls1Var;
        this.f11440d = ns1Var2;
    }
}
