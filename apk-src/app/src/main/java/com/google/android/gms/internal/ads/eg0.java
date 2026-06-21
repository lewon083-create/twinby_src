package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class eg0 extends hg0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f4941h;
    public final u9.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kx0 f4942j;

    public eg0(Context context, u9.a aVar, kx0 kx0Var) {
        this.f4941h = context;
        this.i = aVar;
        this.f4942j = kx0Var;
    }

    @Override // com.google.android.gms.internal.ads.hg0, pa.c
    public final void c0(ma.b bVar) {
        super.c0(bVar);
        this.f4942j.F(new RemoteException("Connection failed: ".concat(String.valueOf(bVar.f28763e))));
    }

    @Override // com.google.android.gms.internal.ads.hg0, pa.b
    public final void l0(int i) {
        u9.i.c("Cannot connect to remote service, fallback to local instance.");
        this.f4942j.F(new RemoteException(l7.o.j(i, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i).length() + 33))));
    }

    @Override // pa.b
    public final void n0() {
        synchronized (this.f6134c) {
            if (!this.f6136e) {
                this.f6136e = true;
                try {
                    ((eu) this.f6138g.n()).v0(this.i.f34365b);
                    this.f4942j.mo4h();
                } catch (RemoteException e3) {
                    this.f4942j.F(e3);
                }
            }
        }
    }
}
