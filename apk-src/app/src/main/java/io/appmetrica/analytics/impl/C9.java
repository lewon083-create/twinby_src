package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22198a;

    public C9(long j10) {
        this.f22198a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9) && this.f22198a == ((C9) obj).f22198a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22198a);
    }

    public final String toString() {
        return om1.m(new StringBuilder("ExternalAttributionConfig(collectingInterval="), this.f22198a, ')');
    }
}
