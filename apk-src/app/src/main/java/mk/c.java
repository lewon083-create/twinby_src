package mk;

import hk.a0;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f28909b;

    public c(CoroutineContext coroutineContext) {
        this.f28909b = coroutineContext;
    }

    @Override // hk.a0
    public final CoroutineContext e() {
        return this.f28909b;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f28909b + ')';
    }
}
