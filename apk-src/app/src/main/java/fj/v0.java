package fj;

import android.webkit.WebView;
import com.google.android.gms.internal.ads.om1;
import fh.bz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f19437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebView f19438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f19439e;

    public /* synthetic */ v0(z0 z0Var, WebView webView, String str, int i) {
        this.f19436b = i;
        this.f19437c = z0Var;
        this.f19438d = webView;
        this.f19439e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f19436b;
        String urlArg = this.f19439e;
        WebView webViewArg = this.f19438d;
        z0 pigeon_instanceArg = this.f19437c;
        switch (i) {
            case 0:
                m mVar = pigeon_instanceArg.f19466a;
                ch.a callback = new ch.a(6);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(urlArg, "urlArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                a1.m mVar2 = mVar.f19374a;
                mVar2.getClass();
                if (!((c) mVar2.f363c).d(pigeon_instanceArg)) {
                    ij.k kVar = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `WebViewClient.onPageStarted` failed because native instance was not in the instance manager.", "");
                    int i10 = z0.f19465c;
                } else {
                    new s7.g((ii.f) mVar2.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", mVar2.m(), (Object) null).K(kotlin.collections.s.f(pigeon_instanceArg, webViewArg, urlArg), new bz(25, callback));
                }
                break;
            case 1:
                m mVar3 = pigeon_instanceArg.f19466a;
                ch.a callback2 = new ch.a(6);
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "viewArg");
                Intrinsics.checkNotNullParameter(urlArg, "urlArg");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                a1.m mVar4 = mVar3.f19374a;
                mVar4.getClass();
                if (!((c) mVar4.f363c).d(pigeon_instanceArg)) {
                    ij.k kVar2 = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `WebViewClient.onLoadResource` failed because native instance was not in the instance manager.", "");
                    int i11 = z0.f19465c;
                } else {
                    new s7.g((ii.f) mVar4.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", mVar4.m(), (Object) null).K(kotlin.collections.s.f(pigeon_instanceArg, webViewArg, urlArg), new bz(23, callback2));
                }
                break;
            case 2:
                m mVar5 = pigeon_instanceArg.f19466a;
                ch.a callback3 = new ch.a(6);
                mVar5.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(urlArg, "urlArg");
                Intrinsics.checkNotNullParameter(callback3, "callback");
                a1.m mVar6 = mVar5.f19374a;
                mVar6.getClass();
                if (!((c) mVar6.f363c).d(pigeon_instanceArg)) {
                    ij.k kVar3 = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `WebViewClient.onPageFinished` failed because native instance was not in the instance manager.", "");
                    int i12 = z0.f19465c;
                } else {
                    new s7.g((ii.f) mVar6.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", mVar6.m(), (Object) null).K(kotlin.collections.s.f(pigeon_instanceArg, webViewArg, urlArg), new k0(0, callback3));
                }
                break;
            default:
                m mVar7 = pigeon_instanceArg.f19466a;
                ch.a callback4 = new ch.a(6);
                mVar7.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "viewArg");
                Intrinsics.checkNotNullParameter(urlArg, "urlArg");
                Intrinsics.checkNotNullParameter(callback4, "callback");
                a1.m mVar8 = mVar7.f19374a;
                mVar8.getClass();
                if (!((c) mVar8.f363c).d(pigeon_instanceArg)) {
                    ij.k kVar4 = ij.m.f21341c;
                    om1.r("missing-instance-error", "Callback to `WebViewClient.onPageCommitVisible` failed because native instance was not in the instance manager.", "");
                    int i13 = z0.f19465c;
                } else {
                    new s7.g((ii.f) mVar8.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", mVar8.m(), (Object) null).K(kotlin.collections.s.f(pigeon_instanceArg, webViewArg, urlArg), new bz(28, callback4));
                }
                break;
        }
    }
}
