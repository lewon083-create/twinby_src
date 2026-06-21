package hk;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z1 extends mk.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadLocal f20731f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public z1(CoroutineContext coroutineContext, mj.a aVar) {
        a2 a2Var = a2.f20631b;
        super(coroutineContext.get(a2Var) == null ? coroutineContext.plus(a2Var) : coroutineContext, aVar);
        this.f20731f = new ThreadLocal();
        if (aVar.getContext().get(kotlin.coroutines.d.R1) instanceof x) {
            return;
        }
        Object objC = mk.u.c(coroutineContext, null);
        mk.u.a(coroutineContext, objC);
        Y(coroutineContext, objC);
    }

    public final boolean X() {
        boolean z5 = this.threadLocalIsSet && this.f20731f.get() == null;
        this.f20731f.remove();
        return !z5;
    }

    public final void Y(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f20731f.set(new Pair(coroutineContext, obj));
    }

    @Override // mk.q, hk.k1
    public final void l(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f20731f.get();
            if (pair != null) {
                mk.u.a((CoroutineContext) pair.f27469b, pair.f27470c);
            }
            this.f20731f.remove();
        }
        Object objN = c0.n(obj);
        mj.a aVar = this.f28936e;
        CoroutineContext context = aVar.getContext();
        Object objC = mk.u.c(context, null);
        z1 z1VarC = objC != mk.u.f28941a ? v.c(aVar, context, objC) : null;
        try {
            this.f28936e.resumeWith(objN);
            Unit unit = Unit.f27471a;
            if (z1VarC == null || z1VarC.X()) {
                mk.u.a(context, objC);
            }
        } catch (Throwable th2) {
            if (z1VarC == null || z1VarC.X()) {
                mk.u.a(context, objC);
            }
            throw th2;
        }
    }
}
