package k6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new com.google.android.material.datepicker.a(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27039d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27037b);
        parcel.writeInt(this.f27038c);
        parcel.writeInt(this.f27039d ? 1 : 0);
    }
}
