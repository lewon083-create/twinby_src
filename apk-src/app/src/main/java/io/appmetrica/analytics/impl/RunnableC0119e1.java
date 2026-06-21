package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0119e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f23721c;

    public RunnableC0119e1(C0522u1 c0522u1, String str, String str2) {
        this.f23721c = c0522u1;
        this.f23719a = str;
        this.f23720b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0522u1.a(this.f23721c).b(this.f23719a, this.f23720b);
    }
}
