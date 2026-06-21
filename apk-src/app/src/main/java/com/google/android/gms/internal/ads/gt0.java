package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gt0 extends bi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y81 f5902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q9.x2 f5903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0 f5904d;

    public gt0(ht0 ht0Var, y81 y81Var, q9.x2 x2Var) {
        this.f5902b = y81Var;
        this.f5903c = x2Var;
        this.f5904d = ht0Var;
    }

    @Override // com.google.android.gms.internal.ads.di
    public final void d0(q9.x1 x1Var) {
        String string = x1Var.e().toString();
        String str = this.f5903c.f31981b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb2.append("Failed to load app open ad with error parcel: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        u9.i.h(sb2.toString());
        ht0 ht0Var = this.f5904d;
        Objects.requireNonNull(ht0Var);
        ht0Var.a(x1Var);
    }

    @Override // com.google.android.gms.internal.ads.di
    public final void q2(zh zhVar) {
        Objects.requireNonNull(this.f5904d);
        this.f5902b.e(zhVar);
    }

    @Override // com.google.android.gms.internal.ads.di
    public final void E(int i) {
    }
}
