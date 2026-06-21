package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f21913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f21914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21915c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f21913a = identifierStatus;
        this.f21914b = aVar;
        this.f21915c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f21913a == cVar.f21913a && Intrinsics.a(this.f21914b, cVar.f21914b) && Intrinsics.a(this.f21915c, cVar.f21915c);
    }

    public final int hashCode() {
        int iHashCode = this.f21913a.hashCode() * 31;
        a aVar = this.f21914b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f21915c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvIdResult(status=");
        sb2.append(this.f21913a);
        sb2.append(", advIdInfo=");
        sb2.append(this.f21914b);
        sb2.append(", errorExplanation=");
        return a0.u.n(sb2, this.f21915c, ')');
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i) {
        this(identifierStatus, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : str);
    }
}
