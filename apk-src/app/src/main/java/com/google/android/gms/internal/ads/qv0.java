package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qv0 extends qa.a {
    public static final Parcelable.Creator<qv0> CREATOR = new ji(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9606c;

    public qv0(int i, byte[] bArr) {
        this.f9605b = i;
        this.f9606c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f9605b);
        j0.g.W(parcel, 2, this.f9606c);
        j0.g.m0(parcel, iI0);
    }
}
