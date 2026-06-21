package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dn extends cb.a implements en {
    public dn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 1);
    }

    @Override // com.google.android.gms.internal.ads.en
    public final int c() {
        Parcel parcelP1 = p1(D0(), 5);
        int i = parcelP1.readInt();
        parcelP1.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.en
    public final double g() {
        Parcel parcelP1 = p1(D0(), 3);
        double d10 = parcelP1.readDouble();
        parcelP1.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.en
    public final int i() {
        Parcel parcelP1 = p1(D0(), 4);
        int i = parcelP1.readInt();
        parcelP1.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.en
    public final xa.a j() {
        return pe.a.n(p1(D0(), 1));
    }

    @Override // com.google.android.gms.internal.ads.en
    public final Map k() {
        Parcel parcelP1 = p1(D0(), 6);
        HashMap hashMap = parcelP1.readHashMap(vg.f11374a);
        parcelP1.recycle();
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.en
    public final Uri l() {
        Parcel parcelP1 = p1(D0(), 2);
        Uri uri = (Uri) vg.b(parcelP1, Uri.CREATOR);
        parcelP1.recycle();
        return uri;
    }
}
