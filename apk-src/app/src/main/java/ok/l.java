package ok;

import hk.x;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f30736d = new l();

    @Override // hk.x
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        e.f30724e.f30726d.b(runnable, true);
    }

    @Override // hk.x
    public final x l(int i) {
        mk.a.a(i);
        return i >= k.f30733d ? this : super.l(i);
    }

    @Override // hk.x
    public final String toString() {
        return "Dispatchers.IO";
    }
}
