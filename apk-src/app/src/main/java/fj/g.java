package fj;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.measurement.h5;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends cj.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1.m f19348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a1.m registrar) {
        super(1);
        Intrinsics.checkNotNullParameter(registrar, "registrar");
        this.f19348b = registrar;
    }

    public static final void a(String str, Object obj, Throwable th2) {
        Log.w("PigeonProxyApiBaseCodec", "Failed to create new Dart proxy instance of " + str + ": " + obj + ". " + th2);
    }

    @Override // cj.n, ii.w
    public final Object readValueOfType(byte b2, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (b2 != -128) {
            return super.readValueOfType(b2, buffer);
        }
        Object value = readValue(buffer);
        Intrinsics.c(value, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) value).longValue();
        Object objF = ((c) this.f19348b.f363c).f(jLongValue);
        if (objF == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return objF;
    }

    @Override // cj.n, ii.w
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        a1.m pigeonRegistrar = this.f19348b;
        ii.f fVar = (ii.f) pigeonRegistrar.f362b;
        c cVar = (c) pigeonRegistrar.f363c;
        Intrinsics.checkNotNullParameter(stream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof r) || (obj instanceof j) || (obj instanceof w) || (obj instanceof n0) || (obj instanceof v) || (obj instanceof e1) || obj == null) {
            super.writeValue(stream, obj);
            return;
        }
        Object obj2 = null;
        if (obj instanceof WebResourceRequest) {
            Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
            WebResourceRequest pigeon_instanceArg = (WebResourceRequest) obj;
            f callback = new f(0, obj);
            Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (cVar.d(pigeon_instanceArg)) {
                ij.k kVar = ij.m.f21341c;
                callback.invoke(new ij.m(Unit.f27471a));
            } else {
                new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", pigeonRegistrar.m(), obj2).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg)), pigeon_instanceArg.getUrl().toString(), Boolean.valueOf(pigeon_instanceArg.isForMainFrame()), Boolean.valueOf(pigeon_instanceArg.isRedirect()), Boolean.valueOf(pigeon_instanceArg.hasGesture()), pigeon_instanceArg.getMethod(), pigeon_instanceArg.getRequestHeaders() == null ? Collections.EMPTY_MAP : pigeon_instanceArg.getRequestHeaders()), new b0(12, callback));
            }
        } else {
            int i = 13;
            if (obj instanceof WebResourceResponse) {
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                WebResourceResponse pigeon_instanceArg2 = (WebResourceResponse) obj;
                f callback2 = new f(2, obj);
                Intrinsics.checkNotNullParameter(pigeon_instanceArg2, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                if (cVar.d(pigeon_instanceArg2)) {
                    ij.k kVar2 = ij.m.f21341c;
                    callback2.invoke(new ij.m(Unit.f27471a));
                } else {
                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", pigeonRegistrar.m(), obj2).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg2)), Long.valueOf(pigeon_instanceArg2.getStatusCode())), new b0(i, callback2));
                }
            } else {
                int i10 = 11;
                if (obj instanceof WebResourceError) {
                    Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                    WebResourceError pigeon_instanceArg3 = (WebResourceError) obj;
                    f callback3 = new f(14, obj);
                    Intrinsics.checkNotNullParameter(pigeon_instanceArg3, "pigeon_instanceArg");
                    Intrinsics.checkNotNullParameter(callback3, "callback");
                    if (cVar.d(pigeon_instanceArg3)) {
                        ij.k kVar3 = ij.m.f21341c;
                        callback3.invoke(new ij.m(Unit.f27471a));
                    } else {
                        new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", pigeonRegistrar.m(), obj2).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg3)), Long.valueOf(pigeon_instanceArg3.getErrorCode()), pigeon_instanceArg3.getDescription().toString()), new b0(i10, callback3));
                    }
                } else if (obj instanceof b1) {
                    Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                    b1 pigeon_instanceArg4 = (b1) obj;
                    f callback4 = new f(15, obj);
                    Intrinsics.checkNotNullParameter(pigeon_instanceArg4, "pigeon_instanceArg");
                    Intrinsics.checkNotNullParameter(callback4, "callback");
                    if (cVar.d(pigeon_instanceArg4)) {
                        ij.k kVar4 = ij.m.f21341c;
                        callback4.invoke(new ij.m(Unit.f27471a));
                    } else {
                        new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", pigeonRegistrar.m(), obj2).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg4)), Long.valueOf(pigeon_instanceArg4.f19309a), Long.valueOf(pigeon_instanceArg4.f19310b)), new b0(20, callback4));
                    }
                } else {
                    int i11 = 3;
                    int i12 = 1;
                    if (obj instanceof ConsoleMessage) {
                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                        ConsoleMessage pigeon_instanceArg5 = (ConsoleMessage) obj;
                        f callback5 = new f(16, obj);
                        Intrinsics.checkNotNullParameter(pigeon_instanceArg5, "pigeon_instanceArg");
                        Intrinsics.checkNotNullParameter(callback5, "callback");
                        if (cVar.d(pigeon_instanceArg5)) {
                            ij.k kVar5 = ij.m.f21341c;
                            callback5.invoke(new ij.m(Unit.f27471a));
                        } else {
                            long jB = cVar.b(pigeon_instanceArg5);
                            long jLineNumber = pigeon_instanceArg5.lineNumber();
                            String strMessage = pigeon_instanceArg5.message();
                            int i13 = k.f19368a[pigeon_instanceArg5.messageLevel().ordinal()];
                            new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(jB), Long.valueOf(jLineNumber), strMessage, i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? i13 != 5 ? j.i : j.f19359d : j.f19360e : j.f19363h : j.f19361f : j.f19362g, pigeon_instanceArg5.sourceId()), new a0.a0(24, callback5));
                        }
                    } else {
                        int i14 = 25;
                        int i15 = 17;
                        if (obj instanceof CookieManager) {
                            Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                            CookieManager pigeon_instanceArg6 = (CookieManager) obj;
                            f callback6 = new f(17, obj);
                            Intrinsics.checkNotNullParameter(pigeon_instanceArg6, "pigeon_instanceArg");
                            Intrinsics.checkNotNullParameter(callback6, "callback");
                            if (cVar.d(pigeon_instanceArg6)) {
                                ij.k kVar6 = ij.m.f21341c;
                                callback6.invoke(new ij.m(Unit.f27471a));
                            } else {
                                new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg6))), new a0.a0(i14, callback6));
                            }
                        } else {
                            int i16 = 18;
                            if (obj instanceof WebView) {
                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                WebView pigeon_instanceArg7 = (WebView) obj;
                                f callback7 = new f(18, obj);
                                Intrinsics.checkNotNullParameter(pigeon_instanceArg7, "pigeon_instanceArg");
                                Intrinsics.checkNotNullParameter(callback7, "callback");
                                if (cVar.d(pigeon_instanceArg7)) {
                                    ij.k kVar7 = ij.m.f21341c;
                                    callback7.invoke(new ij.m(Unit.f27471a));
                                } else {
                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg7))), new b0(i15, callback7));
                                }
                            } else if (obj instanceof WebSettings) {
                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                WebSettings pigeon_instanceArg8 = (WebSettings) obj;
                                f callback8 = new f(19, obj);
                                Intrinsics.checkNotNullParameter(pigeon_instanceArg8, "pigeon_instanceArg");
                                Intrinsics.checkNotNullParameter(callback8, "callback");
                                if (cVar.d(pigeon_instanceArg8)) {
                                    ij.k kVar8 = ij.m.f21341c;
                                    callback8.invoke(new ij.m(Unit.f27471a));
                                } else {
                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg8))), new b0(14, callback8));
                                }
                            } else if (obj instanceof u) {
                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                u pigeon_instanceArg9 = (u) obj;
                                f callback9 = new f(20, obj);
                                Intrinsics.checkNotNullParameter(pigeon_instanceArg9, "pigeon_instanceArg");
                                Intrinsics.checkNotNullParameter(callback9, "callback");
                                if (cVar.d(pigeon_instanceArg9)) {
                                    ij.k kVar9 = ij.m.f21341c;
                                    callback9.invoke(new ij.m(Unit.f27471a));
                                } else {
                                    ij.k kVar10 = ij.m.f21341c;
                                    callback9.invoke(new ij.m(h5.s(new a("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", ""))));
                                }
                            } else if (obj instanceof WebViewClient) {
                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                WebViewClient pigeon_instanceArg10 = (WebViewClient) obj;
                                f callback10 = new f(11, obj);
                                Intrinsics.checkNotNullParameter(pigeon_instanceArg10, "pigeon_instanceArg");
                                Intrinsics.checkNotNullParameter(callback10, "callback");
                                if (cVar.d(pigeon_instanceArg10)) {
                                    ij.k kVar11 = ij.m.f21341c;
                                    callback10.invoke(new ij.m(Unit.f27471a));
                                } else {
                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg10))), new b0(i16, callback10));
                                }
                            } else if (obj instanceof DownloadListener) {
                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                DownloadListener pigeon_instanceArg11 = (DownloadListener) obj;
                                f callback11 = new f(21, obj);
                                Intrinsics.checkNotNullParameter(pigeon_instanceArg11, "pigeon_instanceArg");
                                Intrinsics.checkNotNullParameter(callback11, "callback");
                                if (cVar.d(pigeon_instanceArg11)) {
                                    ij.k kVar12 = ij.m.f21341c;
                                    callback11.invoke(new ij.m(Unit.f27471a));
                                } else {
                                    ij.k kVar13 = ij.m.f21341c;
                                    callback11.invoke(new ij.m(h5.s(new a("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", ""))));
                                }
                            } else {
                                int i17 = 22;
                                if (obj instanceof u0) {
                                    Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                    u0 pigeon_instanceArg12 = (u0) obj;
                                    f callback12 = new f(22, obj);
                                    Intrinsics.checkNotNullParameter(pigeon_instanceArg12, "pigeon_instanceArg");
                                    Intrinsics.checkNotNullParameter(callback12, "callback");
                                    if (cVar.d(pigeon_instanceArg12)) {
                                        ij.k kVar14 = ij.m.f21341c;
                                        callback12.invoke(new ij.m(Unit.f27471a));
                                    } else {
                                        ij.k kVar15 = ij.m.f21341c;
                                        callback12.invoke(new ij.m(h5.s(new a("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", ""))));
                                    }
                                } else {
                                    int i18 = 23;
                                    if (obj instanceof s) {
                                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                        s pigeon_instanceArg13 = (s) obj;
                                        f callback13 = new f(23, obj);
                                        Intrinsics.checkNotNullParameter(pigeon_instanceArg13, "pigeon_instanceArg");
                                        Intrinsics.checkNotNullParameter(callback13, "callback");
                                        if (cVar.d(pigeon_instanceArg13)) {
                                            ij.k kVar16 = ij.m.f21341c;
                                            callback13.invoke(new ij.m(Unit.f27471a));
                                        } else {
                                            new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg13))), new a0.a0(29, callback13));
                                        }
                                    } else if (obj instanceof WebStorage) {
                                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                        WebStorage pigeon_instanceArg14 = (WebStorage) obj;
                                        f callback14 = new f(24, obj);
                                        Intrinsics.checkNotNullParameter(pigeon_instanceArg14, "pigeon_instanceArg");
                                        Intrinsics.checkNotNullParameter(callback14, "callback");
                                        if (cVar.d(pigeon_instanceArg14)) {
                                            ij.k kVar17 = ij.m.f21341c;
                                            callback14.invoke(new ij.m(Unit.f27471a));
                                        } else {
                                            new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg14))), new b0(15, callback14));
                                        }
                                    } else if (obj instanceof WebChromeClient.FileChooserParams) {
                                        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                        WebChromeClient.FileChooserParams pigeon_instanceArg15 = (WebChromeClient.FileChooserParams) obj;
                                        f callback15 = new f(25, obj);
                                        Intrinsics.checkNotNullParameter(pigeon_instanceArg15, "pigeon_instanceArg");
                                        Intrinsics.checkNotNullParameter(callback15, "callback");
                                        if (cVar.d(pigeon_instanceArg15)) {
                                            ij.k kVar18 = ij.m.f21341c;
                                            callback15.invoke(new ij.m(Unit.f27471a));
                                        } else {
                                            long jB2 = cVar.b(pigeon_instanceArg15);
                                            boolean zIsCaptureEnabled = pigeon_instanceArg15.isCaptureEnabled();
                                            List listAsList = Arrays.asList(pigeon_instanceArg15.getAcceptTypes());
                                            int mode = pigeon_instanceArg15.getMode();
                                            new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(jB2), Boolean.valueOf(zIsCaptureEnabled), listAsList, mode != 0 ? mode != 1 ? mode != 3 ? r.f19409g : r.f19408f : r.f19407e : r.f19406d, pigeon_instanceArg15.getFilenameHint()), new a0.a0(28, callback15));
                                        }
                                    } else {
                                        int i19 = 26;
                                        if (obj instanceof PermissionRequest) {
                                            Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                            PermissionRequest pigeon_instanceArg16 = (PermissionRequest) obj;
                                            f callback16 = new f(26, obj);
                                            Intrinsics.checkNotNullParameter(pigeon_instanceArg16, "pigeon_instanceArg");
                                            Intrinsics.checkNotNullParameter(callback16, "callback");
                                            if (cVar.d(pigeon_instanceArg16)) {
                                                ij.k kVar19 = ij.m.f21341c;
                                                callback16.invoke(new ij.m(Unit.f27471a));
                                            } else {
                                                new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg16)), Arrays.asList(pigeon_instanceArg16.getResources())), new b0(i11, callback16));
                                            }
                                        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
                                            Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                            WebChromeClient.CustomViewCallback pigeon_instanceArg17 = (WebChromeClient.CustomViewCallback) obj;
                                            f callback17 = new f(27, obj);
                                            Intrinsics.checkNotNullParameter(pigeon_instanceArg17, "pigeon_instanceArg");
                                            Intrinsics.checkNotNullParameter(callback17, "callback");
                                            if (cVar.d(pigeon_instanceArg17)) {
                                                ij.k kVar20 = ij.m.f21341c;
                                                callback17.invoke(new ij.m(Unit.f27471a));
                                            } else {
                                                new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg17))), new a0.a0(i19, callback17));
                                            }
                                        } else {
                                            int i20 = 10;
                                            if (obj instanceof View) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                View pigeon_instanceArg18 = (View) obj;
                                                f callback18 = new f(28, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg18, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback18, "callback");
                                                if (cVar.d(pigeon_instanceArg18)) {
                                                    ij.k kVar21 = ij.m.f21341c;
                                                    callback18.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg18))), new b0(i20, callback18));
                                                }
                                            } else if (obj instanceof GeolocationPermissions.Callback) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                GeolocationPermissions.Callback pigeon_instanceArg19 = (GeolocationPermissions.Callback) obj;
                                                f callback19 = new f(1, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg19, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback19, "callback");
                                                if (cVar.d(pigeon_instanceArg19)) {
                                                    ij.k kVar22 = ij.m.f21341c;
                                                    callback19.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg19))), new b0(0, callback19));
                                                }
                                            } else if (obj instanceof HttpAuthHandler) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                HttpAuthHandler pigeon_instanceArg20 = (HttpAuthHandler) obj;
                                                f callback20 = new f(3, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg20, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback20, "callback");
                                                if (cVar.d(pigeon_instanceArg20)) {
                                                    ij.k kVar23 = ij.m.f21341c;
                                                    callback20.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg20))), new b0(i12, callback20));
                                                }
                                            } else if (obj instanceof Message) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                Message pigeon_instanceArg21 = (Message) obj;
                                                f callback21 = new f(4, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg21, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback21, "callback");
                                                if (cVar.d(pigeon_instanceArg21)) {
                                                    ij.k kVar24 = ij.m.f21341c;
                                                    callback21.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg21))), new a0.a0(21, callback21));
                                                }
                                            } else if (obj instanceof ClientCertRequest) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                ClientCertRequest pigeon_instanceArg22 = (ClientCertRequest) obj;
                                                f callback22 = new f(5, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg22, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback22, "callback");
                                                if (cVar.d(pigeon_instanceArg22)) {
                                                    ij.k kVar25 = ij.m.f21341c;
                                                    callback22.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg22))), new a0.a0(i18, callback22));
                                                }
                                            } else if (obj instanceof PrivateKey) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                PrivateKey pigeon_instanceArg23 = (PrivateKey) obj;
                                                f callback23 = new f(6, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg23, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback23, "callback");
                                                if (cVar.d(pigeon_instanceArg23)) {
                                                    ij.k kVar26 = ij.m.f21341c;
                                                    callback23.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg23))), new b0(4, callback23));
                                                }
                                            } else if (obj instanceof X509Certificate) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                X509Certificate pigeon_instanceArg24 = (X509Certificate) obj;
                                                f callback24 = new f(7, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg24, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback24, "callback");
                                                if (cVar.d(pigeon_instanceArg24)) {
                                                    ij.k kVar27 = ij.m.f21341c;
                                                    callback24.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg24))), new b0(21, callback24));
                                                }
                                            } else if (obj instanceof SslErrorHandler) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                SslErrorHandler pigeon_instanceArg25 = (SslErrorHandler) obj;
                                                f callback25 = new f(8, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg25, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback25, "callback");
                                                if (cVar.d(pigeon_instanceArg25)) {
                                                    ij.k kVar28 = ij.m.f21341c;
                                                    callback25.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg25))), new b0(9, callback25));
                                                }
                                            } else if (obj instanceof SslError) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                SslError pigeon_instanceArg26 = (SslError) obj;
                                                f callback26 = new f(9, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg26, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback26, "callback");
                                                if (cVar.d(pigeon_instanceArg26)) {
                                                    ij.k kVar29 = ij.m.f21341c;
                                                    callback26.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.s.f(Long.valueOf(cVar.b(pigeon_instanceArg26)), pigeon_instanceArg26.getCertificate(), pigeon_instanceArg26.getUrl()), new b0(7, callback26));
                                                }
                                            } else if (obj instanceof SslCertificate.DName) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                SslCertificate.DName pigeon_instanceArg27 = (SslCertificate.DName) obj;
                                                f callback27 = new f(10, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg27, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback27, "callback");
                                                if (cVar.d(pigeon_instanceArg27)) {
                                                    ij.k kVar30 = ij.m.f21341c;
                                                    callback27.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg27))), new b0(6, callback27));
                                                }
                                            } else if (obj instanceof SslCertificate) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                SslCertificate pigeon_instanceArg28 = (SslCertificate) obj;
                                                f callback28 = new f(12, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg28, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback28, "callback");
                                                if (cVar.d(pigeon_instanceArg28)) {
                                                    ij.k kVar31 = ij.m.f21341c;
                                                    callback28.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg28))), new b0(5, callback28));
                                                }
                                            } else if (obj instanceof Certificate) {
                                                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                                                Certificate pigeon_instanceArg29 = (Certificate) obj;
                                                f callback29 = new f(13, obj);
                                                Intrinsics.checkNotNullParameter(pigeon_instanceArg29, "pigeon_instanceArg");
                                                Intrinsics.checkNotNullParameter(callback29, "callback");
                                                if (cVar.d(pigeon_instanceArg29)) {
                                                    ij.k kVar32 = ij.m.f21341c;
                                                    callback29.invoke(new ij.m(Unit.f27471a));
                                                } else {
                                                    new s7.g(fVar, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", pigeonRegistrar.m(), (Object) null).K(kotlin.collections.r.c(Long.valueOf(cVar.b(pigeon_instanceArg29))), new a0.a0(i17, callback29));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (cVar.d(obj)) {
            stream.write(128);
            cVar.g();
            Long l10 = (Long) cVar.f19312b.get(new b(obj));
            if (l10 != null) {
                cVar.f19314d.put(l10, obj);
            }
            writeValue(stream, l10);
            return;
        }
        throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
    }
}
