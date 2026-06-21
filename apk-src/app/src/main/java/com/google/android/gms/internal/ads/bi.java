package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bi extends ug implements di {
    public bi() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        zh yhVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                yhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                yhVar = iInterfaceQueryLocalInterface instanceof zh ? (zh) iInterfaceQueryLocalInterface : new yh(strongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 1);
            }
            vg.f(parcel);
            q2(yhVar);
        } else if (i == 2) {
            parcel.readInt();
            vg.f(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            q9.x1 x1Var = (q9.x1) vg.b(parcel, q9.x1.CREATOR);
            vg.f(parcel);
            d0(x1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
