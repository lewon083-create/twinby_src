package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a01 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns1 f2674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f2675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ns1 f2676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ns1 f2677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qs1 f2678f;

    public /* synthetic */ a01(ns1 ns1Var, ls1 ls1Var, ns1 ns1Var2, ns1 ns1Var3, ls1 ls1Var2, int i) {
        this.f2673a = i;
        this.f2674b = ns1Var;
        this.f2675c = ls1Var;
        this.f2676d = ns1Var2;
        this.f2677e = ns1Var3;
        this.f2678f = ls1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f2673a) {
            case 0:
                return new zz0((jd) this.f2674b.f8433a, (wz0) this.f2675c.j(), (View) this.f2676d.f8433a, (Activity) this.f2677e.f8433a, (j21) this.f2678f.j());
            default:
                return new zz0((jd) this.f2674b.f8433a, (wz0) this.f2675c.j(), (by0) this.f2676d.f8433a, (Map) this.f2677e.f8433a, (j21) this.f2678f.j());
        }
    }
}
