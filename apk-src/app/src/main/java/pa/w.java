package pa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends qa.a {
    public static final Parcelable.Creator<w> CREATOR = new kb.i(28);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f31443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ma.b f31444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31446f;

    public w(int i, IBinder iBinder, ma.b bVar, boolean z5, boolean z10) {
        this.f31442b = i;
        this.f31443c = iBinder;
        this.f31444d = bVar;
        this.f31445e = z5;
        this.f31446f = z10;
    }

    public final boolean equals(Object obj) {
        Object q0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f31444d.equals(wVar.f31444d)) {
            return false;
        }
        Object q0Var2 = null;
        IBinder iBinder = this.f31443c;
        if (iBinder == null) {
            q0Var = null;
        } else {
            int i = a.f31320c;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            q0Var = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 6);
        }
        IBinder iBinder2 = wVar.f31443c;
        if (iBinder2 != null) {
            int i10 = a.f31320c;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            q0Var2 = iInterfaceQueryLocalInterface2 instanceof j ? (j) iInterfaceQueryLocalInterface2 : new q0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 6);
        }
        return c0.m(q0Var, q0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31442b);
        j0.g.X(parcel, 2, this.f31443c);
        j0.g.a0(parcel, 3, this.f31444d, i);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f31445e ? 1 : 0);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f31446f ? 1 : 0);
        j0.g.m0(parcel, iI0);
    }
}
