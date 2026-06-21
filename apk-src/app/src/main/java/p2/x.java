package p2;

import com.google.android.gms.internal.measurement.h5;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends oj.i implements Function1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f31099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f31101n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e0 e0Var, mj.a aVar) {
        super(1, aVar);
        this.f31101n = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new x(this.f31101n, (mj.a) obj).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th2;
        w0 q0Var;
        nj.a aVar = nj.a.f29512b;
        int i = this.f31100m;
        e0 e0Var = this.f31101n;
        try {
        } catch (Throwable th3) {
            v0 v0VarG = e0Var.g();
            this.f31099l = th3;
            this.f31100m = 2;
            Integer numA = v0VarG.a();
            if (numA != aVar) {
                th2 = th3;
                obj = numA;
            }
            return aVar;
        }
        if (i == 0) {
            h5.E(obj);
            this.f31100m = 1;
            obj = e0.f(e0Var, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = this.f31099l;
                h5.E(obj);
                q0Var = new q0(th2, ((Number) obj).intValue());
                return new Pair(q0Var, Boolean.TRUE);
            }
            h5.E(obj);
        }
        q0Var = (w0) obj;
        return new Pair(q0Var, Boolean.TRUE);
    }
}
