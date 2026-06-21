package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.di;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends cb.a implements l0 {
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 1);
    }

    @Override // q9.l0
    public final String A() {
        Parcel parcelP1 = p1(D0(), 31);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // q9.l0
    public final y1 B() {
        y1 w1Var;
        Parcel parcelP1 = p1(D0(), 41);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            w1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            w1Var = iInterfaceQueryLocalInterface instanceof y1 ? (y1) iInterfaceQueryLocalInterface : new w1(strongBinder);
        }
        parcelP1.recycle();
        return w1Var;
    }

    @Override // q9.l0
    public final void B2(s1 s1Var) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, s1Var);
        L1(parcelD0, 42);
    }

    @Override // q9.l0
    public final b2 C() {
        b2 z1Var;
        Parcel parcelP1 = p1(D0(), 26);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            z1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            z1Var = iInterfaceQueryLocalInterface instanceof b2 ? (b2) iInterfaceQueryLocalInterface : new z1(strongBinder);
        }
        parcelP1.recycle();
        return z1Var;
    }

    @Override // q9.l0
    public final void C0(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 44);
    }

    @Override // q9.l0
    public final void J1(di diVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, diVar);
        L1(parcelD0, 40);
    }

    @Override // q9.l0
    public final void R3(d3 d3Var, b0 b0Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, b0Var);
        L1(parcelD0, 43);
    }

    @Override // q9.l0
    public final void S2(boolean z5) {
        Parcel parcelD0 = D0();
        ClassLoader classLoader = vg.f11374a;
        parcelD0.writeInt(z5 ? 1 : 0);
        L1(parcelD0, 22);
    }

    @Override // q9.l0
    public final void V3(v vVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, vVar);
        L1(parcelD0, 20);
    }

    @Override // q9.l0
    public final boolean X(d3 d3Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, d3Var);
        Parcel parcelP1 = p1(parcelD0, 4);
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // q9.l0
    public final void a2(b3 b3Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, b3Var);
        L1(parcelD0, 29);
    }

    @Override // q9.l0
    public final void c() {
        L1(D0(), 5);
    }

    @Override // q9.l0
    public final void e1(long j10) {
        Parcel parcelD0 = D0();
        parcelD0.writeLong(j10);
        L1(parcelD0, 48);
    }

    @Override // q9.l0
    public final void f1(boolean z5) {
        Parcel parcelD0 = D0();
        ClassLoader classLoader = vg.f11374a;
        parcelD0.writeInt(z5 ? 1 : 0);
        L1(parcelD0, 34);
    }

    @Override // q9.l0
    public final long g0() {
        Parcel parcelP1 = p1(D0(), 47);
        long j10 = parcelP1.readLong();
        parcelP1.recycle();
        return j10;
    }

    @Override // q9.l0
    public final void h() {
        L1(D0(), 2);
    }

    @Override // q9.l0
    public final xa.a j() {
        return pe.a.n(p1(D0(), 1));
    }

    @Override // q9.l0
    public final void j3(y yVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, yVar);
        L1(parcelD0, 7);
    }

    @Override // q9.l0
    public final void k() {
        L1(D0(), 6);
    }

    @Override // q9.l0
    public final void o3(a1 a1Var) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, a1Var);
        L1(parcelD0, 45);
    }

    @Override // q9.l0
    public final g3 q() {
        Parcel parcelP1 = p1(D0(), 12);
        g3 g3Var = (g3) vg.b(parcelP1, g3.CREATOR);
        parcelP1.recycle();
        return g3Var;
    }

    @Override // q9.l0
    public final void v1(v0 v0Var) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, v0Var);
        L1(parcelD0, 8);
    }

    @Override // q9.l0
    public final void y2(g3 g3Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, g3Var);
        L1(parcelD0, 13);
    }
}
