package kk;

import hk.a0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends lk.b {
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jk.c f27413e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(d.class, "consumed$volatile");
    }

    public d(jk.c cVar, CoroutineContext coroutineContext, int i, jk.a aVar) {
        super(coroutineContext, i, aVar);
        this.f27413e = cVar;
        this.consumed$volatile = 0;
    }

    @Override // lk.b
    public final String a() {
        return "channel=" + this.f27413e;
    }

    @Override // lk.b
    public final Object b(jk.q qVar, mj.a aVar) {
        Object objB = u.b(new lk.l(qVar), this.f27413e, false, aVar);
        return objB == nj.a.f29512b ? objB : Unit.f27471a;
    }

    @Override // lk.b
    public final lk.b c(CoroutineContext coroutineContext, int i, jk.a aVar) {
        return new d(this.f27413e, coroutineContext, i, aVar);
    }

    @Override // lk.b
    public final jk.r d(a0 a0Var) {
        return this.f28133c == -3 ? this.f27413e : super.d(a0Var);
    }

    @Override // lk.b, kk.e
    public final Object p(f fVar, mj.a aVar) throws Throwable {
        if (this.f28133c == -3) {
            Object objB = u.b(fVar, this.f27413e, false, aVar);
            return objB == nj.a.f29512b ? objB : Unit.f27471a;
        }
        Object objP = super.p(fVar, aVar);
        return objP == nj.a.f29512b ? objP : Unit.f27471a;
    }
}
