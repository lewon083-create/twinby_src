package k6;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class c0 extends androidx.recyclerview.widget.n {
    private final DisplayMetrics mDisplayMetrics;
    private float mMillisPerPixel;
    protected PointF mTargetVector;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    private boolean mHasCalculatedMillisPerPixel = false;
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;

    public c0(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int calculateDtToFit(int i, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public int calculateDxToMakeVisible(View view, int i) {
        androidx.recyclerview.widget.i layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        w0 w0Var = (w0) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) w0Var).leftMargin, layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
    }

    public int calculateDyToMakeVisible(View view, int i) {
        androidx.recyclerview.widget.i layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        w0 w0Var = (w0) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) w0Var).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
    }

    public int calculateTimeForDeceleration(int i) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(i)) / 0.3356d);
    }

    public int calculateTimeForScrolling(int i) {
        float fAbs = Math.abs(i);
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = a(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return (int) Math.ceil(fAbs * this.mMillisPerPixel);
    }

    @Override // androidx.recyclerview.widget.n
    public void onSeekTargetStep(int i, int i10, f1 f1Var, androidx.recyclerview.widget.m mVar) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        int i11 = this.mInterimTargetDx;
        int i12 = i11 - i;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.mInterimTargetDx = i12;
        int i13 = this.mInterimTargetDy;
        int i14 = i13 - i10;
        int i15 = i13 * i14 > 0 ? i14 : 0;
        this.mInterimTargetDy = i15;
        if (i12 == 0 && i15 == 0) {
            updateActionForInterimTarget(mVar);
        }
    }

    @Override // androidx.recyclerview.widget.n
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // androidx.recyclerview.widget.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onTargetFound(android.view.View r6, k6.f1 r7, androidx.recyclerview.widget.m r8) {
        /*
            r5 = this;
            android.graphics.PointF r7 = r5.mTargetVector
            r0 = 0
            r1 = -1
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L15
            float r7 = r7.x
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto Lf
            goto L15
        Lf:
            if (r7 <= 0) goto L13
            r7 = r2
            goto L16
        L13:
            r7 = r1
            goto L16
        L15:
            r7 = r0
        L16:
            int r7 = r5.calculateDxToMakeVisible(r6, r7)
            android.graphics.PointF r4 = r5.mTargetVector
            if (r4 == 0) goto L2a
            float r4 = r4.y
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L25
            goto L2a
        L25:
            if (r3 <= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            int r6 = r5.calculateDyToMakeVisible(r6, r0)
            int r0 = r7 * r7
            int r1 = r6 * r6
            int r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            int r0 = (int) r0
            int r0 = r5.calculateTimeForDeceleration(r0)
            if (r0 <= 0) goto L4d
            int r7 = -r7
            int r6 = -r6
            android.view.animation.DecelerateInterpolator r1 = r5.mDecelerateInterpolator
            r8.f1718a = r7
            r8.f1719b = r6
            r8.f1720c = r0
            r8.f1722e = r1
            r8.f1723f = r2
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.c0.onTargetFound(android.view.View, k6.f1, androidx.recyclerview.widget.m):void");
    }

    public void updateActionForInterimTarget(androidx.recyclerview.widget.m mVar) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            mVar.f1721d = getTargetPosition();
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        int iCalculateTimeForScrolling = calculateTimeForScrolling(10000);
        LinearInterpolator linearInterpolator = this.mLinearInterpolator;
        mVar.f1718a = (int) (this.mInterimTargetDx * 1.2f);
        mVar.f1719b = (int) (this.mInterimTargetDy * 1.2f);
        mVar.f1720c = (int) (iCalculateTimeForScrolling * 1.2f);
        mVar.f1722e = linearInterpolator;
        mVar.f1723f = true;
    }

    @Override // androidx.recyclerview.widget.n
    public void onStart() {
    }
}
