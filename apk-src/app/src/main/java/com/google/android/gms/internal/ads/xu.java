package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xu extends ug implements yu {
    public xu() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                H1(aVarL1);
                break;
            case 2:
                xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                vg.f(parcel);
                h0(aVarL12, i10);
                break;
            case 3:
                xa.a aVarL13 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                H(aVarL13);
                break;
            case 4:
                xa.a aVarL14 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                s0(aVarL14);
                break;
            case 5:
                xa.a aVarL15 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                H3(aVarL15);
                break;
            case 6:
                xa.a aVarL16 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                V(aVarL16);
                break;
            case 7:
                xa.a aVarL17 = xa.b.L1(parcel.readStrongBinder());
                zu zuVar = (zu) vg.b(parcel, zu.CREATOR);
                vg.f(parcel);
                Y0(aVarL17, zuVar);
                break;
            case 8:
                xa.a aVarL18 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                g2(aVarL18);
                break;
            case 9:
                xa.a aVarL19 = xa.b.L1(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                vg.f(parcel);
                i3(aVarL19, i11);
                break;
            case 10:
                xa.a aVarL110 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                L(aVarL110);
                break;
            case 11:
                xa.a aVarL111 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                O2(aVarL111);
                break;
            case 12:
                vg.f(parcel);
                break;
            case 13:
                xa.a aVarL112 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                b4(aVarL112);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
