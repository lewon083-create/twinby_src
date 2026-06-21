package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u30 extends ug implements zh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t30 f10806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9.l0 f10807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mo0 f10808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sd0 f10810f;

    public u30(t30 t30Var, q9.l0 l0Var, mo0 mo0Var, sd0 sd0Var) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f10809e = ((Boolean) q9.s.f31967e.f31970c.a(al.f2981e1)).booleanValue();
        this.f10806b = t30Var;
        this.f10807c = l0Var;
        this.f10808d = mo0Var;
        this.f10810f = sd0Var;
    }

    @Override // com.google.android.gms.internal.ads.zh
    public final void I(boolean z5) {
        this.f10809e = z5;
    }

    @Override // com.google.android.gms.internal.ads.zh
    public final String d() {
        try {
            return this.f10807c.A();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zh
    public final q9.y1 k() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3271x7)).booleanValue()) {
            return this.f10806b.f9701f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        fi eiVar;
        r50 r50Var;
        r50 r50Var2;
        t30 t30Var = this.f10806b;
        switch (i) {
            case 2:
                parcel2.writeNoException();
                vg.e(parcel2, this.f10807c);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                vg.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    eiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    eiVar = iInterfaceQueryLocalInterface instanceof fi ? (fi) iInterfaceQueryLocalInterface : new ei(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 1);
                }
                vg.f(parcel);
                v3(aVarL1, eiVar);
                parcel2.writeNoException();
                return true;
            case 5:
                q9.y1 y1VarK = k();
                parcel2.writeNoException();
                vg.e(parcel2, y1VarK);
                return true;
            case 6:
                boolean zA = vg.a(parcel);
                vg.f(parcel);
                this.f10809e = zA;
                parcel2.writeNoException();
                return true;
            case 7:
                q9.s1 s1VarL4 = q9.w2.l4(parcel.readStrongBinder());
                vg.f(parcel);
                m3(s1VarL4);
                parcel2.writeNoException();
                return true;
            case 8:
                String strD = d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 9:
                long j10 = (t30Var == null || (r50Var = t30Var.f9704j) == null) ? 0L : r50Var.f9712a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j10);
                return true;
            case 10:
                long j11 = parcel.readLong();
                vg.f(parcel);
                if (t30Var != null && (r50Var2 = t30Var.f9704j) != null) {
                    r50Var2.a(j11);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zh
    public final void m3(q9.s1 s1Var) {
        pa.c0.e("setOnPaidEventListener must be called on the main UI thread.");
        mo0 mo0Var = this.f10808d;
        if (mo0Var != null) {
            try {
                if (!s1Var.c()) {
                    this.f10810f.b();
                }
            } catch (RemoteException e3) {
                u9.i.d("Error in making CSI ping for reporting paid event callback", e3);
            }
            mo0Var.f7962h.set(s1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zh
    public final void v3(xa.a aVar, fi fiVar) {
        try {
            this.f10808d.f7959e.set(fiVar);
            this.f10806b.c((Activity) xa.b.X1(aVar), this.f10809e);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }
}
