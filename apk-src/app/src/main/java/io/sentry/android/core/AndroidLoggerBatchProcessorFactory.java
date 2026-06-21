package io.sentry.android.core;

import io.sentry.SentryClient;
import io.sentry.SentryOptions;
import io.sentry.logger.ILoggerBatchProcessor;
import io.sentry.logger.ILoggerBatchProcessorFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLoggerBatchProcessorFactory implements ILoggerBatchProcessorFactory {
    @Override // io.sentry.logger.ILoggerBatchProcessorFactory
    @NotNull
    public ILoggerBatchProcessor create(@NotNull SentryOptions sentryOptions, @NotNull SentryClient sentryClient) {
        return new AndroidLoggerBatchProcessor(sentryOptions, sentryClient);
    }
}
