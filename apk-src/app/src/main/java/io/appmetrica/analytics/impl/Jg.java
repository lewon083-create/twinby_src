package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Jg implements RemoteConfigMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22531b;

    public Jg(long j10, long j11) {
        this.f22530a = j10;
        this.f22531b = j11;
    }

    @NotNull
    public final Jg a(long j10, long j11) {
        return new Jg(j10, j11);
    }

    public final long b() {
        return this.f22531b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jg)) {
            return false;
        }
        Jg jg = (Jg) obj;
        return this.f22530a == jg.f22530a && this.f22531b == jg.f22531b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f22530a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f22531b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22531b) + (Long.hashCode(this.f22530a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteConfigMetaInfoModel(firstSendTime=");
        sb2.append(this.f22530a);
        sb2.append(", lastUpdateTime=");
        return om1.m(sb2, this.f22531b, ')');
    }

    public final long a() {
        return this.f22530a;
    }

    public static Jg a(Jg jg, long j10, long j11, int i, Object obj) {
        if ((i & 1) != 0) {
            j10 = jg.f22530a;
        }
        if ((i & 2) != 0) {
            j11 = jg.f22531b;
        }
        jg.getClass();
        return new Jg(j10, j11);
    }
}
