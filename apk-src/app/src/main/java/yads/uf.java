package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uf extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vf f43637b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(vf vfVar) {
        super(1);
        this.f43637b = vfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f43637b.i.set(false);
        return Unit.f27471a;
    }
}
