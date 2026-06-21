package ic;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m2.b {
    public static final Parcelable.Creator<a> CREATOR = new ac.e(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21228d;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f21228d = parcel.readInt() == 1;
    }

    @Override // m2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f21228d ? 1 : 0);
    }
}
