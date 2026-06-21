package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uu1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f43770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nu2 f43771c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu1(Context context, nu2 nu2Var, mj.a aVar) {
        super(2, aVar);
        this.f43770b = context;
        this.f43771c = nu2Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new uu1(this.f43770b, this.f43771c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new uu1(this.f43770b, this.f43771c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        ka3.a(this.f43770b, ((lu3) this.f43771c).a());
        xf.a(this.f43770b, ((lu3) this.f43771c).a());
        AtomicBoolean atomicBoolean = ji.f39870a;
        ji.a(this.f43770b, ((lu3) this.f43771c).a());
        return Unit.f27471a;
    }
}
