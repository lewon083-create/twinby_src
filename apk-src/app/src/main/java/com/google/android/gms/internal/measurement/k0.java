package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends cb.a implements l0 {
    public k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 3);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void W2(Bundle bundle) {
        Parcel parcelD0 = D0();
        y.b(parcelD0, bundle);
        T0(parcelD0, 1);
    }
}
