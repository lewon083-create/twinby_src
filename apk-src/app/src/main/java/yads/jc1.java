package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jc1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc1 f39824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(mc1 mc1Var, mj.a aVar) {
        super(2, aVar);
        this.f39824c = mc1Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new jc1(this.f39824c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new jc1(this.f39824c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        m90 j90Var;
        nj.a aVar = nj.a.f29512b;
        int i = this.f39823b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            jz0 jz0Var = this.f39824c.f40860b;
            this.f39823b = 1;
            o80 o80Var = jz0Var.f40023a;
            obj = hk.c0.t(o80Var.f41492f, new n80(o80Var, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
        }
        c71 c71Var = (c71) obj;
        if (c71Var instanceof b71) {
            j90Var = new k90(((b71) c71Var).f36948a);
        } else if (c71Var instanceof z61) {
            j90Var = new j90(((z61) c71Var).f45268a);
        } else {
            if (!(c71Var instanceof a71)) {
                throw new ij.j();
            }
            j90Var = i90.f39465a;
        }
        mc1 mc1Var = this.f39824c;
        hk.c0.m(mc1Var.f40859a, null, new ic1(mc1Var, j90Var, null), 3);
        return Unit.f27471a;
    }
}
