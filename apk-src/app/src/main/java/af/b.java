package af;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f922a;

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f922a) {
            case 0:
                if (str.toLowerCase().equals("https://demo.cloudpayments.ru/WebFormPost/GetWebViewData".toLowerCase())) {
                    webView.setVisibility(8);
                    webView.loadUrl("javascript:window.JavaScriptThreeDs.processHTML('<head>'+document.getElementsByTagName('html')[0].innerHTML+'</head>');");
                }
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f922a) {
            case 1:
                webView.loadUrl(webResourceRequest.getUrl().toString());
                return false;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
