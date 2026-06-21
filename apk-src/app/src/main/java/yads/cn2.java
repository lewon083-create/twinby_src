package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cn2 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hk.j f37445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn2(hk.l lVar) {
        super(1);
        this.f37445b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f37445b.resumeWith(new ij.m((j80) obj));
        return Unit.f27471a;
    }
}
