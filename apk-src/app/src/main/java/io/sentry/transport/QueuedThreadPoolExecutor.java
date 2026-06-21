package io.sentry.transport;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.SentryDate;
import io.sentry.SentryDateProvider;
import io.sentry.SentryLevel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class QueuedThreadPoolExecutor extends ThreadPoolExecutor implements AutoCloseable {
    private static final long RECENT_THRESHOLD = DateUtils.millisToNanos(2000);

    @NotNull
    private final SentryDateProvider dateProvider;

    @Nullable
    private SentryDate lastRejectTimestamp;

    @NotNull
    private final ILogger logger;
    private final int maxQueueSize;

    @NotNull
    private final ReusableCountLatch unfinishedTasksCount;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class CancelledFuture<T> implements Future<T> {
        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z5) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, @NotNull TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public QueuedThreadPoolExecutor(int i, int i10, @NotNull ThreadFactory threadFactory, @NotNull RejectedExecutionHandler rejectedExecutionHandler, @NotNull ILogger iLogger, @NotNull SentryDateProvider sentryDateProvider) {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.lastRejectTimestamp = null;
        this.unfinishedTasksCount = new ReusableCountLatch();
        this.maxQueueSize = i10;
        this.logger = iLogger;
        this.dateProvider = sentryDateProvider;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(@NotNull Runnable runnable, @Nullable Throwable th2) {
        try {
            super.afterExecute(runnable, th2);
        } finally {
            this.unfinishedTasksCount.decrement();
        }
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

    public boolean didRejectRecently() {
        SentryDate sentryDate = this.lastRejectTimestamp;
        return sentryDate != null && this.dateProvider.now().diff(sentryDate) < RECENT_THRESHOLD;
    }

    public boolean isSchedulingAllowed() {
        return this.unfinishedTasksCount.getCount() < this.maxQueueSize;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(@NotNull Runnable runnable) {
        if (!isSchedulingAllowed()) {
            this.lastRejectTimestamp = this.dateProvider.now();
            this.logger.log(SentryLevel.WARNING, "Submit cancelled", new Object[0]);
            return new CancelledFuture();
        }
        this.unfinishedTasksCount.increment();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e3) {
            this.unfinishedTasksCount.decrement();
            this.lastRejectTimestamp = this.dateProvider.now();
            this.logger.log(SentryLevel.WARNING, "Submit rejected by thread pool executor", e3);
            return new CancelledFuture();
        }
    }

    public void waitTillIdle(long j10) {
        try {
            this.unfinishedTasksCount.waitTillZero(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            this.logger.log(SentryLevel.ERROR, "Failed to wait till idle", e3);
            Thread.currentThread().interrupt();
        }
    }
}
