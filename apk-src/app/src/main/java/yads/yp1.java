package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yp1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f45138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f45139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sq1 f45140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, sq1 sq1Var, mj.a aVar2) {
        super(2, aVar2);
        this.f45138c = aVar;
        this.f45139d = context;
        this.f45140e = sq1Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new yp1(this.f45138c, this.f45139d, this.f45140e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yp1) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f45137b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            com.monetization.ads.mediation.base.initialize.a aVar2 = this.f45138c;
            Context context = this.f45139d;
            sq1 sq1Var = this.f45140e;
            this.f45137b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f15069g;
            if (aVar2.a(context, sq1Var, this) == aVar) {
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
