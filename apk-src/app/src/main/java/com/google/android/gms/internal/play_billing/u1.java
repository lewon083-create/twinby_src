package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.q81;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q81 f14328b = new q81(1, u1.class);

    @Override // com.google.android.gms.internal.play_billing.x1
    public final void c(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            f14328b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", t.z.e("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e3);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return 0;
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
        Integer num = 0;
        return super.toString() + "[status=SUCCESS, result=[" + num.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return 0;
    }
}
