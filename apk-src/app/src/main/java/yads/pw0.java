package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pw0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f42086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sw0 f42087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2 f42088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(sw0 sw0Var, fn2 fn2Var, mj.a aVar) {
        super(2, aVar);
        this.f42087d = sw0Var;
        this.f42088e = fn2Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        pw0 pw0Var = new pw0(this.f42087d, this.f42088e, aVar);
        pw0Var.f42086c = obj;
        return pw0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pw0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objS;
        nj.a aVar = nj.a.f29512b;
        int i = this.f42085b;
        try {
            if (i == 0) {
                com.google.android.gms.internal.measurement.h5.E(obj);
                sw0 sw0Var = this.f42087d;
                fn2 fn2Var = this.f42088e;
                ij.k kVar = ij.m.f21341c;
                this.f42085b = 1;
                obj = sw0Var.a(fn2Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.measurement.h5.E(obj);
            }
            objS = (Boolean) obj;
            objS.getClass();
            ij.k kVar2 = ij.m.f21341c;
        } catch (Throwable th2) {
            ij.k kVar3 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        return new ij.m(objS);
    }
}
