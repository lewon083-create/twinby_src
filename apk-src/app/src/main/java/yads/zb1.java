package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zb1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f45339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb1(IntegrationInspectorActivity integrationInspectorActivity, mj.a aVar) {
        super(2, aVar);
        this.f45339c = integrationInspectorActivity;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new zb1(this.f45339c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zb1(this.f45339c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f45338b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            kk.e eVar = this.f45339c.b().f40873p;
            yb1 yb1Var = new yb1(this.f45339c);
            this.f45338b = 1;
            if (eVar.p(yb1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
        }
        return Unit.f27471a;
    }
}
