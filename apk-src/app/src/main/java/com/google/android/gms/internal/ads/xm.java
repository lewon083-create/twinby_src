package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xm extends cb.a implements zm {
    public xm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 1);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String j() {
        Parcel parcelP1 = p1(D0(), 2);
        String string = parcelP1.readString();
        parcelP1.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final ArrayList l() {
        Parcel parcelP1 = p1(D0(), 3);
        ArrayList arrayList = parcelP1.readArrayList(vg.f11374a);
        parcelP1.recycle();
        return arrayList;
    }
}
