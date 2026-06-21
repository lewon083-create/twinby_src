package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wd extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd f44339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(yd ydVar, mj.a aVar) {
        super(2, aVar);
        this.f44339c = ydVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new wd(this.f44339c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new wd(this.f44339c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f44338b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            return obj;
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        ie ieVar = this.f44339c.f45008a;
        this.f44338b = 1;
        Object objT = hk.c0.t(ieVar.f39511a, new he(ieVar, null), this);
        return objT == aVar ? aVar : objT;
    }
}
