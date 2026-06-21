package a0;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f219d = new r(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f220b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f221c;

    public s() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f219d);
        threadPoolExecutor.setRejectedExecutionHandler(new p(0));
        this.f221c = threadPoolExecutor;
    }

    public final void a(t.p pVar) {
        ThreadPoolExecutor threadPoolExecutor;
        pVar.getClass();
        synchronized (this.f220b) {
            try {
                if (this.f221c.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f219d);
                    threadPoolExecutor2.setRejectedExecutionHandler(new p(0));
                    this.f221c = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f221c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iMax = Math.max(1, pVar.a().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f220b) {
            this.f221c.execute(runnable);
        }
    }
}
