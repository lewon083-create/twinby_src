package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yh extends cb.a implements zh {
    @Override // com.google.android.gms.internal.ads.zh
    public final void I(boolean z5) {
        Parcel parcelD0 = D0();
        ClassLoader classLoader = vg.f11374a;
        parcelD0.writeInt(z5 ? 1 : 0);
        L1(parcelD0, 6);
    }

    @Override // com.google.android.gms.internal.ads.zh
    public final String d() {
        Parcel parcelP1 = p1(D0(), 8);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zh
    public final q9.y1 k() {
        Parcel parcelP1 = p1(D0(), 5);
        q9.y1 y1VarL4 = e60.l4(parcelP1.readStrongBinder());
        parcelP1.recycle();
        return y1VarL4;
    }

    @Override // com.google.android.gms.internal.ads.zh
    public final void m3(q9.s1 s1Var) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, s1Var);
        L1(parcelD0, 7);
    }

    @Override // com.google.android.gms.internal.ads.zh
    public final void v3(xa.a aVar, fi fiVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.e(parcelD0, fiVar);
        L1(parcelD0, 4);
    }
}
