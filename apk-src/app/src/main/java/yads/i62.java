package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i62 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k62 f39449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f39450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9 f39451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty1 f39452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z30 f39453g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i62(k62 k62Var, Context context, v9 v9Var, ty1 ty1Var, z30 z30Var, mj.a aVar) {
        super(2, aVar);
        this.f39449c = k62Var;
        this.f39450d = context;
        this.f39451e = v9Var;
        this.f39452f = ty1Var;
        this.f39453g = z30Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new i62(this.f39449c, this.f39450d, this.f39451e, this.f39452f, this.f39453g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i62) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f39448b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            k62 k62Var = this.f39449c;
            Context context = this.f39450d;
            v9 v9Var = this.f39451e;
            ty1 ty1Var = this.f39452f;
            z30 z30Var = this.f39453g;
            this.f39448b = 1;
            if (k62Var.a(context, v9Var, ty1Var, z30Var, this) == aVar) {
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
