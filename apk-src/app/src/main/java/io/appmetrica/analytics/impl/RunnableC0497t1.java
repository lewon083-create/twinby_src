package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0497t1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f24749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f24750b;

    public RunnableC0497t1(C0522u1 c0522u1, Throwable th2) {
        this.f24750b = c0522u1;
        this.f24749a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0522u1.a(this.f24750b).reportUnhandledException(this.f24749a);
    }
}
