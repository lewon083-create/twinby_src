package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pn extends cb.a implements qn {
    public pn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 1);
    }

    @Override // com.google.android.gms.internal.ads.qn
    public final xa.a J2() {
        return pe.a.n(p1(D0(), 9));
    }

    @Override // com.google.android.gms.internal.ads.qn
    public final boolean L(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        Parcel parcelP1 = p1(parcelD0, 10);
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.qn
    public final String m() {
        Parcel parcelP1 = p1(D0(), 4);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }
}
