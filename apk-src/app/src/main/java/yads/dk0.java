package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dk0 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ek0 f37792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(ek0 ek0Var, String str) {
        super(1);
        this.f37792b = ek0Var;
        this.f37793c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hk0 hk0Var = (hk0) obj;
        ek0 ek0Var = this.f37792b;
        String str = this.f37793c;
        bk0 bk0Var = (bk0) ek0Var.f38154d.remove(str);
        if (bk0Var != null) {
            ek0Var.f38153c.a(str, hk0Var.f39227a, hk0Var.f39228b);
            ek0Var.a(str, bk0Var, hk0Var.f39227a, null);
        }
        return Unit.f27471a;
    }
}
