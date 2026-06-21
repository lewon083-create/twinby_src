package bj;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.ru0;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.zu0;
import com.google.android.gms.internal.ads.zz;
import com.google.android.gms.internal.consent_sdk.k;
import com.google.android.gms.internal.consent_sdk.n1;
import com.google.android.gms.internal.consent_sdk.r;
import io.flutter.plugins.urllauncher.WebViewActivity;
import io.sentry.protocol.SentryThread;
import java.util.Locale;
import java.util.Objects;
import p9.j;
import q9.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2173b;

    public /* synthetic */ h(int i, Object obj) {
        this.f2172a = i;
        this.f2173b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f2172a) {
            case 2:
                r rVar = (r) this.f2173b;
                int i = r.f13533e;
                if (str != null && str.startsWith("consent://")) {
                    rVar.f13535c.i(str);
                    break;
                }
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f2172a) {
            case 2:
                r rVar = (r) this.f2173b;
                if (!rVar.f13536d) {
                    Log.d("UserMessagingPlatform", "Wall html loaded.");
                    rVar.f13536d = true;
                }
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.f2172a) {
            case 2:
                zz zzVar = ((r) this.f2173b).f13535c;
                zzVar.getClass();
                Locale locale = Locale.US;
                StringBuilder sbI = pe.a.i(i, "WebResourceError(", ", ", str2, "): ");
                sbI.append(str);
                ((k) zzVar.f13157h).c(new n1(2, sbI.toString()));
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f2172a) {
            case 1:
                String string = renderProcessGoneDetail.toString();
                String strValueOf = String.valueOf(webView);
                Log.w("NativeBridge", om1.n(new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length()), "WebView renderer gone: ", string, "for WebView: ", strValueOf));
                ru0 ru0Var = (ru0) this.f2173b;
                if (ru0Var.c() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    ru0Var.f8803b = new zu0(null);
                }
                webView.destroy();
                return true;
            case 2:
                if (webView != null) {
                    String str = true != renderProcessGoneDetail.didCrash() ? "was stopped by system" : SentryThread.JsonKeys.CRASHED;
                    Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + renderProcessGoneDetail.rendererPriorityAtExit());
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        int i = this.f2172a;
        Object obj = this.f2173b;
        switch (i) {
            case 0:
                ((WebViewActivity) ((i) obj).f2175b).f25782d.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            case 2:
                String string = webResourceRequest.getUrl().toString();
                r rVar = (r) obj;
                int i10 = r.f13533e;
                if (string == null || !string.startsWith("consent://")) {
                    return false;
                }
                rVar.f13535c.i(string);
                return true;
        }
    }

    public /* synthetic */ h(r rVar) {
        this.f2172a = 2;
        Objects.requireNonNull(rVar);
        this.f2173b = rVar;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i = this.f2172a;
        Object obj = this.f2173b;
        int iB = 0;
        switch (i) {
            case 2:
                r rVar = (r) obj;
                int i10 = r.f13533e;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                rVar.f13535c.i(str);
                return true;
            case 3:
                j jVar = (j) obj;
                String strM4 = jVar.m4();
                Context context = jVar.f31290d;
                if (str.startsWith(strM4)) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    y yVar = jVar.f31293g;
                    if (yVar != null) {
                        try {
                            yVar.d0(vv.C(3, null, null));
                        } catch (RemoteException e3) {
                            u9.i.k("#007 Could not call remote method.", e3);
                        }
                        break;
                    }
                    y yVar2 = jVar.f31293g;
                    if (yVar2 != null) {
                        try {
                            yVar2.E(3);
                        } catch (RemoteException e7) {
                            u9.i.k("#007 Could not call remote method.", e7);
                        }
                        break;
                    }
                    jVar.l4(0);
                    return true;
                }
                if (str.startsWith("gmsg://scriptLoadFailed")) {
                    y yVar3 = jVar.f31293g;
                    if (yVar3 != null) {
                        try {
                            yVar3.d0(vv.C(1, null, null));
                        } catch (RemoteException e10) {
                            u9.i.k("#007 Could not call remote method.", e10);
                        }
                        break;
                    }
                    y yVar4 = jVar.f31293g;
                    if (yVar4 != null) {
                        try {
                            yVar4.E(0);
                        } catch (RemoteException e11) {
                            u9.i.k("#007 Could not call remote method.", e11);
                        }
                        break;
                    }
                    jVar.l4(0);
                    return true;
                }
                if (str.startsWith("gmsg://adResized")) {
                    y yVar5 = jVar.f31293g;
                    if (yVar5 != null) {
                        try {
                            yVar5.c();
                        } catch (RemoteException e12) {
                            u9.i.k("#007 Could not call remote method.", e12);
                        }
                        break;
                    }
                    String queryParameter = Uri.parse(str).getQueryParameter("height");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        try {
                            u9.d dVar = q9.r.f31959g.f31960a;
                            iB = u9.d.b(context, Integer.parseInt(queryParameter));
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    jVar.l4(iB);
                    return true;
                }
                if (str.startsWith("gmsg://")) {
                    return true;
                }
                y yVar6 = jVar.f31293g;
                if (yVar6 != null) {
                    try {
                        yVar6.m();
                        jVar.f31293g.i();
                    } catch (RemoteException e13) {
                        u9.i.k("#007 Could not call remote method.", e13);
                    }
                    break;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                context.startActivity(intent);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f2172a) {
            case 3:
                j jVar = (j) this.f2173b;
                y yVar = jVar.f31293g;
                if (yVar != null) {
                    try {
                        yVar.d0(vv.C(1, null, null));
                    } catch (RemoteException e3) {
                        u9.i.k("#007 Could not call remote method.", e3);
                    }
                }
                y yVar2 = jVar.f31293g;
                if (yVar2 != null) {
                    try {
                        yVar2.E(0);
                    } catch (RemoteException e7) {
                        u9.i.k("#007 Could not call remote method.", e7);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }
}
