package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class U0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0522u1 f23052b;

    public U0(C0522u1 c0522u1, String str) {
        this.f23052b = c0522u1;
        this.f23051a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0646z0 c0646z0 = this.f23052b.f24823a;
        String str = this.f23051a;
        c0646z0.getClass();
        C0621y0.c().setUserProfileID(str);
    }
}
