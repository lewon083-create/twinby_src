package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wk0 implements q9.a, v80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q9.v f11827b;

    @Override // com.google.android.gms.internal.ads.v80
    public final synchronized void J() {
        q9.v vVar = this.f11827b;
        if (vVar != null) {
            try {
                vVar.z();
            } catch (RemoteException e3) {
                u9.i.i("Remote Exception at onPhysicalClick.", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final synchronized void L() {
    }

    @Override // q9.a
    public final synchronized void onAdClicked() {
        q9.v vVar = this.f11827b;
        if (vVar != null) {
            try {
                vVar.z();
            } catch (RemoteException e3) {
                u9.i.i("Remote Exception at onAdClicked.", e3);
            }
        }
    }
}
