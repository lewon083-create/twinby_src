package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a42 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kk.e f36628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi2 f36629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a42(kk.e eVar, oi2 oi2Var, mj.a aVar) {
        super(2, aVar);
        this.f36628c = eVar;
        this.f36629d = oi2Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new a42(this.f36628c, this.f36629d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a42(this.f36628c, this.f36629d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f36627b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            kk.e eVar = this.f36628c;
            z32 z32Var = new z32(this.f36629d);
            this.f36627b = 1;
            if (eVar.p(z32Var, this) == aVar) {
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
