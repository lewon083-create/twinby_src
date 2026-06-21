package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g2.n0;
import h2.c;
import java.lang.reflect.Field;
import m4.d;
import n2.g;
import r1.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f14476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14479d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14480e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f14481f = 0.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yb.a f14482g = new yb.a(this);

    @Override // r1.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f14477b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f14477b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f14477b = false;
        }
        if (zO) {
            if (this.f14476a == null) {
                this.f14476a = new g(coordinatorLayout.getContext(), coordinatorLayout, this.f14482g);
            }
            if (!this.f14478c && this.f14476a.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // r1.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        Field field = n0.f19900a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            n0.h(view, 1048576);
            n0.f(view, 0);
            if (r(view)) {
                n0.i(view, c.f20352j, new d(this));
            }
        }
        return false;
    }

    @Override // r1.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f14476a == null) {
            return false;
        }
        if (this.f14478c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f14476a.k(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
