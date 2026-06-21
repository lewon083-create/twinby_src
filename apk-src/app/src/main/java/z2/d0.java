package z2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new ub.i(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45825c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45824b);
        parcel.writeInt(this.f45825c);
    }
}
