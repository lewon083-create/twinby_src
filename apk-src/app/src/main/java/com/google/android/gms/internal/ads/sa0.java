package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sa0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f10218k = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9.e0 f10219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iq0 f10220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final la0 f10221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ja0 f10222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final za0 f10223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final db0 f10224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f10225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f10226h;
    public final wm i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ha0 f10227j;

    public sa0(t9.e0 e0Var, iq0 iq0Var, la0 la0Var, ja0 ja0Var, za0 za0Var, db0 db0Var, Executor executor, gx gxVar, ha0 ha0Var) {
        this.f10219a = e0Var;
        this.f10220b = iq0Var;
        this.i = iq0Var.f6577j;
        this.f10221c = la0Var;
        this.f10222d = ja0Var;
        this.f10223e = za0Var;
        this.f10224f = db0Var;
        this.f10225g = executor;
        this.f10226h = gxVar;
        this.f10227j = ha0Var;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(eb0 eb0Var) {
        if (eb0Var == null) {
            return;
        }
        Context context = eb0Var.e2().getContext();
        if (com.google.android.gms.internal.measurement.d4.J(context, this.f10221c.f7468a)) {
            if (!(context instanceof Activity)) {
                u9.i.c("Activity context is needed for policy validator.");
                return;
            }
            db0 db0Var = this.f10224f;
            if (db0Var == null || eb0Var.S3() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(db0Var.a(eb0Var.S3(), windowManager), com.google.android.gms.internal.measurement.d4.L());
            } catch (b00 e3) {
                t9.c0.n("web view can not be obtained", e3);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z5) {
        View view;
        if (z5) {
            ja0 ja0Var = this.f10222d;
            synchronized (ja0Var) {
                view = ja0Var.f6779o;
            }
        } else {
            ja0 ja0Var2 = this.f10222d;
            synchronized (ja0Var2) {
                view = ja0Var2.f6780p;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) q9.s.f31967e.f31970c.a(al.A4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
