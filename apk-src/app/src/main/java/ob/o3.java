package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 extends qa.a {
    public static final Parcelable.Creator<o3> CREATOR = new kb.i(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30332d;

    public o3(String str, long j10, int i) {
        this.f30330b = str;
        this.f30331c = j10;
        this.f30332d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 1, this.f30330b);
        j0.g.h0(parcel, 2, 8);
        parcel.writeLong(this.f30331c);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f30332d);
        j0.g.m0(parcel, iI0);
    }
}
