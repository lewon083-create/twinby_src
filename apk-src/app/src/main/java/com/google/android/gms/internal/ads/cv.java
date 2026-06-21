package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cv extends cb.a implements ev {
    public cv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 1);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void R0(q9.d3 d3Var, lv lvVar) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, lvVar);
        L1(parcelD0, 1);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void X0(pv pvVar) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, pvVar);
        L1(parcelD0, 7);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void X2(hv hvVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, hvVar);
        L1(parcelD0, 2);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void c1(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 5);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void c2(q9.s1 s1Var) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, s1Var);
        L1(parcelD0, 13);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void i4(boolean z5) {
        Parcel parcelD0 = D0();
        ClassLoader classLoader = vg.f11374a;
        parcelD0.writeInt(z5 ? 1 : 0);
        L1(parcelD0, 15);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void n1(q9.d3 d3Var, lv lvVar) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, lvVar);
        L1(parcelD0, 14);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final q9.y1 p() {
        Parcel parcelP1 = p1(D0(), 12);
        q9.y1 y1VarL4 = e60.l4(parcelP1.readStrongBinder());
        parcelP1.recycle();
        return y1VarL4;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final String q() {
        Parcel parcelP1 = p1(D0(), 16);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void u3(q9.q1 q1Var) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, q1Var);
        L1(parcelD0, 8);
    }
}
