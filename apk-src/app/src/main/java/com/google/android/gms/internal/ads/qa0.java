package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qa0 extends ug implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, eb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f9383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f9384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f9385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f9386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fa0 f9387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gh f9388g;

    public qa0(View view, HashMap map, HashMap map2) {
        ViewTreeObserver viewTreeObserver;
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        this.f9384c = new HashMap();
        this.f9385d = new HashMap();
        this.f9386e = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        fp fpVar = p9.k.C.B;
        mx mxVar = new mx(view, this);
        View view2 = (View) ((WeakReference) mxVar.f6568b).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            mxVar.F1(viewTreeObserver3);
        }
        nx nxVar = new nx(view, this);
        View view3 = (View) ((WeakReference) nxVar.f6568b).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            nxVar.F1(viewTreeObserver2);
        }
        this.f9383b = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f9384c.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f9386e.putAll(this.f9384c);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f9385d.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f9386e.putAll(this.f9385d);
        this.f9388g = new gh(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final FrameLayout S3() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized View c0(String str) {
        WeakReference weakReference = (WeakReference) this.f9386e.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized Map d() {
        return this.f9386e;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized Map e() {
        return this.f9385d;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final View e2() {
        return (View) this.f9383b.get();
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
            vg.f(parcel);
            synchronized (this) {
                Object objX1 = xa.b.X1(aVarL1);
                if (objX1 instanceof fa0) {
                    fa0 fa0Var = this.f9387f;
                    if (fa0Var != null) {
                        fa0Var.r(this);
                    }
                    fa0 fa0Var2 = (fa0) objX1;
                    if (fa0Var2.f5283p.b()) {
                        this.f9387f = fa0Var2;
                        fa0Var2.q(this);
                        this.f9387f.f(e2());
                    } else {
                        u9.i.e("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                } else {
                    u9.i.h("Not an instance of InternalNativeAd. This is most likely a transient error");
                }
            }
        } else if (i == 2) {
            synchronized (this) {
                fa0 fa0Var3 = this.f9387f;
                if (fa0Var3 != null) {
                    fa0Var3.r(this);
                    this.f9387f = null;
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
            vg.f(parcel);
            synchronized (this) {
                try {
                    if (this.f9387f != null) {
                        Object objX12 = xa.b.X1(aVarL12);
                        if (!(objX12 instanceof View)) {
                            u9.i.h("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        fa0 fa0Var4 = this.f9387f;
                        View view = (View) objX12;
                        synchronized (fa0Var4) {
                            fa0Var4.f5281n.b(view);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final gh m() {
        return this.f9388g;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized Map n() {
        return this.f9384c;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized JSONObject o() {
        JSONObject jSONObjectJ;
        fa0 fa0Var = this.f9387f;
        if (fa0Var == null) {
            return null;
        }
        View viewE2 = e2();
        Map mapD = d();
        Map mapN = n();
        synchronized (fa0Var) {
            jSONObjectJ = fa0Var.f5281n.j(viewE2, mapD, mapN, fa0Var.k());
        }
        return jSONObjectJ;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        fa0 fa0Var = this.f9387f;
        if (fa0Var != null) {
            fa0Var.s(view, e2(), d(), n(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        fa0 fa0Var = this.f9387f;
        if (fa0Var != null) {
            fa0Var.t(e2(), d(), n(), fa0.d(e2()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        fa0 fa0Var = this.f9387f;
        if (fa0Var != null) {
            fa0Var.t(e2(), d(), n(), fa0.d(e2()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        fa0 fa0Var = this.f9387f;
        if (fa0Var != null) {
            View viewE2 = e2();
            synchronized (fa0Var) {
                fa0Var.f5281n.v(viewE2, motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized String q() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized xa.a r() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized void r3(View view, String str) {
        this.f9386e.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f9384c.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized JSONObject s() {
        return null;
    }
}
