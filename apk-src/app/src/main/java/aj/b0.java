package aj;

import android.content.Context;
import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ double f939o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(String str, e0 e0Var, double d10, mj.a aVar) {
        super(2, aVar);
        this.f937m = str;
        this.f938n = e0Var;
        this.f939o = d10;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new b0(this.f937m, this.f938n, this.f939o, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f936l;
        if (i == 0) {
            h5.E(obj);
            String name = this.f937m;
            Intrinsics.checkNotNullParameter(name, "name");
            t2.e eVar = new t2.e(name);
            Context context = this.f938n.f952b;
            if (context == null) {
                Intrinsics.g("context");
                throw null;
            }
            p2.h hVarA = f0.a(context);
            a0 a0Var = new a0(eVar, this.f939o, null);
            this.f936l = 1;
            if (a.a.e(hVarA, a0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h5.E(obj);
        }
        return Unit.f27471a;
    }
}
