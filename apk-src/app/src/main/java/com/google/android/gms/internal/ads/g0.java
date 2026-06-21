package com.google.android.gms.internal.ads;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bx1 f5557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f5559c;

    public g0(k0 k0Var, bx1 bx1Var, int i, long j10) {
        this.f5557a = bx1Var;
        this.f5558b = i;
        this.f5559c = k0Var;
    }

    public final void a() {
        k0 k0Var = this.f5559c;
        k0Var.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.f5557a.E(this.f5558b);
        Trace.endSection();
        k0Var.u0(0, 1);
    }
}
