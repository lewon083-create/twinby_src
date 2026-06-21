package k3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g0.p;
import g0.q;
import g0.r;
import g2.n0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.cp;
import java.io.File;
import java.lang.reflect.Field;
import java.net.IDN;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.a0;
import m.k0;
import t.d1;
import t.e0;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AudioManager f26854a;

    public static void A(TextView textView, int i) {
        f2.g.f(i);
        if (Build.VERSION.SDK_INT >= 28) {
            c2.f.q(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void B(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        Field field = n0.f19900a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z5 = onLongClickListener != null;
        boolean z10 = zHasOnClickListeners || z5;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z5);
        checkableImageButton.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public static void C(TextView textView, int i) {
        f2.g.f(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i10);
        }
    }

    public static void D(ii.f binaryMessenger, final ni.m mVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = mVar != null ? mVar.f29437a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.LiveData.observe", mVarA, obj);
        if (mVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.u0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    androidx.lifecycle.u uVarC;
                    List listF2;
                    List listF3;
                    switch (i) {
                        case 0:
                            m mVar2 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.camerax.LiveDataProxyApi.LiveDataWrapper");
                            c0 c0Var = (c0) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.lifecycle.Observer<*>");
                            androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) obj4;
                            try {
                                uVarC = mVar2.f29437a.c();
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            if (uVarC == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to observe a LiveData instance.");
                            }
                            c0Var.f29360a.e(uVarC, e0Var);
                            listF = kotlin.collections.r.c(null);
                            reply.i(listF);
                            return;
                        case 1:
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.LiveDataProxyApi.LiveDataWrapper");
                            try {
                                mVar3.h((c0) obj5);
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
                            return;
                        default:
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.LiveDataProxyApi.LiveDataWrapper");
                            c0 c0Var2 = (c0) obj6;
                            try {
                                mVar4.getClass();
                                listF3 = kotlin.collections.r.c(c0Var2.f29360a.d());
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
                            return;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.LiveData.removeObservers", mVarA, obj);
        if (mVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.u0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    androidx.lifecycle.u uVarC;
                    List listF2;
                    List listF3;
                    switch (i10) {
                        case 0:
                            m mVar2 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.camerax.LiveDataProxyApi.LiveDataWrapper");
                            c0 c0Var = (c0) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.lifecycle.Observer<*>");
                            androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) obj4;
                            try {
                                uVarC = mVar2.f29437a.c();
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            if (uVarC == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to observe a LiveData instance.");
                            }
                            c0Var.f29360a.e(uVarC, e0Var);
                            listF = kotlin.collections.r.c(null);
                            reply.i(listF);
                            return;
                        case 1:
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.LiveDataProxyApi.LiveDataWrapper");
                            try {
                                mVar3.h((c0) obj5);
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
                            return;
                        default:
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.LiveDataProxyApi.LiveDataWrapper");
                            c0 c0Var2 = (c0) obj6;
                            try {
                                mVar4.getClass();
                                listF3 = kotlin.collections.r.c(c0Var2.f29360a.d());
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
                            return;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.LiveData.getValue", mVarA, obj);
        if (mVar == null) {
            gVar3.L(null);
        } else {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.u0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    androidx.lifecycle.u uVarC;
                    List listF2;
                    List listF3;
                    switch (i11) {
                        case 0:
                            m mVar2 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.camerax.LiveDataProxyApi.LiveDataWrapper");
                            c0 c0Var = (c0) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.lifecycle.Observer<*>");
                            androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) obj4;
                            try {
                                uVarC = mVar2.f29437a.c();
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            if (uVarC == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to observe a LiveData instance.");
                            }
                            c0Var.f29360a.e(uVarC, e0Var);
                            listF = kotlin.collections.r.c(null);
                            reply.i(listF);
                            return;
                        case 1:
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.LiveDataProxyApi.LiveDataWrapper");
                            try {
                                mVar3.h((c0) obj5);
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
                            return;
                        default:
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.LiveDataProxyApi.LiveDataWrapper");
                            c0 c0Var2 = (c0) obj6;
                            try {
                                mVar4.getClass();
                                listF3 = kotlin.collections.r.c(c0Var2.f29360a.d());
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
                            return;
                    }
                }
            });
        }
    }

    public static int[] E(Collection collection) {
        if (collection instanceof dd.b) {
            dd.b bVar = (dd.b) collection;
            return Arrays.copyOfRange(bVar.f15771b, bVar.f15772c, bVar.f15773d);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final String F(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i = 0;
        int i10 = -1;
        if (!StringsKt.y(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = lowerCase.charAt(i11);
                    if (Intrinsics.d(cCharAt, 31) <= 0 || Intrinsics.d(cCharAt, 127) >= 0 || StringsKt.B(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressJ = (a0.n(str, "[", false) && a0.h(str, "]")) ? j(1, str.length() - 1, str) : j(0, str.length(), str);
        if (inetAddressJ == null) {
            return null;
        }
        byte[] address = inetAddressJ.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressJ.getHostAddress();
            }
            throw new AssertionError(pe.a.c('\'', "Invalid IPv6 address: '", str));
        }
        Intrinsics.checkNotNullExpressionValue(address, "address");
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        nl.g gVar = new nl.g();
        while (i < address.length) {
            if (i == i10) {
                gVar.L(58);
                i += i13;
                if (i == 16) {
                    gVar.L(58);
                }
            } else {
                if (i > 0) {
                    gVar.L(58);
                }
                byte b2 = address[i];
                byte[] bArr = al.b.f1041a;
                gVar.N(((b2 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return gVar.m();
    }

    public static void G(p pVar, ArrayList arrayList) {
        if (pVar instanceof q) {
            Iterator it = ((q) pVar).f19721a.iterator();
            while (it.hasNext()) {
                G((p) it.next(), arrayList);
            }
        } else if (pVar instanceof d1) {
            arrayList.add(((d1) pVar).f33010a);
        } else {
            arrayList.add(new e0(pVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer H(java.lang.String r19) {
        /*
            r0 = r19
            r0.getClass()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
        Lb:
            r0 = 0
            r16 = 0
            goto L86
        L10:
            r1 = 0
            char r3 = r0.charAt(r1)
            r4 = 45
            if (r3 != r4) goto L1a
            r1 = 1
        L1a:
            int r3 = r0.length()
            if (r1 != r3) goto L21
            goto Lb
        L21:
            int r3 = r1 + 1
            char r4 = r0.charAt(r1)
            r5 = -1
            r6 = 128(0x80, float:1.8E-43)
            if (r4 >= r6) goto L31
            byte[] r7 = dd.c.f15774a
            r4 = r7[r4]
            goto L34
        L31:
            byte[] r4 = dd.c.f15774a
            r4 = r5
        L34:
            if (r4 < 0) goto L60
            r7 = 10
            if (r4 < r7) goto L3b
            goto L60
        L3b:
            int r4 = -r4
            long r8 = (long) r4
            long r10 = (long) r7
            r12 = -9223372036854775808
            long r14 = r12 / r10
        L42:
            int r4 = r0.length()
            if (r3 >= r4) goto L73
            int r4 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 >= r6) goto L55
            byte[] r16 = dd.c.f15774a
            r3 = r16[r3]
            goto L58
        L55:
            byte[] r3 = dd.c.f15774a
            r3 = r5
        L58:
            if (r3 < 0) goto L60
            if (r3 >= r7) goto L60
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 >= 0) goto L63
        L60:
            r16 = 0
            goto L6d
        L63:
            long r8 = r8 * r10
            r16 = 0
            long r2 = (long) r3
            long r17 = r2 + r12
            int r17 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r17 >= 0) goto L70
        L6d:
            r0 = r16
            goto L86
        L70:
            long r8 = r8 - r2
            r3 = r4
            goto L42
        L73:
            r16 = 0
            if (r1 == 0) goto L7c
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            goto L86
        L7c:
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L81
            goto L6d
        L81:
            long r0 = -r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L86:
            if (r0 == 0) goto L9f
            long r1 = r0.longValue()
            int r3 = r0.intValue()
            long r3 = (long) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L96
            goto L9f
        L96:
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L9f:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.f.H(java.lang.String):java.lang.Integer");
    }

    public static ActionMode.Callback I(ActionMode.Callback callback) {
        return (!(callback instanceof j2.h) || Build.VERSION.SDK_INT < 26) ? callback : ((j2.h) callback).f26202a;
    }

    public static ActionMode.Callback J(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof j2.h) || callback == null) ? callback : new j2.h(callback, textView);
    }

    public static ArrayList K(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        if (th2 instanceof xi.m) {
            xi.m mVar = (xi.m) th2;
            arrayList.add(mVar.f36246b);
            arrayList.add(mVar.getMessage());
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public static int L(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static String M(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(N(objArr[i]));
            i10 = iIndexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb2.append(str2);
                sb2.append(N(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String N(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e3) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strG = z.g(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strG), (Throwable) e3);
            String name2 = e3.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strG.length() + 8 + name2.length() + 1);
            l7.o.t(sb2, "<", strG, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static List b(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new dd.b(0, iArr.length, iArr);
    }

    public static final void c(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbM = l7.o.m(i, "Expected '-' (hyphen) at index ", ", but was '");
        sbM.append(str.charAt(i));
        sbM.append('\'');
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    public static int d(long j10) {
        int i = (int) j10;
        h5.f("Out of range: %s", j10, ((long) i) == j10);
        return i;
    }

    public static ImageView.ScaleType f(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static p g(p... pVarArr) {
        List listAsList = Arrays.asList(pVarArr);
        return listAsList.isEmpty() ? new r() : listAsList.size() == 1 ? (p) listAsList.get(0) : new q(listAsList);
    }

    public static String h(Object value, String message) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(message, "message");
        return message + " value: " + value;
    }

    public static final File i(Context context, String fileName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), om1.k("datastore/", fileName));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r7 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r8 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress j(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.f.j(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final void l(long j10, byte[] dst, int i, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i12 = 7 - i10;
        int i13 = 8 - i11;
        if (i13 > i12) {
            return;
        }
        while (true) {
            int i14 = kotlin.text.d.f27550a[(int) ((j10 >> (i12 << 3)) & 255)];
            int i15 = i + 1;
            dst[i] = (byte) (i14 >> 8);
            i += 2;
            dst[i15] = (byte) i14;
            if (i12 == i13) {
                return;
            } else {
                i12--;
            }
        }
    }

    public static int m(byte b2, byte b10, byte b11, byte b12) {
        return (b2 << 24) | ((b10 & 255) << 16) | ((b11 & 255) << 8) | (b12 & 255);
    }

    public static synchronized AudioManager n(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f26854a = null;
            }
            AudioManager audioManager = f26854a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                m3.f fVar = new m3.f();
                m3.b.g().execute(new cp(22, applicationContext, fVar));
                fVar.a();
                AudioManager audioManager2 = f26854a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f26854a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int o(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static e2.c p(k0 k0Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new e2.c(c2.f.m(k0Var));
        }
        TextPaint textPaint = new TextPaint(k0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = k0Var.getBreakStrategy();
        int hyphenationFrequency = k0Var.getHyphenationFrequency();
        if (k0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (k0Var.getInputType() & 15) != 3) {
            boolean z5 = k0Var.getLayoutDirection() == 1;
            switch (k0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z5) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(c2.f.c(DecimalFormatSymbols.getInstance(k0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new e2.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int q(int[] iArr, int i, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static void r(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean s() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L12
            java.lang.String r0 = "Spreadtrum"
            java.lang.String r1 = t3.h.n()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L5d
        L12:
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r3 = r0.toLowerCase(r2)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r5 = "ums"
            r6 = 0
            boolean r3 = kotlin.text.a0.n(r3, r5, r6)
            if (r3 != 0) goto L5d
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r5 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            java.lang.String r5 = "Itel"
            boolean r3 = kotlin.text.a0.i(r3, r5)
            if (r3 != 0) goto L49
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r7 = "BRAND"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
            boolean r3 = kotlin.text.a0.i(r3, r5)
            if (r3 == 0) goto L5c
        L49:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = r0.toLowerCase(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.String r1 = "sp"
            boolean r0 = kotlin.text.a0.n(r0, r1, r6)
            if (r0 == 0) goto L5c
            goto L5d
        L5c:
            return r6
        L5d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.f.s():boolean");
    }

    public static void t(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    public static void u(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void v(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    public static String w(X509Certificate certificate) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        StringBuilder sb2 = new StringBuilder("sha256/");
        Intrinsics.checkNotNullParameter(certificate, "<this>");
        nl.j jVar = nl.j.f29541e;
        byte[] encoded = certificate.getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
        Intrinsics.checkNotNullParameter(encoded, "<this>");
        Intrinsics.checkNotNullParameter(encoded, "<this>");
        int length = encoded.length;
        int i = 0;
        hl.d.h(encoded.length, 0, length);
        Intrinsics.checkNotNullParameter(encoded, "<this>");
        kotlin.collections.m.a(length, encoded.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 0, length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        nl.j jVar2 = new nl.j(bArrCopyOfRange);
        Intrinsics.checkNotNullParameter("SHA-256", "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrCopyOfRange, 0, jVar2.a());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.b(bArrDigest);
        new nl.j(bArrDigest);
        byte[] map = nl.a.f29522a;
        Intrinsics.checkNotNullParameter(bArrDigest, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i10 = 0;
        while (i < length2) {
            byte b2 = bArrDigest[i];
            int i11 = i + 2;
            byte b10 = bArrDigest[i + 1];
            i += 3;
            byte b11 = bArrDigest[i11];
            bArr[i10] = map[(b2 & 255) >> 2];
            bArr[i10 + 1] = map[((b2 & 3) << 4) | ((b10 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr[i10 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i10 += 4;
            bArr[i12] = map[b11 & 63];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b12 = bArrDigest[i];
            bArr[i10] = map[(b12 & 255) >> 2];
            bArr[i10 + 1] = map[(b12 & 3) << 4];
            bArr[i10 + 2] = 61;
            bArr[i10 + 3] = 61;
        } else if (length3 == 2) {
            int i13 = i + 1;
            byte b13 = bArrDigest[i];
            byte b14 = bArrDigest[i13];
            bArr[i10] = map[(b13 & 255) >> 2];
            bArr[i10 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr[i10 + 2] = map[(b14 & 15) << 2];
            bArr[i10 + 3] = 61;
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        sb2.append(new String(bArr, Charsets.UTF_8));
        return sb2.toString();
    }

    public static void x(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static int z(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j10 < -2147483648L ? VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR : (int) j10;
    }

    public abstract Object e();

    public void k(l7.p pVar) {
        List listSingletonList = Collections.singletonList(pVar);
        m7.l lVar = (m7.l) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        m7.f fVar = new m7.f(lVar, listSingletonList);
        if (fVar.f28714f) {
            l7.n.g().j(m7.f.f28709g, pe.a.f("Already enqueued work ids (", TextUtils.join(", ", fVar.f28712d), ")"), new Throwable[0]);
        } else {
            lVar.f28733e.b(new v7.d(fVar));
        }
    }

    public abstract f y(String str, Function1 function1);
}
