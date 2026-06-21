package lk;

import com.google.android.gms.internal.ads.cx0;
import hk.u;
import hk.v;
import jk.q;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kk.e f28135e;

    public c(kk.e eVar, CoroutineContext coroutineContext, int i, jk.a aVar) {
        super(coroutineContext, i, aVar);
        this.f28135e = eVar;
    }

    @Override // lk.b
    public final Object b(q qVar, mj.a aVar) {
        Object objP = this.f28135e.p(new l(qVar), aVar);
        nj.a aVar2 = nj.a.f29512b;
        if (objP != aVar2) {
            objP = Unit.f27471a;
        }
        return objP == aVar2 ? objP : Unit.f27471a;
    }

    @Override // lk.b
    public final b c(CoroutineContext coroutineContext, int i, jk.a aVar) {
        return new c(this.f28135e, coroutineContext, i, aVar);
    }

    @Override // lk.b, kk.e
    public final Object p(kk.f fVar, mj.a aVar) throws Throwable {
        if (this.f28133c == -3) {
            CoroutineContext context = aVar.getContext();
            Boolean bool = Boolean.FALSE;
            u uVar = new u(0);
            CoroutineContext coroutineContext = this.f28132b;
            CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(bool, uVar)).booleanValue() ? context.plus(coroutineContext) : v.a(context, coroutineContext, false);
            if (Intrinsics.a(coroutineContextPlus, context)) {
                Object objP = this.f28135e.p(fVar, aVar);
                nj.a aVar2 = nj.a.f29512b;
                if (objP != aVar2) {
                    objP = Unit.f27471a;
                }
                return objP == aVar2 ? objP : Unit.f27471a;
            }
            mj.b bVar = kotlin.coroutines.d.R1;
            if (Intrinsics.a(coroutineContextPlus.get(bVar), context.get(bVar))) {
                CoroutineContext context2 = aVar.getContext();
                if (!(fVar instanceof l)) {
                    fVar = new aj.q(fVar, context2);
                }
                Object objB = g.b(coroutineContextPlus, fVar, mk.u.b(coroutineContextPlus), new cx0(this, (mj.a) null, 5), aVar);
                return objB == nj.a.f29512b ? objB : Unit.f27471a;
            }
        }
        Object objP2 = super.p(fVar, aVar);
        return objP2 == nj.a.f29512b ? objP2 : Unit.f27471a;
    }

    @Override // lk.b
    public final String toString() {
        return this.f28135e + " -> " + super.toString();
    }
}
