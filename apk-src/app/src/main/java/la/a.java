package la;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f28060b;

    public a(Intent intent) {
        this.f28060b = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.a0(parcel, 1, this.f28060b, i);
        j0.g.m0(parcel, iI0);
    }
}
