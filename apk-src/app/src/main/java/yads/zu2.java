package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zu2 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f45544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cv2 f45545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu2(boolean z5, cv2 cv2Var, mj.a aVar) {
        super(2, aVar);
        this.f45544c = z5;
        this.f45545d = cv2Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new zu2(this.f45544c, this.f45545d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zu2(this.f45544c, this.f45545d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f45543b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            if (this.f45544c) {
                dj0 dj0Var = this.f45545d.f37526q;
                this.f45543b = 1;
                if (dj0Var.a(this) == aVar) {
                    return aVar;
                }
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
