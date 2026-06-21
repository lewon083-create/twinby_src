package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f14202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f14203c;

    public h1(n1 n1Var, x1 x1Var) {
        this.f14202b = n1Var;
        this.f14203c = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14202b.f14252b != this) {
            return;
        }
        x1 x1Var = this.f14203c;
        if (n1.f14250g.E(this.f14202b, this, n1.f(x1Var))) {
            n1.h(this.f14202b);
        }
    }
}
