package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n81 implements ed.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n81 f8237c = new n81(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q81 f8238d = new q81(0, n81.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8239b;

    public n81(Object obj) {
        this.f8239b = obj;
    }

    @Override // ed.d
    public final void a(Runnable runnable, Executor executor) {
        ix.m0(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            Logger loggerA = f8238d.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerA.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", om1.n(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e3);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f8239b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f8239b);
        return om1.n(new StringBuilder(String.valueOf(string).length() + 25 + strValueOf.length() + 2), string, "[status=SUCCESS, result=[", strValueOf, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f8239b;
    }
}
