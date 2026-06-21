package tb;

import android.os.Parcel;
import android.os.Parcelable;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends qa.a {
    public static final Parcelable.Creator<f> CREATOR = new l0(18);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33687d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f33685b);
        j0.g.b0(parcel, 3, this.f33686c);
        int i10 = this.f33687d;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i10 = 0;
        }
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(i10);
        j0.g.m0(parcel, iI0);
    }
}
