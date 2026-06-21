package m;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends m2.b {
    public static final Parcelable.Creator<c3> CREATOR = new ac.e(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28177e;

    public c3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f28176d = parcel.readInt();
        this.f28177e = parcel.readInt() != 0;
    }

    @Override // m2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f28176d);
        parcel.writeInt(this.f28177e ? 1 : 0);
    }
}
