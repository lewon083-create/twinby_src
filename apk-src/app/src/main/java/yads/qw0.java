package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qw0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f42404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f42405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sw0 f42406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw0(List list, sw0 sw0Var, mj.a aVar) {
        super(2, aVar);
        this.f42405d = list;
        this.f42406e = sw0Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        qw0 qw0Var = new qw0(this.f42405d, this.f42406e, aVar);
        qw0Var.f42404c = obj;
        return qw0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qw0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f42403b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            return obj;
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        hk.a0 a0Var = (hk.a0) this.f42404c;
        List list = this.f42405d;
        sw0 sw0Var = this.f42406e;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(hk.c0.b(a0Var, new pw0(sw0Var, (fn2) it.next(), null), 3));
        }
        this.f42403b = 1;
        Object objC = hk.c0.c(arrayList, this);
        return objC == aVar ? aVar : objC;
    }
}
