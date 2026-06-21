package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v81 extends gr implements ScheduledFuture, ed.d, Future {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h71 f11305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledFuture f11306e;

    public v81(h71 h71Var, ScheduledFuture scheduledFuture) {
        super(10);
        this.f11305d = h71Var;
        this.f11306e = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ Object C() {
        return this.f11305d;
    }

    @Override // ed.d
    public final void a(Runnable runnable, Executor executor) {
        this.f11305d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        boolean zCancel = this.f11305d.cancel(z5);
        if (zCancel) {
            this.f11306e.cancel(z5);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f11306e.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f11305d.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f11306e.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11305d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11305d.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f11305d.get(j10, timeUnit);
    }
}
