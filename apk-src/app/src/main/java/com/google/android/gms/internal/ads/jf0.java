package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jf0 extends k9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6842e;

    public jf0(pf0 pf0Var, String str, k9.l lVar) {
        this.f6839b = 0;
        this.f6840c = str;
        this.f6841d = lVar;
        Objects.requireNonNull(pf0Var);
        this.f6842e = pf0Var;
    }

    @Override // k9.c
    public void a() {
        switch (this.f6839b) {
            case 1:
                synchronized (this.f6840c) {
                    try {
                        k9.c cVar = (k9.c) this.f6841d;
                        if (cVar != null) {
                            cVar.a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                return;
        }
    }

    @Override // k9.c
    public final void b(k9.m mVar) {
        switch (this.f6839b) {
            case 0:
                ((pf0) this.f6842e).m4(pf0.p4(mVar));
                return;
            default:
                q9.g2 g2Var = (q9.g2) this.f6842e;
                k9.t tVar = g2Var.f31863c;
                q9.l0 l0Var = g2Var.i;
                q9.b2 b2VarC = null;
                if (l0Var != null) {
                    try {
                        b2VarC = l0Var.C();
                    } catch (RemoteException e3) {
                        u9.i.k("#007 Could not call remote method.", e3);
                    }
                    break;
                }
                tVar.a(b2VarC);
                synchronized (this.f6840c) {
                    try {
                        k9.c cVar = (k9.c) this.f6841d;
                        if (cVar != null) {
                            cVar.b(mVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // k9.c
    public void c() {
        switch (this.f6839b) {
            case 1:
                synchronized (this.f6840c) {
                    try {
                        k9.c cVar = (k9.c) this.f6841d;
                        if (cVar != null) {
                            cVar.c();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                return;
        }
    }

    @Override // k9.c
    public final void g() {
        switch (this.f6839b) {
            case 0:
                ((pf0) this.f6842e).l4((k9.l) this.f6841d, (String) this.f6840c);
                return;
            default:
                q9.g2 g2Var = (q9.g2) this.f6842e;
                k9.t tVar = g2Var.f31863c;
                q9.l0 l0Var = g2Var.i;
                q9.b2 b2VarC = null;
                if (l0Var != null) {
                    try {
                        b2VarC = l0Var.C();
                    } catch (RemoteException e3) {
                        u9.i.k("#007 Could not call remote method.", e3);
                    }
                    break;
                }
                tVar.a(b2VarC);
                synchronized (this.f6840c) {
                    try {
                        k9.c cVar = (k9.c) this.f6841d;
                        if (cVar != null) {
                            cVar.g();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // k9.c
    public void i() {
        switch (this.f6839b) {
            case 1:
                synchronized (this.f6840c) {
                    try {
                        k9.c cVar = (k9.c) this.f6841d;
                        if (cVar != null) {
                            cVar.i();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                return;
        }
    }

    @Override // k9.c, q9.a
    public void onAdClicked() {
        switch (this.f6839b) {
            case 1:
                synchronized (this.f6840c) {
                    try {
                        k9.c cVar = (k9.c) this.f6841d;
                        if (cVar != null) {
                            cVar.onAdClicked();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                return;
        }
    }

    public jf0(q9.g2 g2Var) {
        this.f6839b = 1;
        this.f6842e = g2Var;
        this.f6840c = new Object();
    }
}
