package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class A9 implements IHandlerExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f22058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f22059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThreadC0104db f22060c;

    public A9(@NonNull String str) {
        this(a(str));
    }

    public static HandlerThreadC0104db a(String str) {
        StringBuilder sbK = pe.a.k(str, "-");
        sbK.append(ThreadFactoryC0659zd.f25117a.incrementAndGet());
        HandlerThreadC0104db handlerThreadC0104db = new HandlerThreadC0104db(sbK.toString());
        handlerThreadC0104db.start();
        return handlerThreadC0104db;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f22059b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j10) {
        this.f22059b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j10));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.f22059b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.f22058a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z5;
        HandlerThreadC0104db handlerThreadC0104db = this.f22060c;
        synchronized (handlerThreadC0104db) {
            z5 = handlerThreadC0104db.f23682a;
        }
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.f22059b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f22059b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC0104db handlerThreadC0104db = this.f22060c;
        synchronized (handlerThreadC0104db) {
            handlerThreadC0104db.f23682a = false;
            handlerThreadC0104db.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f22059b.post(futureTask);
        return futureTask;
    }

    public A9(HandlerThreadC0104db handlerThreadC0104db) {
        this(handlerThreadC0104db, handlerThreadC0104db.getLooper(), new Handler(handlerThreadC0104db.getLooper()));
    }

    public A9(@NonNull HandlerThreadC0104db handlerThreadC0104db, @NonNull Looper looper, @NonNull Handler handler) {
        this.f22060c = handlerThreadC0104db;
        this.f22058a = looper;
        this.f22059b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
        this.f22059b.postDelayed(runnable, timeUnit.toMillis(j10));
    }
}
