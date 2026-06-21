package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ys extends zd1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12715h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f12719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sz f12720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Activity f12721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j0 f12722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f12723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f12724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ox0 f12725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PopupWindow f12726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RelativeLayout f12727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ViewGroup f12728v;

    static {
        h1.f fVar = new h1.f(7);
        Collections.addAll(fVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(fVar);
    }

    public ys(d00 d00Var, ox0 ox0Var) {
        super(6, (Object) d00Var, (Object) "resize", false);
        this.f12712e = "top-right";
        this.f12713f = true;
        this.f12714g = 0;
        this.f12715h = 0;
        this.i = -1;
        this.f12716j = 0;
        this.f12717k = 0;
        this.f12718l = -1;
        this.f12719m = new Object();
        this.f12720n = d00Var;
        this.f12721o = d00Var.d();
        this.f12725s = ox0Var;
    }

    public final void D(boolean z5) {
        synchronized (this.f12719m) {
            try {
                if (this.f12726t != null) {
                    if (!((Boolean) q9.s.f31967e.f31970c.a(al.f2928ac)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        E(z5);
                    } else {
                        hx.f6284f.a(new aa.h0(1, this, z5));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(boolean z5) {
        wk wkVar = al.f2944bc;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        boolean zBooleanValue = ((Boolean) ykVar.a(wkVar)).booleanValue();
        sz szVar = this.f12720n;
        if (zBooleanValue) {
            this.f12727u.removeView((View) szVar);
            this.f12726t.dismiss();
        } else {
            this.f12726t.dismiss();
            this.f12727u.removeView((View) szVar);
        }
        if (((Boolean) ykVar2.a(al.f2959cc)).booleanValue()) {
            View view = (View) szVar;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.f12728v;
        if (viewGroup != null) {
            viewGroup.removeView(this.f12723q);
            if (((Boolean) ykVar2.a(al.f2975dc)).booleanValue()) {
                try {
                    this.f12728v.addView((View) szVar);
                    szVar.W0(this.f12722p);
                } catch (IllegalStateException e3) {
                    u9.i.f("Unable to add webview back to view hierarchy.", e3);
                    p9.k.C.f31302h.d("MraidCallResizeHandler.collapseInternal", e3);
                }
            } else {
                this.f12728v.addView((View) szVar);
                szVar.W0(this.f12722p);
            }
        }
        if (z5) {
            B("default");
            ox0 ox0Var = this.f12725s;
            if (ox0Var != null) {
                ((xc0) ox0Var.f8851c).f12111c.A1(v60.f11257g);
            }
        }
        this.f12726t = null;
        this.f12727u = null;
        this.f12728v = null;
        this.f12724r = null;
    }
}
