package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zd extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f45377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(Context context, mj.a aVar) {
        super(2, aVar);
        this.f45377c = context;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new zd(this.f45377c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zd(this.f45377c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        yd ydVar;
        nj.a aVar = nj.a.f29512b;
        int i = this.f45376b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            return obj;
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        Context context = this.f45377c;
        yd ydVar2 = yd.f45007e;
        if (ydVar2 == null) {
            synchronized (yd.f45006d) {
                ydVar = yd.f45007e;
                if (ydVar == null) {
                    x10 x10Var = new x10();
                    hk.s1 s1Var = new hk.s1();
                    ok.e eVar = hk.k0.f20682a;
                    ydVar = new yd(hk.c0.a(kotlin.coroutines.e.d(s1Var, ok.d.f30722d).plus(x10Var)), new le(), new ie(context));
                    yd.f45007e = ydVar;
                }
            }
            ydVar2 = ydVar;
        }
        this.f45376b = 1;
        Object objU = hk.c0.u(((Number) ydVar2.f45009b.f39120b.getValue()).longValue(), new xd(ydVar2, null), this);
        return objU == aVar ? aVar : objU;
    }
}
