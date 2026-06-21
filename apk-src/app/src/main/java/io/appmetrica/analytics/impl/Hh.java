package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Hh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f22426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0162fi f22427d;

    public Hh(C0162fi c0162fi, String str, String str2, Throwable th2) {
        this.f22427d = c0162fi;
        this.f22424a = str;
        this.f22425b = str2;
        this.f22426c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f22427d;
        C0162fi.a(c0162fi.f23884a, c0162fi.f23887d, c0162fi.f23888e).reportError(this.f22424a, this.f22425b, this.f22426c);
    }
}
