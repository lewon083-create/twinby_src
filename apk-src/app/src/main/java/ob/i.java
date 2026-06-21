package ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends qa.a {
    public static final Parcelable.Creator<i> CREATOR = new kb.i(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f30179b;

    public i(Bundle bundle) {
        this.f30179b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.V(parcel, 1, this.f30179b);
        j0.g.m0(parcel, iI0);
    }
}
