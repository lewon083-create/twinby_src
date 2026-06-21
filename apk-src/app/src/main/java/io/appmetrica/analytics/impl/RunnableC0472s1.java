package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0472s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f24721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f24722d;

    public RunnableC0472s1(C0522u1 c0522u1, String str, String str2, Throwable th2) {
        this.f24722d = c0522u1;
        this.f24719a = str;
        this.f24720b = str2;
        this.f24721c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0522u1.a(this.f24722d).reportError(this.f24719a, this.f24720b, this.f24721c);
    }
}
