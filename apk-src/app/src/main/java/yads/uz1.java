package yads;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uz1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vz1 f43808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f43809d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz1(vz1 vz1Var, View view, mj.a aVar) {
        super(2, aVar);
        this.f43808c = vz1Var;
        this.f43809d = view;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new uz1(this.f43808c, this.f43809d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new uz1(this.f43808c, this.f43809d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        nj.a aVar = nj.a.f29512b;
        int i = this.f43807b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            vz1 vz1Var = this.f43808c;
            y3 y3Var = vz1Var.f44231b;
            View view = this.f43809d;
            oi oiVar = vz1Var.f44230a;
            kf1 kf1Var = vz1Var.f44234e;
            n12 n12Var = vz1Var.f44232c;
            this.f43807b = 1;
            x3 x3Var = (x3) y3Var;
            f1 f1Var = x3Var.f44583d.f44535b;
            e1 e1Var = new e1(f1Var.f38318e, f1Var.f38314a, f1Var.f38315b, f1Var.f38316c, f1Var.f38317d, kf1Var.f40182b);
            f1Var.f38319f = e1Var;
            k22 k22Var = f1Var.f38320g;
            if (k22Var != null) {
                f1Var.f38320g = k22Var;
                e1Var.f37953b.f39402k = k22Var;
            }
            Context context = view.getContext();
            z9 z9Var = x3Var.i.f42809a;
            bz1 bz1Var = x3Var.f44586g;
            lv lvVar = new lv(bz1Var.f37224c, bz1Var.f37222a, new cz1(oiVar.f41540a, bz1Var.f37226e, n12Var.f41134b), ((lu3) bz1Var.f37223b).a(), new sx(), new we(bz1Var.f37225d));
            s53 s53Var = x3Var.f44584e;
            nu2 nu2Var = x3Var.f44580a;
            d4 d4Var = x3Var.f44582c;
            v9 v9Var = x3Var.f44581b;
            s53Var.getClass();
            pt2 pt2VarA = fw2.a().a(context);
            if (pt2VarA != null) {
                boolean z5 = pt2VarA.f42028f;
            }
            eb0 eb0Var = new eb0(context, d4Var, v9Var, z9Var, new p2(nu2Var), lm0.a(context));
            za zaVar = x3Var.f44585f;
            n42 n42Var = new n42(zaVar, eb0Var);
            objA = x3Var.a(view, kf1Var, new v0(new p0(x3Var.f44582c, x3Var.f44580a, x3Var.f44581b, lvVar, n42Var, n12Var, x3Var.f44583d, x3Var.f44587h)), new m42(zaVar, eb0Var, lvVar), this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            objA = obj;
        }
        if (((p01) objA).f41793a) {
            this.f43808c.f44235f.a();
        }
        return Unit.f27471a;
    }
}
