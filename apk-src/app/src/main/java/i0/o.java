package i0;

import a0.t1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import com.google.android.gms.internal.ads.om1;
import hk.g0;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.a0;
import kotlin.text.e0;
import nl.r;
import nl.v;
import nl.w;
import nl.x;
import t.t0;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f20806a;

    public static boolean A(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    public static boolean B(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("ContentSizingFlag", "Could not get metadata");
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static int C(int i, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return Math.max(0, i10 - i11);
    }

    public static int D(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final long E(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !StringsKt.z("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            int i10 = i;
            while (true) {
                if (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == '0') {
                        if (i10 == i) {
                            i10++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i10 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!a0.n(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(e0.u(1, str));
    }

    public static boolean F(Parcel parcel, int i) {
        W(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder G(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iJ);
        return strongBinder;
    }

    public static int H(Parcel parcel, int i) {
        W(parcel, i, 4);
        return parcel.readInt();
    }

    public static long I(Parcel parcel, int i) {
        W(parcel, i, 8);
        return parcel.readLong();
    }

    public static int J(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final String K(Reader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter out = new StringWriter();
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            out.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = out.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static void L(FlutterEngine flutterEngine) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", FlutterEngine.class).invoke(null, flutterEngine);
        } catch (Exception e3) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e3);
        }
    }

    public static void M(ii.f binaryMessenger, final ni.g gVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = gVar != null ? gVar.f29394a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.pigeon_defaultConstructor", mVarA, obj);
        if (gVar != null) {
            final int i = 0;
            gVar2.L(new ii.b() { // from class: ni.s0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i) {
                        case 0:
                            g gVar3 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) gVar3.f29394a.f6853d).a(((Long) obj3).longValue(), g.e((t0.b) list.get(1), (Long) list.get(2), (Range) list.get(3), (Long) list.get(4)));
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
                            g gVar4 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            a0.w0 w0Var = (a0.w0) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis.Analyzer");
                            try {
                                gVar4.o(w0Var, (a0.r0) obj5);
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
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            try {
                                gVar5.b((a0.w0) obj6);
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
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            a0.w0 w0Var2 = (a0.w0) obj7;
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                gVar6.getClass();
                                if (w0Var2.C((int) jLongValue)) {
                                    w0Var2.J();
                                }
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
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.setAnalyzer", mVarA, obj);
        if (gVar != null) {
            final int i10 = 1;
            gVar3.L(new ii.b() { // from class: ni.s0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i10) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) gVar32.f29394a.f6853d).a(((Long) obj3).longValue(), g.e((t0.b) list.get(1), (Long) list.get(2), (Range) list.get(3), (Long) list.get(4)));
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
                            g gVar4 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            a0.w0 w0Var = (a0.w0) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis.Analyzer");
                            try {
                                gVar4.o(w0Var, (a0.r0) obj5);
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
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            try {
                                gVar5.b((a0.w0) obj6);
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
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            a0.w0 w0Var2 = (a0.w0) obj7;
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                gVar6.getClass();
                                if (w0Var2.C((int) jLongValue)) {
                                    w0Var2.J();
                                }
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
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.clearAnalyzer", mVarA, obj);
        if (gVar != null) {
            final int i11 = 2;
            gVar4.L(new ii.b() { // from class: ni.s0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i11) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) gVar32.f29394a.f6853d).a(((Long) obj3).longValue(), g.e((t0.b) list.get(1), (Long) list.get(2), (Range) list.get(3), (Long) list.get(4)));
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
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            a0.w0 w0Var = (a0.w0) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis.Analyzer");
                            try {
                                gVar42.o(w0Var, (a0.r0) obj5);
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
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            try {
                                gVar5.b((a0.w0) obj6);
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
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            a0.w0 w0Var2 = (a0.w0) obj7;
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                gVar6.getClass();
                                if (w0Var2.C((int) jLongValue)) {
                                    w0Var2.J();
                                }
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
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageAnalysis.setTargetRotation", mVarA, obj);
        if (gVar == null) {
            gVar5.L(null);
        } else {
            final int i12 = 3;
            gVar5.L(new ii.b() { // from class: ni.s0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i12) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) gVar32.f29394a.f6853d).a(((Long) obj3).longValue(), g.e((t0.b) list.get(1), (Long) list.get(2), (Range) list.get(3), (Long) list.get(4)));
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
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            a0.w0 w0Var = (a0.w0) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis.Analyzer");
                            try {
                                gVar42.o(w0Var, (a0.r0) obj5);
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
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            try {
                                gVar52.b((a0.w0) obj6);
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
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.ImageAnalysis");
                            a0.w0 w0Var2 = (a0.w0) obj7;
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                gVar6.getClass();
                                if (w0Var2.C((int) jLongValue)) {
                                    w0Var2.J();
                                }
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

    public static final nl.c N(Socket socket) throws IOException {
        Logger logger = nl.o.f29555a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        w wVar = new w(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        nl.c sink = new nl.c(outputStream, wVar);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new nl.c(wVar, sink);
    }

    public static void O(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + J(parcel, i));
    }

    public static final nl.d P(Socket socket) throws IOException {
        Logger logger = nl.o.f29555a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        w wVar = new w(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        nl.d source = new nl.d(inputStream, wVar);
        Intrinsics.checkNotNullParameter(source, "source");
        return new nl.d(wVar, source);
    }

    public static final long Q(int i, fk.d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(fk.d.f19475e) <= 0 ? u(fk.e.b(i, unit, fk.d.f19473c)) : R(i, unit);
    }

    public static final long R(long j10, fk.d sourceUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "unit");
        fk.d dVar = fk.d.f19473c;
        long jB = fk.e.b(4611686018426999999L, dVar, sourceUnit);
        if ((-jB) <= j10 && j10 <= jB) {
            return u(fk.e.b(j10, sourceUnit, dVar));
        }
        fk.d targetUnit = fk.d.f19474d;
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return s(ck.o.c(targetUnit.f19479b.convert(j10, sourceUnit.f19479b), -4611686018427387903L, 4611686018427387903L));
    }

    public static int S(Parcel parcel) {
        int i = parcel.readInt();
        int iJ = J(parcel, i);
        char c8 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c8 != 20293) {
            throw new qa.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i10 = iJ + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new qa.b(pe.a.g(new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i10).length()), iDataPosition, "Size read is invalid start=", i10, " end="), parcel);
    }

    public static ArrayList T(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public static ArrayList U(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public static void V(int i, Object[] objArr) {
        for (int i10 = 0; i10 < i; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(l7.o.j(i10, "at index ", new StringBuilder(String.valueOf(i10).length() + 9)));
            }
        }
    }

    public static void W(Parcel parcel, int i, int i10) {
        int iJ = J(parcel, i);
        if (iJ == i10) {
            return;
        }
        String hexString = Integer.toHexString(iJ);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iJ).length() + 4 + 1);
        om1.u(sb2, "Expected size ", i10, " got ", iJ);
        throw new qa.b(z.g(sb2, " (0x", hexString, ")"), parcel);
    }

    public static void X(Parcel parcel, int i, int i10) {
        if (i == i10) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        om1.u(sb2, "Expected size ", i10, " got ", i);
        throw new qa.b(z.g(sb2, " (0x", hexString, ")"), parcel);
    }

    public static boolean Y(byte b2) {
        return b2 > -65;
    }

    public static vk.p a(Function1 builderAction) {
        vk.b json = vk.c.f34872d;
        Intrinsics.checkNotNullParameter(json, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Intrinsics.checkNotNullParameter(json, "json");
        vk.i iVar = new vk.i();
        hi.h hVar = json.f34873a;
        iVar.f34885a = hVar.f20598c;
        iVar.f34886b = hVar.f20597b;
        String str = (String) hVar.f20600e;
        String discriminator = (String) hVar.f20601f;
        vk.a aVar = (vk.a) hVar.f20602g;
        boolean z5 = hVar.f20599d;
        t0 module = json.f34874b;
        builderAction.invoke(iVar);
        if (!Intrinsics.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        hi.h configuration = new hi.h(iVar.f34886b, iVar.f34885a, str, discriminator, z5, aVar);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        vk.p pVar = new vk.p(configuration, module);
        if (Intrinsics.a(module, xk.a.f36264a)) {
            return pVar;
        }
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        wk.k collector = new wk.k();
        module.getClass();
        Intrinsics.checkNotNullParameter(collector, "collector");
        d0.f27478b.getClass();
        kotlin.collections.a0.f27474b.getClass();
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long b(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.o.b(java.lang.String):long");
    }

    public static j1.k c(g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        j1.k kVarW = w(new a0.a0(9, g0Var));
        Intrinsics.checkNotNullExpressionValue(kVarW, "getFuture { completer ->…      }\n        tag\n    }");
        return kVarW;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = e(r8, r9, r10)
            boolean r1 = e(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = C(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.o.d(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final nl.q f(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        return new nl.q(vVar);
    }

    public static final r g(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return new r(xVar);
    }

    public static final Bundle h(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f27469b;
            Object obj = pair.f27470c;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static Bundle i(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iJ);
        return bundle;
    }

    public static byte[] j(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return bArrCreateByteArray;
    }

    public static int[] k(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return iArrCreateIntArray;
    }

    public static ArrayList l(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = parcel.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayList;
    }

    public static Parcelable m(Parcel parcel, int i, Parcelable.Creator creator) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iJ);
        return parcelable;
    }

    public static String n(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iJ);
        return string;
    }

    public static String[] o(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return strArrCreateStringArray;
    }

    public static ArrayList p(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayListCreateStringArrayList;
    }

    public static Object[] q(Parcel parcel, int i, Parcelable.Creator creator) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iJ);
        return objArrCreateTypedArray;
    }

    public static ArrayList r(Parcel parcel, int i, Parcelable.Creator creator) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayListCreateTypedArrayList;
    }

    public static final long s(long j10) {
        long j11 = (j10 << 1) + 1;
        fk.a aVar = fk.b.f19468c;
        int i = fk.c.f19472a;
        return j11;
    }

    public static final long t(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? s(ck.o.c(j10, -4611686018427387903L, 4611686018427387903L)) : u(j10 * ((long) 1000000));
    }

    public static final long u(long j10) {
        long j11 = j10 << 1;
        fk.a aVar = fk.b.f19468c;
        int i = fk.c.f19472a;
        return j11;
    }

    public static void v(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new qa.b(l7.o.j(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static j1.k w(j1.i iVar) {
        j1.h hVar = new j1.h();
        hVar.f26170c = new j1.l();
        j1.k kVar = new j1.k(hVar);
        hVar.f26169b = kVar;
        hVar.f26168a = iVar.getClass();
        try {
            Object objM = iVar.m(hVar);
            if (objM == null) {
                return kVar;
            }
            hVar.f26168a = objM;
            return kVar;
        } catch (Exception e3) {
            kVar.f26173c.l(e3);
            return kVar;
        }
    }

    public static Handler x() {
        if (f20806a != null) {
            return f20806a;
        }
        synchronized (o.class) {
            try {
                if (f20806a == null) {
                    f20806a = j0.g.F(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f20806a;
    }

    public static final boolean y(AssertionError assertionError) {
        Logger logger = nl.o.f29555a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.y(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean z(String str, u.p pVar) throws t1 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) pVar.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (u.a e3) {
            throw new t1(new a0.x(e3));
        }
    }
}
