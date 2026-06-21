package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d10 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g10 f37588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g9 f37589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(g10 g10Var, g9 g9Var, mj.a aVar) {
        super(2, aVar);
        this.f37588b = g10Var;
        this.f37589c = g9Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new d10(this.f37588b, this.f37589c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d10(this.f37588b, this.f37589c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        g10 g10Var = this.f37588b;
        d12 d12Var = new d12(g10Var.f38615b, ((lu3) g10Var.f38614a).a());
        q02 q02Var = this.f37588b.f38617d;
        g9 g9Var = this.f37589c;
        x42 x42Var = x42.f44598c;
        q02Var.getClass();
        r02 r02Var = new r02(q02Var.f42126a, q02Var.f42127b, new c12(g9Var, x42Var, d12Var, 1), q02Var, q02Var.f42128c, 464);
        q02Var.f42129d.add(r02Var);
        c10 c10Var = q02Var.f42131f;
        x02 x02Var = r02Var.f42438b.f41423x;
        x02Var.f44561d = c10Var;
        x02Var.f44560c.a(c10Var, null, null);
        r02Var.a();
        return Unit.f27471a;
    }
}
