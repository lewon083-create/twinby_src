package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n70 extends ip1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f8219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ua.a f8220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sd0 f8221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8223h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ScheduledFuture f8226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ScheduledFuture f8227m;

    public n70(ScheduledExecutorService scheduledExecutorService, ua.a aVar, sd0 sd0Var) {
        super(Collections.EMPTY_SET);
        this.f8222g = -1L;
        this.f8223h = -1L;
        this.i = -1L;
        this.f8224j = -1L;
        this.f8225k = false;
        this.f8219d = scheduledExecutorService;
        this.f8220e = aVar;
        this.f8221f = sd0Var;
    }

    public final synchronized void F1(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 20);
        sb2.append("In scheduleRefresh: ");
        sb2.append(i);
        t9.c0.m(sb2.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f8225k) {
                long j10 = this.i;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.i = millis;
                return;
            }
            this.f8220e.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            wk wkVar = al.f3278xe;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                long j11 = this.f8222g;
                if (jElapsedRealtime >= j11 || j11 - jElapsedRealtime > millis) {
                    H1(millis);
                    if (((Boolean) sVar.f31970c.a(al.Ue)).booleanValue()) {
                        zd1 zd1VarA = this.f8221f.a();
                        zd1VarA.v("action", "rtnc");
                        zd1VarA.y();
                    }
                }
            } else {
                long j12 = this.f8222g;
                if (jElapsedRealtime > j12 || j12 - jElapsedRealtime > millis) {
                    H1(millis);
                }
            }
        }
    }

    public final synchronized void G1(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 28);
        sb2.append("In scheduleShowRefreshedAd: ");
        sb2.append(i);
        t9.c0.m(sb2.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f8225k) {
                long j10 = this.f8224j;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f8224j = millis;
                return;
            }
            this.f8220e.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3278xe)).booleanValue()) {
                if (jElapsedRealtime == this.f8223h) {
                    t9.c0.m("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j11 = this.f8223h;
                if (jElapsedRealtime >= j11 || j11 - jElapsedRealtime > millis) {
                    I1(millis);
                }
            } else {
                long j12 = this.f8223h;
                if (jElapsedRealtime > j12 || j12 - jElapsedRealtime > millis) {
                    I1(millis);
                }
            }
        }
    }

    public final synchronized void H1(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f8226l;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f8226l.cancel(false);
            }
            this.f8220e.getClass();
            this.f8222g = SystemClock.elapsedRealtime() + j10;
            this.f8226l = this.f8219d.schedule(new m70(this, 0), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void I1(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f8227m;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f8227m.cancel(false);
            }
            this.f8220e.getClass();
            this.f8223h = SystemClock.elapsedRealtime() + j10;
            this.f8227m = this.f8219d.schedule(new m70(this, 1), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void h() {
        this.f8225k = false;
        H1(0L);
    }
}
