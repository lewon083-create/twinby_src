package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class us implements s9.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbwl f11056b;

    public us(zzbwl zzbwlVar) {
        this.f11056b = zzbwlVar;
    }

    @Override // s9.l
    public final void A2() {
        u9.i.c("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // s9.l
    public final void D0() {
        u9.i.c("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // s9.l
    public final void E0(int i) {
        u9.i.c("AdMobCustomTabsAdapter overlay is closed.");
        oq0 oq0Var = (oq0) this.f11056b.f13165b;
        oq0Var.getClass();
        pa.c0.e("#008 Must be called on the main UI thread.");
        u9.i.c("Adapter called onAdClosed.");
        try {
            ((nr) oq0Var.f8762c).c();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // s9.l
    public final void L1() {
        u9.i.c("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // s9.l
    public final void T0() {
        u9.i.c("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // s9.l
    public final void X1() {
        u9.i.c("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // s9.l
    public final void i2() {
        u9.i.c("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // s9.l
    public final void m() {
        u9.i.c("Opening AdMobCustomTabsAdapter overlay.");
        oq0 oq0Var = (oq0) this.f11056b.f13165b;
        oq0Var.getClass();
        pa.c0.e("#008 Must be called on the main UI thread.");
        u9.i.c("Adapter called onAdOpened.");
        try {
            ((nr) oq0Var.f8762c).f();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // s9.l
    public final void p1() {
        u9.i.c("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // s9.l
    public final void w1() {
        u9.i.c("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // s9.l
    public final void d3() {
    }
}
