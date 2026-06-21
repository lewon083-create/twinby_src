package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl f12737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f12738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zu0 f12739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f12740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ju0 f12741e;

    /* JADX WARN: Multi-variable type inference failed */
    public yt0(dl dlVar, WebView webView) {
        HashMap map = new HashMap();
        this.f12740d = map;
        this.f12741e = new ju0();
        if (!nz.A.f12499c) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.f12737a = dlVar;
        this.f12738b = webView;
        zu0 zu0Var = this.f12739c;
        if ((zu0Var == null ? null : (View) zu0Var.get()) != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((ut0) it.next()).b(webView);
            }
            this.f12739c = new zu0(webView);
        }
        if (!com.google.android.gms.internal.measurement.d4.m("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        WebView webView2 = this.f12738b;
        WeakHashMap weakHashMap = z6.b.f46197a;
        a7.b bVar = a7.p.f497d;
        if (!bVar.b()) {
            throw a7.p.a();
        }
        z6.b.b(webView2).f505a.removeWebMessageListener("omidJsSessionService");
        xo0 xo0Var = new xo0(3, this);
        WebView webView3 = this.f12738b;
        HashSet hashSet = new HashSet(Arrays.asList("*"));
        if (!bVar.b()) {
            throw a7.p.a();
        }
        z6.b.b(webView3).f505a.addWebMessageListener("omidJsSessionService", (String[]) hashSet.toArray(new String[0]), new rl.a(new a7.l(0, xo0Var)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        zt0 zt0Var = zt0.JAVASCRIPT;
        ut0 ut0Var = new ut0(yv0.b(vt0.DEFINED_BY_JAVASCRIPT, xt0.DEFINED_BY_JAVASCRIPT, zt0Var, zt0Var, false), new k7(this.f12737a, this.f12738b, null, null, tt0.HTML), str);
        this.f12740d.put(str, ut0Var);
        zu0 zu0Var = this.f12739c;
        ut0Var.b(zu0Var == null ? null : (View) zu0Var.get());
        for (iu0 iu0Var : this.f12741e.f6942a) {
            View view = (View) iu0Var.f6613a.get();
            wt0 wt0Var = iu0Var.f6615c;
            if (!ut0Var.f11068f) {
                ut0Var.f11064b.a(view, wt0Var);
            }
        }
        ut0Var.a();
    }
}
