package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sp0 implements ea.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IInterface f10373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug f10374d;

    public /* synthetic */ sp0(ug ugVar, IInterface iInterface, int i) {
        this.f10372b = i;
        this.f10373c = iInterface;
        this.f10374d = ugVar;
    }

    @Override // ea.a
    public final void g() {
        switch (this.f10372b) {
            case 0:
                if (((tp0) this.f10374d).f10691k != null) {
                    try {
                        ((q9.q1) this.f10373c).i();
                    } catch (RemoteException e3) {
                        u9.i.k("#007 Could not call remote method.", e3);
                        return;
                    }
                }
                break;
            default:
                if (((up0) this.f10374d).f11045e != null) {
                    try {
                        q9.n0 n0Var = (q9.n0) this.f10373c;
                        n0Var.L1(n0Var.D0(), 1);
                    } catch (RemoteException e7) {
                        u9.i.k("#007 Could not call remote method.", e7);
                    }
                }
                break;
        }
    }
}
