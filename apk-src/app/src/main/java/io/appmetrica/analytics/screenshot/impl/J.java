package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f25428b;

    public J(boolean z5, W w10) {
        this.f25427a = z5;
        this.f25428b = w10;
    }

    public final W a() {
        return this.f25428b;
    }

    public final boolean b() {
        return this.f25427a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f25427a + ", config=" + this.f25428b + ')';
    }

    public J() {
        this(new S().f25447a, new W());
    }
}
