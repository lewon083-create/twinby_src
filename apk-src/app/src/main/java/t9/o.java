package t9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends qa.a {
    public static final Parcelable.Creator<o> CREATOR = new pa.l0(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33636c;

    public o(String str, int i) {
        this.f33635b = str == null ? "" : str;
        this.f33636c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f33635b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f33636c);
        j0.g.m0(parcel, iI0);
    }
}
