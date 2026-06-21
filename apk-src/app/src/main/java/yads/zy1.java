package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zy1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public az1 f45591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f45592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f45593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hy1 f45594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f45595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f45597h;
    public final /* synthetic */ List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ az1 f45598j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy1(List list, az1 az1Var, mj.a aVar) {
        super(2, aVar);
        this.i = list;
        this.f45598j = az1Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        zy1 zy1Var = new zy1(this.i, this.f45598j, aVar);
        zy1Var.f45597h = obj;
        return zy1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zy1) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00db -> B:40:0x00e0). Please report as a decompilation issue!!! */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zy1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
