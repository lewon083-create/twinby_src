package n9;

import android.os.Parcel;
import android.os.Parcelable;
import j0.g;
import kb.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends qa.a {
    public static final Parcelable.Creator<a> CREATOR = new i(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29174b;

    public a(boolean z5) {
        this.f29174b = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.h0(parcel, 1, 4);
        parcel.writeInt(this.f29174b ? 1 : 0);
        g.m0(parcel, iI0);
    }
}
