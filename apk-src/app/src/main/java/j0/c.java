package j0;

import android.os.Handler;
import i0.o;
import j1.k;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements RunnableScheduledFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f26125b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable f26127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f26128e;

    public c(Handler handler, long j10, Callable callable) {
        this.f26126c = j10;
        this.f26127d = callable;
        this.f26128e = o.w(new ka.k(15, this, handler, callable, false));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return this.f26128e.cancel(z5);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f26128e.f26173c.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f26126c - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26128e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26128e.f26173c.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        j1.h hVar = (j1.h) this.f26125b.getAndSet(null);
        if (hVar != null) {
            try {
                hVar.b(this.f26127d.call());
            } catch (Exception e3) {
                hVar.d(e3);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f26128e.f26173c.get(j10, timeUnit);
    }
}
