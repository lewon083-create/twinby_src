package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0121e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23727a;

    public C0121e3(long j10) {
        this.f23727a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0121e3.class == obj.getClass() && this.f23727a == ((C0121e3) obj).f23727a;
    }

    public final int hashCode() {
        long j10 = this.f23727a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return om1.m(new StringBuilder("CacheControl{lastKnownLocationTtl="), this.f23727a, '}');
    }
}
