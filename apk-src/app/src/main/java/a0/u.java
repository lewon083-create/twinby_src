package a0;

import android.os.Bundle;
import com.google.android.gms.internal.ads.rs;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static int a(int i) {
        for (int i10 : t.z.p(4)) {
            if (b(i10) == i) {
                return i10;
            }
        }
        throw new IllegalArgumentException(l7.o.i(i, "Invalid rotation degrees specified: "));
    }

    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 90;
        }
        if (i == 3) {
            return 180;
        }
        if (i == 4) {
            return 270;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "api-call";
            case 2:
                return "dynamite-enter";
            case 3:
                return "read-from-disk-start";
            case 4:
                return "read-from-disk-end";
            case 5:
                return "client-signals-start";
            case 6:
                return "client-signals-end";
            case 7:
                return "service-connected";
            case 8:
                return "gms-signals-start";
            case 9:
                return "gms-signals-end";
            case 10:
                return "get-signals-sdkcore-start";
            case 11:
                return "get-signals-sdkcore-end";
            case 12:
                return "get-ad-dictionary-sdkcore-start";
            case 13:
                return "get-ad-dictionary-sdkcore-end";
            case 14:
                return "http-response-ready";
            case 15:
                return "scar-preloader-ready";
            case 16:
                return "scar-preloader-processing-done";
            case 17:
                return "normalize-ad-response-start";
            case 18:
                return "normalize-ad-response-end";
            case 19:
                return "binder-call-start";
            case 20:
                return "server-response-parse-start";
            case 21:
                return "rendering-start";
            case 22:
                return "public-api-callback";
            case 23:
                return "rendering-native-ads-native-js-webview-start";
            case 24:
                return "rendering-native-ads-preprocess-start";
            case 25:
                return "rendering-native-ads-preprocess-end";
            case 26:
                return "rendering-native-assets-loading-start";
            case 27:
                return "rendering-native-assets-loading-end";
            case 28:
                return "rendering-webview-creation-start";
            case 29:
                return "rendering-webview-creation-end";
            case 30:
                return "rendering-ad-component-creation-end";
            case 31:
                return "rendering-configure-webview-start";
            case 32:
                return "rendering-configure-webview-end";
            case 33:
                return "rendering-webview-load-html-start";
            case 34:
                return "rendering-webview-load-html-end";
            case 35:
                return "type2-fetch-start";
            case 36:
                return "type2-fetch-end";
            case 37:
                return "sod-validation-start";
            case 38:
                return "sod-validation-end";
            case 39:
                return "sod-cache-key-start";
            case 40:
                return "sod-cache-key-end";
            case 41:
                return "sod-read-and-remove-start";
            case 42:
                return "sod-read-and-remove-end";
            case 43:
                return "sod-decode-start";
            case 44:
                return "sod-decode-end";
            case 45:
                return "native-assets-loading-basic-start";
            case 46:
                return "native-assets-loading-basic-end";
            case 47:
                return "native-assets-loading-image-start";
            case 48:
                return "native-assets-loading-image-end";
            case 49:
                return "native-assets-loading-image-composition-start";
            case 50:
                return "native-assets-loading-image-composition-end";
            case 51:
                return "native-assets-loading-logo-start";
            case 52:
                return "native-assets-loading-logo-end";
            case 53:
                return "native-assets-loading-icon-start";
            case 54:
                return "native-assets-loading-icon-end";
            case 55:
                return "native-assets-loading-attribution-start";
            case 56:
                return "native-assets-loading-attribution-end";
            case 57:
                return "native-assets-loading-video-start";
            case 58:
                return "native-assets-loading-video-end";
            case 59:
                return "native-assets-loading-video-composition-start";
            case 60:
                return "native-assets-loading-media-start";
            case 61:
                return "native-assets-loading-media-end";
            case 62:
                return "native-assets-loading-custom-start";
            case 63:
                return "native-assets-loading-custom-end";
            case 64:
                return "native-assets-loading-omid-start";
            case 65:
                return "native-assets-loading-omid-end";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "htmlDisplay";
        }
        if (i == 2) {
            return "nativeDisplay";
        }
        if (i == 3) {
            return RRWebVideoEvent.EVENT_TAG;
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "beginToRender";
        }
        if (i == 2) {
            return "definedByJavascript";
        }
        if (i == 3) {
            return "onePixel";
        }
        if (i == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static /* synthetic */ int f(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 1000;
        }
        throw null;
    }

    public static int g(int i, int i10, int i11) {
        return (Integer.hashCode(i) + i10) * i11;
    }

    public static int h(int i, int i10, int i11, int i12) {
        return ((i + i10) - i11) + i12;
    }

    public static int i(List list, int i, int i10) {
        return (list.hashCode() + i) * i10;
    }

    public static String j(int i, int i10, String str, String str2) {
        return str + i + str2 + i10;
    }

    public static String k(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String l(String str, Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, str);
        return th2.getClass().getSimpleName();
    }

    public static String m(StringBuilder sb2, Integer num, String str) {
        sb2.append(num);
        sb2.append(str);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, char c8) {
        sb2.append(str);
        sb2.append(c8);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, List list, char c8) {
        sb2.append(list);
        sb2.append(c8);
        return sb2.toString();
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void r(String str, String str2, String str3) {
        rs.r(str3, str2.concat(String.valueOf(str)));
    }

    public static void s(StringBuilder sb2, Boolean bool, String str, Boolean bool2, String str2) {
        sb2.append(bool);
        sb2.append(str);
        sb2.append(bool2);
        sb2.append(str2);
    }

    public static void t(StringBuilder sb2, String str, int i, String str2) {
        sb2.append(str);
        sb2.append(i);
        rs.r(str2, sb2.toString());
    }

    public static void u(ua.a aVar, Bundle bundle, String str) {
        aVar.getClass();
        bundle.putLong(str, System.currentTimeMillis());
    }

    public static /* synthetic */ String v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN";
    }

    public static /* synthetic */ String w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "RELEASED" : "STARTED" : "CONFIGURED";
    }

    public static /* synthetic */ String x(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }
}
