package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0603x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25009b;

    public C0603x7(long j10, int i) {
        this.f25008a = j10;
        this.f25009b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0603x7)) {
            return false;
        }
        C0603x7 c0603x7 = (C0603x7) obj;
        return this.f25008a == c0603x7.f25008a && this.f25009b == c0603x7.f25009b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25009b) + (Long.hashCode(this.f25008a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DecimalProtoModel(mantissa=");
        sb2.append(this.f25008a);
        sb2.append(", exponent=");
        return om1.l(sb2, this.f25009b, ')');
    }
}
