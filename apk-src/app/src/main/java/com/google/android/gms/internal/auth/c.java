package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = i0.o.S(parcel);
        String strN = null;
        int iH = 0;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            char c8 = (char) i;
            if (c8 == 1) {
                iH = i0.o.H(parcel, i);
            } else if (c8 != 2) {
                i0.o.O(parcel, i);
            } else {
                strN = i0.o.n(parcel, i);
            }
        }
        i0.o.v(parcel, iS);
        return new b(iH, strN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}
