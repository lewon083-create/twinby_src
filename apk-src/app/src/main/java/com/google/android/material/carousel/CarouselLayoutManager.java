package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.k;
import cc.a;
import cc.b;
import cc.c;
import f2.g;
import java.util.List;
import k6.f1;
import k6.w0;
import nc.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14537a;

    public CarouselLayoutManager() {
        new b();
        requestLayout();
    }

    public static e c(List list, float f10, boolean z5) {
        float f11 = Float.MAX_VALUE;
        int i = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((c) list.get(i13)).getClass();
            float fAbs = Math.abs(0.0f - f10);
            if (0.0f <= f10 && fAbs <= f11) {
                i = i13;
                f11 = fAbs;
            }
            if (0.0f > f10 && fAbs <= f13) {
                i11 = i13;
                f13 = fAbs;
            }
            if (0.0f <= f14) {
                i10 = i13;
                f14 = 0.0f;
            }
            if (0.0f > f12) {
                i12 = i13;
                f12 = 0.0f;
            }
        }
        if (i == -1) {
            i = i10;
        }
        if (i11 == -1) {
            i11 = i12;
        }
        c cVar = (c) list.get(i);
        c cVar2 = (c) list.get(i11);
        e eVar = new e();
        cVar.getClass();
        cVar2.getClass();
        g.b(0.0f <= 0.0f);
        return eVar;
    }

    @Override // androidx.recyclerview.widget.i
    public final boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.i
    public final int computeHorizontalScrollExtent(f1 f1Var) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.i
    public final int computeHorizontalScrollOffset(f1 f1Var) {
        return this.f14537a;
    }

    @Override // androidx.recyclerview.widget.i
    public final int computeHorizontalScrollRange(f1 f1Var) {
        return 0 - 0;
    }

    public final boolean d() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.i
    public final w0 generateDefaultLayoutParams() {
        return new w0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.i
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerX();
        throw null;
    }

    @Override // androidx.recyclerview.widget.i
    public final void measureChildWithMargins(View view, int i, int i10) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.i
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.i
    public final void onLayoutChildren(k kVar, f1 f1Var) {
        if (f1Var.b() <= 0) {
            removeAndRecycleAllViews(kVar);
        } else {
            d();
            measureChildWithMargins(kVar.k(0, Long.MAX_VALUE).itemView, 0, 0);
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.i
    public final void onLayoutCompleted(f1 f1Var) {
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.i
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z10) {
        return false;
    }

    @Override // androidx.recyclerview.widget.i
    public final int scrollHorizontallyBy(int i, k kVar, f1 f1Var) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i10 = this.f14537a;
        int i11 = i10 + i;
        if (i11 < 0 || i11 > 0) {
            i = 0 - i10;
        }
        this.f14537a = i10 + i;
        d();
        throw null;
    }

    @Override // androidx.recyclerview.widget.i
    public final void smoothScrollToPosition(RecyclerView recyclerView, f1 f1Var, int i) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }

    @Override // androidx.recyclerview.widget.i
    public final void scrollToPosition(int i) {
    }
}
