package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wv0 extends qa.a {
    public static final Parcelable.Creator<wv0> CREATOR = new ji(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11908f;

    public wv0(int i, int i10, int i11, String str, String str2) {
        this.f11904b = i;
        this.f11905c = i10;
        this.f11906d = str;
        this.f11907e = str2;
        this.f11908f = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f11904b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f11905c);
        j0.g.b0(parcel, 3, this.f11906d);
        j0.g.b0(parcel, 4, this.f11907e);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f11908f);
        j0.g.m0(parcel, iI0);
    }
}
