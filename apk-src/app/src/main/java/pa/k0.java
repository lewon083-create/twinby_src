package pa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends qa.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f31391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ma.d[] f31392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f31394e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.V(parcel, 1, this.f31391b);
        j0.g.e0(parcel, 2, this.f31392c, i);
        int i10 = this.f31393d;
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(i10);
        j0.g.a0(parcel, 4, this.f31394e, i);
        j0.g.m0(parcel, iI0);
    }
}
