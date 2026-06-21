package z2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new ub.i(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f45818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f45819c;

    public c(Parcel parcel) {
        this.f45818b = parcel.createStringArrayList();
        this.f45819c = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f45818b);
        parcel.writeTypedList(this.f45819c);
    }
}
