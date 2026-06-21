package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gn extends cb.a implements in {
    public gn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 1);
    }

    @Override // com.google.android.gms.internal.ads.in
    public final void F3(String str, xa.a aVar) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        vg.e(parcelD0, aVar);
        L1(parcelD0, 1);
    }

    @Override // com.google.android.gms.internal.ads.in
    public final void H(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 6);
    }

    @Override // com.google.android.gms.internal.ads.in
    public final xa.a Q(String str) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        return pe.a.n(p1(parcelD0, 2));
    }

    @Override // com.google.android.gms.internal.ads.in
    public final void X3(cn cnVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, cnVar);
        L1(parcelD0, 8);
    }

    @Override // com.google.android.gms.internal.ads.in
    public final void a1(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 7);
    }

    @Override // com.google.android.gms.internal.ads.in
    public final void d2(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 3);
    }

    @Override // com.google.android.gms.internal.ads.in
    public final void h0(xa.a aVar, int i) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        parcelD0.writeInt(i);
        L1(parcelD0, 5);
    }

    @Override // com.google.android.gms.internal.ads.in
    public final void i() {
        L1(D0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.in
    public final void w0(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 9);
    }
}
