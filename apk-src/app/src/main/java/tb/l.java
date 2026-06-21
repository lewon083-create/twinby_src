package tb;

import android.os.Parcel;
import android.os.Parcelable;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends qa.a {
    public static final Parcelable.Creator<l> CREATOR = new l0(25);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33736c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        int i10 = this.f33735b;
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(i10);
        j0.g.b0(parcel, 3, this.f33736c);
        j0.g.m0(parcel, iI0);
    }
}
