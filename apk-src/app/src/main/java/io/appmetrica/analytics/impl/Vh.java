package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Vh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f23152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0162fi f23153c;

    public Vh(C0162fi c0162fi, String str, byte[] bArr) {
        this.f23153c = c0162fi;
        this.f23151a = str;
        this.f23152b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f23153c;
        C0162fi.a(c0162fi.f23884a, c0162fi.f23887d, c0162fi.f23888e).setSessionExtra(this.f23151a, this.f23152b);
    }
}
