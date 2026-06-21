package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Fm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22352a;

    public Fm(long j10) {
        this.f22352a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Fm.class == obj.getClass() && this.f22352a == ((Fm) obj).f22352a;
    }

    public final int hashCode() {
        long j10 = this.f22352a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return om1.m(new StringBuilder("StatSending{disabledReportingInterval="), this.f22352a, '}');
    }
}
