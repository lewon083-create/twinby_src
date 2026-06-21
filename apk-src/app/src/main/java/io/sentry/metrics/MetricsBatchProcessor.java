package io.sentry.metrics;

import io.appmetrica.analytics.impl.lp;
import io.sentry.DataCategory;
import io.sentry.ISentryClient;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryMetricsEvent;
import io.sentry.SentryMetricsEvents;
import io.sentry.SentryOptions;
import io.sentry.clientreport.DiscardReason;
import io.sentry.transport.ReusableCountLatch;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class MetricsBatchProcessor implements IMetricsBatchProcessor {
    public static final int FLUSH_AFTER_MS = 5000;
    public static final int MAX_BATCH_SIZE = 1000;
    public static final int MAX_QUEUE_SIZE = 10000;

    @NotNull
    private final ISentryClient client;

    @NotNull
    private final ISentryExecutorService executorService;

    @NotNull
    protected final SentryOptions options;

    @Nullable
    private volatile Future<?> scheduledFlush;

    @NotNull
    private final AutoClosableReentrantLock scheduleLock = new AutoClosableReentrantLock();
    private volatile boolean hasScheduled = false;
    private volatile boolean isShuttingDown = false;

    @NotNull
    private final ReusableCountLatch pendingCount = new ReusableCountLatch();

    @NotNull
    private final Queue<SentryMetricsEvent> queue = new ConcurrentLinkedQueue();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public class BatchRunnable implements Runnable {
        private BatchRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsBatchProcessor.this.flush();
        }
    }

    public MetricsBatchProcessor(@NotNull SentryOptions sentryOptions, @NotNull ISentryClient iSentryClient) {
        this.options = sentryOptions;
        this.client = iSentryClient;
        this.executorService = new SentryExecutorService(sentryOptions);
    }

    private void flushBatch() {
        ArrayList arrayList = new ArrayList(1000);
        do {
            SentryMetricsEvent sentryMetricsEventPoll = this.queue.poll();
            if (sentryMetricsEventPoll != null) {
                arrayList.add(sentryMetricsEventPoll);
            }
            if (this.queue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        this.client.captureBatchedMetricsEvents(new SentryMetricsEvents(arrayList));
        for (int i = 0; i < arrayList.size(); i++) {
            this.pendingCount.decrement();
        }
    }

    private void flushInternal() {
        do {
            flushBatch();
        } while (this.queue.size() >= 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$0() {
        this.executorService.close(this.options.getShutdownTimeoutMillis());
    }

    private void maybeSchedule(boolean z5, boolean z10) {
        if (!this.hasScheduled || z5) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.scheduleLock.acquire();
            try {
                Future<?> future = this.scheduledFlush;
                if (z5 || future == null || future.isDone() || future.isCancelled()) {
                    this.hasScheduled = true;
                    try {
                        this.scheduledFlush = this.executorService.schedule(new BatchRunnable(), z10 ? 0 : 5000);
                    } catch (RejectedExecutionException e3) {
                        this.hasScheduled = false;
                        this.options.getLogger().log(SentryLevel.WARNING, "Metrics batch processor flush task rejected", e3);
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
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void add(@NotNull SentryMetricsEvent sentryMetricsEvent) {
        if (this.isShuttingDown) {
            return;
        }
        if (this.pendingCount.getCount() >= 10000) {
            this.options.getClientReportRecorder().recordLostEvent(DiscardReason.QUEUE_OVERFLOW, DataCategory.TraceMetric);
            return;
        }
        this.pendingCount.increment();
        this.queue.offer(sentryMetricsEvent);
        maybeSchedule(false, false);
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void close(boolean z5) {
        this.isShuttingDown = true;
        if (z5) {
            maybeSchedule(true, true);
            this.executorService.submit(new lp(9, this));
        } else {
            this.executorService.close(this.options.getShutdownTimeoutMillis());
            while (!this.queue.isEmpty()) {
                flushBatch();
            }
        }
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void flush(long j10) {
        maybeSchedule(true, true);
        try {
            this.pendingCount.waitTillZero(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to flush metrics events", e3);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush() {
        flushInternal();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.scheduleLock.acquire();
        try {
            if (!this.queue.isEmpty()) {
                maybeSchedule(true, false);
            } else {
                this.hasScheduled = false;
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
}
