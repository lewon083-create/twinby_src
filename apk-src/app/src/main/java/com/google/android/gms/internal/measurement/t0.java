package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends qa.a {
    public static final Parcelable.Creator<t0> CREATOR = new u0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f13972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13973f;

    public t0(long j10, long j11, boolean z5, Bundle bundle, String str) {
        this.f13969b = j10;
        this.f13970c = j11;
        this.f13971d = z5;
        this.f13972e = bundle;
        this.f13973f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 8);
        parcel.writeLong(this.f13969b);
        j0.g.h0(parcel, 2, 8);
        parcel.writeLong(this.f13970c);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f13971d ? 1 : 0);
        j0.g.V(parcel, 7, this.f13972e);
        j0.g.b0(parcel, 8, this.f13973f);
        j0.g.m0(parcel, iI0);
    }
}
