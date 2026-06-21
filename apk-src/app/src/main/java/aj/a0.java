package aj;

import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t2.e f932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ double f933n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(t2.e eVar, double d10, mj.a aVar) {
        super(2, aVar);
        this.f932m = eVar;
        this.f933n = d10;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        a0 a0Var = new a0(this.f932m, this.f933n, aVar);
        a0Var.f931l = obj;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((t2.b) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        h5.E(obj);
        ((t2.b) this.f931l).e(this.f932m, new Double(this.f933n));
        return Unit.f27471a;
    }
}
