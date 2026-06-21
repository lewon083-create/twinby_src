package a0;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends g0.a1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f160o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f161p;

    public l2(Surface surface, Size size, int i) {
        super(size, i);
        this.f161p = surface;
    }

    @Override // g0.a1
    public final ed.d f() {
        switch (this.f160o) {
            case 0:
                return ((o2) this.f161p).f185h;
            default:
                return k0.j.e((Surface) this.f161p);
        }
    }

    public l2(Surface surface) {
        super(g0.a1.f19505k, 0);
        this.f161p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(o2 o2Var, Size size) {
        super(size, 34);
        this.f161p = o2Var;
    }
}
