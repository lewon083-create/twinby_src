package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ns extends cb.a implements os {
    @Override // com.google.android.gms.internal.ads.os
    public final void F0(String str, String str2, q9.d3 d3Var, xa.a aVar, ks ksVar, nr nrVar, wm wmVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, ksVar);
        vg.e(parcelD0, nrVar);
        vg.c(parcelD0, wmVar);
        L1(parcelD0, 22);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void N0(String str, String str2, q9.d3 d3Var, xa.a aVar, gs gsVar, nr nrVar, q9.g3 g3Var) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, gsVar);
        vg.e(parcelD0, nrVar);
        vg.c(parcelD0, g3Var);
        L1(parcelD0, 13);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void U2(String str) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        L1(parcelD0, 19);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void Z0(String str, String str2, q9.d3 d3Var, xa.a aVar, gs gsVar, nr nrVar, q9.g3 g3Var) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, gsVar);
        vg.e(parcelD0, nrVar);
        vg.c(parcelD0, g3Var);
        L1(parcelD0, 21);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final ts c() {
        Parcel parcelP1 = p1(D0(), 2);
        ts tsVar = (ts) vg.b(parcelP1, ts.CREATOR);
        parcelP1.recycle();
        return tsVar;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void e3(String str, String str2, q9.d3 d3Var, xa.a aVar, es esVar, nr nrVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, esVar);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 23);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void e4(xa.a aVar, String str, Bundle bundle, Bundle bundle2, q9.g3 g3Var, qs qsVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        parcelD0.writeString(str);
        vg.c(parcelD0, bundle);
        vg.c(parcelD0, bundle2);
        vg.c(parcelD0, g3Var);
        vg.e(parcelD0, qsVar);
        L1(parcelD0, 1);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final boolean f4(xa.b bVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, bVar);
        Parcel parcelP1 = p1(parcelD0, 15);
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void g4(String str, String str2, q9.d3 d3Var, xa.a aVar, ms msVar, nr nrVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, msVar);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 20);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void j1(String str, String str2, q9.d3 d3Var, xa.b bVar, ej0 ej0Var, nr nrVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, bVar);
        vg.e(parcelD0, ej0Var);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 18);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void j2(String str, String str2, q9.d3 d3Var, xa.a aVar, is isVar, nr nrVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, isVar);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 14);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final ts k() {
        Parcel parcelP1 = p1(D0(), 3);
        ts tsVar = (ts) vg.b(parcelP1, ts.CREATOR);
        parcelP1.recycle();
        return tsVar;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final q9.b2 m() {
        Parcel parcelP1 = p1(D0(), 5);
        q9.b2 b2VarL4 = q9.a2.l4(parcelP1.readStrongBinder());
        parcelP1.recycle();
        return b2VarL4;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final boolean m1(xa.b bVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, bVar);
        Parcel parcelP1 = p1(parcelD0, 17);
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.os
    public final void x1(String str, String str2, q9.d3 d3Var, xa.a aVar, ms msVar, nr nrVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.c(parcelD0, d3Var);
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, msVar);
        vg.e(parcelD0, nrVar);
        L1(parcelD0, 16);
    }

    @Override // com.google.android.gms.internal.ads.os
    public final boolean y0(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        Parcel parcelP1 = p1(parcelD0, 24);
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }
}
