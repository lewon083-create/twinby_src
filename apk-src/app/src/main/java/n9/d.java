package n9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.jh;
import j0.g;
import kb.i;
import q9.u0;
import q9.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends qa.a {
    public static final Parcelable.Creator<d> CREATOR = new i(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f29183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinder f29184d;

    public d(boolean z5, IBinder iBinder, IBinder iBinder2) {
        v0 u0Var;
        this.f29182b = z5;
        if (iBinder != null) {
            int i = jh.f6844c;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            u0Var = iInterfaceQueryLocalInterface instanceof v0 ? (v0) iInterfaceQueryLocalInterface : new u0(iBinder);
        } else {
            u0Var = null;
        }
        this.f29183c = u0Var;
        this.f29184d = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.h0(parcel, 1, 4);
        parcel.writeInt(this.f29182b ? 1 : 0);
        v0 v0Var = this.f29183c;
        g.X(parcel, 2, v0Var == null ? null : v0Var.asBinder());
        g.X(parcel, 3, this.f29184d);
        g.m0(parcel, iI0);
    }
}
