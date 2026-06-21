package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja0 f8664a;

    public oc0(ja0 ja0Var) {
        this.f8664a = ja0Var;
    }

    public final void a() {
        q9.b2 b2VarR = this.f8664a.r();
        q9.c2 c2VarR = null;
        if (b2VarR != null) {
            try {
                c2VarR = b2VarR.r();
            } catch (RemoteException unused) {
            }
        }
        if (c2VarR == null) {
            return;
        }
        try {
            c2VarR.i();
        } catch (RemoteException e3) {
            u9.i.i("Unable to call onVideoEnd()", e3);
        }
    }
}
