package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vk0 implements h70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f11403b = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.h70
    public final void a(q9.h3 h3Var) {
        Object obj = this.f11403b.get();
        if (obj == null) {
            return;
        }
        try {
            ((q9.s1) obj).l3(h3Var);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }
}
