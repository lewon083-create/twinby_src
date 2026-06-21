package yads;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z82 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b92 f45277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f45278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d03 f45279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f45280f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z82(b92 b92Var, Context context, d03 d03Var, List list, mj.a aVar) {
        super(2, aVar);
        this.f45277c = b92Var;
        this.f45278d = context;
        this.f45279e = d03Var;
        this.f45280f = list;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new z82(this.f45277c, this.f45278d, this.f45279e, this.f45280f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z82) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f45276b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            return obj;
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        b92 b92Var = this.f45277c;
        Context context = this.f45278d;
        d03 d03Var = this.f45279e;
        List list = this.f45280f;
        this.f45276b = 1;
        Object objA = b92Var.a(context, d03Var, list, this);
        return objA == aVar ? aVar : objA;
    }
}
