package ub;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends qa.a {
    public static final Parcelable.Creator<h> CREATOR = new i(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f34439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f34440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f34441f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f34437b);
        j0.g.b0(parcel, 3, this.f34438c);
        j0.g.a0(parcel, 4, this.f34439d, i);
        j0.g.a0(parcel, 5, this.f34440e, i);
        j0.g.a0(parcel, 6, this.f34441f, i);
        j0.g.m0(parcel, iI0);
    }
}
