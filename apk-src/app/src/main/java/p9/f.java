package p9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends qa.a {
    public static final Parcelable.Creator<f> CREATOR = new kb.i(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f31282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f31284h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f31285j;

    public f(boolean z5, boolean z10, String str, boolean z11, float f10, int i, boolean z12, boolean z13, boolean z14) {
        this.f31278b = z5;
        this.f31279c = z10;
        this.f31280d = str;
        this.f31281e = z11;
        this.f31282f = f10;
        this.f31283g = i;
        this.f31284h = z12;
        this.i = z13;
        this.f31285j = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31278b ? 1 : 0);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f31279c ? 1 : 0);
        j0.g.b0(parcel, 4, this.f31280d);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f31281e ? 1 : 0);
        j0.g.h0(parcel, 6, 4);
        parcel.writeFloat(this.f31282f);
        j0.g.h0(parcel, 7, 4);
        parcel.writeInt(this.f31283g);
        j0.g.h0(parcel, 8, 4);
        parcel.writeInt(this.f31284h ? 1 : 0);
        j0.g.h0(parcel, 9, 4);
        parcel.writeInt(this.i ? 1 : 0);
        j0.g.h0(parcel, 10, 4);
        parcel.writeInt(this.f31285j ? 1 : 0);
        j0.g.m0(parcel, iI0);
    }

    public f(boolean z5, boolean z10, boolean z11, float f10, boolean z12, boolean z13, boolean z14) {
        this(z5, z10, null, z11, f10, -1, z12, z13, z14);
    }
}
