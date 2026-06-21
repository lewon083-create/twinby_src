package aj;

import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t2.e f943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f944n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t2.e eVar, long j10, mj.a aVar) {
        super(2, aVar);
        this.f943m = eVar;
        this.f944n = j10;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        c0 c0Var = new c0(this.f943m, this.f944n, aVar);
        c0Var.f942l = obj;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((t2.b) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        h5.E(obj);
        ((t2.b) this.f942l).e(this.f943m, new Long(this.f944n));
        return Unit.f27471a;
    }
}
