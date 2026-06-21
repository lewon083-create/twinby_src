package io.sentry.hints;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BlockingFlushHint implements DiskFlushNotification, Flushable {
    private final long flushTimeoutMillis;
    private final CountDownLatch latch = new CountDownLatch(1);

    @NotNull
    private final ILogger logger;

    public BlockingFlushHint(long j10, @NotNull ILogger iLogger) {
        this.flushTimeoutMillis = j10;
        this.logger = iLogger;
    }

    @Override // io.sentry.hints.DiskFlushNotification
    public void markFlushed() {
        this.latch.countDown();
    }

    @Override // io.sentry.hints.Flushable
    public boolean waitFlush() {
        try {
            return this.latch.await(this.flushTimeoutMillis, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            this.logger.log(SentryLevel.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e3);
            return false;
        }
    }
}
