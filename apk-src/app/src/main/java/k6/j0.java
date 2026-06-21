package k6;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends l1 {
    private h0 mHorizontalHelper;
    private h0 mVerticalHelper;

    public static int b(View view, h0 h0Var) {
        return ((h0Var.c(view) / 2) + h0Var.e(view)) - ((h0Var.l() / 2) + h0Var.k());
    }

    public static View c(androidx.recyclerview.widget.i iVar, h0 h0Var) {
        int childCount = iVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iL = (h0Var.l() / 2) + h0Var.k();
        int i = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = iVar.getChildAt(i10);
            int iAbs = Math.abs(((h0Var.c(childAt) / 2) + h0Var.e(childAt)) - iL);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // k6.l1
    public int[] a(androidx.recyclerview.widget.i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.canScrollHorizontally()) {
            iArr[0] = b(view, d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.canScrollVertically()) {
            iArr[1] = b(view, e(iVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // k6.l1
    public androidx.recyclerview.widget.n createScroller(androidx.recyclerview.widget.i iVar) {
        if (iVar instanceof e1) {
            return new i0(this, this.mRecyclerView.getContext());
        }
        return null;
    }

    public final h0 d(androidx.recyclerview.widget.i iVar) {
        h0 h0Var = this.mHorizontalHelper;
        if (h0Var == null || h0Var.f27086a != iVar) {
            this.mHorizontalHelper = new g0(iVar, 0);
        }
        return this.mHorizontalHelper;
    }

    public final h0 e(androidx.recyclerview.widget.i iVar) {
        h0 h0Var = this.mVerticalHelper;
        if (h0Var == null || h0Var.f27086a != iVar) {
            this.mVerticalHelper = new g0(iVar, 1);
        }
        return this.mVerticalHelper;
    }

    @Override // k6.l1
    public View findSnapView(androidx.recyclerview.widget.i iVar) {
        if (iVar.canScrollVertically()) {
            return c(iVar, e(iVar));
        }
        if (iVar.canScrollHorizontally()) {
            return c(iVar, d(iVar));
        }
        return null;
    }
}
