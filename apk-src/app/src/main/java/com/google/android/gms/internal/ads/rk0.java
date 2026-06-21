package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rk0 extends q9.d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oq0 f9949b;

    public rk0(Context context, n10 n10Var, hq0 hq0Var, na0 na0Var, q9.y yVar) {
        oq0 oq0Var = new oq0(na0Var, (sd0) n10Var.f8118j.j());
        ((uk0) oq0Var.f8763d).f10954b.set(yVar);
        hi hiVar = new hi();
        hiVar.f6142c = n10Var;
        hiVar.f6145f = context;
        hiVar.f6143d = oq0Var;
        hiVar.f6141b = hq0Var;
        hiVar.f6144e = n10Var.c();
        hq0Var.f6228r = (uk0) oq0Var.f8763d;
        this.f9949b = new oq0(23, hiVar, hq0Var.f6214c);
    }

    @Override // q9.e0
    public final synchronized void B0(q9.d3 d3Var, int i) {
        this.f9949b.r(d3Var, i);
    }

    @Override // q9.e0
    public final void X(q9.d3 d3Var) {
        this.f9949b.r(d3Var, 1);
    }

    @Override // q9.e0
    public final synchronized String c() {
        String str;
        oq0 oq0Var = this.f9949b;
        synchronized (oq0Var) {
            try {
                e60 e60Var = (e60) oq0Var.f8764e;
                str = e60Var != null ? e60Var.f4843b : null;
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    @Override // q9.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean k() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.oq0 r0 = r2.f9949b     // Catch: java.lang.Throwable -> L1c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r0.f8762c     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.hi r1 = (com.google.android.gms.internal.ads.hi) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.f6146g     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.x40 r1 = (com.google.android.gms.internal.ads.x40) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L14
            boolean r1 = r1.f12017c     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            return r1
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1a:
            r1 = move-exception
            goto L18
        L1c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rk0.k():boolean");
    }

    @Override // q9.e0
    public final synchronized String m() {
        String str;
        oq0 oq0Var = this.f9949b;
        synchronized (oq0Var) {
            try {
                e60 e60Var = (e60) oq0Var.f8764e;
                str = e60Var != null ? e60Var.f4843b : null;
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            }
        }
        return str;
    }
}
