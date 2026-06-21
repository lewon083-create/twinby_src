package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class om0 extends kotlin.jvm.internal.r implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pl2 f41626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om0(pl2 pl2Var) {
        super(2);
        this.f41626b = pl2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        this.f41626b.a((String) obj, (String) obj2);
        return Unit.f27471a;
    }
}
