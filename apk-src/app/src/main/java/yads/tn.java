package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tn extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zn f43373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hp f43374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(zn znVar, hp hpVar, mj.a aVar) {
        super(2, aVar);
        this.f43373c = znVar;
        this.f43374d = hpVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new tn(this.f43373c, this.f43374d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new tn(this.f43373c, this.f43374d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f43372b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            return obj;
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        zn znVar = this.f43373c;
        hh2 hh2Var = znVar.f45477m;
        Context context = znVar.f45466a;
        hp hpVar = this.f43374d;
        this.f43372b = 1;
        Object objA = hh2Var.a(context, hpVar, this);
        return objA == aVar ? aVar : objA;
    }
}
