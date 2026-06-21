package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpThreadChecker implements IThreadChecker {
    private static final NoOpThreadChecker instance = new NoOpThreadChecker();

    public static NoOpThreadChecker getInstance() {
        return instance;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public long currentThreadSystemId() {
        return 0L;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    @NotNull
    public String getCurrentThreadName() {
        return "";
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread() {
        return false;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(long j10) {
        return false;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(@NotNull SentryThread sentryThread) {
        return false;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(@NotNull Thread thread) {
        return false;
    }
}
