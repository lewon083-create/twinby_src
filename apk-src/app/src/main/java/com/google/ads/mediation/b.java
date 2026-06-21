package com.google.ads.mediation;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.nr;
import com.google.android.gms.internal.ads.oq0;
import k9.m;
import pa.c0;
import u9.i;
import w9.h;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends k9.c implements l9.d, q9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f2507b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, h hVar) {
        this.f2507b = hVar;
    }

    @Override // k9.c
    public final void a() {
        oq0 oq0Var = (oq0) this.f2507b;
        oq0Var.getClass();
        c0.e("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdClosed.");
        try {
            ((nr) oq0Var.f8762c).c();
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // k9.c
    public final void b(m mVar) {
        ((oq0) this.f2507b).f(mVar);
    }

    @Override // k9.c
    public final void g() {
        oq0 oq0Var = (oq0) this.f2507b;
        oq0Var.getClass();
        c0.e("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdLoaded.");
        try {
            ((nr) oq0Var.f8762c).d();
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // l9.d
    public final void h(String str, String str2) {
        oq0 oq0Var = (oq0) this.f2507b;
        oq0Var.getClass();
        c0.e("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAppEvent.");
        try {
            ((nr) oq0Var.f8762c).E3(str, str2);
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // k9.c
    public final void i() {
        oq0 oq0Var = (oq0) this.f2507b;
        oq0Var.getClass();
        c0.e("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdOpened.");
        try {
            ((nr) oq0Var.f8762c).f();
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // k9.c, q9.a
    public final void onAdClicked() {
        oq0 oq0Var = (oq0) this.f2507b;
        oq0Var.getClass();
        c0.e("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdClicked.");
        try {
            ((nr) oq0Var.f8762c).i();
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }
}
