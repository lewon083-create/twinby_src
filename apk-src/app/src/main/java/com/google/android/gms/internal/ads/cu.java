package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cu extends qa.a {
    public static final Parcelable.Creator<cu> CREATOR = new ji(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4312b;

    public cu(String str) {
        this.f4312b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f4312b);
        j0.g.m0(parcel, iI0);
    }
}
