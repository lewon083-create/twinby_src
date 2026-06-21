package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import ub.i;
import w6.b;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new i(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1742b;

    public ParcelImpl(Parcel parcel) {
        this.f1742b = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new b(parcel).i(this.f1742b);
    }
}
