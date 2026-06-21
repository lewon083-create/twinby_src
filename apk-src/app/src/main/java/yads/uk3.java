package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uk3 extends kotlin.jvm.internal.r implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zk3 f43701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk3(zk3 zk3Var) {
        super(2);
        this.f43701b = zk3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (tk3.f43348a[((z90) obj).ordinal()] == 1) {
            this.f43701b.f45448a.invoke(new c90(zBooleanValue));
        }
        return Unit.f27471a;
    }
}
