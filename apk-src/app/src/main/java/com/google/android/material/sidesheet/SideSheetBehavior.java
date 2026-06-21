package com.google.android.material.sidesheet;

import ac.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.b4;
import com.twinby.R;
import g2.n0;
import h2.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m4.d;
import nc.g;
import nc.k;
import oc.b;
import r1.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f14645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f14646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f14647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f14648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f14649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14651h;
    public n2.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f14653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WeakReference f14657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f14658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f14659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public VelocityTracker f14660r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14661s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f14662t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ac.d f14663u;

    public SideSheetBehavior() {
        this.f14648e = new h(this);
        this.f14650g = true;
        this.f14651h = 5;
        this.f14653k = 0.1f;
        this.f14659q = -1;
        this.f14662t = new LinkedHashSet();
        this.f14663u = new ac.d(this, 1);
    }

    @Override // r1.a
    public final void c(r1.d dVar) {
        this.f14657o = null;
        this.i = null;
    }

    @Override // r1.a
    public final void e() {
        this.f14657o = null;
        this.i = null;
    }

    @Override // r1.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        n2.g gVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && n0.c(view) == null) || !this.f14650g) {
            this.f14652j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f14660r) != null) {
            velocityTracker.recycle();
            this.f14660r = null;
        }
        if (this.f14660r == null) {
            this.f14660r = VelocityTracker.obtain();
        }
        this.f14660r.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f14661s = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f14652j) {
            this.f14652j = false;
            return false;
        }
        return (this.f14652j || (gVar = this.i) == null || !gVar.r(motionEvent)) ? false : true;
    }

    @Override // r1.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i10;
        int i11;
        View viewFindViewById;
        Field field = n0.f19900a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int left = 0;
        if (this.f14657o == null) {
            this.f14657o = new WeakReference(view);
            g gVar = this.f14645b;
            if (gVar != null) {
                view.setBackground(gVar);
                float elevation = this.f14649f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                gVar.i(elevation);
            } else {
                ColorStateList colorStateList = this.f14646c;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i12 = this.f14651h == 5 ? 4 : 0;
            if (view.getVisibility() != i12) {
                view.setVisibility(i12);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (n0.c(view) == null) {
                n0.l(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.i == null) {
            this.i = new n2.g(coordinatorLayout.getContext(), coordinatorLayout, this.f14663u);
        }
        d dVar = this.f14644a;
        dVar.getClass();
        int left2 = view.getLeft() - ((SideSheetBehavior) dVar.f28630b).f14656n;
        coordinatorLayout.q(view, i);
        this.f14655m = coordinatorLayout.getWidth();
        this.f14654l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            dVar.getClass();
            i10 = marginLayoutParams.rightMargin;
        } else {
            i10 = 0;
        }
        this.f14656n = i10;
        int i13 = this.f14651h;
        if (i13 == 1 || i13 == 2) {
            dVar.getClass();
            left = left2 - (view.getLeft() - ((SideSheetBehavior) dVar.f28630b).f14656n);
        } else if (i13 != 3) {
            if (i13 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f14651h);
            }
            left = ((SideSheetBehavior) dVar.f28630b).f14655m;
        }
        view.offsetLeftAndRight(left);
        if (this.f14658p == null && (i11 = this.f14659q) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f14658p = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f14662t.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // r1.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // r1.a
    public final void m(View view, Parcelable parcelable) {
        int i = ((b) parcelable).f30632d;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f14651h = i;
    }

    @Override // r1.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new b(this);
    }

    @Override // r1.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f14651h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f14660r) != null) {
            velocityTracker.recycle();
            this.f14660r = null;
        }
        if (this.f14660r == null) {
            this.f14660r = VelocityTracker.obtain();
        }
        this.f14660r.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f14652j && s()) {
            float fAbs = Math.abs(this.f14661s - motionEvent.getX());
            n2.g gVar = this.i;
            if (fAbs > gVar.f29016b) {
                gVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f14652j;
    }

    public final void r(int i) {
        View view;
        if (this.f14651h == i) {
            return;
        }
        this.f14651h = i;
        WeakReference weakReference = this.f14657o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i10 = this.f14651h == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
        Iterator it = this.f14662t.iterator();
        if (it.hasNext()) {
            throw om1.i(it);
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.f14650g || this.f14651h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r0.q(r1, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r(2);
        r2.f14648e.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            m4.d r0 = r2.f14644a
            java.lang.Object r0 = r0.f28630b
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            r1 = 3
            if (r4 == r1) goto L21
            r1 = 5
            if (r4 != r1) goto L15
            m4.d r1 = r0.f14644a
            java.lang.Object r1 = r1.f28630b
            com.google.android.material.sidesheet.SideSheetBehavior r1 = (com.google.android.material.sidesheet.SideSheetBehavior) r1
            int r1 = r1.f14655m
            goto L27
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = l7.o.i(r4, r5)
            r3.<init>(r4)
            throw r3
        L21:
            m4.d r1 = r0.f14644a
            int r1 = r1.h()
        L27:
            n2.g r0 = r0.i
            if (r0 == 0) goto L5f
            if (r5 == 0) goto L38
            int r3 = r3.getTop()
            boolean r3 = r0.q(r1, r3)
            if (r3 == 0) goto L5f
            goto L55
        L38:
            int r5 = r3.getTop()
            r0.f29031r = r3
            r3 = -1
            r0.f29017c = r3
            r3 = 0
            boolean r3 = r0.i(r1, r5, r3, r3)
            if (r3 != 0) goto L53
            int r5 = r0.f29015a
            if (r5 != 0) goto L53
            android.view.View r5 = r0.f29031r
            if (r5 == 0) goto L53
            r5 = 0
            r0.f29031r = r5
        L53:
            if (r3 == 0) goto L5f
        L55:
            r3 = 2
            r2.r(r3)
            ac.h r3 = r2.f14648e
            r3.b(r4)
            return
        L5f:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f14657o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        n0.h(view, 262144);
        n0.f(view, 0);
        n0.h(view, 1048576);
        n0.f(view, 0);
        int i = 5;
        if (this.f14651h != 5) {
            n0.i(view, c.f20352j, new oc.a(this, i, 0));
        }
        int i10 = 3;
        if (this.f14651h != 3) {
            n0.i(view, c.f20351h, new oc.a(this, i10, 0));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f14648e = new h(this);
        this.f14650g = true;
        this.f14651h = 5;
        this.f14653k = 0.1f;
        this.f14659q = -1;
        this.f14662t = new LinkedHashSet();
        this.f14663u = new ac.d(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vb.a.f34826r);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f14646c = b4.u(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f14647d = k.b(context, attributeSet, 0, 2131887099).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f14659q = resourceId;
            WeakReference weakReference = this.f14658p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f14658p = null;
            WeakReference weakReference2 = this.f14657o;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    Field field = n0.f19900a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f14647d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f14645b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f14646c;
            if (colorStateList != null) {
                this.f14645b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f14645b.setTint(typedValue.data);
            }
        }
        this.f14649f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f14650g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f14644a == null) {
            this.f14644a = new d(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
