package io.sentry.util;

import io.sentry.ISentryLifecycleToken;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AutoClosableReentrantLock extends ReentrantLock {
    private static final long serialVersionUID = -3283069816958445549L;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AutoClosableReentrantLockLifecycleToken implements ISentryLifecycleToken {

        @NotNull
        private final ReentrantLock lock;

        public AutoClosableReentrantLockLifecycleToken(@NotNull ReentrantLock reentrantLock) {
            this.lock = reentrantLock;
        }

        @Override // io.sentry.ISentryLifecycleToken, java.lang.AutoCloseable
        public void close() {
            this.lock.unlock();
        }
    }

    public ISentryLifecycleToken acquire() {
        lock();
        return new AutoClosableReentrantLockLifecycleToken(this);
    }
}
