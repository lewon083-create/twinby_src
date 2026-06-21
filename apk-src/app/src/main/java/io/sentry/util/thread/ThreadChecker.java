package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadChecker implements IThreadChecker {
    private static final long mainThreadId = Thread.currentThread().getId();
    private static final ThreadChecker instance = new ThreadChecker();

    private ThreadChecker() {
    }

    public static ThreadChecker getInstance() {
        return instance;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public long currentThreadSystemId() {
        return Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    @NotNull
    public String getCurrentThreadName() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(long j10) {
        return mainThreadId == j10;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(@NotNull Thread thread) {
        return isMainThread(thread.getId());
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread() {
        return isMainThread(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(@NotNull SentryThread sentryThread) {
        Long id2 = sentryThread.getId();
        return id2 != null && isMainThread(id2.longValue());
    }
}
