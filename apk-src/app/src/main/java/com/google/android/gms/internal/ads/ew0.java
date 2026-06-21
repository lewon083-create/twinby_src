package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ew0 extends cb.a implements fw0 {
    @Override // com.google.android.gms.internal.ads.fw0
    public final void M3() {
        Parcel parcelD0 = D0();
        parcelD0.writeIntArray(null);
        L1(parcelD0, 4);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void b(int i) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(i);
        L1(parcelD0, 6);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void h3(xa.b bVar, String str) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, bVar);
        parcelD0.writeString(str);
        parcelD0.writeString(null);
        L1(parcelD0, 8);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void i() {
        L1(D0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void k0(int i) {
        Parcel parcelD0 = D0();
        parcelD0.writeInt(i);
        L1(parcelD0, 7);
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void r2(byte[] bArr) {
        Parcel parcelD0 = D0();
        parcelD0.writeByteArray(bArr);
        L1(parcelD0, 5);
    }
}
