package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ic1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc1 f39493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m90 f39494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(mc1 mc1Var, m90 m90Var, mj.a aVar) {
        super(2, aVar);
        this.f39493c = mc1Var;
        this.f39494d = m90Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new ic1(this.f39493c, this.f39494d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ic1(this.f39493c, this.f39494d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f39492b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            jk.g gVar = this.f39493c.f40872o;
            m90 m90Var = this.f39494d;
            this.f39492b = 1;
            if (gVar.c(m90Var, this) == aVar) {
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
