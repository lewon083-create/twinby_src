package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c01 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3986a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns1 f3987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f3988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ns1 f3989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f3990e;

    public c01(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, ls1 ls1Var2) {
        this.f3987b = ns1Var;
        this.f3988c = ls1Var;
        this.f3989d = ns1Var2;
        this.f3990e = ls1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f3986a) {
            case 0:
                return new b01((jd) this.f3987b.f8433a, (Map) this.f3989d.f8433a, (ux0) this.f3988c.j(), (j21) this.f3990e.j());
            default:
                return new g01((jd) this.f3987b.f8433a, (wz0) this.f3988c.j(), (Map) this.f3989d.f8433a, (j21) this.f3990e.j());
        }
    }

    public c01(ns1 ns1Var, ns1 ns1Var2, ns1 ns1Var3, ls1 ls1Var) {
        this.f3987b = ns1Var;
        this.f3989d = ns1Var2;
        this.f3988c = ns1Var3;
        this.f3990e = ls1Var;
    }
}
