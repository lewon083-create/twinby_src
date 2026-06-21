package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0674e f25450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f25451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0685p f25452c;

    public W(C0674e c0674e, a0 a0Var, C0685p c0685p) {
        this.f25450a = c0674e;
        this.f25451b = a0Var;
        this.f25452c = c0685p;
    }

    public final C0674e a() {
        return this.f25450a;
    }

    public final C0685p b() {
        return this.f25452c;
    }

    public final a0 c() {
        return this.f25451b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f25450a + ", serviceCaptorConfig=" + this.f25451b + ", contentObserverCaptorConfig=" + this.f25452c + ')';
    }

    public W() {
        this(new C0674e(), new a0(), new C0685p());
    }
}
