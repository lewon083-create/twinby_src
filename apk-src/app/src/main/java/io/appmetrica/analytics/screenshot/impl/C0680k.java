package io.appmetrica.analytics.screenshot.impl;

import com.google.android.gms.internal.ads.om1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0680k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25491c;

    public C0680k(boolean z5, List list, long j10) {
        this.f25489a = z5;
        this.f25490b = list;
        this.f25491c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0680k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C0680k c0680k = (C0680k) obj;
        return this.f25489a == c0680k.f25489a && Intrinsics.a(this.f25490b, c0680k.f25490b) && this.f25491c == c0680k.f25491c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25491c) + a0.u.i(this.f25490b, Boolean.hashCode(this.f25489a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientSideContentObserverCaptorConfig(enabled=");
        sb2.append(this.f25489a);
        sb2.append(", mediaStoreColumnNames=");
        sb2.append(this.f25490b);
        sb2.append(", detectWindowSeconds=");
        return om1.m(sb2, this.f25491c, ')');
    }

    public C0680k(B b2) {
        this(b2.b(), b2.c(), b2.a());
    }
}
