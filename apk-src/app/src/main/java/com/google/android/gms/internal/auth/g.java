package com.google.android.gms.internal.auth;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.os.UserManager;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.z4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f13210a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f13211b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f13212c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f13213d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f13214e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f13215f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f13216g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f13217h = null;
    public static Method i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f13218j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f13219k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f13220l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f13221m = true;

    public static final void A(String str) {
        if (j8.a.f26576d) {
            if (str == null) {
                str = "null";
            }
            System.out.println((Object) str);
        }
    }

    public static final Bitmap B(Bitmap bitmap, int i10) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        if (i10 % 360 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        Intrinsics.b(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public static long C(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = ((j10 ^ j11) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j13 = j10 * j11;
            if (j10 == 0 || j13 / j10 == j11) {
                return j13;
            }
        }
        return j12;
    }

    public static final void D(kotlin.jvm.internal.j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        uk.a1 a1Var = uk.a1.f34493a;
    }

    public static void E(int i10, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            t6.a.d(i10, M(str));
            return;
        }
        String strM = M(str);
        try {
            if (f13218j == null) {
                f13218j = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f13218j.invoke(null, Long.valueOf(f13215f), strM, Integer.valueOf(i10));
        } catch (Exception e3) {
            s("traceCounter", e3);
        }
    }

    public static void H(ii.f binaryMessenger, final fj.t tVar) {
        a1.m mVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m nVar = (tVar == null || (mVar = tVar.f19420a) == null) ? new cj.n(1) : mVar.m();
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", nVar, obj);
        if (tVar != null) {
            final int i10 = 0;
            gVar.L(new ii.b() { // from class: fj.a0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i10) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                a1.m mVar2 = tVar2.f19420a;
                                ((c) mVar2.f363c).a(jLongValue, (s) mVar2.f366f);
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
                            return;
                        case 1:
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            s sVar = (s) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                tVar3.getClass();
                                try {
                                    String[] list2 = sVar.f19415a.list(str);
                                    listF2 = kotlin.collections.r.c(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3.getMessage());
                                }
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
                            return;
                        default:
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            s sVar2 = (s) obj6;
                            Object obj7 = list3.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                tVar4.getClass();
                                listF3 = kotlin.collections.r.c(((ci.e) sVar2.f19416b.f29407c).b(str2));
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
                            return;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", nVar, obj);
        if (tVar != null) {
            final int i11 = 1;
            gVar2.L(new ii.b() { // from class: fj.a0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i11) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                a1.m mVar2 = tVar2.f19420a;
                                ((c) mVar2.f363c).a(jLongValue, (s) mVar2.f366f);
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
                            return;
                        case 1:
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            s sVar = (s) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                tVar3.getClass();
                                try {
                                    String[] list2 = sVar.f19415a.list(str);
                                    listF2 = kotlin.collections.r.c(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3.getMessage());
                                }
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
                            return;
                        default:
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            s sVar2 = (s) obj6;
                            Object obj7 = list3.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                tVar4.getClass();
                                listF3 = kotlin.collections.r.c(((ci.e) sVar2.f19416b.f29407c).b(str2));
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
                            return;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", nVar, obj);
        if (tVar == null) {
            gVar3.L(null);
        } else {
            final int i12 = 2;
            gVar3.L(new ii.b() { // from class: fj.a0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i12) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                a1.m mVar2 = tVar2.f19420a;
                                ((c) mVar2.f363c).a(jLongValue, (s) mVar2.f366f);
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
                            return;
                        case 1:
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            s sVar = (s) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                tVar3.getClass();
                                try {
                                    String[] list2 = sVar.f19415a.list(str);
                                    listF2 = kotlin.collections.r.c(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3.getMessage());
                                }
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
                            return;
                        default:
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            s sVar2 = (s) obj6;
                            Object obj7 = list3.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                tVar4.getClass();
                                listF3 = kotlin.collections.r.c(((ci.e) sVar2.f19416b.f29407c).b(str2));
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
                            return;
                    }
                }
            });
        }
    }

    public static void I(ii.f binaryMessenger, final ni.f fVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = fVar != null ? fVar.f29389a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.pigeon_defaultConstructor", mVarA, obj);
        if (fVar != null) {
            final int i10 = 0;
            gVar.L(new ii.b() { // from class: ni.h0
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
                            int i11 = 0;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.AspectRatio");
                            d dVar = (d) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.AspectRatioStrategyFallbackRule");
                            e eVar = (e) obj5;
                            try {
                                fj.c cVar = (fj.c) fVar2.f29389a.f6853d;
                                int iOrdinal = dVar.ordinal();
                                int i12 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? -2 : -1 : 0 : 1;
                                int iOrdinal2 = eVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i11 = 1;
                                } else if (iOrdinal2 != 1) {
                                    i11 = -1;
                                }
                                cVar.a(jLongValue, new t0.a(i12, i11));
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
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj6).longValue(), t0.a.f33332d);
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
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj7).longValue(), t0.a.f33331c);
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
                        case 3:
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.AspectRatioStrategy");
                            t0.a aVar = (t0.a) obj8;
                            try {
                                fVar5.getClass();
                                int i13 = aVar.f33334b;
                                listF4 = kotlin.collections.r.c(i13 != 0 ? i13 != 1 ? e.f29381f : e.f29379d : e.f29380e);
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
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.AspectRatioStrategy");
                            t0.a aVar2 = (t0.a) obj9;
                            try {
                                fVar6.getClass();
                                int i14 = aVar2.f33333a;
                                listF5 = kotlin.collections.r.c(i14 != -1 ? i14 != 0 ? i14 != 1 ? d.f29368g : d.f29365d : d.f29366e : d.f29367f);
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
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.ratio_16_9FallbackAutoStrategy", mVarA, obj);
        if (fVar != null) {
            final int i11 = 1;
            gVar2.L(new ii.b() { // from class: ni.h0
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
                            int i112 = 0;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.AspectRatio");
                            d dVar = (d) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.AspectRatioStrategyFallbackRule");
                            e eVar = (e) obj5;
                            try {
                                fj.c cVar = (fj.c) fVar2.f29389a.f6853d;
                                int iOrdinal = dVar.ordinal();
                                int i12 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? -2 : -1 : 0 : 1;
                                int iOrdinal2 = eVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i112 = 1;
                                } else if (iOrdinal2 != 1) {
                                    i112 = -1;
                                }
                                cVar.a(jLongValue, new t0.a(i12, i112));
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
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj6).longValue(), t0.a.f33332d);
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
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj7).longValue(), t0.a.f33331c);
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
                        case 3:
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.AspectRatioStrategy");
                            t0.a aVar = (t0.a) obj8;
                            try {
                                fVar5.getClass();
                                int i13 = aVar.f33334b;
                                listF4 = kotlin.collections.r.c(i13 != 0 ? i13 != 1 ? e.f29381f : e.f29379d : e.f29380e);
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
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.AspectRatioStrategy");
                            t0.a aVar2 = (t0.a) obj9;
                            try {
                                fVar6.getClass();
                                int i14 = aVar2.f33333a;
                                listF5 = kotlin.collections.r.c(i14 != -1 ? i14 != 0 ? i14 != 1 ? d.f29368g : d.f29365d : d.f29366e : d.f29367f);
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
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.ratio_4_3FallbackAutoStrategy", mVarA, obj);
        if (fVar != null) {
            final int i12 = 2;
            gVar3.L(new ii.b() { // from class: ni.h0
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
                            int i112 = 0;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.AspectRatio");
                            d dVar = (d) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.AspectRatioStrategyFallbackRule");
                            e eVar = (e) obj5;
                            try {
                                fj.c cVar = (fj.c) fVar2.f29389a.f6853d;
                                int iOrdinal = dVar.ordinal();
                                int i122 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? -2 : -1 : 0 : 1;
                                int iOrdinal2 = eVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i112 = 1;
                                } else if (iOrdinal2 != 1) {
                                    i112 = -1;
                                }
                                cVar.a(jLongValue, new t0.a(i122, i112));
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
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj6).longValue(), t0.a.f33332d);
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
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj7).longValue(), t0.a.f33331c);
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
                        case 3:
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.AspectRatioStrategy");
                            t0.a aVar = (t0.a) obj8;
                            try {
                                fVar5.getClass();
                                int i13 = aVar.f33334b;
                                listF4 = kotlin.collections.r.c(i13 != 0 ? i13 != 1 ? e.f29381f : e.f29379d : e.f29380e);
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
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.AspectRatioStrategy");
                            t0.a aVar2 = (t0.a) obj9;
                            try {
                                fVar6.getClass();
                                int i14 = aVar2.f33333a;
                                listF5 = kotlin.collections.r.c(i14 != -1 ? i14 != 0 ? i14 != 1 ? d.f29368g : d.f29365d : d.f29366e : d.f29367f);
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
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.getFallbackRule", mVarA, obj);
        if (fVar != null) {
            final int i13 = 3;
            gVar4.L(new ii.b() { // from class: ni.h0
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
                            int i112 = 0;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.AspectRatio");
                            d dVar = (d) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.AspectRatioStrategyFallbackRule");
                            e eVar = (e) obj5;
                            try {
                                fj.c cVar = (fj.c) fVar2.f29389a.f6853d;
                                int iOrdinal = dVar.ordinal();
                                int i122 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? -2 : -1 : 0 : 1;
                                int iOrdinal2 = eVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i112 = 1;
                                } else if (iOrdinal2 != 1) {
                                    i112 = -1;
                                }
                                cVar.a(jLongValue, new t0.a(i122, i112));
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
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj6).longValue(), t0.a.f33332d);
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
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj7).longValue(), t0.a.f33331c);
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
                        case 3:
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.AspectRatioStrategy");
                            t0.a aVar = (t0.a) obj8;
                            try {
                                fVar5.getClass();
                                int i132 = aVar.f33334b;
                                listF4 = kotlin.collections.r.c(i132 != 0 ? i132 != 1 ? e.f29381f : e.f29379d : e.f29380e);
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
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.AspectRatioStrategy");
                            t0.a aVar2 = (t0.a) obj9;
                            try {
                                fVar6.getClass();
                                int i14 = aVar2.f33333a;
                                listF5 = kotlin.collections.r.c(i14 != -1 ? i14 != 0 ? i14 != 1 ? d.f29368g : d.f29365d : d.f29366e : d.f29367f);
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
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.getPreferredAspectRatio", mVarA, obj);
        if (fVar == null) {
            gVar5.L(null);
        } else {
            final int i14 = 4;
            gVar5.L(new ii.b() { // from class: ni.h0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i14) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            int i112 = 0;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.AspectRatio");
                            d dVar = (d) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.AspectRatioStrategyFallbackRule");
                            e eVar = (e) obj5;
                            try {
                                fj.c cVar = (fj.c) fVar2.f29389a.f6853d;
                                int iOrdinal = dVar.ordinal();
                                int i122 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? -2 : -1 : 0 : 1;
                                int iOrdinal2 = eVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i112 = 1;
                                } else if (iOrdinal2 != 1) {
                                    i112 = -1;
                                }
                                cVar.a(jLongValue, new t0.a(i122, i112));
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
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj6).longValue(), t0.a.f33332d);
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
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj7).longValue(), t0.a.f33331c);
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
                        case 3:
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj2).get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.AspectRatioStrategy");
                            t0.a aVar = (t0.a) obj8;
                            try {
                                fVar5.getClass();
                                int i132 = aVar.f33334b;
                                listF4 = kotlin.collections.r.c(i132 != 0 ? i132 != 1 ? e.f29381f : e.f29379d : e.f29380e);
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
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.resolutionselector.AspectRatioStrategy");
                            t0.a aVar2 = (t0.a) obj9;
                            try {
                                fVar6.getClass();
                                int i142 = aVar2.f33333a;
                                listF5 = kotlin.collections.r.c(i142 != -1 ? i142 != 0 ? i142 != 1 ? d.f29368g : d.f29365d : d.f29366e : d.f29367f);
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

    public static void J(ii.f binaryMessenger, final ni.m mVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = mVar != null ? mVar.f29437a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Recording.close", mVarA, obj);
        if (mVar != null) {
            final int i10 = 0;
            gVar.L(new ii.b() { // from class: ni.c1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i10) {
                        case 0:
                            m mVar2 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var = (x0.d0) obj3;
                            try {
                                mVar2.getClass();
                                d0Var.close();
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
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var2 = (x0.d0) obj4;
                            try {
                                mVar3.getClass();
                                m.b(d0Var2);
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
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var3 = (x0.d0) obj5;
                            try {
                                mVar4.getClass();
                                m.i(d0Var3);
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
                            m mVar5 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var4 = (x0.d0) obj6;
                            try {
                                mVar5.getClass();
                                d0Var4.close();
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
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Recording.pause", mVarA, obj);
        if (mVar != null) {
            final int i11 = 1;
            gVar2.L(new ii.b() { // from class: ni.c1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i11) {
                        case 0:
                            m mVar2 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var = (x0.d0) obj3;
                            try {
                                mVar2.getClass();
                                d0Var.close();
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
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var2 = (x0.d0) obj4;
                            try {
                                mVar3.getClass();
                                m.b(d0Var2);
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
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var3 = (x0.d0) obj5;
                            try {
                                mVar4.getClass();
                                m.i(d0Var3);
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
                            m mVar5 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var4 = (x0.d0) obj6;
                            try {
                                mVar5.getClass();
                                d0Var4.close();
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
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Recording.resume", mVarA, obj);
        if (mVar != null) {
            final int i12 = 2;
            gVar3.L(new ii.b() { // from class: ni.c1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i12) {
                        case 0:
                            m mVar2 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var = (x0.d0) obj3;
                            try {
                                mVar2.getClass();
                                d0Var.close();
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
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var2 = (x0.d0) obj4;
                            try {
                                mVar3.getClass();
                                m.b(d0Var2);
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
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var3 = (x0.d0) obj5;
                            try {
                                mVar4.getClass();
                                m.i(d0Var3);
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
                            m mVar5 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var4 = (x0.d0) obj6;
                            try {
                                mVar5.getClass();
                                d0Var4.close();
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
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Recording.stop", mVarA, obj);
        if (mVar == null) {
            gVar4.L(null);
        } else {
            final int i13 = 3;
            gVar4.L(new ii.b() { // from class: ni.c1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i13) {
                        case 0:
                            m mVar2 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var = (x0.d0) obj3;
                            try {
                                mVar2.getClass();
                                d0Var.close();
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
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var2 = (x0.d0) obj4;
                            try {
                                mVar3.getClass();
                                m.b(d0Var2);
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
                            m mVar4 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var3 = (x0.d0) obj5;
                            try {
                                mVar4.getClass();
                                m.i(d0Var3);
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
                            m mVar5 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.Recording");
                            x0.d0 d0Var4 = (x0.d0) obj6;
                            try {
                                mVar5.getClass();
                                d0Var4.close();
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

    public static int K(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static String L(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static String M(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final boolean N(String str, Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            boolean zBooleanValue = ((Boolean) block.invoke()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static void O(String str, String str2) {
        String strL = L(str);
        if (y(5, strL)) {
            Log.w(strL, str2);
        }
    }

    public static void P(String str, String str2, Throwable th2) {
        String strL = L(str);
        if (y(5, strL)) {
            Log.w(strL, str2, th2);
        }
    }

    public static String Q(z4 z4Var) {
        StringBuilder sb2 = new StringBuilder(z4Var.e());
        for (int i10 = 0; i10 < z4Var.e(); i10++) {
            byte bA = z4Var.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final float b(Bitmap bitmap, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        float width = bitmap.getWidth() / i10;
        float height = bitmap.getHeight() / i11;
        A("width scale = " + width);
        A("height scale = " + height);
        return Math.max(1.0f, Math.min(width, height));
    }

    public static final byte[] c(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        A("src width = " + width);
        A("src height = " + height);
        float fB = b(bitmap, i10, i11);
        A("scale = " + fB);
        float f10 = width / fB;
        float f11 = height / fB;
        A("dst width = " + f10);
        A("dst height = " + f11);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f10, (int) f11, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        B(bitmapCreateScaledBitmap, i13).compress(i14 != 1 ? i14 != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG, i12, outputStream);
        byte[] byteArray = outputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static zk.r d(String name, String str, zk.b0 body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("form-data; name=");
        zk.p pVar = zk.s.f46442e;
        a0.e.c(sb2, name);
        if (str != null) {
            sb2.append("; filename=");
            a0.e.c(sb2, str);
        }
        String value = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(value, "StringBuilder().apply(builderAction).toString()");
        ArrayList arrayList = new ArrayList(20);
        Intrinsics.checkNotNullParameter("Content-Disposition", "name");
        Intrinsics.checkNotNullParameter(value, "value");
        for (int i10 = 0; i10 < 19; i10++) {
            char cCharAt = "Content-Disposition".charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(al.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), "Content-Disposition").toString());
            }
        }
        Intrinsics.checkNotNullParameter("Content-Disposition", "name");
        Intrinsics.checkNotNullParameter(value, "value");
        arrayList.add("Content-Disposition");
        arrayList.add(StringsKt.P(value).toString());
        zk.k kVar = new zk.k((String[]) arrayList.toArray(new String[0]));
        Intrinsics.checkNotNullParameter(body, "body");
        if (kVar.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (kVar.a("Content-Length") == null) {
            return new zk.r(kVar, body);
        }
        throw new IllegalArgumentException("Unexpected header: Content-Length");
    }

    public static void e(String str, String str2) {
        String strL = L(str);
        if (y(3, strL)) {
            Log.d(strL, str2);
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        String strL = L(str);
        if (y(3, strL)) {
            Log.d(strL, str2, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean g(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            IntRange intRangeN = kotlin.collections.p.n(objArr);
            if ((intRangeN instanceof Collection) && ((Collection) intRangeN).isEmpty()) {
                return true;
            }
            ck.g gVarA = intRangeN.iterator();
            while (gVarA.f2383d) {
                int iNextInt = gVarA.nextInt();
                if (!g(objArr[iNextInt], objArr2[iNextInt])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            IntRange intRangeD = kotlin.collections.s.d((Collection) obj);
            if ((intRangeD instanceof Collection) && ((Collection) intRangeD).isEmpty()) {
                return true;
            }
            ck.g gVarA2 = intRangeD.iterator();
            while (gVarA2.f2383d) {
                int iNextInt2 = gVarA2.nextInt();
                if (!g(list.get(iNextInt2), list2.get(iNextInt2))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return Intrinsics.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !g(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = g2.n0.f19900a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = g2.m0.f19891d;
        g2.m0 m0Var = (g2.m0) view.getTag(com.twinby.R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (m0Var == null) {
            m0Var = new g2.m0();
            m0Var.f19892a = null;
            m0Var.f19893b = null;
            m0Var.f19894c = null;
            view.setTag(com.twinby.R.id.tag_unhandled_key_event_manager, m0Var);
        }
        WeakReference weakReference2 = m0Var.f19894c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        m0Var.f19894c = new WeakReference(keyEvent);
        if (m0Var.f19893b == null) {
            m0Var.f19893b = new SparseArray();
        }
        SparseArray sparseArray = m0Var.f19893b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(com.twinby.R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long i(long j10, long j11, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 == 0) {
            return j12;
        }
        int i10 = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (cd.e.f2268a[roundingMode.ordinal()]) {
            case 1:
                m.d(j13 == 0);
                return j12;
            case 2:
                return j12;
            case 3:
                if (i10 >= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
            case 4:
                return j12 + ((long) i10);
            case 5:
                if (i10 <= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j13);
                long jAbs2 = jAbs - (Math.abs(j11) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                        return j12;
                    }
                } else if (jAbs2 <= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
            default:
                throw new AssertionError();
        }
    }

    public static boolean j(Method method, kotlin.jvm.internal.i clazz) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Class clazz2 = h5.t(clazz);
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz2, "clazz");
        return method.getReturnType().equals(clazz2);
    }

    public static void k(String str, String str2) {
        String strL = L(str);
        if (y(6, strL)) {
            Log.e(strL, str2);
        }
    }

    public static void l(String str, String str2, Throwable th2) {
        String strL = L(str);
        if (y(6, strL)) {
            Log.e(strL, str2, th2);
        }
    }

    public static long m(long j10, long j11) {
        m.c(j10, "a");
        m.c(j11, "b");
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long jNumberOfTrailingZeros = j10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j12) {
            long j13 = jNumberOfTrailingZeros - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static Context n(Context context) {
        int iG;
        Context applicationContext = context.getApplicationContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34 && (iG = f0.g.g(context)) != f0.g.g(applicationContext)) {
            applicationContext = f0.g.a(applicationContext, iG);
        }
        if (i10 >= 30) {
            String strC = g2.t0.c(context);
            if (!Objects.equals(strC, g2.t0.c(applicationContext))) {
                return g2.t0.a(applicationContext, strC);
            }
        }
        return applicationContext;
    }

    public static int o(Context context, int i10, int i11) {
        TypedValue typedValueT = m.t(context, i10);
        if (typedValueT == null) {
            return i11;
        }
        int i12 = typedValueT.resourceId;
        return i12 != 0 ? context.getColor(i12) : typedValueT.data;
    }

    public static int p(View view, int i10) {
        Context context = view.getContext();
        TypedValue typedValueU = m.u(view.getContext(), view.getClass().getCanonicalName(), i10);
        int i11 = typedValueU.resourceId;
        return i11 != 0 ? context.getColor(i11) : typedValueU.data;
    }

    public static final qk.a q(qk.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.getDescriptor().c() ? aVar : new uk.n0(aVar);
    }

    public static void s(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static void t(String str, String str2) {
        String strL = L(str);
        if (y(4, strL)) {
            Log.i(strL, str2);
        }
    }

    public static boolean u(int i10) {
        if (i10 == 0) {
            return false;
        }
        ThreadLocal threadLocal = x1.a.f35687a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = ((double) iRed) / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) iGreen) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) iBlue) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d > 0.5d;
    }

    public static boolean v(String str) {
        return y(3, L(str));
    }

    public static boolean w() {
        if (Build.VERSION.SDK_INT >= 29) {
            return t6.a.c();
        }
        try {
            if (f13216g == null) {
                f13215f = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f13216g = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f13216g.invoke(null, Long.valueOf(f13215f))).booleanValue();
        } catch (Exception e3) {
            s("isTagEnabled", e3);
            return false;
        }
    }

    public static boolean x(s3.q qVar) {
        Boolean bool;
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            qVar.getClass();
            bool = (Boolean) ((u.i) qVar.f32631c).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e3) {
            if (w.a.f34941a.i(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                e("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                l("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e3);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            O("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean y(int i10, String str) {
        return f13212c <= i10 || Log.isLoggable(str, i10);
    }

    public static int z(float f10, int i10, int i11) {
        return x1.a.c(x1.a.e(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public void F(View view, float f10) {
        if (f13221m) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f13221m = false;
            }
        }
        view.setAlpha(f10);
    }

    public void G(View view, int i10) {
        if (!f13220l) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f13219k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f13220l = true;
        }
        Field field = f13219k;
        if (field != null) {
            try {
                f13219k.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public float r(View view) {
        if (f13221m) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f13221m = false;
            }
        }
        return view.getAlpha();
    }
}
