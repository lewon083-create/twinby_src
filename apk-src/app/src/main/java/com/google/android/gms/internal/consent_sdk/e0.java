package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadPoolExecutor f13370c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f13369b = new AtomicInteger(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f13371d = new WeakReference(null);

    public e0() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.android.gms.internal.consent_sdk.d0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                e0 e0Var = this.f13357a;
                Thread thread = new Thread(runnable, l7.o.i(e0Var.f13369b.getAndIncrement(), "Google consent worker #"));
                e0Var.f13371d = new WeakReference(thread);
                return thread;
            }
        });
        this.f13370c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f13371d.get()) {
            runnable.run();
        } else {
            this.f13370c.execute(runnable);
        }
    }
}
