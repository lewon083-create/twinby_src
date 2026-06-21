package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0682m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0679j f25499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0683n f25500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0680k f25501c;

    public C0682m(C0679j c0679j, C0683n c0683n, C0680k c0680k) {
        this.f25499a = c0679j;
        this.f25500b = c0683n;
        this.f25501c = c0680k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0682m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C0682m c0682m = (C0682m) obj;
        return Intrinsics.a(this.f25499a, c0682m.f25499a) && Intrinsics.a(this.f25500b, c0682m.f25500b) && Intrinsics.a(this.f25501c, c0682m.f25501c);
    }

    public final int hashCode() {
        C0679j c0679j = this.f25499a;
        int iHashCode = (c0679j != null ? c0679j.hashCode() : 0) * 31;
        C0683n c0683n = this.f25500b;
        int iHashCode2 = (iHashCode + (c0683n != null ? c0683n.hashCode() : 0)) * 31;
        C0680k c0680k = this.f25501c;
        return iHashCode2 + (c0680k != null ? c0680k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f25499a + ", serviceCaptorConfig=" + this.f25500b + ", contentObserverCaptorConfig=" + this.f25501c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0682m(F f10) {
        C0694z c0694zA = f10.a();
        C0679j c0679j = c0694zA != null ? new C0679j(c0694zA) : null;
        H hC = f10.c();
        C0683n c0683n = hC != null ? new C0683n(hC) : null;
        B b2 = f10.b();
        this(c0679j, c0683n, b2 != null ? new C0680k(b2) : null);
    }
}
