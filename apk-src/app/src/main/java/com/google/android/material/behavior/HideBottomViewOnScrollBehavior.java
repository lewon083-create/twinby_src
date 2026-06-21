package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.om1;
import com.twinby.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.b;
import r1.a;
import ya.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f14471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f14472e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f14475h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f14468a = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14473f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14474g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // r1.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f14473f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f14469b = e.x(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f14470c = e.x(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f14471d = e.y(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, wb.a.f35221d);
        this.f14472e = e.y(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, wb.a.f35220c);
        return false;
    }

    @Override // r1.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f14468a;
        if (i > 0) {
            if (this.f14474g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f14475h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f14474g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw om1.i(it);
            }
            this.f14475h = view.animate().translationY(this.f14473f).setInterpolator(this.f14472e).setDuration(this.f14470c).setListener(new b(4, this));
            return;
        }
        if (i >= 0 || this.f14474g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f14475h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f14474g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw om1.i(it2);
        }
        this.f14475h = view.animate().translationY(0).setInterpolator(this.f14471d).setDuration(this.f14469b).setListener(new b(4, this));
    }

    @Override // r1.a
    public boolean o(View view, int i, int i10) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
