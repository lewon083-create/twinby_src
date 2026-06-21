package n4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f29095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kf.a f29096c;

    public a(ExecutorService executorService, kf.a aVar) {
        this.f29095b = executorService;
        this.f29096c = aVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f29095b.execute(runnable);
    }
}
