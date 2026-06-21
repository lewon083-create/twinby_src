package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hf extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hk.q f39149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(hk.q qVar, mj.a aVar) {
        super(2, aVar);
        this.f39149c = qVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new hf(this.f39149c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new hf(this.f39149c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f39148b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            hk.q qVar = this.f39149c;
            this.f39148b = 1;
            if (((hk.r) qVar).m(this) == aVar) {
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
