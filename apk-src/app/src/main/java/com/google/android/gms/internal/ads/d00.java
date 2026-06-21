package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.twinby.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d00 extends FrameLayout implements sz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g00 f4408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z7 f4409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4410d;

    public d00(g00 g00Var, sd0 sd0Var) {
        super(g00Var.getContext());
        this.f4410d = new AtomicBoolean();
        this.f4408b = g00Var;
        this.f4409c = new z7(g00Var.f5562b.f9649c, this, this, sd0Var);
        addView(g00Var);
    }

    @Override // p9.g
    public final void A() {
        this.f4408b.A();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final boolean A0() {
        return this.f4408b.A0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final ed.d B0() {
        return this.f4408b.B0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final ArrayList C() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f4408b) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void C0(xp0 xp0Var, zp0 zp0Var) {
        g00 g00Var = this.f4408b;
        g00Var.f5572k = xp0Var;
        g00Var.f5573l = zp0Var;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void F0(boolean z5) {
        this.f4408b.F0(z5);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final int G() {
        return ((Boolean) q9.s.f31967e.f31970c.a(al.B4)).booleanValue() ? this.f4408b.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final s9.d G0() {
        return this.f4408b.G0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void H0(zb0 zb0Var) {
        this.f4408b.H0(zb0Var);
    }

    @Override // com.google.android.gms.internal.ads.fh
    public final void I(eh ehVar) {
        this.f4408b.I(ehVar);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final zp0 I0() {
        return this.f4408b.f5573l;
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void J() {
        g00 g00Var = this.f4408b;
        if (g00Var != null) {
            g00Var.J();
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void J0() {
        wh0 wh0VarG0;
        vh0 vh0VarN0;
        g00 g00Var = this.f4408b;
        TextView textView = new TextView(getContext());
        p9.k kVar = p9.k.C;
        t9.g0 g0Var = kVar.f31297c;
        Resources resourcesC = kVar.f31302h.c();
        textView.setText(resourcesC != null ? resourcesC.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        wk wkVar = al.f2969d6;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && (vh0VarN0 = g00Var.N0()) != null) {
            synchronized (vh0VarN0) {
                yt0 yt0Var = vh0VarN0.f11386f;
                if (yt0Var != null) {
                    kVar.f31317x.getClass();
                    l80.s(new th0(0, yt0Var, textView));
                    return;
                }
                return;
            }
        }
        if (((Boolean) sVar.f31970c.a(al.f2955c6)).booleanValue() && (wh0VarG0 = g00Var.g0()) != null && ((tt0) wh0VarG0.f11812b.f7136h) == tt0.HTML) {
            l80 l80Var = kVar.f31317x;
            ut0 ut0Var = wh0VarG0.f11811a;
            l80Var.getClass();
            l80.s(new sh0(ut0Var, textView, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void K0(String str, String str2) throws Throwable {
        this.f4408b.K0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void L() {
        g00 g00Var = this.f4408b;
        if (g00Var != null) {
            g00Var.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void L0(Context context) {
        this.f4408b.L0(context);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final xp0 M() {
        return this.f4408b.f5572k;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final s9.d M0() {
        return this.f4408b.M0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final vh0 N0() {
        return this.f4408b.N0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final boolean O0() {
        return this.f4408b.O0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void P0(int i, boolean z5, boolean z10) {
        this.f4408b.P0(i, z5, z10);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void Q0(vh0 vh0Var) {
        this.f4408b.Q0(vh0Var);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void R(int i) {
        vx vxVar = (vx) this.f4409c.f12905g;
        if (vxVar != null) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3010g0)).booleanValue()) {
                vxVar.f11506c.setBackgroundColor(i);
                vxVar.f11507d.setBackgroundColor(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void R0(int i) {
        this.f4408b.R0(i);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final String S() {
        return this.f4408b.S();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void S0(boolean z5) {
        this.f4408b.S0(z5);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void U() {
        this.f4408b.U();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void U0(long j10, boolean z5) {
        this.f4408b.U0(j10, z5);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void V0(String str, xy xyVar) {
        this.f4408b.V0(str, xyVar);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void W0(j0 j0Var) {
        this.f4408b.W0(j0Var);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void X0(boolean z5, int i, String str, boolean z10, boolean z11) {
        this.f4408b.X0(z5, i, str, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void Y0() {
        setBackgroundColor(0);
        this.f4408b.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final xe Z0() {
        return this.f4408b.f5564c;
    }

    @Override // com.google.android.gms.internal.ads.iq
    public final void a(String str, JSONObject jSONObject) {
        this.f4408b.g(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void a1(String str, ox0 ox0Var) {
        this.f4408b.a1(str, ox0Var);
    }

    @Override // com.google.android.gms.internal.ads.iq
    public final void b(String str) {
        this.f4408b.r(str);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void b1(uh uhVar) {
        this.f4408b.b1(uhVar);
    }

    @Override // com.google.android.gms.internal.ads.dq
    public final void c(String str, Map map) {
        this.f4408b.c(str, map);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void c1(int i) {
        this.f4408b.c1(i);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final boolean canGoBack() {
        return this.f4408b.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final Activity d() {
        return this.f4408b.f5562b.f9647a;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final boolean d1() {
        return this.f4410d.get();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void destroy() {
        vh0 vh0VarN0;
        g00 g00Var = this.f4408b;
        wh0 wh0VarG0 = g00Var.g0();
        if (wh0VarG0 != null) {
            t9.d0 d0Var = t9.g0.f33596l;
            d0Var.post(new s(25, wh0VarG0));
            d0Var.postDelayed(new c00(g00Var, 1), ((Integer) q9.s.f31967e.f31970c.a(al.f2938b6)).intValue());
        } else if (!((Boolean) q9.s.f31967e.f31970c.a(al.f2969d6)).booleanValue() || (vh0VarN0 = g00Var.N0()) == null) {
            g00Var.destroy();
        } else {
            t9.g0.f33596l.post(new l81(14, this, vh0VarN0));
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void e() {
        this.f4408b.e();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final jq0 e1() {
        return this.f4408b.f5566d;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final cl f() {
        return this.f4408b.K;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final z7 f1() {
        return this.f4409c;
    }

    @Override // com.google.android.gms.internal.ads.iq
    public final void g(String str, String str2) {
        this.f4408b.g("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final wh0 g0() {
        return this.f4408b.g0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void g1(s9.d dVar) {
        this.f4408b.g1(dVar);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void goBack() {
        this.f4408b.goBack();
    }

    @Override // com.google.android.gms.internal.ads.dq
    public final void h(String str, JSONObject jSONObject) {
        this.f4408b.h(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void h1(boolean z5) {
        this.f4408b.f5576o.F = z5;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void i1(s9.e eVar, boolean z5, boolean z10, String str) {
        this.f4408b.i1(eVar, z5, z10, str);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final xy j0(String str) {
        return this.f4408b.j0(str);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void j1(s9.d dVar) {
        this.f4408b.j1(dVar);
    }

    public final void k() {
        z7 z7Var = this.f4409c;
        z7Var.getClass();
        pa.c0.e("onDestroy must be called from the UI thread.");
        vx vxVar = (vx) z7Var.f12905g;
        if (vxVar != null) {
            vxVar.f11509f.a();
            sx sxVar = vxVar.f11511h;
            if (sxVar != null) {
                sxVar.g();
            }
            vxVar.d();
            ((d00) z7Var.f12903e).removeView((vx) z7Var.f12905g);
            z7Var.f12905g = null;
        }
        this.f4408b.k();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void k0(i00 i00Var) {
        this.f4408b.k0(i00Var);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final boolean k1() {
        return this.f4408b.k1();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void l0(boolean z5, int i, String str, String str2, boolean z10) {
        this.f4408b.l0(z5, i, str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final vm l1() {
        return this.f4408b.l1();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void loadData(String str, String str2, String str3) {
        this.f4408b.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        this.f4408b.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void loadUrl(String str) {
        this.f4408b.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final i00 m() {
        return this.f4408b.m();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final j0 m0() {
        return this.f4408b.m0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void m1() {
        this.f4408b.f5565c0 = true;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final l6.i n() {
        return this.f4408b.f5570h;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void n0(int i) {
        this.f4408b.n0(i);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void n1() {
        this.f4408b.n1();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final ut o() {
        return this.f4408b.M;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final Context o0() {
        return this.f4408b.f5562b.f9649c;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void o1(boolean z5) {
        this.f4408b.o1(z5);
    }

    @Override // q9.a
    public final void onAdClicked() {
        g00 g00Var = this.f4408b;
        if (g00Var != null) {
            g00Var.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void onPause() {
        sx sxVar;
        z7 z7Var = this.f4409c;
        z7Var.getClass();
        pa.c0.e("onPause must be called from the UI thread.");
        vx vxVar = (vx) z7Var.f12905g;
        if (vxVar != null && (sxVar = vxVar.f11511h) != null) {
            sxVar.i();
        }
        this.f4408b.onPause();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void onResume() {
        this.f4408b.onResume();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final String p() {
        return this.f4408b.p();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final String q() {
        return this.f4408b.q();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final k00 q0() {
        return this.f4408b.f5576o;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void q1(boolean z5) {
        this.f4408b.q1(z5);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final boolean r1() {
        return this.f4408b.r1();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final int s() {
        return this.f4408b.s();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void s0(String str, String str2) {
        this.f4408b.s0(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void s1(String str, vo voVar) {
        this.f4408b.s1(str, voVar);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.sz
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4408b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.sz
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f4408b.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f4408b.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f4408b.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final int t() {
        return ((Boolean) q9.s.f31967e.f31970c.a(al.B4)).booleanValue() ? this.f4408b.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void t0() {
        this.f4408b.t0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void t1(boolean z5) {
        this.f4408b.t1(z5);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final WebView u() {
        return this.f4408b;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void u0(String str, vo voVar) {
        this.f4408b.u0(str, voVar);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final boolean u1() {
        return this.f4408b.u1();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final u9.a v() {
        return this.f4408b.f5568f;
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void v0(vm vmVar) {
        this.f4408b.v0(vmVar);
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final uh w0() {
        return this.f4408b.w0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void x0(wh0 wh0Var) {
        this.f4408b.x0(wh0Var);
    }

    @Override // p9.g
    public final void y() {
        this.f4408b.y();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final void z0() {
        this.f4408b.z0();
    }

    @Override // com.google.android.gms.internal.ads.sz
    public final View i0() {
        return this;
    }
}
