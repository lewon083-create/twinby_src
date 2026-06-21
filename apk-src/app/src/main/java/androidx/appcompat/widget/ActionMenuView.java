package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.vk.api.sdk.exceptions.VKApiCodes;
import l.h;
import l.i;
import l7.o;
import m.f;
import m.g1;
import m.h1;
import m.j;
import m.k;
import m.k3;
import m.l;
import m.m;
import m.w2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends h1 implements h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f1118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f1119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f1121t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w2 f1122u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1125x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1126y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f1127z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1125x = (int) (56.0f * f10);
        this.f1126y = (int) (f10 * 4.0f);
        this.f1119r = context;
        this.f1120s = 0;
    }

    public static l i() {
        l lVar = new l(-2, -2);
        lVar.f28285a = false;
        ((LinearLayout.LayoutParams) lVar).gravity = 16;
        return lVar;
    }

    public static l j(ViewGroup.LayoutParams layoutParams) {
        l lVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof l) {
            l lVar2 = (l) layoutParams;
            lVar = new l(lVar2);
            lVar.f28285a = lVar2.f28285a;
        } else {
            lVar = new l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) lVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) lVar).gravity = 16;
        }
        return lVar;
    }

    @Override // l.h
    public final boolean a(l.j jVar) {
        return this.f1118q.p(jVar, null, 0);
    }

    @Override // m.h1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.h1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ g1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // m.h1
    /* JADX INFO: renamed from: f */
    public final g1 generateLayoutParams(AttributeSet attributeSet) {
        return new l(getContext(), attributeSet);
    }

    @Override // m.h1
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ g1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // m.h1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // m.h1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1118q == null) {
            Context context = getContext();
            i iVar = new i(context);
            this.f1118q = iVar;
            iVar.f27632e = new m.i(this);
            j jVar = new j(context);
            this.f1121t = jVar;
            jVar.f28270l = true;
            jVar.f28271m = true;
            jVar.f28265f = new l7.b(1);
            this.f1118q.b(jVar, this.f1119r);
            j jVar2 = this.f1121t;
            jVar2.f28267h = this;
            this.f1118q = jVar2.f28263d;
        }
        return this.f1118q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        j jVar = this.f1121t;
        m.h hVar = jVar.i;
        if (hVar != null) {
            return hVar.getDrawable();
        }
        if (jVar.f28269k) {
            return jVar.f28268j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1120s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof k)) {
            zA = ((k) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof k)) ? zA : ((k) childAt2).c() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j jVar = this.f1121t;
        if (jVar != null) {
            jVar.d();
            f fVar = this.f1121t.f28277s;
            if (fVar == null || !fVar.b()) {
                return;
            }
            this.f1121t.j();
            this.f1121t.k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1121t;
        if (jVar != null) {
            jVar.j();
            f fVar = jVar.f28278t;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.i.dismiss();
        }
    }

    @Override // m.h1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        int width;
        int paddingLeft;
        if (!this.f1123v) {
            super.onLayout(z5, i, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i11 - i;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean zA = k3.a(this);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                l lVar = (l) childAt.getLayoutParams();
                if (lVar.f28285a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) lVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) lVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) lVar).leftMargin) + ((LinearLayout.LayoutParams) lVar).rightMargin;
                    k(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int iMax = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                l lVar2 = (l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f28285a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) lVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            l lVar3 = (l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f28285a) {
                int i26 = paddingLeft2 + ((LinearLayout.LayoutParams) lVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft2 = o.v(measuredWidth4, ((LinearLayout.LayoutParams) lVar3).rightMargin, iMax, i26);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // m.h1, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        i iVar;
        boolean z5 = this.f1123v;
        boolean z10 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1123v = z10;
        if (z5 != z10) {
            this.f1124w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1123v && (iVar = this.f1118q) != null && size != this.f1124w) {
            this.f1124w = size;
            iVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f1123v || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                l lVar = (l) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) lVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) lVar).leftMargin = 0;
            }
            super.onMeasure(i, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.f1125x;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        boolean z11 = false;
        int i23 = 0;
        long j10 = 0;
        while (true) {
            i11 = this.f1126y;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z12) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                l lVar2 = (l) childAt.getLayoutParams();
                lVar2.f28290f = false;
                lVar2.f28287c = 0;
                lVar2.f28286b = 0;
                lVar2.f28288d = false;
                ((LinearLayout.LayoutParams) lVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) lVar2).rightMargin = 0;
                lVar2.f28289e = z12 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = lVar2.f28285a ? 1 : i18;
                l lVar3 = (l) childAt.getLayoutParams();
                int i27 = i18;
                i13 = i20;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z12 ? (ActionMenuItemView) childAt : null;
                boolean z13 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z14 = z13;
                if (i26 <= 0 || (z13 && i26 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i26, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z14 && i14 < 2) {
                        i14 = 2;
                    }
                }
                lVar3.f28288d = !lVar3.f28285a && z14;
                lVar3.f28286b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i14);
                if (lVar2.f28288d) {
                    i23++;
                }
                if (lVar2.f28285a) {
                    z11 = true;
                }
                i18 = i27 - i14;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j10 |= (long) (1 << i22);
                }
            }
            i22++;
            size3 = i24;
            paddingBottom = i25;
            i20 = i13;
        }
        int i28 = size3;
        int i29 = i18;
        int i30 = i20;
        boolean z15 = z11 && i21 == 2;
        int i31 = i29;
        boolean z16 = false;
        while (i23 > 0 && i31 > 0) {
            int i32 = Integer.MAX_VALUE;
            long j11 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                int i35 = iMax;
                l lVar4 = (l) getChildAt(i34).getLayoutParams();
                boolean z17 = z15;
                if (lVar4.f28288d) {
                    int i36 = lVar4.f28286b;
                    if (i36 < i32) {
                        j11 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j11 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z15 = z17;
                iMax = i35;
            }
            i12 = iMax;
            boolean z18 = z15;
            j10 |= j11;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                l lVar5 = (l) childAt2.getLayoutParams();
                boolean z19 = z11;
                long j12 = 1 << i38;
                if ((j11 & j12) != 0) {
                    if (z18 && lVar5.f28289e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i11 + i30, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    lVar5.f28286b += r11;
                    lVar5.f28290f = r11;
                    i31--;
                } else if (lVar5.f28286b == i37) {
                    j10 |= j12;
                }
                i38++;
                z11 = z19;
            }
            z15 = z18;
            iMax = i12;
            z16 = true;
        }
        i12 = iMax;
        boolean z20 = !z11 && i21 == 1;
        if (i31 > 0 && j10 != 0 && (i31 < i21 - 1 || z20 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j10);
            if (!z20) {
                if ((j10 & 1) != 0 && !((l) getChildAt(0).getLayoutParams()).f28289e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j10 & ((long) (1 << i39))) != 0 && !((l) getChildAt(i39).getLayoutParams()).f28289e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i31 * i30) / fBitCount) : 0;
            boolean z21 = z16;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j10 & ((long) (1 << i41))) != 0) {
                    View childAt3 = getChildAt(i41);
                    l lVar6 = (l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar6.f28287c = i40;
                        lVar6.f28290f = true;
                        if (i41 == 0 && !lVar6.f28289e) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = (-i40) / 2;
                        }
                        z21 = true;
                    } else if (lVar6.f28285a) {
                        lVar6.f28287c = i40;
                        lVar6.f28290f = true;
                        ((LinearLayout.LayoutParams) lVar6).rightMargin = (-i40) / 2;
                        z21 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) lVar6).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) lVar6).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                l lVar7 = (l) childAt4.getLayoutParams();
                if (lVar7.f28290f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar7.f28286b * i30) + lVar7.f28287c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z5) {
        this.f1121t.f28275q = z5;
    }

    public void setOnMenuItemClickListener(m mVar) {
        this.f1127z = mVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        j jVar = this.f1121t;
        m.h hVar = jVar.i;
        if (hVar != null) {
            hVar.setImageDrawable(drawable);
        } else {
            jVar.f28269k = true;
            jVar.f28268j = drawable;
        }
    }

    public void setPopupTheme(int i) {
        if (this.f1120s != i) {
            this.f1120s = i;
            if (i == 0) {
                this.f1119r = getContext();
            } else {
                this.f1119r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(j jVar) {
        this.f1121t = jVar;
        jVar.f28267h = this;
        this.f1118q = jVar.f28263d;
    }

    @Override // m.h1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l(getContext(), attributeSet);
    }

    public void setOverflowReserved(boolean z5) {
    }
}
