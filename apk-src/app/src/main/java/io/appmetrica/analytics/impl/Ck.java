package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f22221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Tk f22222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fk f22223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicLong f22226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Rk f22228h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f22229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f22230k;

    public Ck(Y4 y42, Tk tk2, Fk fk2, SystemTimeProvider systemTimeProvider) {
        this.f22221a = y42;
        this.f22222b = tk2;
        this.f22223c = fk2;
        this.f22230k = systemTimeProvider;
        a();
    }

    public final void a() {
        Fk fk2 = this.f22223c;
        long jElapsedRealtime = this.f22230k.elapsedRealtime();
        Long l10 = fk2.f22345c;
        if (l10 != null) {
            jElapsedRealtime = l10.longValue();
        }
        this.f22225e = jElapsedRealtime;
        Long l11 = this.f22223c.f22344b;
        this.f22224d = l11 == null ? -1L : l11.longValue();
        Long l12 = this.f22223c.f22347e;
        this.f22226f = new AtomicLong(l12 == null ? 0L : l12.longValue());
        Boolean bool = this.f22223c.f22348f;
        this.f22227g = bool == null ? true : bool.booleanValue();
        Long l13 = this.f22223c.f22349g;
        long jLongValue = l13 != null ? l13.longValue() : 0L;
        this.i = jLongValue;
        Fk fk3 = this.f22223c;
        long jLongValue2 = jLongValue - this.f22225e;
        Long l14 = fk3.f22350h;
        if (l14 != null) {
            jLongValue2 = l14.longValue();
        }
        this.f22229j = jLongValue2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{id=");
        sb2.append(this.f22224d);
        sb2.append(", creationTime=");
        sb2.append(this.f22225e);
        sb2.append(", currentReportId=");
        sb2.append(this.f22226f);
        sb2.append(", sessionRequestParams=");
        sb2.append(this.f22228h);
        sb2.append(", sleepStart=");
        return om1.m(sb2, this.i, '}');
    }
}
