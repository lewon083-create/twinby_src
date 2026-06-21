package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h42 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l42 f39026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty1 f39027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oi2 f39028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h42(l42 l42Var, ty1 ty1Var, oi2 oi2Var, mj.a aVar) {
        super(2, aVar);
        this.f39026c = l42Var;
        this.f39027d = ty1Var;
        this.f39028e = oi2Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new h42(this.f39026c, this.f39027d, this.f39028e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h42) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0183  */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
