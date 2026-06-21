package io.sentry;

import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IContinuousProfiler {
    void close(boolean z5);

    @NotNull
    SentryId getChunkId();

    @NotNull
    SentryId getProfilerId();

    boolean isRunning();

    void reevaluateSampling();

    void startProfiler(@NotNull ProfileLifecycle profileLifecycle, @NotNull TracesSampler tracesSampler);

    void stopProfiler(@NotNull ProfileLifecycle profileLifecycle);
}
