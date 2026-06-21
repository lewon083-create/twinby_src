package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vp extends qa.a {
    public static final Parcelable.Creator<vp> CREATOR = new ji(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f11436c;

    public vp(Bundle bundle, String str) {
        this.f11435b = str;
        this.f11436c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f11435b);
        j0.g.V(parcel, 2, this.f11436c);
        j0.g.m0(parcel, iI0);
    }
}
