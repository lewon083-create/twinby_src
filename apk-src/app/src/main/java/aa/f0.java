package aa;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.gm;
import com.google.android.gms.internal.ads.r81;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r81 f583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebViewClient f584d;

    public f0(WebView webView, c0 c0Var, r81 r81Var) {
        this.f581a = webView;
        this.f582b = c0Var;
        this.f583c = r81Var;
    }

    public static boolean y() {
        if (((Boolean) gm.f5854a.r()).booleanValue()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces != null && allStackTraces.containsKey(Thread.currentThread())) {
                boolean z5 = false;
                boolean z10 = false;
                for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
                    if (stackTraceElement.getClassName().contains(f0.class.getName())) {
                        if (!z5 || !z10) {
                            z5 = true;
                        }
                    } else if (z5) {
                        z10 = true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void a(WebView webView, String str, boolean z5) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.doUpdateVisitedHistory(webView, str, z5);
    }

    public final void b(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onFormResubmission(webView, message, message2);
    }

    public final void c(WebView webView, String str) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onLoadResource(webView, str);
    }

    public final void d(WebView webView, String str) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z5) {
        if (y()) {
            return;
        }
        a(webView, str, z5);
    }

    public final void e(WebView webView, String str) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onPageFinished(webView, str);
    }

    public final void f(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onPageStarted(webView, str, bitmap);
    }

    public final void g(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public final void h(WebView webView, int i, String str, String str2) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedError(webView, i, str, str2);
    }

    public final void i(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final void j(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public final void k(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public final void l(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public final void m(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final boolean n(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return false;
        }
        return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public final void o(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (y()) {
            return;
        }
        b(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (y()) {
            return;
        }
        c(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (y()) {
            return;
        }
        d(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (y()) {
            return;
        }
        x();
        e(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (y()) {
            return;
        }
        x();
        f(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (y()) {
            return;
        }
        g(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (y()) {
            return;
        }
        h(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (y()) {
            return;
        }
        j(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (y()) {
            return;
        }
        k(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (y()) {
            return;
        }
        l(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (y()) {
            return;
        }
        m(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (y()) {
            return false;
        }
        return n(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (y()) {
            return;
        }
        o(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        if (y()) {
            return;
        }
        p(webView, f10, f11);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (y()) {
            return;
        }
        q(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (y()) {
            return;
        }
        r(webView, keyEvent);
    }

    public final void p(WebView webView, float f10, float f11) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onScaleChanged(webView, f10, f11);
    }

    public final void q(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onTooManyRedirects(webView, message, message2);
    }

    public final void r(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onUnhandledKeyEvent(webView, keyEvent);
    }

    public final WebResourceResponse s(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return null;
        }
        return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (y()) {
            return null;
        }
        return s(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (y()) {
            return false;
        }
        return u(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (y()) {
            return false;
        }
        return v(webView, webResourceRequest);
    }

    public final WebResourceResponse t(WebView webView, String str) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return null;
        }
        return webViewClient.shouldInterceptRequest(webView, str);
    }

    public final boolean u(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return false;
        }
        return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public final boolean v(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return false;
        }
        return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final boolean w(WebView webView, String str) {
        WebViewClient webViewClient = this.f584d;
        if (webViewClient == null) {
            return false;
        }
        return webViewClient.shouldOverrideUrlLoading(webView, str);
    }

    public final void x() {
        this.f581a.evaluateJavascript(String.format(Locale.getDefault(), (String) q9.s.f31967e.f31970c.a(al.Za), this.f582b.b()), null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (y()) {
            return;
        }
        i(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (y()) {
            return null;
        }
        return t(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (y()) {
            return false;
        }
        return w(webView, str);
    }
}
