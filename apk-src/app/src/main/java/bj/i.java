package bj;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.d00;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.mh0;
import com.google.android.gms.internal.ads.pz;
import com.google.android.gms.internal.ads.qz;
import com.google.android.gms.internal.ads.rz;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.zs;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.flutter.plugins.urllauncher.WebViewActivity;
import io.sentry.SentryOptions;
import l7.o;
import p9.k;
import q9.s;
import t9.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2174a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyEvent.Callback f2175b;

    public i(d00 d00Var) {
        this.f2175b = d00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof sz)) {
            return webView.getContext();
        }
        sz szVar = (sz) webView;
        Activity activityD = szVar.d();
        return activityD != null ? activityD : szVar.getContext();
    }

    public boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z5) {
        k00 k00Var;
        p9.a aVar;
        try {
            d00 d00Var = (d00) this.f2175b;
            if (d00Var != null && (k00Var = d00Var.f4408b.f5576o) != null && (aVar = k00Var.f7077x) != null && aVar != null && !aVar.a()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb2.append("window.");
                sb2.append(str);
                sb2.append("('");
                sb2.append(str3);
                sb2.append("')");
                aVar.b(sb2.toString());
                return false;
            }
            g0 g0Var = k.C.f31297c;
            AlertDialog.Builder builderL = g0.l(context);
            builderL.setTitle(str2);
            if (!z5) {
                builderL.setMessage(str3).setPositiveButton(R.string.ok, new qz(jsResult, 1)).setNegativeButton(R.string.cancel, new qz(jsResult, 0)).setOnCancelListener(new pz(0, jsResult)).create().show();
                return true;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderL.setView(linearLayout).setPositiveButton(R.string.ok, new mh0(2, jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zs(1, jsPromptResult)).setOnCancelListener(new pz(1, jsPromptResult)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e3) {
            u9.i.i("Fail to display Dialog.", e3);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        switch (this.f2174a) {
            case 1:
                if (!(webView instanceof sz)) {
                    u9.i.h("Tried to close a WebView that wasn't an AdWebView.");
                } else {
                    s9.d dVarG0 = ((sz) webView).G0();
                    if (dVarG0 != null) {
                        dVarG0.z();
                    } else {
                        u9.i.h("Tried to close an AdWebView not associated with an overlay.");
                    }
                }
                break;
            default:
                super.onCloseWindow(webView);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        switch (this.f2174a) {
            case 1:
                String strMessage = consoleMessage.message();
                String strSourceId = consoleMessage.sourceId();
                int iLineNumber = consoleMessage.lineNumber();
                int length = String.valueOf(strMessage).length();
                StringBuilder sb2 = new StringBuilder(o.v(length + 6 + String.valueOf(strSourceId).length(), 1, String.valueOf(iLineNumber).length(), 1));
                o.t(sb2, "JS: ", strMessage, " (", strSourceId);
                String strL = o.l(sb2, StringUtils.PROCESS_POSTFIX_DELIMITER, iLineNumber, ")");
                if (!strL.contains("Application Cache")) {
                    int i = rz.f10098a[consoleMessage.messageLevel().ordinal()];
                    if (i == 1) {
                        u9.i.e(strL);
                    } else if (i == 2) {
                        u9.i.h(strL);
                    } else if (i == 3 || i == 4 || i != 5) {
                        u9.i.g(strL);
                    } else {
                        u9.i.c(strL);
                    }
                }
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z5, boolean z10, Message message) {
        switch (this.f2174a) {
            case 0:
                h hVar = new h(0, this);
                WebView webView2 = new WebView(((WebViewActivity) this.f2175b).f25782d.getContext());
                webView2.setWebViewClient(hVar);
                ((WebView.WebViewTransport) message.obj).setWebView(webView2);
                message.sendToTarget();
                break;
            default:
                WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
                WebView webView3 = new WebView(webView.getContext());
                k00 k00Var = ((d00) this.f2175b).f4408b.f5576o;
                if (k00Var != null) {
                    webView3.setWebViewClient(k00Var);
                }
                webViewTransport.setWebView(webView3);
                message.sendToTarget();
                break;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        switch (this.f2174a) {
            case 1:
                long j13 = 5242880 - j12;
                if (j13 > 0) {
                    if (j10 == 0) {
                        if (j11 > j13 || j11 > SentryOptions.MAX_EVENT_SIZE_BYTES) {
                            j11 = 0;
                        }
                    } else if (j11 == 0) {
                        j11 = Math.min(Math.min(131072L, j13) + j10, SentryOptions.MAX_EVENT_SIZE_BYTES);
                    } else {
                        if (j11 <= Math.min(SentryOptions.MAX_EVENT_SIZE_BYTES - j10, j13)) {
                            j10 += j11;
                        }
                        j11 = j10;
                    }
                    quotaUpdater.updateQuota(j11);
                } else {
                    quotaUpdater.updateQuota(j10);
                }
                break;
            default:
                super.onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        switch (this.f2174a) {
            case 1:
                if (callback != null) {
                    d00 d00Var = (d00) this.f2175b;
                    g0 g0Var = k.C.f31297c;
                    boolean z5 = g0.d(d00Var.getContext(), "android.permission.ACCESS_FINE_LOCATION") || g0.d(d00Var.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
                    wk wkVar = al.f3246ve;
                    s sVar = s.f31967e;
                    if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                        callback.invoke(str, false, true);
                    } else {
                        callback.invoke(str, z5, true);
                    }
                    if (((Boolean) sVar.f31970c.a(al.we)).booleanValue()) {
                        u9.i.c("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
                    }
                }
                break;
            default:
                super.onGeolocationPermissionsShowPrompt(str, callback);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        switch (this.f2174a) {
            case 1:
                s9.d dVarG0 = ((d00) this.f2175b).f4408b.G0();
                if (dVarG0 != null) {
                    dVarG0.h();
                } else {
                    u9.i.h("Could not get ad overlay when hiding custom view.");
                }
                break;
            default:
                super.onHideCustomView();
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f2174a) {
            case 1:
                return a(b(webView), "alert", str, str2, null, jsResult, null, false);
            default:
                return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f2174a) {
            case 1:
                return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
            default:
                return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        switch (this.f2174a) {
            case 1:
                return a(b(webView), VKApiCodes.EXTRA_CONFIRM, str, str2, null, jsResult, null, false);
            default:
                return super.onJsConfirm(webView, str, str2, jsResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        switch (this.f2174a) {
            case 1:
                return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
            default:
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f2174a) {
            case 1:
                s9.d dVarG0 = ((d00) this.f2175b).f4408b.G0();
                if (dVarG0 != null) {
                    Activity activity = dVarG0.f32808c;
                    FrameLayout frameLayout = new FrameLayout(activity);
                    dVarG0.i = frameLayout;
                    frameLayout.setBackgroundColor(-16777216);
                    dVarG0.i.addView(view, -1, -1);
                    activity.setContentView(dVarG0.i);
                    dVarG0.f32823s = true;
                    dVarG0.f32814j = customViewCallback;
                    dVarG0.f32813h = true;
                    dVarG0.s4(i);
                } else {
                    u9.i.h("Could not get ad overlay when showing custom view.");
                    customViewCallback.onCustomViewHidden();
                }
                break;
            default:
                super.onShowCustomView(view, i, customViewCallback);
                break;
        }
    }

    public i(WebViewActivity webViewActivity) {
        this.f2175b = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.f2174a) {
            case 1:
                onShowCustomView(view, -1, customViewCallback);
                break;
            default:
                super.onShowCustomView(view, customViewCallback);
                break;
        }
    }
}
