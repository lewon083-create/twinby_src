package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22162a;

    public Bm(int i) {
        this.f22162a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Bm) && this.f22162a == ((Bm) obj).f22162a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22162a);
    }

    public final String toString() {
        return om1.l(new StringBuilder("StartupUpdateConfig(intervalSeconds="), this.f22162a, ')');
    }
}
