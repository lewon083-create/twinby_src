package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpSentryExecutorService implements ISentryExecutorService {
    private static final NoOpSentryExecutorService instance = new NoOpSentryExecutorService();

    private NoOpSentryExecutorService() {
    }

    @NotNull
    public static ISentryExecutorService getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$schedule$2() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$submit$0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$submit$1() {
        return null;
    }

    @Override // io.sentry.ISentryExecutorService
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.ISentryExecutorService
    @NotNull
    public Future<?> schedule(@NotNull Runnable runnable, long j10) {
        return new FutureTask(new c(1));
    }

    @Override // io.sentry.ISentryExecutorService
    @NotNull
    public Future<?> submit(@NotNull Runnable runnable) {
        return new FutureTask(new c(3));
    }

    @Override // io.sentry.ISentryExecutorService
    @NotNull
    public <T> Future<T> submit(@NotNull Callable<T> callable) {
        return new FutureTask(new c(2));
    }

    @Override // io.sentry.ISentryExecutorService
    public void prewarm() {
    }

    @Override // io.sentry.ISentryExecutorService
    public void close(long j10) {
    }
}
