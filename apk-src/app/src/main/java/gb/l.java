package gb;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends qa.a {
    public static final Parcelable.Creator<l> CREATOR = new com.google.android.material.datepicker.a(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f20088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kb.q f20089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kb.n f20090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f20091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f20092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20093h;

    public l(int i, k kVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        kb.q oVar;
        kb.n mVar;
        this.f20087b = i;
        this.f20088c = kVar;
        v tVar = null;
        if (iBinder != null) {
            int i10 = kb.p.f27353c;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            oVar = iInterfaceQueryLocalInterface instanceof kb.q ? (kb.q) iInterfaceQueryLocalInterface : new kb.o(iBinder, "com.google.android.gms.location.ILocationListener", 7);
        } else {
            oVar = null;
        }
        this.f20089d = oVar;
        this.f20091f = pendingIntent;
        if (iBinder2 != null) {
            int i11 = g.f20073d;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            mVar = iInterfaceQueryLocalInterface2 instanceof kb.n ? (kb.n) iInterfaceQueryLocalInterface2 : new kb.m(iBinder2, "com.google.android.gms.location.ILocationCallback", 7);
        } else {
            mVar = null;
        }
        this.f20090e = mVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            tVar = iInterfaceQueryLocalInterface3 instanceof v ? (v) iInterfaceQueryLocalInterface3 : new t(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 7);
        }
        this.f20092g = tVar;
        this.f20093h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f20087b);
        j0.g.a0(parcel, 2, this.f20088c, i);
        IInterface iInterface = this.f20089d;
        j0.g.X(parcel, 3, iInterface == null ? null : ((cb.a) iInterface).f2256c);
        j0.g.a0(parcel, 4, this.f20091f, i);
        kb.n nVar = this.f20090e;
        j0.g.X(parcel, 5, nVar == null ? null : nVar.asBinder());
        v vVar = this.f20092g;
        j0.g.X(parcel, 6, vVar != null ? vVar.asBinder() : null);
        j0.g.b0(parcel, 8, this.f20093h);
        j0.g.m0(parcel, iI0);
    }
}
