package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i42 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l42 f39434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f39435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty1 f39436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z30 f39437f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i42(l42 l42Var, Context context, ty1 ty1Var, z30 z30Var, mj.a aVar) {
        super(2, aVar);
        this.f39434c = l42Var;
        this.f39435d = context;
        this.f39436e = ty1Var;
        this.f39437f = z30Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new i42(this.f39434c, this.f39435d, this.f39436e, this.f39437f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i42) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f39433b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            return obj;
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        k62 k62Var = this.f39434c.f40424c;
        Context context = this.f39435d;
        ty1 ty1Var = this.f39436e;
        z30 z30Var = this.f39437f;
        this.f39433b = 1;
        Object objA = k62Var.a(true, context, ty1Var, z30Var, (mj.a) this);
        return objA == aVar ? aVar : objA;
    }
}
