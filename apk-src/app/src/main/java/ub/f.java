package ub;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends qa.a {
    public static final Parcelable.Creator<f> CREATOR = new i(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f34433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34434c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        long j10 = this.f34433b;
        j0.g.h0(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.f34434c;
        j0.g.h0(parcel, 3, 8);
        parcel.writeLong(j11);
        j0.g.m0(parcel, iI0);
    }
}
