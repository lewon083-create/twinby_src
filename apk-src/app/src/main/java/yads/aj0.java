package yads;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class aj0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dj0 f36729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(dj0 dj0Var, mj.a aVar) {
        super(2, aVar);
        this.f36729c = dj0Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new aj0(this.f36729c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new aj0(this.f36729c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = nj.a.f29512b;
        int i = this.f36728b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            dj0 dj0Var = this.f36729c;
            AtomicBoolean atomicBoolean = dj0.f37779e;
            dj0Var.getClass();
            jj.e eVarB = kotlin.collections.r.b();
            String strA = bb3.a(dj0Var.f37782c.a(dj0Var.f37781b));
            if (strA != null) {
                eVarB.add(strA);
            }
            jj.e eVarA = kotlin.collections.r.a(eVarB);
            if (eVarA.isEmpty()) {
                return Unit.f27471a;
            }
            dj0 dj0Var2 = this.f36729c;
            this.f36728b = 1;
            dj0Var2.getClass();
            Object objQ = hk.c0.q(new hk.w1(2500L, this), new cj0(dj0Var2, eVarA, null));
            if (objQ == obj2) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (objQ != obj2) {
                objQ = Unit.f27471a;
            }
            if (objQ == obj2) {
                return obj2;
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
