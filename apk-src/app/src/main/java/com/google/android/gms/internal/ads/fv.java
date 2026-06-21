package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fv extends cb.a implements hv {
    @Override // com.google.android.gms.internal.ads.hv
    public final void A3(q9.x1 x1Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, x1Var);
        L1(parcelD0, 5);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void Z2(bv bvVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, bvVar);
        L1(parcelD0, 3);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void b(int i) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(i);
        L1(parcelD0, 4);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void c() {
        L1(D0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void d() {
        L1(D0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void i() {
        L1(D0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.hv
    public final void n() {
        L1(D0(), 7);
    }
}
