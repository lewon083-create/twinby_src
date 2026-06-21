package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yl0 implements kj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jj1 f45103a = new jj1();

    @Override // yads.kj1
    public final jj1 a(int i, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        jj1 jj1Var = this.f45103a;
        jj1Var.f39877a = iMakeMeasureSpec;
        jj1Var.f39878b = iMakeMeasureSpec;
        return jj1Var;
    }
}
