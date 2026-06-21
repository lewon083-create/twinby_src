package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jt extends cb.a implements lt {
    public jt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 1);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void K() {
        L1(D0(), 7);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void L(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 13);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void T3(Bundle bundle) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, bundle);
        L1(parcelD0, 1);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void W(Bundle bundle) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, bundle);
        Parcel parcelP1 = p1(parcelD0, 6);
        if (parcelP1.readInt() != 0) {
            bundle.readFromParcel(parcelP1);
        }
        parcelP1.recycle();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void c() {
        L1(D0(), 14);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void d() {
        L1(D0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void e() {
        L1(D0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void f() {
        L1(D0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void i() {
        L1(D0(), 10);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final boolean k() {
        Parcel parcelP1 = p1(D0(), 11);
        ClassLoader classLoader = vg.f11374a;
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void k1(int i, String[] strArr, int[] iArr) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(i);
        parcelD0.writeStringArray(strArr);
        parcelD0.writeIntArray(iArr);
        L1(parcelD0, 15);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void n() {
        L1(D0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void s1(int i, int i10, Intent intent) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(i);
        parcelD0.writeInt(i10);
        vg.c(parcelD0, intent);
        L1(parcelD0, 12);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void v() {
        L1(D0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void y() {
        L1(D0(), 8);
    }
}
