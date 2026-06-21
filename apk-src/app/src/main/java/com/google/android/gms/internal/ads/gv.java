package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gv extends ug implements hv {
    public gv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        bv avVar;
        switch (i) {
            case 1:
                i();
                break;
            case 2:
                c();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    avVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    avVar = iInterfaceQueryLocalInterface instanceof bv ? (bv) iInterfaceQueryLocalInterface : new av(strongBinder);
                }
                vg.f(parcel);
                Z2(avVar);
                break;
            case 4:
                int i10 = parcel.readInt();
                vg.f(parcel);
                b(i10);
                break;
            case 5:
                q9.x1 x1Var = (q9.x1) vg.b(parcel, q9.x1.CREATOR);
                vg.f(parcel);
                A3(x1Var);
                break;
            case 6:
                d();
                break;
            case 7:
                n();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
