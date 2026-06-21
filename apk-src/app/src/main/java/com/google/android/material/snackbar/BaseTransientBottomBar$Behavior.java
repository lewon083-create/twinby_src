package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import k6.t0;
import ob.y;
import pc.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f14664h;

    public BaseTransientBottomBar$Behavior() {
        y yVar = new y(24);
        this.f14480e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f14481f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f14479d = 0;
        this.f14664h = yVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, r1.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f14664h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (t0.f27178d == null) {
                    t0.f27178d = new t0(9);
                }
                synchronized (t0.f27178d.f27180c) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (t0.f27178d == null) {
                t0.f27178d = new t0(9);
            }
            synchronized (t0.f27178d.f27180c) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f14664h.getClass();
        return view instanceof b;
    }
}
