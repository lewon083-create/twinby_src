package nd;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f29321g = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f29322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f29323c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29324d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f29325e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ed.c f29326f = new ed.c(this);

    public j(Executor executor) {
        c0.i(executor);
        this.f29322b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c0.i(runnable);
        synchronized (this.f29323c) {
            int i = this.f29324d;
            if (i != 4 && i != 3) {
                long j10 = this.f29325e;
                j0.h hVar = new j0.h(1, runnable);
                this.f29323c.add(hVar);
                this.f29324d = 2;
                try {
                    this.f29322b.execute(this.f29326f);
                    if (this.f29324d != 2) {
                        return;
                    }
                    synchronized (this.f29323c) {
                        try {
                            if (this.f29325e == j10 && this.f29324d == 2) {
                                this.f29324d = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e3) {
                    synchronized (this.f29323c) {
                        try {
                            int i10 = this.f29324d;
                            boolean z5 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f29323c.removeLastOccurrence(hVar)) {
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
            this.f29323c.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f29322b + "}";
    }
}
