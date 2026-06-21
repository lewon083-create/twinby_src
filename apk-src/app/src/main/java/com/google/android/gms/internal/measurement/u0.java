package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13979a;

    public /* synthetic */ u0(int i) {
        this.f13979a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f13979a) {
            case 0:
                int iS = i0.o.S(parcel);
                Bundle bundleI = null;
                String strN = null;
                boolean zF = false;
                long jI = 0;
                long jI2 = 0;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    char c8 = (char) i;
                    if (c8 == 1) {
                        jI = i0.o.I(parcel, i);
                    } else if (c8 == 2) {
                        jI2 = i0.o.I(parcel, i);
                    } else if (c8 == 3) {
                        zF = i0.o.F(parcel, i);
                    } else if (c8 == 7) {
                        bundleI = i0.o.i(parcel, i);
                    } else if (c8 != '\b') {
                        i0.o.O(parcel, i);
                    } else {
                        strN = i0.o.n(parcel, i);
                    }
                }
                i0.o.v(parcel, iS);
                return new t0(jI, jI2, zF, bundleI, strN);
            default:
                int iS2 = i0.o.S(parcel);
                String strN2 = null;
                int iH = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        iH = i0.o.H(parcel, i10);
                    } else if (c9 == 2) {
                        strN2 = i0.o.n(parcel, i10);
                    } else if (c9 != 3) {
                        i0.o.O(parcel, i10);
                    } else {
                        intent = (Intent) i0.o.m(parcel, i10, Intent.CREATOR);
                    }
                }
                i0.o.v(parcel, iS2);
                return new v0(iH, intent, strN2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f13979a) {
            case 0:
                return new t0[i];
            default:
                return new v0[i];
        }
    }
}
