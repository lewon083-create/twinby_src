package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0223i1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f24035a;

    public RunnableC0223i1(C0522u1 c0522u1) {
        this.f24035a = c0522u1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24035a.f24823a.getClass();
        C0621y0.c().clearAppEnvironment();
    }
}
