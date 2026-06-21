package v7;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import ob.b3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f34771c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Runnable f34773e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f34770b = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34772d = new Object();

    public i(Executor executor) {
        this.f34771c = executor;
    }

    public final void a() {
        synchronized (this.f34772d) {
            try {
                Runnable runnable = (Runnable) this.f34770b.poll();
                this.f34773e = runnable;
                if (runnable != null) {
                    this.f34771c.execute(this.f34773e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f34772d) {
            try {
                this.f34770b.add(new b3(10, this, runnable, false));
                if (this.f34773e == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
