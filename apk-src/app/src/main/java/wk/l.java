package wk;

import com.google.android.gms.internal.measurement.h5;
import d8.e0;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends oj.h implements wj.n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ ij.b f35291n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e0 f35292o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e0 e0Var, mj.a aVar) {
        super(3, aVar);
        this.f35292o = e0Var;
    }

    @Override // wj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l lVar = new l(this.f35292o, (mj.a) obj3);
        lVar.f35291n = (ij.b) obj;
        return lVar.invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        e0 e0Var = this.f35292o;
        d1.b bVar = (d1.b) e0Var.f15621d;
        nj.a aVar = nj.a.f29512b;
        int i = this.f35290m;
        if (i == 0) {
            h5.E(obj);
            ij.b bVar2 = this.f35291n;
            byte bW = bVar.w();
            if (bW == 1) {
                return e0Var.m(true);
            }
            if (bW == 0) {
                return e0Var.m(false);
            }
            if (bW != 6) {
                if (bW == 8) {
                    return e0Var.j();
                }
                d1.b.q(bVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f35290m = 1;
            obj = e0.b(e0Var, bVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h5.E(obj);
        }
        return (vk.l) obj;
    }
}
