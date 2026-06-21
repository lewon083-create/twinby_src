package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ou1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu1 f8806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mu1 f8807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f8810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8811f;

    public ou1(mu1 mu1Var, nu1 nu1Var, Looper looper) {
        this.f8807b = mu1Var;
        this.f8806a = nu1Var;
        this.f8810e = looper;
    }

    public final void a() {
        ix.k0(!this.f8811f);
        this.f8811f = true;
        ut1 ut1Var = (ut1) this.f8807b;
        if (!ut1Var.I && ut1Var.f11083k.getThread().isAlive()) {
            ut1Var.i.b(14, this).a();
        } else {
            rs.r("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z5) {
        notifyAll();
    }
}
