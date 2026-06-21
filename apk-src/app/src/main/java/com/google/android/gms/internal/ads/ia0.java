package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ia0 extends q9.a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6443b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9.b2 f6444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sr f6445d;

    public ia0(q9.b2 b2Var, sr srVar) {
        this.f6444c = b2Var;
        this.f6445d = srVar;
    }

    @Override // q9.b2
    public final void Z3(q9.c2 c2Var) {
        synchronized (this.f6443b) {
            try {
                q9.b2 b2Var = this.f6444c;
                if (b2Var != null) {
                    b2Var.Z3(c2Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q9.b2
    public final void c() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q9.b2
    public final float d() {
        sr srVar = this.f6445d;
        if (srVar != null) {
            return srVar.P();
        }
        return 0.0f;
    }

    @Override // q9.b2
    public final int f() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q9.b2
    public final void i() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q9.b2
    public final boolean m() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q9.b2
    public final float n() {
        sr srVar = this.f6445d;
        if (srVar != null) {
            return srVar.J();
        }
        return 0.0f;
    }

    @Override // q9.b2
    public final float p() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q9.b2
    public final boolean q() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q9.b2
    public final q9.c2 r() {
        synchronized (this.f6443b) {
            try {
                q9.b2 b2Var = this.f6444c;
                if (b2Var == null) {
                    return null;
                }
                return b2Var.r();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q9.b2
    public final boolean s() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q9.b2
    public final void u0(boolean z5) throws RemoteException {
        throw new RemoteException();
    }

    @Override // q9.b2
    public final void y() throws RemoteException {
        throw new RemoteException();
    }
}
