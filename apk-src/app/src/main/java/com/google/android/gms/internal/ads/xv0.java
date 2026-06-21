package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xv0 extends qa.a {
    public static final Parcelable.Creator<xv0> CREATOR = new ji(24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12347d;

    public xv0(byte[] bArr, int i, int i10) {
        this.f12345b = i;
        this.f12346c = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f12347d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f12345b);
        j0.g.W(parcel, 2, this.f12346c);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f12347d);
        j0.g.m0(parcel, iI0);
    }

    public xv0() {
        this(null, 1, 1);
    }
}
