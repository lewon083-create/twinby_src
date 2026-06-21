package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ts extends qa.a {
    public static final Parcelable.Creator<ts> CREATOR = new ji(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10708d;

    public ts(int i, int i10, int i11) {
        this.f10706b = i;
        this.f10707c = i10;
        this.f10708d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ts)) {
            ts tsVar = (ts) obj;
            if (tsVar.f10708d == this.f10708d && tsVar.f10707c == this.f10707c && tsVar.f10706b == this.f10706b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f10706b, this.f10707c, this.f10708d});
    }

    public final String toString() {
        int i = this.f10706b;
        int length = String.valueOf(i).length();
        int i10 = this.f10707c;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f10708d;
        StringBuilder sb2 = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i11).length());
        om1.t(sb2, i, ".", i10, ".");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f10706b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f10707c);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f10708d);
        j0.g.m0(parcel, iI0);
    }
}
