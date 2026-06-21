package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kc1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc1 f40153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc1(mc1 mc1Var, String str, mj.a aVar) {
        super(2, aVar);
        this.f40153c = mc1Var;
        this.f40154d = str;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new kc1(this.f40153c, this.f40154d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new kc1(this.f40153c, this.f40154d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f40152b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            jk.g gVar = this.f40153c.f40872o;
            l90 l90Var = new l90(this.f40154d);
            this.f40152b = 1;
            if (gVar.c(l90Var, this) == aVar) {
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
