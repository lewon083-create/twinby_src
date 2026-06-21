package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tn extends cb.a implements un {
    @Override // com.google.android.gms.internal.ads.un
    public final void Q1(qn qnVar, String str) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, qnVar);
        parcelD0.writeString(str);
        L1(parcelD0, 1);
    }
}
