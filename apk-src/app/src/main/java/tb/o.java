package tb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends qa.a {
    public static final Parcelable.Creator<o> CREATOR = new l0(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f33739b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.d0(parcel, 1, this.f33739b);
        j0.g.m0(parcel, iI0);
    }
}
