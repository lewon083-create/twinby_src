package com.google.ads.mediation;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.nr;
import com.google.android.gms.internal.ads.oq0;
import k9.m;
import pa.c0;
import u9.i;
import w9.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ea.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractAdViewAdapter f2508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f2509f;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, j jVar) {
        this.f2508e = abstractAdViewAdapter;
        this.f2509f = jVar;
    }

    @Override // k9.v
    public final void d(m mVar) {
        ((oq0) this.f2509f).i(mVar);
    }

    @Override // k9.v
    public final void i(Object obj) {
        v9.a aVar = (v9.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f2508e;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        j jVar = this.f2509f;
        aVar.c(new d(abstractAdViewAdapter, jVar));
        oq0 oq0Var = (oq0) jVar;
        oq0Var.getClass();
        c0.e("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdLoaded.");
        try {
            ((nr) oq0Var.f8762c).d();
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }
}
