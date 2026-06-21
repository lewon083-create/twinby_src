package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sv0 extends qa.a {
    public static final Parcelable.Creator<sv0> CREATOR = new ji(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10408d;

    public sv0(int i, String str, String str2) {
        this.f10406b = i;
        this.f10407c = str;
        this.f10408d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f10406b);
        j0.g.b0(parcel, 2, this.f10407c);
        j0.g.b0(parcel, 3, this.f10408d);
        j0.g.m0(parcel, iI0);
    }
}
