package uc;

import android.os.Parcel;
import android.os.Parcelable;
import ub.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new i(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c cVar = (c) this;
        parcel.writeParcelable(cVar.f34443b, 0);
        parcel.writeInt(cVar.f34444c ? 1 : 0);
    }
}
