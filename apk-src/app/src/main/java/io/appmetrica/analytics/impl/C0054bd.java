package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0054bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23500b;

    public C0054bd(String str, boolean z5) {
        this.f23499a = str;
        this.f23500b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0054bd)) {
            return false;
        }
        C0054bd c0054bd = (C0054bd) obj;
        return Intrinsics.a(this.f23499a, c0054bd.f23499a) && this.f23500b == c0054bd.f23500b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f23499a.hashCode() * 31;
        boolean z5 = this.f23500b;
        ?? r12 = z5;
        if (z5) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f23499a + ", loaded=" + this.f23500b + ')';
    }
}
