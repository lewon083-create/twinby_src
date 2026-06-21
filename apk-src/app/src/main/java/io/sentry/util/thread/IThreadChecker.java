package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IThreadChecker {
    long currentThreadSystemId();

    @NotNull
    String getCurrentThreadName();

    boolean isMainThread();

    boolean isMainThread(long j10);

    boolean isMainThread(@NotNull SentryThread sentryThread);

    boolean isMainThread(@NotNull Thread thread);
}
