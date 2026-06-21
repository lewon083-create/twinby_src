package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class gx extends AbstractExecutorService implements r81, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5923b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f5924c;

    public gx(Executor executor) {
        this.f5924c = executor;
    }

    public final ed.d a(Runnable runnable) {
        return (ed.d) super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        switch (this.f5923b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f5924c).awaitTermination(j10, timeUnit);
        }
    }

    public final ed.d b(Callable callable) {
        return (ed.d) super.submit(callable);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z5 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z5) {
                    shutdownNow();
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5923b) {
            case 0:
                this.f5924c.execute(runnable);
                break;
            default:
                ((ExecutorService) this.f5924c).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f5923b) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f5924c).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f5923b) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f5924c).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new c91(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f5923b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f5924c).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f5923b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f5924c).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (ed.d) super.submit(runnable);
    }

    public String toString() {
        switch (this.f5923b) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.f5924c;
                String string = super.toString();
                String strValueOf = String.valueOf(executorService);
                return om1.n(new StringBuilder(l7.o.v(String.valueOf(string).length(), 1, strValueOf.length(), 1)), string, "[", strValueOf, "]");
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new c91(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ed.d) super.submit(runnable, obj);
    }

    public gx(ExecutorService executorService) {
        executorService.getClass();
        this.f5924c = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (ed.d) super.submit(callable);
    }
}
