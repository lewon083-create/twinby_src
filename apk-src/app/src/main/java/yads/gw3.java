package yads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gw3 extends ka {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WebView f38928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f38929h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f38930j;

    public gw3(String str, String str2, Map map) {
        super(str);
        this.f38929h = null;
        this.i = map;
        this.f38930j = str2;
    }

    @Override // yads.ka
    public final void b() {
        this.f40127b.clear();
        new Handler().postDelayed(new cw3(this), Math.max(AnrProfilingIntegration.THRESHOLD_ANR_MS - (this.f38929h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f38929h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f38928g = null;
    }

    @Override // yads.ka
    public final void c() {
        WebView webView = new WebView(ix3.f39667b.f39668a);
        this.f38928g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f38928g.getSettings().setAllowContentAccess(false);
        this.f38928g.getSettings().setAllowFileAccess(false);
        this.f38928g.setWebViewClient(new bw3(this));
        this.f40127b = new kw3(this.f38928g);
        lx3.a(this.f38928g, this.f38930j);
        for (String str : this.i.keySet()) {
            String externalForm = ((pd3) this.i.get(str)).f41901b.toExternalForm();
            WebView webView2 = this.f38928g;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                lx3.a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.f38929h = Long.valueOf(System.nanoTime());
    }

    @Override // yads.ka
    public final void a(zv3 zv3Var, ia iaVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(iaVar.f39472d);
        for (String str : mapUnmodifiableMap.keySet()) {
            pd3 pd3Var = (pd3) mapUnmodifiableMap.get(str);
            pd3Var.getClass();
            JSONObject jSONObject2 = new JSONObject();
            ow3.a(jSONObject2, "vendorKey", pd3Var.f41900a);
            ow3.a(jSONObject2, "resourceUrl", pd3Var.f41901b.toString());
            ow3.a(jSONObject2, "verificationParameters", pd3Var.f41902c);
            ow3.a(jSONObject, str, jSONObject2);
        }
        a(zv3Var, iaVar, jSONObject);
    }
}
