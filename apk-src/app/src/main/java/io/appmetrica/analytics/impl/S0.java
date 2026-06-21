package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class S0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f22934b;

    public S0(C0522u1 c0522u1, boolean z5) {
        this.f22934b = c0522u1;
        this.f22933a = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0646z0 c0646z0 = this.f22934b.f24823a;
        boolean z5 = this.f22933a;
        c0646z0.getClass();
        C0621y0.c().a(z5, true);
    }
}
