package yads;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jw0 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw0 f39997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f39998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw0(nw0 nw0Var, UUID uuid) {
        super(1);
        this.f39997b = nw0Var;
        this.f39998c = uuid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ep2 ep2Var = (ep2) this.f39997b.f41359b.getValue();
        UUID uuid = this.f39998c;
        ep2Var.getClass();
        if (uuid == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        ep2Var.a(new bp2(uuid));
        return Unit.f27471a;
    }
}
