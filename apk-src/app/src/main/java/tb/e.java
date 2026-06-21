package tb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends qa.a {
    public static final Parcelable.Creator<e> CREATOR = new l0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f33681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33684e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.Z(parcel, 1, this.f33681b);
        boolean z5 = this.f33682c;
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z10 = this.f33683d;
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.f33684e;
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(i10);
        j0.g.m0(parcel, iI0);
    }
}
