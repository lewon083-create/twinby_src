package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y72 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a82 f44943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ me3 f44944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y72(a82 a82Var, me3 me3Var, mj.a aVar) {
        super(2, aVar);
        this.f44943c = a82Var;
        this.f44944d = me3Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new y72(this.f44943c, this.f44944d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new y72(this.f44943c, this.f44944d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f44942b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            return obj;
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        a82 a82Var = this.f44943c;
        List listC = kotlin.collections.r.c(this.f44944d);
        this.f44942b = 1;
        Object objA = a82.a(a82Var, listC, this);
        return objA == aVar ? aVar : objA;
    }
}
