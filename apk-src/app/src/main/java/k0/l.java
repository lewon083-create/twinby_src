package k0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class l implements ed.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f26777d = new l(0, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26779c;

    public /* synthetic */ l(int i, Object obj) {
        this.f26778b = i;
        this.f26779c = obj;
    }

    @Override // ed.d
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            com.google.android.gms.internal.auth.g.l("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e3);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        switch (this.f26778b) {
            case 0:
                return this.f26779c;
            default:
                throw new ExecutionException((Throwable) this.f26779c);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.f26778b) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.f26779c + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.f26779c) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
