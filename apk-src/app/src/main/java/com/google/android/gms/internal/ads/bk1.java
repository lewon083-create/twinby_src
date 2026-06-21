package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bk1 extends mk1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yj1 f3804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BigInteger f3805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sl1 f3806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f3807g;

    public bk1(yj1 yj1Var, BigInteger bigInteger, sl1 sl1Var, Integer num) {
        super(15);
        this.f3804d = yj1Var;
        this.f3805e = bigInteger;
        this.f3806f = sl1Var;
        this.f3807g = num;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final Integer B() {
        return this.f3807g;
    }

    @Override // com.google.android.gms.internal.ads.mk1
    public final sl1 h0() {
        return this.f3806f;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ o91 q() {
        return this.f3804d;
    }
}
