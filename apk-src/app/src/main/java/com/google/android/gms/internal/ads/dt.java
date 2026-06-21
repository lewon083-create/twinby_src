package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dt extends cb.a implements et {
    public dt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 1);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void M2(String[] strArr, int[] iArr, xa.a aVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeStringArray(strArr);
        parcelD0.writeIntArray(iArr);
        vg.e(parcelD0, aVar);
        L1(parcelD0, 5);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void k() {
        L1(D0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void s0(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 4);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void w3(xa.a aVar, r9.a aVar2) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, aVar2);
        L1(parcelD0, 6);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void x0(Intent intent) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, intent);
        L1(parcelD0, 1);
    }
}
