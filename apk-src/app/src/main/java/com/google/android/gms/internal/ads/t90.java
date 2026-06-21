package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t90 implements ma0 {
    public q9.j1 D;
    public final g70 E;
    public final ua0 F;
    public final p9.a G;
    public final r50 H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na0 f10541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f10542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kc0 f10543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ja0 f10544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xe f10545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q60 f10546h;
    public final g60 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u80 f10547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xp0 f10548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u9.a f10549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final iq0 f10550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n30 f10551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wa0 f10552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ua.a f10553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t80 f10554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bt0 f10555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bd0 f10556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final as0 f10557t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ph0 f10558u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10560w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10559v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10561x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10562y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Point f10563z = new Point();
    public Point A = new Point();
    public long B = 0;
    public long C = 0;

    public t90(Context context, na0 na0Var, JSONObject jSONObject, kc0 kc0Var, ja0 ja0Var, xe xeVar, q60 q60Var, g60 g60Var, u80 u80Var, xp0 xp0Var, u9.a aVar, iq0 iq0Var, n30 n30Var, wa0 wa0Var, ua.a aVar2, t80 t80Var, bt0 bt0Var, as0 as0Var, ph0 ph0Var, bd0 bd0Var, ua0 ua0Var, g70 g70Var, p9.a aVar3, r50 r50Var) {
        this.f10540b = context;
        this.f10541c = na0Var;
        this.f10542d = jSONObject;
        this.f10543e = kc0Var;
        this.f10544f = ja0Var;
        this.f10545g = xeVar;
        this.f10546h = q60Var;
        this.i = g60Var;
        this.f10547j = u80Var;
        this.f10548k = xp0Var;
        this.f10549l = aVar;
        this.f10550m = iq0Var;
        this.f10551n = n30Var;
        this.f10552o = wa0Var;
        this.f10553p = aVar2;
        this.f10554q = t80Var;
        this.f10555r = bt0Var;
        this.f10557t = as0Var;
        this.f10558u = ph0Var;
        this.f10556s = bd0Var;
        this.F = ua0Var;
        this.E = g70Var;
        this.G = aVar3;
        this.H = r50Var;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final int A() {
        wm wmVar = this.f10550m.f6577j;
        if (wmVar == null) {
            return 0;
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Lc)).booleanValue()) {
            return wmVar.f11851j;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(android.view.View r13, org.json.JSONObject r14, org.json.JSONObject r15, org.json.JSONObject r16, org.json.JSONObject r17, java.lang.String r18, org.json.JSONObject r19, org.json.JSONObject r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t90.B(android.view.View, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, java.lang.String, org.json.JSONObject, org.json.JSONObject, boolean, boolean):void");
    }

    public final void C() {
        try {
            q9.j1 j1Var = this.D;
            if (j1Var != null) {
                j1Var.L1(j1Var.D0(), 1);
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void F(String str) {
        B(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void P() {
        kc0 kc0Var = this.f10543e;
        synchronized (kc0Var) {
            s71 s71Var = kc0Var.f7195m;
            if (s71Var == null) {
                return;
            }
            l80 l80Var = new l80(14);
            s71Var.a(new l81(0, s71Var, l80Var), kc0Var.f7188e);
            kc0Var.f7195m = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f10563z = new Point();
        this.A = new Point();
        if (!this.f10560w) {
            this.f10554q.F1(view);
            this.f10560w = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        n30 n30Var = this.f10551n;
        n30Var.getClass();
        n30Var.f8174k = new WeakReference(this);
        boolean zD = com.google.android.gms.internal.measurement.d4.D(this.f10549l.f34367d);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zD) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zD) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void b(View view) {
        if (!this.f10542d.optBoolean("custom_one_point_five_click_enabled", false)) {
            u9.i.h("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            wa0 wa0Var = this.f10552o;
            view.setOnClickListener(wa0Var);
            view.setClickable(true);
            wa0Var.f11713h = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f10540b;
        JSONObject jSONObjectH = com.google.android.gms.internal.measurement.d4.H(context, map, map2, view, scaleType);
        JSONObject jSONObjectE = com.google.android.gms.internal.measurement.d4.E(context, view);
        JSONObject jSONObjectF = com.google.android.gms.internal.measurement.d4.F(view);
        JSONObject jSONObjectG = com.google.android.gms.internal.measurement.d4.G(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectH);
            jSONObject.put("ad_view_signal", jSONObjectE);
            jSONObject.put("scroll_view_signal", jSONObjectF);
            jSONObject.put("lock_screen_signal", jSONObjectG);
            return jSONObject;
        } catch (JSONException e3) {
            u9.i.f("Unable to create native ad view signals JSON.", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void d(Bundle bundle) {
        if (bundle == null) {
            u9.i.c("Click data is null. No click is reported.");
            return;
        }
        if (!g("click_reporting")) {
            u9.i.e("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObjectL = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        u9.d dVar = q9.r.f31959g.f31960a;
        dVar.getClass();
        try {
            jSONObjectL = dVar.l(bundle);
        } catch (JSONException e3) {
            u9.i.f("Error converting Bundle to JSON", e3);
        }
        B(null, null, null, null, null, string, null, jSONObjectL, false, false);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void e(q9.l1 l1Var) {
        q9.m2 m2Var;
        q9.m2 m2Var2;
        as0 as0Var = this.f10557t;
        xp0 xp0Var = this.f10548k;
        bt0 bt0Var = this.f10555r;
        try {
            if (this.f10561x) {
                return;
            }
            if (l1Var == null) {
                ja0 ja0Var = this.f10544f;
                synchronized (ja0Var) {
                    m2Var = ja0Var.f6772g;
                }
                if (m2Var != null) {
                    this.f10561x = true;
                    synchronized (ja0Var) {
                        m2Var2 = ja0Var.f6772g;
                    }
                    bt0Var.b(m2Var2.f31938c, xp0Var.f12271x0, as0Var, null);
                    C();
                    return;
                }
            }
            this.f10561x = true;
            bt0Var.b(l1Var.c(), xp0Var.f12271x0, as0Var, null);
            C();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void e0() {
        x(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void f(View view, View view2, Map map, Map map2, boolean z5, ImageView.ScaleType scaleType) {
        Context context = this.f10540b;
        JSONObject jSONObjectH = com.google.android.gms.internal.measurement.d4.H(context, map, map2, view2, scaleType);
        JSONObject jSONObjectE = com.google.android.gms.internal.measurement.d4.E(context, view2);
        JSONObject jSONObjectF = com.google.android.gms.internal.measurement.d4.F(view2);
        JSONObject jSONObjectG = com.google.android.gms.internal.measurement.d4.G(context, view2);
        String strR = r(view, map);
        B(true == ((Boolean) q9.s.f31967e.f31970c.a(al.f3164q4)).booleanValue() ? view2 : view, jSONObjectE, jSONObjectH, jSONObjectF, jSONObjectG, strR, com.google.android.gms.internal.measurement.d4.I(strR, context, this.A, this.f10563z), null, z5, false);
    }

    public final boolean g(String str) {
        JSONObject jSONObjectOptJSONObject = this.f10542d.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void h(View view) {
        this.f10563z = new Point();
        this.A = new Point();
        if (view != null) {
            t80 t80Var = this.f10554q;
            synchronized (t80Var) {
                WeakHashMap weakHashMap = t80Var.f10524d;
                if (weakHashMap.containsKey(view)) {
                    ((gh) weakHashMap.get(view)).f5806m.remove(t80Var);
                    weakHashMap.remove(view);
                }
            }
        }
        this.f10560w = false;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void i(co coVar) {
        if (!this.f10542d.optBoolean("custom_one_point_five_click_enabled", false)) {
            u9.i.h("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        wa0 wa0Var = this.f10552o;
        kc0 kc0Var = wa0Var.f11707b;
        wa0Var.f11709d = coVar;
        so soVar = wa0Var.f11710e;
        if (soVar != null) {
            kc0Var.c("/unconfirmedClick", soVar);
        }
        so soVar2 = new so(4, wa0Var, coVar);
        wa0Var.f11710e = soVar2;
        kc0Var.b("/unconfirmedClick", soVar2);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final JSONObject j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectC = c(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f10562y && this.f10542d.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectC != null) {
                jSONObject.put("nas", jSONObjectC);
            }
            return jSONObject;
        } catch (JSONException e3) {
            u9.i.f("Unable to create native click meta data JSON.", e3);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void k() {
        this.f10562y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.ads.ma0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.view.View r17, android.view.View r18, java.util.Map r19, java.util.Map r20, boolean r21, android.widget.ImageView.ScaleType r22, int r23) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t90.l(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean, android.widget.ImageView$ScaleType, int):void");
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final boolean m() {
        return this.f10542d.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void n(Bundle bundle) {
        if (bundle == null) {
            u9.i.c("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!g("touch_reporting")) {
            u9.i.e("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f10545g.f12136b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        w();
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void o(q9.j1 j1Var) {
        this.D = j1Var;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void p(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f10540b;
        JSONObject jSONObjectH = com.google.android.gms.internal.measurement.d4.H(context, map, map2, view, scaleType);
        JSONObject jSONObjectE = com.google.android.gms.internal.measurement.d4.E(context, view);
        JSONObject jSONObjectF = com.google.android.gms.internal.measurement.d4.F(view);
        JSONObject jSONObjectG = com.google.android.gms.internal.measurement.d4.G(context, view);
        boolean zJ = com.google.android.gms.internal.measurement.d4.J(context, this.f10548k);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f10542d);
            jSONObject.put("asset_view_signal", jSONObjectH);
            jSONObject.put("ad_view_signal", jSONObjectE);
            jSONObject.put("scroll_view_signal", jSONObjectF);
            jSONObject.put("lock_screen_signal", jSONObjectG);
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3059j4)).booleanValue()) {
                jSONObject.put("view_signals", z(view));
            }
            jSONObject.put("policy_validator_enabled", zJ);
            jSONObject.put("screen", com.google.android.gms.internal.measurement.d4.K(context));
            ix.m(this.f10543e.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e3) {
            u9.i.f("Unable to create native ad signals logging JSON.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f10540b;
        x(com.google.android.gms.internal.measurement.d4.E(context, view), com.google.android.gms.internal.measurement.d4.H(context, map, map2, view, scaleType), com.google.android.gms.internal.measurement.d4.F(view), com.google.android.gms.internal.measurement.d4.G(context, view), z(view), null, com.google.android.gms.internal.measurement.d4.J(context, this.f10548k), view);
    }

    public final String r(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iQ = this.f10544f.q();
        if (iQ == 1) {
            return "1099";
        }
        if (iQ == 2) {
            return "2099";
        }
        if (iQ != 6) {
            return null;
        }
        return "3099";
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final boolean s(Bundle bundle) throws JSONException {
        JSONObject jSONObjectL;
        if (!g("impression_reporting")) {
            u9.i.e("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        u9.d dVar = q9.r.f31959g.f31960a;
        dVar.getClass();
        if (bundle != null) {
            try {
                jSONObjectL = dVar.l(bundle);
            } catch (JSONException e3) {
                u9.i.f("Error converting Bundle to JSON", e3);
                jSONObjectL = null;
            }
        } else {
            jSONObjectL = null;
        }
        return x(null, null, null, null, ((Boolean) q9.s.f31967e.f31970c.a(al.Hc)).booleanValue() ? z(null) : null, jSONObjectL, false, null);
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void t() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f10542d);
            ix.m(this.f10543e.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e3) {
            u9.i.f("", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final boolean u() {
        if (A() == 0) {
            return true;
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Lc)).booleanValue()) {
            return this.f10550m.f6577j.f11852k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void v(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.f10563z = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.f10553p.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.C = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f10556s.f3763a = motionEvent;
            this.B = jCurrentTimeMillis;
            this.A = this.f10563z;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f10563z;
        motionEventObtain.setLocation(point.x, point.y);
        this.f10545g.f12136b.b(motionEventObtain);
        motionEventObtain.recycle();
        w();
    }

    public final void w() {
        p9.a aVar;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.Te)).booleanValue() || (aVar = this.G) == null) {
            return;
        }
        aVar.f31256b = true;
    }

    public final boolean x(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z5, View view) {
        r50 r50Var;
        xp0 xp0Var = this.f10548k;
        Context context = this.f10540b;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f10542d);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            wk wkVar = al.f3059j4;
            q9.s sVar = q9.s.f31967e;
            yk ykVar = sVar.f31970c;
            yk ykVar2 = sVar.f31970c;
            if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z5);
            jSONObject6.put("screen", com.google.android.gms.internal.measurement.d4.K(context));
            if (((Boolean) ykVar2.a(al.Ve)).booleanValue() && (r50Var = this.H) != null) {
                AtomicLong atomicLong = r50Var.f9712a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put("placement_id", atomicLong.get());
                }
            }
            boolean zBooleanValue = ((Boolean) ykVar2.a(al.J9)).booleanValue();
            kc0 kc0Var = this.f10543e;
            if (zBooleanValue) {
                kc0Var.b("/clickRecorded", new r90(this, 1));
            } else {
                kc0Var.b("/logScionEvent", new r90(this, 0));
            }
            kc0Var.b("/nativeImpression", new so(this, view));
            kc0Var.b("/nativeImpressionFlowControl", new s90(this, this.f10555r, xp0Var.f12271x0, this.f10557t));
            ix.m(kc0Var.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f10559v) {
                return true;
            }
            this.f10559v = p9.k.C.f31308o.d(context, this.f10549l.f34365b, xp0Var.C.toString(), this.f10550m.f6575g);
            return true;
        } catch (JSONException e3) {
            u9.i.f("Unable to create impression JSON.", e3);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void y() {
        View view;
        if (this.f10542d.optBoolean("custom_one_point_five_click_enabled", false)) {
            wa0 wa0Var = this.f10552o;
            if (wa0Var.f11709d == null || wa0Var.f11712g == null) {
                return;
            }
            wa0Var.f11711f = null;
            wa0Var.f11712g = null;
            WeakReference weakReference = wa0Var.f11713h;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                wa0Var.f11713h = null;
            }
            try {
                co coVar = wa0Var.f11709d;
                coVar.L1(coVar.D0(), 2);
            } catch (RemoteException e3) {
                u9.i.k("#007 Could not call remote method.", e3);
            }
        }
    }

    public final String z(View view) {
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3059j4)).booleanValue()) {
            return null;
        }
        try {
            return this.f10545g.f12136b.i(this.f10540b, view, null);
        } catch (Exception unused) {
            u9.i.e("Exception getting data.");
            return null;
        }
    }
}
