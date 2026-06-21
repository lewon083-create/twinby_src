package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wz extends xz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lx1 f44531c;

    public wz(lx1 lx1Var, dx1 dx1Var, xw1 xw1Var) {
        super(dx1Var, xw1Var, 0);
        this.f44531c = lx1Var;
    }

    @Override // yads.xz, android.view.View.OnClickListener
    public final void onClick(View view) {
        y6.m mVar = (y6.m) this.f44531c.f40712a.get();
        if (mVar != null) {
            mVar.b(mVar.getCurrentItem() + 1, true);
        }
        super.onClick(view);
    }
}
