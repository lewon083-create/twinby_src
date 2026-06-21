package fj;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.om1;
import fh.bz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends WebView implements io.flutter.plugin.platform.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f19333e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f19334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebViewClient f19335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q0 f19336d;

    public d1(q qVar) {
        super((Context) qVar.f19403a.f365e);
        this.f19334b = qVar;
        this.f19335c = new WebViewClient();
        this.f19336d = new q0();
        setWebViewClient(this.f19335c);
        setWebChromeClient(this.f19336d);
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f19336d;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        xh.s sVar;
        super.onAttachedToWindow();
        this.f19334b.f19403a.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = this;
            while (true) {
                if (parent.getParent() == null) {
                    sVar = null;
                    break;
                }
                parent = parent.getParent();
                if (parent instanceof xh.s) {
                    sVar = (xh.s) parent;
                    break;
                }
            }
            if (sVar != null) {
                sVar.setImportantForAutofill(1);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i, final int i10, final int i11, final int i12) {
        super.onScrollChanged(i, i10, i11, i12);
        this.f19334b.f19403a.q(new Runnable() { // from class: fj.c1
            @Override // java.lang.Runnable
            public final void run() {
                d1 pigeon_instanceArg = this.f19324b;
                q qVar = pigeon_instanceArg.f19334b;
                long j10 = i;
                long j11 = i10;
                long j12 = i11;
                long j13 = i12;
                ch.a callback = new ch.a(7);
                qVar.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                a1.m mVar = qVar.f19403a;
                mVar.getClass();
                if (((c) mVar.f363c).d(pigeon_instanceArg)) {
                    new s7.g((ii.f) mVar.f362b, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", mVar.m(), (Object) null).K(kotlin.collections.s.f(pigeon_instanceArg, Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13)), new bz(21, callback));
                    return;
                }
                ij.k kVar = ij.m.f21341c;
                om1.r("missing-instance-error", "Callback to `WebView.onScrollChanged` failed because native instance was not in the instance manager.", "");
                int i13 = d1.f19333e;
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof q0)) {
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }
        q0 q0Var = (q0) webChromeClient;
        this.f19336d = q0Var;
        q0Var.f19404a = this.f19335c;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(@NonNull WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f19335c = webViewClient;
        this.f19336d.f19404a = webViewClient;
    }

    @Override // io.flutter.plugin.platform.f
    public final void a() {
    }

    @Override // io.flutter.plugin.platform.f
    public View getView() {
        return this;
    }
}
