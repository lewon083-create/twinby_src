package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bw implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f3923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ns1 f3924c;

    public /* synthetic */ bw(ls1 ls1Var, ns1 ns1Var, int i) {
        this.f3922a = i;
        this.f3923b = ls1Var;
        this.f3924c = ns1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f3922a) {
            case 0:
                return new n90(5, (ua.a) this.f3924c.f8433a, (zv) this.f3923b.j());
            case 1:
                return new jd0((si) this.f3923b.j(), (gp0) this.f3924c.f8433a);
            case 2:
                Context context = (Context) this.f3923b.j();
                q10 q10Var = (q10) this.f3924c.f8433a;
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new li0(context, q10Var, gxVar, 0);
            case 3:
                return new ni0((Context) this.f3923b.j(), (q10) this.f3924c.f8433a, 0);
            case 4:
                return new ti0((Context) this.f3923b.j(), (s10) this.f3924c.f8433a);
            case 5:
                return new ni0((Context) this.f3923b.j(), (w10) this.f3924c.f8433a, 1);
            default:
                return new ni0((Context) this.f3923b.j(), (z10) this.f3924c.f8433a, 2);
        }
    }

    public bw(ns1 ns1Var, ls1 ls1Var) {
        this.f3922a = 0;
        this.f3924c = ns1Var;
        this.f3923b = ls1Var;
    }
}
