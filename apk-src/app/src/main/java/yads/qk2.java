package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qk2 implements kj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jj1 f42330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mi f42331c;

    public qk2(float f10) {
        this(f10, new jj1());
    }

    @Override // yads.kj1
    public final jj1 a(int i, int i10) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            int iRound = Math.round(size / this.f42331c.f40917a);
            if (mode2 == Integer.MIN_VALUE) {
                iRound = (int) Math.min(size2, iRound);
            }
            i10 = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
        } else if (mode2 == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0)) {
            int iRound2 = Math.round(size2 * this.f42331c.f40917a);
            if (mode == Integer.MIN_VALUE) {
                iRound2 = (int) Math.min(size, iRound2);
            }
            i = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            float f10 = size;
            float f11 = size2;
            if (f10 / f11 > this.f42329a) {
                i = View.MeasureSpec.makeMeasureSpec(Math.round(f11 * this.f42331c.f40917a), 1073741824);
                i10 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int iRound3 = Math.round(f10 / this.f42331c.f40917a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i10 = View.MeasureSpec.makeMeasureSpec(iRound3, 1073741824);
                i = iMakeMeasureSpec;
            }
        }
        jj1 jj1Var = this.f42330b;
        jj1Var.f39877a = i;
        jj1Var.f39878b = i10;
        return jj1Var;
    }

    public /* synthetic */ qk2(float f10, jj1 jj1Var) {
        this(f10, jj1Var, new mi(f10));
    }

    public qk2(float f10, jj1 jj1Var, mi miVar) {
        this.f42329a = f10;
        this.f42330b = jj1Var;
        this.f42331c = miVar;
    }
}
