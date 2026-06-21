package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jp extends qa.a {
    public static final Parcelable.Creator<jp> CREATOR = new ji(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f6915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f6916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6917h;
    public final long i;

    public jp(boolean z5, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z10, long j10) {
        this.f6911b = z5;
        this.f6912c = str;
        this.f6913d = i;
        this.f6914e = bArr;
        this.f6915f = strArr;
        this.f6916g = strArr2;
        this.f6917h = z10;
        this.i = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f6911b ? 1 : 0);
        j0.g.b0(parcel, 2, this.f6912c);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f6913d);
        j0.g.W(parcel, 4, this.f6914e);
        j0.g.c0(parcel, 5, this.f6915f);
        j0.g.c0(parcel, 6, this.f6916g);
        j0.g.h0(parcel, 7, 4);
        parcel.writeInt(this.f6917h ? 1 : 0);
        j0.g.h0(parcel, 8, 8);
        parcel.writeLong(this.i);
        j0.g.m0(parcel, iI0);
    }
}
