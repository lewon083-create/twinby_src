package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 implements x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f14354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5 f14355c = new v5(this);

    public w5(u5 u5Var) {
        this.f14354b = new WeakReference(u5Var);
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final void c(Runnable runnable, Executor executor) {
        this.f14355c.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        u5 u5Var = (u5) this.f14354b.get();
        boolean zCancel = this.f14355c.cancel(z5);
        if (!zCancel || u5Var == null) {
            return zCancel;
        }
        u5Var.f14331a = null;
        u5Var.f14332b = null;
        u5Var.f14333c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14355c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14355c.f14320b instanceof t2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14355c.isDone();
    }

    public final String toString() {
        return this.f14355c.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f14355c.get(j10, timeUnit);
    }
}
