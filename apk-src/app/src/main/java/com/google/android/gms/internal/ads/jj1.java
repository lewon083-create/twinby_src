package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jj1 extends mk1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hj1 f6859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ECPoint f6860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sl1 f6861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f6862g;

    public jj1(hj1 hj1Var, ECPoint eCPoint, sl1 sl1Var, Integer num) {
        super(15);
        this.f6859d = hj1Var;
        this.f6860e = eCPoint;
        this.f6861f = sl1Var;
        this.f6862g = num;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final Integer B() {
        return this.f6862g;
    }

    @Override // com.google.android.gms.internal.ads.mk1
    public final sl1 h0() {
        return this.f6861f;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ o91 q() {
        return this.f6859d;
    }
}
