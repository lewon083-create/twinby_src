package pa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends qa.a {
    public static final Parcelable.Creator<o> CREATOR = new kb.i(25);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f31416c;

    public o(int i, List list) {
        this.f31415b = i;
        this.f31416c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31415b);
        j0.g.f0(parcel, 2, this.f31416c);
        j0.g.m0(parcel, iI0);
    }
}
