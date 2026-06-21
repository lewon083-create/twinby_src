package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class du extends cb.a implements eu {
    @Override // com.google.android.gms.internal.ads.eu
    public final void D1(ku kuVar, hu huVar) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, kuVar);
        vg.e(parcelD0, huVar);
        L1(parcelD0, 6);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void L0(ku kuVar, hu huVar) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, kuVar);
        vg.e(parcelD0, huVar);
        L1(parcelD0, 4);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void W3(String str, hu huVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        vg.e(parcelD0, huVar);
        L1(parcelD0, 7);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void Z1(ku kuVar, hu huVar) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, kuVar);
        vg.e(parcelD0, huVar);
        L1(parcelD0, 5);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void v0(String str) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        L1(parcelD0, 9);
    }
}
