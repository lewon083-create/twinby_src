package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gx0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hx0 f38933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f38934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx0(hx0 hx0Var, List list, mj.a aVar) {
        super(2, aVar);
        this.f38933c = hx0Var;
        this.f38934d = list;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new gx0(this.f38933c, this.f38934d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new gx0(this.f38933c, this.f38934d, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f38932b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            sw0 sw0Var = this.f38933c.f39353a;
            List list = this.f38934d;
            this.f38932b = 1;
            sw0Var.getClass();
            if (hk.c0.e(new qw0(list, sw0Var, null), this) == aVar) {
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
