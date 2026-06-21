package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe f12582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nl f12583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.a f12584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l6.i f12585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final si f12586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n70 f12587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ph0 f12588h;
    public final jq0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sd0 f12589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q00 f12590k;

    public yc0(Context context, xe xeVar, nl nlVar, u9.a aVar, l6.i iVar, si siVar, n70 n70Var, ph0 ph0Var, jq0 jq0Var, sd0 sd0Var, q00 q00Var) {
        this.f12581a = context;
        this.f12582b = xeVar;
        this.f12583c = nlVar;
        this.f12584d = aVar;
        this.f12585e = iVar;
        this.f12586f = siVar;
        this.f12587g = n70Var;
        this.f12588h = ph0Var;
        this.i = jq0Var;
        this.f12589j = sd0Var;
        this.f12590k = q00Var;
    }

    public final sz a(q9.g3 g3Var, xp0 xp0Var, zp0 zp0Var) {
        sz szVarE = fp.e(this.f12581a, j0.a(g3Var), g3Var.f31875b, false, false, this.f12582b, this.f12583c, this.f12584d, new kx0(18, this), this.f12585e, this.f12586f, xp0Var, zp0Var, this.f12588h, this.i, this.f12589j);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.nf)).booleanValue()) {
            WebView webViewU = szVarE.u();
            if (this.f12590k.f9252a != null) {
                try {
                    WeakHashMap weakHashMap = z6.b.f46197a;
                    if (!a7.p.f500g.b()) {
                        throw a7.p.a();
                    }
                    z6.b.b(webViewU).f505a.setProfile("GMA_WEBVIEW_PROFILE");
                    t9.c0.m("WebViewCompat Profile is defined");
                    return szVarE;
                } catch (IllegalStateException e3) {
                    u9.i.h("WebViewCompat error: ".concat(e3.toString()));
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.mf)).booleanValue()) {
                        p9.k.C.f31302h.d("WebViewCompat.setProfile", e3);
                    }
                }
            }
        }
        return szVarE;
    }
}
