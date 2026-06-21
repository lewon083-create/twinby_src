package tb;

import android.os.Parcel;
import android.os.Parcelable;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends qa.a {
    public static final Parcelable.Creator<t> CREATOR = new l0(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33760e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f33757b);
        j0.g.b0(parcel, 3, this.f33758c);
        int i10 = this.f33759d;
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(i10);
        int i11 = this.f33760e;
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(i11);
        j0.g.m0(parcel, iI0);
    }
}
