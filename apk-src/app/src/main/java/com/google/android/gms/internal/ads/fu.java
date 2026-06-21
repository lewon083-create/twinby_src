package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fu extends cb.a implements hu {
    public fu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener", 1);
    }

    @Override // com.google.android.gms.internal.ads.hu
    public final void Y2(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, parcelFileDescriptor);
        L1(parcelD0, 1);
    }

    @Override // com.google.android.gms.internal.ads.hu
    public final void a3(ParcelFileDescriptor parcelFileDescriptor, ku kuVar) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, parcelFileDescriptor);
        vg.c(parcelD0, kuVar);
        L1(parcelD0, 3);
    }

    @Override // com.google.android.gms.internal.ads.hu
    public final void g1(t9.o oVar) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, oVar);
        L1(parcelD0, 2);
    }
}
