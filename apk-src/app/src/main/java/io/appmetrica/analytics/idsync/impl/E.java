package io.appmetrica.analytics.idsync.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21945c;

    public E(String str, long j10, int i) {
        this.f21943a = str;
        this.f21944b = j10;
        this.f21945c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e3 = (E) obj;
        return Intrinsics.a(this.f21943a, e3.f21943a) && this.f21944b == e3.f21944b && this.f21945c == e3.f21945c;
    }

    public final int hashCode() {
        return A.a(this.f21945c) + l7.o.d(this.f21944b, this.f21943a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f21943a + ", lastAttempt=" + this.f21944b + ", lastAttemptResult=" + z.b(this.f21945c) + ')';
    }
}
