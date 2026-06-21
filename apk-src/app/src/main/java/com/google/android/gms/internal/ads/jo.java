package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jo extends ug implements bo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(int i, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f6906b = i;
        this.f6907c = obj;
    }

    @Override // com.google.android.gms.internal.ads.bo
    public final void N1(fo foVar) {
        String strI;
        String strK;
        String strF;
        String strD;
        String strE;
        String strP;
        double dN;
        switch (this.f6906b) {
            case 0:
                z7 z7Var = new z7(foVar);
                com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) this.f6907c;
                eVar.getClass();
                com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
                aVar.f2504l = new Bundle();
                fo foVar2 = (fo) z7Var.f12901c;
                Object objX1 = null;
                try {
                    strI = foVar2.i();
                } catch (RemoteException e3) {
                    u9.i.f("", e3);
                    strI = null;
                }
                aVar.f2494a = strI;
                aVar.f2495b = (ArrayList) z7Var.f12902d;
                try {
                    strK = foVar2.k();
                } catch (RemoteException e7) {
                    u9.i.f("", e7);
                    strK = null;
                }
                aVar.f2496c = strK;
                aVar.f2497d = (fn) z7Var.f12903e;
                try {
                    strF = foVar2.f();
                } catch (RemoteException e10) {
                    u9.i.f("", e10);
                    strF = null;
                }
                aVar.f2498e = strF;
                try {
                    strD = foVar2.d();
                } catch (RemoteException e11) {
                    u9.i.f("", e11);
                    strD = null;
                }
                aVar.f2499f = strD;
                try {
                    dN = foVar2.n();
                } catch (RemoteException e12) {
                    u9.i.f("", e12);
                }
                Double dValueOf = dN != -1.0d ? Double.valueOf(dN) : null;
                aVar.f2500g = dValueOf;
                try {
                    strE = foVar2.e();
                } catch (RemoteException e13) {
                    u9.i.f("", e13);
                    strE = null;
                }
                aVar.f2501h = strE;
                try {
                    strP = foVar2.p();
                } catch (RemoteException e14) {
                    u9.i.f("", e14);
                    strP = null;
                }
                aVar.i = strP;
                try {
                    xa.a aVarU = foVar2.u();
                    if (aVarU != null) {
                        objX1 = xa.b.X1(aVarU);
                    }
                } catch (RemoteException e15) {
                    u9.i.f("", e15);
                }
                aVar.f2503k = objX1;
                aVar.f2505m = true;
                aVar.f2506n = true;
                k9.t tVar = (k9.t) z7Var.f12904f;
                try {
                    if (foVar2.q() != null) {
                        tVar.a(foVar2.q());
                    }
                } catch (RemoteException e16) {
                    u9.i.f("Exception occurred while getting video controller", e16);
                }
                aVar.f2502j = tVar;
                w9.l lVar = eVar.f2512c;
                AbstractAdViewAdapter abstractAdViewAdapter = eVar.f2511b;
                oq0 oq0Var = (oq0) lVar;
                oq0Var.getClass();
                pa.c0.e("#008 Must be called on the main UI thread.");
                u9.i.c("Adapter called onAdLoaded.");
                oq0Var.f8763d = aVar;
                if (!(abstractAdViewAdapter instanceof AdMobAdapter)) {
                    Object obj = new Object();
                    new tr();
                    synchronized (obj) {
                    }
                }
                try {
                    ((nr) oq0Var.f8762c).d();
                    return;
                } catch (RemoteException e17) {
                    u9.i.k("#007 Could not call remote method.", e17);
                    return;
                }
            default:
                ((z9.a) this.f6907c).f(new ct(foVar));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        fo eoVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            eoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            eoVar = iInterfaceQueryLocalInterface instanceof fo ? (fo) iInterfaceQueryLocalInterface : new eo(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 1);
        }
        vg.f(parcel);
        N1(eoVar);
        parcel2.writeNoException();
        return true;
    }
}
