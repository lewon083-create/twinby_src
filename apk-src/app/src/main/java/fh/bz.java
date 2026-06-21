package fh;

import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import com.google.android.gms.internal.ads.om1;
import com.yandex.div.internal.parser.ValueValidator;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bz implements ValueValidator, ii.b, ii.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16993b;

    public /* synthetic */ bz() {
        this.f16993b = 0;
    }

    @Override // ii.c
    public void i(Object obj) {
        switch (this.f16993b) {
            case 4:
                if (!(obj instanceof List)) {
                    ij.k kVar = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", "");
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        ij.k kVar2 = ij.m.f21341c;
                        Unit unit = Unit.f27471a;
                    } else {
                        ij.k kVar3 = ij.m.f21341c;
                        Object obj2 = list.get(0);
                        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj2, (String) obj3, (String) list.get(2)));
                    }
                }
                break;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 19:
            case 20:
            default:
                if (!(obj instanceof List)) {
                    ij.k kVar4 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", "");
                    int i = fj.z0.f19465c;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        ij.k kVar5 = ij.m.f21341c;
                        Unit unit2 = Unit.f27471a;
                        int i10 = fj.z0.f19465c;
                    } else {
                        ij.k kVar6 = ij.m.f21341c;
                        Object obj4 = list2.get(0);
                        Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i11 = fj.z0.f19465c;
                    }
                }
                break;
            case 6:
                if (!(obj instanceof List)) {
                    ij.k kVar7 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", "");
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        ij.k kVar8 = ij.m.f21341c;
                        Unit unit3 = Unit.f27471a;
                    } else {
                        ij.k kVar9 = ij.m.f21341c;
                        Object obj6 = list3.get(0);
                        Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj6, (String) obj7, (String) list3.get(2)));
                    }
                }
                break;
            case 12:
                if (!(obj instanceof List)) {
                    ij.k kVar10 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", "");
                    int i12 = fj.u0.f19426h;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        ij.k kVar11 = ij.m.f21341c;
                        Unit unit4 = Unit.f27471a;
                        int i13 = fj.u0.f19426h;
                    } else {
                        ij.k kVar12 = ij.m.f21341c;
                        Object obj8 = list4.get(0);
                        Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i14 = fj.u0.f19426h;
                    }
                }
                break;
            case 13:
                if (!(obj instanceof List)) {
                    ij.k kVar13 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", "");
                    int i15 = fj.u0.f19426h;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        ij.k kVar14 = ij.m.f21341c;
                        Unit unit5 = Unit.f27471a;
                        int i16 = fj.u0.f19426h;
                    } else {
                        ij.k kVar15 = ij.m.f21341c;
                        Object obj10 = list5.get(0);
                        Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i17 = fj.u0.f19426h;
                    }
                }
                break;
            case 14:
                if (!(obj instanceof List)) {
                    ij.k kVar16 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", "");
                    int i18 = fj.u0.f19426h;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        ij.k kVar17 = ij.m.f21341c;
                        Unit unit6 = Unit.f27471a;
                        int i19 = fj.u0.f19426h;
                    } else {
                        ij.k kVar18 = ij.m.f21341c;
                        Object obj12 = list6.get(0);
                        Intrinsics.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i20 = fj.u0.f19426h;
                    }
                }
                break;
            case 15:
                if (!(obj instanceof List)) {
                    ij.k kVar19 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", "");
                    int i21 = fj.u0.f19426h;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        ij.k kVar20 = ij.m.f21341c;
                        Unit unit7 = Unit.f27471a;
                        int i22 = fj.u0.f19426h;
                    } else {
                        ij.k kVar21 = ij.m.f21341c;
                        Object obj14 = list7.get(0);
                        Intrinsics.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i23 = fj.u0.f19426h;
                    }
                }
                break;
            case 16:
                if (!(obj instanceof List)) {
                    ij.k kVar22 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", "");
                    int i24 = fj.u0.f19426h;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        ij.k kVar23 = ij.m.f21341c;
                        Unit unit8 = Unit.f27471a;
                        int i25 = fj.u0.f19426h;
                    } else {
                        ij.k kVar24 = ij.m.f21341c;
                        Object obj16 = list8.get(0);
                        Intrinsics.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i26 = fj.u0.f19426h;
                    }
                }
                break;
            case 17:
                if (!(obj instanceof List)) {
                    ij.k kVar25 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", "");
                    int i27 = fj.u0.f19426h;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        ij.k kVar26 = ij.m.f21341c;
                        Unit unit9 = Unit.f27471a;
                        int i28 = fj.u0.f19426h;
                    } else {
                        ij.k kVar27 = ij.m.f21341c;
                        Object obj18 = list9.get(0);
                        Intrinsics.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i29 = fj.u0.f19426h;
                    }
                }
                break;
            case 18:
                if (!(obj instanceof List)) {
                    ij.k kVar28 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", "");
                    int i30 = fj.u0.f19426h;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        ij.k kVar29 = ij.m.f21341c;
                        Unit unit10 = Unit.f27471a;
                        int i31 = fj.u0.f19426h;
                    } else {
                        ij.k kVar30 = ij.m.f21341c;
                        Object obj20 = list10.get(0);
                        Intrinsics.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj20, (String) obj21, (String) list10.get(2)));
                        int i32 = fj.u0.f19426h;
                    }
                }
                break;
            case 21:
                if (!(obj instanceof List)) {
                    ij.k kVar31 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", "");
                    int i33 = fj.d1.f19333e;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        ij.k kVar32 = ij.m.f21341c;
                        Unit unit11 = Unit.f27471a;
                        int i34 = fj.d1.f19333e;
                    } else {
                        ij.k kVar33 = ij.m.f21341c;
                        Object obj22 = list11.get(0);
                        Intrinsics.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj22, (String) obj23, (String) list11.get(2)));
                        int i35 = fj.d1.f19333e;
                    }
                }
                break;
            case 22:
                if (!(obj instanceof List)) {
                    ij.k kVar34 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", "");
                    int i36 = fj.z0.f19465c;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        ij.k kVar35 = ij.m.f21341c;
                        Unit unit12 = Unit.f27471a;
                        int i37 = fj.z0.f19465c;
                    } else {
                        ij.k kVar36 = ij.m.f21341c;
                        Object obj24 = list12.get(0);
                        Intrinsics.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj24, (String) obj25, (String) list12.get(2)));
                        int i38 = fj.z0.f19465c;
                    }
                }
                break;
            case 23:
                if (!(obj instanceof List)) {
                    ij.k kVar37 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", "");
                    int i39 = fj.z0.f19465c;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        ij.k kVar38 = ij.m.f21341c;
                        Unit unit13 = Unit.f27471a;
                        int i40 = fj.z0.f19465c;
                    } else {
                        ij.k kVar39 = ij.m.f21341c;
                        Object obj26 = list13.get(0);
                        Intrinsics.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj26, (String) obj27, (String) list13.get(2)));
                        int i41 = fj.z0.f19465c;
                    }
                }
                break;
            case 24:
                if (!(obj instanceof List)) {
                    ij.k kVar40 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", "");
                    int i42 = fj.z0.f19465c;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        ij.k kVar41 = ij.m.f21341c;
                        Unit unit14 = Unit.f27471a;
                        int i43 = fj.z0.f19465c;
                    } else {
                        ij.k kVar42 = ij.m.f21341c;
                        Object obj28 = list14.get(0);
                        Intrinsics.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        Intrinsics.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj28, (String) obj29, (String) list14.get(2)));
                        int i44 = fj.z0.f19465c;
                    }
                }
                break;
            case 25:
                if (!(obj instanceof List)) {
                    ij.k kVar43 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", "");
                    int i45 = fj.z0.f19465c;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        ij.k kVar44 = ij.m.f21341c;
                        Unit unit15 = Unit.f27471a;
                        int i46 = fj.z0.f19465c;
                    } else {
                        ij.k kVar45 = ij.m.f21341c;
                        Object obj30 = list15.get(0);
                        Intrinsics.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        Intrinsics.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj30, (String) obj31, (String) list15.get(2)));
                        int i47 = fj.z0.f19465c;
                    }
                }
                break;
            case 26:
                if (!(obj instanceof List)) {
                    ij.k kVar46 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", "");
                    int i48 = fj.z0.f19465c;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        ij.k kVar47 = ij.m.f21341c;
                        Unit unit16 = Unit.f27471a;
                        int i49 = fj.z0.f19465c;
                    } else {
                        ij.k kVar48 = ij.m.f21341c;
                        Object obj32 = list16.get(0);
                        Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list16.get(1);
                        Intrinsics.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj32, (String) obj33, (String) list16.get(2)));
                        int i50 = fj.z0.f19465c;
                    }
                }
                break;
            case 27:
                if (!(obj instanceof List)) {
                    ij.k kVar49 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", "");
                    int i51 = fj.z0.f19465c;
                } else {
                    List list17 = (List) obj;
                    if (list17.size() <= 1) {
                        ij.k kVar50 = ij.m.f21341c;
                        Unit unit17 = Unit.f27471a;
                        int i52 = fj.z0.f19465c;
                    } else {
                        ij.k kVar51 = ij.m.f21341c;
                        Object obj34 = list17.get(0);
                        Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        Object obj35 = list17.get(1);
                        Intrinsics.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj34, (String) obj35, (String) list17.get(2)));
                        int i53 = fj.z0.f19465c;
                    }
                }
                break;
            case 28:
                if (!(obj instanceof List)) {
                    ij.k kVar52 = ij.m.f21341c;
                    om1.s("dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", "channelName", "channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", "");
                    int i54 = fj.z0.f19465c;
                } else {
                    List list18 = (List) obj;
                    if (list18.size() <= 1) {
                        ij.k kVar53 = ij.m.f21341c;
                        Unit unit18 = Unit.f27471a;
                        int i55 = fj.z0.f19465c;
                    } else {
                        ij.k kVar54 = ij.m.f21341c;
                        Object obj36 = list18.get(0);
                        Intrinsics.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list18.get(1);
                        Intrinsics.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        com.google.android.gms.internal.measurement.h5.s(new fj.a((String) obj36, (String) obj37, (String) list18.get(2)));
                        int i56 = fj.z0.f19465c;
                    }
                }
                break;
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // ii.b
    public void q(Object obj, h3.e reply) {
        List listF;
        List listF2;
        List listF3;
        List listF4;
        List listF5;
        List listF6;
        List listF7;
        List listF8;
        List listF9;
        List listF10;
        List listF11;
        switch (this.f16993b) {
            case 1:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.c(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
                    listF = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof fj.a) {
                        fj.a aVar = exception;
                        listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                    } else {
                        listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                    }
                }
                reply.i(listF);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                Intrinsics.c(obj3, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        listF2 = kotlin.collections.r.c(((Certificate) obj3).getEncoded());
                    } catch (CertificateEncodingException e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (Throwable exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof fj.a) {
                        fj.a aVar2 = exception2;
                        listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                    } else {
                        listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                    }
                }
                reply.i(listF2);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj4).onCustomViewHidden();
                    listF3 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception3) {
                    Intrinsics.checkNotNullParameter(exception3, "exception");
                    if (exception3 instanceof fj.a) {
                        fj.a aVar3 = exception3;
                        listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                    } else {
                        listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                    }
                }
                reply.i(listF3);
                return;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj5 = ((List) obj).get(0);
                Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebStorage");
                try {
                    ((WebStorage) obj5).deleteAllData();
                    listF11 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception4) {
                    Intrinsics.checkNotNullParameter(exception4, "exception");
                    if (exception4 instanceof fj.a) {
                        fj.a aVar4 = exception4;
                        listF11 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                    } else {
                        listF11 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                    }
                }
                reply.i(listF11);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj6 = list.get(0);
                Intrinsics.c(obj6, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj6;
                Object obj7 = list.get(1);
                Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj7;
                Object obj8 = list.get(2);
                Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj8).booleanValue();
                Object obj9 = list.get(3);
                Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, zBooleanValue, ((Boolean) obj9).booleanValue());
                    listF4 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception5) {
                    Intrinsics.checkNotNullParameter(exception5, "exception");
                    if (exception5 instanceof fj.a) {
                        fj.a aVar5 = exception5;
                        listF4 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                    } else {
                        listF4 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                    }
                }
                reply.i(listF4);
                return;
            case 7:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj10 = list2.get(0);
                Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj10;
                Object obj11 = list2.get(1);
                Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj11).toArray(new String[0]));
                    listF5 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception6) {
                    Intrinsics.checkNotNullParameter(exception6, "exception");
                    if (exception6 instanceof fj.a) {
                        fj.a aVar6 = exception6;
                        listF5 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                    } else {
                        listF5 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                    }
                }
                reply.i(listF5);
                return;
            case 8:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj12 = ((List) obj).get(0);
                Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj12).deny();
                    listF6 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception7) {
                    Intrinsics.checkNotNullParameter(exception7, "exception");
                    if (exception7 instanceof fj.a) {
                        fj.a aVar7 = exception7;
                        listF6 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                    } else {
                        listF6 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                    }
                }
                reply.i(listF6);
                return;
            case 9:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj13 = ((List) obj).get(0);
                Intrinsics.c(obj13, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj13).getPrimaryError();
                    listF7 = kotlin.collections.r.c(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? fj.n0.f19388j : fj.n0.f19386g : fj.n0.f19383d : fj.n0.i : fj.n0.f19385f : fj.n0.f19384e : fj.n0.f19387h);
                    break;
                } catch (Throwable exception8) {
                    Intrinsics.checkNotNullParameter(exception8, "exception");
                    if (exception8 instanceof fj.a) {
                        fj.a aVar8 = exception8;
                        listF7 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                    } else {
                        listF7 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                    }
                }
                reply.i(listF7);
                return;
            case 10:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj14 = ((List) obj).get(0);
                Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj14).cancel();
                    listF8 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception9) {
                    Intrinsics.checkNotNullParameter(exception9, "exception");
                    if (exception9 instanceof fj.a) {
                        fj.a aVar9 = exception9;
                        listF8 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                    } else {
                        listF8 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                    }
                }
                reply.i(listF8);
                return;
            case 11:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj15 = ((List) obj).get(0);
                Intrinsics.c(obj15, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj15).proceed();
                    listF9 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception10) {
                    Intrinsics.checkNotNullParameter(exception10, "exception");
                    if (exception10 instanceof fj.a) {
                        fj.a aVar10 = exception10;
                        listF9 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                    } else {
                        listF9 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                    }
                }
                reply.i(listF9);
                return;
            case 19:
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj16 = list3.get(0);
                Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                WebSettings webSettings = (WebSettings) obj16;
                Object obj17 = list3.get(1);
                Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    of.a(webSettings, ((Boolean) obj17).booleanValue());
                    listF10 = kotlin.collections.r.c(null);
                    break;
                } catch (Throwable exception11) {
                    Intrinsics.checkNotNullParameter(exception11, "exception");
                    if (exception11 instanceof fj.a) {
                        fj.a aVar11 = exception11;
                        listF10 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                    } else {
                        listF10 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                    }
                }
                reply.i(listF10);
                return;
        }
    }

    public /* synthetic */ bz(int i, Object obj) {
        this.f16993b = i;
    }
}
