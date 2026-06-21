package com.google.ads.mediation;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.kx0;
import com.google.android.gms.internal.ads.nr;
import com.google.android.gms.internal.ads.oq0;
import k9.m;
import pa.c0;
import u9.i;
import w9.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractAdViewAdapter f2511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f2512c;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, l lVar) {
        this.f2511b = abstractAdViewAdapter;
        this.f2512c = lVar;
    }

    @Override // k9.c
    public final void a() {
        oq0 oq0Var = (oq0) this.f2512c;
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
        ((oq0) this.f2512c).k(mVar);
    }

    @Override // k9.c
    public final void c() {
        oq0 oq0Var = (oq0) this.f2512c;
        oq0Var.getClass();
        c0.e("#008 Must be called on the main UI thread.");
        a aVar = (a) oq0Var.f8763d;
        if (((kx0) oq0Var.f8764e) == null) {
            if (aVar == null) {
                i.k("#007 Could not call remote method.", null);
                return;
            } else if (!aVar.f2505m) {
                i.c("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        i.c("Adapter called onAdImpression.");
        try {
            ((nr) oq0Var.f8762c).n();
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // k9.c
    public final void i() {
        oq0 oq0Var = (oq0) this.f2512c;
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
        oq0 oq0Var = (oq0) this.f2512c;
        oq0Var.getClass();
        c0.e("#008 Must be called on the main UI thread.");
        a aVar = (a) oq0Var.f8763d;
        if (((kx0) oq0Var.f8764e) == null) {
            if (aVar == null) {
                i.k("#007 Could not call remote method.", null);
                return;
            } else if (!aVar.f2506n) {
                i.c("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        i.c("Adapter called onAdClicked.");
        try {
            ((nr) oq0Var.f8762c).i();
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // k9.c
    public final void g() {
    }
}
