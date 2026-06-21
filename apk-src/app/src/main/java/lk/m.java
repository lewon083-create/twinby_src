package lk;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements mj.a, oj.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj.a f28150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineContext f28151c;

    public m(CoroutineContext coroutineContext, mj.a aVar) {
        this.f28150b = aVar;
        this.f28151c = coroutineContext;
    }

    @Override // oj.d
    public final oj.d getCallerFrame() {
        mj.a aVar = this.f28150b;
        if (aVar instanceof oj.d) {
            return (oj.d) aVar;
        }
        return null;
    }

    @Override // mj.a
    public final CoroutineContext getContext() {
        return this.f28151c;
    }

    @Override // mj.a
    public final void resumeWith(Object obj) {
        this.f28150b.resumeWith(obj);
    }
}
