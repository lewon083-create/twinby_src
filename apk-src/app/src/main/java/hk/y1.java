package hk;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y1 extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f20729d = 0;

    static {
        new y1();
    }

    @Override // hk.x
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        if (coroutineContext.get(c2.f20650c) != null) {
            throw new ClassCastException();
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // hk.x
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
