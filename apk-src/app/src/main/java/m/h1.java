package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f28242h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f28243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f28244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f28245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f28248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f28249p;

    public h1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28236b = true;
        this.f28237c = -1;
        this.f28238d = 0;
        this.f28240f = 8388659;
        int[] iArr = h.a.f20302k;
        ka.k kVarJ = ka.k.J(context, attributeSet, iArr, i);
        g2.n0.j(this, context, iArr, attributeSet, (TypedArray) kVarJ.f27325d, i);
        TypedArray typedArray = (TypedArray) kVarJ.f27325d;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z5 = typedArray.getBoolean(2, true);
        if (!z5) {
            setBaselineAligned(z5);
        }
        this.f28242h = typedArray.getFloat(4, -1.0f);
        this.f28237c = typedArray.getInt(3, -1);
        this.i = typedArray.getBoolean(7, false);
        setDividerDrawable(kVarJ.F(5));
        this.f28248o = typedArray.getInt(8, 0);
        this.f28249p = typedArray.getDimensionPixelSize(6, 0);
        kVarJ.Q();
    }

    public final void c(Canvas canvas, int i) {
        this.f28245l.setBounds(getPaddingLeft() + this.f28249p, i, (getWidth() - getPaddingRight()) - this.f28249p, this.f28247n + i);
        this.f28245l.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g1;
    }

    public final void d(Canvas canvas, int i) {
        this.f28245l.setBounds(i, getPaddingTop() + this.f28249p, this.f28246m + i, (getHeight() - getPaddingBottom()) - this.f28249p);
        this.f28245l.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g1 generateDefaultLayoutParams() {
        int i = this.f28239e;
        if (i == 0) {
            return new g1(-2, -2);
        }
        if (i == 1) {
            return new g1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g1 generateLayoutParams(AttributeSet attributeSet) {
        return new g1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public g1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g1(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f28237c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f28237c;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f28237c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iC = this.f28238d;
        if (this.f28239e == 1 && (i = this.f28240f & 112) != 48) {
            if (i == 16) {
                iC = l7.o.c(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f28241g, 2, iC);
            } else if (i == 80) {
                iC = ((getBottom() - getTop()) - getPaddingBottom()) - this.f28241g;
            }
        }
        return iC + ((LinearLayout.LayoutParams) ((g1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f28237c;
    }

    public Drawable getDividerDrawable() {
        return this.f28245l;
    }

    public int getDividerPadding() {
        return this.f28249p;
    }

    public int getDividerWidth() {
        return this.f28246m;
    }

    public int getGravity() {
        return this.f28240f;
    }

    public int getOrientation() {
        return this.f28239e;
    }

    public int getShowDividers() {
        return this.f28248o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f28242h;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.f28248o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f28248o & 4) != 0;
        }
        if ((this.f28248o & 2) != 0) {
            for (int i10 = i - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f28245l == null) {
            return;
        }
        int i10 = 0;
        if (this.f28239e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && h(i10)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((g1) childAt.getLayoutParams())).topMargin) - this.f28247n);
                }
                i10++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f28247n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((g1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = k3.a(this);
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i10)) {
                g1 g1Var = (g1) childAt3.getLayoutParams();
                d(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) g1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) g1Var).leftMargin) - this.f28246m);
            }
            i10++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                g1 g1Var2 = (g1) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) g1Var2).leftMargin;
                    i = this.f28246m;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) g1Var2).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f28246m;
                right = left - i;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.h1.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.h1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z5) {
        this.f28236b = z5;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f28237c = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f28245l) {
            return;
        }
        this.f28245l = drawable;
        if (drawable != null) {
            this.f28246m = drawable.getIntrinsicWidth();
            this.f28247n = drawable.getIntrinsicHeight();
        } else {
            this.f28246m = 0;
            this.f28247n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f28249p = i;
    }

    public void setGravity(int i) {
        if (this.f28240f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f28240f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i10 = i & 8388615;
        int i11 = this.f28240f;
        if ((8388615 & i11) != i10) {
            this.f28240f = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z5) {
        this.i = z5;
    }

    public void setOrientation(int i) {
        if (this.f28239e != i) {
            this.f28239e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f28248o) {
            requestLayout();
        }
        this.f28248o = i;
    }

    public void setVerticalGravity(int i) {
        int i10 = i & 112;
        int i11 = this.f28240f;
        if ((i11 & 112) != i10) {
            this.f28240f = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f28242h = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
