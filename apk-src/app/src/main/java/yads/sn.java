package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sn extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zn f42986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hp f42987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(zn znVar, hp hpVar, mj.a aVar) {
        super(2, aVar);
        this.f42986c = znVar;
        this.f42987d = hpVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new sn(this.f42986c, this.f42987d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sn(this.f42986c, this.f42987d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f42985b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            return obj;
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        zn znVar = this.f42986c;
        t01 t01Var = znVar.f45476l;
        Context context = znVar.f45466a;
        hp hpVar = this.f42987d;
        this.f42985b = 1;
        Object objA = t01Var.a(context, hpVar, this);
        return objA == aVar ? aVar : objA;
    }
}
