package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w72 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd3 f44297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd3 f44299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82 f44300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w72(vd3 vd3Var, a82 a82Var, mj.a aVar) {
        super(2, aVar);
        this.f44299d = vd3Var;
        this.f44300e = a82Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new w72(this.f44299d, this.f44300e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w72(this.f44299d, this.f44300e, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        vd3 vd3Var;
        nj.a aVar = nj.a.f29512b;
        int i = this.f44298c;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            vd3 vd3Var2 = this.f44299d;
            if (vd3Var2 == null) {
                return null;
            }
            a82 a82Var = this.f44300e;
            List list = vd3Var2.f44002a;
            this.f44297b = vd3Var2;
            this.f44298c = 1;
            a82Var.getClass();
            ok.e eVar = hk.k0.f20682a;
            Object objT = hk.c0.t(ok.d.f30722d, new z72(a82Var, list, null), this);
            if (objT == aVar) {
                return aVar;
            }
            vd3Var = vd3Var2;
            obj = objT;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vd3Var = this.f44297b;
            com.google.android.gms.internal.measurement.h5.E(obj);
        }
        List list2 = (List) obj;
        if (list2.isEmpty()) {
            throw new b12("Invalid VAST in response");
        }
        return new vd3(list2, vd3Var.f44003b, vd3Var.f44004c);
    }
}
