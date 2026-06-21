package io.appmetrica.analytics.screenshot.impl;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25498b;

    public l0(boolean z5, long j10) {
        this.f25497a = z5;
        this.f25498b = j10;
    }

    public final long a() {
        return this.f25498b;
    }

    public final boolean b() {
        return this.f25497a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceSideServiceCaptorConfig(enabled=");
        sb2.append(this.f25497a);
        sb2.append(", delaySeconds=");
        return om1.m(sb2, this.f25498b, ')');
    }

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
