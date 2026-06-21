package ka;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new com.google.android.material.datepicker.a(24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f27299d;

    public a(int i, int i10, Bundle bundle) {
        this.f27297b = i;
        this.f27298c = i10;
        this.f27299d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f27297b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f27298c);
        j0.g.V(parcel, 3, this.f27299d);
        j0.g.m0(parcel, iI0);
    }
}
