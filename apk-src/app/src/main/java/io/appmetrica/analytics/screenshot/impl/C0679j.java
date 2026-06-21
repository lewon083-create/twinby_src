package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0679j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25486a;

    public C0679j(boolean z5) {
        this.f25486a = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0679j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f25486a == ((C0679j) obj).f25486a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25486a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f25486a + ')';
    }

    public C0679j(C0694z c0694z) {
        this(c0694z.a());
    }
}
