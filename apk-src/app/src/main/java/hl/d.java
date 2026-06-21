package hl;

import a0.c0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.auth.g0;
import com.google.android.gms.internal.auth.k1;
import com.google.android.gms.internal.auth.l0;
import com.google.android.gms.internal.auth.m0;
import com.google.android.gms.internal.auth.n1;
import com.google.android.gms.internal.auth.p0;
import com.google.android.gms.internal.measurement.h5;
import com.yandex.varioqub.config.model.ConfigValue;
import fj.t;
import g0.a1;
import g0.s0;
import g0.u1;
import g0.v;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l7.o;
import t.z;
import uk.a0;
import vk.q;
import vk.w;
import vk.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static d1.d A(Range range, int i, int i10, int i11, Rational rational) {
        int iC;
        int iB;
        if (rational == null) {
            iC = C(range, i10, i11, i);
        } else {
            Range rangeCreate = x0.a.f35500g;
            if (!range.equals(rangeCreate)) {
                rangeCreate = Range.create(Integer.valueOf(l.s(((Integer) range.getLower()).intValue(), rational)), Integer.valueOf(l.s(((Integer) range.getUpper()).intValue(), rational)));
            }
            iC = C(rangeCreate, i10, i11, l.s(i, rational));
            if (!l.l(rational)) {
                iB = yj.b.b(iC / rational.floatValue());
                Locale locale = Locale.ENGLISH;
                StringBuilder sbI = z.i("Resolved capture/encode sample rate ", iC, "Hz/", iB, "Hz, [target sample rate range: ");
                sbI.append(range);
                sbI.append(", target sample rate: ");
                sbI.append(i);
                sbI.append(", channel count: ");
                om1.t(sbI, i10, ", source format: ", i11, ", capture to encode sample rate ratio: ");
                sbI.append(rational);
                sbI.append("]");
                com.google.android.gms.internal.auth.g.e("AudioConfigUtil", sbI.toString());
                return new d1.d(iC, iB);
            }
            com.google.android.gms.internal.auth.g.O("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
        }
        iB = iC;
        Locale locale2 = Locale.ENGLISH;
        StringBuilder sbI2 = z.i("Resolved capture/encode sample rate ", iC, "Hz/", iB, "Hz, [target sample rate range: ");
        sbI2.append(range);
        sbI2.append(", target sample rate: ");
        sbI2.append(i);
        sbI2.append(", channel count: ");
        om1.t(sbI2, i10, ", source format: ", i11, ", capture to encode sample rate ratio: ");
        sbI2.append(rational);
        sbI2.append("]");
        com.google.android.gms.internal.auth.g.e("AudioConfigUtil", sbI2.toString());
        return new d1.d(iC, iB);
    }

    public static int B(int i, int i10, int i11, int i12, int i13, Range range) {
        Rational rational = new Rational(i10, i11);
        int iDoubleValue = (int) (new Rational(i12, i13).doubleValue() * rational.doubleValue() * ((double) i));
        String strConcat = com.google.android.gms.internal.auth.g.v("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(iDoubleValue)) : "";
        if (!x0.a.f35499f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (com.google.android.gms.internal.auth.g.v("AudioConfigUtil")) {
                strConcat = strConcat.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
        }
        com.google.android.gms.internal.auth.g.e("AudioConfigUtil", strConcat);
        return iDoubleValue;
    }

    public static int C(Range range, int i, int i10, int i11) {
        ArrayList arrayList = null;
        int i12 = i11;
        int i13 = 0;
        while (true) {
            if (range.contains(Integer.valueOf(i12))) {
                int i14 = a1.l.f349n;
                if (i12 > 0 && i > 0) {
                    if (AudioRecord.getMinBufferSize(i12, i == 1 ? 16 : 12, i10) > 0) {
                        try {
                            new AudioFormat.Builder().setSampleRate(i12).setChannelMask(i == 1 ? 16 : 12).setEncoding(i10).build();
                            return i12;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                StringBuilder sbI = z.i("Sample rate ", i12, "Hz is not supported by audio source with channel count ", i, " and source format ");
                sbI.append(i10);
                com.google.android.gms.internal.auth.g.e("AudioConfigUtil", sbI.toString());
            } else {
                com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "Sample rate " + i12 + "Hz is not in target range " + range);
            }
            if (arrayList == null) {
                com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i11 + "Hz");
                arrayList = new ArrayList(a1.n.f367f);
                Collections.sort(arrayList, new d1.a(i11, 0));
            }
            if (i13 >= arrayList.size()) {
                com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            int i15 = i13 + 1;
            int iIntValue = ((Integer) arrayList.get(i13)).intValue();
            i13 = i15;
            i12 = iIntValue;
        }
    }

    public static void D(ii.f binaryMessenger, final t tVar) {
        a1.m mVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m nVar = (tVar == null || (mVar = tVar.f19420a) == null) ? new cj.n(1) : mVar.m();
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", nVar, obj);
        if (tVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", nVar, obj);
        if (tVar != null) {
            final int i10 = 15;
            gVar2.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i10) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", nVar, obj);
        if (tVar != null) {
            final int i11 = 16;
            gVar3.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i11) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", nVar, obj);
        if (tVar != null) {
            final int i12 = 1;
            gVar4.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i12) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", nVar, obj);
        if (tVar != null) {
            final int i13 = 2;
            gVar5.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i13) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", nVar, obj);
        if (tVar != null) {
            final int i14 = 3;
            gVar6.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i14) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar6.L(null);
        }
        s7.g gVar7 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", nVar, obj);
        if (tVar != null) {
            final int i15 = 4;
            gVar7.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i15) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar7.L(null);
        }
        s7.g gVar8 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", nVar, obj);
        if (tVar != null) {
            final int i16 = 5;
            gVar8.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i16) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar8.L(null);
        }
        s7.g gVar9 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", nVar, obj);
        if (tVar != null) {
            final int i17 = 6;
            gVar9.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i17) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar9.L(null);
        }
        s7.g gVar10 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", nVar, obj);
        if (tVar != null) {
            final int i18 = 7;
            gVar10.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i18) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar10.L(null);
        }
        s7.g gVar11 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", nVar, obj);
        if (tVar != null) {
            final int i19 = 8;
            gVar11.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i19) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar11.L(null);
        }
        s7.g gVar12 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", nVar, obj);
        if (tVar != null) {
            final int i20 = 9;
            gVar12.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i20) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar12.L(null);
        }
        s7.g gVar13 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", nVar, obj);
        if (tVar != null) {
            final int i21 = 10;
            gVar13.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i21) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar13.L(null);
        }
        s7.g gVar14 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", nVar, obj);
        if (tVar != null) {
            final int i22 = 11;
            gVar14.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i22) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar14.L(null);
        }
        s7.g gVar15 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", nVar, obj);
        if (tVar != null) {
            final int i23 = 12;
            gVar15.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i23) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar15.L(null);
        }
        s7.g gVar16 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", nVar, obj);
        if (tVar != null) {
            final int i24 = 13;
            gVar16.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i24) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        } else {
            gVar16.L(null);
        }
        s7.g gVar17 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", nVar, obj);
        if (tVar == null) {
            gVar17.L(null);
        } else {
            final int i25 = 14;
            gVar17.L(new ii.b() { // from class: fj.i0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
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
                    List listF12;
                    List listF13;
                    List listF14;
                    List listF15;
                    List listF16;
                    List listF17;
                    switch (i25) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                tVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                tVar3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                tVar4.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                tVar5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                tVar6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        case 5:
                            t tVar7 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                tVar7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                        case 6:
                            t tVar8 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                tVar8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listF7 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception7) {
                                Intrinsics.checkNotNullParameter(exception7, "exception");
                                if (exception7 instanceof a) {
                                    a aVar7 = exception7;
                                    listF7 = kotlin.collections.s.f(aVar7.f19299b, aVar7.f19300c, aVar7.f19301d);
                                } else {
                                    listF7 = kotlin.collections.s.f(exception7.getClass().getSimpleName(), exception7.toString(), l7.o.k("Cause: ", exception7.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception7)));
                                }
                            }
                            reply.i(listF7);
                            break;
                        case 7:
                            t tVar9 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                tVar9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listF8 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception8) {
                                Intrinsics.checkNotNullParameter(exception8, "exception");
                                if (exception8 instanceof a) {
                                    a aVar8 = exception8;
                                    listF8 = kotlin.collections.s.f(aVar8.f19299b, aVar8.f19300c, aVar8.f19301d);
                                } else {
                                    listF8 = kotlin.collections.s.f(exception8.getClass().getSimpleName(), exception8.toString(), l7.o.k("Cause: ", exception8.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception8)));
                                }
                            }
                            reply.i(listF8);
                            break;
                        case 8:
                            t tVar10 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            Intrinsics.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            Intrinsics.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                tVar10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listF9 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception9) {
                                Intrinsics.checkNotNullParameter(exception9, "exception");
                                if (exception9 instanceof a) {
                                    a aVar9 = exception9;
                                    listF9 = kotlin.collections.s.f(aVar9.f19299b, aVar9.f19300c, aVar9.f19301d);
                                } else {
                                    listF9 = kotlin.collections.s.f(exception9.getClass().getSimpleName(), exception9.toString(), l7.o.k("Cause: ", exception9.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception9)));
                                }
                            }
                            reply.i(listF9);
                            break;
                        case 9:
                            t tVar11 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            Intrinsics.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            Intrinsics.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                tVar11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listF10 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception10) {
                                Intrinsics.checkNotNullParameter(exception10, "exception");
                                if (exception10 instanceof a) {
                                    a aVar10 = exception10;
                                    listF10 = kotlin.collections.s.f(aVar10.f19299b, aVar10.f19300c, aVar10.f19301d);
                                } else {
                                    listF10 = kotlin.collections.s.f(exception10.getClass().getSimpleName(), exception10.toString(), l7.o.k("Cause: ", exception10.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception10)));
                                }
                            }
                            reply.i(listF10);
                            break;
                        case 10:
                            t tVar12 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            Intrinsics.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            Intrinsics.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                tVar12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listF11 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception11) {
                                Intrinsics.checkNotNullParameter(exception11, "exception");
                                if (exception11 instanceof a) {
                                    a aVar11 = exception11;
                                    listF11 = kotlin.collections.s.f(aVar11.f19299b, aVar11.f19300c, aVar11.f19301d);
                                } else {
                                    listF11 = kotlin.collections.s.f(exception11.getClass().getSimpleName(), exception11.toString(), l7.o.k("Cause: ", exception11.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception11)));
                                }
                            }
                            reply.i(listF11);
                            break;
                        case 11:
                            t tVar13 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            Intrinsics.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            Intrinsics.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                tVar13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listF12 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception12) {
                                Intrinsics.checkNotNullParameter(exception12, "exception");
                                if (exception12 instanceof a) {
                                    a aVar12 = exception12;
                                    listF12 = kotlin.collections.s.f(aVar12.f19299b, aVar12.f19300c, aVar12.f19301d);
                                } else {
                                    listF12 = kotlin.collections.s.f(exception12.getClass().getSimpleName(), exception12.toString(), l7.o.k("Cause: ", exception12.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception12)));
                                }
                            }
                            reply.i(listF12);
                            break;
                        case 12:
                            t tVar14 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            Intrinsics.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            Intrinsics.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                tVar14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listF13 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception13) {
                                Intrinsics.checkNotNullParameter(exception13, "exception");
                                if (exception13 instanceof a) {
                                    a aVar13 = exception13;
                                    listF13 = kotlin.collections.s.f(aVar13.f19299b, aVar13.f19300c, aVar13.f19301d);
                                } else {
                                    listF13 = kotlin.collections.s.f(exception13.getClass().getSimpleName(), exception13.toString(), l7.o.k("Cause: ", exception13.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception13)));
                                }
                            }
                            reply.i(listF13);
                            break;
                        case 13:
                            t tVar15 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            Intrinsics.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                tVar15.getClass();
                                listF14 = kotlin.collections.r.c(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable exception14) {
                                Intrinsics.checkNotNullParameter(exception14, "exception");
                                if (exception14 instanceof a) {
                                    a aVar14 = exception14;
                                    listF14 = kotlin.collections.s.f(aVar14.f19299b, aVar14.f19300c, aVar14.f19301d);
                                } else {
                                    listF14 = kotlin.collections.s.f(exception14.getClass().getSimpleName(), exception14.toString(), l7.o.k("Cause: ", exception14.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception14)));
                                }
                            }
                            reply.i(listF14);
                            break;
                        case 14:
                            t tVar16 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            Intrinsics.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            Intrinsics.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            v vVar = (v) obj30;
                            try {
                                tVar16.getClass();
                                int iOrdinal = vVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listF15 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception15) {
                                Intrinsics.checkNotNullParameter(exception15, "exception");
                                if (exception15 instanceof a) {
                                    a aVar15 = exception15;
                                    listF15 = kotlin.collections.s.f(aVar15.f19299b, aVar15.f19300c, aVar15.f19301d);
                                } else {
                                    listF15 = kotlin.collections.s.f(exception15.getClass().getSimpleName(), exception15.toString(), l7.o.k("Cause: ", exception15.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception15)));
                                }
                            }
                            reply.i(listF15);
                            break;
                        case 15:
                            t tVar17 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            Intrinsics.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            Intrinsics.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                tVar17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listF16 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception16) {
                                Intrinsics.checkNotNullParameter(exception16, "exception");
                                if (exception16 instanceof a) {
                                    a aVar16 = exception16;
                                    listF16 = kotlin.collections.s.f(aVar16.f19299b, aVar16.f19300c, aVar16.f19301d);
                                } else {
                                    listF16 = kotlin.collections.s.f(exception16.getClass().getSimpleName(), exception16.toString(), l7.o.k("Cause: ", exception16.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception16)));
                                }
                            }
                            reply.i(listF16);
                            break;
                        default:
                            t tVar18 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            Intrinsics.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            Intrinsics.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                tVar18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listF17 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception17) {
                                Intrinsics.checkNotNullParameter(exception17, "exception");
                                if (exception17 instanceof a) {
                                    a aVar17 = exception17;
                                    listF17 = kotlin.collections.s.f(aVar17.f19299b, aVar17.f19300c, aVar17.f19301d);
                                } else {
                                    listF17 = kotlin.collections.s.f(exception17.getClass().getSimpleName(), exception17.toString(), l7.o.k("Cause: ", exception17.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception17)));
                                }
                            }
                            reply.i(listF17);
                            break;
                    }
                }
            });
        }
    }

    public static void E(ii.f binaryMessenger, final ni.g gVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = gVar != null ? gVar.f29394a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.higherQualityOrLowerThan", mVarA, obj);
        if (gVar != null) {
            final int i = 0;
            gVar2.L(new ii.b() { // from class: ni.q0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    int i10 = i;
                    g gVar3 = gVar;
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
                            try {
                                fj.c cVar = (fj.c) gVar3.f29394a.f6853d;
                                x0.g gVarD = g.d(n1Var);
                                x0.c cVar2 = x0.c.f35563c;
                                cVar.a(jLongValue, new x0.c(gVarD, 1));
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var2 = (n1) obj6;
                            try {
                                fj.c cVar3 = (fj.c) gVar3.f29394a.f6853d;
                                x0.g gVarD2 = g.d(n1Var2);
                                x0.c cVar4 = x0.c.f35563c;
                                cVar3.a(jLongValue2, new x0.c(gVarD2, 2));
                                listF2 = kotlin.collections.r.c(null);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var3 = (n1) obj8;
                            try {
                                fj.c cVar5 = (fj.c) gVar3.f29394a.f6853d;
                                x0.g gVarD3 = g.d(n1Var3);
                                x0.c cVar6 = x0.c.f35563c;
                                cVar5.a(jLongValue3, new x0.c(gVarD3, 3));
                                listF3 = kotlin.collections.r.c(null);
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
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj9).longValue();
                            Object obj10 = list4.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var4 = (n1) obj10;
                            try {
                                fj.c cVar7 = (fj.c) gVar3.f29394a.f6853d;
                                x0.g gVarD4 = g.d(n1Var4);
                                x0.c cVar8 = x0.c.f35563c;
                                cVar7.a(jLongValue4, new x0.c(gVarD4, 4));
                                listF4 = kotlin.collections.r.c(null);
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
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.higherQualityThan", mVarA, obj);
        if (gVar != null) {
            final int i10 = 1;
            gVar3.L(new ii.b() { // from class: ni.q0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    int i102 = i10;
                    g gVar32 = gVar;
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
                            try {
                                fj.c cVar = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD = g.d(n1Var);
                                x0.c cVar2 = x0.c.f35563c;
                                cVar.a(jLongValue, new x0.c(gVarD, 1));
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var2 = (n1) obj6;
                            try {
                                fj.c cVar3 = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD2 = g.d(n1Var2);
                                x0.c cVar4 = x0.c.f35563c;
                                cVar3.a(jLongValue2, new x0.c(gVarD2, 2));
                                listF2 = kotlin.collections.r.c(null);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var3 = (n1) obj8;
                            try {
                                fj.c cVar5 = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD3 = g.d(n1Var3);
                                x0.c cVar6 = x0.c.f35563c;
                                cVar5.a(jLongValue3, new x0.c(gVarD3, 3));
                                listF3 = kotlin.collections.r.c(null);
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
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj9).longValue();
                            Object obj10 = list4.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var4 = (n1) obj10;
                            try {
                                fj.c cVar7 = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD4 = g.d(n1Var4);
                                x0.c cVar8 = x0.c.f35563c;
                                cVar7.a(jLongValue4, new x0.c(gVarD4, 4));
                                listF4 = kotlin.collections.r.c(null);
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
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.lowerQualityOrHigherThan", mVarA, obj);
        if (gVar != null) {
            final int i11 = 2;
            gVar4.L(new ii.b() { // from class: ni.q0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    int i102 = i11;
                    g gVar32 = gVar;
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
                            try {
                                fj.c cVar = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD = g.d(n1Var);
                                x0.c cVar2 = x0.c.f35563c;
                                cVar.a(jLongValue, new x0.c(gVarD, 1));
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var2 = (n1) obj6;
                            try {
                                fj.c cVar3 = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD2 = g.d(n1Var2);
                                x0.c cVar4 = x0.c.f35563c;
                                cVar3.a(jLongValue2, new x0.c(gVarD2, 2));
                                listF2 = kotlin.collections.r.c(null);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var3 = (n1) obj8;
                            try {
                                fj.c cVar5 = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD3 = g.d(n1Var3);
                                x0.c cVar6 = x0.c.f35563c;
                                cVar5.a(jLongValue3, new x0.c(gVarD3, 3));
                                listF3 = kotlin.collections.r.c(null);
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
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj9).longValue();
                            Object obj10 = list4.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var4 = (n1) obj10;
                            try {
                                fj.c cVar7 = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD4 = g.d(n1Var4);
                                x0.c cVar8 = x0.c.f35563c;
                                cVar7.a(jLongValue4, new x0.c(gVarD4, 4));
                                listF4 = kotlin.collections.r.c(null);
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
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.lowerQualityThan", mVarA, obj);
        if (gVar == null) {
            gVar5.L(null);
        } else {
            final int i12 = 3;
            gVar5.L(new ii.b() { // from class: ni.q0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    int i102 = i12;
                    g gVar32 = gVar;
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
                            try {
                                fj.c cVar = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD = g.d(n1Var);
                                x0.c cVar2 = x0.c.f35563c;
                                cVar.a(jLongValue, new x0.c(gVarD, 1));
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var2 = (n1) obj6;
                            try {
                                fj.c cVar3 = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD2 = g.d(n1Var2);
                                x0.c cVar4 = x0.c.f35563c;
                                cVar3.a(jLongValue2, new x0.c(gVarD2, 2));
                                listF2 = kotlin.collections.r.c(null);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var3 = (n1) obj8;
                            try {
                                fj.c cVar5 = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD3 = g.d(n1Var3);
                                x0.c cVar6 = x0.c.f35563c;
                                cVar5.a(jLongValue3, new x0.c(gVarD3, 3));
                                listF3 = kotlin.collections.r.c(null);
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
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj9 = list4.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj9).longValue();
                            Object obj10 = list4.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoQuality");
                            n1 n1Var4 = (n1) obj10;
                            try {
                                fj.c cVar7 = (fj.c) gVar32.f29394a.f6853d;
                                x0.g gVarD4 = g.d(n1Var4);
                                x0.c cVar8 = x0.c.f35563c;
                                cVar7.a(jLongValue4, new x0.c(gVarD4, 4));
                                listF4 = kotlin.collections.r.c(null);
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
                    }
                }
            });
        }
    }

    public static void F(y2 y2Var) {
        y2Var.t(3);
        y2Var.t(8);
        boolean zH = y2Var.h();
        boolean zH2 = y2Var.h();
        if (zH) {
            y2Var.t(5);
        }
        if (zH2) {
            y2Var.t(6);
        }
    }

    public static void G(y2 y2Var) {
        int i;
        int i10 = y2Var.i(2);
        if (i10 == 0) {
            y2Var.t(6);
            return;
        }
        int iX = x(y2Var, 5, 8, 16) + 1;
        if (i10 == 1) {
            y2Var.t(iX * 7);
            return;
        }
        if (i10 == 2) {
            boolean zH = y2Var.h();
            int i11 = zH ? 1 : 5;
            int i12 = zH ? 7 : 5;
            int i13 = zH ? 8 : 6;
            int i14 = 0;
            while (i14 < iX) {
                if (y2Var.h()) {
                    y2Var.t(7);
                    i = 0;
                } else {
                    if (y2Var.i(2) == 3 && y2Var.i(i12) * i11 != 0) {
                        y2Var.s();
                    }
                    i = y2Var.i(i13) * i11;
                    if (i != 0 && i != 180) {
                        y2Var.s();
                    }
                    y2Var.s();
                }
                if (i != 0 && i != 180 && y2Var.h()) {
                    i14++;
                }
                i14++;
            }
        }
    }

    public static ArrayList H(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        if (th2 instanceof bj.b) {
            bj.b bVar = (bj.b) th2;
            arrayList.add(bVar.f2162b);
            arrayList.add(bVar.getMessage());
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public static int I(byte[] bArr, int i, a4.g gVar) throws p0 {
        int iP = P(bArr, i, gVar);
        int i10 = gVar.f431d;
        if (i10 < 0) {
            throw p0.b();
        }
        if (i10 > bArr.length - iP) {
            throw p0.c();
        }
        if (i10 == 0) {
            gVar.f432e = g0.f13222d;
            return iP;
        }
        gVar.f432e = g0.g(bArr, iP, i10);
        return iP + i10;
    }

    public static int J(int i, byte[] bArr) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static void K(int i, int i10) {
        String strV;
        if (i < 0 || i >= i10) {
            if (i < 0) {
                strV = l.v("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(o.j(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
                }
                strV = l.v("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strV);
        }
    }

    public static int L(k1 k1Var, int i, byte[] bArr, int i10, int i11, m0 m0Var, a4.g gVar) throws p0 {
        l0 l0VarG = k1Var.g();
        k1 k1Var2 = k1Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        a4.g gVar2 = gVar;
        int iS = S(l0VarG, k1Var2, bArr2, i10, i12, gVar2);
        k1Var2.d(l0VarG);
        gVar2.f432e = l0VarG;
        m0Var.add(l0VarG);
        while (iS < i12) {
            a4.g gVar3 = gVar2;
            int i13 = i12;
            int iP = P(bArr2, iS, gVar3);
            if (i != gVar3.f431d) {
                break;
            }
            byte[] bArr3 = bArr2;
            k1 k1Var3 = k1Var2;
            l0 l0VarG2 = k1Var3.g();
            iS = S(l0VarG2, k1Var3, bArr3, iP, i13, gVar3);
            k1Var2 = k1Var3;
            bArr2 = bArr3;
            i12 = i13;
            gVar2 = gVar3;
            k1Var2.d(l0VarG2);
            gVar2.f432e = l0VarG2;
            m0Var.add(l0VarG2);
        }
        return iS;
    }

    public static void M(int i, int i10, int i11) {
        if (i < 0 || i10 < i || i10 > i11) {
            throw new IndexOutOfBoundsException((i < 0 || i > i11) ? N(i, i11, "start index") : (i10 < 0 || i10 > i11) ? N(i10, i11, "end index") : l.v("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i)));
        }
    }

    public static String N(int i, int i10, String str) {
        if (i < 0) {
            return l.v("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return l.v("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.j(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
    }

    public static int O(int i, byte[] bArr, int i10, int i11, n1 n1Var, a4.g gVar) throws p0 {
        if ((i >>> 3) == 0) {
            throw new p0("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iR = R(bArr, i10, gVar);
            n1Var.b(i, Long.valueOf(gVar.f430c));
            return iR;
        }
        if (i12 == 1) {
            n1Var.b(i, Long.valueOf(T(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iP = P(bArr, i10, gVar);
            int i13 = gVar.f431d;
            if (i13 < 0) {
                throw p0.b();
            }
            if (i13 > bArr.length - iP) {
                throw p0.c();
            }
            if (i13 == 0) {
                n1Var.b(i, g0.f13222d);
            } else {
                n1Var.b(i, g0.g(bArr, iP, i13));
            }
            return iP + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new p0("Protocol message contained an invalid tag (zero).");
            }
            n1Var.b(i, Integer.valueOf(J(i10, bArr)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        n1 n1VarA = n1.a();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iP2 = P(bArr, i10, gVar);
            i15 = gVar.f431d;
            if (i15 == i14) {
                i10 = iP2;
                break;
            }
            i10 = O(i15, bArr, iP2, i11, n1VarA, gVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw new p0("Failed to parse the message.");
        }
        n1Var.b(i, n1VarA);
        return i10;
    }

    public static int P(byte[] bArr, int i, a4.g gVar) {
        int i10 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return Q(b2, i10, gVar, bArr);
        }
        gVar.f431d = b2;
        return i10;
    }

    public static int Q(int i, int i10, a4.g gVar, byte[] bArr) {
        byte b2 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b2 >= 0) {
            gVar.f431d = i12 | (b2 << 7);
            return i11;
        }
        int i13 = i12 | ((b2 & 127) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            gVar.f431d = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & 127) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            gVar.f431d = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            gVar.f431d = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                gVar.f431d = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int R(byte[] bArr, int i, a4.g gVar) {
        long j10 = bArr[i];
        int i10 = i + 1;
        if (j10 >= 0) {
            gVar.f430c = j10;
            return i10;
        }
        int i11 = i + 2;
        byte b2 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b2 & 127)) << 7);
        int i12 = 7;
        while (b2 < 0) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b10 & 127)) << i12;
            b2 = b10;
            i11 = i13;
        }
        gVar.f430c = j11;
        return i11;
    }

    public static int S(Object obj, k1 k1Var, byte[] bArr, int i, int i10, a4.g gVar) throws p0 {
        int iQ = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iQ = Q(i11, iQ, gVar, bArr);
            i11 = gVar.f431d;
        }
        int i12 = iQ;
        if (i11 < 0 || i11 > i10 - i12) {
            throw p0.c();
        }
        int i13 = i12 + i11;
        k1Var.b(obj, bArr, i12, i13, gVar);
        gVar.f432e = obj;
        return i13;
    }

    public static long T(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i10, 33);
    }

    public static void b(s0 s0Var, CaptureRequest.Builder builder) {
        Range rangeA = s0Var.a();
        if (!rangeA.equals(g0.n.f19676h)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        com.google.android.gms.internal.auth.g.e("Camera2CaptureRequestBuilder", "applyAeFpsRange: expectedFrameRateRange = " + rangeA);
    }

    public static void c(CaptureRequest.Builder builder, u1 u1Var) {
        z.g gVarC = c0.d(u1Var).c();
        for (g0.g gVar : gVarC.d()) {
            CaptureRequest.Key key = (CaptureRequest.Key) gVar.f19563c;
            try {
                builder.set(key, gVarC.a(gVar));
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.internal.auth.g.k("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void d(CaptureRequest.Builder builder, int i, x.a aVar) {
        Map mapUnmodifiableMap;
        if (i == 3 && aVar.f35493a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                aVar.getClass();
            } else if (aVar.f35494b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static final boolean e(int i, int i10, int i11, byte[] a10, byte[] b2) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a10[i12 + i] != b2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static CaptureRequest f(s0 s0Var, CameraDevice cameraDevice, HashMap map, boolean z5, x.a aVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        Integer num = null;
        if (cameraDevice != null) {
            ArrayList arrayList = s0Var.f19745a;
            int i = s0Var.f19747c;
            u1 u1Var = s0Var.f19746b;
            TreeMap treeMap = u1Var.L;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                Surface surface = (Surface) map.get((a1) it.next());
                if (surface == null) {
                    throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
                }
                arrayList2.add(surface);
            }
            if (!arrayList2.isEmpty()) {
                v vVar = s0Var.f19752h;
                if (i == 5 && vVar != null && (vVar.m() instanceof TotalCaptureResult)) {
                    com.google.android.gms.internal.auth.g.e("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
                    builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) vVar.m());
                } else {
                    com.google.android.gms.internal.auth.g.e("Camera2CaptureRequestBuilder", "createCaptureRequest");
                    if (i == 5) {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z5 ? 1 : 2);
                    } else {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
                    }
                }
                d(builderCreateCaptureRequest, i, aVar);
                b(s0Var, builderCreateCaptureRequest);
                if (s0Var.c() == 1 || s0Var.d() == 1) {
                    num = 0;
                } else if (s0Var.c() == 2) {
                    num = 2;
                } else if (s0Var.d() == 2) {
                    num = 1;
                }
                if (num != null) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num);
                }
                com.google.android.gms.internal.auth.g.e("Camera2CaptureRequestBuilder", "applyVideoStabilization: mode = " + num);
                g0.g gVar = s0.i;
                if (treeMap.containsKey(gVar)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) u1Var.a(gVar));
                }
                g0.g gVar2 = s0.f19743j;
                if (treeMap.containsKey(gVar2)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) u1Var.a(gVar2)).byteValue()));
                }
                c(builderCreateCaptureRequest, u1Var);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    builderCreateCaptureRequest.addTarget((Surface) it2.next());
                }
                builderCreateCaptureRequest.setTag(s0Var.f19751g);
                return builderCreateCaptureRequest.build();
            }
        }
        return null;
    }

    public static CaptureRequest g(s0 s0Var, CameraDevice cameraDevice, x.a aVar) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("template type = ");
        int i = s0Var.f19747c;
        sb2.append(i);
        com.google.android.gms.internal.auth.g.e("Camera2CaptureRequestBuilder", sb2.toString());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        d(builderCreateCaptureRequest, i, aVar);
        b(s0Var, builderCreateCaptureRequest);
        c(builderCreateCaptureRequest, s0Var.f19746b);
        return builderCreateCaptureRequest.build();
    }

    public static final void h(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            StringBuilder sbN = gf.a.n("size=", " offset=", j10);
            sbN.append(j11);
            sbN.append(" byteCount=");
            sbN.append(j12);
            throw new ArrayIndexOutOfBoundsException(sbN.toString());
        }
    }

    public static final long i(InputStream inputStream, OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j10 = 0;
        while (i >= 0) {
            out.write(bArr, 0, i);
            j10 += (long) i;
            i = inputStream.read(bArr);
        }
        return j10;
    }

    public static j0.b j() {
        if (j0.b.f26121c != null) {
            return j0.b.f26121c;
        }
        synchronized (j0.b.class) {
            try {
                if (j0.b.f26121c == null) {
                    j0.b.f26121c = new j0.b(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j0.b.f26121c;
    }

    public static final pj.b k(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new pj.b(entries);
    }

    public static InvocationHandler l() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static final String m(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Bytes cannot be negative");
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d10 = j10;
        int i = 0;
        double d11 = d10;
        while (d11 >= 1024.0d && i < 4) {
            d11 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            return decimalFormat.format(d11) + ' ' + strArr[i];
        }
        StringBuilder sb2 = new StringBuilder();
        while (-1 < i) {
            double dPow = Math.pow(1024.0d, i);
            double dFloor = Math.floor(d10 / dPow);
            if (dFloor > ConfigValue.DOUBLE_DEFAULT_VALUE) {
                sb2.append(decimalFormat.format(dFloor));
                sb2.append(" ");
                sb2.append(strArr[i]);
                sb2.append(" ");
                d10 -= dFloor * dPow;
            }
            i--;
        }
        return StringsKt.P(sb2).toString();
    }

    public static j0.e n() {
        if (j0.e.f26130d != null) {
            return j0.e.f26130d;
        }
        synchronized (j0.e.class) {
            try {
                if (j0.e.f26130d == null) {
                    j0.e.f26130d = new j0.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j0.e.f26130d;
    }

    public static j0.f o() {
        if (j0.f.f26133d != null) {
            return j0.f.f26133d;
        }
        synchronized (j0.f.class) {
            try {
                if (j0.f.f26133d == null) {
                    j0.f.f26133d = new j0.f(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j0.f.f26133d;
    }

    public static final boolean p(nl.g isProbablyUtf8) {
        nl.g gVar;
        int i;
        Intrinsics.checkNotNullParameter(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            gVar = new nl.g();
            long j10 = isProbablyUtf8.f29540c;
            long j11 = 64;
            if (j10 <= 64) {
                j11 = j10;
            }
            isProbablyUtf8.d(gVar, 0L, j11);
        } catch (EOFException unused) {
        }
        for (i = 0; i < 16; i++) {
            if (gVar.h()) {
                return true;
            }
            int iS = gVar.s();
            if (Character.isISOControl(iS) && !Character.isWhitespace(iS)) {
                return false;
            }
        }
        return true;
    }

    public static String q(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i = 0;
        int i10 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i10)) != -1) {
            sb2.append((CharSequence) strValueOf, i10, iIndexOf);
            sb2.append(r(objArr[i]));
            i10 = iIndexOf + 2;
            i++;
        }
        sb2.append((CharSequence) strValueOf, i10, strValueOf.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb2.append(str2);
                sb2.append(r(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String r(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e3) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e3);
            StringBuilder sbP = om1.p("<", str, " threw ");
            sbP.append(e3.getClass().getName());
            sbP.append(">");
            return sbP.toString();
        }
    }

    public static j0.d s() {
        if (j0.g.f26136a != null) {
            return j0.g.f26136a;
        }
        synchronized (j0.g.class) {
            try {
                if (j0.g.f26136a == null) {
                    j0.g.f26136a = new j0.d(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j0.g.f26136a;
    }

    public static final void t(x xVar, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        a0 a0Var = vk.m.f34887a;
        xVar.a(key, new q(bool, false));
    }

    public static final void u(x xVar, String key, Number number) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        a0 a0Var = vk.m.f34887a;
        xVar.a(key, new q(number, false));
    }

    public static final void v(x xVar, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        x xVar2 = new x();
        builderAction.invoke(xVar2);
        xVar.a(key, new w(xVar2.f34898a));
    }

    public static final byte[] w(InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        i(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static int x(y2 y2Var, int i, int i10, int i11) {
        h5.h(Math.max(Math.max(i, i10), i11) <= 31);
        int i12 = (1 << i) - 1;
        int i13 = (1 << i10) - 1;
        Math.addExact(Math.addExact(i12, i13), 1 << i11);
        if (y2Var.b() < i) {
            return -1;
        }
        int i14 = y2Var.i(i);
        if (i14 == i12) {
            if (y2Var.b() < i10) {
                return -1;
            }
            int i15 = y2Var.i(i10);
            i14 += i15;
            if (i15 == i13) {
                if (y2Var.b() < i11) {
                    return -1;
                }
                return y2Var.i(i11) + i14;
            }
        }
        return i14;
    }

    public static int y(x0.a aVar) {
        int i = aVar.f35503c;
        if (i == -1) {
            com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "Using provided AUDIO source: " + i);
        return i;
    }

    public static int z(x0.a aVar) {
        int i = aVar.f35502b;
        if (i == -1) {
            com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        com.google.android.gms.internal.auth.g.e("AudioConfigUtil", "Using provided AUDIO source format: " + i);
        return i;
    }
}
