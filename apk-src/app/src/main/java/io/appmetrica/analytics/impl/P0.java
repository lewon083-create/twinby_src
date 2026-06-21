package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f22817b;

    public P0(C0522u1 c0522u1, String str) {
        this.f22817b = c0522u1;
        this.f22816a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0522u1.a(this.f22817b).c(this.f22816a);
    }
}
