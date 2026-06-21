package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Lh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0162fi f22617b;

    public Lh(C0162fi c0162fi, String str) {
        this.f22617b = c0162fi;
        this.f22616a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f22617b;
        C0162fi.a(c0162fi.f23884a, c0162fi.f23887d, c0162fi.f23888e).setUserProfileID(this.f22616a);
    }
}
