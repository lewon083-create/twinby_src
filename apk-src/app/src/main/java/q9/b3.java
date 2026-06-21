package q9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends qa.a {
    public static final Parcelable.Creator<b3> CREATOR = new f1(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31793d;

    public b3(k9.u uVar) {
        this(uVar.f27289a, uVar.f27290b, uVar.f27291c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31791b ? 1 : 0);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f31792c ? 1 : 0);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f31793d ? 1 : 0);
        j0.g.m0(parcel, iI0);
    }

    public b3(boolean z5, boolean z10, boolean z11) {
        this.f31791b = z5;
        this.f31792c = z10;
        this.f31793d = z11;
    }
}
