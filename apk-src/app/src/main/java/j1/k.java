package j1;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ed.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f26172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f26173c = new j(this);

    public k(h hVar) {
        this.f26172b = new WeakReference(hVar);
    }

    @Override // ed.d
    public final void a(Runnable runnable, Executor executor) {
        this.f26173c.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        h hVar = (h) this.f26172b.get();
        boolean zCancel = this.f26173c.cancel(z5);
        if (zCancel && hVar != null) {
            hVar.f26168a = null;
            hVar.f26169b = null;
            hVar.f26170c.k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f26173c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26173c.f26165b instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26173c.isDone();
    }

    public final String toString() {
        return this.f26173c.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f26173c.get(j10, timeUnit);
    }
}
