package yads;

import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class m11 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n11 f40738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3 f40739b;

    public /* synthetic */ m11(n11 n11Var) {
        this(n11Var, es2.b());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f40738a.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f40738a.a(i);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (((lo3) this.f40739b).a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        } else {
            this.f40738a.a(-11);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f40738a.a(webView.getContext(), str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f40738a.a(webResourceError.getErrorCode());
    }

    public m11(n11 n11Var, jo3 jo3Var) {
        this.f40738a = n11Var;
        this.f40739b = jo3Var;
    }
}
