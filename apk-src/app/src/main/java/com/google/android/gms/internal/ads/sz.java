package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface sz extends q9.a, v80, dq, iq, fh, p9.g {
    boolean A0();

    ed.d B0();

    ArrayList C();

    void C0(xp0 xp0Var, zp0 zp0Var);

    void F0(boolean z5);

    int G();

    s9.d G0();

    void H0(zb0 zb0Var);

    zp0 I0();

    void J0();

    void K0(String str, String str2);

    void L0(Context context);

    xp0 M();

    s9.d M0();

    vh0 N0();

    boolean O0();

    void P0(int i, boolean z5, boolean z10);

    void Q0(vh0 vh0Var);

    void R(int i);

    void R0(int i);

    String S();

    void S0(boolean z5);

    void U();

    void U0(long j10, boolean z5);

    void V0(String str, xy xyVar);

    void W0(j0 j0Var);

    void X0(boolean z5, int i, String str, boolean z10, boolean z11);

    void Y0();

    xe Z0();

    void a1(String str, ox0 ox0Var);

    void b1(uh uhVar);

    void c1(int i);

    boolean canGoBack();

    Activity d();

    boolean d1();

    void destroy();

    void e();

    jq0 e1();

    cl f();

    z7 f1();

    wh0 g0();

    void g1(s9.d dVar);

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void h1(boolean z5);

    View i0();

    void i1(s9.e eVar, boolean z5, boolean z10, String str);

    boolean isAttachedToWindow();

    xy j0(String str);

    void j1(s9.d dVar);

    void k0(i00 i00Var);

    boolean k1();

    void l0(boolean z5, int i, String str, String str2, boolean z10);

    vm l1();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    i00 m();

    j0 m0();

    void m1();

    l6.i n();

    void n0(int i);

    void n1();

    ut o();

    Context o0();

    void o1(boolean z5);

    void onPause();

    void onResume();

    String p();

    String q();

    k00 q0();

    void q1(boolean z5);

    boolean r1();

    int s();

    void s0(String str, String str2);

    void s1(String str, vo voVar);

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    int t();

    void t0();

    void t1(boolean z5);

    WebView u();

    void u0(String str, vo voVar);

    boolean u1();

    u9.a v();

    void v0(vm vmVar);

    uh w0();

    void x0(wh0 wh0Var);

    void z0();
}
