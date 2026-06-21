package ok;

import hk.v0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f30726d;

    @Override // hk.x
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        c cVar = this.f30726d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.i;
        cVar.b(runnable, false);
    }
}
