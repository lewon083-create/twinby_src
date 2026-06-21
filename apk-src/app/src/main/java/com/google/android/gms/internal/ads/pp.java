package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pp extends qa.a {
    public static final Parcelable.Creator<pp> CREATOR = new ji(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9147e;

    public pp(int i, String str, String str2, boolean z5) {
        this.f9144b = str;
        this.f9145c = z5;
        this.f9146d = i;
        this.f9147e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f9144b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f9145c ? 1 : 0);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f9146d);
        j0.g.b0(parcel, 4, this.f9147e);
        j0.g.m0(parcel, iI0);
    }
}
