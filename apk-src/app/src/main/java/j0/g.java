package j0;

import a0.t1;
import a0.w;
import a0.x;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.util.Log;
import android.util.Rational;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EdgeEffect;
import com.google.android.gms.internal.measurement.t;
import com.google.android.gms.internal.play_billing.o1;
import com.google.firebase.messaging.y;
import d8.e0;
import d8.n0;
import f7.m;
import f7.n;
import g0.d0;
import g0.q1;
import g2.c1;
import g2.d1;
import g2.e1;
import g2.f1;
import g2.g1;
import g2.h1;
import g2.i1;
import g2.x1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.flutter.embedding.engine.FlutterEngine;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.KotlinVersion;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.ranges.IntRange;
import l7.o;
import nl.j;
import u.p;
import uk.s0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements tk.b, tk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d f26136a;

    public static void D(long j10, nl.g gVar, int i, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        int i12;
        int i13;
        ArrayList arrayList3;
        long j11;
        int i14;
        int i15 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i10 >= i11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i16 = i10; i16 < i11; i16++) {
            if (((j) arrayList4.get(i16)).a() < i15) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        j jVar = (j) arrayList.get(i10);
        j jVar2 = (j) arrayList4.get(i11 - 1);
        if (i15 == jVar.a()) {
            int iIntValue = ((Number) arrayList5.get(i10)).intValue();
            int i17 = i10 + 1;
            j jVar3 = (j) arrayList4.get(i17);
            i12 = i17;
            i13 = iIntValue;
            jVar = jVar3;
        } else {
            i12 = i10;
            i13 = -1;
        }
        if (jVar.d(i15) == jVar2.d(i15)) {
            int iMin = Math.min(jVar.a(), jVar2.a());
            int i18 = 0;
            for (int i19 = i15; i19 < iMin && jVar.d(i19) == jVar2.d(i19); i19++) {
                i18++;
            }
            long j12 = 4;
            long j13 = (gVar.f29540c / j12) + j10 + ((long) 2) + ((long) i18) + 1;
            gVar.O(-i18);
            gVar.O(i13);
            int i20 = i15 + i18;
            while (i15 < i20) {
                gVar.O(jVar.d(i15) & KotlinVersion.MAX_COMPONENT_VALUE);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i20 != ((j) arrayList4.get(i12)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                gVar.O(((Number) arrayList5.get(i12)).intValue());
                return;
            } else {
                nl.g gVar2 = new nl.g();
                gVar.O(((int) ((gVar2.f29540c / j12) + j13)) * (-1));
                D(j13, gVar2, i20, arrayList4, i12, i11, arrayList5);
                gVar.o(gVar2);
                return;
            }
        }
        int i21 = 1;
        for (int i22 = i12 + 1; i22 < i11; i22++) {
            if (((j) arrayList4.get(i22 - 1)).d(i15) != ((j) arrayList4.get(i22)).d(i15)) {
                i21++;
            }
        }
        long j14 = 4;
        long j15 = (gVar.f29540c / j14) + j10 + ((long) 2) + ((long) (i21 * 2));
        gVar.O(i21);
        gVar.O(i13);
        for (int i23 = i12; i23 < i11; i23++) {
            int iD = ((j) arrayList4.get(i23)).d(i15);
            if (i23 == i12 || iD != ((j) arrayList4.get(i23 - 1)).d(i15)) {
                gVar.O(iD & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        nl.g gVar3 = new nl.g();
        int i24 = i12;
        while (i24 < i11) {
            byte bD = ((j) arrayList4.get(i24)).d(i15);
            int i25 = i24 + 1;
            int i26 = i25;
            while (true) {
                if (i26 >= i11) {
                    i26 = i11;
                    break;
                } else if (bD != ((j) arrayList4.get(i26)).d(i15)) {
                    break;
                } else {
                    i26++;
                }
            }
            if (i25 == i26 && i15 + 1 == ((j) arrayList4.get(i24)).a()) {
                gVar.O(((Number) arrayList5.get(i24)).intValue());
                arrayList3 = arrayList5;
                j11 = j15;
                i14 = i26;
            } else {
                gVar.O(((int) ((gVar3.f29540c / j14) + j15)) * (-1));
                arrayList3 = arrayList5;
                j11 = j15;
                i14 = i26;
                D(j11, gVar3, i15 + 1, arrayList, i24, i14, arrayList3);
                arrayList4 = arrayList;
            }
            j15 = j11;
            i24 = i14;
            arrayList5 = arrayList3;
        }
        gVar.o(gVar3);
    }

    public static void E(Context context, gj.b bVar) {
        Rect rect;
        x1 _windowInsetsCompat;
        Activity context2 = K(context);
        if (context2 != null) {
            m.f16693a.getClass();
            n it = n.f16694b;
            Intrinsics.checkNotNullParameter(it, "it");
            Intrinsics.checkNotNullParameter(context2, "activity");
            Intrinsics.checkNotNullParameter(context2, "context");
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                Intrinsics.checkNotNullParameter(context2, "context");
                rect = ((WindowManager) context2.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
                Intrinsics.checkNotNullExpressionValue(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = context2.getSystemService("window");
                Intrinsics.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                Intrinsics.checkNotNullExpressionValue(display, "display");
                Point pointC = n.c(display);
                rect = new Rect(0, 0, pointC.x, pointC.y);
            }
            if (i >= 30) {
                Intrinsics.checkNotNullParameter(context2, "context");
                if (i < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = j7.b.f26575a.a(context2);
            } else {
                _windowInsetsCompat = (i >= 36 ? new i1() : i >= 35 ? new h1() : i >= 34 ? new g1() : i >= 31 ? new f1() : i >= 30 ? new e1() : i >= 29 ? new d1() : new c1()).b();
                Intrinsics.checkNotNullExpressionValue(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            }
            c7.b _bounds = new c7.b(rect);
            Intrinsics.checkNotNullParameter(_bounds, "_bounds");
            Intrinsics.checkNotNullParameter(_windowInsetsCompat, "_windowInsetsCompat");
            ((FlutterEngine) bVar).f25541a.updateDisplayMetrics(0, _bounds.a().width(), _bounds.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static Handler F(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c2.f.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e7) {
            e = e7;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static String G(p pVar, Integer num, ArrayList arrayList) {
        if (num == null || !arrayList.contains(CommonUrlParts.Values.FALSE_INTEGER) || !arrayList.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) pVar.b(CommonUrlParts.Values.FALSE_INTEGER).a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) pVar.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean I(Object obj, Object obj2) {
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
                if (!I(objArr[iNextInt], objArr2[iNextInt])) {
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
            IntRange intRangeD = s.d((Collection) obj);
            if ((intRangeD instanceof Collection) && ((Collection) intRangeD).isEmpty()) {
                return true;
            }
            ck.g gVarA2 = intRangeD.iterator();
            while (gVarA2.f2383d) {
                int iNextInt2 = gVarA2.nextInt();
                if (!I(list.get(iNextInt2), list2.get(iNextInt2))) {
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
            if (!map2.containsKey(entry.getKey()) || !I(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:285:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x054e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g0.a2 J(u.i r14) {
        /*
            Method dump skipped, instruction units count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.g.J(u.i):g0.a2");
    }

    public static Activity K(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return K(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static float L(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return j2.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static int M(xi.n nVar) {
        Long l10 = nVar.f36249c;
        int i = Build.VERSION.SDK_INT;
        int pickImagesMaxLimit = (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) ? MediaStore.getPickImagesMaxLimit() : Integer.MAX_VALUE;
        return (l10 == null || l10.longValue() >= ((long) pickImagesMaxLimit)) ? pickImagesMaxLimit : Math.toIntExact(l10.longValue());
    }

    public static ArrayList N(t.p pVar, w wVar, ArrayList arrayList) throws t1 {
        String strG;
        try {
            ArrayList arrayList2 = new ArrayList();
            if (wVar == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) it.next());
                }
            } else {
                try {
                    strG = G(pVar.f33207e, wVar.b(), arrayList);
                } catch (IllegalStateException unused) {
                    strG = null;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (!str.equals(strG)) {
                        arrayList3.add(pVar.d(str));
                    }
                }
                Iterator it3 = wVar.a(arrayList3).iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((d0) it3.next()).e());
                }
            }
            return arrayList2;
        } catch (x e3) {
            throw new t1(e3);
        } catch (u.a e7) {
            throw new t1(new x(e7));
        }
    }

    public static ResolveInfo O(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    public static String P(g.h input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof g.f) {
            return "image/*";
        }
        if (input instanceof g.g) {
            return "video/*";
        }
        if (input instanceof g.e) {
            return null;
        }
        throw new ij.j();
    }

    public static float Q(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return j2.c.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    public static void R(n5.e eVar, int i, m3.g gVar) {
        long jF = eVar.f(i);
        List listH = eVar.h(jF);
        if (listH.isEmpty()) {
            return;
        }
        if (i == eVar.l() - 1) {
            throw new IllegalStateException();
        }
        long jF2 = eVar.f(i + 1) - eVar.f(i);
        if (jF2 > 0) {
            gVar.accept(new n5.a(jF, jF2, listH));
        }
    }

    public static void S(ii.f binaryMessenger, final ni.c cVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = cVar != null ? cVar.f29359a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageCapture.pigeon_defaultConstructor", mVarA, obj);
        if (cVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.t0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    Rational rational;
                    switch (i) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            t0.b bVar = (t0.b) list.get(1);
                            Long l10 = (Long) list.get(2);
                            q qVar = (q) list.get(3);
                            try {
                                fj.c cVar3 = (fj.c) cVar2.f29359a.f6853d;
                                a0.t0 t0Var = new a0.t0(1);
                                q1 q1Var = t0Var.f224b;
                                if (l10 != null) {
                                    q1Var.y(g0.i1.f19605j, Integer.valueOf(l10.intValue()));
                                }
                                if (qVar != null) {
                                    int iOrdinal = qVar.ordinal();
                                    if (iOrdinal == 0) {
                                        q1Var.y(g0.g1.N, 0);
                                    } else if (iOrdinal == 1) {
                                        q1Var.y(g0.g1.N, 2);
                                    } else if (iOrdinal == 2) {
                                        q1Var.y(g0.g1.N, 1);
                                    }
                                }
                                if (bVar != null) {
                                    q1Var.y(g0.i1.f19612q, bVar);
                                }
                                cVar3.a(jLongValue, t0Var.c());
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
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var = (a0.k1) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.CameraXFlashMode");
                            q qVar2 = (q) obj5;
                            try {
                                cVar4.getClass();
                                c.i(k1Var, qVar2);
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
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var2 = (a0.k1) obj6;
                            Object obj7 = list3.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj7;
                            fj.z zVar = new fj.z(reply, 8);
                            c cVar5 = cVar;
                            try {
                                File fileCreateTempFile = File.createTempFile("CAP", ".jpg", ((Context) cVar5.f29359a.f6857h).getCacheDir());
                                a0.g0 g0Var = new a0.g0(fileCreateTempFile);
                                com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
                                yVar.f14902e = cVar5;
                                yVar.f14899b = fileCreateTempFile;
                                yVar.f14900c = zVar;
                                yVar.f14901d = m1Var;
                                k1Var2.K(g0Var, Executors.newSingleThreadExecutor(), yVar);
                            } catch (IOException | SecurityException e3) {
                                l1.b(zVar, e3);
                                return;
                            }
                            break;
                        default:
                            c cVar6 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var3 = (a0.k1) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj9).longValue();
                            try {
                                cVar6.getClass();
                                int i10 = (int) jLongValue2;
                                int iS = ((g0.i1) k1Var3.f209h).s(0);
                                if (k1Var3.C(i10) && k1Var3.f144u != null) {
                                    int iAbs = Math.abs(a0.e.v(i10) - a0.e.v(iS));
                                    Rational rational2 = k1Var3.f144u;
                                    if (iAbs != 90 && iAbs != 270) {
                                        rational = new Rational(rational2.getNumerator(), rational2.getDenominator());
                                    } else if (rational2 == null) {
                                        k1Var3.f144u = rational2;
                                    } else {
                                        rational = new Rational(rational2.getDenominator(), rational2.getNumerator());
                                    }
                                    rational2 = rational;
                                    k1Var3.f144u = rational2;
                                }
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
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageCapture.setFlashMode", mVarA, obj);
        if (cVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.t0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    Rational rational;
                    switch (i10) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            t0.b bVar = (t0.b) list.get(1);
                            Long l10 = (Long) list.get(2);
                            q qVar = (q) list.get(3);
                            try {
                                fj.c cVar3 = (fj.c) cVar2.f29359a.f6853d;
                                a0.t0 t0Var = new a0.t0(1);
                                q1 q1Var = t0Var.f224b;
                                if (l10 != null) {
                                    q1Var.y(g0.i1.f19605j, Integer.valueOf(l10.intValue()));
                                }
                                if (qVar != null) {
                                    int iOrdinal = qVar.ordinal();
                                    if (iOrdinal == 0) {
                                        q1Var.y(g0.g1.N, 0);
                                    } else if (iOrdinal == 1) {
                                        q1Var.y(g0.g1.N, 2);
                                    } else if (iOrdinal == 2) {
                                        q1Var.y(g0.g1.N, 1);
                                    }
                                }
                                if (bVar != null) {
                                    q1Var.y(g0.i1.f19612q, bVar);
                                }
                                cVar3.a(jLongValue, t0Var.c());
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
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var = (a0.k1) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.CameraXFlashMode");
                            q qVar2 = (q) obj5;
                            try {
                                cVar4.getClass();
                                c.i(k1Var, qVar2);
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
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var2 = (a0.k1) obj6;
                            Object obj7 = list3.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj7;
                            fj.z zVar = new fj.z(reply, 8);
                            c cVar5 = cVar;
                            try {
                                File fileCreateTempFile = File.createTempFile("CAP", ".jpg", ((Context) cVar5.f29359a.f6857h).getCacheDir());
                                a0.g0 g0Var = new a0.g0(fileCreateTempFile);
                                com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
                                yVar.f14902e = cVar5;
                                yVar.f14899b = fileCreateTempFile;
                                yVar.f14900c = zVar;
                                yVar.f14901d = m1Var;
                                k1Var2.K(g0Var, Executors.newSingleThreadExecutor(), yVar);
                            } catch (IOException | SecurityException e3) {
                                l1.b(zVar, e3);
                                return;
                            }
                            break;
                        default:
                            c cVar6 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var3 = (a0.k1) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj9).longValue();
                            try {
                                cVar6.getClass();
                                int i102 = (int) jLongValue2;
                                int iS = ((g0.i1) k1Var3.f209h).s(0);
                                if (k1Var3.C(i102) && k1Var3.f144u != null) {
                                    int iAbs = Math.abs(a0.e.v(i102) - a0.e.v(iS));
                                    Rational rational2 = k1Var3.f144u;
                                    if (iAbs != 90 && iAbs != 270) {
                                        rational = new Rational(rational2.getNumerator(), rational2.getDenominator());
                                    } else if (rational2 == null) {
                                        k1Var3.f144u = rational2;
                                    } else {
                                        rational = new Rational(rational2.getDenominator(), rational2.getNumerator());
                                    }
                                    rational2 = rational;
                                    k1Var3.f144u = rational2;
                                }
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
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageCapture.takePicture", mVarA, obj);
        if (cVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.t0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    Rational rational;
                    switch (i11) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            t0.b bVar = (t0.b) list.get(1);
                            Long l10 = (Long) list.get(2);
                            q qVar = (q) list.get(3);
                            try {
                                fj.c cVar3 = (fj.c) cVar2.f29359a.f6853d;
                                a0.t0 t0Var = new a0.t0(1);
                                q1 q1Var = t0Var.f224b;
                                if (l10 != null) {
                                    q1Var.y(g0.i1.f19605j, Integer.valueOf(l10.intValue()));
                                }
                                if (qVar != null) {
                                    int iOrdinal = qVar.ordinal();
                                    if (iOrdinal == 0) {
                                        q1Var.y(g0.g1.N, 0);
                                    } else if (iOrdinal == 1) {
                                        q1Var.y(g0.g1.N, 2);
                                    } else if (iOrdinal == 2) {
                                        q1Var.y(g0.g1.N, 1);
                                    }
                                }
                                if (bVar != null) {
                                    q1Var.y(g0.i1.f19612q, bVar);
                                }
                                cVar3.a(jLongValue, t0Var.c());
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
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var = (a0.k1) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.CameraXFlashMode");
                            q qVar2 = (q) obj5;
                            try {
                                cVar4.getClass();
                                c.i(k1Var, qVar2);
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
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var2 = (a0.k1) obj6;
                            Object obj7 = list3.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj7;
                            fj.z zVar = new fj.z(reply, 8);
                            c cVar5 = cVar;
                            try {
                                File fileCreateTempFile = File.createTempFile("CAP", ".jpg", ((Context) cVar5.f29359a.f6857h).getCacheDir());
                                a0.g0 g0Var = new a0.g0(fileCreateTempFile);
                                com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
                                yVar.f14902e = cVar5;
                                yVar.f14899b = fileCreateTempFile;
                                yVar.f14900c = zVar;
                                yVar.f14901d = m1Var;
                                k1Var2.K(g0Var, Executors.newSingleThreadExecutor(), yVar);
                            } catch (IOException | SecurityException e3) {
                                l1.b(zVar, e3);
                                return;
                            }
                            break;
                        default:
                            c cVar6 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var3 = (a0.k1) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj9).longValue();
                            try {
                                cVar6.getClass();
                                int i102 = (int) jLongValue2;
                                int iS = ((g0.i1) k1Var3.f209h).s(0);
                                if (k1Var3.C(i102) && k1Var3.f144u != null) {
                                    int iAbs = Math.abs(a0.e.v(i102) - a0.e.v(iS));
                                    Rational rational2 = k1Var3.f144u;
                                    if (iAbs != 90 && iAbs != 270) {
                                        rational = new Rational(rational2.getNumerator(), rational2.getDenominator());
                                    } else if (rational2 == null) {
                                        k1Var3.f144u = rational2;
                                    } else {
                                        rational = new Rational(rational2.getDenominator(), rational2.getNumerator());
                                    }
                                    rational2 = rational;
                                    k1Var3.f144u = rational2;
                                }
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
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ImageCapture.setTargetRotation", mVarA, obj);
        if (cVar == null) {
            gVar4.L(null);
        } else {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: ni.t0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    Rational rational;
                    switch (i12) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            t0.b bVar = (t0.b) list.get(1);
                            Long l10 = (Long) list.get(2);
                            q qVar = (q) list.get(3);
                            try {
                                fj.c cVar3 = (fj.c) cVar2.f29359a.f6853d;
                                a0.t0 t0Var = new a0.t0(1);
                                q1 q1Var = t0Var.f224b;
                                if (l10 != null) {
                                    q1Var.y(g0.i1.f19605j, Integer.valueOf(l10.intValue()));
                                }
                                if (qVar != null) {
                                    int iOrdinal = qVar.ordinal();
                                    if (iOrdinal == 0) {
                                        q1Var.y(g0.g1.N, 0);
                                    } else if (iOrdinal == 1) {
                                        q1Var.y(g0.g1.N, 2);
                                    } else if (iOrdinal == 2) {
                                        q1Var.y(g0.g1.N, 1);
                                    }
                                }
                                if (bVar != null) {
                                    q1Var.y(g0.i1.f19612q, bVar);
                                }
                                cVar3.a(jLongValue, t0Var.c());
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
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj4 = list2.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var = (a0.k1) obj4;
                            Object obj5 = list2.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.CameraXFlashMode");
                            q qVar2 = (q) obj5;
                            try {
                                cVar4.getClass();
                                c.i(k1Var, qVar2);
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
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var2 = (a0.k1) obj6;
                            Object obj7 = list3.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj7;
                            fj.z zVar = new fj.z(reply, 8);
                            c cVar5 = cVar;
                            try {
                                File fileCreateTempFile = File.createTempFile("CAP", ".jpg", ((Context) cVar5.f29359a.f6857h).getCacheDir());
                                a0.g0 g0Var = new a0.g0(fileCreateTempFile);
                                com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
                                yVar.f14902e = cVar5;
                                yVar.f14899b = fileCreateTempFile;
                                yVar.f14900c = zVar;
                                yVar.f14901d = m1Var;
                                k1Var2.K(g0Var, Executors.newSingleThreadExecutor(), yVar);
                            } catch (IOException | SecurityException e3) {
                                l1.b(zVar, e3);
                                return;
                            }
                            break;
                        default:
                            c cVar6 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.ImageCapture");
                            a0.k1 k1Var3 = (a0.k1) obj8;
                            Object obj9 = list4.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj9).longValue();
                            try {
                                cVar6.getClass();
                                int i102 = (int) jLongValue2;
                                int iS = ((g0.i1) k1Var3.f209h).s(0);
                                if (k1Var3.C(i102) && k1Var3.f144u != null) {
                                    int iAbs = Math.abs(a0.e.v(i102) - a0.e.v(iS));
                                    Rational rational2 = k1Var3.f144u;
                                    if (iAbs != 90 && iAbs != 270) {
                                        rational = new Rational(rational2.getNumerator(), rational2.getDenominator());
                                    } else if (rational2 == null) {
                                        k1Var3.f144u = rational2;
                                    } else {
                                        rational = new Rational(rational2.getDenominator(), rational2.getNumerator());
                                    }
                                    rational2 = rational;
                                    k1Var3.f144u = rational2;
                                }
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
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void T(n5.e r12, n5.l r13, m3.g r14) {
        /*
            long r0 = r13.f29125a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.d(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.l()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.f(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.l()
            if (r4 >= r2) goto L51
            java.util.List r11 = r12.h(r0)
            long r2 = r12.f(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.f29125a
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            n5.a r6 = new n5.a
            long r9 = r2 - r7
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.l()
            if (r3 >= r6) goto L5f
            R(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.f29126b
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            R(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            n5.a r6 = new n5.a
            java.util.List r11 = r12.h(r0)
            long r7 = r12.f(r4)
            long r12 = r12.f(r4)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.g.T(n5.e, n5.l, m3.g):void");
    }

    public static boolean U(View view, gj.c cVar) {
        if (view != null) {
            if (cVar.a(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (U(viewGroup.getChildAt(i), cVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void V(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        parcel.writeBundle(bundle);
        m0(parcel, iI0);
    }

    public static void W(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        parcel.writeByteArray(bArr);
        m0(parcel, iI0);
    }

    public static void X(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m0(parcel, iI0);
    }

    public static void Y(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        parcel.writeIntArray(iArr);
        m0(parcel, iI0);
    }

    public static void Z(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(((Integer) list.get(i10)).intValue());
        }
        m0(parcel, iI0);
    }

    public static void a0(Parcel parcel, int i, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        parcelable.writeToParcel(parcel, i10);
        m0(parcel, iI0);
    }

    public static void b0(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        parcel.writeString(str);
        m0(parcel, iI0);
    }

    public static void c0(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        parcel.writeStringArray(strArr);
        m0(parcel, iI0);
    }

    public static void d0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        parcel.writeStringList(list);
        m0(parcel, iI0);
    }

    public static void e0(Parcel parcel, int i, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m0(parcel, iI0);
    }

    public static void f0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iI0 = i0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m0(parcel, iI0);
    }

    public static e0 g0(Bundle bundle, String str) {
        d8.j jVar = n0.i;
        if (bundle == null) {
            o1.g("BillingClient", str.concat(" got null owned items list"));
            return new e0(jVar, 54, 10);
        }
        int iA = o1.a(bundle, "BillingClient");
        String strE = o1.e(bundle, "BillingClient");
        d8.i iVarA = d8.j.a();
        iVarA.f15634b = iA;
        iVarA.f15635c = strE;
        d8.j jVarA = iVarA.a();
        if (iA != 0) {
            o1.g("BillingClient", str + " failed. Response code: " + iA);
            return new e0(jVarA, 23, 10);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            o1.g("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new e0(jVar, 55, 10);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            o1.g("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new e0(jVar, 56, 10);
        }
        if (stringArrayList2 == null) {
            o1.g("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new e0(jVar, 57, 10);
        }
        if (stringArrayList3 != null) {
            return new e0(n0.f15668j, 1, 10);
        }
        o1.g("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new e0(jVar, 58, 10);
    }

    public static void h0(Parcel parcel, int i, int i10) {
        parcel.writeInt(i | (i10 << 16));
    }

    public static int i0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static com.google.android.gms.internal.measurement.n j0(com.google.android.gms.internal.measurement.d dVar, y yVar, ArrayList arrayList, boolean z5) {
        com.google.android.gms.internal.measurement.n nVarB;
        rl.b.A("reduce", 1, arrayList);
        rl.b.B(2, "reduce", arrayList);
        com.google.android.gms.internal.measurement.n nVarC = ((t) yVar.f14900c).c(yVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
        if (!(nVarC instanceof com.google.android.gms.internal.measurement.h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            nVarB = ((t) yVar.f14900c).c(yVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
            if (nVarB instanceof com.google.android.gms.internal.measurement.f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (dVar.r() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            nVarB = null;
        }
        com.google.android.gms.internal.measurement.h hVar = (com.google.android.gms.internal.measurement.h) nVarC;
        int iR = dVar.r();
        int i = z5 ? 0 : iR - 1;
        int i10 = z5 ? iR - 1 : 0;
        int i11 = true == z5 ? 1 : -1;
        if (nVarB == null) {
            nVarB = dVar.t(i);
            i += i11;
        }
        while ((i10 - i) * i11 >= 0) {
            if (dVar.v(i)) {
                nVarB = hVar.b(yVar, Arrays.asList(nVarB, dVar.t(i), new com.google.android.gms.internal.measurement.g(Double.valueOf(i)), dVar));
                if (nVarB instanceof com.google.android.gms.internal.measurement.f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i11;
            } else {
                i += i11;
            }
        }
        return nVarB;
    }

    public static void k0(int i, int i10) {
        String strM;
        if (i < 0 || i >= i10) {
            if (i < 0) {
                strM = k3.f.M("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(o.j(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
                }
                strM = k3.f.M("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM);
        }
    }

    public static com.google.android.gms.internal.measurement.d l0(com.google.android.gms.internal.measurement.d dVar, y yVar, com.google.android.gms.internal.measurement.m mVar, Boolean bool, Boolean bool2) {
        com.google.android.gms.internal.measurement.d dVar2 = new com.google.android.gms.internal.measurement.d();
        Iterator itQ = dVar.q();
        while (itQ.hasNext()) {
            int iIntValue = ((Integer) itQ.next()).intValue();
            if (dVar.v(iIntValue)) {
                com.google.android.gms.internal.measurement.n nVarB = mVar.b(yVar, Arrays.asList(dVar.t(iIntValue), new com.google.android.gms.internal.measurement.g(Double.valueOf(iIntValue)), dVar));
                if (nVarB.i().equals(bool)) {
                    break;
                }
                if (bool2 == null || nVarB.i().equals(bool2)) {
                    dVar2.u(iIntValue, nVarB);
                }
            }
        }
        return dVar2;
    }

    public static void m0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void n0(int i, int i10, int i11) {
        if (i < 0 || i10 < i || i10 > i11) {
            throw new IndexOutOfBoundsException((i < 0 || i > i11) ? o0(i, i11, "start index") : (i10 < 0 || i10 > i11) ? o0(i10, i11, "end index") : k3.f.M("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i)));
        }
    }

    public static String o0(int i, int i10, String str) {
        if (i < 0) {
            return k3.f.M("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return k3.f.M("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.j(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
    }

    @Override // tk.b
    public float A() {
        H();
        throw null;
    }

    @Override // tk.a
    public float B(s0 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return A();
    }

    @Override // tk.b
    public double C() {
        H();
        throw null;
    }

    public void H() {
        throw new qk.d(g0.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // tk.b
    public tk.a a(sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // tk.b
    public boolean c() {
        H();
        throw null;
    }

    @Override // tk.a
    public boolean d(sk.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return c();
    }

    @Override // tk.b
    public char e() {
        H();
        throw null;
    }

    @Override // tk.a
    public String f(sk.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return j();
    }

    @Override // tk.a
    public Object g(sk.f descriptor, int i, qk.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!deserializer.getDescriptor().c() && !p()) {
            return null;
        }
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return w(deserializer);
    }

    @Override // tk.b
    public abstract int h();

    @Override // tk.a
    public Object i(sk.f descriptor, int i, qk.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return w(deserializer);
    }

    @Override // tk.b
    public String j() {
        H();
        throw null;
    }

    @Override // tk.a
    public double k(sk.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return C();
    }

    @Override // tk.a
    public long l(sk.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return o();
    }

    @Override // tk.a
    public void m(sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // tk.b
    public int n(sk.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        H();
        throw null;
    }

    @Override // tk.b
    public abstract long o();

    @Override // tk.b
    public boolean p() {
        return true;
    }

    @Override // tk.a
    public tk.b q(s0 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return r(descriptor.i(i));
    }

    @Override // tk.b
    public tk.b r(sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // tk.a
    public byte s(s0 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return x();
    }

    @Override // tk.a
    public short t(s0 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return z();
    }

    @Override // tk.a
    public char u(s0 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return e();
    }

    @Override // tk.b
    public Object w(qk.a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    @Override // tk.b
    public abstract byte x();

    @Override // tk.a
    public int y(sk.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return h();
    }

    @Override // tk.b
    public abstract short z();
}
