package q9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.tp;
import com.google.android.gms.internal.ads.vg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends cb.a implements h1 {
    public e1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 1);
    }

    @Override // q9.h1
    public final void I(boolean z5) {
        Parcel parcelD0 = D0();
        ClassLoader classLoader = vg.f11374a;
        parcelD0.writeInt(z5 ? 1 : 0);
        L1(parcelD0, 4);
    }

    @Override // q9.h1
    public final void K0(y2 y2Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, y2Var);
        L1(parcelD0, 14);
    }

    @Override // q9.h1
    public final void K3(ir irVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, irVar);
        L1(parcelD0, 11);
    }

    @Override // q9.h1
    public final void M0(o1 o1Var) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, o1Var);
        L1(parcelD0, 16);
    }

    @Override // q9.h1
    public final void Q3(String str, xa.a aVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(null);
        vg.e(parcelD0, aVar);
        L1(parcelD0, 6);
    }

    @Override // q9.h1
    public final void R1(tp tpVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, tpVar);
        L1(parcelD0, 12);
    }

    @Override // q9.h1
    public final void a0(String str) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        L1(parcelD0, 18);
    }

    @Override // q9.h1
    public final void b0() {
        L1(D0(), 19);
    }

    @Override // q9.h1
    public final void i() {
        L1(D0(), 1);
    }

    @Override // q9.h1
    public final List o() {
        Parcel parcelP1 = p1(D0(), 13);
        ArrayList arrayListCreateTypedArrayList = parcelP1.createTypedArrayList(pp.CREATOR);
        parcelP1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // q9.h1
    public final void r1(float f10) {
        Parcel parcelD0 = D0();
        parcelD0.writeFloat(f10);
        L1(parcelD0, 2);
    }

    @Override // q9.h1
    public final void s2(String str, xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        parcelD0.writeString(str);
        L1(parcelD0, 5);
    }

    @Override // q9.h1
    public final void v() {
        L1(D0(), 15);
    }
}
