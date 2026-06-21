package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jg0 extends hg0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f6843h;
    public int i;

    @Override // com.google.android.gms.internal.ads.hg0, pa.c
    public final void c0(ma.b bVar) {
        u9.i.c("Cannot connect to remote service, fallback to local instance.");
        this.f6133b.d(new og0(1));
    }

    @Override // pa.b
    public final void n0() {
        synchronized (this.f6134c) {
            try {
                if (!this.f6136e) {
                    this.f6136e = true;
                    try {
                        try {
                            int i = this.i;
                            if (i == 2) {
                                ((eu) this.f6138g.n()).D1(this.f6137f, ((Boolean) q9.s.f31967e.f31970c.a(al.ie)).booleanValue() ? new gg0(this.f6133b, this.f6137f) : new fg0(this));
                            } else if (i == 3) {
                                ((eu) this.f6138g.n()).W3(this.f6843h, ((Boolean) q9.s.f31967e.f31970c.a(al.ie)).booleanValue() ? new gg0(this.f6133b, this.f6137f) : new fg0(this));
                            } else {
                                this.f6133b.d(new og0(1));
                            }
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f6133b.d(new og0(1));
                        }
                    } catch (Throwable th2) {
                        p9.k.C.f31302h.d("RemoteUrlAndCacheKeyClientTask.onConnected", th2);
                        this.f6133b.d(new og0(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
