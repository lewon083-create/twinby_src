package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpCompositePerformanceCollector implements CompositePerformanceCollector {
    private static final NoOpCompositePerformanceCollector instance = new NoOpCompositePerformanceCollector();

    private NoOpCompositePerformanceCollector() {
    }

    public static NoOpCompositePerformanceCollector getInstance() {
        return instance;
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void start(@NotNull ITransaction iTransaction) {
    }

    @Override // io.sentry.CompositePerformanceCollector
    @Nullable
    public List<PerformanceCollectionData> stop(@NotNull ITransaction iTransaction) {
        return null;
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void start(@NotNull String str) {
    }

    @Override // io.sentry.CompositePerformanceCollector
    @Nullable
    public List<PerformanceCollectionData> stop(@NotNull String str) {
        return null;
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void close() {
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void onSpanFinished(@NotNull ISpan iSpan) {
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void onSpanStarted(@NotNull ISpan iSpan) {
    }
}
