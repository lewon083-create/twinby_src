package io.sentry.logger;

import io.sentry.SentryLogEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpLoggerBatchProcessor implements ILoggerBatchProcessor {
    private static final NoOpLoggerBatchProcessor instance = new NoOpLoggerBatchProcessor();

    private NoOpLoggerBatchProcessor() {
    }

    public static NoOpLoggerBatchProcessor getInstance() {
        return instance;
    }

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void add(@NotNull SentryLogEvent sentryLogEvent) {
    }

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void close(boolean z5) {
    }

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void flush(long j10) {
    }
}
