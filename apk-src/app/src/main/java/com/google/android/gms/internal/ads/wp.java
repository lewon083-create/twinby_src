package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wp extends qa.a {
    public static final Parcelable.Creator<wp> CREATOR = new ji(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11867e;

    public wp(String str, int i, int i10, int i11) {
        this.f11864b = i;
        this.f11865c = i10;
        this.f11866d = str;
        this.f11867e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f11865c);
        j0.g.b0(parcel, 2, this.f11866d);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f11867e);
        j0.g.h0(parcel, 1000, 4);
        parcel.writeInt(this.f11864b);
        j0.g.m0(parcel, iI0);
    }
}
