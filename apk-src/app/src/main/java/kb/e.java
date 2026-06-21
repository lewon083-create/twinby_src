package kb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends qa.a {
    public static final Parcelable.Creator<e> CREATOR = new i(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f27333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27335d;

    public e(ArrayList arrayList, boolean z5, boolean z10) {
        this.f27333b = arrayList;
        this.f27334c = z5;
        this.f27335d = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.f0(parcel, 1, Collections.unmodifiableList(this.f27333b));
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f27334c ? 1 : 0);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f27335d ? 1 : 0);
        j0.g.m0(parcel, iI0);
    }
}
