package q9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends qa.a {
    public static final Parcelable.Creator<n2> CREATOR = new f1(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31945d;

    public n2(int i, int i10, String str) {
        this.f31943b = i;
        this.f31944c = i10;
        this.f31945d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31943b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31944c);
        j0.g.b0(parcel, 3, this.f31945d);
        j0.g.m0(parcel, iI0);
    }
}
