package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hr extends cb.a implements ir {
    @Override // com.google.android.gms.internal.ads.ir
    public final os D(String str) {
        os nsVar;
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        Parcel parcelP1 = p1(parcelD0, 3);
        IBinder strongBinder = parcelP1.readStrongBinder();
        int i = ss.f10377c;
        if (strongBinder == null) {
            nsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            nsVar = iInterfaceQueryLocalInterface instanceof os ? (os) iInterfaceQueryLocalInterface : new ns(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 1);
        }
        parcelP1.recycle();
        return nsVar;
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final boolean F(String str) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        Parcel parcelP1 = p1(parcelD0, 4);
        ClassLoader classLoader = vg.f11374a;
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final boolean Q(String str) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        Parcel parcelP1 = p1(parcelD0, 2);
        ClassLoader classLoader = vg.f11374a;
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.ir
    public final kr w(String str) {
        kr jrVar;
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        Parcel parcelP1 = p1(parcelD0, 1);
        IBinder strongBinder = parcelP1.readStrongBinder();
        if (strongBinder == null) {
            jrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            jrVar = iInterfaceQueryLocalInterface instanceof kr ? (kr) iInterfaceQueryLocalInterface : new jr(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 1);
        }
        parcelP1.recycle();
        return jrVar;
    }
}
