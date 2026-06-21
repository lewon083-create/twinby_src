package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0681l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0682m f25496b;

    public C0681l(boolean z5, C0682m c0682m) {
        this.f25495a = z5;
        this.f25496b = c0682m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0681l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C0681l c0681l = (C0681l) obj;
        return this.f25495a == c0681l.f25495a && Intrinsics.a(this.f25496b, c0681l.f25496b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f25495a) * 31;
        C0682m c0682m = this.f25496b;
        return iHashCode + (c0682m != null ? c0682m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f25495a + ", config=" + this.f25496b + ')';
    }
}
