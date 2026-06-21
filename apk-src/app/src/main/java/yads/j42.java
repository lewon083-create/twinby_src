package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j42 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l42 f39724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f39725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty1 f39726e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j42(l42 l42Var, Context context, ty1 ty1Var, mj.a aVar) {
        super(2, aVar);
        this.f39724c = l42Var;
        this.f39725d = context;
        this.f39726e = ty1Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new j42(this.f39724c, this.f39725d, this.f39726e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j42) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f39723b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            u72 u72Var = this.f39724c.f40423b;
            Context context = this.f39725d;
            ty1 ty1Var = this.f39726e;
            this.f39723b = 1;
            if (u72Var.a(context, ty1Var, this) == aVar) {
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
