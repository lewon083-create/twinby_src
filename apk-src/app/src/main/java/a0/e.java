package a0;

import android.media.ImageReader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.i4;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.ViewHierarchyNode;
import java.io.Serializable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f65a = true;

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final String b(Object[] objArr, int i, int i10, kotlin.collections.h hVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i + i11];
            if (obj == hVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static void c(StringBuilder sb2, String key) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sb2.append('\"');
        int length = key.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = key.charAt(i);
            if (cCharAt == '\n') {
                sb2.append("%0A");
            } else if (cCharAt == '\r') {
                sb2.append("%0D");
            } else if (cCharAt == '\"') {
                sb2.append("%22");
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append('\"');
    }

    public static String d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "null";
        }
        int iPosition = byteBuffer.position();
        try {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < iRemaining; i++) {
                sb2.append(String.format("%02X ", Byte.valueOf(bArr[i])));
            }
            return sb2.toString().trim();
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static i4 e(int i, int i10, int i11, int i12) {
        return new i4(ImageReader.newInstance(i, i10, i11, i12));
    }

    public static int f(int i, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i / i10;
        int i12 = i - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i ^ i10) >> 31) | 1;
        switch (cd.d.f2267a[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.auth.m.d(i12 == 0);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i12);
                int iAbs2 = iAbs - (Math.abs(i10) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i11;
                }
                if (iAbs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static p3.l g(int i) {
        String str = m3.z.f28608a;
        Locale locale = Locale.US;
        return new p3.l(Uri.parse("rtp://0.0.0.0:" + i), 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
    }

    public static final Object h(t2.b bVar, t2.e key, Serializable serializable) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object objC = bVar.c(key);
        return objC == null ? serializable : objC;
    }

    public static int i(int i, int i10, boolean z5) {
        int i11 = z5 ? ((i10 - i) + 360) % 360 : (i10 + i) % 360;
        if (com.google.android.gms.internal.auth.g.y(2, com.google.android.gms.internal.auth.g.L("CameraOrientationUtil"))) {
            StringBuilder sbI = t.z.i("getRelativeImageRotation: destRotationDegrees=", i, ", sourceRotationDegrees=", i10, ", isOppositeFacing=");
            sbI.append(z5);
            sbI.append(", result=");
            sbI.append(i11);
            com.google.android.gms.internal.auth.g.e("CameraOrientationUtil", sbI.toString());
        }
        return i11;
    }

    public static com.google.firebase.messaging.x j(Map map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("to");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        Bundle bundle = new Bundle();
        h1.e eVar = new h1.e(0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid to: ".concat(str));
        }
        bundle.putString("google.to", str);
        String str2 = (String) map2.get("collapseKey");
        String str3 = (String) map2.get("messageId");
        String str4 = (String) map2.get("messageType");
        Integer num = (Integer) map2.get("ttl");
        Map map3 = (Map) map2.get("data");
        if (str2 != null) {
            bundle.putString("collapse_key", str2);
        }
        if (str4 != null) {
            bundle.putString("message_type", str4);
        }
        if (str3 != null) {
            bundle.putString("google.message_id", str3);
        }
        if (num != null) {
            bundle.putString("google.ttl", String.valueOf(num.intValue()));
        }
        if (map3 != null) {
            eVar.clear();
            eVar.putAll(map3);
        }
        Bundle bundle2 = new Bundle();
        Iterator it = ((androidx.datastore.preferences.protobuf.h1) eVar.entrySet()).iterator();
        while (true) {
            h1.c cVar = (h1.c) it;
            if (!cVar.hasNext()) {
                bundle2.putAll(bundle);
                bundle.remove("from");
                return new com.google.firebase.messaging.x(bundle2);
            }
            cVar.next();
            h1.c cVar2 = cVar;
            bundle2.putString((String) cVar2.getKey(), (String) cVar2.getValue());
        }
    }

    public static g2.t k(Display display, int i) {
        RoundedCorner roundedCorner;
        int i10;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i10 = 1;
            if (position != 1) {
                i10 = 2;
                if (position != 2) {
                    i10 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(l7.o.i(position, "Invalid position: "));
                    }
                }
            }
        } else {
            i10 = 0;
        }
        return new g2.t(i10, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static int l(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            throw new IllegalArgumentException(u.k(i, "x (", ") must be > 0"));
        }
        switch (cd.d.f2267a[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.auth.m.d((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static String m(long j10) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        long millis2 = millis - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis2 - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static HashMap n(com.google.firebase.messaging.x xVar) {
        int iIntValue;
        long jLongValue;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        String string = xVar.f14895b.getString("collapse_key");
        Bundle bundle = xVar.f14895b;
        if (string != null) {
            map.put("collapseKey", bundle.getString("collapse_key"));
        }
        if (bundle.getString("from") != null) {
            map.put("from", bundle.getString("from"));
        }
        if (bundle.getString("google.to") != null) {
            map.put("to", bundle.getString("google.to"));
        }
        if (xVar.e() != null) {
            map.put("messageId", xVar.e());
        }
        if (bundle.getString("message_type") != null) {
            map.put("messageType", bundle.getString("message_type"));
        }
        if (!((h1.i) xVar.c()).isEmpty()) {
            for (Map.Entry entry : ((h1.e) xVar.c()).entrySet()) {
                map2.put((String) entry.getKey(), entry.getValue());
            }
        }
        map.put("data", map2);
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            iIntValue = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                iIntValue = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        map.put("ttl", Integer.valueOf(iIntValue));
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            jLongValue = ((Long) obj2).longValue();
        } else if (obj2 instanceof String) {
            try {
                jLongValue = Long.parseLong((String) obj2);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + obj2);
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        map.put("sentTime", Long.valueOf(jLongValue));
        if (xVar.f() != null) {
            com.google.firebase.messaging.w wVarF = xVar.f();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            String str = wVarF.f14878a;
            String str2 = wVarF.f14885h;
            if (str != null) {
                map3.put("title", str);
            }
            String str3 = wVarF.f14879b;
            if (str3 != null) {
                map3.put("titleLocKey", str3);
            }
            String[] strArr = wVarF.f14880c;
            if (strArr != null) {
                map3.put("titleLocArgs", Arrays.asList(strArr));
            }
            String str4 = wVarF.f14881d;
            if (str4 != null) {
                map3.put(SentryLogEvent.JsonKeys.BODY, str4);
            }
            String str5 = wVarF.f14882e;
            if (str5 != null) {
                map3.put("bodyLocKey", str5);
            }
            String[] strArr2 = wVarF.f14883f;
            if (strArr2 != null) {
                map3.put("bodyLocArgs", Arrays.asList(strArr2));
            }
            String str6 = wVarF.f14889m;
            if (str6 != null) {
                map4.put("channelId", str6);
            }
            String str7 = wVarF.f14888l;
            if (str7 != null) {
                map4.put("clickAction", str7);
            }
            String str8 = wVarF.f14887k;
            if (str8 != null) {
                map4.put("color", str8);
            }
            String str9 = wVarF.f14884g;
            if (str9 != null) {
                map4.put("smallIcon", str9);
            }
            if ((str2 != null ? Uri.parse(str2) : null) != null) {
                map4.put("imageUrl", (str2 != null ? Uri.parse(str2) : null).toString());
            }
            Uri uri = wVarF.f14890n;
            if (uri != null) {
                map4.put("link", uri.toString());
            }
            Integer num = wVarF.f14894r;
            if (num != null) {
                map4.put("count", num);
            }
            Integer num2 = wVarF.f14892p;
            if (num2 != null) {
                map4.put("priority", num2);
            }
            String str10 = wVarF.i;
            if (str10 != null) {
                map4.put("sound", str10);
            }
            String str11 = wVarF.f14891o;
            if (str11 != null) {
                map4.put("ticker", str11);
            }
            Integer num3 = wVarF.f14893q;
            if (num3 != null) {
                map4.put(ViewHierarchyNode.JsonKeys.VISIBILITY, num3);
            }
            String str12 = wVarF.f14886j;
            if (str12 != null) {
                map4.put("tag", str12);
            }
            map3.put("android", map4);
            map.put("notification", map3);
        }
        return map;
    }

    public static Uri o(Uri uri) {
        if (!uri.isHierarchical() || uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static final void p(Object[] objArr, int i, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i < i10) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i] = null;
            i++;
        }
    }

    public static t5.f q(t5.f fVar, String[] strArr, Map map) {
        int i = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (t5.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                t5.f fVar2 = new t5.f();
                int length = strArr.length;
                while (i < length) {
                    fVar2.a((t5.f) map.get(strArr[i]));
                    i++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((t5.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    fVar.a((t5.f) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return fVar;
    }

    public static void r(ii.f binaryMessenger, final fj.c cVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ij.p pVar = ni.t.f29485b;
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.PigeonInternalInstanceManager.removeStrongReference", (ii.m) pVar.getValue(), obj);
        if (cVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.s
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    switch (i) {
                        case 0:
                            fj.c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l10 = (Long) obj3;
                            try {
                                cVar2.g();
                                cVar2.f19314d.remove(l10);
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar2 = exception;
                                    listF = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        default:
                            fj.c cVar3 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                cVar3.f19312b.clear();
                                cVar3.f19313c.clear();
                                cVar3.f19314d.clear();
                                cVar3.f19316f.clear();
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar3 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.PigeonInternalInstanceManager.clear", (ii.m) pVar.getValue(), obj);
        if (cVar == null) {
            gVar2.L(null);
        } else {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.s
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    switch (i10) {
                        case 0:
                            fj.c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l10 = (Long) obj3;
                            try {
                                cVar2.g();
                                cVar2.f19314d.remove(l10);
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar2 = exception;
                                    listF = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        default:
                            fj.c cVar3 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                cVar3.f19312b.clear();
                                cVar3.f19313c.clear();
                                cVar3.f19314d.clear();
                                cVar3.f19316f.clear();
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar3 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                    }
                }
            });
        }
    }

    public static void s(ii.f binaryMessenger, final fj.m mVar) {
        a1.m mVar2;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m nVar = (mVar == null || (mVar2 = mVar.f19374a) == null) ? new cj.n(1) : mVar2.m();
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", nVar, obj);
        if (mVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: fj.y
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i) {
                        case 0:
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) mVar3.f19374a.f363c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                mVar4.getClass();
                                cookieManager.setCookie(str, str2);
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            z zVar = new z(reply, 0);
                            mVar.getClass();
                            ((CookieManager) obj7).removeAllCookies(new l(zVar, 0));
                            break;
                        default:
                            m mVar5 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                mVar5.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", nVar, obj);
        if (mVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: fj.y
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i10) {
                        case 0:
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) mVar3.f19374a.f363c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                mVar4.getClass();
                                cookieManager.setCookie(str, str2);
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            z zVar = new z(reply, 0);
                            mVar.getClass();
                            ((CookieManager) obj7).removeAllCookies(new l(zVar, 0));
                            break;
                        default:
                            m mVar5 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                mVar5.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", nVar, obj);
        if (mVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: fj.y
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i11) {
                        case 0:
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) mVar3.f19374a.f363c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                mVar4.getClass();
                                cookieManager.setCookie(str, str2);
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            z zVar = new z(reply, 0);
                            mVar.getClass();
                            ((CookieManager) obj7).removeAllCookies(new l(zVar, 0));
                            break;
                        default:
                            m mVar5 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                mVar5.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", nVar, obj);
        if (mVar == null) {
            gVar4.L(null);
        } else {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: fj.y
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i12) {
                        case 0:
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) mVar3.f19374a.f363c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                mVar4.getClass();
                                cookieManager.setCookie(str, str2);
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            z zVar = new z(reply, 0);
                            mVar.getClass();
                            ((CookieManager) obj7).removeAllCookies(new l(zVar, 0));
                            break;
                        default:
                            m mVar5 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                mVar5.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                    }
                }
            });
        }
    }

    public static void t(ii.f binaryMessenger, final ni.f fVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = fVar != null ? fVar.f29389a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Recorder.pigeon_defaultConstructor", mVarA, obj);
        if (fVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.b1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar2.f29389a.f6853d).a(((Long) obj3).longValue(), f.a((Long) list.get(1), (Long) list.get(2), (x0.p) list.get(3)));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            f fVar3 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var = (x0.b0) obj4;
                            try {
                                fVar3.getClass();
                                listF2 = kotlin.collections.r.c(Long.valueOf(((x0.e) x0.b0.l(b0Var.E)).f35578a.f35631d));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var2 = (x0.b0) obj5;
                            try {
                                fVar4.getClass();
                                listF3 = kotlin.collections.r.c(Long.valueOf(((Integer) ((x0.e) x0.b0.l(b0Var2.E)).f35578a.f35630c.getLower()).intValue()));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var3 = (x0.b0) obj6;
                            try {
                                fVar5.getClass();
                                listF4 = kotlin.collections.r.c(((x0.e) x0.b0.l(b0Var3.E)).f35578a.f35628a);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        default:
                            f fVar6 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var4 = (x0.b0) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF5 = kotlin.collections.r.c(fVar6.h(b0Var4, (String) obj8));
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Recorder.getAspectRatio", mVarA, obj);
        if (fVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.b1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i10) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar2.f29389a.f6853d).a(((Long) obj3).longValue(), f.a((Long) list.get(1), (Long) list.get(2), (x0.p) list.get(3)));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            f fVar3 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var = (x0.b0) obj4;
                            try {
                                fVar3.getClass();
                                listF2 = kotlin.collections.r.c(Long.valueOf(((x0.e) x0.b0.l(b0Var.E)).f35578a.f35631d));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var2 = (x0.b0) obj5;
                            try {
                                fVar4.getClass();
                                listF3 = kotlin.collections.r.c(Long.valueOf(((Integer) ((x0.e) x0.b0.l(b0Var2.E)).f35578a.f35630c.getLower()).intValue()));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var3 = (x0.b0) obj6;
                            try {
                                fVar5.getClass();
                                listF4 = kotlin.collections.r.c(((x0.e) x0.b0.l(b0Var3.E)).f35578a.f35628a);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        default:
                            f fVar6 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var4 = (x0.b0) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF5 = kotlin.collections.r.c(fVar6.h(b0Var4, (String) obj8));
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Recorder.getTargetVideoEncodingBitRate", mVarA, obj);
        if (fVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.b1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i11) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar2.f29389a.f6853d).a(((Long) obj3).longValue(), f.a((Long) list.get(1), (Long) list.get(2), (x0.p) list.get(3)));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            f fVar3 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var = (x0.b0) obj4;
                            try {
                                fVar3.getClass();
                                listF2 = kotlin.collections.r.c(Long.valueOf(((x0.e) x0.b0.l(b0Var.E)).f35578a.f35631d));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var2 = (x0.b0) obj5;
                            try {
                                fVar4.getClass();
                                listF3 = kotlin.collections.r.c(Long.valueOf(((Integer) ((x0.e) x0.b0.l(b0Var2.E)).f35578a.f35630c.getLower()).intValue()));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var3 = (x0.b0) obj6;
                            try {
                                fVar5.getClass();
                                listF4 = kotlin.collections.r.c(((x0.e) x0.b0.l(b0Var3.E)).f35578a.f35628a);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        default:
                            f fVar6 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var4 = (x0.b0) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF5 = kotlin.collections.r.c(fVar6.h(b0Var4, (String) obj8));
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Recorder.getQualitySelector", mVarA, obj);
        if (fVar != null) {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: ni.b1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i12) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar2.f29389a.f6853d).a(((Long) obj3).longValue(), f.a((Long) list.get(1), (Long) list.get(2), (x0.p) list.get(3)));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            f fVar3 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var = (x0.b0) obj4;
                            try {
                                fVar3.getClass();
                                listF2 = kotlin.collections.r.c(Long.valueOf(((x0.e) x0.b0.l(b0Var.E)).f35578a.f35631d));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var2 = (x0.b0) obj5;
                            try {
                                fVar4.getClass();
                                listF3 = kotlin.collections.r.c(Long.valueOf(((Integer) ((x0.e) x0.b0.l(b0Var2.E)).f35578a.f35630c.getLower()).intValue()));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var3 = (x0.b0) obj6;
                            try {
                                fVar5.getClass();
                                listF4 = kotlin.collections.r.c(((x0.e) x0.b0.l(b0Var3.E)).f35578a.f35628a);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        default:
                            f fVar6 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var4 = (x0.b0) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF5 = kotlin.collections.r.c(fVar6.h(b0Var4, (String) obj8));
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Recorder.prepareRecording", mVarA, obj);
        if (fVar == null) {
            gVar5.L(null);
        } else {
            final int i13 = 4;
            gVar5.L(new ii.b() { // from class: ni.b1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i13) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar2.f29389a.f6853d).a(((Long) obj3).longValue(), f.a((Long) list.get(1), (Long) list.get(2), (x0.p) list.get(3)));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            f fVar3 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var = (x0.b0) obj4;
                            try {
                                fVar3.getClass();
                                listF2 = kotlin.collections.r.c(Long.valueOf(((x0.e) x0.b0.l(b0Var.E)).f35578a.f35631d));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var2 = (x0.b0) obj5;
                            try {
                                fVar4.getClass();
                                listF3 = kotlin.collections.r.c(Long.valueOf(((Integer) ((x0.e) x0.b0.l(b0Var2.E)).f35578a.f35630c.getLower()).intValue()));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var3 = (x0.b0) obj6;
                            try {
                                fVar5.getClass();
                                listF4 = kotlin.collections.r.c(((x0.e) x0.b0.l(b0Var3.E)).f35578a.f35628a);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        default:
                            f fVar6 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.video.Recorder");
                            x0.b0 b0Var4 = (x0.b0) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listF5 = kotlin.collections.r.c(fVar6.h(b0Var4, (String) obj8));
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                    }
                }
            });
        }
    }

    public static void u(ViewGroup viewGroup, boolean z5) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z5);
        } else if (f65a) {
            try {
                viewGroup.suppressLayout(z5);
            } catch (NoSuchMethodError unused) {
                f65a = false;
            }
        }
    }

    public static int v(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(l7.o.i(i, "Unsupported surface rotation: "));
    }

    public static ArrayList w(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        if (th2 instanceof wi.d) {
            wi.d dVar = (wi.d) th2;
            arrayList.add(dVar.f35261b);
            arrayList.add(dVar.getMessage());
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public static int x(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long y(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }
}
