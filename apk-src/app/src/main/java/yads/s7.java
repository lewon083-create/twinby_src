package yads;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s7 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f42830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Map.Entry entry) {
        super(1);
        this.f42830b = entry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vk.x xVar = (vk.x) obj;
        hl.d.u(xVar, "usagePercent", Integer.valueOf(((h8) this.f42830b.getValue()).f39065a));
        hl.d.t(xVar, "isDisabled", Boolean.valueOf(((h8) this.f42830b.getValue()).f39066b));
        return Unit.f27471a;
    }
}
