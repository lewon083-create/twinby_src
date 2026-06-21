package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cj0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f37407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj0 f37408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj0(dj0 dj0Var, List list, mj.a aVar) {
        super(2, aVar);
        this.f37407c = list;
        this.f37408d = dj0Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        cj0 cj0Var = new cj0(this.f37408d, this.f37407c, aVar);
        cj0Var.f37406b = obj;
        return cj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cj0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        hk.a0 a0Var = (hk.a0) this.f37406b;
        List list = this.f37407c;
        dj0 dj0Var = this.f37408d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hk.c0.m(a0Var, null, new bj0(dj0Var, (String) it.next(), null), 3);
        }
        return Unit.f27471a;
    }
}
