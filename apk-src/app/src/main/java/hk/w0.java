package hk;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends v0 implements h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f20721d;

    public w0(Executor executor) {
        this.f20721d = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f20721d;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w0) && ((w0) obj).f20721d == this.f20721d;
    }

    @Override // hk.h0
    public final m0 h(long j10, w1 w1Var, CoroutineContext coroutineContext) {
        Executor executor = this.f20721d;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(w1Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                c1 c1Var = (c1) coroutineContext.get(b1.f20637b);
                if (c1Var != null) {
                    c1Var.a(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new l0(scheduledFutureSchedule) : d0.f20652k.h(j10, w1Var, coroutineContext);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f20721d);
    }

    @Override // hk.h0
    public final void i(long j10, l lVar) {
        Executor executor = this.f20721d;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            ed.c cVar = new ed.c(11, this, lVar);
            CoroutineContext coroutineContext = lVar.f20688f;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(cVar, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                c1 c1Var = (c1) coroutineContext.get(b1.f20637b);
                if (c1Var != null) {
                    c1Var.a(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            lVar.w(new h(0, scheduledFutureSchedule));
        } else {
            d0.f20652k.i(j10, lVar);
        }
    }

    @Override // hk.x
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f20721d.execute(runnable);
        } catch (RejectedExecutionException e3) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e3);
            c1 c1Var = (c1) coroutineContext.get(b1.f20637b);
            if (c1Var != null) {
                c1Var.a(cancellationException);
            }
            ok.e eVar = k0.f20682a;
            ok.d.f30722d.j(coroutineContext, runnable);
        }
    }

    @Override // hk.x
    public final String toString() {
        return this.f20721d.toString();
    }
}
