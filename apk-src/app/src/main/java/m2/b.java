package m2;

import ac.e;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f28536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28535c = new a();
    public static final Parcelable.Creator<b> CREATOR = new e(6);

    public b() {
        this.f28536b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f28536b, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f28536b = parcelable == f28535c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f28536b = parcelable == null ? f28535c : parcelable;
    }
}
