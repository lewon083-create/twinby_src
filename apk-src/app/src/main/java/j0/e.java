package j0;

import android.os.Handler;
import d2.k;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import ob.i1;
import ob.k2;
import ob.l1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile e f26130d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26132c;

    public /* synthetic */ e(int i, Object obj) {
        this.f26131b = i;
        this.f26132c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f26131b) {
            case 0:
                ((ExecutorService) this.f26132c).execute(runnable);
                return;
            case 1:
                Handler handler = (Handler) this.f26132c;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 2:
                i1 i1Var = ((l1) ((k2) this.f26132c).f15951b).f30266h;
                l1.k(i1Var);
                i1Var.L(runnable);
                return;
            default:
                ((Handler) ((x7.b) this.f26132c).f35978c).post(runnable);
                return;
        }
    }

    public e() {
        this.f26131b = 0;
        this.f26132c = Executors.newSingleThreadExecutor(new k(1));
    }
}
