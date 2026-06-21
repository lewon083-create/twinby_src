package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0068c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f23533c;

    public RunnableC0068c1(C0522u1 c0522u1, String str, String str2) {
        this.f23533c = c0522u1;
        this.f23531a = str;
        this.f23532b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0646z0 c0646z0 = this.f23533c.f24823a;
        String str = this.f23531a;
        String str2 = this.f23532b;
        c0646z0.getClass();
        C0621y0.c().a(str, str2);
    }
}
