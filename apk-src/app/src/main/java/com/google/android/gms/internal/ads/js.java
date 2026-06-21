package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class js extends cb.a implements ks {
    public js(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback", 1);
    }

    @Override // com.google.android.gms.internal.ads.ks
    public final void a(q9.x1 x1Var) {
        Parcel parcelD0 = D0();
        vg.c(parcelD0, x1Var);
        L1(parcelD0, 3);
    }
}
