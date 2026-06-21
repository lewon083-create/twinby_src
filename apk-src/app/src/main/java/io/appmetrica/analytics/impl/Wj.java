package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f23226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ye f23227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeProvider f23228c;

    public static Wj c() {
        return Vj.f23155a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f23226a;
    }

    public final synchronized void b() {
        this.f23227b.d(false);
        this.f23227b.b();
    }

    public final synchronized long d() {
        return this.f23226a;
    }

    public final synchronized void e() {
        a(C0382oa.I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f23227b.b(true);
    }

    public final synchronized void a(long j10, Long l10) {
        try {
            this.f23226a = (j10 - this.f23228c.currentTimeMillis()) / 1000;
            boolean z5 = true;
            if (this.f23227b.b(true)) {
                if (l10 != null) {
                    long jAbs = Math.abs(j10 - this.f23228c.currentTimeMillis());
                    Ye ye2 = this.f23227b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l10.longValue())) {
                        z5 = false;
                    }
                    ye2.d(z5);
                } else {
                    this.f23227b.d(false);
                }
            }
            this.f23227b.d(this.f23226a);
            this.f23227b.b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void a(Ye ye2, TimeProvider timeProvider) {
        this.f23227b = ye2;
        this.f23226a = ye2.a(0);
        this.f23228c = timeProvider;
    }
}
