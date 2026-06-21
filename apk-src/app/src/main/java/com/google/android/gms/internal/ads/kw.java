package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kw extends cb.a implements mw {
    @Override // com.google.android.gms.internal.ads.mw
    public final void l1(String str, String str2, Bundle bundle) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        vg.c(parcelD0, bundle);
        L1(parcelD0, 3);
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void w(String str) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        L1(parcelD0, 2);
    }
}
