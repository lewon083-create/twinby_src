package tb;

import android.os.Parcel;
import android.os.Parcelable;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends qa.a {
    public static final Parcelable.Creator<s> CREATOR = new l0(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33753h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f33755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f33756l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f33747b);
        j0.g.b0(parcel, 3, this.f33748c);
        j0.g.b0(parcel, 4, this.f33749d);
        j0.g.b0(parcel, 5, this.f33750e);
        j0.g.b0(parcel, 6, this.f33751f);
        j0.g.b0(parcel, 7, this.f33752g);
        j0.g.b0(parcel, 8, this.f33753h);
        j0.g.b0(parcel, 9, this.i);
        j0.g.b0(parcel, 10, this.f33754j);
        boolean z5 = this.f33755k;
        j0.g.h0(parcel, 11, 4);
        parcel.writeInt(z5 ? 1 : 0);
        j0.g.b0(parcel, 12, this.f33756l);
        j0.g.m0(parcel, iI0);
    }
}
