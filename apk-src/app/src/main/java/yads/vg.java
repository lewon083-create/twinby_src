package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vg extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wg f44027b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(wg wgVar) {
        super(0);
        this.f44027b = wgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f44027b.c();
        this.f44027b.f44383d.getClass();
        rg.a("Connection timeout");
        this.f44027b.a();
        return Unit.f27471a;
    }
}
