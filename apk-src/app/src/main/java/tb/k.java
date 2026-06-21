package tb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends qa.a {
    public static final Parcelable.Creator<k> CREATOR = new l0(24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f33727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f33729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f33730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f33731h;
    public p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f33733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f33734l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        boolean z5 = this.f33725b;
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z10 = this.f33726c;
        j0.g.h0(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j0.g.a0(parcel, 3, this.f33727d, i);
        boolean z11 = this.f33728e;
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        j0.g.a0(parcel, 5, this.f33729f, i);
        j0.g.Z(parcel, 6, this.f33730g);
        j0.g.a0(parcel, 7, this.f33731h, i);
        j0.g.a0(parcel, 8, this.i, i);
        boolean z12 = this.f33732j;
        j0.g.h0(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        j0.g.b0(parcel, 10, this.f33733k);
        j0.g.V(parcel, 11, this.f33734l);
        j0.g.m0(parcel, iI0);
    }
}
