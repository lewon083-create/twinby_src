package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f01 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns1 f5162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f5163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f5164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f5165e;

    public /* synthetic */ f01(int i, ls1 ls1Var, ls1 ls1Var2, ns1 ns1Var, ns1 ns1Var2) {
        this.f5161a = i;
        this.f5162b = ns1Var;
        this.f5163c = ls1Var;
        this.f5164d = ns1Var2;
        this.f5165e = ls1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f5161a) {
            case 0:
                return new e01((jd) this.f5162b.f8433a, (wz0) this.f5163c.j(), (Context) this.f5164d.j(), (j21) this.f5165e.j(), 0);
            case 1:
                return new g01((jd) this.f5162b.f8433a, (wz0) this.f5163c.j(), (ux0) this.f5164d.j(), (j21) this.f5165e.j());
            default:
                return new e01((jd) this.f5162b.f8433a, (wz0) this.f5163c.j(), (Context) this.f5164d.j(), (j21) this.f5165e.j(), 1);
        }
    }
}
