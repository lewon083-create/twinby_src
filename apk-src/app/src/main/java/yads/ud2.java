package yads;

import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ud2 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd2 f43632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud2(wd2 wd2Var, mj.a aVar) {
        super(2, aVar);
        this.f43632c = wd2Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new ud2(this.f43632c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ud2(this.f43632c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f43631b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            return obj;
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        wd2 wd2Var = this.f43632c;
        this.f43631b = 1;
        hk.l lVar = new hk.l(1, nj.f.b(this));
        lVar.t();
        try {
            Task taskB = new a1.e(wd2Var.f44340a.getApplicationContext()).b();
            final sd2 sd2Var = new sd2(lVar);
            sb.m mVar = (sb.m) taskB;
            mVar.d(sb.h.f32859a, new sb.d() { // from class: yads.vd2
                @Override // sb.d
                public final /* synthetic */ void onSuccess(Object obj2) {
                    sd2Var.invoke(obj2);
                }
            });
            mVar.k(new td2(lVar));
        } catch (Throwable unused) {
            lVar.g(null, null);
        }
        Object objS = lVar.s();
        if (objS == nj.a.f29512b) {
            Intrinsics.checkNotNullParameter(this, "frame");
        }
        return objS == aVar ? aVar : objS;
    }
}
