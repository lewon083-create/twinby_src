package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import com.google.android.gms.internal.ads.pv1;
import com.google.android.gms.internal.ads.st1;
import java.util.Arrays;
import k6.a0;
import k6.f1;
import k6.w0;
import k6.y;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f1659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View[] f1660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseIntArray f1661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseIntArray f1662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h3.e f1663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f1664w;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
        this.f1657p = false;
        this.f1658q = -1;
        this.f1661t = new SparseIntArray();
        this.f1662u = new SparseIntArray();
        this.f1663v = new h3.e();
        this.f1664w = new Rect();
        setSpanCount(i.getProperties(context, attributeSet, i, i10).f27190b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A(boolean z5) {
        if (z5) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.A(false);
    }

    public final void E(int i) {
        int i10;
        int[] iArr = this.f1659r;
        int i11 = this.f1658q;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i / i11;
        int i14 = i % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 <= 0 || i11 - i12 >= i14) {
                i10 = i13;
            } else {
                i10 = i13 + 1;
                i12 -= i11;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.f1659r = iArr;
    }

    public final void F() {
        View[] viewArr = this.f1660s;
        if (viewArr == null || viewArr.length != this.f1658q) {
            this.f1660s = new View[this.f1658q];
        }
    }

    public final int G(int i, int i10) {
        if (this.f1665a != 1 || !isLayoutRTL()) {
            int[] iArr = this.f1659r;
            return iArr[i10 + i] - iArr[i];
        }
        int[] iArr2 = this.f1659r;
        int i11 = this.f1658q;
        return iArr2[i11 - i] - iArr2[(i11 - i) - i10];
    }

    public final int H(int i, k kVar, f1 f1Var) {
        boolean z5 = f1Var.f27070g;
        h3.e eVar = this.f1663v;
        if (!z5) {
            int i10 = this.f1658q;
            eVar.getClass();
            return h3.e.B(i, i10);
        }
        int iB = kVar.b(i);
        if (iB != -1) {
            int i11 = this.f1658q;
            eVar.getClass();
            return h3.e.B(iB, i11);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int I(int i, k kVar, f1 f1Var) {
        boolean z5 = f1Var.f27070g;
        h3.e eVar = this.f1663v;
        if (!z5) {
            int i10 = this.f1658q;
            eVar.getClass();
            return i % i10;
        }
        int i11 = this.f1662u.get(i, -1);
        if (i11 != -1) {
            return i11;
        }
        int iB = kVar.b(i);
        if (iB != -1) {
            int i12 = this.f1658q;
            eVar.getClass();
            return iB % i12;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int J(int i, k kVar, f1 f1Var) {
        boolean z5 = f1Var.f27070g;
        h3.e eVar = this.f1663v;
        if (!z5) {
            eVar.getClass();
            return 1;
        }
        int i10 = this.f1661t.get(i, -1);
        if (i10 != -1) {
            return i10;
        }
        if (kVar.b(i) != -1) {
            eVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void K(View view, int i, boolean z5) {
        int childMeasureSpec;
        int childMeasureSpec2;
        y yVar = (y) view.getLayoutParams();
        Rect rect = yVar.f27221b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) yVar).topMargin + ((ViewGroup.MarginLayoutParams) yVar).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) yVar).leftMargin + ((ViewGroup.MarginLayoutParams) yVar).rightMargin;
        int iG = G(yVar.f27229e, yVar.f27230f);
        if (this.f1665a == 1) {
            childMeasureSpec2 = i.getChildMeasureSpec(iG, i, i11, ((ViewGroup.MarginLayoutParams) yVar).width, false);
            childMeasureSpec = i.getChildMeasureSpec(this.f1667c.l(), getHeightMode(), i10, ((ViewGroup.MarginLayoutParams) yVar).height, true);
        } else {
            int childMeasureSpec3 = i.getChildMeasureSpec(iG, i, i10, ((ViewGroup.MarginLayoutParams) yVar).height, false);
            int childMeasureSpec4 = i.getChildMeasureSpec(this.f1667c.l(), getWidthMode(), i11, ((ViewGroup.MarginLayoutParams) yVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        w0 w0Var = (w0) view.getLayoutParams();
        if (z5 ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, w0Var) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, w0Var)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void L() {
        int height;
        int paddingTop;
        if (this.f1665a == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        E(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.i
    public final boolean checkLayoutParams(w0 w0Var) {
        return w0Var instanceof y;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final int computeHorizontalScrollOffset(f1 f1Var) {
        return f(f1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final int computeHorizontalScrollRange(f1 f1Var) {
        return g(f1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final int computeVerticalScrollOffset(f1 f1Var) {
        return f(f1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final int computeVerticalScrollRange(f1 f1Var) {
        return g(f1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d(f1 f1Var, a0 a0Var, c cVar) {
        int i;
        int i10 = this.f1658q;
        for (int i11 = 0; i11 < this.f1658q && (i = a0Var.f27026d) >= 0 && i < f1Var.b() && i10 > 0; i11++) {
            cVar.a(a0Var.f27026d, Math.max(0, a0Var.f27029g));
            this.f1663v.getClass();
            i10--;
            a0Var.f27026d += a0Var.f27027e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final w0 generateDefaultLayoutParams() {
        return this.f1665a == 0 ? new y(-2, -1) : new y(-1, -2);
    }

    @Override // androidx.recyclerview.widget.i
    public final w0 generateLayoutParams(Context context, AttributeSet attributeSet) {
        y yVar = new y(context, attributeSet);
        yVar.f27229e = -1;
        yVar.f27230f = 0;
        return yVar;
    }

    @Override // androidx.recyclerview.widget.i
    public final int getColumnCountForAccessibility(k kVar, f1 f1Var) {
        if (this.f1665a == 1) {
            return this.f1658q;
        }
        if (f1Var.b() < 1) {
            return 0;
        }
        return H(f1Var.b() - 1, kVar, f1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.i
    public final int getRowCountForAccessibility(k kVar, f1 f1Var) {
        if (this.f1665a == 0) {
            return this.f1658q;
        }
        if (f1Var.b() < 1) {
            return 0;
        }
        return H(f1Var.b() - 1, kVar, f1Var) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.k r26, k6.f1 r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.k, k6.f1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.i
    public final void onInitializeAccessibilityNodeInfo(k kVar, f1 f1Var, h2.f fVar) {
        super.onInitializeAccessibilityNodeInfo(kVar, f1Var, fVar);
        fVar.i(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.i
    public final void onInitializeAccessibilityNodeInfoForItem(k kVar, f1 f1Var, View view, h2.f fVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof y)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, fVar);
            return;
        }
        y yVar = (y) layoutParams;
        int iH = H(yVar.f27220a.getLayoutPosition(), kVar, f1Var);
        if (this.f1665a == 0) {
            fVar.f20360a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(yVar.f27229e, yVar.f27230f, iH, 1, false, false));
        } else {
            fVar.f20360a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iH, 1, yVar.f27229e, yVar.f27230f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.i
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i10) {
        h3.e eVar = this.f1663v;
        eVar.C();
        ((SparseIntArray) eVar.f20376d).clear();
    }

    @Override // androidx.recyclerview.widget.i
    public final void onItemsChanged(RecyclerView recyclerView) {
        h3.e eVar = this.f1663v;
        eVar.C();
        ((SparseIntArray) eVar.f20376d).clear();
    }

    @Override // androidx.recyclerview.widget.i
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i10, int i11) {
        h3.e eVar = this.f1663v;
        eVar.C();
        ((SparseIntArray) eVar.f20376d).clear();
    }

    @Override // androidx.recyclerview.widget.i
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i10) {
        h3.e eVar = this.f1663v;
        eVar.C();
        ((SparseIntArray) eVar.f20376d).clear();
    }

    @Override // androidx.recyclerview.widget.i
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i10, Object obj) {
        h3.e eVar = this.f1663v;
        eVar.C();
        ((SparseIntArray) eVar.f20376d).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final void onLayoutChildren(k kVar, f1 f1Var) {
        boolean z5 = f1Var.f27070g;
        SparseIntArray sparseIntArray = this.f1662u;
        SparseIntArray sparseIntArray2 = this.f1661t;
        if (z5) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                y yVar = (y) getChildAt(i).getLayoutParams();
                int layoutPosition = yVar.f27220a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, yVar.f27230f);
                sparseIntArray.put(layoutPosition, yVar.f27229e);
            }
        }
        super.onLayoutChildren(kVar, f1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final void onLayoutCompleted(f1 f1Var) {
        super.onLayoutCompleted(f1Var);
        this.f1657p = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View q(k kVar, f1 f1Var, boolean z5, boolean z10) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i10 = 1;
        if (z10) {
            childCount = getChildCount() - 1;
            i = -1;
            i10 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iB = f1Var.b();
        i();
        int iK = this.f1667c.k();
        int iG = this.f1667c.g();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && I(position, kVar, f1Var) == 0) {
                if (((w0) childAt.getLayoutParams()).f27220a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f1667c.e(childAt) < iG && this.f1667c.b(childAt) >= iK) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i10;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final int scrollHorizontallyBy(int i, k kVar, f1 f1Var) {
        L();
        F();
        return super.scrollHorizontallyBy(i, kVar, f1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final int scrollVerticallyBy(int i, k kVar, f1 f1Var) {
        L();
        F();
        return super.scrollVerticallyBy(i, kVar, f1Var);
    }

    @Override // androidx.recyclerview.widget.i
    public final void setMeasuredDimension(Rect rect, int i, int i10) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f1659r == null) {
            super.setMeasuredDimension(rect, i, i10);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f1665a == 1) {
            iChooseSize2 = i.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f1659r;
            iChooseSize = i.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = i.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f1659r;
            iChooseSize2 = i.chooseSize(i10, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public final void setSpanCount(int i) {
        if (i == this.f1658q) {
            return;
        }
        this.f1657p = true;
        if (i < 1) {
            throw new IllegalArgumentException(l7.o.i(i, "Span count should be at least 1. Provided "));
        }
        this.f1658q = i;
        this.f1663v.C();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.i
    public final boolean supportsPredictiveItemAnimations() {
        return this.f1674k == null && !this.f1657p;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void v(k kVar, f1 f1Var, a0 a0Var, pv1 pv1Var) {
        int i;
        int i10;
        int i11;
        int iD;
        int paddingLeft;
        int paddingTop;
        int iD2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z5;
        int i12;
        View viewB;
        int iJ = this.f1667c.j();
        boolean z10 = iJ != 1073741824;
        int i13 = getChildCount() > 0 ? this.f1659r[this.f1658q] : 0;
        if (z10) {
            L();
        }
        boolean z11 = a0Var.f27027e == 1;
        int I = this.f1658q;
        if (!z11) {
            I = I(a0Var.f27026d, kVar, f1Var) + J(a0Var.f27026d, kVar, f1Var);
        }
        int i14 = 0;
        while (i14 < this.f1658q && (i12 = a0Var.f27026d) >= 0 && i12 < f1Var.b() && I > 0) {
            int i15 = a0Var.f27026d;
            int iJ2 = J(i15, kVar, f1Var);
            if (iJ2 > this.f1658q) {
                throw new IllegalArgumentException(z.d(this.f1658q, " spans.", z.i("Item at position ", i15, " requires ", iJ2, " spans but GridLayoutManager has only ")));
            }
            I -= iJ2;
            if (I < 0 || (viewB = a0Var.b(kVar)) == null) {
                break;
            }
            this.f1660s[i14] = viewB;
            i14++;
        }
        if (i14 == 0) {
            pv1Var.f9193b = true;
            return;
        }
        if (z11) {
            i11 = 1;
            i10 = i14;
            i = 0;
        } else {
            i = i14 - 1;
            i10 = -1;
            i11 = -1;
        }
        int i16 = 0;
        while (i != i10) {
            View view = this.f1660s[i];
            y yVar = (y) view.getLayoutParams();
            int iJ3 = J(getPosition(view), kVar, f1Var);
            yVar.f27230f = iJ3;
            yVar.f27229e = i16;
            i16 += iJ3;
            i += i11;
        }
        float f10 = 0.0f;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            View view2 = this.f1660s[i18];
            if (a0Var.f27032k != null) {
                z5 = false;
                if (z11) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z11) {
                addView(view2);
                z5 = false;
            } else {
                z5 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f1664w);
            K(view2, iJ, z5);
            int iC = this.f1667c.c(view2);
            if (iC > i17) {
                i17 = iC;
            }
            float fD = (this.f1667c.d(view2) * 1.0f) / ((y) view2.getLayoutParams()).f27230f;
            if (fD > f10) {
                f10 = fD;
            }
        }
        if (z10) {
            E(Math.max(Math.round(f10 * this.f1658q), i13));
            i17 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                View view3 = this.f1660s[i19];
                K(view3, 1073741824, true);
                int iC2 = this.f1667c.c(view3);
                if (iC2 > i17) {
                    i17 = iC2;
                }
            }
        }
        for (int i20 = 0; i20 < i14; i20++) {
            View view4 = this.f1660s[i20];
            if (this.f1667c.c(view4) != i17) {
                y yVar2 = (y) view4.getLayoutParams();
                Rect rect = yVar2.f27221b;
                int i21 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) yVar2).topMargin + ((ViewGroup.MarginLayoutParams) yVar2).bottomMargin;
                int i22 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) yVar2).leftMargin + ((ViewGroup.MarginLayoutParams) yVar2).rightMargin;
                int iG = G(yVar2.f27229e, yVar2.f27230f);
                if (this.f1665a == 1) {
                    childMeasureSpec2 = i.getChildMeasureSpec(iG, 1073741824, i22, ((ViewGroup.MarginLayoutParams) yVar2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    childMeasureSpec = i.getChildMeasureSpec(iG, 1073741824, i21, ((ViewGroup.MarginLayoutParams) yVar2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (w0) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        pv1Var.f9192a = i17;
        if (this.f1665a != 1) {
            if (a0Var.f27028f == -1) {
                int i23 = a0Var.f27024b;
                paddingLeft = i23 - i17;
                iD = i23;
            } else {
                int i24 = a0Var.f27024b;
                iD = i24 + i17;
                paddingLeft = i24;
            }
            paddingTop = 0;
            iD2 = 0;
        } else if (a0Var.f27028f == -1) {
            iD2 = a0Var.f27024b;
            paddingTop = iD2 - i17;
            paddingLeft = 0;
            iD = 0;
        } else {
            int i25 = a0Var.f27024b;
            paddingTop = i25;
            iD = 0;
            iD2 = i25 + i17;
            paddingLeft = 0;
        }
        for (int i26 = 0; i26 < i14; i26++) {
            View view5 = this.f1660s[i26];
            y yVar3 = (y) view5.getLayoutParams();
            if (this.f1665a != 1) {
                paddingTop = getPaddingTop() + this.f1659r[yVar3.f27229e];
                iD2 = this.f1667c.d(view5) + paddingTop;
            } else if (isLayoutRTL()) {
                iD = this.f1659r[this.f1658q - yVar3.f27229e] + getPaddingLeft();
                paddingLeft = iD - this.f1667c.d(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f1659r[yVar3.f27229e];
                iD = this.f1667c.d(view5) + paddingLeft;
            }
            int i27 = iD;
            int i28 = paddingLeft;
            int i29 = iD2;
            layoutDecoratedWithMargins(view5, i28, paddingTop, i27, i29);
            paddingLeft = i28;
            iD = i27;
            iD2 = i29;
            if (yVar3.f27220a.isRemoved() || yVar3.f27220a.isUpdated()) {
                pv1Var.f9194c = true;
            }
            pv1Var.f9195d = view5.hasFocusable() | pv1Var.f9195d;
        }
        Arrays.fill(this.f1660s, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w(k kVar, f1 f1Var, st1 st1Var, int i) {
        L();
        if (f1Var.b() > 0 && !f1Var.f27070g) {
            boolean z5 = i == 1;
            int I = I(st1Var.f10386b, kVar, f1Var);
            if (z5) {
                while (I > 0) {
                    int i10 = st1Var.f10386b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    st1Var.f10386b = i11;
                    I = I(i11, kVar, f1Var);
                }
            } else {
                int iB = f1Var.b() - 1;
                int i12 = st1Var.f10386b;
                while (i12 < iB) {
                    int i13 = i12 + 1;
                    int I2 = I(i13, kVar, f1Var);
                    if (I2 <= I) {
                        break;
                    }
                    i12 = i13;
                    I = I2;
                }
                st1Var.f10386b = i12;
            }
        }
        F();
    }

    @Override // androidx.recyclerview.widget.i
    public final w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            y yVar = new y((ViewGroup.MarginLayoutParams) layoutParams);
            yVar.f27229e = -1;
            yVar.f27230f = 0;
            return yVar;
        }
        y yVar2 = new y(layoutParams);
        yVar2.f27229e = -1;
        yVar2.f27230f = 0;
        return yVar2;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1657p = false;
        this.f1658q = -1;
        this.f1661t = new SparseIntArray();
        this.f1662u = new SparseIntArray();
        this.f1663v = new h3.e();
        this.f1664w = new Rect();
        setSpanCount(i);
    }
}
