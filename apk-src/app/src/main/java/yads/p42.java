package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p42 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s42 f41817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty1 f41818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p42(s42 s42Var, ty1 ty1Var, mj.a aVar) {
        super(2, aVar);
        this.f41817c = s42Var;
        this.f41818d = ty1Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new p42(this.f41817c, this.f41818d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p42(this.f41817c, this.f41818d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb A[RETURN] */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.p42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
