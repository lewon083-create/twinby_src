package k6;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f27095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, Context context) {
        super(context);
        this.f27095a = j0Var;
    }

    @Override // k6.c0
    public final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // k6.c0
    public final int calculateTimeForScrolling(int i) {
        return Math.min(100, super.calculateTimeForScrolling(i));
    }

    @Override // k6.c0, androidx.recyclerview.widget.n
    public final void onTargetFound(View view, f1 f1Var, androidx.recyclerview.widget.m mVar) {
        j0 j0Var = this.f27095a;
        int[] iArrA = j0Var.a(j0Var.mRecyclerView.getLayoutManager(), view);
        int i = iArrA[0];
        int i10 = iArrA[1];
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i10)));
        if (iCalculateTimeForDeceleration > 0) {
            DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
            mVar.f1718a = i;
            mVar.f1719b = i10;
            mVar.f1720c = iCalculateTimeForDeceleration;
            mVar.f1722e = decelerateInterpolator;
            mVar.f1723f = true;
        }
    }
}
