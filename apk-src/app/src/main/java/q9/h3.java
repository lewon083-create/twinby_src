package q9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends qa.a {
    public static final Parcelable.Creator<h3> CREATOR = new f1(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31897e;

    public h3(String str, int i, int i10, long j10) {
        this.f31894b = i;
        this.f31895c = i10;
        this.f31896d = str;
        this.f31897e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31894b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31895c);
        j0.g.b0(parcel, 3, this.f31896d);
        j0.g.h0(parcel, 4, 8);
        parcel.writeLong(this.f31897e);
        j0.g.m0(parcel, iI0);
    }
}
