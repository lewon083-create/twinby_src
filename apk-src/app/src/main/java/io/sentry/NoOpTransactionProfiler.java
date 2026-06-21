package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpTransactionProfiler implements ITransactionProfiler {
    private static final NoOpTransactionProfiler instance = new NoOpTransactionProfiler();

    private NoOpTransactionProfiler() {
    }

    public static NoOpTransactionProfiler getInstance() {
        return instance;
    }

    @Override // io.sentry.ITransactionProfiler
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.ITransactionProfiler
    @Nullable
    public ProfilingTraceData onTransactionFinish(@NotNull ITransaction iTransaction, @Nullable List<PerformanceCollectionData> list, @NotNull SentryOptions sentryOptions) {
        return null;
    }

    @Override // io.sentry.ITransactionProfiler
    public void close() {
    }

    @Override // io.sentry.ITransactionProfiler
    public void start() {
    }

    @Override // io.sentry.ITransactionProfiler
    public void bindTransaction(@NotNull ITransaction iTransaction) {
    }
}
