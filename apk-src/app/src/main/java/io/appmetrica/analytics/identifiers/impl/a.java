package io.appmetrica.analytics.identifiers.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f21912c;

    public a(String str, String str2, Boolean bool) {
        this.f21910a = str;
        this.f21911b = str2;
        this.f21912c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f21910a, aVar.f21910a) && Intrinsics.a(this.f21911b, aVar.f21911b) && Intrinsics.a(this.f21912c, aVar.f21912c);
    }

    public final int hashCode() {
        int iHashCode = this.f21910a.hashCode() * 31;
        String str = this.f21911b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f21912c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f21910a + ", advId=" + this.f21911b + ", limitedAdTracking=" + this.f21912c + ')';
    }
}
