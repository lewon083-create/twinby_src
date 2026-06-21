package q9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends qa.a {
    public static final Parcelable.Creator<j3> CREATOR = new f1(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31916b;

    public j3(int i) {
        this.f31916b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31916b);
        j0.g.m0(parcel, iI0);
    }
}
