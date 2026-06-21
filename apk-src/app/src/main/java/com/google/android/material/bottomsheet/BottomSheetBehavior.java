package com.google.android.material.bottomsheet;

import a0.u;
import ac.d;
import ac.h;
import ac.i;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.j0;
import com.google.android.gms.internal.measurement.b4;
import com.twinby.R;
import com.vk.api.sdk.exceptions.VKApiCodes;
import d8.e0;
import g2.b;
import g2.f0;
import g2.n0;
import g2.w0;
import g2.x0;
import g2.y0;
import h2.c;
import h3.e;
import ic.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import l7.o;
import n2.g;
import nc.f;
import nc.k;
import r1.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a {
    public final h A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public g M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14483a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f14484a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14485b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public HashMap f14486b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14487c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f14488c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14489d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final d f14490d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14494h;
    public final nc.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f14495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f14499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f14500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f14501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f14502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f14503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f14504s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14505t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14506u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14507v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f14509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k f14510y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14511z;

    public BottomSheetBehavior() {
        this.f14483a = 0;
        this.f14485b = true;
        this.f14496k = -1;
        this.f14497l = -1;
        this.A = new h(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.f14488c0 = new SparseIntArray();
        this.f14490d0 = new d(this, 0);
    }

    public static View u(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        Field field = n0.f19900a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewU = u(viewGroup.getChildAt(i));
            if (viewU != null) {
                return viewU;
            }
        }
        return null;
    }

    public static int v(int i, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
        }
        if (size != 0) {
            i11 = Math.min(size, i11);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
    }

    public final void A(int i) {
        if (this.L == i) {
            return;
        }
        this.L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z5 = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            F(true);
        } else if (i == 6 || i == 5 || i == 4) {
            F(false);
        }
        E(i, true);
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            D();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean B(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f10 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) s()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        A(2);
        E(r4, true);
        r2.A.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.q(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.x(r4)
            n2.g r1 = r2.M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.q(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f29031r = r3
            r3 = -1
            r1.f29017c = r3
            r3 = 0
            boolean r3 = r1.i(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f29015a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f29031r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f29031r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.A(r3)
            r3 = 1
            r2.E(r4, r3)
            ac.h r3 = r2.A
            r3.b(r4)
            return
        L40:
            r2.A(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(android.view.View, int, boolean):void");
    }

    public final void D() {
        View view;
        int iA;
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        n0.h(view, 524288);
        n0.f(view, 0);
        n0.h(view, 262144);
        n0.f(view, 0);
        n0.h(view, 1048576);
        n0.f(view, 0);
        SparseIntArray sparseIntArray = this.f14488c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            n0.h(view, i);
            n0.f(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f14485b && this.L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            e0 e0Var = new e0(this, i, 1);
            ArrayList arrayListD = n0.d(view);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayListD.size()) {
                    int i11 = 0;
                    int i12 = -1;
                    while (true) {
                        int[] iArr = n0.f19902c;
                        if (i11 >= 32 || i12 != -1) {
                            break;
                        }
                        int i13 = iArr[i11];
                        boolean z5 = true;
                        for (int i14 = 0; i14 < arrayListD.size(); i14++) {
                            z5 &= ((c) arrayListD.get(i14)).a() != i13;
                        }
                        if (z5) {
                            i12 = i13;
                        }
                        i11++;
                    }
                    iA = i12;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c) arrayListD.get(i10)).f20355a).getLabel())) {
                        iA = ((c) arrayListD.get(i10)).a();
                        break;
                    }
                    i10++;
                }
            }
            if (iA != -1) {
                c cVar = new c(null, iA, string, e0Var, null);
                View.AccessibilityDelegate accessibilityDelegateB = n0.b(view);
                b bVar = accessibilityDelegateB == null ? null : accessibilityDelegateB instanceof g2.a ? ((g2.a) accessibilityDelegateB).f19827a : new b(accessibilityDelegateB);
                if (bVar == null) {
                    bVar = new b();
                }
                n0.k(view, bVar);
                n0.h(view, cVar.a());
                n0.d(view).add(cVar);
                n0.f(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i15 = 5;
            if (this.L != 5) {
                n0.i(view, c.f20352j, new e0(this, i15, 1));
            }
        }
        int i16 = this.L;
        int i17 = 4;
        int i18 = 3;
        if (i16 == 3) {
            n0.i(view, c.i, new e0(this, this.f14485b ? 4 : 6, 1));
            return;
        }
        if (i16 == 4) {
            n0.i(view, c.f20351h, new e0(this, this.f14485b ? 3 : 6, 1));
        } else {
            if (i16 != 6) {
                return;
            }
            n0.i(view, c.i, new e0(this, i17, 1));
            n0.i(view, c.f20351h, new e0(this, i18, 1));
        }
    }

    public final void E(int i, boolean z5) {
        nc.g gVar;
        float f10;
        if (i == 2) {
            return;
        }
        boolean z10 = this.L == 3 && (this.f14509x || w() == 0);
        if (this.f14511z == z10 || (gVar = this.i) == null) {
            return;
        }
        this.f14511z = z10;
        ValueAnimator valueAnimator = this.B;
        if (z5 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            f10 = z10 ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f10, f10);
            valueAnimator.start();
            return;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        f10 = this.f14511z ? 0.0f : 1.0f;
        f fVar = gVar.f29225b;
        if (fVar.i != f10) {
            fVar.i = f10;
            gVar.f29229f = true;
            gVar.invalidateSelf();
        }
    }

    public final void F(boolean z5) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z5) {
                if (this.f14486b0 != null) {
                    return;
                } else {
                    this.f14486b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.U.get() && z5) {
                    this.f14486b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z5) {
                return;
            }
            this.f14486b0 = null;
        }
    }

    public final void G() {
        View view;
        if (this.U != null) {
            r();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // r1.a
    public final void c(r1.d dVar) {
        this.U = null;
        this.M = null;
    }

    @Override // r1.a
    public final void e() {
        this.U = null;
        this.M = null;
    }

    @Override // r1.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        g gVar;
        if (!view.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x10, this.Z)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f14484a0 = true;
                }
            }
            this.N = this.Y == -1 && !coordinatorLayout.o(view, x10, this.Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f14484a0 = false;
            this.Y = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (this.N || (gVar = this.M) == null || !gVar.r(motionEvent)) {
            WeakReference weakReference2 = this.V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(this.Z - motionEvent.getY()) <= this.M.f29016b) {
                return false;
            }
        }
        return true;
    }

    @Override // r1.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        Field field = n0.f19900a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.U == null) {
            this.f14493g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i10 = Build.VERSION.SDK_INT;
            boolean z5 = (i10 < 29 || this.f14499n || this.f14492f) ? false : true;
            if (this.f14500o || this.f14501p || this.f14502q || this.f14504s || this.f14505t || this.f14506u || z5) {
                ac.c cVar = new ac.c(this, z5);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                j0 j0Var = new j0();
                j0Var.f6666a = paddingStart;
                j0Var.f6667b = paddingEnd;
                j0Var.f6668c = paddingBottom;
                f0.c(view, new e(13, cVar, j0Var));
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new m());
                }
            }
            i iVar = new i();
            iVar.f759e = new int[2];
            iVar.f758d = view;
            if (i10 >= 30) {
                view.setWindowInsetsAnimationCallback(new y0(iVar));
            } else {
                PathInterpolator pathInterpolator = x0.f19938e;
                View.OnApplyWindowInsetsListener w0Var = new w0(view, iVar);
                view.setTag(R.id.tag_window_insets_animation_callback, w0Var);
                if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    view.setOnApplyWindowInsetsListener(w0Var);
                }
            }
            this.U = new WeakReference(view);
            nc.g gVar = this.i;
            if (gVar != null) {
                view.setBackground(gVar);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                gVar.i(elevation);
            } else {
                ColorStateList colorStateList = this.f14495j;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            D();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.M == null) {
            this.M = new g(coordinatorLayout.getContext(), coordinatorLayout, this.f14490d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int i11 = this.T;
        int i12 = i11 - height;
        int i13 = this.f14508w;
        if (i12 < i13) {
            if (this.f14503r) {
                this.R = i11;
            } else {
                this.R = i11 - i13;
            }
        }
        this.D = Math.max(0, i11 - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        r();
        int i14 = this.L;
        if (i14 == 3) {
            view.offsetTopAndBottom(w());
        } else if (i14 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i14 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i14 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i14 == 1 || i14 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        E(this.L, false);
        this.V = new WeakReference(u(view));
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // r1.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(v(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f14496k, marginLayoutParams.width), v(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f14497l, marginLayoutParams.height));
        return true;
    }

    @Override // r1.a
    public final boolean i(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // r1.a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i10, int[] iArr, int i11) {
        if (i11 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i12 = top - i10;
        boolean z5 = this.K;
        if (i10 > 0) {
            if (i12 < w()) {
                int iW = top - w();
                iArr[1] = iW;
                int i13 = -iW;
                Field field = n0.f19900a;
                view.offsetTopAndBottom(i13);
                A(3);
            } else {
                if (!z5) {
                    return;
                }
                iArr[1] = i10;
                Field field2 = n0.f19900a;
                view.offsetTopAndBottom(-i10);
                A(1);
            }
        } else if (i10 < 0 && !view2.canScrollVertically(-1)) {
            int i14 = this.G;
            if (i12 > i14 && !this.I) {
                int i15 = top - i14;
                iArr[1] = i15;
                int i16 = -i15;
                Field field3 = n0.f19900a;
                view.offsetTopAndBottom(i16);
                A(4);
            } else {
                if (!z5) {
                    return;
                }
                iArr[1] = i10;
                Field field4 = n0.f19900a;
                view.offsetTopAndBottom(-i10);
                A(1);
            }
        }
        t(view.getTop());
        this.O = i10;
        this.P = true;
    }

    @Override // r1.a
    public final void m(View view, Parcelable parcelable) {
        ac.f fVar = (ac.f) parcelable;
        int i = this.f14483a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f14491e = fVar.f744e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f14485b = fVar.f745f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = fVar.f746g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = fVar.f747h;
            }
        }
        int i10 = fVar.f743d;
        if (i10 == 1 || i10 == 2) {
            this.L = 4;
        } else {
            this.L = i10;
        }
    }

    @Override // r1.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new ac.f(this);
    }

    @Override // r1.a
    public final boolean o(View view, int i, int i10) {
        this.O = 0;
        this.P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // r1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.w()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.A(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f14485b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f14487c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.X
            int r0 = r3.Y
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.B(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f14485b
            if (r2 == 0) goto L74
            int r6 = r3.D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.E
            if (r5 >= r2) goto L83
            int r0 = r3.G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f14485b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.C(r4, r1, r5)
            r3.P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // r1.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        g gVar = this.M;
        if (gVar != null && (this.K || i == 1)) {
            gVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float fAbs = Math.abs(this.Z - motionEvent.getY());
            g gVar2 = this.M;
            if (fAbs > gVar2.f29016b) {
                gVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void r() {
        int iS = s();
        if (this.f14485b) {
            this.G = Math.max(this.T - iS, this.D);
        } else {
            this.G = this.T - iS;
        }
    }

    public final int s() {
        int i;
        return this.f14492f ? Math.min(Math.max(this.f14493g, this.T - ((this.S * 9) / 16)), this.R) + this.f14507v : (this.f14499n || this.f14500o || (i = this.f14498m) <= 0) ? this.f14491e + this.f14507v : Math.max(this.f14491e, i + this.f14494h);
    }

    public final void t(int i) {
        if (((View) this.U.get()) != null) {
            ArrayList arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i10 = this.G;
            if (i <= i10 && i10 != w()) {
                w();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int w() {
        if (this.f14485b) {
            return this.D;
        }
        return Math.max(this.C, this.f14503r ? 0 : this.f14508w);
    }

    public final int x(int i) {
        if (i == 3) {
            return w();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.T;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(o.i(i, "Invalid state to get top offset: "));
    }

    public final void y(int i) {
        if (i == -1) {
            if (this.f14492f) {
                return;
            } else {
                this.f14492f = true;
            }
        } else {
            if (!this.f14492f && this.f14491e == i) {
                return;
            }
            this.f14492f = false;
            this.f14491e = Math.max(0, i);
        }
        G();
    }

    public final void z(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(u.o(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i10 = (i == 6 && this.f14485b && x(i) <= this.D) ? 3 : i;
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            A(i);
            return;
        }
        View view = (View) this.U.get();
        ac.a aVar = new ac.a(this, view, i10);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            Field field = n0.f19900a;
            if (view.isAttachedToWindow()) {
                view.post(aVar);
                return;
            }
        }
        aVar.run();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i10 = 0;
        this.f14483a = 0;
        this.f14485b = true;
        this.f14496k = -1;
        this.f14497l = -1;
        this.A = new h(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.f14488c0 = new SparseIntArray();
        this.f14490d0 = new d(this, i10);
        this.f14494h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vb.a.f34810a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f14495j = b4.u(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f14510y = k.b(context, attributeSet, R.attr.bottomSheetStyle, 2131886957).a();
        }
        k kVar = this.f14510y;
        if (kVar != null) {
            nc.g gVar = new nc.g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f14495j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new ac.b(i10, this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f14496k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f14497l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            y(i);
        } else {
            y(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.I != z5) {
            this.I = z5;
            if (!z5 && this.L == 5) {
                z(4);
            }
            D();
        }
        this.f14499n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f14485b != z10) {
            this.f14485b = z10;
            if (this.U != null) {
                r();
            }
            A((this.f14485b && this.L == 6) ? 3 : this.L);
            E(this.L, true);
            D();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f14483a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.F = f10;
            if (this.U != null) {
                this.E = (int) ((1.0f - f10) * this.T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i11 = typedValuePeekValue2.data;
                if (i11 >= 0) {
                    this.C = i11;
                    E(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    E(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f14489d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f14500o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f14501p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f14502q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f14503r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f14504s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f14505t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f14506u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f14509x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f14487c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // r1.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
    }
}
