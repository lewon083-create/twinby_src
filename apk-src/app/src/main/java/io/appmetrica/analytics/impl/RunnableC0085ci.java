package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0085ci implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0162fi f23615a;

    public RunnableC0085ci(C0162fi c0162fi) {
        this.f23615a = c0162fi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f23615a;
        C0162fi.a(c0162fi.f23884a, c0162fi.f23887d, c0162fi.f23888e).clearAppEnvironment();
    }
}
