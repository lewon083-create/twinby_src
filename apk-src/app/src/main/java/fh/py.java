package fh;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class py extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sy f18140g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py(sy syVar, int i) {
        super(0);
        this.f18139f = i;
        this.f18140g = syVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18139f) {
            case 0:
                return new jp(this.f18140g, 29);
            case 1:
                return new pu(this.f18140g, 3);
            case 2:
                return new qu(this.f18140g, 3);
            case 3:
                return new zw(this.f18140g, 0);
            case 4:
                return new pu(this.f18140g, 4);
            case 5:
                return new qu(this.f18140g, 4);
            case 6:
                return new cx(this.f18140g);
            case 7:
                return new dx(this.f18140g);
            case 8:
                return new ex(this.f18140g);
            case 9:
                return new gz(this.f18140g);
            case 10:
                return new hz(this.f18140g);
            default:
                return new iz(this.f18140g);
        }
    }
}
