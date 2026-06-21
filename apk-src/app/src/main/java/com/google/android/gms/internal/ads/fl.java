package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fl extends ug {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9.d f5379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5381d;

    public fl(p9.d dVar, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f5379b = dVar;
        this.f5380c = str;
        this.f5381d = str2;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f5380c);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f5381d);
            return true;
        }
        p9.d dVar = this.f5379b;
        if (i == 3) {
            xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
            vg.f(parcel);
            if (aVarL1 != null) {
                dVar.z((View) xa.b.X1(aVarL1));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            dVar.j();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        dVar.mo5l();
        parcel2.writeNoException();
        return true;
    }
}
