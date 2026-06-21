package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dv extends ug implements ev {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4678b = 0;

    public dv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        lv jvVar = null;
        lv jvVar2 = null;
        q9.q1 p1Var = null;
        mv mvVar = null;
        hv fvVar = null;
        switch (i) {
            case 1:
                q9.d3 d3Var = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    jvVar = iInterfaceQueryLocalInterface instanceof lv ? (lv) iInterfaceQueryLocalInterface : new jv(strongBinder);
                }
                vg.f(parcel);
                R0(d3Var, jvVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    fvVar = iInterfaceQueryLocalInterface2 instanceof hv ? (hv) iInterfaceQueryLocalInterface2 : new fv(strongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 1);
                }
                vg.f(parcel);
                X2(fvVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zF = f();
                parcel2.writeNoException();
                ClassLoader classLoader = vg.f11374a;
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 4:
                String strD = d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 5:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                c1(aVarL1);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    mvVar = iInterfaceQueryLocalInterface3 instanceof mv ? (mv) iInterfaceQueryLocalInterface3 : new mv(strongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 1);
                }
                vg.f(parcel);
                U1(mvVar);
                parcel2.writeNoException();
                return true;
            case 7:
                pv pvVar = (pv) vg.b(parcel, pv.CREATOR);
                vg.f(parcel);
                X0(pvVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    p1Var = iInterfaceQueryLocalInterface4 instanceof q9.q1 ? (q9.q1) iInterfaceQueryLocalInterface4 : new q9.p1(strongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 1);
                }
                vg.f(parcel);
                u3(p1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleK = k();
                parcel2.writeNoException();
                vg.d(parcel2, bundleK);
                return true;
            case 10:
                xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
                ClassLoader classLoader2 = vg.f11374a;
                boolean z5 = parcel.readInt() != 0;
                vg.f(parcel);
                K2(aVarL12, z5);
                parcel2.writeNoException();
                return true;
            case 11:
                bv bvVarE = e();
                parcel2.writeNoException();
                vg.e(parcel2, bvVarE);
                return true;
            case 12:
                q9.y1 y1VarP = p();
                parcel2.writeNoException();
                vg.e(parcel2, y1VarP);
                return true;
            case 13:
                q9.s1 s1VarL4 = q9.w2.l4(parcel.readStrongBinder());
                vg.f(parcel);
                c2(s1VarL4);
                parcel2.writeNoException();
                return true;
            case 14:
                q9.d3 d3Var2 = (q9.d3) vg.b(parcel, q9.d3.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    jvVar2 = iInterfaceQueryLocalInterface5 instanceof lv ? (lv) iInterfaceQueryLocalInterface5 : new jv(strongBinder5);
                }
                vg.f(parcel);
                n1(d3Var2, jvVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zA = vg.a(parcel);
                vg.f(parcel);
                i4(zA);
                parcel2.writeNoException();
                return true;
            case 16:
                String strQ = q();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 17:
                long jO = o();
                parcel2.writeNoException();
                parcel2.writeLong(jO);
                return true;
            case 18:
                long j10 = parcel.readLong();
                vg.f(parcel);
                T2(j10);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
