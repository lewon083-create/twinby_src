package p2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f31103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ boolean f31105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e0 f31106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f31107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f31108q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(e0 e0Var, int i, mj.a aVar, int i10) {
        super(2, aVar);
        this.f31103l = i10;
        this.f31106o = e0Var;
        this.f31107p = i;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f31103l) {
            case 0:
                y yVar = new y(this.f31106o, this.f31107p, aVar, 0);
                yVar.f31105n = ((Boolean) obj).booleanValue();
                return yVar;
            default:
                y yVar2 = new y(this.f31106o, this.f31107p, aVar, 1);
                yVar2.f31105n = ((Boolean) obj).booleanValue();
                return yVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31103l;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        mj.a aVar = (mj.a) obj2;
        switch (i) {
        }
        return ((y) create(bool, aVar)).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
