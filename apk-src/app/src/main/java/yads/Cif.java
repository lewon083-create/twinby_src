package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: yads.if, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Cif extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf f39523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f39524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(jf jfVar, long j10, mj.a aVar) {
        super(2, aVar);
        this.f39523c = jfVar;
        this.f39524d = j10;
    }

    public static final void a(hk.q qVar) {
        ((hk.r) qVar).H(Unit.f27471a);
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new Cif(this.f39523c, this.f39524d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Cif(this.f39523c, this.f39524d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f39522b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            hk.r rVar = new hk.r();
            this.f39523c.f39848b.post(new t.a0(24, rVar));
            long j10 = this.f39524d;
            hf hfVar = new hf(rVar, null);
            this.f39522b = 1;
            obj = hk.c0.u(j10, hfVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
        }
        return Boolean.valueOf(obj != null);
    }
}
