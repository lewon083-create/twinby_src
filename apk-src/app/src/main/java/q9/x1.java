package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends qa.a {
    public static final Parcelable.Creator<x1> CREATOR = new f1(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x1 f31979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IBinder f31980f;

    public x1(int i, String str, String str2, x1 x1Var, IBinder iBinder) {
        this.f31976b = i;
        this.f31977c = str;
        this.f31978d = str2;
        this.f31979e = x1Var;
        this.f31980f = iBinder;
    }

    public final la.m c() {
        la.m mVar;
        x1 x1Var = this.f31979e;
        Object obj = null;
        if (x1Var == null) {
            mVar = null;
        } else {
            mVar = new la.m(x1Var.f31976b, x1Var.f31977c, x1Var.f31978d, obj, 4);
        }
        return new la.m(this.f31976b, this.f31977c, this.f31978d, mVar, 4);
    }

    public final k9.m e() {
        la.m mVar;
        y1 w1Var;
        x1 x1Var = this.f31979e;
        if (x1Var == null) {
            mVar = null;
        } else {
            mVar = new la.m(x1Var.f31976b, x1Var.f31977c, x1Var.f31978d, rVar, 4);
        }
        IBinder iBinder = this.f31980f;
        if (iBinder == null) {
            w1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            w1Var = iInterfaceQueryLocalInterface instanceof y1 ? (y1) iInterfaceQueryLocalInterface : new w1(iBinder);
        }
        return new k9.m(this.f31976b, this.f31977c, this.f31978d, mVar, w1Var != null ? new k9.r(w1Var) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31976b);
        j0.g.b0(parcel, 2, this.f31977c);
        j0.g.b0(parcel, 3, this.f31978d);
        j0.g.a0(parcel, 4, this.f31979e, i);
        j0.g.X(parcel, 5, this.f31980f);
        j0.g.m0(parcel, iI0);
    }
}
