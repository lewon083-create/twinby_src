package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zb0 extends ug implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, xp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f12940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q9.b2 f12941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fa0 f12942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12944f;

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        ha0 ha0Var;
        q9.b2 b2Var = null;
        cnVar = null;
        cnVar = null;
        cn cnVar = null;
        zp ypVar = null;
        if (i == 3) {
            pa.c0.e("#008 Must be called on the main UI thread.");
            if (this.f12943e) {
                u9.i.e("getVideoController: Instream ad should not be used after destroyed");
            } else {
                b2Var = this.f12941c;
            }
            parcel2.writeNoException();
            vg.e(parcel2, b2Var);
        } else if (i == 4) {
            pa.c0.e("#008 Must be called on the main UI thread.");
            m4();
            fa0 fa0Var = this.f12942d;
            if (fa0Var != null) {
                fa0Var.n();
            }
            this.f12942d = null;
            this.f12940b = null;
            this.f12941c = null;
            this.f12943e = true;
            parcel2.writeNoException();
        } else if (i == 5) {
            xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                ypVar = iInterfaceQueryLocalInterface instanceof zp ? (zp) iInterfaceQueryLocalInterface : new yp(strongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 1);
            }
            vg.f(parcel);
            l4(aVarL1, ypVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
            vg.f(parcel);
            pa.c0.e("#008 Must be called on the main UI thread.");
            l4(aVarL12, new yb0("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            pa.c0.e("#008 Must be called on the main UI thread.");
            if (this.f12943e) {
                u9.i.e("getVideoController: Instream ad should not be used after destroyed");
            } else {
                fa0 fa0Var2 = this.f12942d;
                if (fa0Var2 != null && (ha0Var = fa0Var2.F) != null) {
                    synchronized (ha0Var) {
                        cnVar = ha0Var.f6082a;
                    }
                }
            }
            parcel2.writeNoException();
            vg.e(parcel2, cnVar);
        }
        return true;
    }

    public final void l4(xa.a aVar, zp zpVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        pa.c0.e("#008 Must be called on the main UI thread.");
        if (this.f12943e) {
            u9.i.e("Instream ad can not be shown after destroy().");
            try {
                zpVar.t(2);
                return;
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
                return;
            }
        }
        View view = this.f12940b;
        if (view == null || this.f12941c == null) {
            u9.i.e("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                zpVar.t(0);
                return;
            } catch (RemoteException e7) {
                u9.i.k("#007 Could not call remote method.", e7);
                return;
            }
        }
        if (this.f12944f) {
            u9.i.e("Instream ad should not be used again.");
            try {
                zpVar.t(1);
                return;
            } catch (RemoteException e10) {
                u9.i.k("#007 Could not call remote method.", e10);
                return;
            }
        }
        this.f12944f = true;
        m4();
        ((ViewGroup) xa.b.X1(aVar)).addView(this.f12940b, new ViewGroup.LayoutParams(-1, -1));
        fp fpVar = p9.k.C.B;
        mx mxVar = new mx(this.f12940b, this);
        View view2 = (View) ((WeakReference) mxVar.f6568b).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            mxVar.F1(viewTreeObserver);
        }
        nx nxVar = new nx(this.f12940b, this);
        View view3 = (View) ((WeakReference) nxVar.f6568b).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            nxVar.F1(viewTreeObserver3);
        }
        n4();
        try {
            zpVar.i();
        } catch (RemoteException e11) {
            u9.i.k("#007 Could not call remote method.", e11);
        }
    }

    public final void m4() {
        View view = this.f12940b;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f12940b);
        }
    }

    public final void n4() {
        View view;
        fa0 fa0Var = this.f12942d;
        if (fa0Var == null || (view = this.f12940b) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        fa0Var.t(view, map, map, fa0.d(view));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        n4();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        n4();
    }
}
