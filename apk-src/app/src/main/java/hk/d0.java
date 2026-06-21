package hk;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends t0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d0 f20652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f20653l;

    static {
        Long l10;
        d0 d0Var = new d0();
        f20652k = d0Var;
        d0Var.I(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f20653l = timeUnit.toNanos(l10.longValue());
    }

    @Override // hk.u0
    public final void L(long j10, r0 r0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // hk.t0
    public final void M(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.M(runnable);
    }

    public final synchronized void R() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            t0.f20712h.set(this, null);
            t0.i.set(this, null);
            notifyAll();
        }
    }

    @Override // hk.t0, hk.h0
    public final m0 h(long j10, w1 w1Var, CoroutineContext coroutineContext) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 >= 4611686018427387903L) {
            return n1.f20696b;
        }
        long jNanoTime = System.nanoTime();
        q0 q0Var = new q0(j11 + jNanoTime, w1Var);
        Q(jNanoTime, q0Var);
        return q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zP;
        u1.f20719a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zP) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long J = J();
                    if (J == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f20653l + jNanoTime;
                        }
                        long j11 = j10 - jNanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            R();
                            if (P()) {
                                return;
                            }
                            s();
                            return;
                        }
                        if (J > j11) {
                            J = j11;
                        }
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (J > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            R();
                            if (P()) {
                                return;
                            }
                            s();
                            return;
                        }
                        LockSupport.parkNanos(this, J);
                    }
                }
            }
        } finally {
            _thread = null;
            R();
            if (!P()) {
                s();
            }
        }
    }

    @Override // hk.u0
    public final Thread s() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f20652k.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // hk.t0, hk.u0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // hk.x
    public final String toString() {
        return "DefaultExecutor";
    }
}
