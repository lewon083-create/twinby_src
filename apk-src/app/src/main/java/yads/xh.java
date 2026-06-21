package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xh extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f44690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nu2 f44691c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(Context context, nu2 nu2Var, mj.a aVar) {
        super(2, aVar);
        this.f44690b = context;
        this.f44691c = nu2Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new xh(this.f44690b, this.f44691c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xh(this.f44690b, this.f44691c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        ka3.a(this.f44690b, ((lu3) this.f44691c).a());
        xf.a(this.f44690b, ((lu3) this.f44691c).a());
        AtomicBoolean atomicBoolean = ji.f39870a;
        ji.a(this.f44690b, ((lu3) this.f44691c).a());
        uh1 uh1Var = new uh1();
        Boolean boolA = uh1.a(this.f44690b);
        if (boolA != null) {
            vu1.b(boolA.booleanValue());
        }
        Boolean boolB = uh1.b(this.f44690b);
        if (boolB != null) {
            vu1.a(boolB.booleanValue());
        }
        if (ub.a(this.f44690b)) {
            bu1 bu1VarA = cu1.a(this.f44690b);
            if (bu1VarA instanceof au1) {
                nc1.a(new pc1().a((au1) bu1VarA), new Object[0]);
            } else if (bu1VarA instanceof zt1) {
                nc1.b("Yandex Mobile Ads 7.18.4 integrated successfully", new Object[0]);
            }
            er1 er1Var = new er1();
            sr1.a(new vr1(er1Var).a(new qr1().a(oq1.a())));
        }
        hw2 hw2Var = new hw2(uh1Var, this.f44691c);
        j1.a(this.f44690b);
        hw2Var.a(this.f44690b);
        return Unit.f27471a;
    }
}
