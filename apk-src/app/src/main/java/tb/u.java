package tb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends qa.a {
    public static final Parcelable.Creator<u> CREATOR = new l0(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f33762c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f33761b);
        j0.g.V(parcel, 3, this.f33762c);
        j0.g.m0(parcel, iI0);
    }
}
