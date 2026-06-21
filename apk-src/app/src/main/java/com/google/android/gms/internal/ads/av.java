package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class av extends cb.a implements bv {
    public av(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 1);
    }

    @Override // com.google.android.gms.internal.ads.bv
    public final int c() {
        Parcel parcelP1 = p1(D0(), 2);
        int i = parcelP1.readInt();
        parcelP1.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.bv
    public final String i() {
        Parcel parcelP1 = p1(D0(), 1);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }
}
