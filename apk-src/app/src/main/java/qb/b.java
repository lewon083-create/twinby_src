package qb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import j0.g;
import na.l;
import pa.l0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends qa.a implements l {
    public static final Parcelable.Creator<b> CREATOR = new l0(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Intent f31990d;

    public b(int i, int i10, Intent intent) {
        this.f31988b = i;
        this.f31989c = i10;
        this.f31990d = intent;
    }

    @Override // na.l
    public final Status getStatus() {
        return this.f31989c == 0 ? Status.f2629f : Status.f2632j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31988b);
        g.h0(parcel, 2, 4);
        parcel.writeInt(this.f31989c);
        g.a0(parcel, 3, this.f31990d, i);
        g.m0(parcel, iI0);
    }
}
