package ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends qa.a {
    public static final Parcelable.Creator<t3> CREATOR = new kb.i(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f30429b;

    public t3(ArrayList arrayList) {
        this.f30429b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.f0(parcel, 1, this.f30429b);
        j0.g.m0(parcel, iI0);
    }
}
