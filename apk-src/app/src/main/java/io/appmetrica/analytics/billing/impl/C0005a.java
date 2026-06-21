package io.appmetrica.analytics.billing.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0005a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21504b;

    public C0005a(List list, boolean z5) {
        this.f21503a = list;
        this.f21504b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0005a)) {
            return false;
        }
        C0005a c0005a = (C0005a) obj;
        return Intrinsics.a(this.f21503a, c0005a.f21503a) && this.f21504b == c0005a.f21504b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f21503a.hashCode() * 31;
        boolean z5 = this.f21504b;
        ?? r12 = z5;
        if (z5) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f21503a + ", firstInappCheckOccurred=" + this.f21504b + ')';
    }
}
