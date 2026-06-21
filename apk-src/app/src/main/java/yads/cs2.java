package yads;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class cs2 implements RunnableFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vy f37484b = new vy();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vy f37485c = new vy();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f37486d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Exception f37487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f37488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f37489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37490h;

    public abstract Object b();

    public final Object c() throws ExecutionException {
        if (this.f37490h) {
            throw new CancellationException();
        }
        if (this.f37487e == null) {
            return this.f37488f;
        }
        throw new ExecutionException(this.f37487e);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        synchronized (this.f37486d) {
            try {
                if (!this.f37490h && !this.f37485c.c()) {
                    this.f37490h = true;
                    a();
                    Thread thread = this.f37489g;
                    if (thread == null) {
                        this.f37484b.d();
                        this.f37485c.d();
                    } else if (z5) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.f37485c.a();
        return c();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f37490h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z5;
        vy vyVar = this.f37485c;
        synchronized (vyVar) {
            z5 = vyVar.f44222a;
        }
        return z5;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f37486d) {
            try {
                if (this.f37490h) {
                    return;
                }
                this.f37489g = Thread.currentThread();
                this.f37484b.d();
                try {
                    try {
                        this.f37488f = b();
                        synchronized (this.f37486d) {
                            this.f37485c.d();
                            this.f37489g = null;
                            Thread.interrupted();
                        }
                    } catch (Exception e3) {
                        this.f37487e = e3;
                        synchronized (this.f37486d) {
                            this.f37485c.d();
                            this.f37489g = null;
                            Thread.interrupted();
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (this.f37486d) {
                        this.f37485c.d();
                        this.f37489g = null;
                        Thread.interrupted();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws TimeoutException {
        boolean z5;
        long jConvert = TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        vy vyVar = this.f37485c;
        synchronized (vyVar) {
            if (jConvert <= 0) {
                z5 = vyVar.f44222a;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = jConvert + jElapsedRealtime;
                if (j11 < jElapsedRealtime) {
                    vyVar.a();
                } else {
                    while (!vyVar.f44222a && jElapsedRealtime < j11) {
                        vyVar.wait(j11 - jElapsedRealtime);
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z5 = vyVar.f44222a;
            }
        }
        if (z5) {
            return c();
        }
        throw new TimeoutException();
    }

    public void a() {
    }
}
