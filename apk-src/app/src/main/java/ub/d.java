package ub;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends qa.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f34427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f34429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34430g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        int i10 = this.f34425b;
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(i10);
        j0.g.b0(parcel, 3, this.f34426c);
        double d10 = this.f34427d;
        j0.g.h0(parcel, 4, 8);
        parcel.writeDouble(d10);
        j0.g.b0(parcel, 5, this.f34428e);
        long j10 = this.f34429f;
        j0.g.h0(parcel, 6, 8);
        parcel.writeLong(j10);
        int i11 = this.f34430g;
        j0.g.h0(parcel, 7, 4);
        parcel.writeInt(i11);
        j0.g.m0(parcel, iI0);
    }
}
