package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ra0 extends hn implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, eb0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final r51 f9770q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9771c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f9773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FrameLayout f9774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gx f9775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f9776h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fa0 f9777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public gh f9778k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public cn f9780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9781n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GestureDetector f9783p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f9772d = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xa.a f9779l = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9782o = false;
    public final int i = ModuleDescriptor.MODULE_VERSION;

    static {
        v41 v41Var = x41.f12018c;
        Object[] objArr = {"2011", "1009", "3010"};
        vv.j(3, objArr);
        f9770q = x41.x(3, objArr);
    }

    public ra0(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f9773e = frameLayout;
        this.f9774f = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f9771c = str;
        fp fpVar = p9.k.C.B;
        mx mxVar = new mx(frameLayout, this);
        View view = (View) ((WeakReference) mxVar.f6568b).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            mxVar.F1(viewTreeObserver3);
        }
        nx nxVar = new nx(frameLayout, this);
        View view2 = (View) ((WeakReference) nxVar.f6568b).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            nxVar.F1(viewTreeObserver2);
        }
        this.f9775g = hx.f6284f;
        this.f9778k = new gh(this.f9773e.getContext(), this.f9773e);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.in
    public final synchronized void F3(String str, xa.a aVar) {
        r3((View) xa.b.X1(aVar), str);
    }

    @Override // com.google.android.gms.internal.ads.in
    public final synchronized void H(xa.a aVar) {
        fa0 fa0Var = this.f9777j;
        View view = (View) xa.b.X1(aVar);
        synchronized (fa0Var) {
            fa0Var.f5281n.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.in
    public final synchronized xa.a Q(String str) {
        return new xa.b(c0(str));
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final FrameLayout S3() {
        return this.f9774f;
    }

    @Override // com.google.android.gms.internal.ads.in
    public final synchronized void X3(cn cnVar) {
        if (!this.f9782o) {
            this.f9781n = true;
            this.f9780m = cnVar;
            fa0 fa0Var = this.f9777j;
            if (fa0Var != null) {
                ha0 ha0Var = fa0Var.F;
                synchronized (ha0Var) {
                    ha0Var.f6082a = cnVar;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.in
    public final void a1(xa.a aVar) {
        onTouch(this.f9773e, (MotionEvent) xa.b.X1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized View c0(String str) {
        WeakReference weakReference;
        if (!this.f9782o && (weakReference = (WeakReference) this.f9772d.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized Map d() {
        return this.f9772d;
    }

    @Override // com.google.android.gms.internal.ads.in
    public final synchronized void d2(xa.a aVar) {
        if (this.f9782o) {
            return;
        }
        Object objX1 = xa.b.X1(aVar);
        if (!(objX1 instanceof fa0)) {
            u9.i.h("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        fa0 fa0Var = this.f9777j;
        if (fa0Var != null) {
            fa0Var.r(this);
        }
        synchronized (this) {
            this.f9775g.execute(new h30(8, this));
            fa0 fa0Var2 = (fa0) objX1;
            this.f9777j = fa0Var2;
            fa0Var2.q(this);
            this.f9777j.f(this.f9773e);
            fa0 fa0Var3 = this.f9777j;
            FrameLayout frameLayout = this.f9774f;
            wh0 wh0VarK = fa0Var3.f5280m.k();
            if (fa0Var3.f5283p.c() && wh0VarK != null && frameLayout != null) {
                l80 l80Var = p9.k.C.f31317x;
                ut0 ut0Var = wh0VarK.f11811a;
                l80Var.getClass();
                l80.s(new sh0(ut0Var, frameLayout, 0));
            }
            if (this.f9781n) {
                ha0 ha0Var = this.f9777j.F;
                cn cnVar = this.f9780m;
                synchronized (ha0Var) {
                    ha0Var.f6082a = cnVar;
                }
            }
            if (((Boolean) q9.s.f31967e.f31970c.a(al.D4)).booleanValue() && !TextUtils.isEmpty(this.f9777j.f5283p.e())) {
                m4(this.f9777j.f5283p.e());
            }
            l4();
        }
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized Map e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final /* synthetic */ View e2() {
        return this.f9773e;
    }

    @Override // com.google.android.gms.internal.ads.in
    public final synchronized void h0(xa.a aVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.in
    public final synchronized void i() {
        try {
            if (this.f9782o) {
                return;
            }
            fa0 fa0Var = this.f9777j;
            if (fa0Var != null) {
                fa0Var.r(this);
                this.f9777j = null;
            }
            this.f9772d.clear();
            this.f9773e.removeAllViews();
            this.f9774f.removeAllViews();
            this.f9772d = null;
            this.f9773e = null;
            this.f9774f = null;
            this.f9776h = null;
            this.f9778k = null;
            this.f9782o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void l4() {
        int iA;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Lc)).booleanValue()) {
            fa0 fa0Var = this.f9777j;
            synchronized (fa0Var) {
                iA = fa0Var.f5281n.A();
            }
            if (iA != 0) {
                this.f9783p = new GestureDetector(this.f9773e.getContext(), new va0(this.f9777j, this));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final gh m() {
        return this.f9778k;
    }

    public final synchronized void m4(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f9774f.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f9774f.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e3) {
                        u9.i.i("Encountered invalid base64 watermark.", e3);
                    }
                }
            }
            this.f9774f.addView(frameLayout);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized Map n() {
        return this.f9772d;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized JSONObject o() {
        JSONObject jSONObjectJ;
        fa0 fa0Var = this.f9777j;
        if (fa0Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.f9773e;
        Map mapD = d();
        Map mapN = n();
        synchronized (fa0Var) {
            jSONObjectJ = fa0Var.f5281n.j(frameLayout, mapD, mapN, fa0Var.k());
        }
        return jSONObjectJ;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean zU;
        fa0 fa0Var = this.f9777j;
        if (fa0Var != null) {
            synchronized (fa0Var) {
                zU = fa0Var.f5281n.u();
            }
            if (zU) {
                fa0 fa0Var2 = this.f9777j;
                synchronized (fa0Var2) {
                    fa0Var2.f5281n.y();
                }
                this.f9777j.s(view, this.f9773e, d(), n(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        fa0 fa0Var = this.f9777j;
        if (fa0Var != null) {
            FrameLayout frameLayout = this.f9773e;
            fa0Var.t(frameLayout, d(), n(), fa0.d(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        fa0 fa0Var = this.f9777j;
        if (fa0Var != null) {
            FrameLayout frameLayout = this.f9773e;
            fa0Var.t(frameLayout, d(), n(), fa0.d(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int iA;
        fa0 fa0Var = this.f9777j;
        if (fa0Var != null) {
            FrameLayout frameLayout = this.f9773e;
            synchronized (fa0Var) {
                fa0Var.f5281n.v(frameLayout, motionEvent);
            }
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Lc)).booleanValue() && this.f9783p != null) {
                fa0 fa0Var2 = this.f9777j;
                synchronized (fa0Var2) {
                    iA = fa0Var2.f5281n.A();
                }
                if (iA != 0) {
                    this.f9783p.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized String q() {
        return this.f9771c;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final xa.a r() {
        return this.f9779l;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized void r3(View view, String str) {
        if (!this.f9782o) {
            if (view == null) {
                this.f9772d.remove(str);
                return;
            }
            this.f9772d.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.internal.measurement.d4.D(this.i)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized JSONObject s() {
        JSONObject jSONObjectC;
        fa0 fa0Var = this.f9777j;
        if (fa0Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.f9773e;
        Map mapD = d();
        Map mapN = n();
        synchronized (fa0Var) {
            jSONObjectC = fa0Var.f5281n.c(frameLayout, mapD, mapN, fa0Var.k());
        }
        return jSONObjectC;
    }

    @Override // com.google.android.gms.internal.ads.in
    public final synchronized void w0(xa.a aVar) {
        if (this.f9782o) {
            return;
        }
        this.f9779l = aVar;
    }
}
