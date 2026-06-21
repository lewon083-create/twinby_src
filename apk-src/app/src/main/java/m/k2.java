package m;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends m2.b {
    public static final Parcelable.Creator<k2> CREATOR = new ac.e(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28283d;

    public k2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f28283d = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f28283d + "}";
    }

    @Override // m2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f28283d));
    }
}
