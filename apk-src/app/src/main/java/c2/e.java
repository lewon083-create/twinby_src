package c2;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f2196c;

    public /* synthetic */ e(Handler handler, int i) {
        this.f2195b = i;
        this.f2196c = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2195b) {
            case 0:
                runnable.getClass();
                Handler handler = this.f2196c;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                this.f2196c.post(runnable);
                return;
        }
    }
}
