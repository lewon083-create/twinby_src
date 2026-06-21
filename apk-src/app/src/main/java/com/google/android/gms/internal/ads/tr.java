package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tr extends q9.a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10699b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile q9.c2 f10700c;

    @Override // q9.b2
    public final void Z3(q9.c2 c2Var) {
        synchronized (this.f10699b) {
            this.f10700c = c2Var;
        }
    }

    @Override // q9.b2
    public final void c() throws RemoteException {
        throw new RemoteException();
    }

    @Override // q9.b2
    public final float d() throws RemoteException {
        throw new RemoteException();
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
    public final float n() throws RemoteException {
        throw new RemoteException();
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
        q9.c2 c2Var;
        synchronized (this.f10699b) {
            c2Var = this.f10700c;
        }
        return c2Var;
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
