package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0029ae f22851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0653z7 f22852b;

    public Q1(S1 s12, C0653z7 c0653z7) {
        this.f22851a = s12;
        this.f22852b = c0653z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22851a.consume(this.f22852b);
    }
}
