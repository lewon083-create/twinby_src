package rl;

import android.app.AppOpsManager;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import bf.i;
import c7.j;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.w;
import com.google.firebase.messaging.y;
import com.yandex.varioqub.config.model.ConfigValue;
import g0.a1;
import g0.l2;
import g0.m2;
import g0.o2;
import g0.p2;
import ii.f;
import ii.m;
import j3.c0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.p;
import kotlin.collections.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l7.o;
import na.h;
import t1.c;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static void A(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void B(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static boolean C(n nVar) {
        if (nVar == null) {
            return false;
        }
        Double dG = nVar.g();
        return !dG.isNaN() && dG.doubleValue() >= ConfigValue.DOUBLE_DEFAULT_VALUE && dG.equals(Double.valueOf(Math.floor(dG.doubleValue())));
    }

    public static w D(String str) {
        w wVar = null;
        if (str != null && !str.isEmpty()) {
            wVar = (w) w.f14054m0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException(om1.k("Unsupported commandId ", str));
    }

    public static boolean E(n nVar, n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof r) || (nVar instanceof l)) {
            return true;
        }
        if (!(nVar instanceof g)) {
            return nVar instanceof q ? nVar.l().equals(nVar2.l()) : nVar instanceof e ? nVar.i().equals(nVar2.i()) : nVar == nVar2;
        }
        if (Double.isNaN(nVar.g().doubleValue()) || Double.isNaN(nVar2.g().doubleValue())) {
            return false;
        }
        return nVar.g().equals(nVar2.g());
    }

    public static int F(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return 0;
        }
        return (int) ((((double) (d10 > ConfigValue.DOUBLE_DEFAULT_VALUE ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static double G(double d10) {
        if (Double.isNaN(d10)) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        if (Double.isInfinite(d10) || d10 == ConfigValue.DOUBLE_DEFAULT_VALUE || d10 == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return d10;
        }
        return ((double) (d10 > ConfigValue.DOUBLE_DEFAULT_VALUE ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static Object H(n nVar) {
        if (n.C1.equals(nVar)) {
            return null;
        }
        if (n.B1.equals(nVar)) {
            return "";
        }
        if (nVar instanceof k) {
            return I((k) nVar);
        }
        if (!(nVar instanceof d)) {
            return !nVar.g().isNaN() ? nVar.g() : nVar.l();
        }
        ArrayList arrayList = new ArrayList();
        d dVar = (d) nVar;
        int i = 0;
        while (i < dVar.r()) {
            if (i >= dVar.r()) {
                throw new NoSuchElementException(o.j(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            }
            int i10 = i + 1;
            Object objH = H(dVar.t(i));
            if (objH != null) {
                arrayList.add(objH);
            }
            i = i10;
        }
        return arrayList;
    }

    public static HashMap I(k kVar) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(kVar.f13847b.keySet())) {
            Object objH = H(kVar.f(str));
            if (objH != null) {
                map.put(str, objH);
            }
        }
        return map;
    }

    public static void J(y yVar) {
        int iF = F(yVar.G("runtime.counter").g().doubleValue() + 1.0d);
        if (iF > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        yVar.E("runtime.counter", new g(Double.valueOf(iF)));
    }

    public static Object c(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static int d(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, c.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static long[] e(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        h5.f("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static md.b f(String str, String str2) {
        fe.a aVar = new fe.a(str, str2);
        i iVarA = md.b.a(fe.a.class);
        iVarA.f2118d = 1;
        iVarA.f2119e = new md.a(aVar);
        return iVarA.e();
    }

    public static ArrayList g(m2 m2Var, m2 m2Var2) {
        ArrayList arrayList = new ArrayList();
        o2 o2Var = o2.f19705b;
        arrayList.add(new l2(p2.a(o2Var, m2Var), p2.a(o2.f19707d, m2Var2)));
        arrayList.add(new l2(p2.a(o2Var, m2Var), p2.a(o2.f19708e, m2Var2)));
        return arrayList;
    }

    public static int h(int i, int i10, String str, boolean z5) {
        while (i < i10) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z5)) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static boolean i(Object obj, Object obj2) {
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
            Iterable iterableN = p.n(objArr);
            if ((iterableN instanceof Collection) && ((Collection) iterableN).isEmpty()) {
                return true;
            }
            ck.g it = iterableN.iterator();
            while (it.f2383d) {
                int iNextInt = it.nextInt();
                if (!i(objArr[iNextInt], objArr2[iNextInt])) {
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
            Iterable iterableD = s.d((Collection) obj);
            if ((iterableD instanceof Collection) && ((Collection) iterableD).isEmpty()) {
                return true;
            }
            ck.g it2 = iterableD.iterator();
            while (it2.f2383d) {
                int iNextInt2 = it2.nextInt();
                if (!i(list.get(iNextInt2), list2.get(iNextInt2))) {
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
            if (!map2.containsKey(entry.getKey()) || !i(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static md.b j(String str, e5.g gVar) {
        i iVarA = md.b.a(fe.a.class);
        iVarA.f2118d = 1;
        iVarA.d(md.i.a(Context.class));
        iVarA.f2119e = new a0.y(11, str, gVar);
        return iVarA.e();
    }

    public static int l(String str) {
        if (str == null) {
            return -1;
        }
        String strN = c0.n(str);
        strN.getClass();
        switch (strN) {
        }
        return -1;
    }

    public static int m(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static j o(String str) {
        String strGroup;
        if (str == null || StringsKt.D(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i10 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i11 = Integer.parseInt(strGroup3);
        String description = matcher.group(4) != null ? matcher.group(4) : "";
        Intrinsics.checkNotNullExpressionValue(description, "description");
        return new j(description, i, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long p(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rl.b.p(int, java.lang.String):long");
    }

    public static void s(f binaryMessenger, final ni.f fVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        m mVarA = fVar != null ? fVar.f29389a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.PendingRecording.withAudioEnabled", mVarA, obj);
        if (fVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.w0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.video.PendingRecording");
                            x0.n nVar = (x0.n) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                fVar2.j(nVar, ((Boolean) obj4).booleanValue());
                                listF = kotlin.collections.r.c(nVar);
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
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.PendingRecording");
                            x0.n nVar2 = (x0.n) obj5;
                            try {
                                fVar3.getClass();
                                nVar2.f35657h = true;
                                listF2 = kotlin.collections.r.c(nVar2);
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
                        default:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.PendingRecording");
                            x0.n nVar3 = (x0.n) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoRecordEventListener");
                            try {
                                listF3 = kotlin.collections.r.c(fVar4.i(nVar3, (o1) obj7));
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
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.PendingRecording.asPersistentRecording", mVarA, obj);
        if (fVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.w0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i10) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.video.PendingRecording");
                            x0.n nVar = (x0.n) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                fVar2.j(nVar, ((Boolean) obj4).booleanValue());
                                listF = kotlin.collections.r.c(nVar);
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
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.PendingRecording");
                            x0.n nVar2 = (x0.n) obj5;
                            try {
                                fVar3.getClass();
                                nVar2.f35657h = true;
                                listF2 = kotlin.collections.r.c(nVar2);
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
                        default:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.PendingRecording");
                            x0.n nVar3 = (x0.n) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoRecordEventListener");
                            try {
                                listF3 = kotlin.collections.r.c(fVar4.i(nVar3, (o1) obj7));
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
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.PendingRecording.start", mVarA, obj);
        if (fVar == null) {
            gVar3.L(null);
        } else {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.w0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i11) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.video.PendingRecording");
                            x0.n nVar = (x0.n) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                fVar2.j(nVar, ((Boolean) obj4).booleanValue());
                                listF = kotlin.collections.r.c(nVar);
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
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.PendingRecording");
                            x0.n nVar2 = (x0.n) obj5;
                            try {
                                fVar3.getClass();
                                nVar2.f35657h = true;
                                listF2 = kotlin.collections.r.c(nVar2);
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
                        default:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.PendingRecording");
                            x0.n nVar3 = (x0.n) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.VideoRecordEventListener");
                            try {
                                listF3 = kotlin.collections.r.c(fVar4.i(nVar3, (o1) obj7));
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
                    }
                }
            });
        }
    }

    public static j1.k t(List list, j0.i iVar, j0.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k0.j.f(((a1) it.next()).c()));
        }
        return i0.o.w(new com.google.firebase.messaging.o(i0.o.w(new e9.g(k0.j.i(arrayList), dVar, 5000L, 3)), iVar, list, 5));
    }

    public static void u(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        new lj.a(block).start();
    }

    public static void v(xl.n nVar, vl.p pVar) {
        vl.p pVarN = pVar;
        int i = 0;
        while (pVarN != null) {
            nVar.j(pVarN, i);
            if (pVarN.f() > 0) {
                pVarN = (vl.p) pVarN.j().get(0);
                i++;
            } else {
                while (pVarN.n() == null && i > 0) {
                    nVar.g(pVarN, i);
                    pVarN = pVarN.f34939b;
                    i--;
                }
                nVar.g(pVarN, i);
                if (pVarN == pVar) {
                    return;
                } else {
                    pVarN = pVarN.n();
                }
            }
        }
    }

    public static void z(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public na.c a(Context context, Looper looper, q9.o oVar, Object obj, na.g gVar, h hVar) {
        return b(context, looper, oVar, obj, (oa.p) gVar, (oa.p) hVar);
    }

    public na.c b(Context context, Looper looper, q9.o oVar, Object obj, oa.p pVar, oa.p pVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract InputFilter[] k(InputFilter[] inputFilterArr);

    public abstract boolean n();

    public abstract void q(boolean z5);

    public abstract void r(boolean z5);

    public abstract void w(ArrayList arrayList);

    public abstract TransformationMethod x(TransformationMethod transformationMethod);

    public abstract void y(byte[] bArr, int i, int i10);
}
