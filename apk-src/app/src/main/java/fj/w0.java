package fj;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.internal.ads.om1;
import fh.bz;
import io.sentry.ILogger;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19449g;

    public /* synthetic */ w0(z0 z0Var, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f19444b = 1;
        this.f19445c = z0Var;
        this.f19446d = webView;
        this.f19449g = httpAuthHandler;
        this.f19447e = str;
        this.f19448f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f19444b;
        int i10 = 1;
        Intent intent = null;
        Object obj = this.f19447e;
        Object obj2 = this.f19449g;
        Object obj3 = this.f19448f;
        Object obj4 = this.f19446d;
        Object obj5 = this.f19445c;
        switch (i) {
            case 0:
                z0 pigeon_instanceArg = (z0) obj5;
                WebView viewArg = (WebView) obj4;
                String realmArg = (String) obj;
                String str = (String) obj3;
                String argsArg = (String) obj2;
                m mVar = pigeon_instanceArg.f19466a;
                ch.a callback = new ch.a(6);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg, "viewArg");
                Intrinsics.checkNotNullParameter(realmArg, "realmArg");
                Intrinsics.checkNotNullParameter(argsArg, "argsArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                a1.m mVar2 = mVar.f19374a;
                mVar2.getClass();
                if (!((c) mVar2.f363c).d(pigeon_instanceArg)) {
                    ij.k kVar = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `WebViewClient.onReceivedLoginRequest` failed because native instance was not in the instance manager.", "");
                    int i11 = z0.f19465c;
                } else {
                    new s7.g((ii.f) mVar2.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", mVar2.m(), (Object) null).K(kotlin.collections.s.f(pigeon_instanceArg, viewArg, realmArg, str, argsArg), new bz(24, callback));
                }
                break;
            case 1:
                z0 pigeon_instanceArg2 = (z0) obj5;
                WebView webViewArg = (WebView) obj4;
                HttpAuthHandler handlerArg = (HttpAuthHandler) obj2;
                String hostArg = (String) obj;
                String realmArg2 = (String) obj3;
                m mVar3 = pigeon_instanceArg2.f19466a;
                ch.a callback2 = new ch.a(6);
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg2, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(handlerArg, "handlerArg");
                Intrinsics.checkNotNullParameter(hostArg, "hostArg");
                Intrinsics.checkNotNullParameter(realmArg2, "realmArg");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                a1.m mVar4 = mVar3.f19374a;
                mVar4.getClass();
                if (!((c) mVar4.f363c).d(pigeon_instanceArg2)) {
                    ij.k kVar2 = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpAuthRequest` failed because native instance was not in the instance manager.", "");
                    int i12 = z0.f19465c;
                } else {
                    new s7.g((ii.f) mVar4.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", mVar4.m(), (Object) null).K(kotlin.collections.s.f(pigeon_instanceArg2, webViewArg, handlerArg, hostArg, realmArg2), new k0(i10, callback2));
                }
                break;
            case 2:
                ViewHierarchyEventProcessor.lambda$snapshotViewHierarchy$0((AtomicReference) obj5, (View) obj4, (List) obj, (CountDownLatch) obj3, (ILogger) obj2);
                break;
            default:
                wi.b bVar = (wi.b) obj5;
                jh.b bVar2 = (jh.b) obj3;
                UserRecoverableAuthException userRecoverableAuthException = (UserRecoverableAuthException) obj2;
                String str2 = (String) obj;
                if (((Boolean) obj4).booleanValue() && bVar.f35257f == null) {
                    Activity activity = bVar.f35254c;
                    if (activity != null) {
                        bVar.b("getTokens", null, null, null, bVar2, str2);
                        Intent intent2 = userRecoverableAuthException.f2586b;
                        if (intent2 == null) {
                            int iM = t.z.m(userRecoverableAuthException.f2587c);
                            if (iM == 0) {
                                Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                            } else if (iM == 1) {
                                Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
                            } else if (iM == 2) {
                                Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
                            }
                        } else {
                            intent = new Intent(intent2);
                        }
                        activity.startActivityForResult(intent, 53294);
                    } else {
                        bVar2.b(new wi.d("user_recoverable_auth", "Cannot recover auth because app is not in foreground. " + userRecoverableAuthException.getLocalizedMessage()));
                    }
                } else {
                    bVar2.b(new wi.d("user_recoverable_auth", userRecoverableAuthException.getLocalizedMessage()));
                }
                break;
        }
    }

    public /* synthetic */ w0(Object obj, View view, Object obj2, Object obj3, Object obj4, int i) {
        this.f19444b = i;
        this.f19445c = obj;
        this.f19446d = view;
        this.f19447e = obj2;
        this.f19448f = obj3;
        this.f19449g = obj4;
    }

    public /* synthetic */ w0(wi.b bVar, Boolean bool, jh.b bVar2, UserRecoverableAuthException userRecoverableAuthException, String str) {
        this.f19444b = 3;
        this.f19445c = bVar;
        this.f19446d = bool;
        this.f19448f = bVar2;
        this.f19449g = userRecoverableAuthException;
        this.f19447e = str;
    }
}
