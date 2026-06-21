package com.google.ads.mediation;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.nr;
import com.google.android.gms.internal.ads.oq0;
import k9.v;
import pa.c0;
import u9.i;
import w9.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f2510e;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, j jVar) {
        this.f2510e = jVar;
    }

    @Override // k9.v
    public final void c() {
        oq0 oq0Var = (oq0) this.f2510e;
        oq0Var.getClass();
        c0.e("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdClosed.");
        try {
            ((nr) oq0Var.f8762c).c();
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // k9.v
    public final void j() {
        oq0 oq0Var = (oq0) this.f2510e;
        oq0Var.getClass();
        c0.e("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdOpened.");
        try {
            ((nr) oq0Var.f8762c).f();
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }
}
