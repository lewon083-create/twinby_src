package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sf0 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hk.j f42925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(hk.l lVar) {
        super(0);
        this.f42925b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f42925b.isActive()) {
            hk.j jVar = this.f42925b;
            ij.k kVar = ij.m.f21341c;
            jVar.resumeWith(new ij.m(Unit.f27471a));
        }
        return Unit.f27471a;
    }
}
