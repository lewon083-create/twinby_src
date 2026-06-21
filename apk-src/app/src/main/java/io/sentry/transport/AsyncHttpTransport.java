package io.sentry.transport;

import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.RequestDetails;
import io.sentry.SentryDateProvider;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.clientreport.DiscardReason;
import io.sentry.hints.Cached;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.Enqueable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.i;
import io.sentry.util.HintUtils;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AsyncHttpTransport implements ITransport {

    @NotNull
    private final HttpConnection connection;

    @Nullable
    private volatile Runnable currentRunnable;

    @NotNull
    private final IEnvelopeCache envelopeCache;

    @NotNull
    private final QueuedThreadPoolExecutor executor;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final RateLimiter rateLimiter;

    @NotNull
    private final ITransportGate transportGate;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AsyncConnectionThreadFactory implements ThreadFactory {
        private int cnt;

        private AsyncConnectionThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb2 = new StringBuilder("SentryAsyncConnection-");
            int i = this.cnt;
            this.cnt = i + 1;
            sb2.append(i);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public final class EnvelopeSender implements Runnable {

        @NotNull
        private final SentryEnvelope envelope;

        @NotNull
        private final IEnvelopeCache envelopeCache;
        private final TransportResult failedResult = TransportResult.error();

        @NotNull
        private final Hint hint;

        public EnvelopeSender(@NotNull SentryEnvelope sentryEnvelope, @NotNull Hint hint, @NotNull IEnvelopeCache iEnvelopeCache) {
            this.envelope = (SentryEnvelope) Objects.requireNonNull(sentryEnvelope, "Envelope is required.");
            this.hint = hint;
            this.envelopeCache = (IEnvelopeCache) Objects.requireNonNull(iEnvelopeCache, "EnvelopeCache is required.");
        }

        @NotNull
        private TransportResult flush() {
            TransportResult transportResult = this.failedResult;
            this.envelope.getHeader().setSentAt(null);
            final boolean zStoreEnvelope = this.envelopeCache.storeEnvelope(this.envelope, this.hint);
            HintUtils.runIfHasType(this.hint, DiskFlushNotification.class, new b(0, this));
            if (!AsyncHttpTransport.this.transportGate.isConnected()) {
                HintUtils.runIfHasType(this.hint, Retryable.class, new c(1), new HintUtils.SentryHintFallback() { // from class: io.sentry.transport.e
                    @Override // io.sentry.util.HintUtils.SentryHintFallback
                    public final void accept(Object obj, Class cls) {
                        this.f26100b.lambda$flush$5(zStoreEnvelope, obj, cls);
                    }
                });
                return transportResult;
            }
            final SentryEnvelope sentryEnvelopeAttachReportToEnvelope = AsyncHttpTransport.this.options.getClientReportRecorder().attachReportToEnvelope(this.envelope);
            try {
                sentryEnvelopeAttachReportToEnvelope.getHeader().setSentAt(DateUtils.nanosToDate(AsyncHttpTransport.this.options.getDateProvider().now().nanoTimestamp()));
                TransportResult transportResultSend = AsyncHttpTransport.this.connection.send(sentryEnvelopeAttachReportToEnvelope);
                if (transportResultSend.isSuccess()) {
                    this.envelopeCache.discard(this.envelope);
                    return transportResultSend;
                }
                String str = "The transport failed to send the envelope with response code " + transportResultSend.getResponseCode();
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.ERROR, str, new Object[0]);
                if (transportResultSend.getResponseCode() >= 400) {
                    this.envelopeCache.discard(this.envelope);
                    if (transportResultSend.getResponseCode() != 429) {
                        AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.SEND_ERROR, sentryEnvelopeAttachReportToEnvelope);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e3) {
                HintUtils.runIfHasType(this.hint, Retryable.class, new c(0), new HintUtils.SentryHintFallback() { // from class: io.sentry.transport.d
                    @Override // io.sentry.util.HintUtils.SentryHintFallback
                    public final void accept(Object obj, Class cls) {
                        this.f26097b.lambda$flush$3(zStoreEnvelope, sentryEnvelopeAttachReportToEnvelope, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$flush$1(DiskFlushNotification diskFlushNotification) {
            if (!diskFlushNotification.isFlushable(this.envelope.getHeader().getEventId())) {
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                diskFlushNotification.markFlushed();
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$flush$3(boolean z5, SentryEnvelope sentryEnvelope, Object obj, Class cls) {
            if (z5) {
                return;
            }
            LogUtils.logNotInstanceOf(cls, obj, AsyncHttpTransport.this.options.getLogger());
            AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, sentryEnvelope);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$flush$5(boolean z5, Object obj, Class cls) {
            if (z5) {
                return;
            }
            LogUtils.logNotInstanceOf(cls, obj, AsyncHttpTransport.this.options.getLogger());
            AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, this.envelope);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(TransportResult transportResult, SubmissionResult submissionResult) {
            AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(transportResult.isSuccess()));
            submissionResult.setResult(transportResult.isSuccess());
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncHttpTransport.this.currentRunnable = this;
            final TransportResult transportResultFlush = this.failedResult;
            try {
                transportResultFlush = flush();
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public AsyncHttpTransport(@NotNull SentryOptions sentryOptions, @NotNull RateLimiter rateLimiter, @NotNull ITransportGate iTransportGate, @NotNull RequestDetails requestDetails) {
        this(initExecutor(sentryOptions.getMaxQueueSize(), sentryOptions.getEnvelopeDiskCache(), sentryOptions.getLogger(), sentryOptions.getDateProvider()), sentryOptions, rateLimiter, iTransportGate, new HttpConnection(sentryOptions, requestDetails, rateLimiter));
    }

    private static QueuedThreadPoolExecutor initExecutor(int i, @NotNull final IEnvelopeCache iEnvelopeCache, @NotNull final ILogger iLogger, @NotNull SentryDateProvider sentryDateProvider) {
        return new QueuedThreadPoolExecutor(1, i, new AsyncConnectionThreadFactory(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AsyncHttpTransport.lambda$initExecutor$1(iEnvelopeCache, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger, sentryDateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initExecutor$1(IEnvelopeCache iEnvelopeCache, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof EnvelopeSender) {
            EnvelopeSender envelopeSender = (EnvelopeSender) runnable;
            if (!HintUtils.hasType(envelopeSender.hint, Cached.class)) {
                iEnvelopeCache.storeEnvelope(envelopeSender.envelope, envelopeSender.hint);
            }
            markHintWhenSendingFailed(envelopeSender.hint, true);
            iLogger.log(SentryLevel.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$send$0(Enqueable enqueable) {
        enqueable.markEnqueued();
        this.options.getLogger().log(SentryLevel.DEBUG, "Envelope enqueued", new Object[0]);
    }

    private static void markHintWhenSendingFailed(@NotNull Hint hint, boolean z5) {
        HintUtils.runIfHasType(hint, SubmissionResult.class, new c(2));
        HintUtils.runIfHasType(hint, Retryable.class, new i(z5, 3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close(false);
    }

    @Override // io.sentry.transport.ITransport
    public void flush(long j10) {
        this.executor.waitTillIdle(j10);
    }

    @Override // io.sentry.transport.ITransport
    @NotNull
    public RateLimiter getRateLimiter() {
        return this.rateLimiter;
    }

    @Override // io.sentry.transport.ITransport
    public boolean isHealthy() {
        return (this.rateLimiter.isAnyRateLimitActive() || this.executor.didRejectRecently()) ? false : true;
    }

    @Override // io.sentry.transport.ITransport
    public void send(@NotNull SentryEnvelope sentryEnvelope, @NotNull Hint hint) {
        IEnvelopeCache noOpEnvelopeCache = this.envelopeCache;
        boolean z5 = false;
        if (HintUtils.hasType(hint, Cached.class)) {
            noOpEnvelopeCache = NoOpEnvelopeCache.getInstance();
            this.options.getLogger().log(SentryLevel.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z5 = true;
        }
        SentryEnvelope sentryEnvelopeFilter = this.rateLimiter.filter(sentryEnvelope, hint);
        if (sentryEnvelopeFilter == null) {
            if (z5) {
                this.envelopeCache.discard(sentryEnvelope);
                return;
            }
            return;
        }
        if (HintUtils.hasType(hint, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class)) {
            sentryEnvelopeFilter = this.options.getClientReportRecorder().attachReportToEnvelope(sentryEnvelopeFilter);
        }
        Future<?> futureSubmit = this.executor.submit(new EnvelopeSender(sentryEnvelopeFilter, hint, noOpEnvelopeCache));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            HintUtils.runIfHasType(hint, Enqueable.class, new b(1, this));
        } else {
            this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.QUEUE_OVERFLOW, sentryEnvelopeFilter);
        }
    }

    @Override // io.sentry.transport.ITransport
    public void close(boolean z5) {
        this.rateLimiter.close();
        this.executor.shutdown();
        this.options.getLogger().log(SentryLevel.DEBUG, "Shutting down", new Object[0]);
        if (z5) {
            return;
        }
        try {
            long flushTimeoutMillis = this.options.getFlushTimeoutMillis();
            if (this.executor.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.executor.shutdownNow();
            if (this.currentRunnable != null) {
                this.executor.getRejectedExecutionHandler().rejectedExecution(this.currentRunnable, this.executor);
            }
        } catch (InterruptedException unused) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    public AsyncHttpTransport(@NotNull QueuedThreadPoolExecutor queuedThreadPoolExecutor, @NotNull SentryOptions sentryOptions, @NotNull RateLimiter rateLimiter, @NotNull ITransportGate iTransportGate, @NotNull HttpConnection httpConnection) {
        this.currentRunnable = null;
        this.executor = (QueuedThreadPoolExecutor) Objects.requireNonNull(queuedThreadPoolExecutor, "executor is required");
        this.envelopeCache = (IEnvelopeCache) Objects.requireNonNull(sentryOptions.getEnvelopeDiskCache(), "envelopeCache is required");
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options is required");
        this.rateLimiter = (RateLimiter) Objects.requireNonNull(rateLimiter, "rateLimiter is required");
        this.transportGate = (ITransportGate) Objects.requireNonNull(iTransportGate, "transportGate is required");
        this.connection = (HttpConnection) Objects.requireNonNull(httpConnection, "httpConnection is required");
    }
}
