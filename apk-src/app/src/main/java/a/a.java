package a;

import a0.g0;
import a0.u;
import a0.u1;
import a0.v;
import a1.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.view.ViewParent;
import android.webkit.ClientCertRequest;
import cj.n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.h5;
import com.google.firebase.messaging.y;
import com.vk.api.sdk.auth.VKAccessToken;
import g0.a3;
import g0.d0;
import g0.f0;
import g0.k;
import g0.l0;
import g0.w;
import g0.z;
import g2.n0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.collections.s;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.a0;
import m.e3;
import m.g3;
import m.x1;
import nc.d;
import nc.f;
import nc.g;
import nc.i;
import p2.h;
import pa.c0;
import t2.c;
import v2.b;
import ya.e;
import zk.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static y f9a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f10b;

    public static final String a(String str) {
        String string;
        if (str == null || (string = StringsKt.P(str).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public static HashMap b(VKAccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return j0.f(new Pair("token", accessToken.getAccessToken()), new Pair("userId", accessToken.getUserId().toString()), new Pair("created", Long.valueOf(accessToken.getCreated())), new Pair("email", accessToken.getEmail()), new Pair("isValid", Boolean.valueOf(accessToken.isValid())), new Pair("secret", accessToken.getSecret()));
    }

    public static e c(int i) {
        return i != 0 ? i != 1 ? new i() : new d() : new i();
    }

    public static final Object e(h hVar, Function2 function2, oj.i iVar) {
        return hVar.a(new c(function2, null, 1), iVar);
    }

    public static v g(g0.c primaryInfo, g0.c cVar) {
        Intrinsics.checkNotNullParameter(primaryInfo, "primaryInfo");
        String strE = cVar != null ? cVar.f19556a.e() : null;
        k kVar = ((g0.y) primaryInfo.f19524c).L;
        Intrinsics.checkNotNullExpressionValue(kVar, "getCompatibilityId(...)");
        String primaryCameraId = primaryInfo.f19556a.e();
        Intrinsics.checkNotNullExpressionValue(primaryCameraId, "getCameraId(...)");
        Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
        ArrayList cameraIds = s.g(primaryCameraId);
        if (strE != null) {
            cameraIds.add(strE);
        }
        Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
        return new v(cameraIds, kVar);
    }

    public static p h(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = p.f46432d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(pe.a.c('\"', "No subtype found for: \"", str).toString());
        }
        String strGroup = matcher.group(1);
        Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strGroup.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
        Intrinsics.checkNotNullExpressionValue(US, "US");
        Intrinsics.checkNotNullExpressionValue(strGroup2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = p.f46433e.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                throw new IllegalArgumentException(u.n(sb2, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (a0.n(strGroup4, "'", false) && a0.h(strGroup4, "'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new p(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    public static Drawable i(Context context, int i) {
        return x1.b().c(context, i);
    }

    public static long j(double d10) {
        h5.g("not a normal value", k(d10));
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean k(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public static p l(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return h(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static b m(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j10;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                j10 = -1;
                break;
            }
            int i11 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j10 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j10 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j10 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i12 = 0; i12 < j11; i12++) {
                int i13 = byteBufferDuplicate.getInt();
                long j12 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    byteBufferDuplicate.position((int) (j12 + j10));
                    b bVar = new b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f19839e = byteBufferDuplicate;
                    bVar.f19836b = iPosition;
                    int i14 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f19837c = i14;
                    bVar.f19838d = ((ByteBuffer) bVar.f19839e).getShort(i14);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void n(View view, g gVar) {
        hc.a aVar = gVar.f29225b.f29210b;
        if (aVar == null || !aVar.f20475a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            Field field = n0.f19900a;
            elevation += ((View) parent).getElevation();
        }
        f fVar = gVar.f29225b;
        if (fVar.f29219l != elevation) {
            fVar.f29219l = elevation;
            gVar.m();
        }
    }

    public static void o(Status status, Object obj, sb.g gVar) {
        if (status.c()) {
            gVar.b(obj);
        } else {
            gVar.a(c0.n(status));
        }
    }

    public static void p(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            e3.a(view, charSequence);
            return;
        }
        g3 g3Var = g3.f28212l;
        if (g3Var != null && g3Var.f28214b == view) {
            g3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new g3(view, charSequence);
            return;
        }
        g3 g3Var2 = g3.f28213m;
        if (g3Var2 != null && g3Var2.f28214b == view) {
            g3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void q(ii.f binaryMessenger, final fj.i iVar) {
        m mVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m nVar = (iVar == null || (mVar = iVar.f19355a) == null) ? new n(1) : mVar.m();
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", nVar, obj);
        if (iVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: fj.x
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i) {
                        case 0:
                            i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                iVar2.getClass();
                                clientCertRequest.cancel();
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
                            i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                iVar3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                iVar4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", nVar, obj);
        if (iVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: fj.x
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i10) {
                        case 0:
                            i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                iVar2.getClass();
                                clientCertRequest.cancel();
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
                            i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                iVar3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                iVar4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", nVar, obj);
        if (iVar == null) {
            gVar3.L(null);
        } else {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: fj.x
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i11) {
                        case 0:
                            i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                iVar2.getClass();
                                clientCertRequest.cancel();
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
                            i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                iVar3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                iVar4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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

    public static void r(ii.f binaryMessenger, final ni.c cVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = cVar != null ? cVar.f29359a.a() : new n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.QualitySelector.from", mVarA, obj);
        if (cVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.a1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    x0.p pVar;
                    List listF2;
                    List listF3;
                    int i10 = i;
                    c cVar2 = cVar;
                    Intrinsics.checkNotNullParameter(reply, "reply");
                    switch (i10) {
                        case 0:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var = (n1) obj4;
                            x0.c cVar3 = (x0.c) list.get(2);
                            try {
                                fj.c cVar4 = (fj.c) cVar2.f29359a.f6853d;
                                if (cVar3 == null) {
                                    x0.g gVarB = c.b(n1Var);
                                    x0.c cVar5 = x0.c.f35563c;
                                    f2.g.g(gVarB, "quality cannot be null");
                                    f2.g.g(cVar5, "fallbackStrategy cannot be null");
                                    f2.g.a("Invalid quality: " + gVarB, x0.g.f35590l.contains(gVarB));
                                    pVar = new x0.p(Collections.singletonList(gVarB), cVar5);
                                } else {
                                    x0.g gVarB2 = c.b(n1Var);
                                    f2.g.g(gVarB2, "quality cannot be null");
                                    f2.g.a("Invalid quality: " + gVarB2, x0.g.f35590l.contains(gVarB2));
                                    pVar = new x0.p(Collections.singletonList(gVarB2), cVar3);
                                }
                                cVar4.a(jLongValue, pVar);
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
                        case 1:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.camerax.VideoQuality>");
                            List list3 = (List) obj6;
                            x0.c cVar6 = (x0.c) list2.get(2);
                            try {
                                fj.c cVar7 = (fj.c) cVar2.f29359a.f6853d;
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(c.b((n1) it.next()));
                                }
                                cVar7.a(jLongValue2, cVar6 == null ? x0.p.a(arrayList, x0.c.f35563c) : x0.p.a(arrayList, cVar6));
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
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.CameraInfo");
                            g0.d0 d0Var = (g0.d0) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var2 = (n1) obj8;
                            try {
                                cVar2.getClass();
                                x0.g gVarB3 = c.b(n1Var2);
                                f2.g.a("Invalid quality: " + gVarB3, x0.g.f35590l.contains(gVarB3));
                                Set set = x0.b0.f35519m0;
                                x0.l lVarE = new x0.c0(d0Var, 1).e(a0.i0.f112d);
                                z0.a aVarA = lVarE == null ? null : lVarE.a(gVarB3);
                                listF3 = kotlin.collections.r.c(aVarA != null ? aVarA.f45781f.a() : null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar4 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
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
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.QualitySelector.fromOrderedList", mVarA, obj);
        if (cVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.a1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    x0.p pVar;
                    List listF2;
                    List listF3;
                    int i102 = i10;
                    c cVar2 = cVar;
                    Intrinsics.checkNotNullParameter(reply, "reply");
                    switch (i102) {
                        case 0:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var = (n1) obj4;
                            x0.c cVar3 = (x0.c) list.get(2);
                            try {
                                fj.c cVar4 = (fj.c) cVar2.f29359a.f6853d;
                                if (cVar3 == null) {
                                    x0.g gVarB = c.b(n1Var);
                                    x0.c cVar5 = x0.c.f35563c;
                                    f2.g.g(gVarB, "quality cannot be null");
                                    f2.g.g(cVar5, "fallbackStrategy cannot be null");
                                    f2.g.a("Invalid quality: " + gVarB, x0.g.f35590l.contains(gVarB));
                                    pVar = new x0.p(Collections.singletonList(gVarB), cVar5);
                                } else {
                                    x0.g gVarB2 = c.b(n1Var);
                                    f2.g.g(gVarB2, "quality cannot be null");
                                    f2.g.a("Invalid quality: " + gVarB2, x0.g.f35590l.contains(gVarB2));
                                    pVar = new x0.p(Collections.singletonList(gVarB2), cVar3);
                                }
                                cVar4.a(jLongValue, pVar);
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
                        case 1:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.camerax.VideoQuality>");
                            List list3 = (List) obj6;
                            x0.c cVar6 = (x0.c) list2.get(2);
                            try {
                                fj.c cVar7 = (fj.c) cVar2.f29359a.f6853d;
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(c.b((n1) it.next()));
                                }
                                cVar7.a(jLongValue2, cVar6 == null ? x0.p.a(arrayList, x0.c.f35563c) : x0.p.a(arrayList, cVar6));
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
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.CameraInfo");
                            g0.d0 d0Var = (g0.d0) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var2 = (n1) obj8;
                            try {
                                cVar2.getClass();
                                x0.g gVarB3 = c.b(n1Var2);
                                f2.g.a("Invalid quality: " + gVarB3, x0.g.f35590l.contains(gVarB3));
                                Set set = x0.b0.f35519m0;
                                x0.l lVarE = new x0.c0(d0Var, 1).e(a0.i0.f112d);
                                z0.a aVarA = lVarE == null ? null : lVarE.a(gVarB3);
                                listF3 = kotlin.collections.r.c(aVarA != null ? aVarA.f45781f.a() : null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar4 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
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
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.QualitySelector.getResolution", mVarA, obj);
        if (cVar == null) {
            gVar3.L(null);
        } else {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.a1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    x0.p pVar;
                    List listF2;
                    List listF3;
                    int i102 = i11;
                    c cVar2 = cVar;
                    Intrinsics.checkNotNullParameter(reply, "reply");
                    switch (i102) {
                        case 0:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var = (n1) obj4;
                            x0.c cVar3 = (x0.c) list.get(2);
                            try {
                                fj.c cVar4 = (fj.c) cVar2.f29359a.f6853d;
                                if (cVar3 == null) {
                                    x0.g gVarB = c.b(n1Var);
                                    x0.c cVar5 = x0.c.f35563c;
                                    f2.g.g(gVarB, "quality cannot be null");
                                    f2.g.g(cVar5, "fallbackStrategy cannot be null");
                                    f2.g.a("Invalid quality: " + gVarB, x0.g.f35590l.contains(gVarB));
                                    pVar = new x0.p(Collections.singletonList(gVarB), cVar5);
                                } else {
                                    x0.g gVarB2 = c.b(n1Var);
                                    f2.g.g(gVarB2, "quality cannot be null");
                                    f2.g.a("Invalid quality: " + gVarB2, x0.g.f35590l.contains(gVarB2));
                                    pVar = new x0.p(Collections.singletonList(gVarB2), cVar3);
                                }
                                cVar4.a(jLongValue, pVar);
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
                        case 1:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.camerax.VideoQuality>");
                            List list3 = (List) obj6;
                            x0.c cVar6 = (x0.c) list2.get(2);
                            try {
                                fj.c cVar7 = (fj.c) cVar2.f29359a.f6853d;
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(c.b((n1) it.next()));
                                }
                                cVar7.a(jLongValue2, cVar6 == null ? x0.p.a(arrayList, x0.c.f35563c) : x0.p.a(arrayList, cVar6));
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
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj7 = list4.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.CameraInfo");
                            g0.d0 d0Var = (g0.d0) obj7;
                            Object obj8 = list4.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var2 = (n1) obj8;
                            try {
                                cVar2.getClass();
                                x0.g gVarB3 = c.b(n1Var2);
                                f2.g.a("Invalid quality: " + gVarB3, x0.g.f35590l.contains(gVarB3));
                                Set set = x0.b0.f35519m0;
                                x0.l lVarE = new x0.c0(d0Var, 1).e(a0.i0.f112d);
                                z0.a aVarA = lVarE == null ? null : lVarE.a(gVarB3);
                                listF3 = kotlin.collections.r.c(aVarA != null ? aVarA.f45781f.a() : null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar4 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
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

    public static final void s(d0 cameraInfoInternal, u1 sessionConfig, c0.c cVar) {
        l0.b bVarR;
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        y yVar = f9a;
        if (yVar == null) {
            throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
        }
        String cameraId = cameraInfoInternal.e();
        Intrinsics.checkNotNullExpressionValue(cameraId, "getCameraId(...)");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        f0 f0VarB = ((l0) yVar.f14899b).b(cameraId);
        Intrinsics.checkNotNullExpressionValue(f0VarB, "getCamera(...)");
        g0.c cVar2 = new g0.c(f0VarB.p(), z.f19810a);
        g0 g0Var = g0.f85e;
        l0.f fVar = new l0.f(f0VarB, null, cVar2, null, g0Var, g0Var, (y.a) yVar.f14900c, (h3.e) yVar.f14902e, (a3) yVar.f14901d);
        synchronized (fVar.f27730l) {
        }
        List list = (List) sessionConfig.f227c;
        synchronized (fVar.f27730l) {
            fVar.i = list;
        }
        synchronized (fVar.f27730l) {
        }
        Range range = (Range) sessionConfig.f230f;
        synchronized (fVar.f27730l) {
            fVar.f27728j = range;
        }
        List list2 = (List) sessionConfig.f229e;
        com.google.android.gms.internal.auth.g.e("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list2 + ", featureGroup = " + cVar);
        synchronized (fVar.f27730l) {
            g0.d dVar = fVar.f27721b;
            w wVar = fVar.f27729k;
            dVar.q(wVar);
            g0.d dVar2 = fVar.f27722c;
            if (dVar2 != null) {
                dVar2.q(wVar);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(fVar.f27725f);
            linkedHashSet.addAll(list2);
            HashMap mapE = l0.f.e(linkedHashSet, cVar);
            try {
                try {
                    bVarR = fVar.r(linkedHashSet, fVar.f27722c != null);
                    l0.f.B(mapE);
                } catch (IllegalArgumentException e3) {
                    throw new l0.d(e3);
                }
            } catch (Throwable th2) {
                l0.f.B(mapE);
                throw th2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(bVarR, "simulateAddUseCases(...)");
    }

    public static ArrayList t(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public abstract String d(byte[] bArr, int i, int i10);

    public abstract int f(int i, int i10, String str, byte[] bArr);
}
