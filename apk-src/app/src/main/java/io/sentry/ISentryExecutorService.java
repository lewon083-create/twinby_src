package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ISentryExecutorService {
    void close(long j10);

    boolean isClosed();

    void prewarm();

    @NotNull
    Future<?> schedule(@NotNull Runnable runnable, long j10);

    @NotNull
    Future<?> submit(@NotNull Runnable runnable);

    @NotNull
    <T> Future<T> submit(@NotNull Callable<T> callable);
}
