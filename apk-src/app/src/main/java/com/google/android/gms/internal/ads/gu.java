package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gu extends ug implements hu {
    public gu() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) vg.b(parcel, ParcelFileDescriptor.CREATOR);
            vg.f(parcel);
            Y2(parcelFileDescriptor);
        } else if (i == 2) {
            t9.o oVar = (t9.o) vg.b(parcel, t9.o.CREATOR);
            vg.f(parcel);
            g1(oVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) vg.b(parcel, ParcelFileDescriptor.CREATOR);
            ku kuVar = (ku) vg.b(parcel, ku.CREATOR);
            vg.f(parcel);
            a3(parcelFileDescriptor2, kuVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
