package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sp extends cb.a implements tp {
    @Override // com.google.android.gms.internal.ads.tp
    public final void k3(List list) {
        Parcel parcelD0 = D0();
        parcelD0.writeTypedList(list);
        L1(parcelD0, 1);
    }
}
