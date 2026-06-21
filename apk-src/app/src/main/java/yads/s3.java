package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s3 extends WebViewClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f42796d = {wb.a(s3.class, "context", "getContext()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm2 f42797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lo3 f42798b = es2.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gb3 f42799c = new gb3();

    public s3(Context context) {
        this.f42797a = om2.a(context);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        nm2 nm2Var = this.f42797a;
        dk.i iVar = f42796d[0];
        Object obj = (Context) nm2Var.f41294a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            ((t1) t3Var).a(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        nm2 nm2Var = this.f42797a;
        dk.i iVar = f42796d[0];
        Object obj = (Context) nm2Var.f41294a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            ((t1) t3Var).a(0);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.f42798b.a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (android.webkit.URLUtil.isNetworkUrl(r8) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r6.f42799c.a(r7.getContext(), r8);
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L66
            int r1 = r8.length()
            if (r1 <= 0) goto L66
            int r1 = r8.length()
            if (r1 != 0) goto L10
            goto L55
        L10:
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = "http(s?)://"
            r1.<init>(r2)
            java.lang.String r2 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = "replacement"
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.util.regex.Pattern r1 = r1.f27537b
            java.util.regex.Matcher r1 = r1.matcher(r8)
            java.lang.String r1 = r1.replaceFirst(r3)
            java.lang.String r2 = "replaceFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            yads.cb3 r2 = yads.db3.f37692c
            r2.getClass()
            yads.db3 r2 = yads.db3.f37693d
            yads.db3 r3 = yads.db3.f37694e
            yads.db3 r4 = yads.db3.f37695f
            yads.db3 r5 = yads.db3.f37696g
            yads.db3[] r2 = new yads.db3[]{r2, r3, r4, r5}
            r3 = r0
        L44:
            r4 = 4
            if (r3 >= r4) goto L55
            r4 = r2[r3]
            java.lang.String r4 = r4.f37698b
            boolean r4 = kotlin.text.a0.n(r1, r4, r0)
            if (r4 == 0) goto L52
            goto L5b
        L52:
            int r3 = r3 + 1
            goto L44
        L55:
            boolean r1 = android.webkit.URLUtil.isNetworkUrl(r8)
            if (r1 != 0) goto L66
        L5b:
            yads.gb3 r0 = r6.f42799c
            android.content.Context r7 = r7.getContext()
            boolean r7 = r0.a(r7, r8)
            return r7
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.s3.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
