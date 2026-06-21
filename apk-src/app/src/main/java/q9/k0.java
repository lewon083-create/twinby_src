package q9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.di;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.uu;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends ug implements l0 {
    public k0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        y wVar = null;
        a1 z0Var = null;
        b0 zVar = null;
        s1 r1Var = null;
        di aiVar = null;
        uu uuVar = null;
        y0 y0Var = null;
        v uVar = null;
        gl glVar = null;
        v0 u0Var = null;
        switch (i) {
            case 1:
                xa.a aVarJ = j();
                parcel2.writeNoException();
                vg.e(parcel2, aVarJ);
                return true;
            case 2:
                h();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zG = g();
                parcel2.writeNoException();
                ClassLoader classLoader = vg.f11374a;
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 4:
                d3 d3Var = (d3) vg.b(parcel, d3.CREATOR);
                vg.f(parcel);
                boolean zX = X(d3Var);
                parcel2.writeNoException();
                parcel2.writeInt(zX ? 1 : 0);
                return true;
            case 5:
                c();
                parcel2.writeNoException();
                return true;
            case 6:
                k();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    wVar = iInterfaceQueryLocalInterface instanceof y ? (y) iInterfaceQueryLocalInterface : new w(strongBinder);
                }
                vg.f(parcel);
                j3(wVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    u0Var = iInterfaceQueryLocalInterface2 instanceof v0 ? (v0) iInterfaceQueryLocalInterface2 : new u0(strongBinder2);
                }
                vg.f(parcel);
                v1(u0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                e();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                p();
                parcel2.writeNoException();
                return true;
            case 12:
                g3 g3VarQ = q();
                parcel2.writeNoException();
                vg.d(parcel2, g3VarQ);
                return true;
            case 13:
                g3 g3Var = (g3) vg.b(parcel, g3.CREATOR);
                vg.f(parcel);
                y2(g3Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                }
                vg.f(parcel);
                s();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                }
                parcel.readString();
                vg.f(parcel);
                o();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strX = x();
                parcel2.writeNoException();
                parcel2.writeString(strX);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    glVar = iInterfaceQueryLocalInterface3 instanceof gl ? (gl) iInterfaceQueryLocalInterface3 : new gl(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 1);
                }
                vg.f(parcel);
                j4(glVar);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    uVar = iInterfaceQueryLocalInterface4 instanceof v ? (v) iInterfaceQueryLocalInterface4 : new u(strongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 1);
                }
                vg.f(parcel);
                V3(uVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    y0Var = iInterfaceQueryLocalInterface5 instanceof y0 ? (y0) iInterfaceQueryLocalInterface5 : new y0(strongBinder7);
                }
                vg.f(parcel);
                I3(y0Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zA = vg.a(parcel);
                vg.f(parcel);
                S2(zA);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zJ = J();
                parcel2.writeNoException();
                ClassLoader classLoader2 = vg.f11374a;
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    uuVar = iInterfaceQueryLocalInterface6 instanceof uu ? (uu) iInterfaceQueryLocalInterface6 : new uu(strongBinder8);
                }
                vg.f(parcel);
                k2(uuVar);
                parcel2.writeNoException();
                return true;
            case 25:
                String string = parcel.readString();
                vg.f(parcel);
                b3(string);
                parcel2.writeNoException();
                return true;
            case 26:
                b2 b2VarC = C();
                parcel2.writeNoException();
                vg.e(parcel2, b2VarC);
                return true;
            case 29:
                b3 b3Var = (b3) vg.b(parcel, b3.CREATOR);
                vg.f(parcel);
                a2(b3Var);
                parcel2.writeNoException();
                return true;
            case 30:
                vg.f(parcel);
                N();
                parcel2.writeNoException();
                return true;
            case 31:
                String strA = A();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 32:
                v0 v0VarU = u();
                parcel2.writeNoException();
                vg.e(parcel2, v0VarU);
                return true;
            case 33:
                y yVarB0 = b0();
                parcel2.writeNoException();
                vg.e(parcel2, yVarB0);
                return true;
            case 34:
                boolean zA2 = vg.a(parcel);
                vg.f(parcel);
                f1(zA2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strV = v();
                parcel2.writeNoException();
                parcel2.writeString(strV);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                }
                vg.f(parcel);
                F1();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleN = n();
                parcel2.writeNoException();
                vg.d(parcel2, bundleN);
                return true;
            case 38:
                parcel.readString();
                vg.f(parcel);
                i0();
                parcel2.writeNoException();
                return true;
            case 39:
                j3 j3Var = (j3) vg.b(parcel, j3.CREATOR);
                vg.f(parcel);
                C1(j3Var);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    aiVar = iInterfaceQueryLocalInterface7 instanceof di ? (di) iInterfaceQueryLocalInterface7 : new ai(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 1);
                }
                vg.f(parcel);
                J1(aiVar);
                parcel2.writeNoException();
                return true;
            case 41:
                y1 y1VarB = B();
                parcel2.writeNoException();
                vg.e(parcel2, y1VarB);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    r1Var = iInterfaceQueryLocalInterface8 instanceof s1 ? (s1) iInterfaceQueryLocalInterface8 : new r1(strongBinder11);
                }
                vg.f(parcel);
                B2(r1Var);
                parcel2.writeNoException();
                return true;
            case 43:
                d3 d3Var2 = (d3) vg.b(parcel, d3.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zVar = iInterfaceQueryLocalInterface9 instanceof b0 ? (b0) iInterfaceQueryLocalInterface9 : new z(strongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 1);
                }
                vg.f(parcel);
                R3(d3Var2, zVar);
                parcel2.writeNoException();
                return true;
            case 44:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                C0(aVarL1);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    z0Var = iInterfaceQueryLocalInterface10 instanceof a1 ? (a1) iInterfaceQueryLocalInterface10 : new z0(strongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 1);
                }
                vg.f(parcel);
                o3(z0Var);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zP = P();
                parcel2.writeNoException();
                ClassLoader classLoader3 = vg.f11374a;
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 47:
                long jG0 = g0();
                parcel2.writeNoException();
                parcel2.writeLong(jG0);
                return true;
            case 48:
                long j10 = parcel.readLong();
                vg.f(parcel);
                e1(j10);
                parcel2.writeNoException();
                return true;
        }
    }
}
