package io.sentry;

import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpContinuousProfiler implements IContinuousProfiler {
    private static final NoOpContinuousProfiler instance = new NoOpContinuousProfiler();

    private NoOpContinuousProfiler() {
    }

    public static NoOpContinuousProfiler getInstance() {
        return instance;
    }

    @Override // io.sentry.IContinuousProfiler
    @NotNull
    public SentryId getChunkId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IContinuousProfiler
    @NotNull
    public SentryId getProfilerId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IContinuousProfiler
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.IContinuousProfiler
    public void reevaluateSampling() {
    }

    @Override // io.sentry.IContinuousProfiler
    public void close(boolean z5) {
    }

    @Override // io.sentry.IContinuousProfiler
    public void stopProfiler(@NotNull ProfileLifecycle profileLifecycle) {
    }

    @Override // io.sentry.IContinuousProfiler
    public void startProfiler(@NotNull ProfileLifecycle profileLifecycle, @NotNull TracesSampler tracesSampler) {
    }
}
