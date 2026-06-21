package ok;

import hk.v0;
import hk.x;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import mk.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends v0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f30722d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f30723e;

    static {
        l lVar = l.f30736d;
        int i = t.f28940a;
        if (64 >= i) {
            i = 64;
        }
        f30723e = lVar.l(mk.a.i(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j(kotlin.coroutines.g.f27499b, runnable);
    }

    @Override // hk.x
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        f30723e.j(coroutineContext, runnable);
    }

    @Override // hk.x
    public final String toString() {
        return "Dispatchers.IO";
    }
}
