package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends qa.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13173c;

    public b() {
        this.f13172b = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f13172b);
        j0.g.b0(parcel, 2, this.f13173c);
        j0.g.m0(parcel, iI0);
    }

    public b(int i, String str) {
        this.f13172b = i;
        this.f13173c = str;
    }
}
