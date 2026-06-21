package yads;

import android.webkit.WebView;
import io.sentry.Session;
import io.sentry.protocol.App;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kw3 f40127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e4 f40128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kl1 f40129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40131f;

    public ka(String str) {
        a();
        this.f40126a = str;
        this.f40127b = new kw3(null);
    }

    public final void a(WebView webView) {
        this.f40127b = new kw3(webView);
    }

    public void b() {
        this.f40127b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, JSONObject jSONObject) {
        lx3.f40715a.a((WebView) this.f40127b.get(), "publishMediaEvent", str, jSONObject, this.f40126a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ha haVar) {
        lx3 lx3Var = lx3.f40715a;
        WebView webView = (WebView) this.f40127b.get();
        String str = this.f40126a;
        JSONObject jSONObject = new JSONObject();
        ow3.a(jSONObject, "impressionOwner", haVar.f39111a);
        ow3.a(jSONObject, "mediaEventsOwner", haVar.f39112b);
        ow3.a(jSONObject, "creativeType", haVar.f39114d);
        ow3.a(jSONObject, "impressionType", haVar.f39115e);
        ow3.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(haVar.f39113c));
        lx3Var.a(webView, Session.JsonKeys.INIT, jSONObject, str);
    }

    public void a(zv3 zv3Var, ia iaVar) {
        a(zv3Var, iaVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(zv3 zv3Var, ia iaVar, JSONObject jSONObject) {
        String str = zv3Var.f45559h;
        JSONObject jSONObject2 = new JSONObject();
        ow3.a(jSONObject2, "environment", App.TYPE);
        ow3.a(jSONObject2, "adSessionType", iaVar.f39476h);
        ow3.a(jSONObject2, "deviceInfo", hw3.a());
        ow3.a(jSONObject2, "deviceCategory", gg0.a(vv3.a()));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        ow3.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        ow3.a(jSONObject3, "partnerName", iaVar.f39469a.f43258a);
        ow3.a(jSONObject3, "partnerVersion", iaVar.f39469a.f43259b);
        ow3.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        ow3.a(jSONObject4, "libraryVersion", "1.5.6-Yandex");
        ow3.a(jSONObject4, "appId", ix3.f39667b.f39668a.getApplicationContext().getPackageName());
        ow3.a(jSONObject2, App.TYPE, jSONObject4);
        String str2 = iaVar.f39475g;
        if (str2 != null) {
            ow3.a(jSONObject2, "contentUrl", str2);
        }
        String str3 = iaVar.f39474f;
        if (str3 != null) {
            ow3.a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (pd3 pd3Var : Collections.unmodifiableList(iaVar.f39471c)) {
            ow3.a(jSONObject5, pd3Var.f41900a, pd3Var.f41902c);
        }
        lx3.f40715a.a((WebView) this.f40127b.get(), "startSession", str, jSONObject2, jSONObject5, jSONObject);
    }

    public void c() {
    }

    public final void a() {
        this.f40131f = System.nanoTime();
        this.f40130e = 1;
    }
}
