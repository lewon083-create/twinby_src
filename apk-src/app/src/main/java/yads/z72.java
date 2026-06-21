package yads;

import hk.c1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z72 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f45272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f45273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82 f45274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z72(a82 a82Var, List list, mj.a aVar) {
        super(2, aVar);
        this.f45273d = list;
        this.f45274e = a82Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        z72 z72Var = new z72(this.f45274e, this.f45273d, aVar);
        z72Var.f45272c = obj;
        return z72Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z72) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        c1 c1VarB;
        nj.a aVar = nj.a.f29512b;
        int i = this.f45271b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            hk.a0 a0Var = (hk.a0) this.f45272c;
            List<me3> list = this.f45273d;
            a82 a82Var = this.f45274e;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
            for (me3 me3Var : list) {
                if (me3Var.f40900b.f44649a) {
                    c1VarB = hk.c0.b(a0Var, new y72(a82Var, me3Var, null), 3);
                } else {
                    List listC = kotlin.collections.r.c(me3Var);
                    hk.r rVar = new hk.r();
                    rVar.H(listC);
                    c1VarB = rVar;
                }
                arrayList.add(c1VarB);
            }
            this.f45271b = 1;
            obj = hk.c0.c(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
        }
        return kotlin.collections.t.k((Iterable) obj);
    }
}
