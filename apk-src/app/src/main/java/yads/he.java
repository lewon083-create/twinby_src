package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class he extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ie f39137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(ie ieVar, mj.a aVar) {
        super(2, aVar);
        this.f39137c = ieVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new he(this.f39137c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new he(this.f39137c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f39136b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            ie ieVar = this.f39137c;
            this.f39136b = 1;
            obj = hk.c0.t(ieVar.f39511a, new ge(ieVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
        }
        vd vdVar = (vd) obj;
        return (vdVar.f43997a == null && vdVar.f43998b == null) ? je.f39842a : new ke(vdVar);
    }
}
