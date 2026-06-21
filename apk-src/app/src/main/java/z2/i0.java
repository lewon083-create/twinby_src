package z2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new ub.i(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f45869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f45870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b[] f45871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f45874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f45875h;
    public ArrayList i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f45869b);
        parcel.writeStringList(this.f45870c);
        parcel.writeTypedArray(this.f45871d, i);
        parcel.writeInt(this.f45872e);
        parcel.writeString(this.f45873f);
        parcel.writeStringList(this.f45874g);
        parcel.writeTypedList(this.f45875h);
        parcel.writeTypedList(this.i);
    }
}
