package p2;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends oj.i implements Function1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f30927l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f30929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f30930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f30931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Serializable f30932q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kotlin.jvm.internal.f0 f0Var, e0 e0Var, kotlin.jvm.internal.e0 e0Var2, mj.a aVar) {
        super(1, aVar);
        this.f30931p = f0Var;
        this.f30929n = e0Var;
        this.f30932q = e0Var2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function2, oj.i] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mj.a aVar = (mj.a) obj;
        switch (this.f30927l) {
            case 0:
                return new a0((kotlin.jvm.internal.f0) this.f30931p, this.f30929n, (kotlin.jvm.internal.e0) this.f30932q, aVar).invokeSuspend(Unit.f27471a);
            default:
                return new a0(this.f30929n, (CoroutineContext) this.f30931p, (Function2) this.f30932q, aVar).invokeSuspend(Unit.f27471a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function2, oj.i] */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(e0 e0Var, CoroutineContext coroutineContext, Function2 function2, mj.a aVar) {
        super(1, aVar);
        this.f30929n = e0Var;
        this.f30931p = coroutineContext;
        this.f30932q = (oj.i) function2;
    }
}
