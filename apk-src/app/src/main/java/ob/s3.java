package ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends qa.a {
    public static final Parcelable.Creator<s3> CREATOR = new kb.i(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f30425b;

    public s3(ArrayList arrayList) {
        this.f30425b = arrayList;
    }

    public static s3 a(q2... q2VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(q2VarArr[0].f30372b));
        return new s3(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.Z(parcel, 1, this.f30425b);
        j0.g.m0(parcel, iI0);
    }
}
