package p2;

import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends oj.i implements wj.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f31046l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f31048n;

    public /* synthetic */ q(int i, mj.a aVar) {
        super(i, aVar);
    }

    @Override // wj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f31046l) {
            case 0:
                return new q((e0) this.f31048n, (mj.a) obj3).invokeSuspend(Unit.f27471a);
            default:
                ((Boolean) obj2).getClass();
                q qVar = new q(3, (mj.a) obj3);
                qVar.f31048n = (g0) obj;
                return qVar.invokeSuspend(Unit.f27471a);
        }
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f31046l) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                int i = this.f31047m;
                if (i == 0) {
                    h5.E(obj);
                    e0 e0Var = (e0) this.f31048n;
                    this.f31047m = 1;
                    if (e0.b(e0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                }
                return Unit.f27471a;
            default:
                nj.a aVar2 = nj.a.f29512b;
                int i10 = this.f31047m;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                    return obj;
                }
                h5.E(obj);
                g0 g0Var = (g0) this.f31048n;
                this.f31047m = 1;
                g0Var.getClass();
                Object objA = g0.a(g0Var, this);
                return objA == aVar2 ? aVar2 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e0 e0Var, mj.a aVar) {
        super(3, aVar);
        this.f31048n = e0Var;
    }
}
