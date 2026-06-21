package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tt extends ug implements mw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ da.a f10710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(ut utVar, da.a aVar) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f10710b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            vg.f(parcel);
        } else if (i == 2) {
            String string = parcel.readString();
            vg.f(parcel);
            w(string);
        } else {
            if (i != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) vg.b(parcel, Bundle.CREATOR);
            vg.f(parcel);
            l1(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void l1(String str, String str2, Bundle bundle) {
        d8.b bVar = new d8.b();
        bVar.f15582a = str;
        this.f10710b.b(new v7.f(11, bVar));
    }

    @Override // com.google.android.gms.internal.ads.mw
    public final void w(String str) {
        this.f10710b.a(str);
    }
}
