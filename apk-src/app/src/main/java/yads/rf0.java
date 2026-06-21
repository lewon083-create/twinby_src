package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rf0 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f42584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f42585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(z1 z1Var, long j10) {
        super(1);
        this.f42584b = z1Var;
        this.f42585c = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f42584b.a(this.f42585c);
        return Unit.f27471a;
    }
}
