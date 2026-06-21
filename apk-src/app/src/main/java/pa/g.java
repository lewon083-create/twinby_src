package pa;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends qa.a {
    public static final Parcelable.Creator<g> CREATOR = new l0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f31354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f31357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f31359g;

    public g(n nVar, boolean z5, boolean z10, int[] iArr, int i, int[] iArr2) {
        this.f31354b = nVar;
        this.f31355c = z5;
        this.f31356d = z10;
        this.f31357e = iArr;
        this.f31358f = i;
        this.f31359g = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.a0(parcel, 1, this.f31354b, i);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31355c ? 1 : 0);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f31356d ? 1 : 0);
        j0.g.Y(parcel, 4, this.f31357e);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f31358f);
        j0.g.Y(parcel, 6, this.f31359g);
        j0.g.m0(parcel, iI0);
    }
}
