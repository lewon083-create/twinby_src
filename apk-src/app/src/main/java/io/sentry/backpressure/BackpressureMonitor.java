package io.sentry.backpressure;

import io.sentry.IScopes;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class BackpressureMonitor implements IBackpressureMonitor, Runnable {
    private static final int CHECK_INTERVAL_IN_MS = 10000;
    private static final int INITIAL_CHECK_DELAY_IN_MS = 500;
    static final int MAX_DOWNSAMPLE_FACTOR = 10;
    private int downsampleFactor = 0;

    @Nullable
    private volatile Future<?> latestScheduledRun = null;

    @NotNull
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    @NotNull
    private final IScopes scopes;

    @NotNull
    private final SentryOptions sentryOptions;

    public BackpressureMonitor(@NotNull SentryOptions sentryOptions, @NotNull IScopes iScopes) {
        this.sentryOptions = sentryOptions;
        this.scopes = iScopes;
    }

    private boolean isHealthy() {
        return this.scopes.isHealthy();
    }

    private void reschedule(int i) {
        ISentryExecutorService executorService = this.sentryOptions.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            try {
                this.latestScheduledRun = executorService.schedule(this, i);
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
        } catch (RejectedExecutionException e3) {
            this.sentryOptions.getLogger().log(SentryLevel.WARNING, "Backpressure monitor reschedule task rejected", e3);
        }
        if (iSentryLifecycleTokenAcquire != null) {
            iSentryLifecycleTokenAcquire.close();
        }
    }

    public void checkHealth() {
        if (isHealthy()) {
            if (this.downsampleFactor > 0) {
                this.sentryOptions.getLogger().log(SentryLevel.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.downsampleFactor = 0;
        } else {
            int i = this.downsampleFactor;
            if (i < 10) {
                this.downsampleFactor = i + 1;
                this.sentryOptions.getLogger().log(SentryLevel.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.downsampleFactor));
            }
        }
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void close() {
        Future<?> future = this.latestScheduledRun;
        if (future != null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                future.cancel(true);
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
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public int getDownsampleFactor() {
        return this.downsampleFactor;
    }

    @Override // java.lang.Runnable
    public void run() {
        checkHealth();
        reschedule(10000);
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void start() {
        reschedule(500);
    }
}
