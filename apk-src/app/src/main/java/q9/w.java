package q9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends cb.a implements y {
    public w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 1);
    }

    @Override // q9.y
    public final void E(int i) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(i);
        L1(parcelD0, 2);
    }

    @Override // q9.y
    public final void c() {
        L1(D0(), 4);
    }

    @Override // q9.y
    public final void d() {
        L1(D0(), 7);
    }

    @Override // q9.y
    public final void d0(x1 x1Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, x1Var);
        L1(parcelD0, 8);
    }

    @Override // q9.y
    public final void f() {
        L1(D0(), 9);
    }

    @Override // q9.y
    public final void i() {
        L1(D0(), 3);
    }

    @Override // q9.y
    public final void k() {
        L1(D0(), 5);
    }

    @Override // q9.y
    public final void m() {
        L1(D0(), 6);
    }

    @Override // q9.y
    public final void z() {
        L1(D0(), 1);
    }
}
