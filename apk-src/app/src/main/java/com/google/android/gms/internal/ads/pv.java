package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pv extends qa.a {
    public static final Parcelable.Creator<pv> CREATOR = new ji(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9191c;

    public pv(String str, String str2) {
        this.f9190b = str;
        this.f9191c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f9190b);
        j0.g.b0(parcel, 2, this.f9191c);
        j0.g.m0(parcel, iI0);
    }
}
