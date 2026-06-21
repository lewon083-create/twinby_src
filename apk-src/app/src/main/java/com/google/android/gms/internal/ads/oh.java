package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f8686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kh f8687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f8688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8689d;

    public /* synthetic */ oh(d1 d1Var, kh khVar, WebView webView, boolean z5) {
        this.f8686a = d1Var;
        this.f8687b = khVar;
        this.f8688c = webView;
        this.f8689d = z5;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        ph phVar = (ph) this.f8686a.f4418e;
        kh khVar = this.f8687b;
        WebView webView = this.f8688c;
        String str = (String) obj;
        boolean z5 = this.f8689d;
        phVar.getClass();
        synchronized (khVar.f7221g) {
            khVar.f7226m--;
        }
        try {
            boolean z10 = true;
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (phVar.f9061o || TextUtils.isEmpty(webView.getTitle())) {
                    khVar.a(strOptString, z5, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb2.append(title);
                    sb2.append("\n");
                    sb2.append(strOptString);
                    khVar.a(sb2.toString(), z5, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (khVar.f7221g) {
                if (khVar.f7226m != 0) {
                    z10 = false;
                }
            }
            if (z10) {
                phVar.f9052e.m(khVar);
            }
        } catch (JSONException unused) {
            u9.i.c("Json string may be malformed.");
        } catch (Throwable th2) {
            u9.i.d("Failed to get webview content.", th2);
            p9.k.C.f31302h.d("ContentFetchTask.processWebViewContent", th2);
        }
    }
}
