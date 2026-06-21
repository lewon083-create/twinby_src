package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class jx implements ed.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y81 f6961b = new y81();

    @Override // ed.d
    public final void a(Runnable runnable, Executor executor) {
        this.f6961b.a(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean zE = this.f6961b.e(obj);
        if (!zE) {
            p9.k.C.f31302h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zE;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z5) {
        return this.f6961b.cancel(z5);
    }

    public final void d(Throwable th2) {
        if (this.f6961b.f(th2)) {
            return;
        }
        p9.k.C.f31302h.e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f6961b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6961b.f8952b instanceof a71;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6961b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f6961b.get(j10, timeUnit);
    }
}
