package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rr extends cb.a implements sr {
    public rr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 1);
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final boolean B() {
        Parcel parcelP1 = p1(D0(), 17);
        ClassLoader classLoader = vg.f11374a;
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final Bundle C3() {
        Parcel parcelP1 = p1(D0(), 16);
        Bundle bundle = (Bundle) vg.b(parcelP1, Bundle.CREATOR);
        parcelP1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final float J() {
        Parcel parcelP1 = p1(D0(), 25);
        float f10 = parcelP1.readFloat();
        parcelP1.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final void M() {
        L1(D0(), 26);
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final float P() {
        Parcel parcelP1 = p1(D0(), 24);
        float f10 = parcelP1.readFloat();
        parcelP1.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final float T() {
        Parcel parcelP1 = p1(D0(), 23);
        float f10 = parcelP1.readFloat();
        parcelP1.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final boolean Z() {
        Parcel parcelP1 = p1(D0(), 18);
        ClassLoader classLoader = vg.f11374a;
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final void a4(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 22);
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final List c() {
        Parcel parcelP1 = p1(D0(), 3);
        ArrayList arrayList = parcelP1.readArrayList(vg.f11374a);
        parcelP1.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String d() {
        Parcel parcelP1 = p1(D0(), 7);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String e() {
        Parcel parcelP1 = p1(D0(), 9);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String f() {
        Parcel parcelP1 = p1(D0(), 6);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String i() {
        Parcel parcelP1 = p1(D0(), 2);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String k() {
        Parcel parcelP1 = p1(D0(), 4);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final en m() {
        Parcel parcelP1 = p1(D0(), 5);
        en enVarL4 = um.l4(parcelP1.readStrongBinder());
        parcelP1.recycle();
        return enVarL4;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final void m0(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 20);
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final double n() {
        Parcel parcelP1 = p1(D0(), 8);
        double d10 = parcelP1.readDouble();
        parcelP1.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final xa.a o() {
        return pe.a.n(p1(D0(), 14));
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String p() {
        Parcel parcelP1 = p1(D0(), 10);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final q9.b2 q() {
        Parcel parcelP1 = p1(D0(), 11);
        q9.b2 b2VarL4 = q9.a2.l4(parcelP1.readStrongBinder());
        parcelP1.recycle();
        return b2VarL4;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final zm r() {
        Parcel parcelP1 = p1(D0(), 12);
        zm zmVarL4 = ym.l4(parcelP1.readStrongBinder());
        parcelP1.recycle();
        return zmVarL4;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final xa.a s() {
        return pe.a.n(p1(D0(), 13));
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final void t3(xa.a aVar, xa.a aVar2, xa.a aVar3) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, aVar2);
        vg.e(parcelD0, aVar3);
        L1(parcelD0, 21);
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final void u() {
        L1(D0(), 19);
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final xa.a x() {
        return pe.a.n(p1(D0(), 15));
    }
}
