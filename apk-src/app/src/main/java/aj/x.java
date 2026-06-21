package aj;

import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t2.e f1025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1026n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t2.e eVar, boolean z5, mj.a aVar) {
        super(2, aVar);
        this.f1025m = eVar;
        this.f1026n = z5;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        x xVar = new x(this.f1025m, this.f1026n, aVar);
        xVar.f1024l = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((t2.b) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        h5.E(obj);
        ((t2.b) this.f1024l).e(this.f1025m, Boolean.valueOf(this.f1026n));
        return Unit.f27471a;
    }
}
