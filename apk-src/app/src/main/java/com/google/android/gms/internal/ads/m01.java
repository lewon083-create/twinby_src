package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m01 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7705a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns1 f7706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f7707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ls1 f7708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ns1 f7709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f7710f;

    public m01(ns1 ns1Var, ls1 ls1Var, ls1 ls1Var2, ns1 ns1Var2, ls1 ls1Var3) {
        this.f7706b = ns1Var;
        this.f7707c = ls1Var;
        this.f7708d = ls1Var2;
        this.f7709e = ns1Var2;
        this.f7710f = ls1Var3;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f7705a) {
            case 0:
                return new i01((jd) this.f7706b.f8433a, (wz0) this.f7707c.j(), (Map) this.f7709e.f8433a, (DisplayMetrics) this.f7708d.j(), (j21) this.f7710f.j());
            default:
                return new zz0((jd) this.f7706b.f8433a, (wz0) this.f7707c.j(), (DisplayMetrics) this.f7708d.j(), (View) this.f7709e.f8433a, (j21) this.f7710f.j());
        }
    }

    public m01(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, ls1 ls1Var2, ls1 ls1Var3) {
        this.f7706b = ns1Var;
        this.f7707c = ls1Var;
        this.f7709e = ns1Var2;
        this.f7708d = ls1Var2;
        this.f7710f = ls1Var3;
    }
}
