package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nw extends cb.a implements pw {
    public nw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 1);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final void V(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 8);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final void q3(xa.a aVar, tw twVar, mw mwVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, twVar);
        vg.e(parcelD0, mwVar);
        L1(parcelD0, 1);
    }
}
