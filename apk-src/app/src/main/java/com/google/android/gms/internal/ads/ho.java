package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ho extends ug implements un {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oq0 f6203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(oq0 oq0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.f6203b = oq0Var;
    }

    @Override // com.google.android.gms.internal.ads.un
    public final void Q1(qn qnVar, String str) {
        kx0 kx0Var;
        oq0 oq0Var = this.f6203b;
        if (((com.google.ads.mediation.e) oq0Var.f8763d) == null) {
            return;
        }
        synchronized (oq0Var) {
            kx0Var = (kx0) oq0Var.f8764e;
            if (kx0Var == null) {
                kx0Var = new kx0(qnVar);
                oq0Var.f8764e = kx0Var;
            }
        }
        oq0 oq0Var2 = (oq0) ((com.google.ads.mediation.e) oq0Var.f8763d).f2512c;
        oq0Var2.getClass();
        try {
            ((nr) oq0Var2.f8762c).G1((qn) kx0Var.f7326c, str);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        qn pnVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            pnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            pnVar = iInterfaceQueryLocalInterface instanceof qn ? (qn) iInterfaceQueryLocalInterface : new pn(strongBinder);
        }
        String string = parcel.readString();
        vg.f(parcel);
        Q1(pnVar, string);
        parcel2.writeNoException();
        return true;
    }
}
