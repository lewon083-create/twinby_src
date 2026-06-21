package io.sentry.metrics;

import io.sentry.SentryMetricsEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpMetricsBatchProcessor implements IMetricsBatchProcessor {
    private static final NoOpMetricsBatchProcessor instance = new NoOpMetricsBatchProcessor();

    private NoOpMetricsBatchProcessor() {
    }

    public static NoOpMetricsBatchProcessor getInstance() {
        return instance;
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void add(@NotNull SentryMetricsEvent sentryMetricsEvent) {
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void close(boolean z5) {
    }

    @Override // io.sentry.metrics.IMetricsBatchProcessor
    public void flush(long j10) {
    }
}
