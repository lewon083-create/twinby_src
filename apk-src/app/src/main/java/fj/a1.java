package fj;

import android.content.Context;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import fh.bz;
import fh.nd;
import fh.of;
import fh.zf;
import kotlin.jvm.internal.Intrinsics;
import m.h3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class a1 implements ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ei.a f19304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a1.m f19305c;

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        a1.m mVar = this.f19305c;
        if (mVar != null) {
            mVar.f365e = (z2.w) ((h3) bVar).f28250b;
        }
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        this.f19304b = aVar;
        ii.f binaryMessenger = aVar.f16383c;
        Context context = aVar.f16381a;
        s sVar = new s(context.getAssets(), aVar.f16386f);
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        a1.m mVar = new a1.m();
        mVar.f362b = binaryMessenger;
        a7.l finalizationListener = new a7.l(15, new e(binaryMessenger));
        Intrinsics.checkNotNullParameter(finalizationListener, "finalizationListener");
        mVar.f363c = new c(finalizationListener);
        mVar.f365e = context;
        mVar.f366f = sVar;
        this.f19305c = mVar;
        aVar.f16385e.h("plugins.flutter.io/webview", new ti.w0((c) mVar.f363c));
        a1.m pigeonRegistrar = this.f19305c;
        pigeonRegistrar.getClass();
        ij.p pVar = e.f19337b;
        ii.f binaryMessenger2 = (ii.f) pigeonRegistrar.f362b;
        wa.a.x(binaryMessenger2, (c) pigeonRegistrar.f363c);
        a0.e.s(binaryMessenger2, new m(pigeonRegistrar, 0));
        hl.l.q(binaryMessenger2, new q(pigeonRegistrar, 3));
        hl.d.D(binaryMessenger2, new t(pigeonRegistrar, 2));
        m mVar2 = new m(pigeonRegistrar, 1);
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", pigeonRegistrar.m(), (Object) null).L(new b0(2, mVar2));
        m mVar3 = new m(pigeonRegistrar, 3);
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        ii.m mVarM = pigeonRegistrar.m();
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", mVarM, (Object) null).L(new b0(19, mVar3));
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", mVarM, (Object) null).L(new k0(6, mVar3));
        q qVar = new q(pigeonRegistrar, 0);
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", pigeonRegistrar.m(), (Object) null).L(new a0.a0(27, qVar));
        h5.A(binaryMessenger2, new q(pigeonRegistrar, 2));
        com.google.android.gms.internal.auth.g.H(binaryMessenger2, new t(pigeonRegistrar, 0));
        i iVar = new i(pigeonRegistrar, 3);
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        ii.m mVarM2 = pigeonRegistrar.m();
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", mVarM2, (Object) null).L(new b0(16, iVar));
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", mVarM2, (Object) null).L(new bz(20, iVar));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        of ofVar = new of();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        ii.m mVarM3 = pigeonRegistrar.m();
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", mVarM3, (Object) null).L(new bz(7, ofVar));
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", mVarM3, (Object) null).L(new bz(8, ofVar));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        of ofVar2 = new of();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", pigeonRegistrar.m(), (Object) null).L(new bz(3, ofVar2));
        j4.t(binaryMessenger2, new m(pigeonRegistrar, 2));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        nd ndVar = new nd();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", pigeonRegistrar.m(), (Object) null).L(new bz(5, ndVar));
        com.google.android.gms.internal.auth.m.w(binaryMessenger2, new i(pigeonRegistrar, 1));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        of ofVar3 = new of();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", pigeonRegistrar.m(), (Object) null).L(new bz(1, ofVar3));
        a.a.q(binaryMessenger2, new i(pigeonRegistrar, 0));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        zf zfVar = new zf();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        ii.m mVarM4 = pigeonRegistrar.m();
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", mVarM4, (Object) null).L(new bz(10, zfVar));
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", mVarM4, (Object) null).L(new bz(11, zfVar));
        i iVar2 = new i(pigeonRegistrar, 2);
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        ii.m mVarM5 = pigeonRegistrar.m();
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", mVarM5, (Object) null).L(new bz(9, iVar2));
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", mVarM5, (Object) null).L(new b0(8, iVar2));
        d4.x(binaryMessenger2, new q(pigeonRegistrar, 1));
        b4.H(binaryMessenger2, new t(pigeonRegistrar, 1));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        zf zfVar2 = new zf();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", pigeonRegistrar.m(), (Object) null).L(new bz(2, zfVar2));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        of ofVar4 = new of();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", pigeonRegistrar.m(), (Object) null).L(new bz(19, ofVar4));
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        zf zfVar3 = new zf();
        Intrinsics.checkNotNullParameter(binaryMessenger2, "binaryMessenger");
        new s7.g(binaryMessenger2, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", pigeonRegistrar.m(), (Object) null).L(new k0(7, zfVar3));
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        this.f19305c.f365e = this.f19304b.f16381a;
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f19305c.f365e = this.f19304b.f16381a;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        a1.m mVar = this.f19305c;
        if (mVar != null) {
            ij.p pVar = e.f19337b;
            ii.f binaryMessenger = (ii.f) mVar.f362b;
            wa.a.x(binaryMessenger, null);
            a0.e.s(binaryMessenger, null);
            hl.l.q(binaryMessenger, null);
            hl.d.D(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", new cj.n(1), (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar = new cj.n(1);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", nVar, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", nVar, (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", new cj.n(1), (Object) null).L(null);
            h5.A(binaryMessenger, null);
            com.google.android.gms.internal.auth.g.H(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar2 = new cj.n(1);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", nVar2, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", nVar2, (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar3 = new cj.n(1);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", nVar3, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", nVar3, (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", new cj.n(1), (Object) null).L(null);
            j4.t(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", new cj.n(1), (Object) null).L(null);
            com.google.android.gms.internal.auth.m.w(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", new cj.n(1), (Object) null).L(null);
            a.a.q(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar4 = new cj.n(1);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", nVar4, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", nVar4, (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            cj.n nVar5 = new cj.n(1);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", nVar5, (Object) null).L(null);
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", nVar5, (Object) null).L(null);
            d4.x(binaryMessenger, null);
            b4.H(binaryMessenger, null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", new cj.n(1), (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", new cj.n(1), (Object) null).L(null);
            Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
            new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", new cj.n(1), (Object) null).L(null);
            c cVar = (c) this.f19305c.f363c;
            cVar.f19317g.removeCallbacks((a0.d1) cVar.f19321l);
            cVar.i = true;
            this.f19305c = null;
        }
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        this.f19305c.f365e = (z2.w) ((h3) bVar).f28250b;
    }
}
