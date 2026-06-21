package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tw extends qa.a {
    public static final Parcelable.Creator<tw> CREATOR = new ji(18);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q9.g3 f10739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q9.d3 f10740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10742g;

    public tw(String str, String str2, q9.g3 g3Var, q9.d3 d3Var, int i, String str3) {
        this.f10737b = str;
        this.f10738c = str2;
        this.f10739d = g3Var;
        this.f10740e = d3Var;
        this.f10741f = i;
        this.f10742g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f10737b);
        j0.g.b0(parcel, 2, this.f10738c);
        j0.g.a0(parcel, 3, this.f10739d, i);
        j0.g.a0(parcel, 4, this.f10740e, i);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f10741f);
        j0.g.b0(parcel, 6, this.f10742g);
        j0.g.m0(parcel, iI0);
    }
}
