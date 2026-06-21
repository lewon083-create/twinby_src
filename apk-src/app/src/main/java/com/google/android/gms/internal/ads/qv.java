package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qv extends ug implements bv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9604c;

    public qv(String str, int i) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f9603b = str;
        this.f9604c = i;
    }

    @Override // com.google.android.gms.internal.ads.bv
    public final int c() {
        return this.f9604c;
    }

    @Override // com.google.android.gms.internal.ads.bv
    public final String i() {
        return this.f9603b;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f9603b);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f9604c);
        return true;
    }
}
