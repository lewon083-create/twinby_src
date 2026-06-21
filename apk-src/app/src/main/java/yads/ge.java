package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ge extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f38732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ie f38735e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ie ieVar, mj.a aVar) {
        super(2, aVar);
        this.f38735e = ieVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        ge geVar = new ge(this.f38735e, aVar);
        geVar.f38734d = obj;
        return geVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ge geVar = new ge(this.f38735e, (mj.a) obj2);
        geVar.f38734d = (hk.a0) obj;
        return geVar.invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ge.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
