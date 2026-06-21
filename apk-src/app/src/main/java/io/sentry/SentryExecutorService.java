package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryExecutorService implements ISentryExecutorService {
    private static final int INITIAL_QUEUE_SIZE = 40;
    private static final int MAX_QUEUE_SIZE = 271;

    @NotNull
    private final Runnable dummyRunnable;

    @NotNull
    private final ScheduledThreadPoolExecutor executorService;

    @NotNull
    private final AutoClosableReentrantLock lock;

    @Nullable
    private final SentryOptions options;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class CancelledFuture<T> implements Future<T> {
        private CancelledFuture() {
        }

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

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class SentryExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        private SentryExecutorServiceThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb2 = new StringBuilder("SentryExecutorServiceThreadFactory-");
            int i = this.cnt;
            this.cnt = i + 1;
            sb2.append(i);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public SentryExecutorService(@NotNull ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, @Nullable SentryOptions sentryOptions) {
        this.lock = new AutoClosableReentrantLock();
        this.dummyRunnable = new t();
        this.executorService = scheduledThreadPoolExecutor;
        this.options = sentryOptions;
    }

    private boolean isQueueAvailable() {
        if (this.executorService.getQueue().size() >= MAX_QUEUE_SIZE) {
            this.executorService.purge();
        }
        return this.executorService.getQueue().size() < MAX_QUEUE_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prewarm$1() {
        for (int i = 0; i < 40; i++) {
            try {
                this.executorService.schedule(this.dummyRunnable, 365L, TimeUnit.DAYS).cancel(true);
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        this.executorService.purge();
    }

    @Override // io.sentry.ISentryExecutorService
    public void close(long j10) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.executorService.isShutdown()) {
                this.executorService.shutdown();
                try {
                    if (!this.executorService.awaitTermination(j10, TimeUnit.MILLISECONDS)) {
                        this.executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.executorService.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.ISentryExecutorService
    public boolean isClosed() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            boolean zIsShutdown = this.executorService.isShutdown();
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return zIsShutdown;
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.ISentryExecutorService
    public void prewarm() {
        try {
            this.executorService.submit(new m(1, this));
        } catch (RejectedExecutionException e3) {
            SentryOptions sentryOptions = this.options;
            if (sentryOptions != null) {
                sentryOptions.getLogger().log(SentryLevel.WARNING, "Prewarm task rejected from " + this.executorService, e3);
            }
        }
    }

    @Override // io.sentry.ISentryExecutorService
    @NotNull
    public Future<?> schedule(@NotNull Runnable runnable, long j10) {
        return this.executorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.ISentryExecutorService
    @NotNull
    public Future<?> submit(@NotNull Runnable runnable) {
        if (isQueueAvailable()) {
            return this.executorService.submit(runnable);
        }
        SentryOptions sentryOptions = this.options;
        if (sentryOptions != null) {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Task " + runnable + " rejected from " + this.executorService, new Object[0]);
        }
        return new CancelledFuture();
    }

    public SentryExecutorService(@Nullable SentryOptions sentryOptions) {
        this(new ScheduledThreadPoolExecutor(1, new SentryExecutorServiceThreadFactory()), sentryOptions);
    }

    public SentryExecutorService() {
        this(new ScheduledThreadPoolExecutor(1, new SentryExecutorServiceThreadFactory()), null);
    }

    @Override // io.sentry.ISentryExecutorService
    @NotNull
    public <T> Future<T> submit(@NotNull Callable<T> callable) {
        if (isQueueAvailable()) {
            return this.executorService.submit(callable);
        }
        SentryOptions sentryOptions = this.options;
        if (sentryOptions != null) {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Task " + callable + " rejected from " + this.executorService, new Object[0]);
        }
        return new CancelledFuture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
    }
}
