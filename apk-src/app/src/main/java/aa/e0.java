package aa;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f578c;

    public /* synthetic */ e0(f0 f0Var, int i) {
        this.f577b = i;
        this.f578c = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient webViewClientD;
        switch (this.f577b) {
            case 0:
                f0 f0Var = this.f578c;
                WebView webView = f0Var.f581a;
                try {
                    t9.g0 g0Var = p9.k.C.f31297c;
                    if (Build.VERSION.SDK_INT < 26) {
                        if (d4.m("GET_WEB_VIEW_CLIENT")) {
                            try {
                                webViewClientD = z6.b.d(webView);
                            } catch (RuntimeException e3) {
                                p9.k.C.f31302h.d("AdUtil.getWebViewClient", e3);
                            }
                            break;
                        }
                        throw new IllegalStateException("getWebViewClient not supported");
                    }
                    webViewClientD = webView.getWebViewClient();
                    if (webViewClientD == f0Var) {
                        return;
                    }
                    if (webViewClientD != null) {
                        f0Var.f584d = webViewClientD;
                    }
                    webView.setWebViewClient(f0Var);
                    f0Var.x();
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            default:
                f0 f0Var2 = this.f578c;
                f0Var2.f583c.execute(new e0(f0Var2, 0));
                return;
        }
    }
}
