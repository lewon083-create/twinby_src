package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.n0;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f1727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f1728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1731h;

    public o(RecyclerView recyclerView) {
        this.f1731h = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f1728e = interpolator;
        this.f1729f = false;
        this.f1730g = false;
        this.f1727d = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void a(int i, int i10) {
        RecyclerView recyclerView = this.f1731h;
        recyclerView.setScrollState(2);
        this.f1726c = 0;
        this.f1725b = 0;
        Interpolator interpolator = this.f1728e;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f1728e = interpolator2;
            this.f1727d = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f1727d.fling(0, 0, i, i10, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, Integer.MAX_VALUE, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f1729f) {
            this.f1730g = true;
            return;
        }
        RecyclerView recyclerView = this.f1731h;
        recyclerView.removeCallbacks(this);
        Field field = n0.f19900a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i10, Interpolator interpolator, int i11) {
        RecyclerView recyclerView = this.f1731h;
        if (i11 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i10);
            boolean z5 = iAbs > iAbs2;
            int width = z5 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z5) {
                iAbs = iAbs2;
            }
            i11 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i12 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f1728e != interpolator) {
            this.f1728e = interpolator;
            this.f1727d = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f1726c = 0;
        this.f1725b = 0;
        recyclerView.setScrollState(2);
        this.f1727d.startScroll(0, 0, i, i10, i12);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.f1731h;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f1727d.abortAnimation();
            return;
        }
        this.f1730g = false;
        this.f1729f = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f1727d;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i13 = currX - this.f1725b;
            int i14 = currY - this.f1726c;
            this.f1725b = currX;
            this.f1726c = currY;
            int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i13);
            int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i14);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                iConsumeFlingInHorizontalStretch -= iArr2[0];
                iConsumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i15 = iArr4[0];
                int i16 = iArr4[1];
                int i17 = iConsumeFlingInHorizontalStretch - i15;
                int i18 = iConsumeFlingInVerticalStretch - i16;
                n nVar = recyclerView.mLayout.mSmoothScroller;
                if (nVar != null && !nVar.isPendingInitialRun() && nVar.isRunning()) {
                    int iB = recyclerView.mState.b();
                    if (iB == 0) {
                        nVar.stop();
                    } else if (nVar.getTargetPosition() >= iB) {
                        nVar.setTargetPosition(iB - 1);
                        nVar.onAnimation(i15, i16);
                    } else {
                        nVar.onAnimation(i15, i16);
                    }
                }
                i = i17;
                i11 = i15;
                i10 = i18;
                i12 = i16;
            } else {
                i = iConsumeFlingInHorizontalStretch;
                i10 = iConsumeFlingInVerticalStretch;
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i11, i12, i, i10, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i19 = i - iArr6[0];
            int i20 = i10 - iArr6[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.dispatchOnScrolled(i11, i12);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z5 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
            n nVar2 = recyclerView.mLayout.mSmoothScroller;
            if ((nVar2 == null || !nVar2.isPendingInitialRun()) && z5) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i21 = i19 < 0 ? -currVelocity : i19 > 0 ? currVelocity : 0;
                    if (i20 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i20 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i21, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    c cVar = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = cVar.f1692c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    cVar.f1693d = 0;
                }
            } else {
                b();
                d dVar = recyclerView.mGapWorker;
                if (dVar != null) {
                    dVar.a(recyclerView, i11, i12);
                }
            }
        }
        n nVar3 = recyclerView.mLayout.mSmoothScroller;
        if (nVar3 != null && nVar3.isPendingInitialRun()) {
            nVar3.onAnimation(0, 0);
        }
        this.f1729f = false;
        if (!this.f1730g) {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field = n0.f19900a;
            recyclerView.postOnAnimation(this);
        }
    }
}
