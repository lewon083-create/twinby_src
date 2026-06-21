package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vu extends qa.a {
    public static final Parcelable.Creator<vu> CREATOR = new ji(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q9.d3 f11479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11480c;

    public vu(String str, q9.d3 d3Var) {
        this.f11479b = d3Var;
        this.f11480c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.a0(parcel, 2, this.f11479b, i);
        j0.g.b0(parcel, 3, this.f11480c);
        j0.g.m0(parcel, iI0);
    }
}
