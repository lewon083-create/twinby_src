package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.gms.internal.ads.c3;
import com.twinby.R;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.c1;
import g2.d1;
import g2.e1;
import g2.f0;
import g2.f1;
import g2.g1;
import g2.h1;
import g2.i1;
import g2.j1;
import g2.n0;
import g2.o;
import g2.p;
import g2.t1;
import g2.x1;
import java.lang.reflect.Field;
import m.d3;
import m.e;
import m.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements o, p {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f1094z = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f1097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f1098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1101h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f1105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f1106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f1107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x1 f1108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x1 f1109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x1 f1110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x1 f1111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public OverScroller f1112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ViewPropertyAnimator f1113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m.b f1114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m.c f1115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m.c f1116x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c3 f1117y;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1105m = new Rect();
        this.f1106n = new Rect();
        this.f1107o = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        x1 x1Var = x1.f19942b;
        this.f1108p = x1Var;
        this.f1109q = x1Var;
        this.f1110r = x1Var;
        this.f1111s = x1Var;
        this.f1114v = new m.b(0, this);
        this.f1115w = new m.c(this, 0);
        this.f1116x = new m.c(this, 1);
        i(context);
        this.f1117y = new c3();
    }

    public static boolean g(View view, Rect rect, boolean z5) {
        boolean z10;
        e eVar = (e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i10 = rect.left;
        if (i != i10) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i12;
            z10 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i14;
            z10 = true;
        }
        if (z5) {
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i16;
                return true;
            }
        }
        return z10;
    }

    @Override // g2.p
    public final void a(View view, int i, int i10, int i11, int i12, int i13, int[] iArr) {
        b(view, i, i10, i11, i12, i13);
    }

    @Override // g2.o
    public final void b(View view, int i, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i, i10, i11, i12);
        }
    }

    @Override // g2.o
    public final boolean c(View view, View view2, int i, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // g2.o
    public final void d(View view, View view2, int i, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f1099f == null || this.f1100g) {
            return;
        }
        if (this.f1097d.getVisibility() == 0) {
            translationY = (int) (this.f1097d.getTranslationY() + this.f1097d.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f1099f.setBounds(0, translationY, getWidth(), this.f1099f.getIntrinsicHeight() + translationY);
        this.f1099f.draw(canvas);
    }

    @Override // g2.o
    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1097d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c3 c3Var = this.f1117y;
        return c3Var.f4006b | c3Var.f4005a;
    }

    public CharSequence getTitle() {
        j();
        return ((d3) this.f1098e).f28190a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1115w);
        removeCallbacks(this.f1116x);
        ViewPropertyAnimator viewPropertyAnimator = this.f1113u;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1094z);
        this.f1095b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1099f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1100g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1112t = new OverScroller(context);
    }

    public final void j() {
        t0 wrapper;
        if (this.f1096c == null) {
            this.f1096c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1097d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof t0) {
                wrapper = (t0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f1098e = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        x1 x1VarG = x1.g(this, windowInsets);
        boolean zG = g(this.f1097d, new Rect(x1VarG.b(), x1VarG.d(), x1VarG.c(), x1VarG.a()), false);
        Field field = n0.f19900a;
        Rect rect = this.f1105m;
        f0.b(this, x1VarG, rect);
        int i = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        t1 t1Var = x1VarG.f19943a;
        x1 x1VarP = t1Var.p(i, i10, i11, i12);
        this.f1108p = x1VarP;
        boolean z5 = true;
        if (!this.f1109q.equals(x1VarP)) {
            this.f1109q = this.f1108p;
            zG = true;
        }
        Rect rect2 = this.f1106n;
        if (rect2.equals(rect)) {
            z5 = zG;
        } else {
            rect2.set(rect);
        }
        if (z5) {
            requestLayout();
        }
        return t1Var.a().f19943a.c().f19943a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = n0.f19900a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f1097d, i, 0, i10, 0);
        e eVar = (e) this.f1097d.getLayoutParams();
        int iMax = Math.max(0, this.f1097d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f1097d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1097d.getMeasuredState());
        Field field = n0.f19900a;
        boolean z5 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z5) {
            measuredHeight = this.f1095b;
            if (this.i && this.f1097d.getTabContainer() != null) {
                measuredHeight += this.f1095b;
            }
        } else {
            measuredHeight = this.f1097d.getVisibility() != 8 ? this.f1097d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1105m;
        Rect rect2 = this.f1107o;
        rect2.set(rect);
        x1 x1Var = this.f1108p;
        this.f1110r = x1Var;
        if (this.f1101h || z5) {
            x1.b bVarB = x1.b.b(x1Var.b(), this.f1110r.d() + measuredHeight, this.f1110r.c(), this.f1110r.a());
            x1 x1Var2 = this.f1110r;
            int i11 = Build.VERSION.SDK_INT;
            j1 i1Var = i11 >= 36 ? new i1(x1Var2) : i11 >= 35 ? new h1(x1Var2) : i11 >= 34 ? new g1(x1Var2) : i11 >= 31 ? new f1(x1Var2) : i11 >= 30 ? new e1(x1Var2) : i11 >= 29 ? new d1(x1Var2) : new c1(x1Var2);
            i1Var.h(bVarB);
            this.f1110r = i1Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f1110r = x1Var.f19943a.p(0, measuredHeight, 0, 0);
        }
        g(this.f1096c, rect2, true);
        if (!this.f1111s.equals(this.f1110r)) {
            x1 x1Var3 = this.f1110r;
            this.f1111s = x1Var3;
            n0.a(this.f1096c, x1Var3);
        }
        measureChildWithMargins(this.f1096c, i, 0, i10, 0);
        e eVar2 = (e) this.f1096c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1096c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1096c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1096c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z5) {
        if (!this.f1102j || !z5) {
            return false;
        }
        this.f1112t.fling(0, 0, 0, (int) f11, 0, 0, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, Integer.MAX_VALUE);
        if (this.f1112t.getFinalY() > this.f1097d.getHeight()) {
            h();
            this.f1116x.run();
        } else {
            h();
            this.f1115w.run();
        }
        this.f1103k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i10, int i11, int i12) {
        int i13 = this.f1104l + i10;
        this.f1104l = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1117y.f4005a = i;
        this.f1104l = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1097d.getVisibility() != 0) {
            return false;
        }
        return this.f1102j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1102j || this.f1103k) {
            return;
        }
        if (this.f1104l <= this.f1097d.getHeight()) {
            h();
            postDelayed(this.f1115w, 600L);
        } else {
            h();
            postDelayed(this.f1116x, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f1097d.setTranslationY(-Math.max(0, Math.min(i, this.f1097d.getHeight())));
    }

    public void setActionBarVisibilityCallback(m.d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z5) {
        this.i = z5;
    }

    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.f1102j) {
            this.f1102j = z5;
            if (z5) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        d3 d3Var = (d3) this.f1098e;
        d3Var.f28193d = i != 0 ? a.a.i(d3Var.f28190a.getContext(), i) : null;
        d3Var.c();
    }

    public void setLogo(int i) {
        j();
        d3 d3Var = (d3) this.f1098e;
        d3Var.f28194e = i != 0 ? a.a.i(d3Var.f28190a.getContext(), i) : null;
        d3Var.c();
    }

    public void setOverlayMode(boolean z5) {
        this.f1101h = z5;
        this.f1100g = z5 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((d3) this.f1098e).f28199k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        d3 d3Var = (d3) this.f1098e;
        if (d3Var.f28196g) {
            return;
        }
        Toolbar toolbar = d3Var.f28190a;
        d3Var.f28197h = charSequence;
        if ((d3Var.f28191b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (d3Var.f28196g) {
                n0.l(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        d3 d3Var = (d3) this.f1098e;
        d3Var.f28193d = drawable;
        d3Var.c();
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i10, int[] iArr) {
    }

    @Override // g2.o
    public final void f(View view, int i, int i10, int[] iArr, int i11) {
    }
}
