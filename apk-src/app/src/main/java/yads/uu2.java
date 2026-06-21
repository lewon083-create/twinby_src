package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uu2 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cv2 f43773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu2 f43774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu2(cv2 cv2Var, vu2 vu2Var, mj.a aVar) {
        super(2, aVar);
        this.f43773c = cv2Var;
        this.f43774d = vu2Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new uu2(this.f43773c, this.f43774d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new uu2(this.f43773c, this.f43774d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f43772b;
        try {
            if (i == 0) {
                com.google.android.gms.internal.measurement.h5.E(obj);
                cv2 cv2Var = this.f43773c;
                s61 s61Var = s61.f42816c;
                this.f43772b = 1;
                obj = cv2Var.a(s61Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.measurement.h5.E(obj);
            }
            this.f43774d.f44177d.a((tu2) obj);
            vu2.f44174f.remove(this.f43773c);
            return Unit.f27471a;
        } catch (Throwable th2) {
            vu2.f44174f.remove(this.f43773c);
            throw th2;
        }
    }
}
