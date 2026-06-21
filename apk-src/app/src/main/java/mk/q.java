package mk;

import hk.c0;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class q extends hk.a implements oj.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mj.a f28936e;

    public q(CoroutineContext coroutineContext, mj.a aVar) {
        super(coroutineContext, true);
        this.f28936e = aVar;
    }

    @Override // hk.k1
    public final boolean F() {
        return true;
    }

    @Override // oj.d
    public final oj.d getCallerFrame() {
        mj.a aVar = this.f28936e;
        if (aVar instanceof oj.d) {
            return (oj.d) aVar;
        }
        return null;
    }

    @Override // hk.k1
    public void k(Object obj) {
        a.g(c0.n(obj), nj.f.b(this.f28936e));
    }

    @Override // hk.k1
    public void l(Object obj) {
        this.f28936e.resumeWith(c0.n(obj));
    }
}
