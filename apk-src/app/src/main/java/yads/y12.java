package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y12 implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l52 f44887a;

    public y12(l52 l52Var) {
        this.f44887a = l52Var;
    }

    @Override // yads.yb
    public final boolean a() {
        View viewA;
        n12 n12Var = ((m12) this.f44887a).f40743d;
        return (n12Var == null || (viewA = n12Var.f41135c.a()) == null || nl3.f41290a.a(viewA).f36778a < 1) ? false : true;
    }
}
