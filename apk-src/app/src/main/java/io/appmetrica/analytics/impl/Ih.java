package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ih implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f22448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0162fi f22449b;

    public Ih(C0162fi c0162fi, Throwable th2) {
        this.f22449b = c0162fi;
        this.f22448a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f22449b;
        C0162fi.a(c0162fi.f23884a, c0162fi.f23887d, c0162fi.f23888e).reportUnhandledException(this.f22448a);
    }
}
