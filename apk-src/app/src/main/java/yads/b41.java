package yads;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b41 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e41 f36916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set f36917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(e41 e41Var, Set set, mj.a aVar) {
        super(2, aVar);
        this.f36916d = e41Var;
        this.f36917e = set;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        b41 b41Var = new b41(this.f36916d, this.f36917e, aVar);
        b41Var.f36915c = obj;
        return b41Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b41) create((jk.q) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f36914b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            jk.q qVar = (jk.q) this.f36915c;
            this.f36916d.a(this.f36917e, new a41(qVar));
            this.f36914b = 1;
            if (jk.j.b(qVar, new aj.e(5), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
        }
        return Unit.f27471a;
    }
}
