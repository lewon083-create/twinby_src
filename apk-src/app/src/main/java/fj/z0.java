package fj;

import a0.i1;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.om1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends WebViewClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19465c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f19466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19467b = false;

    public z0(m mVar) {
        this.f19466a = mVar;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z5) {
        this.f19466a.f19374a.q(new x0(0, this, webView, str, z5));
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f19466a.f19374a.q(new i1(this, webView, message, message2, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f19466a.f19374a.q(new v0(this, webView, str, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f19466a.f19374a.q(new v0(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f19466a.f19374a.q(new v0(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f19466a.f19374a.q(new v0(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f19466a.f19374a.q(new a1.c(this, webView, clientCertRequest, 12));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f19466a.f19374a.q(new i1(this, webView, webResourceRequest, webResourceError, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f19466a.f19374a.q(new w0(this, webView, httpAuthHandler, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f19466a.f19374a.q(new i1(this, webView, webResourceRequest, webResourceResponse, 5));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f19466a.f19374a.q(new w0(this, webView, str, str2, str3, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f19466a.f19374a.q(new i1(this, webView, sslErrorHandler, sslError, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(final WebView webView, final float f10, final float f11) {
        this.f19466a.f19374a.q(new Runnable() { // from class: fj.y0
            @Override // java.lang.Runnable
            public final void run() {
                z0 pigeon_instanceArg = this.f19459b;
                m mVar = pigeon_instanceArg.f19466a;
                double d10 = f10;
                double d11 = f11;
                ch.a callback = new ch.a(6);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                WebView viewArg = webView;
                Intrinsics.checkNotNullParameter(viewArg, "viewArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                a1.m mVar2 = mVar.f19374a;
                mVar2.getClass();
                if (((c) mVar2.f363c).d(pigeon_instanceArg)) {
                    new s7.g((ii.f) mVar2.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", mVar2.m(), (Object) null).K(kotlin.collections.s.f(pigeon_instanceArg, viewArg, Double.valueOf(d10), Double.valueOf(d11)), new k0(4, callback));
                    return;
                }
                ij.k kVar = ij.m.f21341c;
                om1.r("missing-instance-error", "Callback to `WebViewClient.onScaleChanged` failed because native instance was not in the instance manager.", "");
                int i = z0.f19465c;
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f19466a.f19374a.q(new a1.c(this, webView, webResourceRequest, 13));
        return webResourceRequest.isForMainFrame() && this.f19467b;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
