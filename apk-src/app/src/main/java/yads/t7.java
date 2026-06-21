package yads;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t7 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f8 f43197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(f8 f8Var) {
        super(1);
        this.f43197b = f8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vk.x xVar = (vk.x) obj;
        for (Map.Entry entry : this.f43197b.f38398h.entrySet()) {
            hl.d.v(xVar, (String) entry.getKey(), new s7(entry));
        }
        return Unit.f27471a;
    }
}
