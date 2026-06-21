package aj;

import android.content.Context;
import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f1028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f1029n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1030o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, e0 e0Var, boolean z5, mj.a aVar) {
        super(2, aVar);
        this.f1028m = str;
        this.f1029n = e0Var;
        this.f1030o = z5;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new y(this.f1028m, this.f1029n, this.f1030o, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f1027l;
        if (i == 0) {
            h5.E(obj);
            t2.e eVarB = ya.e.b(this.f1028m);
            Context context = this.f1029n.f952b;
            if (context == null) {
                Intrinsics.g("context");
                throw null;
            }
            p2.h hVarA = f0.a(context);
            x xVar = new x(eVarB, this.f1030o, null);
            this.f1027l = 1;
            if (a.a.e(hVarA, xVar, this) == aVar) {
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
