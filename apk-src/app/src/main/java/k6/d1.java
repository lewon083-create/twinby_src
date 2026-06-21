package k6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends m2.b {
    public static final Parcelable.Creator<d1> CREATOR = new ac.e(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f27050d;

    public d1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f27050d = parcel.readParcelable(classLoader == null ? androidx.recyclerview.widget.i.class.getClassLoader() : classLoader);
    }

    @Override // m2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f27050d, 0);
    }
}
