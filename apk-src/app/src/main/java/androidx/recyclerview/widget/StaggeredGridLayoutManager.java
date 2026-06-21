package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import k6.c0;
import k6.e1;
import k6.f1;
import k6.h0;
import k6.m1;
import k6.n1;
import k6.o1;
import k6.p1;
import k6.q1;
import k6.u0;
import k6.v0;
import k6.w0;
import k6.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends i implements e1 {
    private int mFullSizeSpec;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    private final z mLayoutState;
    private int mOrientation;
    private q1 mPendingSavedState;
    private int[] mPrefetchDistances;
    h0 mPrimaryOrientation;
    private BitSet mRemainingSpans;
    h0 mSecondaryOrientation;
    private int mSizePerSpan;
    q[] mSpans;
    private int mSpanCount = -1;
    boolean mReverseLayout = false;
    boolean mShouldReverseLayout = false;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
    p1 mLazySpanLookup = new p1();
    private int mGapStrategy = 2;
    private final Rect mTmpRect = new Rect();
    private final m1 mAnchorInfo = new m1(this);
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mSmoothScrollbarEnabled = true;
    private final Runnable mCheckForGapsRunnable = new ac.g(16, this);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        v0 properties = i.getProperties(context, attributeSet, i, i10);
        setOrientation(properties.f27189a);
        setSpanCount(properties.f27190b);
        setReverseLayout(properties.f27191c);
        z zVar = new z();
        zVar.f27231a = true;
        zVar.f27236f = 0;
        zVar.f27237g = 0;
        this.mLayoutState = zVar;
        this.mPrimaryOrientation = h0.a(this, this.mOrientation);
        this.mSecondaryOrientation = h0.a(this, 1 - this.mOrientation);
    }

    public static int v(int i, int i10, int i11) {
        int mode;
        return (!(i10 == 0 && i11 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i10) - i11), mode) : i;
    }

    @Override // androidx.recyclerview.widget.i
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public final int c(f1 f1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return k6.b.a(f1Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    @Override // androidx.recyclerview.widget.i
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.i
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public boolean checkForGaps() {
        int firstChildPosition;
        int lastChildPosition;
        if (getChildCount() != 0 && this.mGapStrategy != 0 && isAttachedToWindow()) {
            if (this.mShouldReverseLayout) {
                firstChildPosition = getLastChildPosition();
                lastChildPosition = getFirstChildPosition();
            } else {
                firstChildPosition = getFirstChildPosition();
                lastChildPosition = getLastChildPosition();
            }
            if (firstChildPosition == 0 && hasGapsToFix() != null) {
                this.mLazySpanLookup.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
            if (this.mLaidOutInvalidFullSpan) {
                int i = this.mShouldReverseLayout ? -1 : 1;
                int i10 = lastChildPosition + 1;
                o1 o1VarD = this.mLazySpanLookup.d(firstChildPosition, i10, i);
                if (o1VarD == null) {
                    this.mLaidOutInvalidFullSpan = false;
                    this.mLazySpanLookup.c(i10);
                    return false;
                }
                o1 o1VarD2 = this.mLazySpanLookup.d(firstChildPosition, o1VarD.f27147b, i * (-1));
                if (o1VarD2 == null) {
                    this.mLazySpanLookup.c(o1VarD.f27147b);
                } else {
                    this.mLazySpanLookup.c(o1VarD2.f27147b + 1);
                }
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.i
    public boolean checkLayoutParams(w0 w0Var) {
        return w0Var instanceof n1;
    }

    @Override // androidx.recyclerview.widget.i
    public void collectAdjacentPrefetchPositions(int i, int i10, f1 f1Var, u0 u0Var) {
        int iF;
        int iH;
        if (this.mOrientation != 0) {
            i = i10;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        prepareLayoutStateForDelta(i, f1Var);
        int[] iArr = this.mPrefetchDistances;
        if (iArr == null || iArr.length < this.mSpanCount) {
            this.mPrefetchDistances = new int[this.mSpanCount];
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.mSpanCount; i12++) {
            z zVar = this.mLayoutState;
            if (zVar.f27234d == -1) {
                iF = zVar.f27236f;
                iH = this.mSpans[i12].h(iF);
            } else {
                iF = this.mSpans[i12].f(zVar.f27237g);
                iH = this.mLayoutState.f27237g;
            }
            int i13 = iF - iH;
            if (i13 >= 0) {
                this.mPrefetchDistances[i11] = i13;
                i11++;
            }
        }
        Arrays.sort(this.mPrefetchDistances, 0, i11);
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = this.mLayoutState.f27233c;
            if (i15 < 0 || i15 >= f1Var.b()) {
                return;
            }
            ((c) u0Var).a(this.mLayoutState.f27233c, this.mPrefetchDistances[i14]);
            z zVar2 = this.mLayoutState;
            zVar2.f27233c += zVar2.f27234d;
        }
    }

    @Override // androidx.recyclerview.widget.i
    public int computeHorizontalScrollExtent(f1 f1Var) {
        return c(f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public int computeHorizontalScrollOffset(f1 f1Var) {
        return d(f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public int computeHorizontalScrollRange(f1 f1Var) {
        return e(f1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // k6.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.PointF computeScrollVectorForPosition(int r4) {
        /*
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.mShouldReverseLayout
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.getFirstChildPosition()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.mShouldReverseLayout
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.mOrientation
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.computeScrollVectorForPosition(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.i
    public int computeVerticalScrollExtent(f1 f1Var) {
        return c(f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public int computeVerticalScrollOffset(f1 f1Var) {
        return d(f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public int computeVerticalScrollRange(f1 f1Var) {
        return e(f1Var);
    }

    public final int d(f1 f1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return k6.b.b(f1Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public final int e(f1 f1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return k6.b.c(f1Var, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public final int f(k kVar, z zVar, f1 f1Var) {
        q qVar;
        ?? r32;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i;
        int i10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i11 = 0;
        staggeredGridLayoutManager.mRemainingSpans.set(0, staggeredGridLayoutManager.mSpanCount, true);
        int i12 = staggeredGridLayoutManager.mLayoutState.i ? zVar.f27235e == 1 ? Integer.MAX_VALUE : VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR : zVar.f27235e == 1 ? zVar.f27237g + zVar.f27232b : zVar.f27236f - zVar.f27232b;
        int i13 = zVar.f27235e;
        for (int i14 = 0; i14 < staggeredGridLayoutManager.mSpanCount; i14++) {
            if (!staggeredGridLayoutManager.mSpans[i14].f1732a.isEmpty()) {
                staggeredGridLayoutManager.u(staggeredGridLayoutManager.mSpans[i14], i13, i12);
            }
        }
        int iG = staggeredGridLayoutManager.mShouldReverseLayout ? staggeredGridLayoutManager.mPrimaryOrientation.g() : staggeredGridLayoutManager.mPrimaryOrientation.k();
        boolean z5 = false;
        while (true) {
            int i15 = zVar.f27233c;
            int i16 = -1;
            if (i15 < 0 || i15 >= f1Var.b() || (!staggeredGridLayoutManager.mLayoutState.i && staggeredGridLayoutManager.mRemainingSpans.isEmpty())) {
                break;
            }
            View view = kVar.k(zVar.f27233c, Long.MAX_VALUE).itemView;
            zVar.f27233c += zVar.f27234d;
            n1 n1Var = (n1) view.getLayoutParams();
            int layoutPosition = n1Var.f27220a.getLayoutPosition();
            int[] iArr = staggeredGridLayoutManager.mLazySpanLookup.f27151a;
            int i17 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i17 == -1) {
                if (staggeredGridLayoutManager.n(zVar.f27235e)) {
                    i = staggeredGridLayoutManager.mSpanCount - 1;
                    i10 = -1;
                } else {
                    i16 = staggeredGridLayoutManager.mSpanCount;
                    i = i11;
                    i10 = 1;
                }
                q qVar2 = null;
                if (zVar.f27235e == 1) {
                    int iK2 = staggeredGridLayoutManager.mPrimaryOrientation.k();
                    int i18 = Integer.MAX_VALUE;
                    while (i != i16) {
                        q qVar3 = staggeredGridLayoutManager.mSpans[i];
                        int iF = qVar3.f(iK2);
                        if (iF < i18) {
                            i18 = iF;
                            qVar2 = qVar3;
                        }
                        i += i10;
                    }
                } else {
                    int iG2 = staggeredGridLayoutManager.mPrimaryOrientation.g();
                    int i19 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                    while (i != i16) {
                        q qVar4 = staggeredGridLayoutManager.mSpans[i];
                        int iH2 = qVar4.h(iG2);
                        if (iH2 > i19) {
                            qVar2 = qVar4;
                            i19 = iH2;
                        }
                        i += i10;
                    }
                }
                qVar = qVar2;
                p1 p1Var = staggeredGridLayoutManager.mLazySpanLookup;
                p1Var.b(layoutPosition);
                p1Var.f27151a[layoutPosition] = qVar.f1736e;
            } else {
                qVar = staggeredGridLayoutManager.mSpans[i17];
            }
            q qVar5 = qVar;
            n1Var.f27139e = qVar5;
            if (zVar.f27235e == 1) {
                staggeredGridLayoutManager.addView(view);
                r32 = 0;
            } else {
                r32 = 0;
                staggeredGridLayoutManager.addView(view, 0);
            }
            if (staggeredGridLayoutManager.mOrientation == 1) {
                staggeredGridLayoutManager.l(view, i.getChildMeasureSpec(staggeredGridLayoutManager.mSizePerSpan, staggeredGridLayoutManager.getWidthMode(), r32, ((ViewGroup.MarginLayoutParams) n1Var).width, r32), i.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) n1Var).height, true));
            } else {
                staggeredGridLayoutManager.l(view, i.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) n1Var).width, true), i.getChildMeasureSpec(staggeredGridLayoutManager.mSizePerSpan, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) n1Var).height, false));
            }
            if (zVar.f27235e == 1) {
                iC = qVar5.f(iG);
                iH = staggeredGridLayoutManager.mPrimaryOrientation.c(view) + iC;
            } else {
                iH = qVar5.h(iG);
                iC = iH - staggeredGridLayoutManager.mPrimaryOrientation.c(view);
            }
            if (zVar.f27235e == 1) {
                q qVar6 = n1Var.f27139e;
                qVar6.getClass();
                n1 n1Var2 = (n1) view.getLayoutParams();
                n1Var2.f27139e = qVar6;
                ArrayList arrayList = qVar6.f1732a;
                arrayList.add(view);
                qVar6.f1734c = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                if (arrayList.size() == 1) {
                    qVar6.f1733b = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                }
                if (n1Var2.f27220a.isRemoved() || n1Var2.f27220a.isUpdated()) {
                    qVar6.f1735d = qVar6.f1737f.mPrimaryOrientation.c(view) + qVar6.f1735d;
                }
            } else {
                q qVar7 = n1Var.f27139e;
                qVar7.getClass();
                n1 n1Var3 = (n1) view.getLayoutParams();
                n1Var3.f27139e = qVar7;
                ArrayList arrayList2 = qVar7.f1732a;
                arrayList2.add(0, view);
                qVar7.f1733b = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                if (arrayList2.size() == 1) {
                    qVar7.f1734c = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                }
                if (n1Var3.f27220a.isRemoved() || n1Var3.f27220a.isUpdated()) {
                    qVar7.f1735d = qVar7.f1737f.mPrimaryOrientation.c(view) + qVar7.f1735d;
                }
            }
            if (staggeredGridLayoutManager.isLayoutRTL() && staggeredGridLayoutManager.mOrientation == 1) {
                iC2 = staggeredGridLayoutManager.mSecondaryOrientation.g() - (((staggeredGridLayoutManager.mSpanCount - 1) - qVar5.f1736e) * staggeredGridLayoutManager.mSizePerSpan);
                iK = iC2 - staggeredGridLayoutManager.mSecondaryOrientation.c(view);
            } else {
                iK = staggeredGridLayoutManager.mSecondaryOrientation.k() + (qVar5.f1736e * staggeredGridLayoutManager.mSizePerSpan);
                iC2 = staggeredGridLayoutManager.mSecondaryOrientation.c(view) + iK;
            }
            int i20 = iK;
            int i21 = iC2;
            if (staggeredGridLayoutManager.mOrientation == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(view, i20, iC, i21, iH);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(view, iC, i20, iH, i21);
            }
            staggeredGridLayoutManager.u(qVar5, staggeredGridLayoutManager.mLayoutState.f27235e, i12);
            staggeredGridLayoutManager.o(kVar, staggeredGridLayoutManager.mLayoutState);
            if (staggeredGridLayoutManager.mLayoutState.f27238h && view.hasFocusable()) {
                staggeredGridLayoutManager.mRemainingSpans.set(qVar5.f1736e, false);
            }
            z5 = true;
            i11 = 0;
        }
        if (!z5) {
            staggeredGridLayoutManager.o(kVar, staggeredGridLayoutManager.mLayoutState);
        }
        int iK3 = staggeredGridLayoutManager.mLayoutState.f27235e == -1 ? staggeredGridLayoutManager.mPrimaryOrientation.k() - staggeredGridLayoutManager.j(staggeredGridLayoutManager.mPrimaryOrientation.k()) : staggeredGridLayoutManager.i(staggeredGridLayoutManager.mPrimaryOrientation.g()) - staggeredGridLayoutManager.mPrimaryOrientation.g();
        if (iK3 > 0) {
            return Math.min(zVar.f27232b, iK3);
        }
        return 0;
    }

    public View findFirstVisibleItemClosestToEnd(boolean z5) {
        int iK = this.mPrimaryOrientation.k();
        int iG = this.mPrimaryOrientation.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iE = this.mPrimaryOrientation.e(childAt);
            int iB = this.mPrimaryOrientation.b(childAt);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z5) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View findFirstVisibleItemClosestToStart(boolean z5) {
        int iK = this.mPrimaryOrientation.k();
        int iG = this.mPrimaryOrientation.g();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iE = this.mPrimaryOrientation.e(childAt);
            if (this.mPrimaryOrientation.b(childAt) > iK && iE < iG) {
                if (iE >= iK || !z5) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int findFirstVisibleItemPositionInt() {
        View viewFindFirstVisibleItemClosestToEnd = this.mShouldReverseLayout ? findFirstVisibleItemClosestToEnd(true) : findFirstVisibleItemClosestToStart(true);
        if (viewFindFirstVisibleItemClosestToEnd == null) {
            return -1;
        }
        return getPosition(viewFindFirstVisibleItemClosestToEnd);
    }

    public final void g(k kVar, f1 f1Var, boolean z5) {
        int iG;
        int i = i(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
        if (i != Integer.MIN_VALUE && (iG = this.mPrimaryOrientation.g() - i) > 0) {
            int i10 = iG - (-scrollBy(-iG, kVar, f1Var));
            if (!z5 || i10 <= 0) {
                return;
            }
            this.mPrimaryOrientation.o(i10);
        }
    }

    @Override // androidx.recyclerview.widget.i
    public w0 generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new n1(-2, -1) : new n1(-1, -2);
    }

    @Override // androidx.recyclerview.widget.i
    public w0 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new n1(context, attributeSet);
    }

    public int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public final void h(k kVar, f1 f1Var, boolean z5) {
        int iK;
        int iJ = j(Integer.MAX_VALUE);
        if (iJ != Integer.MAX_VALUE && (iK = iJ - this.mPrimaryOrientation.k()) > 0) {
            int iScrollBy = iK - scrollBy(iK, kVar, f1Var);
            if (!z5 || iScrollBy <= 0) {
                return;
            }
            this.mPrimaryOrientation.o(-iScrollBy);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View hasGapsToFix() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    public final int i(int i) {
        int iF = this.mSpans[0].f(i);
        for (int i10 = 1; i10 < this.mSpanCount; i10++) {
            int iF2 = this.mSpans[i10].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.i
    public boolean isAutoMeasureEnabled() {
        return this.mGapStrategy != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final int j(int i) {
        int iH = this.mSpans[0].h(i);
        for (int i10 = 1; i10 < this.mSpanCount; i10++) {
            int iH2 = this.mSpans[i10].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.mShouldReverseLayout
            if (r0 == 0) goto L9
            int r0 = r6.getLastChildPosition()
            goto Ld
        L9:
            int r0 = r6.getFirstChildPosition()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            k6.p1 r4 = r6.mLazySpanLookup
            r4.e(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            k6.p1 r9 = r6.mLazySpanLookup
            r9.g(r7, r4)
            k6.p1 r7 = r6.mLazySpanLookup
            r7.f(r8, r4)
            goto L42
        L37:
            k6.p1 r9 = r6.mLazySpanLookup
            r9.g(r7, r8)
            goto L42
        L3d:
            k6.p1 r9 = r6.mLazySpanLookup
            r9.f(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.mShouldReverseLayout
            if (r7 == 0) goto L4e
            int r7 = r6.getFirstChildPosition()
            goto L52
        L4e:
            int r7 = r6.getLastChildPosition()
        L52:
            if (r3 > r7) goto L57
            r6.requestLayout()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.k(int, int, int):void");
    }

    public final void l(View view, int i, int i10) {
        calculateItemDecorationsForChild(view, this.mTmpRect);
        n1 n1Var = (n1) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) n1Var).leftMargin;
        Rect rect = this.mTmpRect;
        int iV = v(i, i11 + rect.left, ((ViewGroup.MarginLayoutParams) n1Var).rightMargin + rect.right);
        int i12 = ((ViewGroup.MarginLayoutParams) n1Var).topMargin;
        Rect rect2 = this.mTmpRect;
        int iV2 = v(i10, i12 + rect2.top, ((ViewGroup.MarginLayoutParams) n1Var).bottomMargin + rect2.bottom);
        if (shouldMeasureChild(view, iV, iV2, n1Var)) {
            view.measure(iV, iV2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(androidx.recyclerview.widget.k r13, k6.f1 r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m(androidx.recyclerview.widget.k, k6.f1, boolean):void");
    }

    public final boolean n(int i) {
        if (this.mOrientation == 0) {
            return (i == -1) != this.mShouldReverseLayout;
        }
        return ((i == -1) == this.mShouldReverseLayout) == isLayoutRTL();
    }

    public final void o(k kVar, z zVar) {
        if (!zVar.f27231a || zVar.i) {
            return;
        }
        if (zVar.f27232b == 0) {
            if (zVar.f27235e == -1) {
                p(zVar.f27237g, kVar);
                return;
            } else {
                q(zVar.f27236f, kVar);
                return;
            }
        }
        int i = 1;
        if (zVar.f27235e == -1) {
            int i10 = zVar.f27236f;
            int iH = this.mSpans[0].h(i10);
            while (i < this.mSpanCount) {
                int iH2 = this.mSpans[i].h(i10);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i++;
            }
            int i11 = i10 - iH;
            p(i11 < 0 ? zVar.f27237g : zVar.f27237g - Math.min(i11, zVar.f27232b), kVar);
            return;
        }
        int i12 = zVar.f27237g;
        int iF = this.mSpans[0].f(i12);
        while (i < this.mSpanCount) {
            int iF2 = this.mSpans[i].f(i12);
            if (iF2 < iF) {
                iF = iF2;
            }
            i++;
        }
        int i13 = iF - zVar.f27237g;
        q(i13 < 0 ? zVar.f27236f : Math.min(i13, zVar.f27232b) + zVar.f27236f, kVar);
    }

    @Override // androidx.recyclerview.widget.i
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            q qVar = this.mSpans[i10];
            int i11 = qVar.f1733b;
            if (i11 != Integer.MIN_VALUE) {
                qVar.f1733b = i11 + i;
            }
            int i12 = qVar.f1734c;
            if (i12 != Integer.MIN_VALUE) {
                qVar.f1734c = i12 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.i
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            q qVar = this.mSpans[i10];
            int i11 = qVar.f1733b;
            if (i11 != Integer.MIN_VALUE) {
                qVar.f1733b = i11 + i;
            }
            int i12 = qVar.f1734c;
            if (i12 != Integer.MIN_VALUE) {
                qVar.f1734c = i12 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.i
    public void onAdapterChanged(g gVar, g gVar2) {
        this.mLazySpanLookup.a();
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].b();
        }
    }

    @Override // androidx.recyclerview.widget.i
    public void onDetachedFromWindow(RecyclerView recyclerView, k kVar) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    @Override // androidx.recyclerview.widget.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r9, int r10, androidx.recyclerview.widget.k r11, k6.f1 r12) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.k, k6.f1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.i
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewFindFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View viewFindFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (viewFindFirstVisibleItemClosestToStart == null || viewFindFirstVisibleItemClosestToEnd == null) {
                return;
            }
            int position = getPosition(viewFindFirstVisibleItemClosestToStart);
            int position2 = getPosition(viewFindFirstVisibleItemClosestToEnd);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.i
    public void onItemsAdded(RecyclerView recyclerView, int i, int i10) {
        k(i, i10, 1);
    }

    @Override // androidx.recyclerview.widget.i
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.i
    public void onItemsMoved(RecyclerView recyclerView, int i, int i10, int i11) {
        k(i, i10, 8);
    }

    @Override // androidx.recyclerview.widget.i
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i10) {
        k(i, i10, 2);
    }

    @Override // androidx.recyclerview.widget.i
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i10, Object obj) {
        k(i, i10, 4);
    }

    @Override // androidx.recyclerview.widget.i
    public void onLayoutChildren(k kVar, f1 f1Var) {
        m(kVar, f1Var, true);
    }

    @Override // androidx.recyclerview.widget.i
    public void onLayoutCompleted(f1 f1Var) {
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.mPendingSavedState = null;
        this.mAnchorInfo.a();
    }

    @Override // androidx.recyclerview.widget.i
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof q1) {
            q1 q1Var = (q1) parcelable;
            this.mPendingSavedState = q1Var;
            if (this.mPendingScrollPosition != -1) {
                q1Var.f27156b = -1;
                q1Var.f27157c = -1;
                q1Var.f27159e = null;
                q1Var.f27158d = 0;
                q1Var.f27160f = 0;
                q1Var.f27161g = null;
                q1Var.f27162h = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.i
    public Parcelable onSaveInstanceState() {
        int iH;
        int iK;
        int[] iArr;
        q1 q1Var = this.mPendingSavedState;
        if (q1Var != null) {
            q1 q1Var2 = new q1();
            q1Var2.f27158d = q1Var.f27158d;
            q1Var2.f27156b = q1Var.f27156b;
            q1Var2.f27157c = q1Var.f27157c;
            q1Var2.f27159e = q1Var.f27159e;
            q1Var2.f27160f = q1Var.f27160f;
            q1Var2.f27161g = q1Var.f27161g;
            q1Var2.i = q1Var.i;
            q1Var2.f27163j = q1Var.f27163j;
            q1Var2.f27164k = q1Var.f27164k;
            q1Var2.f27162h = q1Var.f27162h;
            return q1Var2;
        }
        q1 q1Var3 = new q1();
        q1Var3.i = this.mReverseLayout;
        q1Var3.f27163j = this.mLastLayoutFromEnd;
        q1Var3.f27164k = this.mLastLayoutRTL;
        p1 p1Var = this.mLazySpanLookup;
        if (p1Var == null || (iArr = p1Var.f27151a) == null) {
            q1Var3.f27160f = 0;
        } else {
            q1Var3.f27161g = iArr;
            q1Var3.f27160f = iArr.length;
            q1Var3.f27162h = p1Var.f27152b;
        }
        if (getChildCount() <= 0) {
            q1Var3.f27156b = -1;
            q1Var3.f27157c = -1;
            q1Var3.f27158d = 0;
            return q1Var3;
        }
        q1Var3.f27156b = this.mLastLayoutFromEnd ? getLastChildPosition() : getFirstChildPosition();
        q1Var3.f27157c = findFirstVisibleItemPositionInt();
        int i = this.mSpanCount;
        q1Var3.f27158d = i;
        q1Var3.f27159e = new int[i];
        for (int i10 = 0; i10 < this.mSpanCount; i10++) {
            if (this.mLastLayoutFromEnd) {
                iH = this.mSpans[i10].f(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.mPrimaryOrientation.g();
                    iH -= iK;
                }
            } else {
                iH = this.mSpans[i10].h(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.mPrimaryOrientation.k();
                    iH -= iK;
                }
            }
            q1Var3.f27159e[i10] = iH;
        }
        return q1Var3;
    }

    @Override // androidx.recyclerview.widget.i
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            checkForGaps();
        }
    }

    public final void p(int i, k kVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.e(childAt) < i || this.mPrimaryOrientation.n(childAt) < i) {
                return;
            }
            n1 n1Var = (n1) childAt.getLayoutParams();
            n1Var.getClass();
            if (n1Var.f27139e.f1732a.size() == 1) {
                return;
            }
            q qVar = n1Var.f27139e;
            ArrayList arrayList = qVar.f1732a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            n1 n1Var2 = (n1) view.getLayoutParams();
            n1Var2.f27139e = null;
            if (n1Var2.f27220a.isRemoved() || n1Var2.f27220a.isUpdated()) {
                qVar.f1735d -= qVar.f1737f.mPrimaryOrientation.c(view);
            }
            if (size == 1) {
                qVar.f1733b = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            }
            qVar.f1734c = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            removeAndRecycleView(childAt, kVar);
        }
    }

    public void prepareLayoutStateForDelta(int i, f1 f1Var) {
        int firstChildPosition;
        int i10;
        if (i > 0) {
            firstChildPosition = getLastChildPosition();
            i10 = 1;
        } else {
            firstChildPosition = getFirstChildPosition();
            i10 = -1;
        }
        this.mLayoutState.f27231a = true;
        t(firstChildPosition, f1Var);
        s(i10);
        z zVar = this.mLayoutState;
        zVar.f27233c = firstChildPosition + zVar.f27234d;
        zVar.f27232b = Math.abs(i);
    }

    public final void q(int i, k kVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.b(childAt) > i || this.mPrimaryOrientation.m(childAt) > i) {
                return;
            }
            n1 n1Var = (n1) childAt.getLayoutParams();
            n1Var.getClass();
            if (n1Var.f27139e.f1732a.size() == 1) {
                return;
            }
            q qVar = n1Var.f27139e;
            ArrayList arrayList = qVar.f1732a;
            View view = (View) arrayList.remove(0);
            n1 n1Var2 = (n1) view.getLayoutParams();
            n1Var2.f27139e = null;
            if (arrayList.size() == 0) {
                qVar.f1734c = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            }
            if (n1Var2.f27220a.isRemoved() || n1Var2.f27220a.isUpdated()) {
                qVar.f1735d -= qVar.f1737f.mPrimaryOrientation.c(view);
            }
            qVar.f1733b = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            removeAndRecycleView(childAt, kVar);
        }
    }

    public final void r() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final void s(int i) {
        z zVar = this.mLayoutState;
        zVar.f27235e = i;
        zVar.f27234d = this.mShouldReverseLayout != (i == -1) ? -1 : 1;
    }

    public int scrollBy(int i, k kVar, f1 f1Var) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i, f1Var);
        int iF = f(kVar, this.mLayoutState, f1Var);
        if (this.mLayoutState.f27232b >= iF) {
            i = i < 0 ? -iF : iF;
        }
        this.mPrimaryOrientation.o(-i);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        z zVar = this.mLayoutState;
        zVar.f27232b = 0;
        o(kVar, zVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.i
    public int scrollHorizontallyBy(int i, k kVar, f1 f1Var) {
        return scrollBy(i, kVar, f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public void scrollToPosition(int i) {
        q1 q1Var = this.mPendingSavedState;
        if (q1Var != null && q1Var.f27156b != i) {
            q1Var.f27159e = null;
            q1Var.f27158d = 0;
            q1Var.f27156b = -1;
            q1Var.f27157c = -1;
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.i
    public int scrollVerticallyBy(int i, k kVar, f1 f1Var) {
        return scrollBy(i, kVar, f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public void setMeasuredDimension(Rect rect, int i, int i10) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = i.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = i.chooseSize(i, (this.mSizePerSpan * this.mSpanCount) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = i.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = i.chooseSize(i10, (this.mSizePerSpan * this.mSpanCount) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.mOrientation) {
            return;
        }
        this.mOrientation = i;
        h0 h0Var = this.mPrimaryOrientation;
        this.mPrimaryOrientation = this.mSecondaryOrientation;
        this.mSecondaryOrientation = h0Var;
        requestLayout();
    }

    public void setReverseLayout(boolean z5) {
        assertNotInLayoutOrScroll(null);
        q1 q1Var = this.mPendingSavedState;
        if (q1Var != null && q1Var.i != z5) {
            q1Var.i = z5;
        }
        this.mReverseLayout = z5;
        requestLayout();
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new q[this.mSpanCount];
            for (int i10 = 0; i10 < this.mSpanCount; i10++) {
                this.mSpans[i10] = new q(this, i10);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.i
    public void smoothScrollToPosition(RecyclerView recyclerView, f1 f1Var, int i) {
        c0 c0Var = new c0(recyclerView.getContext());
        c0Var.setTargetPosition(i);
        startSmoothScroll(c0Var);
    }

    @Override // androidx.recyclerview.widget.i
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    public final void t(int i, f1 f1Var) {
        int iL;
        int iL2;
        int i10;
        z zVar = this.mLayoutState;
        boolean z5 = false;
        zVar.f27232b = 0;
        zVar.f27233c = i;
        if (!isSmoothScrolling() || (i10 = f1Var.f27064a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.mShouldReverseLayout == (i10 < i)) {
                iL = this.mPrimaryOrientation.l();
                iL2 = 0;
            } else {
                iL2 = this.mPrimaryOrientation.l();
                iL = 0;
            }
        }
        if (getClipToPadding()) {
            this.mLayoutState.f27236f = this.mPrimaryOrientation.k() - iL2;
            this.mLayoutState.f27237g = this.mPrimaryOrientation.g() + iL;
        } else {
            this.mLayoutState.f27237g = this.mPrimaryOrientation.f() + iL;
            this.mLayoutState.f27236f = -iL2;
        }
        z zVar2 = this.mLayoutState;
        zVar2.f27238h = false;
        zVar2.f27231a = true;
        if (this.mPrimaryOrientation.i() == 0 && this.mPrimaryOrientation.f() == 0) {
            z5 = true;
        }
        zVar2.i = z5;
    }

    public final void u(q qVar, int i, int i10) {
        int i11 = qVar.f1735d;
        int i12 = qVar.f1736e;
        if (i != -1) {
            int i13 = qVar.f1734c;
            if (i13 == Integer.MIN_VALUE) {
                qVar.a();
                i13 = qVar.f1734c;
            }
            if (i13 - i11 >= i10) {
                this.mRemainingSpans.set(i12, false);
                return;
            }
            return;
        }
        int i14 = qVar.f1733b;
        if (i14 == Integer.MIN_VALUE) {
            View view = (View) qVar.f1732a.get(0);
            n1 n1Var = (n1) view.getLayoutParams();
            qVar.f1733b = qVar.f1737f.mPrimaryOrientation.e(view);
            n1Var.getClass();
            i14 = qVar.f1733b;
        }
        if (i14 + i11 <= i10) {
            this.mRemainingSpans.set(i12, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean updateAnchorFromPendingData(k6.f1 r6, k6.m1 r7) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.updateAnchorFromPendingData(k6.f1, k6.m1):boolean");
    }

    public void updateAnchorInfoForLayout(f1 f1Var, m1 m1Var) {
        if (updateAnchorFromPendingData(f1Var, m1Var)) {
            return;
        }
        int i = 0;
        if (!this.mLastLayoutFromEnd) {
            int iB = f1Var.b();
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    int position = getPosition(getChildAt(i10));
                    if (position >= 0 && position < iB) {
                        i = position;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        } else {
            int iB2 = f1Var.b();
            int childCount2 = getChildCount() - 1;
            while (true) {
                if (childCount2 >= 0) {
                    int position2 = getPosition(getChildAt(childCount2));
                    if (position2 >= 0 && position2 < iB2) {
                        i = position2;
                        break;
                    }
                    childCount2--;
                } else {
                    break;
                }
            }
        }
        m1Var.f27129a = i;
        m1Var.f27130b = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
    }

    public void updateMeasureSpecs(int i) {
        this.mSizePerSpan = i / this.mSpanCount;
        this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(i, this.mSecondaryOrientation.i());
    }

    @Override // androidx.recyclerview.widget.i
    public w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new n1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new n1(layoutParams);
    }
}
