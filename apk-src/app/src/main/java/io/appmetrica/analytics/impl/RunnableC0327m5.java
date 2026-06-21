package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0327m5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0029ae f24337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0352n5 f24338b;

    public RunnableC0327m5(C0352n5 c0352n5, InterfaceC0029ae interfaceC0029ae) {
        this.f24338b = c0352n5;
        this.f24337a = interfaceC0029ae;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24338b) {
            try {
                C0352n5 c0352n5 = this.f24338b;
                Object obj = c0352n5.f24399a;
                if (obj == null) {
                    c0352n5.f24400b.add(this.f24337a);
                } else {
                    this.f24337a.consume(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
