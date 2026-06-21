package pa;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends qa.a {
    public static final Parcelable.Creator<n> CREATOR = new kb.i(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31407f;

    public n(int i, int i10, int i11, boolean z5, boolean z10) {
        this.f31403b = i;
        this.f31404c = z5;
        this.f31405d = z10;
        this.f31406e = i10;
        this.f31407f = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31403b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31404c ? 1 : 0);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f31405d ? 1 : 0);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f31406e);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f31407f);
        j0.g.m0(parcel, iI0);
    }
}
