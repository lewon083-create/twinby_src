package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jr extends cb.a implements kr {
    @Override // com.google.android.gms.internal.ads.kr
    public final void C2(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 30);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void D2(xa.a aVar, rp rpVar, ArrayList arrayList) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, rpVar);
        parcelD0.writeTypedList(arrayList);
        L1(parcelD0, 31);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final boolean G() {
        Parcel parcelP1 = p1(D0(), 22);
        ClassLoader classLoader = vg.f11374a;
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final q9.b2 J() {
        Parcel parcelP1 = p1(D0(), 26);
        q9.b2 b2VarL4 = q9.a2.l4(parcelP1.readStrongBinder());
        parcelP1.recycle();
        return b2VarL4;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void K() {
        L1(D0(), 12);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final sr M() {
        sr rrVar;
        Parcel parcelP1 = p1(D0(), 27);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            rrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            rrVar = iInterfaceQueryLocalInterface instanceof sr ? (sr) iInterfaceQueryLocalInterface : new rr(strongBinder);
        }
        parcelP1.recycle();
        return rrVar;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void M1(xa.a aVar, q9.d3 d3Var, String str, String str2, nr nrVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, d3Var);
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 7);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final ts N() {
        Parcel parcelP1 = p1(D0(), 33);
        ts tsVar = (ts) vg.b(parcelP1, ts.CREATOR);
        parcelP1.recycle();
        return tsVar;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void P1(xa.a aVar, q9.d3 d3Var, String str, nr nrVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, d3Var);
        parcelD0.writeString(str);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 38);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final pr S() {
        pr prVar;
        Parcel parcelP1 = p1(D0(), 15);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            prVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            prVar = iInterfaceQueryLocalInterface instanceof pr ? (pr) iInterfaceQueryLocalInterface : new pr(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 1);
        }
        parcelP1.recycle();
        return prVar;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void S0(xa.a aVar, q9.d3 d3Var, String str, String str2, nr nrVar, wm wmVar, ArrayList arrayList) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, d3Var);
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.e(parcelD0, nrVar);
        vg.c(parcelD0, wmVar);
        parcelD0.writeStringList(arrayList);
        L1(parcelD0, 14);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void S1(xa.a aVar, q9.d3 d3Var, yu yuVar, String str) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, d3Var);
        parcelD0.writeString(null);
        vg.e(parcelD0, yuVar);
        parcelD0.writeString(str);
        L1(parcelD0, 10);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void Y1(xa.a aVar, yu yuVar, List list) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, yuVar);
        parcelD0.writeStringList(list);
        L1(parcelD0, 23);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final xa.a c() {
        return pe.a.n(p1(D0(), 2));
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void d1(xa.a aVar, q9.d3 d3Var, String str, nr nrVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, d3Var);
        parcelD0.writeString(str);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 28);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void e() {
        L1(D0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void f() {
        L1(D0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void h2(boolean z5) {
        Parcel parcelD0 = D0();
        ClassLoader classLoader = vg.f11374a;
        parcelD0.writeInt(z5 ? 1 : 0);
        L1(parcelD0, 25);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void h4(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 39);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void m() {
        L1(D0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void m0(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 21);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final boolean o() {
        Parcel parcelP1 = p1(D0(), 13);
        ClassLoader classLoader = vg.f11374a;
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final or o0() {
        or orVar;
        Parcel parcelP1 = p1(D0(), 36);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            orVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            orVar = iInterfaceQueryLocalInterface instanceof or ? (or) iInterfaceQueryLocalInterface : new or(strongBinder);
        }
        parcelP1.recycle();
        return orVar;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void p() {
        L1(D0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void p3(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 37);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final qr q0() {
        qr qrVar;
        Parcel parcelP1 = p1(D0(), 16);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            qrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            qrVar = iInterfaceQueryLocalInterface instanceof qr ? (qr) iInterfaceQueryLocalInterface : new qr(strongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 1);
        }
        parcelP1.recycle();
        return qrVar;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void s3(xa.a aVar, q9.g3 g3Var, q9.d3 d3Var, String str, String str2, nr nrVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, g3Var);
        vg.c(parcelD0, d3Var);
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 35);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final ts t0() {
        Parcel parcelP1 = p1(D0(), 34);
        ts tsVar = (ts) vg.b(parcelP1, ts.CREATOR);
        parcelP1.recycle();
        return tsVar;
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void v2(xa.a aVar, q9.d3 d3Var, String str, nr nrVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, d3Var);
        parcelD0.writeString(str);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 32);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void z0(xa.a aVar, q9.g3 g3Var, q9.d3 d3Var, String str, String str2, nr nrVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, g3Var);
        vg.c(parcelD0, d3Var);
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 6);
    }

    @Override // com.google.android.gms.internal.ads.kr
    public final void z1(String str, q9.d3 d3Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, d3Var);
        parcelD0.writeString(str);
        L1(parcelD0, 11);
    }
}
