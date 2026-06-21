package io.sentry.transport;

import a0.u;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ReusableCountLatch {

    @NotNull
    private final Sync sync;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Sync extends AbstractQueuedSynchronizer {
        private static final long serialVersionUID = 5970133580157457018L;

        public Sync(int i) {
            setState(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void decrement() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getCount() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void increment() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i) {
            int state;
            int i10;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i10 = state - 1;
            } while (!compareAndSetState(state, i10));
            return i10 == 0;
        }
    }

    public ReusableCountLatch(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(u.k(i, "negative initial count '", "' is not allowed"));
        }
        this.sync = new Sync(i);
    }

    public void decrement() {
        this.sync.decrement();
    }

    public int getCount() {
        return this.sync.getCount();
    }

    public void increment() {
        this.sync.increment();
    }

    public void waitTillZero() throws InterruptedException {
        this.sync.acquireSharedInterruptibly(1);
    }

    public boolean waitTillZero(long j10, @NotNull TimeUnit timeUnit) {
        return this.sync.tryAcquireSharedNanos(1, timeUnit.toNanos(j10));
    }

    public ReusableCountLatch() {
        this(0);
    }
}
