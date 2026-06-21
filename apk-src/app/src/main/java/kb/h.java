package kb;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends qa.a {
    public static final Parcelable.Creator<h> CREATOR = new i(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f27344g;

    public h(boolean z5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f27339b = z5;
        this.f27340c = z10;
        this.f27341d = z11;
        this.f27342e = z12;
        this.f27343f = z13;
        this.f27344g = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f27339b ? 1 : 0);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f27340c ? 1 : 0);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f27341d ? 1 : 0);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f27342e ? 1 : 0);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f27343f ? 1 : 0);
        j0.g.h0(parcel, 6, 4);
        parcel.writeInt(this.f27344g ? 1 : 0);
        j0.g.m0(parcel, iI0);
    }
}
