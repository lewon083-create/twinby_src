package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lr extends cb.a implements nr {
    public lr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener", 1);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void B3(q9.x1 x1Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, x1Var);
        L1(parcelD0, 24);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void E2() {
        L1(D0(), 18);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void E3(String str, String str2) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        L1(parcelD0, 9);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void G1(qn qnVar, String str) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, qnVar);
        parcelD0.writeString(str);
        L1(parcelD0, 10);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void O(int i) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(i);
        L1(parcelD0, 3);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void U() {
        L1(D0(), 25);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void W1(bv bvVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, bvVar);
        L1(parcelD0, 16);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void Y(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void Z() {
        L1(D0(), 20);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void a0(String str) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        L1(parcelD0, 21);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void c() {
        L1(D0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void c4(int i, String str) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(i);
        parcelD0.writeString(str);
        L1(parcelD0, 22);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void d() {
        L1(D0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void e0() {
        L1(D0(), 11);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void f() {
        L1(D0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void i() {
        L1(D0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void i1(q9.x1 x1Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, x1Var);
        L1(parcelD0, 23);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void m() {
        L1(D0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void n() {
        L1(D0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void r() {
        L1(D0(), 13);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void t1(zu zuVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void y() {
        L1(D0(), 15);
    }
}
