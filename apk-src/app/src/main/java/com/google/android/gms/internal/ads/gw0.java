package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gw0 extends ug implements fw0 {
    public gw0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                xa.b.L1(parcel.readStrongBinder());
                parcel.readString();
                vg.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                vg.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                vg.f(parcel);
                break;
            case 6:
                parcel.readInt();
                vg.f(parcel);
                break;
            case 7:
                parcel.readInt();
                vg.f(parcel);
                break;
            case 8:
                xa.b.L1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                vg.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void M3() {
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void b(int i) {
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void k0(int i) {
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void r2(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.fw0
    public final void h3(xa.b bVar, String str) {
    }
}
