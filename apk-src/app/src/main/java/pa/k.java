package pa;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends qa.a {
    public static final Parcelable.Creator<k> CREATOR = new kb.i(26);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f31387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f31388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f31389h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f31390j;

    public k(int i, int i10, int i11, long j10, long j11, String str, String str2, int i12, int i13) {
        this.f31383b = i;
        this.f31384c = i10;
        this.f31385d = i11;
        this.f31386e = j10;
        this.f31387f = j11;
        this.f31388g = str;
        this.f31389h = str2;
        this.i = i12;
        this.f31390j = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31383b);
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31384c);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f31385d);
        j0.g.h0(parcel, 4, 8);
        parcel.writeLong(this.f31386e);
        j0.g.h0(parcel, 5, 8);
        parcel.writeLong(this.f31387f);
        j0.g.b0(parcel, 6, this.f31388g);
        j0.g.b0(parcel, 7, this.f31389h);
        j0.g.h0(parcel, 8, 4);
        parcel.writeInt(this.i);
        j0.g.h0(parcel, 9, 4);
        parcel.writeInt(this.f31390j);
        j0.g.m0(parcel, iI0);
    }
}
