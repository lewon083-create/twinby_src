package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.twinby.R;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.l;
import g2.m;
import g2.n0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k.f;
import ka.k;
import l.i;
import m.a3;
import m.b3;
import m.c1;
import m.c3;
import m.d3;
import m.j;
import m.k0;
import m.k3;
import m.t0;
import m.v;
import m.v2;
import m.w2;
import m.x;
import m.x2;
import m.z1;
import m.z2;
import z2.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList E;
    public final ArrayList F;
    public final int[] G;
    public final l H;
    public ArrayList I;
    public final w2 J;
    public d3 K;
    public z2 L;
    public boolean M;
    public OnBackInvokedCallback N;
    public OnBackInvokedDispatcher O;
    public boolean P;
    public final c1 Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionMenuView f1186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0 f1187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f1188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f1189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f1190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f1191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f1192h;
    public v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f1193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f1194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z1 f1204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1205v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f1208y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f1209z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static a3 g() {
        a3 a3Var = new a3(-2, -2);
        a3Var.f28159b = 0;
        a3Var.f28158a = 8388627;
        return a3Var;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new f(getContext());
    }

    public static a3 h(ViewGroup.LayoutParams layoutParams) {
        boolean z5 = layoutParams instanceof a3;
        if (z5) {
            a3 a3Var = (a3) layoutParams;
            a3 a3Var2 = new a3(a3Var);
            a3Var2.f28159b = 0;
            a3Var2.f28159b = a3Var.f28159b;
            return a3Var2;
        }
        if (z5) {
            a3 a3Var3 = new a3((a3) layoutParams);
            a3Var3.f28159b = 0;
            return a3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            a3 a3Var4 = new a3(layoutParams);
            a3Var4.f28159b = 0;
            return a3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        a3 a3Var5 = new a3(marginLayoutParams);
        a3Var5.f28159b = 0;
        ((ViewGroup.MarginLayoutParams) a3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) a3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) a3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) a3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return a3Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        Field field = n0.f19900a;
        boolean z5 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z5) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                a3 a3Var = (a3) childAt.getLayoutParams();
                if (a3Var.f28159b == 0 && s(childAt)) {
                    int i11 = a3Var.f28158a;
                    Field field2 = n0.f19900a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            a3 a3Var2 = (a3) childAt2.getLayoutParams();
            if (a3Var2.f28159b == 0 && s(childAt2)) {
                int i13 = a3Var2.f28158a;
                Field field3 = n0.f19900a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a3 a3VarG = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (a3) layoutParams;
        a3VarG.f28159b = 1;
        if (!z5 || this.f1193j == null) {
            addView(view, a3VarG);
        } else {
            view.setLayoutParams(a3VarG);
            this.F.add(view);
        }
    }

    public final void c() {
        if (this.i == null) {
            v vVar = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.i = vVar;
            vVar.setImageDrawable(this.f1191g);
            this.i.setContentDescription(this.f1192h);
            a3 a3VarG = g();
            a3VarG.f28158a = (this.f1198o & 112) | 8388611;
            a3VarG.f28159b = 2;
            this.i.setLayoutParams(a3VarG);
            this.i.setOnClickListener(new x2(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof a3);
    }

    public final void d() {
        if (this.f1204u == null) {
            z1 z1Var = new z1();
            z1Var.f28409a = 0;
            z1Var.f28410b = 0;
            z1Var.f28411c = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            z1Var.f28412d = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
            z1Var.f28413e = 0;
            z1Var.f28414f = 0;
            z1Var.f28415g = false;
            z1Var.f28416h = false;
            this.f1204u = z1Var;
        }
    }

    public final void e() {
        if (this.f1186b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1186b = actionMenuView;
            actionMenuView.setPopupTheme(this.f1195l);
            this.f1186b.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f1186b;
            w2 w2Var = new w2(this);
            actionMenuView2.getClass();
            actionMenuView2.f1122u = w2Var;
            a3 a3VarG = g();
            a3VarG.f28158a = (this.f1198o & 112) | 8388613;
            this.f1186b.setLayoutParams(a3VarG);
            b(this.f1186b, false);
        }
        ActionMenuView actionMenuView3 = this.f1186b;
        if (actionMenuView3.f1118q == null) {
            i iVar = (i) actionMenuView3.getMenu();
            if (this.L == null) {
                this.L = new z2(this);
            }
            this.f1186b.setExpandedActionViewsExclusive(true);
            iVar.b(this.L, this.f1194k);
            t();
        }
    }

    public final void f() {
        if (this.f1189e == null) {
            this.f1189e = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            a3 a3VarG = g();
            a3VarG.f28158a = (this.f1198o & 112) | 8388611;
            this.f1189e.setLayoutParams(a3VarG);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        v vVar = this.i;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        v vVar = this.i;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        z1 z1Var = this.f1204u;
        if (z1Var != null) {
            return z1Var.f28415g ? z1Var.f28409a : z1Var.f28410b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1206w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        z1 z1Var = this.f1204u;
        if (z1Var != null) {
            return z1Var.f28409a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        z1 z1Var = this.f1204u;
        if (z1Var != null) {
            return z1Var.f28410b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        z1 z1Var = this.f1204u;
        if (z1Var != null) {
            return z1Var.f28415g ? z1Var.f28410b : z1Var.f28409a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1205v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        i iVar;
        ActionMenuView actionMenuView = this.f1186b;
        return (actionMenuView == null || (iVar = actionMenuView.f1118q) == null || !iVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1206w, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = n0.f19900a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = n0.f19900a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1205v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        x xVar = this.f1190f;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        x xVar = this.f1190f;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1186b.getMenu();
    }

    public View getNavButtonView() {
        return this.f1189e;
    }

    public CharSequence getNavigationContentDescription() {
        v vVar = this.f1189e;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        v vVar = this.f1189e;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public j getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1186b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1194k;
    }

    public int getPopupTheme() {
        return this.f1195l;
    }

    public CharSequence getSubtitle() {
        return this.f1209z;
    }

    public final TextView getSubtitleTextView() {
        return this.f1188d;
    }

    public CharSequence getTitle() {
        return this.f1208y;
    }

    public int getTitleMarginBottom() {
        return this.f1203t;
    }

    public int getTitleMarginEnd() {
        return this.f1201r;
    }

    public int getTitleMarginStart() {
        return this.f1200q;
    }

    public int getTitleMarginTop() {
        return this.f1202s;
    }

    public final TextView getTitleTextView() {
        return this.f1187c;
    }

    public t0 getWrapper() {
        Drawable drawable;
        if (this.K == null) {
            d3 d3Var = new d3();
            d3Var.f28200l = 0;
            d3Var.f28190a = this;
            d3Var.f28197h = getTitle();
            d3Var.i = getSubtitle();
            d3Var.f28196g = d3Var.f28197h != null;
            d3Var.f28195f = getNavigationIcon();
            k kVarJ = k.J(getContext(), null, h.a.f20293a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) kVarJ.f27325d;
            d3Var.f28201m = kVarJ.F(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                d3Var.f28196g = true;
                d3Var.f28197h = text;
                if ((d3Var.f28191b & 8) != 0) {
                    setTitle(text);
                    if (d3Var.f28196g) {
                        n0.l(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                d3Var.i = text2;
                if ((d3Var.f28191b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableF = kVarJ.F(20);
            if (drawableF != null) {
                d3Var.f28194e = drawableF;
                d3Var.c();
            }
            Drawable drawableF2 = kVarJ.F(17);
            if (drawableF2 != null) {
                d3Var.f28193d = drawableF2;
                d3Var.c();
            }
            if (d3Var.f28195f == null && (drawable = d3Var.f28201m) != null) {
                d3Var.f28195f = drawable;
                if ((d3Var.f28191b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            d3Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = d3Var.f28192c;
                if (view != null && (d3Var.f28191b & 16) != 0) {
                    removeView(view);
                }
                d3Var.f28192c = viewInflate;
                if (viewInflate != null && (d3Var.f28191b & 16) != 0) {
                    addView(viewInflate);
                }
                d3Var.a(d3Var.f28191b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f1204u.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1196m = resourceId2;
                k0 k0Var = this.f1187c;
                if (k0Var != null) {
                    k0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1197n = resourceId3;
                k0 k0Var2 = this.f1188d;
                if (k0Var2 != null) {
                    k0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            kVarJ.Q();
            if (R.string.abc_action_bar_up_description != d3Var.f28200l) {
                d3Var.f28200l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = d3Var.f28200l;
                    d3Var.f28198j = i != 0 ? getContext().getString(i) : null;
                    d3Var.b();
                }
            }
            d3Var.f28198j = getNavigationContentDescription();
            setNavigationOnClickListener(new x2(d3Var));
            this.K = d3Var;
        }
        return this.K;
    }

    public final int i(View view, int i) {
        a3 a3Var = (a3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i11 = a3Var.f28158a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.f1207x & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) a3Var).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) a3Var).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) a3Var).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    public void l(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void m() {
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.H.f19888b.iterator();
        while (it2.hasNext()) {
            ((a0) ((m) it2.next())).f45802a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.I = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public final int o(View view, int i, int i10, int[] iArr) {
        a3 a3Var = (a3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) a3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i11) + i;
        iArr[0] = Math.max(0, -i11);
        int i12 = i(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i12, iMax + measuredWidth, view.getMeasuredHeight() + i12);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) a3Var).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.D = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int iJ;
        int iMax;
        int iCombineMeasuredStates;
        int iJ2;
        int iK;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = k3.a(this);
        int i11 = !zA ? 1 : 0;
        int i12 = 0;
        if (s(this.f1189e)) {
            r(this.f1189e, i, 0, i10, this.f1199p);
            iJ = j(this.f1189e) + this.f1189e.getMeasuredWidth();
            iMax = Math.max(0, k(this.f1189e) + this.f1189e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1189e.getMeasuredState());
        } else {
            iJ = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.i)) {
            r(this.i, i, 0, i10, this.f1199p);
            iJ = j(this.i) + this.i.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iJ);
        int iMax4 = Math.max(0, currentContentInsetStart - iJ);
        int[] iArr = this.G;
        iArr[zA ? 1 : 0] = iMax4;
        if (s(this.f1186b)) {
            r(this.f1186b, i, iMax3, i10, this.f1199p);
            iJ2 = j(this.f1186b) + this.f1186b.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.f1186b) + this.f1186b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1186b.getMeasuredState());
        } else {
            iJ2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iJ2);
        iArr[i11] = Math.max(0, currentContentInsetEnd - iJ2);
        if (s(this.f1193j)) {
            iMax5 += q(this.f1193j, i, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, k(this.f1193j) + this.f1193j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1193j.getMeasuredState());
        }
        if (s(this.f1190f)) {
            iMax5 += q(this.f1190f, i, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, k(this.f1190f) + this.f1190f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1190f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((a3) childAt.getLayoutParams()).f28159b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i10, 0, iArr);
                int iMax6 = Math.max(iMax, k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.f1202s + this.f1203t;
        int i16 = this.f1200q + this.f1201r;
        if (s(this.f1187c)) {
            q(this.f1187c, i, i14 + i16, i10, i15, iArr);
            int iJ3 = j(this.f1187c) + this.f1187c.getMeasuredWidth();
            iK = k(this.f1187c) + this.f1187c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1187c.getMeasuredState());
            iMax2 = iJ3;
        } else {
            iK = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.f1188d)) {
            iMax2 = Math.max(iMax2, q(this.f1188d, i, i14 + i16, i10, i15 + iK, iArr));
            iK += k(this.f1188d) + this.f1188d.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1188d.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iK);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16);
        if (!this.M) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof c3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c3 c3Var = (c3) parcelable;
        super.onRestoreInstanceState(c3Var.f28536b);
        ActionMenuView actionMenuView = this.f1186b;
        i iVar = actionMenuView != null ? actionMenuView.f1118q : null;
        int i = c3Var.f28176d;
        if (i != 0 && this.L != null && iVar != null && (menuItemFindItem = iVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c3Var.f28177e) {
            c1 c1Var = this.Q;
            removeCallbacks(c1Var);
            post(c1Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        z1 z1Var = this.f1204u;
        boolean z5 = i == 1;
        if (z5 == z1Var.f28415g) {
            return;
        }
        z1Var.f28415g = z5;
        if (!z1Var.f28416h) {
            z1Var.f28409a = z1Var.f28413e;
            z1Var.f28410b = z1Var.f28414f;
            return;
        }
        if (z5) {
            int i10 = z1Var.f28412d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = z1Var.f28413e;
            }
            z1Var.f28409a = i10;
            int i11 = z1Var.f28411c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = z1Var.f28414f;
            }
            z1Var.f28410b = i11;
            return;
        }
        int i12 = z1Var.f28411c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = z1Var.f28413e;
        }
        z1Var.f28409a = i12;
        int i13 = z1Var.f28412d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = z1Var.f28414f;
        }
        z1Var.f28410b = i13;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar;
        m.f fVar;
        l.j jVar2;
        c3 c3Var = new c3(super.onSaveInstanceState());
        z2 z2Var = this.L;
        if (z2Var != null && (jVar2 = z2Var.f28418c) != null) {
            c3Var.f28176d = jVar2.f27648a;
        }
        ActionMenuView actionMenuView = this.f1186b;
        c3Var.f28177e = (actionMenuView == null || (jVar = actionMenuView.f1121t) == null || (fVar = jVar.f28277s) == null || !fVar.b()) ? false : true;
        return c3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    public final int p(View view, int i, int i10, int[] iArr) {
        a3 a3Var = (a3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) a3Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int i12 = i(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i12, iMax, view.getMeasuredHeight() + i12);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) a3Var).leftMargin);
    }

    public final int q(View view, int i, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z5) {
        if (this.P != z5) {
            this.P = z5;
            t();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(a.a.i(getContext(), i));
    }

    public void setCollapsible(boolean z5) {
        this.M = z5;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        }
        if (i != this.f1206w) {
            this.f1206w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        }
        if (i != this.f1205v) {
            this.f1205v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(a.a.i(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(a.a.i(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f1189e.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1186b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1195l != i) {
            this.f1195l = i;
            if (i == 0) {
                this.f1194k = getContext();
            } else {
                this.f1194k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1203t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1201r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1200q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1202s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L4f
            android.window.OnBackInvokedDispatcher r0 = m.y2.a(r4)
            m.z2 r1 = r4.L
            r2 = 0
            if (r1 == 0) goto L23
            l.j r1 = r1.f28418c
            if (r1 == 0) goto L23
            if (r0 == 0) goto L23
            java.lang.reflect.Field r1 = g2.n0.f19900a
            boolean r1 = r4.isAttachedToWindow()
            if (r1 == 0) goto L23
            boolean r1 = r4.P
            if (r1 == 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L41
            android.window.OnBackInvokedDispatcher r3 = r4.O
            if (r3 != 0) goto L41
            android.window.OnBackInvokedCallback r1 = r4.N
            if (r1 != 0) goto L39
            m.v2 r1 = new m.v2
            r1.<init>(r4, r2)
            android.window.OnBackInvokedCallback r1 = m.y2.b(r1)
            r4.N = r1
        L39:
            android.window.OnBackInvokedCallback r1 = r4.N
            m.y2.c(r0, r1)
            r4.O = r0
            return
        L41:
            if (r1 != 0) goto L4f
            android.window.OnBackInvokedDispatcher r0 = r4.O
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedCallback r1 = r4.N
            m.y2.d(r0, r1)
            r0 = 0
            r4.O = r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.t():void");
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1207x = 8388627;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new int[2];
        this.H = new l(new v2(this, 1));
        this.I = new ArrayList();
        this.J = new w2(this);
        this.Q = new c1(2, this);
        Context context2 = getContext();
        int[] iArr = h.a.f20312u;
        k kVarJ = k.J(context2, attributeSet, iArr, R.attr.toolbarStyle);
        n0.j(this, context, iArr, attributeSet, (TypedArray) kVarJ.f27325d, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) kVarJ.f27325d;
        this.f1196m = typedArray.getResourceId(28, 0);
        this.f1197n = typedArray.getResourceId(19, 0);
        this.f1207x = typedArray.getInteger(0, 8388627);
        this.f1198o = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1203t = dimensionPixelOffset;
        this.f1202s = dimensionPixelOffset;
        this.f1201r = dimensionPixelOffset;
        this.f1200q = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1200q = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1201r = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1202s = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1203t = dimensionPixelOffset5;
        }
        this.f1199p = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        z1 z1Var = this.f1204u;
        z1Var.f28416h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            z1Var.f28413e = dimensionPixelSize;
            z1Var.f28409a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            z1Var.f28414f = dimensionPixelSize2;
            z1Var.f28410b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            z1Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1205v = typedArray.getDimensionPixelOffset(10, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
        this.f1206w = typedArray.getDimensionPixelOffset(6, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
        this.f1191g = kVarJ.F(4);
        this.f1192h = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1194k = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableF = kVarJ.F(16);
        if (drawableF != null) {
            setNavigationIcon(drawableF);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableF2 = kVarJ.F(11);
        if (drawableF2 != null) {
            setLogo(drawableF2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(kVarJ.E(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(kVarJ.E(20));
        }
        if (typedArray.hasValue(14)) {
            l(typedArray.getResourceId(14, 0));
        }
        kVarJ.Q();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a3 a3Var = new a3(context, attributeSet);
        a3Var.f28158a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f20294b);
        a3Var.f28158a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        a3Var.f28159b = 0;
        return a3Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        v vVar = this.i;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.i.setImageDrawable(drawable);
        } else {
            v vVar = this.i;
            if (vVar != null) {
                vVar.setImageDrawable(this.f1191g);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1190f == null) {
                this.f1190f = new x(getContext(), null, 0);
            }
            if (!n(this.f1190f)) {
                b(this.f1190f, true);
            }
        } else {
            x xVar = this.f1190f;
            if (xVar != null && n(xVar)) {
                removeView(this.f1190f);
                this.F.remove(this.f1190f);
            }
        }
        x xVar2 = this.f1190f;
        if (xVar2 != null) {
            xVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1190f == null) {
            this.f1190f = new x(getContext(), null, 0);
        }
        x xVar = this.f1190f;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        v vVar = this.f1189e;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
            a.a.p(this.f1189e, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!n(this.f1189e)) {
                b(this.f1189e, true);
            }
        } else {
            v vVar = this.f1189e;
            if (vVar != null && n(vVar)) {
                removeView(this.f1189e);
                this.F.remove(this.f1189e);
            }
        }
        v vVar2 = this.f1189e;
        if (vVar2 != null) {
            vVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            k0 k0Var = this.f1188d;
            if (k0Var != null && n(k0Var)) {
                removeView(this.f1188d);
                this.F.remove(this.f1188d);
            }
        } else {
            if (this.f1188d == null) {
                Context context = getContext();
                k0 k0Var2 = new k0(context, null);
                this.f1188d = k0Var2;
                k0Var2.setSingleLine();
                this.f1188d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1197n;
                if (i != 0) {
                    this.f1188d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f1188d.setTextColor(colorStateList);
                }
            }
            if (!n(this.f1188d)) {
                b(this.f1188d, true);
            }
        }
        k0 k0Var3 = this.f1188d;
        if (k0Var3 != null) {
            k0Var3.setText(charSequence);
        }
        this.f1209z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        k0 k0Var = this.f1188d;
        if (k0Var != null) {
            k0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            k0 k0Var = this.f1187c;
            if (k0Var != null && n(k0Var)) {
                removeView(this.f1187c);
                this.F.remove(this.f1187c);
            }
        } else {
            if (this.f1187c == null) {
                Context context = getContext();
                k0 k0Var2 = new k0(context, null);
                this.f1187c = k0Var2;
                k0Var2.setSingleLine();
                this.f1187c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1196m;
                if (i != 0) {
                    this.f1187c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1187c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f1187c)) {
                b(this.f1187c, true);
            }
        }
        k0 k0Var3 = this.f1187c;
        if (k0Var3 != null) {
            k0Var3.setText(charSequence);
        }
        this.f1208y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        k0 k0Var = this.f1187c;
        if (k0Var != null) {
            k0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(b3 b3Var) {
    }
}
