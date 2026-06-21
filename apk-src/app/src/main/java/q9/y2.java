package q9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends qa.a {
    public static final Parcelable.Creator<y2> CREATOR = new f1(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31986c;

    public y2(int i, int i10) {
        this.f31985b = i;
        this.f31986c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31985b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31986c);
        j0.g.m0(parcel, iI0);
    }

    public y2(k9.q qVar) {
        this.f31985b = qVar.f27276a;
        this.f31986c = qVar.f27277b;
    }
}
