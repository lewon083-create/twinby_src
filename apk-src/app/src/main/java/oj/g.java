package oj;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends a {
    public g(mj.a aVar) {
        super(aVar);
        if (aVar != null && aVar.getContext() != kotlin.coroutines.g.f27499b) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // mj.a
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f27499b;
    }
}
