package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.n0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k6.f1;
import k6.r1;
import k6.s1;
import k6.t0;
import k6.t1;
import k6.u0;
import k6.v0;
import k6.w0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    boolean mAutoMeasure;
    b mChildHelper;
    private int mHeight;
    private int mHeightMode;
    s1 mHorizontalBoundCheck;
    private final r1 mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;
    n mSmoothScroller;
    s1 mVerticalBoundCheck;
    private final r1 mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public i() {
        t0 t0Var = new t0(0, this);
        this.mHorizontalBoundCheckCallback = t0Var;
        fe.c cVar = new fe.c(28, this);
        this.mVerticalBoundCheckCallback = cVar;
        this.mHorizontalBoundCheck = new s1(t0Var);
        this.mVerticalBoundCheck = new s1(cVar);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static boolean b(int i, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static int chooseSize(int i, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1d
            if (r7 < 0) goto L12
        L10:
            r5 = r3
            goto L30
        L12:
            if (r7 != r1) goto L1a
            if (r5 == r2) goto L22
            if (r5 == 0) goto L1a
            if (r5 == r3) goto L22
        L1a:
            r5 = r6
            r7 = r5
            goto L30
        L1d:
            if (r7 < 0) goto L20
            goto L10
        L20:
            if (r7 != r1) goto L24
        L22:
            r7 = r4
            goto L30
        L24:
            if (r7 != r0) goto L1a
            if (r5 == r2) goto L2e
            if (r5 != r3) goto L2b
            goto L2e
        L2b:
            r7 = r4
            r5 = r6
            goto L30
        L2e:
            r7 = r4
            r5 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.getChildMeasureSpec(int, int, int, int, boolean):int");
    }

    public static v0 getProperties(Context context, AttributeSet attributeSet, int i, int i10) {
        v0 v0Var = new v0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j6.a.f26574a, i, i10);
        v0Var.f27189a = typedArrayObtainStyledAttributes.getInt(0, 1);
        v0Var.f27190b = typedArrayObtainStyledAttributes.getInt(10, 1);
        v0Var.f27191c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        v0Var.f27192d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return v0Var;
    }

    public View _getChildAt(int i) {
        return getChildAt(i);
    }

    public int _getPosition(View view) {
        return getPosition(view);
    }

    public final void a(View view, int i, boolean z5) {
        p childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z5 || childViewHolderInt.isRemoved()) {
            h1.i iVar = this.mRecyclerView.mViewInfoStore.f27193a;
            t1 t1VarA = (t1) iVar.get(childViewHolderInt);
            if (t1VarA == null) {
                t1VarA = t1.a();
                iVar.put(childViewHolderInt, t1VarA);
            }
            t1VarA.f27182a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        w0 w0Var = (w0) view.getLayoutParams();
        if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.b(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            b bVar = this.mChildHelper;
            com.google.android.gms.ads.identifier.c cVar = bVar.f1686b;
            int iIndexOfChild = ((RecyclerView) bVar.f1685a.f34767c).indexOfChild(view);
            int iX = (iIndexOfChild == -1 || cVar.Z(iIndexOfChild)) ? -1 : iIndexOfChild - cVar.X(iIndexOfChild);
            if (i == -1) {
                i = this.mChildHelper.e();
            }
            if (iX == -1) {
                StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb2.append(this.mRecyclerView.indexOfChild(view));
                throw new IllegalStateException(gf.a.i(this.mRecyclerView, sb2));
            }
            if (iX != i) {
                this.mRecyclerView.mLayout.moveView(iX, i);
            }
        } else {
            this.mChildHelper.a(view, i, false);
            w0Var.f27222c = true;
            n nVar = this.mSmoothScroller;
            if (nVar != null && nVar.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (w0Var.f27223d) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + w0Var.f27220a);
            }
            childViewHolderInt.itemView.invalidate();
            w0Var.f27223d = false;
        }
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void attachView(View view, int i, w0 w0Var) {
        p childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isRemoved()) {
            h1.i iVar = this.mRecyclerView.mViewInfoStore.f27193a;
            t1 t1VarA = (t1) iVar.get(childViewHolderInt);
            if (t1VarA == null) {
                t1VarA = t1.a();
                iVar.put(childViewHolderInt, t1VarA);
            }
            t1VarA.f27182a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        this.mChildHelper.b(view, i, w0Var, childViewHolderInt.isRemoved());
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public abstract boolean canScrollHorizontally();

    public boolean canScrollVertically() {
        return false;
    }

    public boolean checkLayoutParams(w0 w0Var) {
        return w0Var != null;
    }

    public abstract int computeHorizontalScrollExtent(f1 f1Var);

    public abstract int computeHorizontalScrollOffset(f1 f1Var);

    public abstract int computeHorizontalScrollRange(f1 f1Var);

    public int computeVerticalScrollExtent(f1 f1Var) {
        return 0;
    }

    public int computeVerticalScrollOffset(f1 f1Var) {
        return 0;
    }

    public int computeVerticalScrollRange(f1 f1Var) {
        return 0;
    }

    public void detachAndScrapAttachedViews(k kVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            p childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "ignoring view " + childViewHolderInt);
                }
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.mRecyclerView.mAdapter.hasStableIds()) {
                detachViewAt(childCount);
                kVar.j(childAt);
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            } else {
                removeViewAt(childCount);
                kVar.i(childViewHolderInt);
            }
        }
    }

    public void detachViewAt(int i) {
        getChildAt(i);
        this.mChildHelper.c(i);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, k kVar) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, kVar);
    }

    public View findContainingItemView(View view) {
        View viewFindContainingItemView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f1687c.contains(viewFindContainingItemView)) {
            return null;
        }
        return viewFindContainingItemView;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            p childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f27070g || !childViewHolderInt.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract w0 generateDefaultLayoutParams();

    public w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w0 ? new w0((w0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new w0((ViewGroup.MarginLayoutParams) layoutParams) : new w0(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View view) {
        return ((w0) view.getLayoutParams()).f27221b.bottom;
    }

    public View getChildAt(int i) {
        b bVar = this.mChildHelper;
        if (bVar != null) {
            return bVar.d(i);
        }
        return null;
    }

    public int getChildCount() {
        b bVar = this.mChildHelper;
        if (bVar != null) {
            return bVar.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.mClipToPadding;
    }

    public int getColumnCountForAccessibility(k kVar, f1 f1Var) {
        return -1;
    }

    public int getDecoratedBottom(View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((w0) view.getLayoutParams()).f27221b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((w0) view.getLayoutParams()).f27221b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedTop(View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f1687c.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView recyclerView = this.mRecyclerView;
        g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int getLayoutDirection() {
        RecyclerView recyclerView = this.mRecyclerView;
        Field field = n0.f19900a;
        return recyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(View view) {
        return ((w0) view.getLayoutParams()).f27221b.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        Field field = n0.f19900a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        Field field = n0.f19900a;
        return recyclerView.getMinimumWidth();
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(View view) {
        return ((w0) view.getLayoutParams()).f27220a.getLayoutPosition();
    }

    public int getRightDecorationWidth(View view) {
        return ((w0) view.getLayoutParams()).f27221b.right;
    }

    public int getRowCountForAccessibility(k kVar, f1 f1Var) {
        return -1;
    }

    public int getSelectionModeForAccessibility(k kVar, f1 f1Var) {
        return 0;
    }

    public int getTopDecorationHeight(View view) {
        return ((w0) view.getLayoutParams()).f27221b.top;
    }

    public void getTransformedBoundingBox(View view, boolean z5, Rect rect) {
        Matrix matrix;
        if (z5) {
            Rect rect2 = ((w0) view.getLayoutParams()).f27221b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public boolean isAutoMeasureEnabled() {
        return this.mAutoMeasure;
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(k kVar, f1 f1Var) {
        return false;
    }

    public boolean isSmoothScrolling() {
        n nVar = this.mSmoothScroller;
        return nVar != null && nVar.isRunning();
    }

    public boolean isViewPartiallyVisible(View view, boolean z5, boolean z10) {
        boolean z11 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
        return z5 ? z11 : !z11;
    }

    public void layoutDecoratedWithMargins(View view, int i, int i10, int i11, int i12) {
        w0 w0Var = (w0) view.getLayoutParams();
        Rect rect = w0Var.f27221b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) w0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin);
    }

    public void measureChildWithMargins(View view, int i, int i10) {
        w0 w0Var = (w0) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin + i11, ((ViewGroup.MarginLayoutParams) w0Var).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) w0Var).topMargin + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) w0Var).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, w0Var)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i, int i10) {
        View childAt = getChildAt(i);
        if (childAt != null) {
            detachViewAt(i);
            attachView(childAt, i10);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i);
        }
    }

    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i10) {
        return false;
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public View onFocusSearchFailed(View view, int i, k kVar, f1 f1Var) {
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(h2.f fVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, fVar);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, h2.f fVar) {
        p childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
            return;
        }
        b bVar = this.mChildHelper;
        if (bVar.f1687c.contains(childViewHolderInt.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, fVar);
    }

    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i10) {
    }

    public abstract void onLayoutChildren(k kVar, f1 f1Var);

    public abstract void onLayoutCompleted(f1 f1Var);

    public void onMeasure(k kVar, f1 f1Var, int i, int i10) {
        this.mRecyclerView.defaultOnMeasure(i, i10);
    }

    @Deprecated
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        return isSmoothScrolling() || recyclerView.isComputingLayout();
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onSmoothScrollerStopped(n nVar) {
        if (this.mSmoothScroller == nVar) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
    }

    public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
    }

    public void removeAndRecycleAllViews(k kVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, kVar);
            }
        }
    }

    public void removeAndRecycleScrapInt(k kVar) {
        ArrayList arrayList = kVar.f1709a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((p) arrayList.get(i)).itemView;
            p childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                h hVar = this.mRecyclerView.mItemAnimator;
                if (hVar != null) {
                    hVar.d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                p childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                kVar.i(childViewHolderInt2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = kVar.f1710b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(View view, k kVar) {
        removeView(view);
        kVar.h(view);
    }

    public void removeAndRecycleViewAt(int i, k kVar) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        kVar.h(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeView(View view) {
        b bVar = this.mChildHelper;
        v7.f fVar = bVar.f1685a;
        int i = bVar.f1688d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            bVar.f1688d = 1;
            bVar.f1689e = view;
            int iIndexOfChild = ((RecyclerView) fVar.f34767c).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (bVar.f1686b.c0(iIndexOfChild)) {
                    bVar.j(view);
                }
                fVar.p(iIndexOfChild);
            }
            bVar.f1688d = 0;
            bVar.f1689e = null;
        } catch (Throwable th2) {
            bVar.f1688d = 0;
            bVar.f1689e = null;
            throw th2;
        }
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            b bVar = this.mChildHelper;
            v7.f fVar = bVar.f1685a;
            int i10 = bVar.f1688d;
            if (i10 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i10 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iF = bVar.f(i);
                View childAt = ((RecyclerView) fVar.f34767c).getChildAt(iF);
                if (childAt != null) {
                    bVar.f1688d = 1;
                    bVar.f1689e = childAt;
                    if (bVar.f1686b.c0(iF)) {
                        bVar.j(childAt);
                    }
                    fVar.p(iF);
                }
                bVar.f1688d = 0;
                bVar.f1689e = null;
            } catch (Throwable th2) {
                bVar.f1688d = 0;
                bVar.f1689e = null;
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.getWidth()
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.getHeight()
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb6
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lbb
        L80:
            int r1 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r3 = r8.getWidth()
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.getHeight()
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.mRecyclerView
            android.graphics.Rect r5 = r5.mTempRect
            r8.getDecoratedBoundsWithMargins(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lbb
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lbb
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lbb
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb6
            goto Lbb
        Lb6:
            if (r11 != 0) goto Lbc
            if (r10 == 0) goto Lbb
            goto Lbc
        Lbb:
            return r0
        Lbc:
            if (r12 == 0) goto Lc2
            r9.scrollBy(r11, r10)
            goto Lc5
        Lc2:
            r9.smoothScrollBy(r11, r10)
        Lc5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public abstract int scrollHorizontallyBy(int i, k kVar, f1 f1Var);

    public abstract void scrollToPosition(int i);

    public int scrollVerticallyBy(int i, k kVar, f1 f1Var) {
        return 0;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public void setMeasureSpecs(int i, int i10) {
        this.mWidth = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.mHeightMode = mode2;
        if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimension(Rect rect, int i, int i10) {
        setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i10, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i, int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.defaultOnMeasure(i, i10);
            return;
        }
        int i11 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.mRecyclerView.mTempRect.set(i14, i12, i11, i13);
        setMeasuredDimension(this.mRecyclerView.mTempRect, i, i10);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.mChildHelper;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i, int i10, w0 w0Var) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) w0Var).width) && b(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) w0Var).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i, int i10, w0 w0Var) {
        return (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) w0Var).width) && b(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) w0Var).height)) ? false : true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, f1 f1Var, int i);

    public void startSmoothScroll(n nVar) {
        n nVar2 = this.mSmoothScroller;
        if (nVar2 != null && nVar != nVar2 && nVar2.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = nVar;
        nVar.start(this.mRecyclerView, this);
    }

    public void stopSmoothScroller() {
        n nVar = this.mSmoothScroller;
        if (nVar != null) {
            nVar.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void addDisappearingView(View view, int i) {
        a(view, i, true);
    }

    public void addView(View view, int i) {
        a(view, i, false);
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, k kVar) {
        onDetachedFromWindow(recyclerView);
    }

    public void onInitializeAccessibilityEvent(k kVar, f1 f1Var, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z5 = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z5 = false;
        }
        accessibilityEvent.setScrollable(z5);
        g gVar = this.mRecyclerView.mAdapter;
        if (gVar != null) {
            accessibilityEvent.setItemCount(gVar.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(k kVar, f1 f1Var, h2.f fVar) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            fVar.a(8192);
            fVar.k(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            fVar.a(4096);
            fVar.k(true);
        }
        fVar.f20360a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCountForAccessibility(kVar, f1Var), getColumnCountForAccessibility(kVar, f1Var), isLayoutHierarchical(kVar, f1Var), getSelectionModeForAccessibility(kVar, f1Var)));
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i10, Object obj) {
        onItemsUpdated(recyclerView, i, i10);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, f1 f1Var, View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    public boolean performAccessibilityAction(k kVar, f1 f1Var, int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        int i10;
        int i11;
        if (this.mRecyclerView == null) {
            return false;
        }
        int height = getHeight();
        int width = getWidth();
        Rect rect = new Rect();
        if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
            height = rect.height();
            width = rect.width();
        }
        if (i == 4096) {
            paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.mRecyclerView.canScrollHorizontally(1)) {
                paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                i10 = paddingTop;
                i11 = paddingLeft;
            }
            i10 = paddingTop;
            i11 = 0;
        } else if (i != 8192) {
            i11 = 0;
            i10 = 0;
        } else {
            paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.mRecyclerView.canScrollHorizontally(-1)) {
                paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                i10 = paddingTop;
                i11 = paddingLeft;
            }
            i10 = paddingTop;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        this.mRecyclerView.smoothScrollBy(i11, i10, null, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, true);
        return true;
    }

    public boolean performAccessibilityActionForItem(k kVar, f1 f1Var, View view, int i, Bundle bundle) {
        return false;
    }

    public w0 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new w0(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(k kVar, f1 f1Var, View view, h2.f fVar) {
    }

    public void setMeasuredDimension(int i, int i10) {
        this.mRecyclerView.setMeasuredDimension(i, i10);
    }

    public void attachView(View view, int i) {
        attachView(view, i, (w0) view.getLayoutParams());
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z5) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z5, false);
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    public void onItemsChanged(RecyclerView recyclerView) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void collectInitialPrefetchPositions(int i, u0 u0Var) {
    }

    public void onAdapterChanged(g gVar, g gVar2) {
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i10) {
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i10) {
    }

    public void collectAdjacentPrefetchPositions(int i, int i10, f1 f1Var, u0 u0Var) {
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i10, int i11) {
    }
}
