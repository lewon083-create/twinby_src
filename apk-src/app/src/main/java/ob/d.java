package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends qa.a {
    public static final Parcelable.Creator<d> CREATOR = new kb.i(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f29995d;

    public d(int i, long j10, long j11) {
        this.f29993b = j10;
        this.f29994c = i;
        this.f29995d = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 8);
        parcel.writeLong(this.f29993b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f29994c);
        j0.g.h0(parcel, 3, 8);
        parcel.writeLong(this.f29995d);
        j0.g.m0(parcel, iI0);
    }
}
