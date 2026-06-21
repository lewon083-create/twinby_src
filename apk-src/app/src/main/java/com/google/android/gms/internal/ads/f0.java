package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f5158b;

    public f0(k0 k0Var) {
        this.f5158b = k0Var;
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void h() {
        pt1 pt1Var = this.f5158b.I;
        if (pt1Var != null) {
            pt1Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void j() {
        k0 k0Var = this.f5158b;
        Surface surface = k0Var.Q0;
        if (surface != null) {
            g1 g1Var = k0Var.D0;
            Handler handler = g1Var.f5590a;
            if (handler != null) {
                handler.post(new f1(g1Var, surface, SystemClock.elapsedRealtime()));
            }
            k0Var.T0 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void l() {
        k0 k0Var = this.f5158b;
        if (k0Var.Q0 != null) {
            k0Var.u0(0, 1);
        }
    }
}
