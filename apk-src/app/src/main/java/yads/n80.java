package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n80 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b80 f41185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c80 f41186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o80 f41188e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n80(o80 o80Var, mj.a aVar) {
        super(2, aVar);
        this.f41188e = o80Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new n80(this.f41188e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new n80(this.f41188e, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b80 b80VarA;
        c80 c80Var;
        Object obj2;
        List list;
        nj.a aVar = nj.a.f29512b;
        int i = this.f41187d;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            b80VarA = this.f41188e.f41487a.a();
            c80 c80Var2 = b80VarA.f36959f;
            if (c80Var2 == null) {
                return a71.f36645a;
            }
            en2 en2Var = this.f41188e.f41488b;
            this.f41185b = b80VarA;
            this.f41186c = c80Var2;
            this.f41187d = 1;
            Object objA = en2Var.a(this);
            if (objA == aVar) {
                return aVar;
            }
            c80Var = c80Var2;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c80Var = this.f41186c;
            b80VarA = this.f41185b;
            com.google.android.gms.internal.measurement.h5.E(obj);
            obj2 = ((ij.m) obj).f21342b;
        }
        ij.k kVar = ij.m.f21341c;
        if (obj2 instanceof ij.l) {
            obj2 = null;
        }
        j80 j80Var = (j80) obj2;
        if (j80Var == null || (list = j80Var.f39775g) == null) {
            list = kotlin.collections.b0.f27475b;
        }
        List list2 = b80VarA.f36956c;
        ArrayList arrayListA = this.f41188e.f41489c.a(list);
        return this.f41188e.f41491e.a(this.f41188e.f41490d.a(new m80(b80VarA.f36954a, b80VarA.f36955b, arrayListA.isEmpty() ? list2 : arrayListA, b80VarA.f36957d, c80Var.f37307a, c80Var.f37308b)));
    }
}
