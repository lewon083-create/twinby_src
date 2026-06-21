package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.c3;
import com.google.firebase.messaging.y;
import com.twinby.R;
import f2.d;
import g2.f0;
import g2.n0;
import g2.o;
import g2.p;
import g2.x1;
import h1.i;
import ic.l;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q1.a;
import r1.b;
import r1.c;
import r1.e;
import r1.f;
import r1.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements o, p {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f1291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Class[] f1292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f1293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l f1294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f1295y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f1297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1302h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f1303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f1304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f1305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f1306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x1 f1308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1309p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f1310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m4.d f1312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c3 f1313t;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1291u = r02 != null ? r02.getName() : null;
        f1294x = new l(8);
        f1292v = new Class[]{Context.class, AttributeSet.class};
        f1293w = new ThreadLocal();
        f1295y = new d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1296b = new ArrayList();
        this.f1297c = new y(14);
        this.f1298d = new ArrayList();
        this.f1299e = new ArrayList();
        this.f1300f = new int[2];
        this.f1301g = new int[2];
        this.f1313t = new c3();
        int[] iArr = a.f31623a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1303j = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f1303j[i] = (int) (r1[i] * f10);
            }
        }
        this.f1310q = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new c(this));
        Field field = n0.f19900a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f1295y.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, r1.d dVar, int i10, int i11) {
        int i12 = dVar.f32158c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i);
        int i13 = dVar.f32159d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        int iWidth = i16 != 1 ? i16 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i17 != 16 ? i17 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i14 == 1) {
            iWidth -= i10 / 2;
        } else if (i14 != 5) {
            iWidth -= i10;
        }
        if (i15 == 16) {
            iHeight -= i11 / 2;
        } else if (i15 != 80) {
            iHeight -= i11;
        }
        rect2.set(iWidth, iHeight, i10 + iWidth, i11 + iHeight);
    }

    public static r1.d n(View view) {
        r1.d dVar = (r1.d) view.getLayoutParams();
        if (!dVar.f32157b) {
            b bVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                bVar = (b) superclass.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    r1.a aVar = (r1.a) bVar.value().getDeclaredConstructor(null).newInstance(null);
                    r1.a aVar2 = dVar.f32156a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f32156a = aVar;
                        dVar.f32157b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e3) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e3);
                }
            }
            dVar.f32157b = true;
        }
        return dVar;
    }

    public static void u(View view, int i) {
        r1.d dVar = (r1.d) view.getLayoutParams();
        int i10 = dVar.i;
        if (i10 != i) {
            Field field = n0.f19900a;
            view.offsetLeftAndRight(i - i10);
            dVar.i = i;
        }
    }

    public static void v(View view, int i) {
        r1.d dVar = (r1.d) view.getLayoutParams();
        int i10 = dVar.f32164j;
        if (i10 != i) {
            Field field = n0.f19900a;
            view.offsetTopAndBottom(i - i10);
            dVar.f32164j = i;
        }
    }

    @Override // g2.p
    public final void a(View view, int i, int i10, int i11, int i12, int i13, int[] iArr) {
        r1.a aVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z5 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                r1.d dVar = (r1.d) childAt.getLayoutParams();
                if (dVar.a(i13) && (aVar = dVar.f32156a) != null) {
                    int[] iArr2 = this.f1300f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i10, i11, i12, iArr2);
                    iMax = i11 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i12 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z5) {
            p(1);
        }
    }

    @Override // g2.o
    public final void b(View view, int i, int i10, int i11, int i12, int i13) {
        a(view, i, i10, i11, i12, 0, this.f1301g);
    }

    @Override // g2.o
    public final boolean c(View view, View view2, int i, int i10) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                r1.d dVar = (r1.d) childAt.getLayoutParams();
                r1.a aVar = dVar.f32156a;
                if (aVar != null) {
                    boolean zO = aVar.o(childAt, i, i10);
                    z5 |= zO;
                    if (i10 == 0) {
                        dVar.f32167m = zO;
                    } else if (i10 == 1) {
                        dVar.f32168n = zO;
                    }
                } else if (i10 == 0) {
                    dVar.f32167m = false;
                } else if (i10 == 1) {
                    dVar.f32168n = false;
                }
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof r1.d) && super.checkLayoutParams(layoutParams);
    }

    @Override // g2.o
    public final void d(View view, View view2, int i, int i10) {
        c3 c3Var = this.f1313t;
        if (i10 == 1) {
            c3Var.f4006b = i;
        } else {
            c3Var.f4005a = i;
        }
        this.f1305l = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((r1.d) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r1.a aVar = ((r1.d) view.getLayoutParams()).f32156a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1310q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // g2.o
    public final void e(View view, int i) {
        c3 c3Var = this.f1313t;
        if (i == 1) {
            c3Var.f4006b = 0;
        } else {
            c3Var.f4005a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            r1.d dVar = (r1.d) childAt.getLayoutParams();
            if (dVar.a(i)) {
                r1.a aVar = dVar.f32156a;
                if (aVar != null) {
                    aVar.p(childAt, view, i);
                }
                if (i == 0) {
                    dVar.f32167m = false;
                } else if (i == 1) {
                    dVar.f32168n = false;
                }
            }
        }
        this.f1305l = null;
    }

    @Override // g2.o
    public final void f(View view, int i, int i10, int[] iArr, int i11) {
        r1.a aVar;
        int childCount = getChildCount();
        boolean z5 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                r1.d dVar = (r1.d) childAt.getLayoutParams();
                if (dVar.a(i11) && (aVar = dVar.f32156a) != null) {
                    int[] iArr2 = this.f1300f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i, i10, iArr2, i11);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i10 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z5) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new r1.d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new r1.d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f1296b);
    }

    public final x1 getLastWindowInsets() {
        return this.f1308o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c3 c3Var = this.f1313t;
        return c3Var.f4006b | c3Var.f4005a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1310q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(r1.d dVar, Rect rect, int i, int i10) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i10 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z5) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z5) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        i iVar = (i) this.f1297c.f14900c;
        int i = iVar.f20340d;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i; i10++) {
            ArrayList arrayList2 = (ArrayList) iVar.i(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iVar.f(i10));
            }
        }
        ArrayList arrayList3 = this.f1299e;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.f32172a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f32172a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f32173b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.f1303j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i10) {
        d dVar = f1295y;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i, i10);
        } finally {
            rectG.setEmpty();
            dVar.c(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f1307n) {
            if (this.f1306m == null) {
                this.f1306m = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1306m);
        }
        if (this.f1308o == null) {
            Field field = n0.f19900a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f1307n && this.f1306m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1306m);
        }
        View view = this.f1305l;
        if (view != null) {
            e(view, 0);
        }
        this.i = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1309p || this.f1310q == null) {
            return;
        }
        x1 x1Var = this.f1308o;
        int iD = x1Var != null ? x1Var.d() : 0;
        if (iD > 0) {
            this.f1310q.setBounds(0, 0, getWidth(), iD);
            this.f1310q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zR;
        }
        t(true);
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        r1.a aVar;
        Field field = n0.f19900a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1296b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((aVar = ((r1.d) view.getLayoutParams()).f32156a) == null || !aVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z5) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                r1.d dVar = (r1.d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    r1.a aVar = dVar.f32156a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        r1.a aVar;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                r1.d dVar = (r1.d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f32156a) != null) {
                    zI |= aVar.i(view);
                }
            }
        }
        return zI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i10, int[] iArr) {
        f(view, i, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i10, int i11, int i12) {
        b(view, i, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f28536b);
        SparseArray sparseArray = fVar.f32171d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            r1.a aVar = n(childAt).f32156a;
            if (id2 != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            r1.a aVar = ((r1.d) childAt.getLayoutParams()).f32156a;
            if (id2 != -1 && aVar != null && (parcelableN = aVar.n(childAt)) != null) {
                sparseArray.append(id2, parcelableN);
            }
        }
        fVar.f32171d = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f1304k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f1304k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            r1.d r6 = (r1.d) r6
            r1.a r6 = r6.f32156a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f1304k
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f1304k
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r23) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i) {
        Rect rectG;
        Rect rectG2;
        r1.d dVar = (r1.d) view.getLayoutParams();
        View view2 = dVar.f32165k;
        if (view2 == null && dVar.f32161f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar2 = f1295y;
        if (view2 != null) {
            rectG = g();
            rectG2 = g();
            try {
                k(view2, rectG);
                r1.d dVar3 = (r1.d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectG, rectG2, dVar3, measuredWidth, measuredHeight);
                h(dVar3, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                dVar2.c(rectG);
                rectG2.setEmpty();
                dVar2.c(rectG2);
            }
        }
        int i10 = dVar.f32160e;
        if (i10 < 0) {
            r1.d dVar4 = (r1.d) view.getLayoutParams();
            rectG = g();
            rectG.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin);
            if (this.f1308o != null) {
                Field field = n0.f19900a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG.left = this.f1308o.b() + rectG.left;
                    rectG.top = this.f1308o.d() + rectG.top;
                    rectG.right -= this.f1308o.c();
                    rectG.bottom -= this.f1308o.a();
                }
            }
            rectG2 = g();
            int i11 = dVar4.f32158c;
            if ((i11 & 7) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            Gravity.apply(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG, rectG2, i);
            view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
            return;
        }
        r1.d dVar5 = (r1.d) view.getLayoutParams();
        int i12 = dVar5.f32158c;
        if (i12 == 0) {
            i12 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i);
        int i13 = absoluteGravity & 7;
        int i14 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i10 = width - i10;
        }
        int iM = m(i10) - measuredWidth2;
        if (i13 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i13 == 5) {
            iM += measuredWidth2;
        }
        int i15 = i14 != 16 ? i14 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar5).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar5).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar5).topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar5).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1298d;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        l lVar = f1294x;
        if (lVar != null) {
            Collections.sort(arrayList, lVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            r1.a aVar = ((r1.d) view.getLayoutParams()).f32156a;
            if (zF && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        aVar.f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        aVar.q(view, motionEventObtain);
                    }
                }
            } else if (!zF && aVar != null) {
                if (i == 0) {
                    zF = aVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    zF = aVar.q(view, motionEvent);
                }
                if (zF) {
                    this.f1304k = view;
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        r1.a aVar = ((r1.d) view.getLayoutParams()).f32156a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (!z5 || this.f1302h) {
            return;
        }
        t(false);
        this.f1302h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z5) {
        super.setFitsSystemWindows(z5);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1311r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1310q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f1310q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f1310q.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1310q;
                Field field = n0.f19900a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f1310q.setVisible(getVisibility() == 0, false);
                this.f1310q.setCallback(this);
            }
            Field field2 = n0.f19900a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z5 = i == 0;
        Drawable drawable = this.f1310q;
        if (drawable == null || drawable.isVisible() == z5) {
            return;
        }
        this.f1310q.setVisible(z5, false);
    }

    public final void t(boolean z5) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            r1.a aVar = ((r1.d) childAt.getLayoutParams()).f32156a;
            if (aVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z5) {
                    aVar.f(this, childAt, motionEventObtain);
                } else {
                    aVar.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((r1.d) getChildAt(i10).getLayoutParams()).getClass();
        }
        this.f1304k = null;
        this.f1302h = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1310q;
    }

    public final void w() {
        Field field = n0.f19900a;
        if (!getFitsSystemWindows()) {
            f0.c(this, null);
            return;
        }
        if (this.f1312s == null) {
            this.f1312s = new m4.d(this);
        }
        f0.c(this, this.f1312s);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof r1.d ? new r1.d((r1.d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new r1.d((ViewGroup.MarginLayoutParams) layoutParams) : new r1.d(layoutParams);
    }
}
