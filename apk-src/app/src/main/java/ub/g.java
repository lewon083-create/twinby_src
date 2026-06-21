package ub;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends qa.a {
    public static final Parcelable.Creator<g> CREATOR = new i(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34436c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f34435b);
        j0.g.b0(parcel, 3, this.f34436c);
        j0.g.m0(parcel, iI0);
    }
}
