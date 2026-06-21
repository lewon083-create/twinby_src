package a0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.net.http.SslError;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.analytics.FirebaseAnalytics;
import fh.bz;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.SentryOptions;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.EnvelopeFileObserverIntegration;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.internal.util.FirstDrawDoneListener;
import io.sentry.android.core.internal.util.ScreenshotUtils;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import yads.an1;
import yads.dn1;
import yads.en1;
import yads.jm1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f123f;

    public /* synthetic */ i1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f119b = i;
        this.f120c = obj;
        this.f121d = obj2;
        this.f122e = obj3;
        this.f123f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f119b;
        int i10 = 6;
        Object obj = null;
        Object obj2 = this.f123f;
        Object obj3 = this.f122e;
        Object obj4 = this.f121d;
        Object obj5 = this.f120c;
        switch (i) {
            case 0:
                ((k1) obj5).K((g0) obj4, (Executor) obj3, (com.google.firebase.messaging.y) obj2);
                return;
            case 1:
                ((AFj1sSDK) obj5).getMonetizationNetwork((Context) obj4, (Runnable) obj3, (AFd1zSDK) obj2);
                return;
            case 2:
                fj.z0 pigeon_instanceArg = (fj.z0) obj5;
                WebView viewArg = (WebView) obj4;
                Message dontResendArg = (Message) obj3;
                Message resendArg = (Message) obj2;
                fj.m mVar = pigeon_instanceArg.f19466a;
                ch.a callback = new ch.a(i10);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg, "viewArg");
                Intrinsics.checkNotNullParameter(dontResendArg, "dontResendArg");
                Intrinsics.checkNotNullParameter(resendArg, "resendArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                a1.m mVar2 = mVar.f19374a;
                mVar2.getClass();
                if (((fj.c) mVar2.f363c).d(pigeon_instanceArg)) {
                    new s7.g((ii.f) mVar2.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", mVar2.m(), obj).K(kotlin.collections.s.f(pigeon_instanceArg, viewArg, dontResendArg, resendArg), new fj.k0(2, callback));
                    return;
                } else {
                    ij.k kVar = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `WebViewClient.onFormResubmission` failed because native instance was not in the instance manager.", "");
                    int i11 = fj.z0.f19465c;
                    return;
                }
            case 3:
                fj.z0 pigeon_instanceArg2 = (fj.z0) obj5;
                WebView viewArg2 = (WebView) obj4;
                SslErrorHandler handlerArg = (SslErrorHandler) obj3;
                SslError errorArg = (SslError) obj2;
                fj.m mVar3 = pigeon_instanceArg2.f19466a;
                ch.a callback2 = new ch.a(i10);
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg2, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg2, "viewArg");
                Intrinsics.checkNotNullParameter(handlerArg, "handlerArg");
                Intrinsics.checkNotNullParameter(errorArg, "errorArg");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                a1.m mVar4 = mVar3.f19374a;
                mVar4.getClass();
                if (((fj.c) mVar4.f363c).d(pigeon_instanceArg2)) {
                    new s7.g((ii.f) mVar4.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", mVar4.m(), obj).K(kotlin.collections.s.f(pigeon_instanceArg2, viewArg2, handlerArg, errorArg), new fj.k0(3, callback2));
                    return;
                } else {
                    ij.k kVar2 = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `WebViewClient.onReceivedSslError` failed because native instance was not in the instance manager.", "");
                    int i12 = fj.z0.f19465c;
                    return;
                }
            case 4:
                fj.z0 pigeon_instanceArg3 = (fj.z0) obj5;
                WebView webViewArg = (WebView) obj4;
                WebResourceRequest requestArg = (WebResourceRequest) obj3;
                WebResourceError errorArg2 = (WebResourceError) obj2;
                fj.m mVar5 = pigeon_instanceArg3.f19466a;
                ch.a callback3 = new ch.a(i10);
                mVar5.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg3, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(requestArg, "requestArg");
                Intrinsics.checkNotNullParameter(errorArg2, "errorArg");
                Intrinsics.checkNotNullParameter(callback3, "callback");
                a1.m mVar6 = mVar5.f19374a;
                mVar6.getClass();
                if (((fj.c) mVar6.f363c).d(pigeon_instanceArg3)) {
                    new s7.g((ii.f) mVar6.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", mVar6.m(), obj).K(kotlin.collections.s.f(pigeon_instanceArg3, webViewArg, requestArg, errorArg2), new bz(29, callback3));
                    return;
                } else {
                    ij.k kVar3 = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `WebViewClient.onReceivedRequestError` failed because native instance was not in the instance manager.", "");
                    int i13 = fj.z0.f19465c;
                    return;
                }
            case 5:
                fj.z0 pigeon_instanceArg4 = (fj.z0) obj5;
                WebView webViewArg2 = (WebView) obj4;
                WebResourceRequest requestArg2 = (WebResourceRequest) obj3;
                WebResourceResponse responseArg = (WebResourceResponse) obj2;
                fj.m mVar7 = pigeon_instanceArg4.f19466a;
                ch.a callback4 = new ch.a(i10);
                mVar7.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg4, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg2, "webViewArg");
                Intrinsics.checkNotNullParameter(requestArg2, "requestArg");
                Intrinsics.checkNotNullParameter(responseArg, "responseArg");
                Intrinsics.checkNotNullParameter(callback4, "callback");
                a1.m mVar8 = mVar7.f19374a;
                mVar8.getClass();
                if (((fj.c) mVar8.f363c).d(pigeon_instanceArg4)) {
                    new s7.g((ii.f) mVar8.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", mVar8.m(), obj).K(kotlin.collections.s.f(pigeon_instanceArg4, webViewArg2, requestArg2, responseArg), new bz(22, callback4));
                    return;
                } else {
                    ij.k kVar4 = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpError` failed because native instance was not in the instance manager.", "");
                    int i14 = fj.z0.f19465c;
                    return;
                }
            case 6:
                F0.a((F0) obj5, (String) obj4, (String) obj3, (String) obj2);
                return;
            case 7:
                L0.a((L0) obj5, (String) obj4, (String) obj3, (PluginErrorDetails) obj2);
                return;
            case 8:
                ((EnvelopeFileObserverIntegration) obj5).lambda$register$0((IScopes) obj4, (SentryOptions) obj3, (String) obj2);
                return;
            case 9:
                ((ScreenshotEventProcessor) obj5).lambda$captureViewHierarchy$1((AtomicReference) obj4, (Activity) obj3, (CountDownLatch) obj2);
                return;
            case 10:
                FirstDrawDoneListener.lambda$registerForNextDraw$0((Window) obj5, (Window.Callback) obj4, (Runnable) obj3, (BuildInfoProvider) obj2);
                return;
            case 11:
                ScreenshotUtils.lambda$captureScreenshot$1((View) obj5, (Canvas) obj4, (ILogger) obj3, (CountDownLatch) obj2);
                return;
            case 12:
                String str = (String) obj4;
                String str2 = (String) obj3;
                sb.g gVar = (sb.g) obj2;
                try {
                    FirebaseAnalytics firebaseAnalytics = ((oi.j) obj5).f30690b;
                    if (firebaseAnalytics == null) {
                        Intrinsics.g("analytics");
                        throw null;
                    }
                    com.google.android.gms.internal.measurement.m1 m1Var = firebaseAnalytics.f14753a;
                    m1Var.getClass();
                    m1Var.c(new com.google.android.gms.internal.measurement.w0(m1Var, (String) null, str, (Object) str2, false));
                    gVar.b(null);
                    return;
                } catch (Exception e3) {
                    gVar.a(e3);
                    return;
                }
            case 13:
                pi.d dVar = (pi.d) obj5;
                pi.e eVar = (pi.e) obj4;
                String str3 = (String) obj3;
                sb.g gVar2 = (sb.g) obj2;
                HashMap map = pi.d.f31479d;
                dVar.getClass();
                try {
                    String str4 = eVar.f31482a;
                    pa.c0.g(str4, "ApiKey must be set.");
                    String str5 = eVar.f31483b;
                    pa.c0.g(str5, "ApplicationId must be set.");
                    String str6 = eVar.f31487f;
                    String str7 = eVar.f31484c;
                    String str8 = eVar.f31485d;
                    fd.i iVar = new fd.i(str5, str4, str6, eVar.i, str7, eVar.f31488g, str8);
                    try {
                        Looper.prepare();
                        break;
                    } catch (Exception unused) {
                    }
                    String str9 = eVar.f31486e;
                    if (str9 != null) {
                        pi.d.f31479d.put(str3, str9);
                    }
                    fd.g gVarJ = fd.g.j(dVar.f31480b, iVar, str3);
                    sb.g gVar3 = new sb.g();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new pi.c(dVar, gVarJ, gVar3));
                    gVar2.b((pi.f) b4.b(gVar3.f32858a));
                    return;
                } catch (Exception e7) {
                    gVar2.a(e7);
                    return;
                }
            case 14:
                ((CameraCaptureSession.CaptureCallback) ((t.m) obj5).f33151b).onCaptureCompleted((CameraCaptureSession) obj4, (CaptureRequest) obj3, (TotalCaptureResult) obj2);
                return;
            case 15:
                ((CameraCaptureSession.CaptureCallback) ((t.m) obj5).f33151b).onCaptureProgressed((CameraCaptureSession) obj4, (CaptureRequest) obj3, (CaptureResult) obj2);
                return;
            case 16:
                ((CameraCaptureSession.CaptureCallback) ((t.m) obj5).f33151b).onCaptureFailed((CameraCaptureSession) obj4, (CaptureRequest) obj3, (CaptureFailure) obj2);
                return;
            default:
                ((dn1) obj5).a((en1) obj4, (an1) obj3, (jm1) obj2);
                return;
        }
    }
}
