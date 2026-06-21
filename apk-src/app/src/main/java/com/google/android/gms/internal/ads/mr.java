package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mr extends ug implements nr {
    public mr() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static nr l4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof nr ? (nr) iInterfaceQueryLocalInterface : new lr(iBinder);
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
                int i10 = parcel.readInt();
                vg.f(parcel);
                O(i10);
                break;
            case 4:
                m();
                break;
            case 5:
                f();
                break;
            case 6:
                d();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                vg.f(parcel);
                break;
            case 8:
                n();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                vg.f(parcel);
                E3(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                }
                parcel.readString();
                vg.f(parcel);
                break;
            case 11:
                e0();
                break;
            case 12:
                parcel.readString();
                vg.f(parcel);
                break;
            case 13:
                r();
                break;
            case 14:
                zu zuVar = (zu) vg.b(parcel, zu.CREATOR);
                vg.f(parcel);
                t1(zuVar);
                break;
            case 15:
                y();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    avVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    avVar = iInterfaceQueryLocalInterface instanceof bv ? (bv) iInterfaceQueryLocalInterface : new av(strongBinder3);
                }
                vg.f(parcel);
                W1(avVar);
                break;
            case 17:
                int i11 = parcel.readInt();
                vg.f(parcel);
                Y(i11);
                break;
            case 18:
                E2();
                break;
            case 19:
                vg.f(parcel);
                break;
            case 20:
                Z();
                break;
            case 21:
                String string3 = parcel.readString();
                vg.f(parcel);
                a0(string3);
                break;
            case 22:
                int i12 = parcel.readInt();
                String string4 = parcel.readString();
                vg.f(parcel);
                c4(i12, string4);
                break;
            case 23:
                q9.x1 x1Var = (q9.x1) vg.b(parcel, q9.x1.CREATOR);
                vg.f(parcel);
                i1(x1Var);
                break;
            case 24:
                q9.x1 x1Var2 = (q9.x1) vg.b(parcel, q9.x1.CREATOR);
                vg.f(parcel);
                B3(x1Var2);
                break;
            case 25:
                U();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
