package aa;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.gm;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.jq0;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.xe;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe f539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jq0 f540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wd0 f542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gx f544h = hx.f6284f;
    public final bt0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i0 f545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c0 f546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0 f547l;

    public a(WebView webView, xe xeVar, wd0 wd0Var, bt0 bt0Var, jq0 jq0Var, i0 i0Var, c0 c0Var, f0 f0Var) {
        this.f538b = webView;
        Context context = webView.getContext();
        this.f537a = context;
        this.f539c = xeVar;
        this.f542f = wd0Var;
        al.a(context);
        wk wkVar = al.Pa;
        q9.s sVar = q9.s.f31967e;
        this.f541e = ((Integer) sVar.f31970c.a(wkVar)).intValue();
        this.f543g = ((Boolean) sVar.f31970c.a(al.Qa)).booleanValue();
        this.i = bt0Var;
        this.f540d = jq0Var;
        this.f545j = i0Var;
        this.f546k = c0Var;
        this.f547l = f0Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            p9.k kVar = p9.k.C;
            kVar.f31304k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strH = this.f539c.f12136b.h(this.f537a, str, this.f538b);
            if (!this.f543g) {
                return strH;
            }
            kVar.f31304k.getClass();
            hl.l.z(this.f542f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strH;
        } catch (RuntimeException e3) {
            u9.i.f("Exception getting click signals. ", e3);
            p9.k.C.f31302h.d("TaggingLibraryJsInterface.getClickSignals", e3);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 51);
            sb2.append("Invalid timeout for getting click signals. Timeout=");
            sb2.append(i);
            u9.i.e(sb2.toString());
            return "";
        }
        try {
            return (String) hx.f6279a.b(new x(0, this, str)).get(Math.min(i, this.f541e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            u9.i.f("Exception getting click signals with timeout. ", e3);
            p9.k.C.f31302h.d("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e3);
            return e3 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        t9.g0 g0Var = p9.k.C.f31297c;
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        v vVar = new v(this, string);
        if (((Boolean) gm.f5858e.r()).booleanValue()) {
            this.f545j.a(this.f538b, vVar);
            return string;
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Sa)).booleanValue()) {
            this.f544h.execute(new y(this, bundle, vVar, 0));
            return string;
        }
        v7.f.n(this.f537a, new k9.g((k9.f) new k9.f(2).r(bundle, AdMobAdapter.class)), vVar);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            p9.k kVar = p9.k.C;
            kVar.f31304k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strI = this.f539c.f12136b.i(this.f537a, this.f538b, null);
            if (!this.f543g) {
                return strI;
            }
            kVar.f31304k.getClass();
            hl.l.z(this.f542f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strI;
        } catch (RuntimeException e3) {
            u9.i.f("Exception getting view signals. ", e3);
            p9.k.C.f31302h.d("TaggingLibraryJsInterface.getViewSignals", e3);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 50);
            sb2.append("Invalid timeout for getting view signals. Timeout=");
            sb2.append(i);
            u9.i.e(sb2.toString());
            return "";
        }
        try {
            return (String) hx.f6279a.b(new w(0, this)).get(Math.min(i, this.f541e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            u9.i.f("Exception getting view signals with timeout. ", e3);
            p9.k.C.f31302h.d("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e3);
            return e3 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.Ua)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        hx.f6279a.execute(new ed.c(3, this, str));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        int i10;
        int i11;
        float f10;
        int i12;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i10 = jSONObject.getInt("y");
            i11 = jSONObject.getInt("duration_ms");
            f10 = (float) jSONObject.getDouble("force");
            int i13 = jSONObject.getInt("type");
            if (i13 != 0) {
                i12 = 1;
                if (i13 != 1) {
                    i12 = 2;
                    if (i13 != 2) {
                        i12 = 3;
                        if (i13 != 3) {
                            i12 = -1;
                        }
                    }
                }
            } else {
                i12 = 0;
            }
        } catch (RuntimeException | JSONException e3) {
            e = e3;
        }
        try {
            this.f539c.f12136b.b(MotionEvent.obtain(0L, i11, i12, i, i10, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e7) {
            e = e7;
            u9.i.f("Failed to parse the touch string. ", e);
            p9.k.C.f31302h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
        } catch (JSONException e10) {
            e = e10;
            u9.i.f("Failed to parse the touch string. ", e);
            p9.k.C.f31302h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
        }
    }
}
