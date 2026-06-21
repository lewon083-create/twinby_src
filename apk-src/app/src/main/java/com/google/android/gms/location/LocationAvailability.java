package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j0.g;
import java.util.Arrays;
import kb.k;
import qa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new com.google.android.material.datepicker.a(27);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k[] f14399f;

    public LocationAvailability(int i, int i10, int i11, long j10, k[] kVarArr) {
        this.f14398e = i < 1000 ? 0 : 1000;
        this.f14395b = i10;
        this.f14396c = i11;
        this.f14397d = j10;
        this.f14399f = kVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f14395b == locationAvailability.f14395b && this.f14396c == locationAvailability.f14396c && this.f14397d == locationAvailability.f14397d && this.f14398e == locationAvailability.f14398e && Arrays.equals(this.f14399f, locationAvailability.f14399f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14398e)});
    }

    public final String toString() {
        boolean z5 = this.f14398e < 1000;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z5).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(z5);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.h0(parcel, 1, 4);
        parcel.writeInt(this.f14395b);
        g.h0(parcel, 2, 4);
        parcel.writeInt(this.f14396c);
        g.h0(parcel, 3, 8);
        parcel.writeLong(this.f14397d);
        g.h0(parcel, 4, 4);
        int i10 = this.f14398e;
        parcel.writeInt(i10);
        g.e0(parcel, 5, this.f14399f, i);
        int i11 = i10 >= 1000 ? 0 : 1;
        g.h0(parcel, 6, 4);
        parcel.writeInt(i11);
        g.m0(parcel, iI0);
    }
}
