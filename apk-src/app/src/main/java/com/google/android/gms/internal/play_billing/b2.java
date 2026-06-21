package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends d3 implements ScheduledFuture, x1, Future {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1 f14138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f14139d;

    public b2(n1 n1Var, ScheduledFuture scheduledFuture) {
        super(4);
        this.f14138c = n1Var;
        this.f14139d = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final void c(Runnable runnable, Executor executor) {
        this.f14138c.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        boolean zCancel = this.f14138c.cancel(z5);
        if (zCancel) {
            this.f14139d.cancel(z5);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f14139d.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14138c.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f14139d.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14138c.f14252b instanceof c1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14138c.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f14138c.get(j10, timeUnit);
    }
}
