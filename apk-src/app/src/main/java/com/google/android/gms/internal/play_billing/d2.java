package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends a2 implements z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f14158c;

    public d2(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f14158c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        h2 h2Var = new h2(Executors.callable(runnable, null));
        return new b2(h2Var, this.f14158c.schedule(h2Var, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c2 c2Var = new c2(runnable);
        return new b2(c2Var, this.f14158c.scheduleAtFixedRate(c2Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c2 c2Var = new c2(runnable);
        return new b2(c2Var, this.f14158c.scheduleWithFixedDelay(c2Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        h2 h2Var = new h2(callable);
        return new b2(h2Var, this.f14158c.schedule(h2Var, j10, timeUnit));
    }
}
