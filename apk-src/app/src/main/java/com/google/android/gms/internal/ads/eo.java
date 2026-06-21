package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class eo extends cb.a implements fo {
    @Override // com.google.android.gms.internal.ads.fo
    public final xa.a A() {
        return pe.a.n(p1(D0(), 18));
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final cn C() {
        cn bnVar;
        Parcel parcelP1 = p1(D0(), 29);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            bnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            bnVar = iInterfaceQueryLocalInterface instanceof cn ? (cn) iInterfaceQueryLocalInterface : new bn(strongBinder);
        }
        parcelP1.recycle();
        return bnVar;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final void I2(Bundle bundle) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, bundle);
        L1(parcelD0, 33);
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final void K() {
        L1(D0(), 13);
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final q9.y1 N() {
        Parcel parcelP1 = p1(D0(), 31);
        q9.y1 y1VarL4 = e60.l4(parcelP1.readStrongBinder());
        parcelP1.recycle();
        return y1VarL4;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final List T() {
        Parcel parcelP1 = p1(D0(), 23);
        ArrayList arrayList = parcelP1.readArrayList(vg.f11374a);
        parcelP1.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final List c() {
        Parcel parcelP1 = p1(D0(), 3);
        ArrayList arrayList = parcelP1.readArrayList(vg.f11374a);
        parcelP1.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String d() {
        Parcel parcelP1 = p1(D0(), 7);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final void d4(q9.s1 s1Var) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, s1Var);
        L1(parcelD0, 32);
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String e() {
        Parcel parcelP1 = p1(D0(), 9);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String f() {
        Parcel parcelP1 = p1(D0(), 6);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String i() {
        Parcel parcelP1 = p1(D0(), 2);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String k() {
        Parcel parcelP1 = p1(D0(), 4);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final en m() {
        en dnVar;
        Parcel parcelP1 = p1(D0(), 5);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            dnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            dnVar = iInterfaceQueryLocalInterface instanceof en ? (en) iInterfaceQueryLocalInterface : new dn(strongBinder);
        }
        parcelP1.recycle();
        return dnVar;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final double n() {
        Parcel parcelP1 = p1(D0(), 8);
        double d10 = parcelP1.readDouble();
        parcelP1.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final zm o() {
        zm xmVar;
        Parcel parcelP1 = p1(D0(), 14);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            xmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            xmVar = iInterfaceQueryLocalInterface instanceof zm ? (zm) iInterfaceQueryLocalInterface : new xm(strongBinder);
        }
        parcelP1.recycle();
        return xmVar;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String p() {
        Parcel parcelP1 = p1(D0(), 10);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final q9.b2 q() {
        Parcel parcelP1 = p1(D0(), 11);
        q9.b2 b2VarL4 = q9.a2.l4(parcelP1.readStrongBinder());
        parcelP1.recycle();
        return b2VarL4;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final xa.a u() {
        return pe.a.n(p1(D0(), 19));
    }
}
