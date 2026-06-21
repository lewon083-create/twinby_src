package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vt extends qa.a {
    public static final Parcelable.Creator<vt> CREATOR = new ji(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f11464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f11465c;

    public vt(IBinder iBinder, IBinder iBinder2) {
        this.f11464b = (View) xa.b.X1(xa.b.L1(iBinder));
        this.f11465c = (Map) xa.b.X1(xa.b.L1(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.X(parcel, 1, new xa.b(this.f11464b));
        j0.g.X(parcel, 2, new xa.b(this.f11465c));
        j0.g.m0(parcel, iI0);
    }
}
