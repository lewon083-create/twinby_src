package io.sentry.logger;

import io.appmetrica.analytics.impl.lp;
import io.sentry.DataCategory;
import io.sentry.ISentryClient;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEvent;
import io.sentry.SentryLogEvents;
import io.sentry.SentryOptions;
import io.sentry.clientreport.DiscardReason;
import io.sentry.clientreport.IClientReportRecorder;
import io.sentry.transport.ReusableCountLatch;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.JsonSerializationUtils;
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
public class LoggerBatchProcessor implements ILoggerBatchProcessor {
    public static final int FLUSH_AFTER_MS = 5000;
    public static final int MAX_BATCH_SIZE = 100;
    public static final int MAX_QUEUE_SIZE = 1000;

    @NotNull
    private final ISentryClient client;

    @NotNull
    private final ISentryExecutorService executorService;
    private volatile boolean hasScheduled;
    private volatile boolean isShuttingDown;

    @NotNull
    protected final SentryOptions options;

    @NotNull
    private final ReusableCountLatch pendingCount;

    @NotNull
    private final Queue<SentryLogEvent> queue;

    @NotNull
    private final AutoClosableReentrantLock scheduleLock;

    @Nullable
    private volatile Future<?> scheduledFlush;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public class BatchRunnable implements Runnable {
        private BatchRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoggerBatchProcessor.this.flush();
        }
    }

    public LoggerBatchProcessor(@NotNull SentryOptions sentryOptions, @NotNull ISentryClient iSentryClient) {
        this(sentryOptions, iSentryClient, new SentryExecutorService(sentryOptions));
    }

    private void flushBatch() {
        ArrayList arrayList = new ArrayList(100);
        do {
            SentryLogEvent sentryLogEventPoll = this.queue.poll();
            if (sentryLogEventPoll != null) {
                arrayList.add(sentryLogEventPoll);
            }
            if (this.queue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        this.client.captureBatchedLogEvents(new SentryLogEvents(arrayList));
        for (int i = 0; i < arrayList.size(); i++) {
            this.pendingCount.decrement();
        }
    }

    private void flushInternal() {
        do {
            flushBatch();
        } while (this.queue.size() >= 100);
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
                        this.options.getLogger().log(SentryLevel.WARNING, "Logs batch processor flush task rejected", e3);
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

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void add(@NotNull SentryLogEvent sentryLogEvent) {
        if (this.isShuttingDown) {
            return;
        }
        if (this.pendingCount.getCount() < 1000) {
            this.pendingCount.increment();
            this.queue.offer(sentryLogEvent);
            maybeSchedule(false, false);
        } else {
            IClientReportRecorder clientReportRecorder = this.options.getClientReportRecorder();
            DiscardReason discardReason = DiscardReason.QUEUE_OVERFLOW;
            clientReportRecorder.recordLostEvent(discardReason, DataCategory.LogItem);
            this.options.getClientReportRecorder().recordLostEvent(discardReason, DataCategory.LogByte, JsonSerializationUtils.byteSizeOf(this.options.getSerializer(), this.options.getLogger(), sentryLogEvent));
        }
    }

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void close(boolean z5) {
        this.isShuttingDown = true;
        if (z5) {
            maybeSchedule(true, true);
            this.executorService.submit(new lp(8, this));
        } else {
            this.executorService.close(this.options.getShutdownTimeoutMillis());
            while (!this.queue.isEmpty()) {
                flushBatch();
            }
        }
    }

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void flush(long j10) {
        maybeSchedule(true, true);
        try {
            this.pendingCount.waitTillZero(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to flush log events", e3);
            Thread.currentThread().interrupt();
        }
    }

    public LoggerBatchProcessor(@NotNull SentryOptions sentryOptions, @NotNull ISentryClient iSentryClient, @NotNull ISentryExecutorService iSentryExecutorService) {
        this.scheduleLock = new AutoClosableReentrantLock();
        this.hasScheduled = false;
        this.isShuttingDown = false;
        this.pendingCount = new ReusableCountLatch();
        this.options = sentryOptions;
        this.client = iSentryClient;
        this.queue = new ConcurrentLinkedQueue();
        this.executorService = iSentryExecutorService;
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
