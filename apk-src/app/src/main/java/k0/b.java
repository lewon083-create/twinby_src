package k0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f26758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f26759e = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CountDownLatch f26760f = new CountDownLatch(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ed.d f26761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile ed.d f26762h;

    public b(a aVar, ed.d dVar) {
        this.f26758d = aVar;
        dVar.getClass();
        this.f26761g = dVar;
    }

    public static Object d(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z5 = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th2) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // k0.d, java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        boolean z10 = false;
        if (!this.f26763b.cancel(z5)) {
            return false;
        }
        while (true) {
            try {
                this.f26759e.put(Boolean.valueOf(z5));
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        ed.d dVar = this.f26761g;
        if (dVar != null) {
            dVar.cancel(z5);
        }
        ed.d dVar2 = this.f26762h;
        if (dVar2 != null) {
            dVar2.cancel(z5);
        }
        return true;
    }

    @Override // k0.d, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.f26763b.isDone()) {
            ed.d dVar = this.f26761g;
            if (dVar != null) {
                dVar.get();
            }
            this.f26760f.await();
            ed.d dVar2 = this.f26762h;
            if (dVar2 != null) {
                dVar2.get();
            }
        }
        return this.f26763b.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ed.d, k0.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ed.d, k0.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [ed.d, k0.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r02;
        ?? r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            ed.d dVarApply = this.f26758d.apply(j.d(this.f26761g));
                            this.f26762h = dVarApply;
                            if (this.f26763b.isCancelled()) {
                                dVarApply.cancel(((Boolean) d(this.f26759e)).booleanValue());
                                this.f26762h = null;
                            } else {
                                dVarApply.a(new i(12, this, dVarApply, false), hl.d.j());
                            }
                        } catch (CancellationException unused) {
                            cancel(false);
                        } catch (ExecutionException e3) {
                            Throwable cause = e3.getCause();
                            j1.h hVar = this.f26764c;
                            if (hVar != null) {
                                hVar.d(cause);
                            }
                        }
                    } catch (Error e7) {
                        j1.h hVar2 = this.f26764c;
                        r02 = r03;
                        if (hVar2 != null) {
                            hVar2.d(e7);
                            r02 = r03;
                        }
                    }
                } catch (Exception e10) {
                    j1.h hVar3 = this.f26764c;
                    r02 = r03;
                    if (hVar3 != null) {
                        hVar3.d(e10);
                        r02 = r03;
                    }
                }
            } finally {
                this.f26758d = r03;
                this.f26761g = r03;
                this.f26760f.countDown();
            }
        } catch (UndeclaredThrowableException e11) {
            Throwable cause2 = e11.getCause();
            j1.h hVar4 = this.f26764c;
            r02 = r03;
            if (hVar4 != null) {
                hVar4.d(cause2);
                r02 = r03;
            }
        }
    }

    @Override // k0.d, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f26763b.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            ed.d dVar = this.f26761g;
            if (dVar != null) {
                long jNanoTime = System.nanoTime();
                dVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f26760f.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                ed.d dVar2 = this.f26762h;
                if (dVar2 != null) {
                    dVar2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f26763b.get(j10, timeUnit);
    }
}
