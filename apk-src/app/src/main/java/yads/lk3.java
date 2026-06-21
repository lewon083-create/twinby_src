package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kk3 f40568a;

    public lk3(kk3 kk3Var) {
        this.f40568a = kk3Var;
    }

    public final void a() {
        View viewB = this.f40568a.b();
        if (viewB == null) {
            return;
        }
        this.f40568a.a(viewB);
    }

    public final void b(Object obj) {
        View viewB = this.f40568a.b();
        if (viewB == null) {
            return;
        }
        this.f40568a.b(viewB, obj);
        viewB.setVisibility(0);
    }

    public final void a(oi oiVar, nk3 nk3Var, Object obj) {
        if (this.f40568a.b() == null) {
            return;
        }
        this.f40568a.a(oiVar, nk3Var, obj);
    }

    public final boolean a(Object obj) {
        View viewB = this.f40568a.b();
        return viewB != null && this.f40568a.a(viewB, obj);
    }
}
