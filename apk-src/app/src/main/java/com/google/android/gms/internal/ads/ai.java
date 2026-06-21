package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ai extends cb.a implements di {
    @Override // com.google.android.gms.internal.ads.di
    public final void E(int i) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(i);
        L1(parcelD0, 2);
    }

    @Override // com.google.android.gms.internal.ads.di
    public final void d0(q9.x1 x1Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, x1Var);
        L1(parcelD0, 3);
    }

    @Override // com.google.android.gms.internal.ads.di
    public final void q2(zh zhVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, zhVar);
        L1(parcelD0, 1);
    }
}
