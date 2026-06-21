package g2;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends oj.h implements Function2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f19919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ View f19920o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(View view, mj.a aVar) {
        super(2, aVar);
        this.f19920o = view;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        s0 s0Var = new s0(this.f19920o, aVar);
        s0Var.f19919n = obj;
        return s0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((ek.l) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f19918m;
        if (i == 0) {
            h5.E(obj);
            ek.l lVar = (ek.l) this.f19919n;
            View view = this.f19920o;
            this.f19919n = lVar;
            this.f19918m = 1;
            lVar.a(view, this);
            return aVar;
        }
        if (i == 1) {
            ek.l lVar2 = (ek.l) this.f19919n;
            h5.E(obj);
            View view2 = this.f19920o;
            if (view2 instanceof ViewGroup) {
                this.f19919n = null;
                this.f19918m = 2;
                lVar2.getClass();
                Object objB = lVar2.b(new ek.x(new r0((ViewGroup) view2)), this);
                if (objB != aVar) {
                    objB = Unit.f27471a;
                }
                if (objB == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h5.E(obj);
        }
        return Unit.f27471a;
    }
}
