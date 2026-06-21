package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dg0 extends hg0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4564h;
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f4565j;

    public dg0(Context context, gx gxVar, int i) {
        this.f4564h = i;
        switch (i) {
            case 1:
                this.i = context;
                this.f4565j = gxVar;
                this.f6138g = new ki(context, p9.k.C.f31313t.i(), this, this, 2);
                break;
            default:
                this.i = context;
                this.f4565j = gxVar;
                this.f6138g = new ki(context, p9.k.C.f31313t.i(), this, this, 2);
                break;
        }
    }

    public ed.d c(ku kuVar) {
        synchronized (this.f6134c) {
            try {
                if (this.f6135d) {
                    return this.f6133b;
                }
                this.f6135d = true;
                this.f6137f = kuVar;
                this.f6138g.d();
                jx jxVar = this.f6133b;
                jxVar.f6961b.a(new h30(14, this), hx.f6285g);
                hg0.b(this.i, jxVar, this.f4565j);
                return jxVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hg0, pa.c
    public void c0(ma.b bVar) {
        switch (this.f4564h) {
            case 0:
                u9.i.c("Cannot connect to remote service, fallback to local instance.");
                this.f6133b.d(new og0(1));
                break;
            default:
                super.c0(bVar);
                break;
        }
    }

    @Override // pa.b
    public final void n0() {
        switch (this.f4564h) {
            case 0:
                synchronized (this.f6134c) {
                    try {
                        if (!this.f6136e) {
                            this.f6136e = true;
                            try {
                                try {
                                    ((eu) this.f6138g.n()).L0(this.f6137f, ((Boolean) q9.s.f31967e.f31970c.a(al.ie)).booleanValue() ? new gg0(this.f6133b, this.f6137f) : new fg0(this));
                                } catch (Throwable th2) {
                                    p9.k.C.f31302h.d("RemoteAdRequestClientTask.onConnected", th2);
                                    this.f6133b.d(new og0(1));
                                }
                            } catch (RemoteException | IllegalArgumentException unused) {
                                this.f6133b.d(new og0(1));
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f6134c) {
                    try {
                        if (!this.f6136e) {
                            this.f6136e = true;
                            try {
                                ((eu) this.f6138g.n()).Z1(this.f6137f, ((Boolean) q9.s.f31967e.f31970c.a(al.ie)).booleanValue() ? new gg0(this.f6133b, this.f6137f) : new fg0(this));
                            } catch (RemoteException | IllegalArgumentException unused2) {
                                this.f6133b.d(new og0(1));
                            } catch (Throwable th4) {
                                p9.k.C.f31302h.d("RemoteSignalsClientTask.onConnected", th4);
                                this.f6133b.d(new og0(1));
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                    break;
                }
                return;
        }
    }
}
