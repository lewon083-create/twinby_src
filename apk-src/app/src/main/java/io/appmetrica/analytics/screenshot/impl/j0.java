package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f25488b;

    public j0(boolean z5, k0 k0Var) {
        this.f25487a = z5;
        this.f25488b = k0Var;
    }

    public final k0 a() {
        return this.f25488b;
    }

    public final boolean b() {
        return this.f25487a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f25487a + ", config=" + this.f25488b + ')';
    }

    public j0() {
        this(new J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(J j10) {
        boolean zB = j10.b();
        W wA = j10.a();
        this(zB, wA != null ? new k0(wA) : null);
    }
}
