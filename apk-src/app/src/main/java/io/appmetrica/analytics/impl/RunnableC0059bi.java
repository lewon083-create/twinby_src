package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0059bi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0162fi f23508c;

    public RunnableC0059bi(C0162fi c0162fi, String str, String str2) {
        this.f23508c = c0162fi;
        this.f23506a = str;
        this.f23507b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0162fi c0162fi = this.f23508c;
        C0162fi.a(c0162fi.f23884a, c0162fi.f23887d, c0162fi.f23888e).putAppEnvironmentValue(this.f23506a, this.f23507b);
    }
}
