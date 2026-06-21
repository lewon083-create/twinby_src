package aj;

import android.content.Context;
import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f949n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f950o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String str, e0 e0Var, long j10, mj.a aVar) {
        super(2, aVar);
        this.f948m = str;
        this.f949n = e0Var;
        this.f950o = j10;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new d0(this.f948m, this.f949n, this.f950o, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f947l;
        if (i == 0) {
            h5.E(obj);
            t2.e eVarR = ya.e.r(this.f948m);
            Context context = this.f949n.f952b;
            if (context == null) {
                Intrinsics.g("context");
                throw null;
            }
            p2.h hVarA = f0.a(context);
            c0 c0Var = new c0(eVarR, this.f950o, null);
            this.f947l = 1;
            if (a.a.e(hVarA, c0Var, this) == aVar) {
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
