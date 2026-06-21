package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c40 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4017a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f4018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f4019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y40 f4020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f4021e;

    public c40(cw cwVar, ls1 ls1Var, j10 j10Var, y40 y40Var, d60 d60Var) {
        this.f4018b = ls1Var;
        this.f4019c = j10Var;
        this.f4020d = y40Var;
        this.f4021e = d60Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f4017a) {
            case 0:
                return new s80(new a40((Context) this.f4018b.j(), ((j10) this.f4019c).a(), this.f4020d.a(), ((d60) this.f4021e).a(), 0), hx.f6285g);
            default:
                return new s80(new a40((Context) this.f4018b.j(), ((j10) this.f4019c).a(), this.f4020d.a(), ((d60) this.f4021e).a(), 1), hx.f6285g);
        }
    }

    public c40(ls1 ls1Var, j10 j10Var, y40 y40Var, d60 d60Var) {
        this.f4018b = ls1Var;
        this.f4019c = j10Var;
        this.f4020d = y40Var;
        this.f4021e = d60Var;
    }
}
