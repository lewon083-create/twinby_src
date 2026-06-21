package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q42 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f42178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s42 f42179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d4 f42180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f42181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ty1 f42182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oi2 f42183h;
    public final /* synthetic */ z30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q42(s42 s42Var, d4 d4Var, Context context, ty1 ty1Var, oi2 oi2Var, z30 z30Var, mj.a aVar) {
        super(2, aVar);
        this.f42179d = s42Var;
        this.f42180e = d4Var;
        this.f42181f = context;
        this.f42182g = ty1Var;
        this.f42183h = oi2Var;
        this.i = z30Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        q42 q42Var = new q42(this.f42179d, this.f42180e, this.f42181f, this.f42182g, this.f42183h, this.i, aVar);
        q42Var.f42178c = obj;
        return q42Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q42) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objS;
        nj.a aVar = nj.a.f29512b;
        int i = this.f42177b;
        try {
            if (i == 0) {
                com.google.android.gms.internal.measurement.h5.E(obj);
                s42 s42Var = this.f42179d;
                d4 d4Var = this.f42180e;
                Context context = this.f42181f;
                ty1 ty1Var = this.f42182g;
                oi2 oi2Var = this.f42183h;
                z30 z30Var = this.i;
                ij.k kVar = ij.m.f21341c;
                l42 l42Var = s42Var.f42803b;
                this.f42177b = 1;
                l42Var.getClass();
                ok.e eVar = hk.k0.f20682a;
                obj = hk.c0.t(ok.d.f30722d, new k42(d4Var, l42Var, context, ty1Var, z30Var, oi2Var, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.measurement.h5.E(obj);
            }
            objS = (ty1) obj;
            ij.k kVar2 = ij.m.f21341c;
        } catch (Throwable th2) {
            ij.k kVar3 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            return null;
        }
        return objS;
    }
}
