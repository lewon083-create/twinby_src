package k0;

import i0.o;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class d implements ed.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ed.d f26763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j1.h f26764c;

    public d(ed.d dVar) {
        dVar.getClass();
        this.f26763b = dVar;
    }

    public static d b(ed.d dVar) {
        return dVar instanceof d ? (d) dVar : new d(dVar);
    }

    @Override // ed.d
    public final void a(Runnable runnable, Executor executor) {
        this.f26763b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z5) {
        return this.f26763b.cancel(z5);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f26763b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26763b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26763b.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f26763b.get(j10, timeUnit);
    }

    public d() {
        this.f26763b = o.w(new fe.c(25, this));
    }
}
