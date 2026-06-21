package fj;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import fh.bz;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends q0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f19426h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f19427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19428c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19429d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19430e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19431f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19432g = false;

    public u0(q qVar) {
        this.f19427b = qVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage messageArg) {
        ch.a callback = new ch.a(5);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(messageArg, "messageArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", mVar.m(), (Object) null).K(kotlin.collections.s.f(this, messageArg), new bz(16, callback));
        } else {
            ij.k kVar = ij.m.f21341c;
            om1.r("missing-instance-error", "Callback to `WebChromeClient.onConsoleMessage` failed because native instance was not in the instance manager.", "");
        }
        return this.f19429d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        ch.a callback = new ch.a(5);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", mVar.m(), (Object) null).K(kotlin.collections.r.c(this), new bz(18, callback));
        } else {
            ij.k kVar = ij.m.f21341c;
            om1.r("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsHidePrompt` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String originArg, GeolocationPermissions.Callback callbackArg) {
        ch.a callback = new ch.a(5);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(originArg, "originArg");
        Intrinsics.checkNotNullParameter(callbackArg, "callbackArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", mVar.m(), (Object) null).K(kotlin.collections.s.f(this, originArg, callbackArg), new bz(17, callback));
        } else {
            ij.k kVar = ij.m.f21341c;
            om1.r("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsShowPrompt` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        ch.a callback = new ch.a(5);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", mVar.m(), (Object) null).K(kotlin.collections.r.c(this), new bz(12, callback));
        } else {
            ij.k kVar = ij.m.f21341c;
            om1.r("missing-instance-error", "Callback to `WebChromeClient.onHideCustomView` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f19430e) {
            return false;
        }
        r0 result = new r0(this, jsResult, 1);
        Intrinsics.checkNotNullParameter(result, "result");
        l0 callback = new l0(result, 0);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(messageArg, "messageArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", mVar.m(), (Object) null).K(kotlin.collections.s.f(this, webViewArg, urlArg, messageArg), new g0(callback, 1));
        } else {
            ij.k kVar = ij.m.f21341c;
            callback.invoke(new ij.m(h5.s(new a("missing-instance-error", "Callback to `WebChromeClient.onJsAlert` failed because native instance was not in the instance manager.", ""))));
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f19431f) {
            return false;
        }
        r0 result = new r0(this, jsResult, 0);
        Intrinsics.checkNotNullParameter(result, "result");
        l0 callback = new l0(result, 0);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(messageArg, "messageArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", mVar.m(), (Object) null).K(kotlin.collections.s.f(this, webViewArg, urlArg, messageArg), new g0(callback, 3));
            return true;
        }
        ij.k kVar = ij.m.f21341c;
        callback.invoke(new ij.m(h5.s(new a("missing-instance-error", "Callback to `WebChromeClient.onJsConfirm` failed because native instance was not in the instance manager.", ""))));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webViewArg, String urlArg, String messageArg, String defaultValueArg, JsPromptResult jsPromptResult) {
        if (!this.f19432g) {
            return false;
        }
        s0 result = new s0(0, this, jsPromptResult);
        Intrinsics.checkNotNullParameter(result, "result");
        l0 callback = new l0(result, 0);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(messageArg, "messageArg");
        Intrinsics.checkNotNullParameter(defaultValueArg, "defaultValueArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", mVar.m(), (Object) null).K(kotlin.collections.s.f(this, webViewArg, urlArg, messageArg, defaultValueArg), new g0(callback, 0));
            return true;
        }
        ij.k kVar = ij.m.f21341c;
        callback.invoke(new ij.m(h5.s(new a("missing-instance-error", "Callback to `WebChromeClient.onJsPrompt` failed because native instance was not in the instance manager.", ""))));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest requestArg) {
        ch.a callback = new ch.a(5);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(requestArg, "requestArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", mVar.m(), (Object) null).K(kotlin.collections.s.f(this, requestArg), new bz(14, callback));
        } else {
            ij.k kVar = ij.m.f21341c;
            om1.r("missing-instance-error", "Callback to `WebChromeClient.onPermissionRequest` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webViewArg, int i) {
        long j10 = i;
        ch.a callback = new ch.a(5);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", mVar.m(), (Object) null).K(kotlin.collections.s.f(this, webViewArg, Long.valueOf(j10)), new bz(13, callback));
        } else {
            ij.k kVar = ij.m.f21341c;
            om1.r("missing-instance-error", "Callback to `WebChromeClient.onProgressChanged` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View viewArg, WebChromeClient.CustomViewCallback callbackArg) {
        ch.a callback = new ch.a(5);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(viewArg, "viewArg");
        Intrinsics.checkNotNullParameter(callbackArg, "callbackArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", mVar.m(), (Object) null).K(kotlin.collections.s.f(this, viewArg, callbackArg), new bz(15, callback));
        } else {
            ij.k kVar = ij.m.f21341c;
            om1.r("missing-instance-error", "Callback to `WebChromeClient.onShowCustomView` failed because native instance was not in the instance manager.", "");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webViewArg, final ValueCallback valueCallback, WebChromeClient.FileChooserParams paramsArg) {
        final boolean z5 = this.f19428c;
        Function1 result = new Function1() { // from class: fj.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                m0 m0Var = (m0) obj;
                if (m0Var.f19378d) {
                    a1.m mVar = this.f19421b.f19427b.f19403a;
                    Throwable th2 = m0Var.f19377c;
                    Objects.requireNonNull(th2);
                    mVar.getClass();
                    a1.m.p(th2);
                    return null;
                }
                List list = (List) m0Var.f19376b;
                Objects.requireNonNull(list);
                List list2 = list;
                if (!z5) {
                    return null;
                }
                Uri[] uriArr = new Uri[list2.size()];
                for (int i = 0; i < list2.size(); i++) {
                    uriArr[i] = Uri.parse((String) list2.get(i));
                }
                valueCallback.onReceiveValue(uriArr);
                return null;
            }
        };
        Intrinsics.checkNotNullParameter(result, "result");
        l0 callback = new l0(result, 0);
        q qVar = this.f19427b;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(paramsArg, "paramsArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a1.m mVar = qVar.f19403a;
        mVar.getClass();
        if (((c) mVar.f363c).d(this)) {
            new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", mVar.m(), (Object) null).K(kotlin.collections.s.f(this, webViewArg, paramsArg), new g0(callback, 2));
            return z5;
        }
        ij.k kVar = ij.m.f21341c;
        callback.invoke(new ij.m(h5.s(new a("missing-instance-error", "Callback to `WebChromeClient.onShowFileChooser` failed because native instance was not in the instance manager.", ""))));
        return z5;
    }
}
