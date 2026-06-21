package qb;

import android.os.Parcel;
import android.os.Parcelable;
import j0.g;
import pa.l0;
import pa.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends qa.a {
    public static final Parcelable.Creator<f> CREATOR = new l0(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma.b f31994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f31995d;

    public f(int i, ma.b bVar, w wVar) {
        this.f31993b = i;
        this.f31994c = bVar;
        this.f31995d = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31993b);
        g.a0(parcel, 2, this.f31994c, i);
        g.a0(parcel, 3, this.f31995d, i);
        g.m0(parcel, iI0);
    }
}
