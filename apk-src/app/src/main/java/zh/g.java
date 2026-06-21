package zh;

import a0.z;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import t.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f46288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f46289b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f46290c = new AtomicBoolean(false);

    public g(ExecutorService executorService) {
        this.f46288a = executorService;
    }

    @Override // zh.d
    public final void a(z zVar) {
        this.f46289b.add(zVar);
        this.f46288a.execute(new a0(18, this));
    }
}
