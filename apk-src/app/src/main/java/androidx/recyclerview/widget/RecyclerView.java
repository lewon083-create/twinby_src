package androidx.recyclerview.widget;

import a0.b1;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.h0;
import g2.n0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.a1;
import k6.c1;
import k6.d1;
import k6.f1;
import k6.g1;
import k6.h1;
import k6.j1;
import k6.k0;
import k6.o0;
import k6.p0;
import k6.q0;
import k6.r0;
import k6.s0;
import k6.t1;
import k6.u1;
import k6.v1;
import k6.w;
import k6.w0;
import k6.x0;
import k6.y0;
import k6.z0;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView {
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static boolean sDebugAssertionsEnabled = false;
    static final g1 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    j1 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    g mAdapter;
    a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private p0 mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    d mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private z0 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    h mItemAnimator;
    private q0 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<s0> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    i mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final l mObserver;
    private List<x0> mOnChildAttachStateListeners;
    private y0 mOnFlingListener;
    private final ArrayList<z0> mOnItemTouchListeners;
    final List<p> mPendingAccessibilityImportanceChange;
    d1 mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    c mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final k mRecycler;
    final List<c1> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private a1 mScrollListener;
    private List<a1> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private g2.n mScrollingChildHelper;
    final f1 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final o mViewFlinger;
    private final u1 mViewInfoProcessCallback;
    final v1 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new k0(0);
        sDefaultEdgeEffectFactory = new g1();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.twinby.R.attr.recyclerViewStyle);
    }

    public static int b(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i > 0 && edgeEffect != null && j0.g.L(edgeEffect) != 0.0f) {
            int iRound = Math.round(j0.g.Q(edgeEffect, ((-i) * 4.0f) / i10, 0.5f) * ((-i10) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || j0.g.L(edgeEffect2) == 0.0f) {
            return i;
        }
        float f10 = i10;
        int iRound2 = Math.round(j0.g.Q(edgeEffect2, (i * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void clearNestedRecyclerViewIfNotNested(p pVar) {
        WeakReference<RecyclerView> weakReference = pVar.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == pVar.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            pVar.mNestedRecyclerView = null;
        }
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    public static p getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((w0) view.getLayoutParams()).f27220a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        w0 w0Var = (w0) view.getLayoutParams();
        Rect rect2 = w0Var.f27221b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) w0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) w0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin);
    }

    private g2.n getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new g2.n(this);
        }
        return this.mScrollingChildHelper;
    }

    public static void setDebugAssertionsEnabled(boolean z5) {
        sDebugAssertionsEnabled = z5;
    }

    public static void setVerboseLoggingEnabled(boolean z5) {
        sVerboseLoggingEnabled = z5;
    }

    public final void a(p pVar) {
        View view = pVar.itemView;
        boolean z5 = view.getParent() == this;
        this.mRecycler.l(getChildViewHolder(view));
        if (pVar.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z5) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        b bVar = this.mChildHelper;
        int iIndexOfChild = ((RecyclerView) bVar.f1685a.f34767c).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            bVar.f1686b.e0(iIndexOfChild);
            bVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void absorbGlows(int i, int i10) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i10 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i10);
            }
        }
        if (i == 0 && i10 == 0) {
            return;
        }
        Field field = n0.f19900a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i10) {
        i iVar = this.mLayout;
        if (iVar == null || !iVar.onAddFocusables(this, arrayList, i, i10)) {
            super.addFocusables(arrayList, i, i10);
        }
    }

    public void addItemDecoration(s0 s0Var, int i) {
        i iVar = this.mLayout;
        if (iVar != null) {
            iVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(s0Var);
        } else {
            this.mItemDecorations.add(i, s0Var);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(x0 x0Var) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(x0Var);
    }

    public void addOnItemTouchListener(z0 z0Var) {
        this.mOnItemTouchListeners.add(z0Var);
    }

    public void addOnScrollListener(a1 a1Var) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(a1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void animateAppearance(androidx.recyclerview.widget.p r8, k6.r0 r9, k6.r0 r10) {
        /*
            r7 = this;
            r0 = 0
            r8.setIsRecyclable(r0)
            androidx.recyclerview.widget.h r0 = r7.mItemAnimator
            r1 = r0
            k6.m r1 = (k6.m) r1
            if (r9 == 0) goto L1b
            r1.getClass()
            int r3 = r9.f27169a
            int r5 = r10.f27169a
            if (r3 != r5) goto L1d
            int r0 = r9.f27170b
            int r2 = r10.f27170b
            if (r0 == r2) goto L1b
            goto L1d
        L1b:
            r2 = r8
            goto L27
        L1d:
            int r4 = r9.f27170b
            int r6 = r10.f27170b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L36
        L27:
            r1.l(r2)
            android.view.View r8 = r2.itemView
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.i
            r8.add(r2)
            r8 = 1
        L36:
            if (r8 == 0) goto L3b
            r7.postAnimationRunner()
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.animateAppearance(androidx.recyclerview.widget.p, k6.r0, k6.r0):void");
    }

    public void animateDisappearance(p pVar, r0 r0Var, r0 r0Var2) {
        boolean zG;
        a(pVar);
        pVar.setIsRecyclable(false);
        k6.m mVar = (k6.m) this.mItemAnimator;
        mVar.getClass();
        int i = r0Var.f27169a;
        int i10 = r0Var.f27170b;
        View view = pVar.itemView;
        int left = r0Var2 == null ? view.getLeft() : r0Var2.f27169a;
        int top = r0Var2 == null ? view.getTop() : r0Var2.f27170b;
        if (pVar.isRemoved() || (i == left && i10 == top)) {
            mVar.l(pVar);
            mVar.f27119h.add(pVar);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = mVar.g(pVar, i, i10, left, top);
        }
        if (zG) {
            postAnimationRunner();
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(gf.a.i(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(gf.a.i(this, new StringBuilder(""))));
        }
    }

    public final void c() {
        t1 t1Var;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        v1 v1Var = this.mViewInfoStore;
        v1Var.f27193a.clear();
        v1Var.f27194b.a();
        onEnterLayoutOrScroll();
        h();
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        p pVarFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (pVarFindContainingViewHolder == null) {
            f1 f1Var = this.mState;
            f1Var.f27075m = -1L;
            f1Var.f27074l = -1;
            f1Var.f27076n = -1;
        } else {
            this.mState.f27075m = this.mAdapter.hasStableIds() ? pVarFindContainingViewHolder.getItemId() : -1L;
            this.mState.f27074l = this.mDataSetHasChangedAfterLayout ? -1 : pVarFindContainingViewHolder.isRemoved() ? pVarFindContainingViewHolder.mOldPosition : pVarFindContainingViewHolder.getAbsoluteAdapterPosition();
            f1 f1Var2 = this.mState;
            View focusedChild2 = pVarFindContainingViewHolder.itemView;
            int id2 = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id2 = focusedChild2.getId();
                }
            }
            f1Var2.f27076n = id2;
        }
        f1 f1Var3 = this.mState;
        f1Var3.f27071h = f1Var3.f27072j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        f1Var3.f27070g = f1Var3.f27073k;
        f1Var3.f27068e = this.mAdapter.getItemCount();
        f(this.mMinMaxLayoutPositions);
        if (this.mState.f27072j) {
            int iE = this.mChildHelper.e();
            for (int i = 0; i < iE; i++) {
                p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    h hVar = this.mItemAnimator;
                    h.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    hVar.getClass();
                    r0 r0Var = new r0();
                    r0Var.a(childViewHolderInt);
                    h1.i iVar = this.mViewInfoStore.f27193a;
                    t1 t1VarA = (t1) iVar.get(childViewHolderInt);
                    if (t1VarA == null) {
                        t1VarA = t1.a();
                        iVar.put(childViewHolderInt, t1VarA);
                    }
                    t1VarA.f27183b = r0Var;
                    t1VarA.f27182a |= 4;
                    if (this.mState.f27071h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f27194b.d(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f27073k) {
            saveOldPositions();
            f1 f1Var4 = this.mState;
            boolean z5 = f1Var4.f27069f;
            f1Var4.f27069f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, f1Var4);
            this.mState.f27069f = z5;
            for (int i10 = 0; i10 < this.mChildHelper.e(); i10++) {
                p childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i10));
                if (!childViewHolderInt2.shouldIgnore() && ((t1Var = (t1) this.mViewInfoStore.f27193a.get(childViewHolderInt2)) == null || (t1Var.f27182a & 4) == 0)) {
                    h.b(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    h hVar2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    hVar2.getClass();
                    r0 r0Var2 = new r0();
                    r0Var2.a(childViewHolderInt2);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, r0Var2);
                    } else {
                        h1.i iVar2 = this.mViewInfoStore.f27193a;
                        t1 t1VarA2 = (t1) iVar2.get(childViewHolderInt2);
                        if (t1VarA2 == null) {
                            t1VarA2 = t1.a();
                            iVar2.put(childViewHolderInt2, t1VarA2);
                        }
                        t1VarA2.f27182a |= 2;
                        t1VarA2.f27183b = r0Var2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f27067d = 2;
    }

    public boolean canReuseUpdatedViewHolder(p pVar) {
        h hVar = this.mItemAnimator;
        if (hVar != null) {
            return (pVar.getUnmodifiedPayloads().isEmpty() && ((k6.m) hVar).f27118g && !pVar.isInvalid()) ? false : true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof w0) && this.mLayout.checkLayoutParams((w0) layoutParams);
    }

    public void clearOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i = 0; i < iH; i++) {
            p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        k kVar = this.mRecycler;
        ArrayList arrayList = kVar.f1709a;
        ArrayList arrayList2 = kVar.f1711c;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) arrayList2.get(i10)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((p) arrayList.get(i11)).clearOldPosition();
        }
        ArrayList arrayList3 = kVar.f1710b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((p) kVar.f1710b.get(i12)).clearOldPosition();
            }
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        i iVar = this.mLayout;
        if (iVar != null && iVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        i iVar = this.mLayout;
        if (iVar != null && iVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        i iVar = this.mLayout;
        if (iVar != null && iVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        i iVar = this.mLayout;
        if (iVar != null && iVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        i iVar = this.mLayout;
        if (iVar != null && iVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        i iVar = this.mLayout;
        if (iVar != null && iVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i10) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            Field field = n0.f19900a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return b(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return b(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = c2.j.f2200a;
            Trace.beginSection("RV FullInvalidate");
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            a aVar = this.mAdapterHelper;
            int i10 = aVar.f1684f;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (aVar.g()) {
                    int i11 = c2.j.f2200a;
                    Trace.beginSection("RV FullInvalidate");
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i12 = c2.j.f2200a;
            Trace.beginSection("RV PartialInvalidate");
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                int iE = this.mChildHelper.e();
                int i13 = 0;
                while (true) {
                    if (i13 < iE) {
                        p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i13));
                        if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                            dispatchLayout();
                            break;
                        }
                        i13++;
                    } else {
                        this.mAdapterHelper.b();
                        break;
                    }
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public final void d() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f27068e = this.mAdapter.getItemCount();
        this.mState.f27066c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f27050d;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        f1 f1Var = this.mState;
        f1Var.f27070g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, f1Var);
        f1 f1Var2 = this.mState;
        f1Var2.f27069f = false;
        f1Var2.f27072j = f1Var2.f27072j && this.mItemAnimator != null;
        f1Var2.f27067d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    public void defaultOnMeasure(int i, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = n0.f19900a;
        setMeasuredDimension(i.chooseSize(i, paddingRight, getMinimumWidth()), i.chooseSize(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        p childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<x0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((y6.f) this.mOnChildAttachStateListeners.get(size)).getClass();
                w0 w0Var = (w0) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) w0Var).width != -1 || ((ViewGroup.MarginLayoutParams) w0Var).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public void dispatchChildDetached(View view) {
        p childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<x0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).getClass();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchLayout() {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.dispatchLayout():void");
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z5) {
        return getScrollingChildHelper().a(f10, f11, z5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i, i10, i11, i12, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i) {
        i iVar = this.mLayout;
        if (iVar != null) {
            iVar.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        a1 a1Var = this.mScrollListener;
        if (a1Var != null) {
            a1Var.onScrollStateChanged(this, i);
        }
        List<a1> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i10) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i10);
        onScrolled(i, i10);
        a1 a1Var = this.mScrollListener;
        if (a1Var != null) {
            a1Var.a(this, i, i10);
        }
        List<a1> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i, i10);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            p pVar = this.mPendingAccessibilityImportanceChange.get(size);
            if (pVar.itemView.getParent() == this && !pVar.shouldIgnore() && (i = pVar.mPendingAccessibilityState) != -1) {
                View view = pVar.itemView;
                Field field = n0.f19900a;
                view.setImportantForAccessibility(i);
                pVar.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z5;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z10 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z5 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z5 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z5 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z5 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z5 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z5 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) ? z5 : true) {
            Field field = n0.f19900a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList<k6.z0> r1 = r11.mOnItemTouchListeners
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L69
            java.util.ArrayList<k6.z0> r4 = r11.mOnItemTouchListeners
            java.lang.Object r4 = r4.get(r3)
            k6.z0 r4 = (k6.z0) r4
            r5 = r4
            k6.w r5 = (k6.w) r5
            int r6 = r5.f27215v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L5e
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.b(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.a(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L66
            if (r6 != 0) goto L41
            if (r9 == 0) goto L66
        L41:
            if (r9 == 0) goto L4e
            r5.f27216w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f27209p = r6
            goto L5a
        L4e:
            if (r6 == 0) goto L5a
            r5.f27216w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f27206m = r6
        L5a:
            r5.d(r8)
            goto L60
        L5e:
            if (r6 != r8) goto L66
        L60:
            r5 = 3
            if (r0 == r5) goto L66
            r11.mInterceptingOnItemTouchListener = r4
            return r7
        L66:
            int r3 = r3 + 1
            goto Lc
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.e(android.view.MotionEvent):boolean");
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((g1) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((g1) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((g1) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((g1) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void f(int[] iArr) {
        int iE = this.mChildHelper.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i10 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        for (int i11 = 0; i11 < iE; i11++) {
            p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i10) {
                    i10 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i10;
    }

    public final void fillRemainingScrollValues(f1 f1Var) {
        if (getScrollState() != 2) {
            f1Var.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f1727d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        f1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public p findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public p findViewHolderForAdapterPosition(int i) {
        p pVar = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                b bVar = this.mChildHelper;
                if (!bVar.f1687c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                pVar = childViewHolderInt;
            }
        }
        return pVar;
    }

    public p findViewHolderForItemId(long j10) {
        g gVar = this.mAdapter;
        p pVar = null;
        if (gVar != null && gVar.hasStableIds()) {
            int iH = this.mChildHelper.h();
            for (int i = 0; i < iH; i++) {
                p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    b bVar = this.mChildHelper;
                    if (!bVar.f1687c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    pVar = childViewHolderInt;
                }
            }
        }
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.p findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.mChildHelper
            int r0 = r0.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3c
            androidx.recyclerview.widget.b r3 = r5.mChildHelper
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.p r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L39
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L39
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L39
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L39
        L2a:
            androidx.recyclerview.widget.b r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            java.util.ArrayList r1 = r1.f1687c
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L38
            r1 = r3
            goto L39
        L38:
            return r3
        L39:
            int r2 = r2 + 1
            goto L8
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.p");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i, int i10) {
        int iMax;
        int i11;
        i iVar = this.mLayout;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = iVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i10) < this.mMinFlingVelocity) {
            i10 = 0;
        }
        if (i == 0 && i10 == 0) {
            return false;
        }
        if (i == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || j0.g.L(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && j0.g.L(edgeEffect2) != 0.0f) {
                    if (m(this.mRightGlow, i, getWidth())) {
                        this.mRightGlow.onAbsorb(i);
                        i = 0;
                    }
                    iMax = i;
                    i = 0;
                }
                iMax = 0;
            } else {
                int i12 = -i;
                if (m(this.mLeftGlow, i12, getWidth())) {
                    this.mLeftGlow.onAbsorb(i12);
                    i = 0;
                }
                iMax = i;
                i = 0;
            }
        }
        if (i10 == 0) {
            i11 = i10;
            i10 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || j0.g.L(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 != null && j0.g.L(edgeEffect4) != 0.0f) {
                    if (m(this.mBottomGlow, i10, getHeight())) {
                        this.mBottomGlow.onAbsorb(i10);
                        i10 = 0;
                    }
                    i11 = 0;
                }
                i11 = i10;
                i10 = 0;
            } else {
                int i13 = -i10;
                if (m(this.mTopGlow, i13, getHeight())) {
                    this.mTopGlow.onAbsorb(i13);
                    i10 = 0;
                }
                i11 = 0;
            }
        }
        if (iMax != 0 || i10 != 0) {
            int i14 = this.mMaxFlingVelocity;
            iMax = Math.max(-i14, Math.min(iMax, i14));
            int i15 = this.mMaxFlingVelocity;
            i10 = Math.max(-i15, Math.min(i10, i15));
            this.mViewFlinger.a(iMax, i10);
        }
        if (i == 0 && i11 == 0) {
            return (iMax == 0 && i10 == 0) ? false : true;
        }
        float f10 = i;
        float f11 = i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z5 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f10, f11, z5);
            y0 y0Var = this.mOnFlingListener;
            if (y0Var != null && y0Var.onFling(i, i11)) {
                return true;
            }
            if (z5) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i16 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i16, Math.min(i, i16));
                int i17 = this.mMaxFlingVelocity;
                this.mViewFlinger.a(iMax2, Math.max(-i17, Math.min(i11, i17)));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x017e, code lost:
    
        if (r16 > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0195, code lost:
    
        if (r5 > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0198, code lost:
    
        if (r16 < 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019b, code lost:
    
        if (r5 < 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a3, code lost:
    
        if ((r5 * r6) <= 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ab, code lost:
    
        if ((r5 * r6) >= 0) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0128  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x10 = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y7 = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y7;
            this.mInitialTouchY = y7;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        i iVar = this.mLayout;
        if (iVar != null) {
            return iVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(gf.a.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        i iVar = this.mLayout;
        if (iVar != null) {
            return iVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(gf.a.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(p pVar) {
        if (pVar.hasAnyOfTheFlags(524) || !pVar.isBound()) {
            return -1;
        }
        a aVar = this.mAdapterHelper;
        int i = pVar.mPosition;
        ArrayList arrayList = aVar.f1680b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k6.a aVar2 = (k6.a) arrayList.get(i10);
            int i11 = aVar2.f27019a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = aVar2.f27020b;
                    if (i12 <= i) {
                        int i13 = aVar2.f27022d;
                        if (i12 + i13 > i) {
                            return -1;
                        }
                        i -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = aVar2.f27020b;
                    if (i14 == i) {
                        i = aVar2.f27022d;
                    } else {
                        if (i14 < i) {
                            i--;
                        }
                        if (aVar2.f27022d <= i) {
                            i++;
                        }
                    }
                }
            } else if (aVar2.f27020b <= i) {
                i += aVar2.f27022d;
            }
        }
        return i;
    }

    @Override // android.view.View
    public int getBaseline() {
        i iVar = this.mLayout;
        return iVar != null ? iVar.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(p pVar) {
        return this.mAdapter.hasStableIds() ? pVar.getItemId() : pVar.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        p childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i10) {
        return super.getChildDrawingOrder(i, i10);
    }

    public int getChildLayoutPosition(View view) {
        p childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public p getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public j1 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public p0 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public h getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        w0 w0Var = (w0) view.getLayoutParams();
        boolean z5 = w0Var.f27222c;
        Rect rect = w0Var.f27221b;
        if (!z5 || (this.mState.f27070g && (w0Var.f27220a.isUpdated() || w0Var.f27220a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i10 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        w0Var.f27222c = false;
        return rect;
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public i getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public y0 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public j getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public final void h() {
        boolean z5;
        boolean z10 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            a aVar = this.mAdapterHelper;
            aVar.k(aVar.f1680b);
            aVar.k(aVar.f1681c);
            aVar.f1684f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (this.mItemAnimator == null || !this.mLayout.supportsPredictiveItemAnimations()) {
            this.mAdapterHelper.c();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z11 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f27072j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z5 = this.mDataSetHasChangedAfterLayout) || z11 || this.mLayout.mRequestedSimpleAnimations) && (!z5 || this.mAdapter.hasStableIds());
        f1 f1Var = this.mState;
        if (f1Var.f27072j && z11 && !this.mDataSetHasChangedAfterLayout && this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            z10 = true;
        }
        f1Var.f27073k = z10;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public final int i(float f10, int i) {
        float height = f10 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = 0.0f;
        if (edgeEffect == null || j0.g.L(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && j0.g.L(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fQ = j0.g.Q(this.mRightGlow, width, height);
                    if (j0.g.L(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = fQ;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -j0.g.Q(this.mLeftGlow, -width, 1.0f - height);
                if (j0.g.L(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new a(new f(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(gf.a.i(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new w(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.twinby.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.twinby.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.twinby.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f19898d;
    }

    public final int j(float f10, int i) {
        float width = f10 / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = 0.0f;
        if (edgeEffect == null || j0.g.L(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && j0.g.L(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fQ = j0.g.Q(this.mBottomGlow, height, 1.0f - width);
                    if (j0.g.L(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = fQ;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -j0.g.Q(this.mTopGlow, -height, width);
                if (j0.g.L(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public final void k(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof w0) {
            w0 w0Var = (w0) layoutParams;
            if (!w0Var.f27222c) {
                Rect rect = w0Var.f27221b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    public final void l() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            Field field = n0.f19900a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean m(EdgeEffect edgeEffect, int i, int i10) {
        if (i > 0) {
            return true;
        }
        float fL = j0.g.L(edgeEffect) * i10;
        double dLog = Math.log((Math.abs(-i) * 0.35f) / (this.mPhysicalCoef * 0.015f));
        double d10 = DECELERATION_RATE;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * 0.015f)))) < fL;
    }

    public void markItemDecorInsetsDirty() {
        int iH = this.mChildHelper.h();
        for (int i = 0; i < iH; i++) {
            ((w0) this.mChildHelper.g(i).getLayoutParams()).f27222c = true;
        }
        ArrayList arrayList = this.mRecycler.f1711c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            w0 w0Var = (w0) ((p) arrayList.get(i10)).itemView.getLayoutParams();
            if (w0Var != null) {
                w0Var.f27222c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iH = this.mChildHelper.h();
        for (int i = 0; i < iH; i++) {
            p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        k kVar = this.mRecycler;
        ArrayList arrayList = kVar.f1711c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) arrayList.get(i10);
            if (pVar != null) {
                pVar.addFlags(6);
                pVar.addChangePayload(null);
            }
        }
        g gVar = kVar.f1716h.mAdapter;
        if (gVar == null || !gVar.hasStableIds()) {
            kVar.f();
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            this.mChildHelper.d(i10).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            this.mChildHelper.d(i10).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i10) {
        int iH = this.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i11 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i10));
                }
                childViewHolderInt.offsetPosition(i10, false);
                this.mState.f27069f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f1711c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            p pVar = (p) arrayList.get(i12);
            if (pVar != null && pVar.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + pVar + " now at position " + (pVar.mPosition + i10));
                }
                pVar.offsetPosition(i10, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iH = this.mChildHelper.h();
        int i18 = -1;
        if (i < i10) {
            i12 = i;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < iH; i19++) {
            p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i19));
            if (childViewHolderInt != null && (i17 = childViewHolderInt.mPosition) >= i12 && i17 <= i11) {
                if (sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i19 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i10 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i13, false);
                }
                this.mState.f27069f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f1711c;
        if (i < i10) {
            i15 = i;
            i14 = i10;
        } else {
            i14 = i;
            i18 = 1;
            i15 = i10;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            p pVar = (p) arrayList.get(i20);
            if (pVar != null && (i16 = pVar.mPosition) >= i15 && i16 <= i14) {
                if (i16 == i) {
                    pVar.offsetPosition(i10 - i, false);
                } else {
                    pVar.offsetPosition(i18, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i20 + " holder " + pVar);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i10, boolean z5) {
        int i11 = i + i10;
        int iH = this.mChildHelper.h();
        for (int i12 = 0; i12 < iH; i12++) {
            p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i13 = childViewHolderInt.mPosition;
                if (i13 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i10));
                    }
                    childViewHolderInt.offsetPosition(-i10, z5);
                    this.mState.f27069f = true;
                } else if (i13 >= i) {
                    if (sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i10, z5);
                    this.mState.f27069f = true;
                }
            }
        }
        k kVar = this.mRecycler;
        ArrayList arrayList = kVar.f1711c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p pVar = (p) arrayList.get(size);
            if (pVar != null) {
                int i14 = pVar.mPosition;
                if (i14 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + pVar + " now at position " + (pVar.mPosition - i10));
                    }
                    pVar.offsetPosition(-i10, z5);
                } else if (i14 >= i) {
                    pVar.addFlags(8);
                    kVar.g(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.k r1 = r5.mRecycler
            r1.e()
            androidx.recyclerview.widget.i r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L8b
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.d.f1694f
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.d r1 = (androidx.recyclerview.widget.d) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L71
            androidx.recyclerview.widget.d r1 = new androidx.recyclerview.widget.d
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1696b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1699e = r2
            r5.mGapWorker = r1
            java.lang.reflect.Field r1 = g2.n0.f19900a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L63
            if (r1 == 0) goto L63
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L63
            goto L65
        L63:
            r1 = 1114636288(0x42700000, float:60.0)
        L65:
            androidx.recyclerview.widget.d r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f1698d = r3
            r0.set(r2)
        L71:
            androidx.recyclerview.widget.d r0 = r5.mGapWorker
            java.util.ArrayList r0 = r0.f1696b
            boolean r1 = androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled
            if (r1 == 0) goto L88
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L80
            goto L88
        L80:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L88:
            r0.add(r5)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d dVar;
        ArrayList arrayList;
        int iE;
        super.onDetachedFromWindow();
        h hVar = this.mItemAnimator;
        if (hVar != null) {
            hVar.e();
        }
        stopScroll();
        this.mIsAttached = false;
        i iVar = this.mLayout;
        if (iVar != null) {
            iVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (t1.f27181d.a() != null) {
        }
        k kVar = this.mRecycler;
        ArrayList arrayList2 = kVar.f1711c;
        for (int i = 0; i < arrayList2.size(); i++) {
            h5.c(((p) arrayList2.get(i)).itemView);
        }
        g gVar = kVar.f1716h.mAdapter;
        j jVar = kVar.f1715g;
        if (jVar != null) {
            jVar.detachForPoolingContainer(gVar, false);
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        Iterator it = new g2.q0(this).iterator();
        do {
            g2.r0 r0Var = (g2.r0) it;
            if (!r0Var.hasNext()) {
                if (!ALLOW_THREAD_GAP_WORK || (dVar = this.mGapWorker) == null) {
                    return;
                }
                boolean zRemove = dVar.f1696b.remove(this);
                if (sDebugAssertionsEnabled && !zRemove) {
                    throw new IllegalStateException("RecyclerView removal failed!");
                }
                this.mGapWorker = null;
                return;
            }
            View view = (View) r0Var.next();
            l2.a aVar = (l2.a) view.getTag(com.twinby.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new l2.a();
                view.setTag(com.twinby.R.id.pooling_container_listener_holder_tag, aVar);
            }
            arrayList = aVar.f27748a;
            iE = s.e(arrayList);
        } while (-1 >= iE);
        arrayList.get(iE).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z10;
        if (!this.mLayoutSuppressed) {
            this.mInterceptingOnItemTouchListener = null;
            if (e(motionEvent)) {
                l();
                setScrollState(0);
                return true;
            }
            i iVar = this.mLayout;
            if (iVar != null) {
                boolean zCanScrollHorizontally = iVar.canScrollHorizontally();
                boolean zCanScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x10;
                    this.mInitialTouchX = x10;
                    int y7 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y7;
                    this.mInitialTouchY = y7;
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || j0.g.L(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z5 = false;
                    } else {
                        j0.g.Q(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z5 = true;
                    }
                    EdgeEffect edgeEffect2 = this.mRightGlow;
                    boolean z11 = z5;
                    if (edgeEffect2 != null) {
                        z11 = z5;
                        if (j0.g.L(edgeEffect2) != 0.0f) {
                            z11 = z5;
                            if (!canScrollHorizontally(1)) {
                                j0.g.Q(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
                                z11 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    boolean z12 = z11;
                    if (edgeEffect3 != null) {
                        z12 = z11;
                        if (j0.g.L(edgeEffect3) != 0.0f) {
                            z12 = z11;
                            if (!canScrollVertically(-1)) {
                                j0.g.Q(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
                                z12 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    boolean z13 = z12;
                    if (edgeEffect4 != null) {
                        z13 = z12;
                        if (j0.g.L(edgeEffect4) != 0.0f) {
                            z13 = z12;
                            if (!canScrollVertically(1)) {
                                j0.g.Q(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z13 = true;
                            }
                        }
                    }
                    if (z13 || this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        stopNestedScroll(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zCanScrollHorizontally;
                    if (zCanScrollVertically) {
                        i = (zCanScrollHorizontally ? 1 : 0) | 2;
                    }
                    startNestedScroll(i, 0);
                } else if (actionMasked == 1) {
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i10 = x11 - this.mInitialTouchX;
                        int i11 = y10 - this.mInitialTouchY;
                        if (!zCanScrollHorizontally || Math.abs(i10) <= this.mTouchSlop) {
                            z10 = false;
                        } else {
                            this.mLastTouchX = x11;
                            z10 = true;
                        }
                        if (zCanScrollVertically && Math.abs(i11) > this.mTouchSlop) {
                            this.mLastTouchY = y10;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    l();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x12;
                    this.mInitialTouchX = x12;
                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y11;
                    this.mInitialTouchY = y11;
                } else if (actionMasked == 6) {
                    g(motionEvent);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        int i13 = c2.j.f2200a;
        Trace.beginSection("RV OnLayout");
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i10) {
        i iVar = this.mLayout;
        if (iVar == null) {
            defaultOnMeasure(i, i10);
            return;
        }
        boolean z5 = false;
        if (iVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z5 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z5;
            if (z5 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f27067d == 1) {
                c();
            }
            this.mLayout.setMeasureSpecs(i, i10);
            this.mState.i = true;
            d();
            this.mLayout.setMeasuredDimensionFromChildren(i, i10);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.i = true;
                d();
                this.mLayout.setMeasuredDimensionFromChildren(i, i10);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i10);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            h();
            onExitLayoutOrScroll();
            f1 f1Var = this.mState;
            if (f1Var.f27073k) {
                f1Var.f27070g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f27070g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f27073k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.mAdapter;
        if (gVar != null) {
            this.mState.f27068e = gVar.getItemCount();
        } else {
            this.mState.f27068e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i10);
        stopInterceptRequestLayout(false);
        this.mState.f27070g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d1 d1Var = (d1) parcelable;
        this.mPendingSavedState = d1Var;
        super.onRestoreInstanceState(d1Var.f28536b);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d1 d1Var = new d1(super.onSaveInstanceState());
        d1 d1Var2 = this.mPendingSavedState;
        if (d1Var2 != null) {
            d1Var.f27050d = d1Var2.f27050d;
            return d1Var;
        }
        i iVar = this.mLayout;
        if (iVar != null) {
            d1Var.f27050d = iVar.onSaveInstanceState();
            return d1Var;
        }
        d1Var.f27050d = null;
        return d1Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        if (i == i11 && i10 == i12) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb A[PHI: r1
      0x01fb: PHI (r1v54 int) = (r1v34 int), (r1v58 int) binds: [B:89:0x01e4, B:93:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fe  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        Field field = n0.f19900a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z5) {
        this.mDispatchItemsChangedEvent = z5 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(p pVar, r0 r0Var) {
        pVar.setFlags(0, 8192);
        if (this.mState.f27071h && pVar.isUpdated() && !pVar.isRemoved() && !pVar.shouldIgnore()) {
            this.mViewInfoStore.f27194b.d(getChangedHolderKey(pVar), pVar);
        }
        h1.i iVar = this.mViewInfoStore.f27193a;
        t1 t1VarA = (t1) iVar.get(pVar);
        if (t1VarA == null) {
            t1VarA = t1.a();
            iVar.put(pVar, t1VarA);
        }
        t1VarA.f27183b = r0Var;
        t1VarA.f27182a |= 4;
    }

    public void removeAndRecycleViews() {
        h hVar = this.mItemAnimator;
        if (hVar != null) {
            hVar.e();
        }
        i iVar = this.mLayout;
        if (iVar != null) {
            iVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        k kVar = this.mRecycler;
        kVar.f1709a.clear();
        kVar.f();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        b bVar = this.mChildHelper;
        com.google.android.gms.ads.identifier.c cVar = bVar.f1686b;
        v7.f fVar = bVar.f1685a;
        int i = bVar.f1688d;
        boolean z5 = false;
        z5 = false;
        if (i == 1) {
            if (bVar.f1689e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
        } else {
            if (i == 2) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
            }
            try {
                bVar.f1688d = 2;
                int iIndexOfChild = ((RecyclerView) fVar.f34767c).indexOfChild(view);
                if (iIndexOfChild == -1) {
                    bVar.j(view);
                } else if (cVar.Z(iIndexOfChild)) {
                    cVar.c0(iIndexOfChild);
                    bVar.j(view);
                    fVar.p(iIndexOfChild);
                }
                bVar.f1688d = 0;
                z5 = true;
            } finally {
                bVar.f1688d = 0;
            }
        }
        if (z5) {
            p childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.l(childViewHolderInt);
            this.mRecycler.i(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!z5);
        return z5;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z5) {
        p childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(gf.a.i(this, sb2));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(gf.a.i(this, sb3));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z5);
    }

    public void removeItemDecoration(s0 s0Var) {
        i iVar = this.mLayout;
        if (iVar != null) {
            iVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(s0Var);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeOnItemTouchListener(z0 z0Var) {
        this.mOnItemTouchListeners.remove(z0Var);
        if (this.mInterceptingOnItemTouchListener == z0Var) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(a1 a1Var) {
        List<a1> list = this.mScrollListeners;
        if (list != null) {
            list.remove(a1Var);
        }
    }

    public void repositionShadowingViews() {
        p pVar;
        int iE = this.mChildHelper.e();
        for (int i = 0; i < iE; i++) {
            View viewD = this.mChildHelper.d(i);
            p childViewHolder = getChildViewHolder(viewD);
            if (childViewHolder != null && (pVar = childViewHolder.mShadowingHolder) != null) {
                View view = pVar.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            k(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i = 0; i < iH; i++) {
            p childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(gf.a.i(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i10) {
        i iVar = this.mLayout;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = iVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i10 = 0;
            }
            scrollByInternal(i, i10, null, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean scrollByInternal(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.scrollByInternal(int, int, android.view.MotionEvent, int):boolean");
    }

    public void scrollStep(int i, int i10, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i11 = c2.j.f2200a;
        Trace.beginSection("RV Scroll");
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i10 != 0 ? this.mLayout.scrollVerticallyBy(i10, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        i iVar = this.mLayout;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            iVar.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(j1 j1Var) {
        this.mAccessibilityDelegate = j1Var;
        n0.k(this, j1Var);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        removeAndRecycleViews();
        a aVar = this.mAdapterHelper;
        aVar.k(aVar.f1680b);
        aVar.k(aVar.f1681c);
        aVar.f1684f = 0;
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.mObserver);
            gVar.onAttachedToRecyclerView(this);
        }
        i iVar = this.mLayout;
        if (iVar != null) {
            iVar.onAdapterChanged(gVar3, this.mAdapter);
        }
        k kVar = this.mRecycler;
        g gVar4 = this.mAdapter;
        kVar.f1709a.clear();
        kVar.f();
        j jVar = kVar.f1715g;
        if (jVar != null) {
            jVar.detachForPoolingContainer(gVar3, true);
        }
        kVar.c().onAdapterChanged(gVar3, gVar4, false);
        kVar.e();
        this.mState.f27069f = true;
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(o0 o0Var) {
        if (o0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(p pVar, int i) {
        if (isComputingLayout()) {
            pVar.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(pVar);
            return false;
        }
        View view = pVar.itemView;
        Field field = n0.f19900a;
        view.setImportantForAccessibility(i);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z5) {
        if (z5 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z5;
        super.setClipToPadding(z5);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(p0 p0Var) {
        p0Var.getClass();
        this.mEdgeEffectFactory = p0Var;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z5) {
        this.mHasFixedSize = z5;
    }

    public void setItemAnimator(h hVar) {
        h hVar2 = this.mItemAnimator;
        if (hVar2 != null) {
            hVar2.e();
            this.mItemAnimator.f1703a = null;
        }
        this.mItemAnimator = hVar;
        if (hVar != null) {
            hVar.f1703a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        k kVar = this.mRecycler;
        kVar.f1713e = i;
        kVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z5) {
        suppressLayout(z5);
    }

    public void setLayoutManager(i iVar) {
        if (iVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            h hVar = this.mItemAnimator;
            if (hVar != null) {
                hVar.e();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            k kVar = this.mRecycler;
            kVar.f1709a.clear();
            kVar.f();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            k kVar2 = this.mRecycler;
            kVar2.f1709a.clear();
            kVar2.f();
        }
        b bVar = this.mChildHelper;
        RecyclerView recyclerView = (RecyclerView) bVar.f1685a.f34767c;
        bVar.f1686b.d0();
        ArrayList arrayList = bVar.f1687c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = iVar;
        if (iVar != null) {
            if (iVar.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(iVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(gf.a.i(iVar.mRecyclerView, sb2));
            }
            iVar.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        g2.n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f19898d) {
            ViewGroup viewGroup = scrollingChildHelper.f19897c;
            Field field = n0.f19900a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f19898d = z5;
    }

    public void setOnFlingListener(y0 y0Var) {
        this.mOnFlingListener = y0Var;
    }

    @Deprecated
    public void setOnScrollListener(a1 a1Var) {
        this.mScrollListener = a1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z5) {
        this.mPreserveFocusAfterLayout = z5;
    }

    public void setRecycledViewPool(j jVar) {
        k kVar = this.mRecycler;
        RecyclerView recyclerView = kVar.f1716h;
        g gVar = recyclerView.mAdapter;
        j jVar2 = kVar.f1715g;
        if (jVar2 != null) {
            jVar2.detachForPoolingContainer(gVar, false);
        }
        j jVar3 = kVar.f1715g;
        if (jVar3 != null) {
            jVar3.detach();
        }
        kVar.f1715g = jVar;
        if (jVar != null && recyclerView.getAdapter() != null) {
            kVar.f1715g.attach();
        }
        kVar.e();
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder sbM = l7.o.m(i, "setting scroll state to ", " from ");
            sbM.append(this.mScrollState);
            Log.d("RecyclerView", sbM.toString(), new Exception());
        }
        this.mScrollState = i;
        if (i != 2) {
            o oVar = this.mViewFlinger;
            oVar.f1731h.removeCallbacks(oVar);
            oVar.f1727d.abortAnimation();
            i iVar = this.mLayout;
            if (iVar != null) {
                iVar.stopSmoothScroller();
            }
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(h1 h1Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i, int i10) {
        smoothScrollBy(i, i10, null);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        i iVar = this.mLayout;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            iVar.smoothScrollToPosition(this, this.mState, i);
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    public void stopInterceptRequestLayout(boolean z5) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException(gf.a.i(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z5 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z5 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        o oVar = this.mViewFlinger;
        oVar.f1731h.removeCallbacks(oVar);
        oVar.f1727d.abortAnimation();
        i iVar = this.mLayout;
        if (iVar != null) {
            iVar.stopSmoothScroller();
        }
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z5) {
        if (z5 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z5) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void viewRangeUpdate(int i, int i10, Object obj) {
        int i11;
        int i12;
        int iH = this.mChildHelper.h();
        int i13 = i10 + i;
        for (int i14 = 0; i14 < iH; i14++) {
            View viewG = this.mChildHelper.g(i14);
            p childViewHolderInt = getChildViewHolderInt(viewG);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((w0) viewG.getLayoutParams()).f27222c = true;
            }
        }
        k kVar = this.mRecycler;
        ArrayList arrayList = kVar.f1711c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p pVar = (p) arrayList.get(size);
            if (pVar != null && (i11 = pVar.mPosition) >= i && i11 < i13) {
                pVar.addFlags(2);
                kVar.g(size);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fA;
        Constructor constructor;
        super(context, attributeSet, i);
        this.mObserver = new l(this);
        this.mRecycler = new k(this);
        this.mViewInfoStore = new v1();
        this.mUpdateChildViewsRunnable = new e(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        k6.m mVar = new k6.m();
        Object[] objArr = null;
        mVar.f1703a = null;
        mVar.f1704b = new ArrayList();
        mVar.f1705c = 120L;
        mVar.f1706d = 120L;
        mVar.f1707e = 250L;
        mVar.f1708f = 250L;
        int i10 = 1;
        mVar.f27118g = true;
        mVar.f27119h = new ArrayList();
        mVar.i = new ArrayList();
        mVar.f27120j = new ArrayList();
        mVar.f27121k = new ArrayList();
        mVar.f27122l = new ArrayList();
        mVar.f27123m = new ArrayList();
        mVar.f27124n = new ArrayList();
        mVar.f27125o = new ArrayList();
        mVar.f27126p = new ArrayList();
        mVar.f27127q = new ArrayList();
        mVar.f27128r = new ArrayList();
        this.mItemAnimator = mVar;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new o(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new c() : null;
        f1 f1Var = new f1();
        f1Var.f27064a = -1;
        f1Var.f27065b = 0;
        f1Var.f27066c = 0;
        f1Var.f27067d = 1;
        f1Var.f27068e = 0;
        f1Var.f27069f = false;
        f1Var.f27070g = false;
        f1Var.f27071h = false;
        f1Var.i = false;
        f1Var.f27072j = false;
        f1Var.f27073k = false;
        this.mState = f1Var;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new b1(26, this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new e(this, i10);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new fe.c(27, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = g2.o0.f19905a;
            fA = a2.a.c(viewConfiguration);
        } else {
            fA = g2.o0.a(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = fA;
        this.mScaledVerticalScrollFactor = i11 >= 26 ? a2.a.d(viewConfiguration) : g2.o0.a(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f1703a = this.mItemAnimatorListener;
        initAdapterManager();
        this.mChildHelper = new b(new v7.f(28, this));
        Field field = n0.f19900a;
        if ((i11 >= 26 ? h0.a(this) : 0) == 0 && i11 >= 26) {
            h0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new j1(this));
        int[] iArr = j6.a.f26574a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        n0.j(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z5;
        if (z5) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(i.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                    } catch (NoSuchMethodException e3) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e7) {
                            e7.initCause(e3);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e7);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((i) constructor.newInstance(objArr));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e10);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e12);
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e14);
                }
            }
        }
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        n0.j(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        Intrinsics.checkNotNullParameter(this, "<this>");
        setTag(com.twinby.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public void onExitLayoutOrScroll(boolean z5) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            if (sDebugAssertionsEnabled && i < 0) {
                throw new IllegalStateException(gf.a.i(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z5) {
                int i10 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if (i10 != 0 && isAccessibilityEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i10);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i, int i10, Interpolator interpolator) {
        smoothScrollBy(i, i10, interpolator, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
    }

    public boolean dispatchNestedPreScroll(int i, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().c(i, i10, iArr, iArr2, i11);
    }

    public final void dispatchNestedScroll(int i, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i, i10, i11, i12, iArr, i13, iArr2);
    }

    public void smoothScrollBy(int i, int i10, Interpolator interpolator, int i11) {
        smoothScrollBy(i, i10, interpolator, i11, false);
    }

    public boolean startNestedScroll(int i, int i10) {
        return getScrollingChildHelper().g(i, i10);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().h(i);
    }

    public void smoothScrollBy(int i, int i10, Interpolator interpolator, int i11, boolean z5) {
        i iVar = this.mLayout;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!iVar.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i10 = 0;
        }
        if (i == 0 && i10 == 0) {
            return;
        }
        if (i11 != Integer.MIN_VALUE && i11 <= 0) {
            scrollBy(i, i10);
            return;
        }
        if (z5) {
            int i12 = i != 0 ? 1 : 0;
            if (i10 != 0) {
                i12 |= 2;
            }
            startNestedScroll(i12, 1);
        }
        this.mViewFlinger.c(i, i10, interpolator, i11);
    }

    public void addItemDecoration(s0 s0Var) {
        addItemDecoration(s0Var, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        i iVar = this.mLayout;
        if (iVar != null) {
            return iVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(gf.a.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    @Deprecated
    public void setRecyclerListener(c1 c1Var) {
    }

    public void onScrolled(int i, int i10) {
    }
}
