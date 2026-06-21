package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f25492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f25493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f25494c;

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.f25492a = h0Var;
        this.f25493b = l0Var;
        this.f25494c = i0Var;
    }

    public final h0 a() {
        return this.f25492a;
    }

    public final i0 b() {
        return this.f25494c;
    }

    public final l0 c() {
        return this.f25493b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f25492a + ", serviceCaptorConfig=" + this.f25493b + ", contentObserverCaptorConfig=" + this.f25494c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(W w10) {
        C0674e c0674eA = w10.a();
        h0 h0Var = c0674eA != null ? new h0(c0674eA) : null;
        a0 a0VarC = w10.c();
        l0 l0Var = a0VarC != null ? new l0(a0VarC) : null;
        C0685p c0685pB = w10.b();
        this(h0Var, l0Var, c0685pB != null ? new i0(c0685pB) : null);
    }
}
