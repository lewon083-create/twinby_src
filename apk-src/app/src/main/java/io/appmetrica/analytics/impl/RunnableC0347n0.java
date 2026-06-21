package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0347n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0397p0 f24390a;

    public RunnableC0347n0(C0397p0 c0397p0) {
        this.f24390a = c0397p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0397p0 c0397p0 = this.f24390a;
        synchronized (c0397p0) {
            if (c0397p0.f24535a != null && c0397p0.a()) {
                try {
                    c0397p0.f24538d = null;
                    c0397p0.f24535a.unbindService(c0397p0.f24543j);
                } catch (Throwable unused) {
                }
            }
            c0397p0.f24538d = null;
        }
    }
}
