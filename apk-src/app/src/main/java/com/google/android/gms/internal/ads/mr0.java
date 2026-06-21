package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mr0 implements mh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f8001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f8002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f8003d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8004e = false;

    public mr0(ScheduledExecutorService scheduledExecutorService, gx gxVar) {
        this.f8001b = scheduledExecutorService;
        this.f8002c = gxVar;
    }

    public final synchronized void a(Runnable runnable, long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.f8004e) {
                    p9.k.C.f31301g.v(this);
                    this.f8004e = true;
                }
                p9.k.C.f31304k.getClass();
                lr0 lr0Var = new lr0(this, runnable, System.currentTimeMillis() + timeUnit.toMillis(j10));
                ScheduledFuture<?> scheduledFutureSchedule = this.f8001b.schedule(new h30(29, lr0Var), j10, timeUnit);
                lr0Var.f7600c = scheduledFutureSchedule;
                this.f8003d.put(scheduledFutureSchedule, lr0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void l0(boolean z5) {
        if (z5) {
            this.f8002c.execute(new kr0(0, this));
        }
    }
}
