package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads.xt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile zc.f f13838a;

    public static Object A(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th2) {
            u9.i.f("Unexpected exception.", th2);
            xt.a(context).c("StrictModeUtil.runWithLaxStrictMode", th2);
            return null;
        }
    }

    public static final void a(cl.a aVar, cl.c cVar, String str) {
        cl.d.f2407h.getClass();
        Logger logger = cl.d.f2408j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f2402b);
        sb2.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(aVar.f2395a);
        logger.fine(sb2.toString());
    }

    public static Bitmap b(Bitmap bitmap, int i) {
        if (bitmap != null) {
            switch (i) {
                case 1:
                case 3:
                case 6:
                case 8:
                    break;
                case 2:
                case 4:
                case 5:
                case 7:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i == 2 || i == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i == 4 || i == 5) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (bitmapCreateBitmap != bitmap) {
                        bitmap.recycle();
                    }
                    break;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i);
                    break;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static p3.l c(w3.m mVar, String str, w3.j jVar, int i) {
        Map map = Collections.EMPTY_MAP;
        Uri uriQ = m3.b.q(str, jVar.f35071c);
        long j10 = jVar.f35069a;
        long j11 = jVar.f35070b;
        String strA = mVar.a();
        if (strA == null) {
            strA = m3.b.q(((w3.b) mVar.f35077c.get(0)).f35025a, jVar.f35071c).toString();
        }
        String str2 = strA;
        h5.m(uriQ, "The uri must be set.");
        return new p3.l(uriQ, 0L, 1, null, ad.g1.f796h, j10, j11, str2, i);
    }

    public static final sk.g d(String serialName, h5 kind, sk.f[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.D(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (kind.equals(sk.i.f32937b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        sk.a aVar = new sk.a(serialName);
        builder.invoke(aVar);
        return new sk.g(serialName, kind, aVar.f32910c.size(), kotlin.collections.p.v(typeParameters), aVar);
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static void g(p3.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] h(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void i(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static void j(x2.b bVar, i0.c cVar, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i10 = bVar.read(bArr, 0, iMin);
            if (i10 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i10;
            cVar.write(bArr, 0, i10);
        }
    }

    public static Uri k(File file, File file2) throws a0.l1 {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new a0.l1("Failed to overwrite the file: " + file2.getAbsolutePath(), null, 1);
    }

    public static File l(a0.g0 g0Var) throws a0.l1 {
        try {
            File file = (File) g0Var.f87c;
            if (file == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            String parent = file.getParent();
            StringBuilder sb2 = new StringBuilder("CameraX");
            sb2.append(UUID.randomUUID().toString());
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            sb2.append(iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "");
            return new File(parent, sb2.toString());
        } catch (IOException e3) {
            throw new a0.l1("Failed to create temp file.", e3, 1);
        }
    }

    public static androidx.lifecycle.w0 m(Class modelClass) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Constructor declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + modelClass);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                Intrinsics.b(objNewInstance);
                return (androidx.lifecycle.w0) objNewInstance;
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
            }
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        }
    }

    public static boolean n(String str, String str2) {
        char c8;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == str2.charAt(i) || ((c8 = (char) ((r3 | ' ') - 97)) < 26 && c8 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String o(long j10) {
        String str = String.format("%6s", Arrays.copyOf(new Object[]{j10 <= -999500000 ? pe.a.h(new StringBuilder(), (j10 - ((long) 500000000)) / ((long) 1000000000), " s ") : j10 <= -999500 ? pe.a.h(new StringBuilder(), (j10 - ((long) 500000)) / ((long) 1000000), " ms") : j10 <= 0 ? pe.a.h(new StringBuilder(), (j10 - ((long) 500)) / ((long) 1000), " µs") : j10 < 999500 ? pe.a.h(new StringBuilder(), (j10 + ((long) 500)) / ((long) 1000), " µs") : j10 < 999500000 ? pe.a.h(new StringBuilder(), (j10 + ((long) 500000)) / ((long) 1000000), " ms") : pe.a.h(new StringBuilder(), (j10 + ((long) 500000000)) / ((long) 1000000000), " s ")}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public static void p(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (h5.v(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z5 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (Build.VERSION.SDK_INT >= 29) {
            new com.google.firebase.messaging.u(0, context, new sb.g(), z5).run();
        } else {
            b4.s(null);
        }
    }

    public static boolean q(char c8) {
        return c8 >= 'A' && c8 <= 'Z';
    }

    public static Typeface r(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, com.google.android.gms.internal.auth.m.e(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static void s(File file, a0.g0 g0Var) {
        try {
            try {
                g0Var.getClass();
                File file2 = (File) g0Var.f87c;
                if (file2 != null) {
                    Objects.requireNonNull(file2);
                    k(file, file2);
                }
            } catch (IOException unused) {
                throw new a0.l1("Failed to write to OutputStream.", null, 1);
            }
        } finally {
            file.delete();
        }
    }

    public static void t(ii.f binaryMessenger, final fj.m mVar) {
        a1.m mVar2;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m nVar = (mVar == null || (mVar2 = mVar.f19374a) == null) ? new cj.n(1) : mVar2.m();
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", nVar, obj);
        if (mVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: fj.f0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    int i10 = i;
                    m mVar3 = mVar;
                    int i11 = 0;
                    Intrinsics.checkNotNullParameter(reply, "reply");
                    switch (i10) {
                        case 0:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                mVar3.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                mVar3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                mVar3.getClass();
                                listF3 = kotlin.collections.r.c(new b1(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                mVar3.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                mVar3.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            w wVar = (w) obj15;
                            try {
                                mVar3.getClass();
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    a1.m mVar4 = mVar3.f19374a;
                                    w wVar2 = w.f19441d;
                                    mVar4.getClass();
                                    throw new IllegalArgumentException(wVar2 + " doesn't represent a native value.");
                                }
                                listF6 = kotlin.collections.r.c(null);
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
                            return;
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                mVar3.getClass();
                                if (list7.isEmpty()) {
                                    k0 k0Var = new k0(8);
                                    Field field = g2.n0.f19900a;
                                    g2.f0.c(view7, k0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    int i12 = 0;
                                    while (it.hasNext()) {
                                        switch (((e1) it.next()).ordinal()) {
                                            case 0:
                                                i12 |= 519;
                                                break;
                                            case 1:
                                                i12 |= 128;
                                                break;
                                            case 2:
                                                i12 |= 4;
                                                break;
                                            case 3:
                                                i12 |= 8;
                                                break;
                                            case 4:
                                                i12 |= 32;
                                                break;
                                            case 5:
                                                i12 |= 2;
                                                break;
                                            case 6:
                                                i12 |= 1;
                                                break;
                                            case 7:
                                                i12 |= 16;
                                                break;
                                            case 8:
                                                i12 |= 64;
                                                break;
                                        }
                                    }
                                    o0 o0Var = new o0(i12, i11);
                                    Field field2 = g2.n0.f19900a;
                                    g2.f0.c(view7, o0Var);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", nVar, obj);
        if (mVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: fj.f0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    int i102 = i10;
                    m mVar3 = mVar;
                    int i11 = 0;
                    Intrinsics.checkNotNullParameter(reply, "reply");
                    switch (i102) {
                        case 0:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                mVar3.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                mVar3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                mVar3.getClass();
                                listF3 = kotlin.collections.r.c(new b1(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                mVar3.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                mVar3.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            w wVar = (w) obj15;
                            try {
                                mVar3.getClass();
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    a1.m mVar4 = mVar3.f19374a;
                                    w wVar2 = w.f19441d;
                                    mVar4.getClass();
                                    throw new IllegalArgumentException(wVar2 + " doesn't represent a native value.");
                                }
                                listF6 = kotlin.collections.r.c(null);
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
                            return;
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                mVar3.getClass();
                                if (list7.isEmpty()) {
                                    k0 k0Var = new k0(8);
                                    Field field = g2.n0.f19900a;
                                    g2.f0.c(view7, k0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    int i12 = 0;
                                    while (it.hasNext()) {
                                        switch (((e1) it.next()).ordinal()) {
                                            case 0:
                                                i12 |= 519;
                                                break;
                                            case 1:
                                                i12 |= 128;
                                                break;
                                            case 2:
                                                i12 |= 4;
                                                break;
                                            case 3:
                                                i12 |= 8;
                                                break;
                                            case 4:
                                                i12 |= 32;
                                                break;
                                            case 5:
                                                i12 |= 2;
                                                break;
                                            case 6:
                                                i12 |= 1;
                                                break;
                                            case 7:
                                                i12 |= 16;
                                                break;
                                            case 8:
                                                i12 |= 64;
                                                break;
                                        }
                                    }
                                    o0 o0Var = new o0(i12, i11);
                                    Field field2 = g2.n0.f19900a;
                                    g2.f0.c(view7, o0Var);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", nVar, obj);
        if (mVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: fj.f0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    int i102 = i11;
                    m mVar3 = mVar;
                    int i112 = 0;
                    Intrinsics.checkNotNullParameter(reply, "reply");
                    switch (i102) {
                        case 0:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                mVar3.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                mVar3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                mVar3.getClass();
                                listF3 = kotlin.collections.r.c(new b1(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                mVar3.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                mVar3.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            w wVar = (w) obj15;
                            try {
                                mVar3.getClass();
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    a1.m mVar4 = mVar3.f19374a;
                                    w wVar2 = w.f19441d;
                                    mVar4.getClass();
                                    throw new IllegalArgumentException(wVar2 + " doesn't represent a native value.");
                                }
                                listF6 = kotlin.collections.r.c(null);
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
                            return;
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                mVar3.getClass();
                                if (list7.isEmpty()) {
                                    k0 k0Var = new k0(8);
                                    Field field = g2.n0.f19900a;
                                    g2.f0.c(view7, k0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    int i12 = 0;
                                    while (it.hasNext()) {
                                        switch (((e1) it.next()).ordinal()) {
                                            case 0:
                                                i12 |= 519;
                                                break;
                                            case 1:
                                                i12 |= 128;
                                                break;
                                            case 2:
                                                i12 |= 4;
                                                break;
                                            case 3:
                                                i12 |= 8;
                                                break;
                                            case 4:
                                                i12 |= 32;
                                                break;
                                            case 5:
                                                i12 |= 2;
                                                break;
                                            case 6:
                                                i12 |= 1;
                                                break;
                                            case 7:
                                                i12 |= 16;
                                                break;
                                            case 8:
                                                i12 |= 64;
                                                break;
                                        }
                                    }
                                    o0 o0Var = new o0(i12, i112);
                                    Field field2 = g2.n0.f19900a;
                                    g2.f0.c(view7, o0Var);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", nVar, obj);
        if (mVar != null) {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: fj.f0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    int i102 = i12;
                    m mVar3 = mVar;
                    int i112 = 0;
                    Intrinsics.checkNotNullParameter(reply, "reply");
                    switch (i102) {
                        case 0:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                mVar3.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                mVar3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                mVar3.getClass();
                                listF3 = kotlin.collections.r.c(new b1(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                mVar3.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                mVar3.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            w wVar = (w) obj15;
                            try {
                                mVar3.getClass();
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    a1.m mVar4 = mVar3.f19374a;
                                    w wVar2 = w.f19441d;
                                    mVar4.getClass();
                                    throw new IllegalArgumentException(wVar2 + " doesn't represent a native value.");
                                }
                                listF6 = kotlin.collections.r.c(null);
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
                            return;
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                mVar3.getClass();
                                if (list7.isEmpty()) {
                                    k0 k0Var = new k0(8);
                                    Field field = g2.n0.f19900a;
                                    g2.f0.c(view7, k0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    int i122 = 0;
                                    while (it.hasNext()) {
                                        switch (((e1) it.next()).ordinal()) {
                                            case 0:
                                                i122 |= 519;
                                                break;
                                            case 1:
                                                i122 |= 128;
                                                break;
                                            case 2:
                                                i122 |= 4;
                                                break;
                                            case 3:
                                                i122 |= 8;
                                                break;
                                            case 4:
                                                i122 |= 32;
                                                break;
                                            case 5:
                                                i122 |= 2;
                                                break;
                                            case 6:
                                                i122 |= 1;
                                                break;
                                            case 7:
                                                i122 |= 16;
                                                break;
                                            case 8:
                                                i122 |= 64;
                                                break;
                                        }
                                    }
                                    o0 o0Var = new o0(i122, i112);
                                    Field field2 = g2.n0.f19900a;
                                    g2.f0.c(view7, o0Var);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", nVar, obj);
        if (mVar != null) {
            final int i13 = 4;
            gVar5.L(new ii.b() { // from class: fj.f0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    int i102 = i13;
                    m mVar3 = mVar;
                    int i112 = 0;
                    Intrinsics.checkNotNullParameter(reply, "reply");
                    switch (i102) {
                        case 0:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                mVar3.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                mVar3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                mVar3.getClass();
                                listF3 = kotlin.collections.r.c(new b1(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                mVar3.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                mVar3.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            w wVar = (w) obj15;
                            try {
                                mVar3.getClass();
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    a1.m mVar4 = mVar3.f19374a;
                                    w wVar2 = w.f19441d;
                                    mVar4.getClass();
                                    throw new IllegalArgumentException(wVar2 + " doesn't represent a native value.");
                                }
                                listF6 = kotlin.collections.r.c(null);
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
                            return;
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                mVar3.getClass();
                                if (list7.isEmpty()) {
                                    k0 k0Var = new k0(8);
                                    Field field = g2.n0.f19900a;
                                    g2.f0.c(view7, k0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    int i122 = 0;
                                    while (it.hasNext()) {
                                        switch (((e1) it.next()).ordinal()) {
                                            case 0:
                                                i122 |= 519;
                                                break;
                                            case 1:
                                                i122 |= 128;
                                                break;
                                            case 2:
                                                i122 |= 4;
                                                break;
                                            case 3:
                                                i122 |= 8;
                                                break;
                                            case 4:
                                                i122 |= 32;
                                                break;
                                            case 5:
                                                i122 |= 2;
                                                break;
                                            case 6:
                                                i122 |= 1;
                                                break;
                                            case 7:
                                                i122 |= 16;
                                                break;
                                            case 8:
                                                i122 |= 64;
                                                break;
                                        }
                                    }
                                    o0 o0Var = new o0(i122, i112);
                                    Field field2 = g2.n0.f19900a;
                                    g2.f0.c(view7, o0Var);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", nVar, obj);
        if (mVar != null) {
            final int i14 = 5;
            gVar6.L(new ii.b() { // from class: fj.f0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    int i102 = i14;
                    m mVar3 = mVar;
                    int i112 = 0;
                    Intrinsics.checkNotNullParameter(reply, "reply");
                    switch (i102) {
                        case 0:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                mVar3.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                mVar3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                mVar3.getClass();
                                listF3 = kotlin.collections.r.c(new b1(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                mVar3.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                mVar3.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            w wVar = (w) obj15;
                            try {
                                mVar3.getClass();
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    a1.m mVar4 = mVar3.f19374a;
                                    w wVar2 = w.f19441d;
                                    mVar4.getClass();
                                    throw new IllegalArgumentException(wVar2 + " doesn't represent a native value.");
                                }
                                listF6 = kotlin.collections.r.c(null);
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
                            return;
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                mVar3.getClass();
                                if (list7.isEmpty()) {
                                    k0 k0Var = new k0(8);
                                    Field field = g2.n0.f19900a;
                                    g2.f0.c(view7, k0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    int i122 = 0;
                                    while (it.hasNext()) {
                                        switch (((e1) it.next()).ordinal()) {
                                            case 0:
                                                i122 |= 519;
                                                break;
                                            case 1:
                                                i122 |= 128;
                                                break;
                                            case 2:
                                                i122 |= 4;
                                                break;
                                            case 3:
                                                i122 |= 8;
                                                break;
                                            case 4:
                                                i122 |= 32;
                                                break;
                                            case 5:
                                                i122 |= 2;
                                                break;
                                            case 6:
                                                i122 |= 1;
                                                break;
                                            case 7:
                                                i122 |= 16;
                                                break;
                                            case 8:
                                                i122 |= 64;
                                                break;
                                        }
                                    }
                                    o0 o0Var = new o0(i122, i112);
                                    Field field2 = g2.n0.f19900a;
                                    g2.f0.c(view7, o0Var);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar6.L(null);
        }
        s7.g gVar7 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setInsetListenerToSetInsetsToZero", nVar, obj);
        if (mVar == null) {
            gVar7.L(null);
        } else {
            final int i15 = 6;
            gVar7.L(new ii.b() { // from class: fj.f0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    List listF7;
                    int i102 = i15;
                    m mVar3 = mVar;
                    int i112 = 0;
                    Intrinsics.checkNotNullParameter(reply, "reply");
                    switch (i102) {
                        case 0:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                mVar3.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                mVar3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                mVar3.getClass();
                                listF3 = kotlin.collections.r.c(new b1(view3.getScrollX(), view3.getScrollY()));
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
                        case 3:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                mVar3.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                mVar3.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            Intrinsics.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            Intrinsics.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            w wVar = (w) obj15;
                            try {
                                mVar3.getClass();
                                int iOrdinal = wVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    a1.m mVar4 = mVar3.f19374a;
                                    w wVar2 = w.f19441d;
                                    mVar4.getClass();
                                    throw new IllegalArgumentException(wVar2 + " doesn't represent a native value.");
                                }
                                listF6 = kotlin.collections.r.c(null);
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
                            return;
                        default:
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            Intrinsics.c(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            Intrinsics.c(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                mVar3.getClass();
                                if (list7.isEmpty()) {
                                    k0 k0Var = new k0(8);
                                    Field field = g2.n0.f19900a;
                                    g2.f0.c(view7, k0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    int i122 = 0;
                                    while (it.hasNext()) {
                                        switch (((e1) it.next()).ordinal()) {
                                            case 0:
                                                i122 |= 519;
                                                break;
                                            case 1:
                                                i122 |= 128;
                                                break;
                                            case 2:
                                                i122 |= 4;
                                                break;
                                            case 3:
                                                i122 |= 8;
                                                break;
                                            case 4:
                                                i122 |= 32;
                                                break;
                                            case 5:
                                                i122 |= 2;
                                                break;
                                            case 6:
                                                i122 |= 1;
                                                break;
                                            case 7:
                                                i122 |= 16;
                                                break;
                                            case 8:
                                                i122 |= 64;
                                                break;
                                        }
                                    }
                                    o0 o0Var = new o0(i122, i112);
                                    Field field2 = g2.n0.f19900a;
                                    g2.f0.c(view7, o0Var);
                                }
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
                            return;
                    }
                }
            });
        }
    }

    public static void u(ii.f binaryMessenger, final ni.f fVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = fVar != null ? fVar.f29389a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraSelector.pigeon_defaultConstructor", mVarA, obj);
        if (fVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.n0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            b0 b0Var = (b0) list.get(1);
                            final g0.d0 d0Var = (g0.d0) list.get(2);
                            try {
                                fj.c cVar = (fj.c) fVar2.f29389a.f6853d;
                                a7.l lVar = new a7.l();
                                LinkedHashSet linkedHashSet = (LinkedHashSet) lVar.f491c;
                                if (b0Var != null) {
                                    int iOrdinal = b0Var.ordinal();
                                    if (iOrdinal == 0) {
                                        lVar.i(0);
                                    } else if (iOrdinal == 1) {
                                        lVar.i(1);
                                    } else if (iOrdinal == 2) {
                                        lVar.i(2);
                                    } else if (iOrdinal == 3) {
                                        lVar.i(-1);
                                    }
                                }
                                if (d0Var != null) {
                                    linkedHashSet.add(new a0.t() { // from class: ni.l
                                        @Override // a0.t
                                        public final List a(List list2) {
                                            return Collections.singletonList(d0Var);
                                        }
                                    });
                                }
                                cVar.a(jLongValue, new a0.w(linkedHashSet));
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
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj4).longValue(), a0.w.f238c);
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
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj5).longValue(), a0.w.f237b);
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
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.CameraSelector");
                            a0.w wVar = (a0.w) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.CameraInfo>");
                            List list3 = (List) obj7;
                            try {
                                fVar5.getClass();
                                listF4 = kotlin.collections.r.c(wVar.a(list3));
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
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraSelector.defaultBackCamera", mVarA, obj);
        if (fVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.n0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i10) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            b0 b0Var = (b0) list.get(1);
                            final g0.d0 d0Var = (g0.d0) list.get(2);
                            try {
                                fj.c cVar = (fj.c) fVar2.f29389a.f6853d;
                                a7.l lVar = new a7.l();
                                LinkedHashSet linkedHashSet = (LinkedHashSet) lVar.f491c;
                                if (b0Var != null) {
                                    int iOrdinal = b0Var.ordinal();
                                    if (iOrdinal == 0) {
                                        lVar.i(0);
                                    } else if (iOrdinal == 1) {
                                        lVar.i(1);
                                    } else if (iOrdinal == 2) {
                                        lVar.i(2);
                                    } else if (iOrdinal == 3) {
                                        lVar.i(-1);
                                    }
                                }
                                if (d0Var != null) {
                                    linkedHashSet.add(new a0.t() { // from class: ni.l
                                        @Override // a0.t
                                        public final List a(List list2) {
                                            return Collections.singletonList(d0Var);
                                        }
                                    });
                                }
                                cVar.a(jLongValue, new a0.w(linkedHashSet));
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
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj4).longValue(), a0.w.f238c);
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
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj5).longValue(), a0.w.f237b);
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
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.CameraSelector");
                            a0.w wVar = (a0.w) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.CameraInfo>");
                            List list3 = (List) obj7;
                            try {
                                fVar5.getClass();
                                listF4 = kotlin.collections.r.c(wVar.a(list3));
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
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraSelector.defaultFrontCamera", mVarA, obj);
        if (fVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.n0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i11) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            b0 b0Var = (b0) list.get(1);
                            final g0.d0 d0Var = (g0.d0) list.get(2);
                            try {
                                fj.c cVar = (fj.c) fVar2.f29389a.f6853d;
                                a7.l lVar = new a7.l();
                                LinkedHashSet linkedHashSet = (LinkedHashSet) lVar.f491c;
                                if (b0Var != null) {
                                    int iOrdinal = b0Var.ordinal();
                                    if (iOrdinal == 0) {
                                        lVar.i(0);
                                    } else if (iOrdinal == 1) {
                                        lVar.i(1);
                                    } else if (iOrdinal == 2) {
                                        lVar.i(2);
                                    } else if (iOrdinal == 3) {
                                        lVar.i(-1);
                                    }
                                }
                                if (d0Var != null) {
                                    linkedHashSet.add(new a0.t() { // from class: ni.l
                                        @Override // a0.t
                                        public final List a(List list2) {
                                            return Collections.singletonList(d0Var);
                                        }
                                    });
                                }
                                cVar.a(jLongValue, new a0.w(linkedHashSet));
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
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj4).longValue(), a0.w.f238c);
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
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj5).longValue(), a0.w.f237b);
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
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.CameraSelector");
                            a0.w wVar = (a0.w) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.CameraInfo>");
                            List list3 = (List) obj7;
                            try {
                                fVar5.getClass();
                                listF4 = kotlin.collections.r.c(wVar.a(list3));
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
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraSelector.filter", mVarA, obj);
        if (fVar == null) {
            gVar4.L(null);
        } else {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: ni.n0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i12) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            b0 b0Var = (b0) list.get(1);
                            final g0.d0 d0Var = (g0.d0) list.get(2);
                            try {
                                fj.c cVar = (fj.c) fVar2.f29389a.f6853d;
                                a7.l lVar = new a7.l();
                                LinkedHashSet linkedHashSet = (LinkedHashSet) lVar.f491c;
                                if (b0Var != null) {
                                    int iOrdinal = b0Var.ordinal();
                                    if (iOrdinal == 0) {
                                        lVar.i(0);
                                    } else if (iOrdinal == 1) {
                                        lVar.i(1);
                                    } else if (iOrdinal == 2) {
                                        lVar.i(2);
                                    } else if (iOrdinal == 3) {
                                        lVar.i(-1);
                                    }
                                }
                                if (d0Var != null) {
                                    linkedHashSet.add(new a0.t() { // from class: ni.l
                                        @Override // a0.t
                                        public final List a(List list2) {
                                            return Collections.singletonList(d0Var);
                                        }
                                    });
                                }
                                cVar.a(jLongValue, new a0.w(linkedHashSet));
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
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj4).longValue(), a0.w.f238c);
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
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj5).longValue(), a0.w.f237b);
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
                            f fVar5 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.CameraSelector");
                            a0.w wVar = (a0.w) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.CameraInfo>");
                            List list3 = (List) obj7;
                            try {
                                fVar5.getClass();
                                listF4 = kotlin.collections.r.c(wVar.a(list3));
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

    public static final void v(Function2 function2, hk.a aVar, hk.a aVar2) {
        try {
            mj.a aVarB = nj.f.b(nj.f.a(function2, aVar, aVar2));
            ij.k kVar = ij.m.f21341c;
            mk.a.g(Unit.f27471a, aVarB);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            aVar2.resumeWith(h5.s(th2));
            throw th2;
        }
    }

    public static boolean w(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static String x(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (q(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c8 = charArray[i];
                    if (q(c8)) {
                        charArray[i] = (char) (c8 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String y(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c8 = charArray[i];
                    if (c8 >= 'a' && c8 <= 'z') {
                        charArray[i] = (char) (c8 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static Object z(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(z(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                jSONArray2.put(z(Array.get(obj, i)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), z(entry.getValue()));
            }
            return jSONObject;
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }
}
