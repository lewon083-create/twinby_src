package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 extends ou0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f10067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f10068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f10069g;

    public ru0(String str, Map map) {
        super(str);
        this.f10068f = null;
        this.f10069g = map;
    }

    @Override // com.google.android.gms.internal.ads.ou0
    public final void a() {
        WebView webView = new WebView(ku0.f7311d.f7313c);
        this.f10067e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f10067e.getSettings().setAllowContentAccess(false);
        this.f10067e.getSettings().setAllowFileAccess(false);
        this.f10067e.setWebViewClient(new bj.h(1, this));
        this.f8803b = new zu0(this.f10067e);
        c6.B(this.f10067e, null);
        Map map = this.f10069g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f10068f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.ou0
    public final void b() {
        super.b();
        new Handler().postDelayed(new kr0(this), Math.max(AnrProfilingIntegration.THRESHOLD_ANR_MS - (this.f10068f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f10068f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f10067e = null;
    }

    @Override // com.google.android.gms.internal.ads.ou0
    public final void d(ut0 ut0Var, k7 k7Var) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) k7Var.f7133e);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        e(ut0Var, k7Var, jSONObject);
    }
}
