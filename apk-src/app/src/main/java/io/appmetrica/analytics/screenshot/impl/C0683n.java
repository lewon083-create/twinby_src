package io.appmetrica.analytics.screenshot.impl;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0683n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25503b;

    public C0683n(boolean z5, long j10) {
        this.f25502a = z5;
        this.f25503b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0683n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C0683n c0683n = (C0683n) obj;
        return this.f25502a == c0683n.f25502a && this.f25503b == c0683n.f25503b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25503b) + (Boolean.hashCode(this.f25502a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientSideServiceCaptorConfig(enabled=");
        sb2.append(this.f25502a);
        sb2.append(", delaySeconds=");
        return om1.m(sb2, this.f25503b, ')');
    }

    public C0683n(H h10) {
        this(h10.b(), h10.a());
    }
}
