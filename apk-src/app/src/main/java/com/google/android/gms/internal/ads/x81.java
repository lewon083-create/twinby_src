package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x81 extends gx implements s81 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f12078d;

    public x81(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f12078d = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        c91 c91Var = new c91(Executors.callable(runnable, null));
        return new v81(c91Var, this.f12078d.schedule(c91Var, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        w81 w81Var = new w81(runnable);
        return new v81(w81Var, this.f12078d.scheduleAtFixedRate(w81Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        w81 w81Var = new w81(runnable);
        return new v81(w81Var, this.f12078d.scheduleWithFixedDelay(w81Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        c91 c91Var = new c91(callable);
        return new v81(c91Var, this.f12078d.schedule(c91Var, j10, timeUnit));
    }
}
