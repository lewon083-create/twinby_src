package j0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f26140c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f26139b = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ac.g f26141d = new ac.g(11, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26142e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26143f = 0;

    public i(Executor executor) {
        executor.getClass();
        this.f26140c = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f26139b) {
            int i = this.f26142e;
            if (i != 4 && i != 3) {
                long j10 = this.f26143f;
                h hVar = new h(0, runnable);
                this.f26139b.add(hVar);
                this.f26142e = 2;
                try {
                    this.f26140c.execute(this.f26141d);
                    if (this.f26142e != 2) {
                        return;
                    }
                    synchronized (this.f26139b) {
                        try {
                            if (this.f26143f == j10 && this.f26142e == 2) {
                                this.f26142e = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e3) {
                    synchronized (this.f26139b) {
                        try {
                            int i10 = this.f26142e;
                            boolean z5 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f26139b.removeLastOccurrence(hVar)) {
                                z5 = false;
                            }
                            if (!(e3 instanceof RejectedExecutionException) || z5) {
                                throw e3;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f26139b.add(runnable);
        }
    }
}
