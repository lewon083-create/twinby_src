package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nz1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oz1 f41396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v9 f41397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12 f41398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zz1 f41399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz1 f41400f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz1(oz1 oz1Var, v9 v9Var, f12 f12Var, zz1 zz1Var, jz1 jz1Var, mj.a aVar) {
        super(2, aVar);
        this.f41396b = oz1Var;
        this.f41397c = v9Var;
        this.f41398d = f12Var;
        this.f41399e = zz1Var;
        this.f41400f = jz1Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new nz1(this.f41396b, this.f41397c, this.f41398d, this.f41399e, this.f41400f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nz1) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        new mz1(this.f41396b, this.f41397c, this.f41398d, this.f41399e, this.f41400f, new cq2()).run();
        return Unit.f27471a;
    }
}
