package t;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import com.google.android.gms.internal.measurement.i4;
import g0.x2;
import g0.z2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {
    public final i4 B;
    public final t1 C;
    public final c0.b D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f33020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f33021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u.i f33022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k6.t0 f33023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f33024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f33025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f33026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f33027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f33028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f33029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f33030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f33031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g0.o f33032w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i1 f33034y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f33011a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f33012b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f33013c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f33014d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f33015e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f33016f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f33017g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f33018h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f33019j = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f33033x = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final t0 f33035z = new t0(5);
    public final k6.t0 A = new k6.t0(20);

    public d2(Context context, String str, u.p pVar, f fVar, c0.b bVar) throws a0.x {
        boolean z5;
        List listSingletonList;
        long[] jArr;
        int[] iArr;
        boolean z10;
        this.f33025p = false;
        this.f33026q = false;
        this.f33029t = false;
        this.f33030u = false;
        str.getClass();
        this.f33020k = str;
        fVar.getClass();
        this.f33021l = fVar;
        this.f33023n = new k6.t0(19);
        this.f33034y = i1.b(context);
        try {
            u.i iVarB = pVar.b(str);
            this.f33022m = iVarB;
            Integer num = (Integer) iVarB.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f33024o = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) iVarB.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i : iArr2) {
                    if (i == 3) {
                        this.f33025p = true;
                    } else if (i == 6) {
                        this.f33026q = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.f33029t = true;
                    } else if (i == 1) {
                        this.f33030u = true;
                    }
                }
            }
            u.i iVar = this.f33022m;
            i4 i4Var = new i4();
            i4Var.f13782c = iVar;
            i4Var.f13783d = k6.t0.i(iVar);
            int[] iArr3 = (int[]) iVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr3 != null) {
                for (int i10 : iArr3) {
                    if (i10 == 18) {
                        z5 = true;
                        break;
                    }
                }
                z5 = false;
            } else {
                z5 = false;
            }
            i4Var.f13781b = z5;
            this.B = i4Var;
            this.C = new t1(this.f33022m);
            ArrayList arrayList = this.f33011a;
            int i11 = this.f33024o;
            boolean z11 = this.f33025p;
            boolean z12 = this.f33026q;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            g0.l2 l2Var = new g0.l2();
            g0.o2 o2Var = g0.o2.f19705b;
            g0.m2 m2Var = g0.m2.f19668n;
            g0.l2 l2VarB = z.b(o2Var, m2Var, l2Var, arrayList3, l2Var);
            g0.o2 o2Var2 = g0.o2.f19707d;
            g0.l2 l2VarB2 = z.b(o2Var2, m2Var, l2VarB, arrayList3, l2VarB);
            g0.o2 o2Var3 = g0.o2.f19706c;
            g0.l2 l2VarB3 = z.b(o2Var3, m2Var, l2VarB2, arrayList3, l2VarB2);
            g0.m2 m2Var2 = g0.m2.f19662g;
            z.k(o2Var, m2Var2, l2VarB3, o2Var2, m2Var);
            g0.l2 l2VarC = z.c(arrayList3, l2VarB3);
            z.k(o2Var3, m2Var2, l2VarC, o2Var2, m2Var);
            g0.l2 l2VarC2 = z.c(arrayList3, l2VarC);
            z.k(o2Var, m2Var2, l2VarC2, o2Var, m2Var2);
            g0.l2 l2VarC3 = z.c(arrayList3, l2VarC2);
            z.k(o2Var, m2Var2, l2VarC3, o2Var3, m2Var2);
            g0.l2 l2VarC4 = z.c(arrayList3, l2VarC3);
            z.k(o2Var, m2Var2, l2VarC4, o2Var3, m2Var2);
            l2VarC4.a(g0.p2.a(o2Var2, m2Var));
            arrayList3.add(l2VarC4);
            arrayList2.addAll(arrayList3);
            if (i11 == 0 || i11 == 4 || i11 == 1 || i11 == 3) {
                ArrayList arrayList4 = new ArrayList();
                g0.l2 l2Var2 = new g0.l2();
                l2Var2.a(g0.p2.a(o2Var, m2Var2));
                g0.m2 m2Var3 = g0.m2.f19667m;
                g0.l2 l2VarB4 = z.b(o2Var, m2Var3, l2Var2, arrayList4, l2Var2);
                z.k(o2Var, m2Var2, l2VarB4, o2Var3, m2Var3);
                g0.l2 l2VarC5 = z.c(arrayList4, l2VarB4);
                z.k(o2Var3, m2Var2, l2VarC5, o2Var3, m2Var3);
                g0.l2 l2VarC6 = z.c(arrayList4, l2VarC5);
                z.k(o2Var, m2Var2, l2VarC6, o2Var, m2Var3);
                g0.l2 l2VarB5 = z.b(o2Var2, m2Var3, l2VarC6, arrayList4, l2VarC6);
                z.k(o2Var, m2Var2, l2VarB5, o2Var3, m2Var3);
                g0.l2 l2VarB6 = z.b(o2Var2, m2Var3, l2VarB5, arrayList4, l2VarB5);
                z.k(o2Var3, m2Var2, l2VarB6, o2Var3, m2Var2);
                l2VarB6.a(g0.p2.a(o2Var2, m2Var));
                arrayList4.add(l2VarB6);
                arrayList2.addAll(arrayList4);
            }
            if (i11 == 1 || i11 == 3) {
                ArrayList arrayList5 = new ArrayList();
                g0.l2 l2Var3 = new g0.l2();
                z.k(o2Var, m2Var2, l2Var3, o2Var, m2Var);
                g0.l2 l2VarC7 = z.c(arrayList5, l2Var3);
                z.k(o2Var, m2Var2, l2VarC7, o2Var3, m2Var);
                g0.l2 l2VarC8 = z.c(arrayList5, l2VarC7);
                z.k(o2Var3, m2Var2, l2VarC8, o2Var3, m2Var);
                g0.l2 l2VarC9 = z.c(arrayList5, l2VarC8);
                z.k(o2Var, m2Var2, l2VarC9, o2Var, m2Var2);
                g0.l2 l2VarB7 = z.b(o2Var2, m2Var, l2VarC9, arrayList5, l2VarC9);
                g0.m2 m2Var4 = g0.m2.f19659d;
                z.k(o2Var3, m2Var4, l2VarB7, o2Var, m2Var2);
                g0.l2 l2VarB8 = z.b(o2Var3, m2Var, l2VarB7, arrayList5, l2VarB7);
                z.k(o2Var3, m2Var4, l2VarB8, o2Var3, m2Var2);
                l2VarB8.a(g0.p2.a(o2Var3, m2Var));
                arrayList5.add(l2VarB8);
                arrayList2.addAll(arrayList5);
            }
            if (z11) {
                ArrayList arrayList6 = new ArrayList();
                g0.l2 l2Var4 = new g0.l2();
                g0.o2 o2Var4 = g0.o2.f19709f;
                g0.l2 l2VarB9 = z.b(o2Var4, m2Var, l2Var4, arrayList6, l2Var4);
                z.k(o2Var, m2Var2, l2VarB9, o2Var4, m2Var);
                g0.l2 l2VarC10 = z.c(arrayList6, l2VarB9);
                z.k(o2Var3, m2Var2, l2VarC10, o2Var4, m2Var);
                g0.l2 l2VarC11 = z.c(arrayList6, l2VarC10);
                z.k(o2Var, m2Var2, l2VarC11, o2Var, m2Var2);
                g0.l2 l2VarB10 = z.b(o2Var4, m2Var, l2VarC11, arrayList6, l2VarC11);
                z.k(o2Var, m2Var2, l2VarB10, o2Var3, m2Var2);
                g0.l2 l2VarB11 = z.b(o2Var4, m2Var, l2VarB10, arrayList6, l2VarB10);
                z.k(o2Var3, m2Var2, l2VarB11, o2Var3, m2Var2);
                g0.l2 l2VarB12 = z.b(o2Var4, m2Var, l2VarB11, arrayList6, l2VarB11);
                z.k(o2Var, m2Var2, l2VarB12, o2Var2, m2Var);
                g0.l2 l2VarB13 = z.b(o2Var4, m2Var, l2VarB12, arrayList6, l2VarB12);
                z.k(o2Var3, m2Var2, l2VarB13, o2Var2, m2Var);
                l2VarB13.a(g0.p2.a(o2Var4, m2Var));
                arrayList6.add(l2VarB13);
                arrayList2.addAll(arrayList6);
            }
            if (z12 && i11 == 0) {
                ArrayList arrayList7 = new ArrayList();
                g0.l2 l2Var5 = new g0.l2();
                z.k(o2Var, m2Var2, l2Var5, o2Var, m2Var);
                g0.l2 l2VarC12 = z.c(arrayList7, l2Var5);
                z.k(o2Var, m2Var2, l2VarC12, o2Var3, m2Var);
                g0.l2 l2VarC13 = z.c(arrayList7, l2VarC12);
                z.k(o2Var3, m2Var2, l2VarC13, o2Var3, m2Var);
                arrayList7.add(l2VarC13);
                arrayList2.addAll(arrayList7);
            }
            if (i11 == 3) {
                ArrayList arrayList8 = new ArrayList();
                g0.l2 l2Var6 = new g0.l2();
                l2Var6.a(g0.p2.a(o2Var, m2Var2));
                g0.m2 m2Var5 = g0.m2.f19659d;
                z.k(o2Var, m2Var5, l2Var6, o2Var3, m2Var);
                g0.o2 o2Var5 = g0.o2.f19709f;
                g0.l2 l2VarB14 = z.b(o2Var5, m2Var, l2Var6, arrayList8, l2Var6);
                z.k(o2Var, m2Var2, l2VarB14, o2Var, m2Var5);
                z.k(o2Var2, m2Var, l2VarB14, o2Var5, m2Var);
                arrayList8.add(l2VarB14);
                arrayList2.addAll(arrayList8);
            }
            arrayList.addAll(arrayList2);
            k6.t0 t0Var = this.f33023n;
            String str2 = this.f33020k;
            if (((ExtraSupportedSurfaceCombinationsQuirk) t0Var.f27180c) == null) {
                listSingletonList = new ArrayList();
            } else {
                g0.l2 l2Var7 = ExtraSupportedSurfaceCombinationsQuirk.f1225a;
                String str3 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str3) || "heroqltetmo".equalsIgnoreCase(str3)) {
                    ArrayList arrayList9 = new ArrayList();
                    listSingletonList = arrayList9;
                    if (str2.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.f1225a);
                        listSingletonList = arrayList9;
                    }
                } else {
                    listSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.f1227c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.e()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.f1226b) : Collections.EMPTY_LIST;
                }
            }
            arrayList.addAll(listSingletonList);
            if (this.f33029t) {
                ArrayList arrayList10 = this.f33012b;
                ArrayList arrayList11 = new ArrayList();
                g0.l2 l2Var8 = new g0.l2();
                g0.m2 m2Var6 = g0.m2.f19671q;
                z.k(o2Var3, m2Var6, l2Var8, o2Var, m2Var2);
                g0.m2 m2Var7 = g0.m2.f19667m;
                g0.l2 l2VarB15 = z.b(o2Var, m2Var7, l2Var8, arrayList11, l2Var8);
                z.k(o2Var2, m2Var6, l2VarB15, o2Var, m2Var2);
                g0.l2 l2VarB16 = z.b(o2Var, m2Var7, l2VarB15, arrayList11, l2VarB15);
                g0.o2 o2Var6 = g0.o2.f19709f;
                z.k(o2Var6, m2Var6, l2VarB16, o2Var, m2Var2);
                g0.l2 l2VarB17 = z.b(o2Var, m2Var7, l2VarB16, arrayList11, l2VarB16);
                z.k(o2Var3, m2Var6, l2VarB17, o2Var, m2Var2);
                g0.l2 l2VarB18 = z.b(o2Var2, m2Var, l2VarB17, arrayList11, l2VarB17);
                z.k(o2Var2, m2Var6, l2VarB18, o2Var, m2Var2);
                g0.l2 l2VarB19 = z.b(o2Var2, m2Var, l2VarB18, arrayList11, l2VarB18);
                z.k(o2Var6, m2Var6, l2VarB19, o2Var, m2Var2);
                g0.l2 l2VarB20 = z.b(o2Var2, m2Var, l2VarB19, arrayList11, l2VarB19);
                z.k(o2Var3, m2Var6, l2VarB20, o2Var, m2Var2);
                g0.l2 l2VarB21 = z.b(o2Var3, m2Var, l2VarB20, arrayList11, l2VarB20);
                z.k(o2Var2, m2Var6, l2VarB21, o2Var, m2Var2);
                g0.l2 l2VarB22 = z.b(o2Var3, m2Var, l2VarB21, arrayList11, l2VarB21);
                z.k(o2Var6, m2Var6, l2VarB22, o2Var, m2Var2);
                g0.l2 l2VarB23 = z.b(o2Var3, m2Var, l2VarB22, arrayList11, l2VarB22);
                z.k(o2Var3, m2Var6, l2VarB23, o2Var, m2Var2);
                g0.l2 l2VarB24 = z.b(o2Var6, m2Var, l2VarB23, arrayList11, l2VarB23);
                z.k(o2Var2, m2Var6, l2VarB24, o2Var, m2Var2);
                g0.l2 l2VarB25 = z.b(o2Var6, m2Var, l2VarB24, arrayList11, l2VarB24);
                z.k(o2Var6, m2Var6, l2VarB25, o2Var, m2Var2);
                l2VarB25.a(g0.p2.a(o2Var6, m2Var));
                arrayList11.add(l2VarB25);
                arrayList10.addAll(arrayList11);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f33027r = zHasSystemFeature;
            if (zHasSystemFeature) {
                ArrayList arrayList12 = this.f33013c;
                ArrayList arrayList13 = new ArrayList();
                g0.l2 l2Var9 = new g0.l2();
                g0.m2 m2Var8 = g0.m2.f19664j;
                g0.l2 l2VarB26 = z.b(o2Var3, m2Var8, l2Var9, arrayList13, l2Var9);
                g0.l2 l2VarB27 = z.b(o2Var, m2Var8, l2VarB26, arrayList13, l2VarB26);
                g0.l2 l2VarB28 = z.b(o2Var2, m2Var8, l2VarB27, arrayList13, l2VarB27);
                g0.m2 m2Var9 = g0.m2.f19661f;
                z.k(o2Var3, m2Var9, l2VarB28, o2Var2, m2Var8);
                g0.l2 l2VarC14 = z.c(arrayList13, l2VarB28);
                z.k(o2Var, m2Var9, l2VarC14, o2Var2, m2Var8);
                g0.l2 l2VarC15 = z.c(arrayList13, l2VarC14);
                z.k(o2Var3, m2Var9, l2VarC15, o2Var3, m2Var8);
                g0.l2 l2VarC16 = z.c(arrayList13, l2VarC15);
                z.k(o2Var3, m2Var9, l2VarC16, o2Var, m2Var8);
                g0.l2 l2VarC17 = z.c(arrayList13, l2VarC16);
                z.k(o2Var, m2Var9, l2VarC17, o2Var3, m2Var8);
                g0.l2 l2VarC18 = z.c(arrayList13, l2VarC17);
                z.k(o2Var, m2Var9, l2VarC18, o2Var, m2Var8);
                arrayList13.add(l2VarC18);
                arrayList12.addAll(arrayList13);
            }
            if (i4Var.f13781b) {
                ArrayList arrayList14 = this.f33018h;
                ArrayList arrayList15 = new ArrayList();
                g0.l2 l2Var10 = new g0.l2();
                g0.l2 l2VarB29 = z.b(o2Var, m2Var, l2Var10, arrayList15, l2Var10);
                g0.l2 l2VarB30 = z.b(o2Var3, m2Var, l2VarB29, arrayList15, l2VarB29);
                z.k(o2Var, m2Var2, l2VarB30, o2Var2, m2Var);
                g0.l2 l2VarC19 = z.c(arrayList15, l2VarB30);
                z.k(o2Var, m2Var2, l2VarC19, o2Var3, m2Var);
                g0.l2 l2VarC20 = z.c(arrayList15, l2VarC19);
                z.k(o2Var3, m2Var2, l2VarC20, o2Var3, m2Var);
                g0.l2 l2VarC21 = z.c(arrayList15, l2VarC20);
                l2VarC21.a(g0.p2.a(o2Var, m2Var2));
                g0.m2 m2Var10 = g0.m2.f19667m;
                g0.l2 l2VarB31 = z.b(o2Var, m2Var10, l2VarC21, arrayList15, l2VarC21);
                z.k(o2Var, m2Var2, l2VarB31, o2Var, m2Var10);
                g0.l2 l2VarB32 = z.b(o2Var3, m2Var10, l2VarB31, arrayList15, l2VarB31);
                z.k(o2Var, m2Var2, l2VarB32, o2Var, m2Var10);
                l2VarB32.a(g0.p2.a(o2Var2, m2Var10));
                arrayList15.add(l2VarB32);
                arrayList14.addAll(arrayList15);
            }
            u.i characteristicsCompat = this.f33022m;
            g0.g gVar = b2.f32957a;
            Intrinsics.checkNotNullParameter(characteristicsCompat, "characteristicsCompat");
            int i12 = Build.VERSION.SDK_INT;
            boolean z13 = (i12 < 33 || (jArr = (long[]) characteristicsCompat.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.f33028s = z13;
            if (z13 && i12 >= 33) {
                ArrayList arrayList16 = this.f33019j;
                ArrayList arrayList17 = new ArrayList();
                g0.l2 l2Var11 = new g0.l2();
                g0.m2 m2Var11 = g0.m2.f19664j;
                g0.k2 k2Var = g0.k2.f19638g;
                l2Var11.a(ya.e.e(o2Var, m2Var11, k2Var));
                arrayList17.add(l2Var11);
                g0.l2 l2Var12 = new g0.l2();
                l2Var12.a(ya.e.e(o2Var3, m2Var11, k2Var));
                arrayList17.add(l2Var12);
                g0.l2 l2Var13 = new g0.l2();
                g0.m2 m2Var12 = g0.m2.f19667m;
                g0.k2 k2Var2 = g0.k2.f19636e;
                l2Var13.a(ya.e.e(o2Var, m2Var12, k2Var2));
                arrayList17.add(l2Var13);
                g0.l2 l2Var14 = new g0.l2();
                l2Var14.a(ya.e.e(o2Var3, m2Var12, k2Var2));
                arrayList17.add(l2Var14);
                g0.l2 l2Var15 = new g0.l2();
                g0.k2 k2Var3 = g0.k2.f19637f;
                l2Var15.a(ya.e.e(o2Var2, m2Var, k2Var3));
                arrayList17.add(l2Var15);
                g0.l2 l2Var16 = new g0.l2();
                l2Var16.a(ya.e.e(o2Var3, m2Var, k2Var3));
                arrayList17.add(l2Var16);
                g0.l2 l2Var17 = new g0.l2();
                g0.k2 k2Var4 = g0.k2.f19635d;
                l2Var17.a(ya.e.e(o2Var, m2Var2, k2Var4));
                l2Var17.a(ya.e.e(o2Var2, m2Var, k2Var3));
                g0.l2 l2VarC22 = z.c(arrayList17, l2Var17);
                l2VarC22.a(ya.e.e(o2Var, m2Var2, k2Var4));
                l2VarC22.a(ya.e.e(o2Var3, m2Var, k2Var3));
                g0.l2 l2VarC23 = z.c(arrayList17, l2VarC22);
                l2VarC23.a(ya.e.e(o2Var, m2Var2, k2Var4));
                l2VarC23.a(ya.e.e(o2Var, m2Var12, k2Var2));
                g0.l2 l2VarC24 = z.c(arrayList17, l2VarC23);
                l2VarC24.a(ya.e.e(o2Var, m2Var2, k2Var4));
                l2VarC24.a(ya.e.e(o2Var3, m2Var12, k2Var2));
                g0.l2 l2VarC25 = z.c(arrayList17, l2VarC24);
                l2VarC25.a(ya.e.e(o2Var, m2Var2, k2Var4));
                l2VarC25.a(ya.e.e(o2Var3, m2Var2, k2Var4));
                g0.l2 l2VarC26 = z.c(arrayList17, l2VarC25);
                l2VarC26.a(ya.e.e(o2Var, m2Var2, k2Var4));
                l2VarC26.a(ya.e.e(o2Var, m2Var12, k2Var2));
                l2VarC26.a(ya.e.e(o2Var2, m2Var12, k2Var3));
                arrayList17.add(l2VarC26);
                g0.l2 l2Var18 = new g0.l2();
                l2Var18.a(ya.e.e(o2Var, m2Var2, k2Var4));
                l2Var18.a(ya.e.e(o2Var3, m2Var12, k2Var2));
                l2Var18.a(ya.e.e(o2Var2, m2Var12, k2Var3));
                arrayList17.add(l2Var18);
                g0.l2 l2Var19 = new g0.l2();
                l2Var19.a(ya.e.e(o2Var, m2Var2, k2Var4));
                l2Var19.a(ya.e.e(o2Var3, m2Var2, k2Var4));
                l2Var19.a(ya.e.e(o2Var2, m2Var, k2Var3));
                arrayList17.add(l2Var19);
                arrayList16.addAll(arrayList17);
            }
            u.i iVar2 = this.f33022m;
            if (i12 < 33 || (iArr = (int[]) iVar2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z10 = false;
            } else {
                for (int i13 : iArr) {
                    if (i13 == 2) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
            }
            this.f33031v = z10;
            if (z10 && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList18 = this.f33014d;
                ArrayList arrayList19 = new ArrayList();
                g0.l2 l2Var20 = new g0.l2();
                g0.o2 o2Var7 = g0.o2.f19705b;
                g0.m2 m2Var13 = g0.m2.f19664j;
                g0.l2 l2VarB33 = z.b(o2Var7, m2Var13, l2Var20, arrayList19, l2Var20);
                g0.o2 o2Var8 = g0.o2.f19706c;
                g0.l2 l2VarB34 = z.b(o2Var8, m2Var13, l2VarB33, arrayList19, l2VarB33);
                l2VarB34.a(g0.p2.a(o2Var7, m2Var13));
                g0.o2 o2Var9 = g0.o2.f19707d;
                g0.m2 m2Var14 = g0.m2.f19668n;
                g0.l2 l2VarB35 = z.b(o2Var9, m2Var14, l2VarB34, arrayList19, l2VarB34);
                z.k(o2Var8, m2Var13, l2VarB35, o2Var9, m2Var14);
                g0.l2 l2VarC27 = z.c(arrayList19, l2VarB35);
                z.k(o2Var7, m2Var13, l2VarC27, o2Var8, m2Var14);
                g0.l2 l2VarC28 = z.c(arrayList19, l2VarC27);
                z.k(o2Var8, m2Var13, l2VarC28, o2Var8, m2Var14);
                g0.l2 l2VarC29 = z.c(arrayList19, l2VarC28);
                g0.m2 m2Var15 = g0.m2.f19662g;
                z.k(o2Var7, m2Var15, l2VarC29, o2Var7, m2Var13);
                g0.l2 l2VarC30 = z.c(arrayList19, l2VarC29);
                z.k(o2Var8, m2Var15, l2VarC30, o2Var7, m2Var13);
                g0.l2 l2VarC31 = z.c(arrayList19, l2VarC30);
                z.k(o2Var7, m2Var15, l2VarC31, o2Var8, m2Var13);
                g0.l2 l2VarC32 = z.c(arrayList19, l2VarC31);
                z.k(o2Var8, m2Var15, l2VarC32, o2Var8, m2Var13);
                arrayList19.add(l2VarC32);
                arrayList18.addAll(arrayList19);
            }
            c();
            this.D = bVar;
        } catch (u.a e3) {
            throw new a0.x(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Range d(android.util.Range r13, int r14, android.util.Range[] r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d2.d(android.util.Range, int, android.util.Range[]):android.util.Range");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Size f(android.hardware.camera2.params.StreamConfigurationMap r8, int r9, boolean r10, android.util.Rational r11) {
        /*
            r0 = 34
            r1 = 0
            if (r9 != r0) goto Lc
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r8.getOutputSizes(r0)     // Catch: java.lang.Throwable -> L11
            goto L12
        Lc:
            android.util.Size[] r0 = r8.getOutputSizes(r9)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = 0
            if (r0 == 0) goto L3c
            int r3 = r0.length
            if (r3 != 0) goto L19
            goto L3c
        L19:
            if (r11 == 0) goto L47
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.length
            r5 = r2
        L22:
            if (r5 >= r4) goto L36
            r6 = r0[r5]
            android.util.Rational r7 = i0.b.f20759a
            android.util.Size r7 = p0.b.f30756c
            boolean r7 = i0.b.a(r6, r11, r7)
            if (r7 == 0) goto L33
            r3.add(r6)
        L33:
            int r5 = r5 + 1
            goto L22
        L36:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L3e
        L3c:
            r0 = r1
            goto L47
        L3e:
            android.util.Size[] r11 = new android.util.Size[r2]
            java.lang.Object[] r11 = r3.toArray(r11)
            r0 = r11
            android.util.Size[] r0 = (android.util.Size[]) r0
        L47:
            if (r0 == 0) goto L83
            int r11 = r0.length
            if (r11 != 0) goto L4d
            goto L83
        L4d:
            i0.f r11 = new i0.f
            r11.<init>(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r0 = java.util.Collections.max(r0, r11)
            android.util.Size r0 = (android.util.Size) r0
            android.util.Size r1 = p0.b.f30754a
            if (r10 == 0) goto L74
            android.util.Size[] r8 = r8.getHighResolutionOutputSizes(r9)
            if (r8 == 0) goto L74
            int r9 = r8.length
            if (r9 <= 0) goto L74
            java.util.List r8 = java.util.Arrays.asList(r8)
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            r1 = r8
            android.util.Size r1 = (android.util.Size) r1
        L74:
            android.util.Size[] r8 = new android.util.Size[]{r0, r1}
            java.util.List r8 = java.util.Arrays.asList(r8)
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            android.util.Size r8 = (android.util.Size) r8
            return r8
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d2.f(android.hardware.camera2.params.StreamConfigurationMap, int, boolean, android.util.Rational):android.util.Size");
    }

    public static int h(Range range, Range range2) {
        f2.g.h("Ranges must not intersect", (range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int i(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public static Range m(Range range, Range range2, boolean z5) {
        Range range3 = g0.n.f19676h;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z5) {
            f2.g.h("All targetFrameRate should be the same if strict fps is required", range == range2);
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final boolean a(e eVar, List list, Map map, List list2, List list3) {
        List list4;
        Size resolution;
        boolean z5 = eVar.f33039d;
        boolean z10 = eVar.f33043h;
        HashMap map2 = this.f33017g;
        if (map2.containsKey(eVar)) {
            list4 = (List) map2.get(eVar);
        } else {
            ArrayList arrayList = new ArrayList();
            int i = eVar.f33036a;
            if (z10) {
                ArrayList arrayList2 = this.f33016f;
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    g0.o2 o2Var = g0.o2.f19705b;
                    g0.m2 m2Var = g0.m2.i;
                    arrayList3.add(new g0.l2(g0.p2.a(o2Var, m2Var)));
                    g0.m2 m2Var2 = g0.m2.f19661f;
                    arrayList3.add(new g0.l2(g0.p2.a(o2Var, m2Var2)));
                    g0.m2 m2Var3 = g0.m2.f19670p;
                    arrayList3.addAll(rl.b.g(m2Var, m2Var3));
                    g0.m2 m2Var4 = g0.m2.f19666l;
                    arrayList3.addAll(rl.b.g(m2Var, m2Var4));
                    arrayList3.addAll(rl.b.g(m2Var, g0.m2.f19665k));
                    arrayList3.addAll(rl.b.g(m2Var, m2Var));
                    arrayList3.addAll(rl.b.g(m2Var2, m2Var3));
                    arrayList3.addAll(rl.b.g(m2Var2, m2Var4));
                    arrayList3.addAll(rl.b.g(m2Var2, m2Var));
                    g0.m2 m2Var5 = g0.m2.f19660e;
                    g0.m2 m2Var6 = g0.m2.f19669o;
                    arrayList3.addAll(rl.b.g(m2Var5, m2Var6));
                    arrayList3.addAll(rl.b.g(g0.m2.f19663h, m2Var6));
                    arrayList2.addAll(arrayList3);
                }
                arrayList.addAll(arrayList2);
            } else if (eVar.f33040e) {
                ArrayList arrayList4 = this.i;
                if (arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    g0.l2 l2Var = new g0.l2();
                    g0.o2 o2Var2 = g0.o2.f19708e;
                    g0.m2 m2Var7 = g0.m2.f19668n;
                    g0.l2 l2VarB = z.b(o2Var2, m2Var7, l2Var, arrayList5, l2Var);
                    z.k(g0.o2.f19705b, g0.m2.f19662g, l2VarB, o2Var2, m2Var7);
                    arrayList5.add(l2VarB);
                    arrayList4.addAll(arrayList5);
                }
                if (i == 0) {
                    arrayList.addAll(arrayList4);
                }
            } else if (eVar.f33041f) {
                ArrayList arrayList6 = this.f33015e;
                if (arrayList6.isEmpty()) {
                    t1 t1Var = this.C;
                    if (((Boolean) t1Var.f33291b.getValue()).booleanValue()) {
                        arrayList6.clear();
                        Size size = (Size) t1Var.f33292c.getValue();
                        if (size != null) {
                            g0.o surfaceSizeDefinition = l(34);
                            ArrayList arrayList7 = new ArrayList();
                            g0.k2 k2Var = g0.p2.f19713e;
                            Intrinsics.checkNotNullParameter(size, "size");
                            Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "surfaceSizeDefinition");
                            g0.p2 p2VarF = ya.e.F(34, size, surfaceSizeDefinition, 0, g0.n2.f19693c, g0.p2.f19713e);
                            g0.l2 l2Var2 = new g0.l2();
                            l2Var2.a(p2VarF);
                            arrayList7.add(l2Var2);
                            g0.l2 l2Var3 = new g0.l2();
                            l2Var3.a(p2VarF);
                            l2Var3.a(p2VarF);
                            arrayList7.add(l2Var3);
                            arrayList6.addAll(arrayList7);
                        }
                    }
                }
                arrayList.addAll(arrayList6);
            } else {
                int i10 = eVar.f33038c;
                if (i10 == 8) {
                    if (i != 1) {
                        ArrayList arrayList8 = this.f33011a;
                        if (i != 2) {
                            if (z5) {
                                arrayList8 = this.f33014d;
                            }
                            arrayList.addAll(arrayList8);
                        } else {
                            arrayList.addAll(this.f33012b);
                            arrayList.addAll(arrayList8);
                        }
                    } else {
                        arrayList = this.f33013c;
                    }
                } else if (i10 == 10 && i == 0) {
                    arrayList.addAll(this.f33018h);
                }
            }
            map2.put(eVar, arrayList);
            list4 = arrayList;
        }
        Iterator it = list4.iterator();
        int i11 = 0;
        boolean z11 = false;
        while (it.hasNext()) {
            z11 = ((g0.l2) it.next()).c(list) != null;
            if (z11) {
                break;
            }
        }
        if (!z11 || !z10) {
            return z11;
        }
        Range range = eVar.i;
        g0.g2 g2Var = new g0.g2();
        while (i11 < list.size()) {
            g0.p2 p2Var = (g0.p2) list.get(i11);
            g0.o definition = l(p2Var.f19720d);
            int i12 = p2Var.f19720d;
            Intrinsics.checkNotNullParameter(definition, "definition");
            g0.m2 m2Var8 = p2Var.f19718b;
            int iOrdinal = m2Var8.ordinal();
            if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 9:
                        resolution = definition.f19699e;
                        break;
                    case 10:
                        resolution = (Size) definition.f19700f.get(Integer.valueOf(i12));
                        break;
                    case 11:
                        resolution = (Size) definition.f19700f.get(Integer.valueOf(i12));
                        break;
                    case 12:
                        resolution = (Size) definition.f19700f.get(Integer.valueOf(i12));
                        break;
                    case 13:
                        resolution = (Size) definition.i.get(Integer.valueOf(i12));
                        break;
                    case 14:
                        throw new IllegalStateException("Not supported config size");
                    default:
                        resolution = m2Var8.f19675c;
                        break;
                }
            } else {
                resolution = definition.f19697c;
            }
            Intrinsics.b(resolution);
            x2 x2Var = (x2) list2.get(((Integer) list3.get(i11)).intValue());
            a0.i0 dynamicRange = (a0.i0) map.get(p2Var);
            Objects.requireNonNull(dynamicRange);
            Intrinsics.checkNotNullParameter(x2Var, "<this>");
            Intrinsics.checkNotNullParameter(resolution, "resolution");
            Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
            boolean z12 = z5;
            c0.a aVar = new c0.a(resolution, x2Var.k());
            c0.d.f2180c.getClass();
            Intrinsics.checkNotNullParameter(x2Var, "<this>");
            int iOrdinal2 = x2Var.n().ordinal();
            Class cls = (iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 3 ? iOrdinal2 != 4 ? c0.d.f2185h : c0.d.f2184g : c0.d.f2183f : c0.d.f2181d : c0.d.f2182e).f2186b;
            if (cls != null) {
                aVar.f19517j = cls;
            }
            g0.d2 d2VarD = g0.d2.d(x2Var, resolution);
            g0.r0 r0Var = d2VarD.f19527b;
            d2VarD.b(aVar, dynamicRange, -1);
            Intrinsics.checkNotNullExpressionValue(d2VarD, "addSurface(...)");
            Range range2 = g0.n.f19676h.equals(range) ? d0.c.f15492d : range;
            r0Var.getClass();
            ((g0.q1) r0Var.f19730e).y(g0.s0.f19744k, range2);
            if (z12) {
                r0Var.getClass();
                ((g0.q1) r0Var.f19730e).y(x2.D, 2);
            }
            g2Var.a(d2VarD.c());
            boolean zC = g2Var.c();
            StringBuilder sb2 = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb2.append(x2Var);
            sb2.append(" with ");
            sb2.append(p2Var);
            sb2.append(" due to [");
            sb2.append(!g2Var.f19569m ? "Template is not set" : g2Var.f19568l.toString());
            sb2.append("]; surfaceConfigList = ");
            sb2.append(list);
            sb2.append(", featureSettings = ");
            sb2.append(eVar);
            sb2.append(", newUseCaseConfigs = ");
            sb2.append(list2);
            f2.g.h(sb2.toString(), zC);
            i11++;
            z5 = z12;
        }
        g0.h2 h2VarB = g2Var.b();
        boolean zD = this.D.d(h2VarB);
        Iterator it2 = h2VarB.b().iterator();
        while (it2.hasNext()) {
            ((g0.a1) it2.next()).a();
        }
        return zD;
    }

    public final e b(int i, boolean z5, HashMap map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Range range, boolean z15) {
        int i10;
        Range range2;
        Range range3;
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                i10 = 8;
                break;
            }
            if (((a0.i0) it.next()).f118b == 10) {
                i10 = 10;
                break;
            }
        }
        String str = this.f33020k;
        if (i != 0 && z11) {
            throw new IllegalArgumentException(z.f("Camera device id is ", str, ". Ultra HDR is not currently supported in ", i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        if (i != 0 && i10 == 10) {
            throw new IllegalArgumentException(z.f("Camera device id is ", str, ". 10 bit dynamic range is not currently supported in ", i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        if (i != 0 && z13) {
            throw new IllegalArgumentException(z.f("Camera device id is ", str, ". Feature combination query is not currently supported in ", i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        if (z12 && z13) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (z12 && !((Boolean) this.C.f33291b.getValue()).booleanValue()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        if (z13) {
            range2 = range;
            if (range2 == g0.n.f19676h && z14) {
                range3 = d0.c.f15492d;
            }
            return new e(i, z5, i10, z10, z11, z12, z13, z14, range3, z15);
        }
        range2 = range;
        range3 = range2;
        return new e(i, z5, i10, z10, z11, z12, z13, z14, range3, z15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r2 = new android.util.Size(r8.videoFrameWidth, r8.videoFrameHeight);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r11 = this;
            t.i1 r0 = r11.f33034y
            android.util.Size r4 = r0.e()
            r0 = 0
            r1 = 0
            java.lang.String r2 = r11.f33020k     // Catch: java.lang.NumberFormatException -> L3a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L3a
            t.f r3 = r11.f33021l     // Catch: java.lang.NumberFormatException -> L3a
            r5 = 8
            int[] r6 = new int[r5]     // Catch: java.lang.NumberFormatException -> L3a
            r6 = {x00ac: FILL_ARRAY_DATA , data: [1, 13, 10, 8, 12, 6, 5, 4} // fill-array     // Catch: java.lang.NumberFormatException -> L3a
            r7 = r1
        L18:
            if (r7 >= r5) goto L35
            r8 = r6[r7]     // Catch: java.lang.NumberFormatException -> L3a
            boolean r9 = r3.b(r2, r8)     // Catch: java.lang.NumberFormatException -> L3a
            if (r9 == 0) goto L32
            android.media.CamcorderProfile r8 = r3.a(r2, r8)     // Catch: java.lang.NumberFormatException -> L3a
            if (r8 == 0) goto L32
            android.util.Size r2 = new android.util.Size     // Catch: java.lang.NumberFormatException -> L3a
            int r3 = r8.videoFrameWidth     // Catch: java.lang.NumberFormatException -> L3a
            int r5 = r8.videoFrameHeight     // Catch: java.lang.NumberFormatException -> L3a
            r2.<init>(r3, r5)     // Catch: java.lang.NumberFormatException -> L3a
            goto L36
        L32:
            int r7 = r7 + 1
            goto L18
        L35:
            r2 = r0
        L36:
            if (r2 == 0) goto L3a
        L38:
            r6 = r2
            goto L83
        L3a:
            u.i r2 = r11.f33022m
            bb.e r2 = r2.c()
            java.lang.Object r2 = r2.f2019c     // Catch: java.lang.Throwable -> L4f
            ni.i r2 = (ni.i) r2     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r2.f29407c     // Catch: java.lang.Throwable -> L4f
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2     // Catch: java.lang.Throwable -> L4f
            java.lang.Class<android.media.MediaRecorder> r3 = android.media.MediaRecorder.class
            android.util.Size[] r2 = r2.getOutputSizes(r3)     // Catch: java.lang.Throwable -> L4f
            goto L50
        L4f:
            r2 = r0
        L50:
            if (r2 != 0) goto L53
            goto L7c
        L53:
            i0.f r3 = new i0.f
            r5 = 1
            r3.<init>(r5)
            java.util.Arrays.sort(r2, r3)
            int r3 = r2.length
        L5d:
            if (r1 >= r3) goto L7c
            r5 = r2[r1]
            int r6 = r5.getWidth()
            android.util.Size r7 = p0.b.f30759f
            int r8 = r7.getWidth()
            if (r6 > r8) goto L79
            int r6 = r5.getHeight()
            int r7 = r7.getHeight()
            if (r6 > r7) goto L79
            r0 = r5
            goto L7c
        L79:
            int r1 = r1 + 1
            goto L5d
        L7c:
            if (r0 == 0) goto L80
            r6 = r0
            goto L83
        L80:
            android.util.Size r2 = p0.b.f30757d
            goto L38
        L83:
            android.util.Size r2 = p0.b.f30756c
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            g0.o r1 = new g0.o
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f33032w = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d2.c():void");
    }

    public final int e(int i, Size size, boolean z5) {
        long outputMinFrameDuration;
        f2.g.h(null, !z5 || i == 34);
        if (z5) {
            t1 t1Var = this.C;
            t1Var.getClass();
            Intrinsics.checkNotNullParameter(size, "size");
            List listC = t1Var.c(size);
            List list = listC.isEmpty() ? null : listC;
            if (list == null) {
                com.google.android.gms.internal.auth.g.O("HighSpeedResolver", "No supported high speed  fps for " + size);
                return 0;
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Integer num = (Integer) ((Range) it.next()).getUpper();
            while (it.hasNext()) {
                Integer num2 = (Integer) ((Range) it.next()).getUpper();
                if (num.compareTo(num2) < 0) {
                    num = num2;
                }
            }
            Intrinsics.checkNotNullExpressionValue(num, "maxOf(...)");
            return num.intValue();
        }
        bb.e eVarC = this.f33022m.c();
        Objects.requireNonNull(eVarC);
        try {
            outputMinFrameDuration = ((StreamConfigurationMap) ((ni.i) eVarC.f2019c).f29407c).getOutputMinFrameDuration(i, size);
        } catch (RuntimeException e3) {
            com.google.android.gms.internal.auth.g.P("StreamConfigurationMapCompat", "Failed to get min frame duration for format = " + i + " and size = " + size, e3);
            outputMinFrameDuration = 0L;
        }
        if (outputMinFrameDuration > 0) {
            return (int) (1.0E9d / outputMinFrameDuration);
        }
        if (!this.f33030u) {
            return Integer.MAX_VALUE;
        }
        com.google.android.gms.internal.auth.g.O("SupportedSurfaceCombination", "minFrameDuration: " + outputMinFrameDuration + " is invalid for imageFormat = " + i + ", size = " + size);
        return 0;
    }

    public final List g(e featureSettings, List list, HashMap surfaceConfigIndexAttachedSurfaceInfoMap, HashMap surfaceConfigIndexUseCaseConfigMap) {
        int i;
        List list2;
        g0.g gVar = b2.f32957a;
        Intrinsics.checkNotNullParameter(featureSettings, "featureSettings");
        if (featureSettings.f33036a != 0 || featureSettings.f33038c != 8 || featureSettings.f33041f) {
            return null;
        }
        Iterator it = this.f33019j.iterator();
        while (it.hasNext()) {
            List surfaceConfigsWithStreamUseCase = ((g0.l2) it.next()).c(list);
            if (surfaceConfigsWithStreamUseCase != null) {
                g0.g gVar2 = b2.f32957a;
                Intrinsics.checkNotNullParameter(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
                Intrinsics.checkNotNullParameter(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
                Intrinsics.checkNotNullParameter(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
                int size = surfaceConfigsWithStreamUseCase.size();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    i = 1;
                    if (i11 >= size) {
                        i10 = 1;
                        break;
                    }
                    long j10 = ((g0.p2) surfaceConfigsWithStreamUseCase.get(i11)).f19719c.f19640b;
                    boolean zContainsKey = surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i11));
                    z2 z2Var = z2.f19816f;
                    if (zContainsKey) {
                        g0.e eVar = (g0.e) surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i11));
                        Intrinsics.b(eVar);
                        List list3 = eVar.f19543e;
                        if (list3.size() == 1) {
                            z2Var = (z2) list3.get(i10);
                        }
                        Intrinsics.b(z2Var);
                        Intrinsics.checkNotNullExpressionValue(list3, "getCaptureTypes(...)");
                        if (!b2.b(z2Var, j10, list3)) {
                            break;
                        }
                        i11++;
                        i10 = 0;
                    } else {
                        if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i11))) {
                            throw new AssertionError("SurfaceConfig does not map to any use case");
                        }
                        Object obj = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i11));
                        Intrinsics.b(obj);
                        x2 x2Var = (x2) obj;
                        z2 z2VarN = x2Var.n();
                        Intrinsics.checkNotNullExpressionValue(z2VarN, "getCaptureType(...)");
                        if (x2Var.n() == z2Var) {
                            list2 = (List) ((u0.e) x2Var).a(u0.e.M);
                            Intrinsics.checkNotNullExpressionValue(list2, "getCaptureTypes(...)");
                        } else {
                            list2 = kotlin.collections.b0.f27475b;
                        }
                        if (!b2.b(z2VarN, j10, list2)) {
                            i10 = 0;
                            break;
                        }
                        i11++;
                        i10 = 0;
                    }
                }
                kotlin.text.p initializer = new kotlin.text.p(i, this, surfaceConfigsWithStreamUseCase);
                Intrinsics.checkNotNullParameter(initializer, "initializer");
                if (i10 != 0 && ((Boolean) initializer.invoke()).booleanValue()) {
                    return surfaceConfigsWithStreamUseCase;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x04b9, code lost:
    
        r7 = r6;
        r6 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g0.q2 j(int r29, java.util.ArrayList r30, java.util.HashMap r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d2.j(int, java.util.ArrayList, java.util.HashMap, boolean, boolean, boolean):g0.q2");
    }

    public final Pair k(e eVar, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i, HashMap map, HashMap map2) {
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g0.e eVar2 = (g0.e) it.next();
            arrayList4.add(eVar2.f19539a);
            map.put(Integer.valueOf(arrayList4.size() - 1), eVar2);
        }
        int iMin = i;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size = (Size) list.get(i10);
            x2 x2Var = (x2) arrayList2.get(((Integer) arrayList3.get(i10)).intValue());
            int iK = x2Var.k();
            g0.k2 k2VarM = x2Var.m();
            g0.n2 n2Var = eVar.f33043h ? g0.n2.f19692b : g0.n2.f19693c;
            g0.o oVarL = l(iK);
            int i11 = eVar.f33036a;
            g0.k2 k2Var = g0.p2.f19713e;
            arrayList4.add(ya.e.F(iK, size, oVarL, i11, n2Var, k2VarM));
            map2.put(Integer.valueOf(arrayList4.size() - 1), x2Var);
            iMin = Math.min(iMin, e(x2Var.k(), size, eVar.f33041f));
        }
        return new Pair(arrayList4, Integer.valueOf(iMin));
    }

    public final g0.o l(int i) {
        StreamConfigurationMap streamConfigurationMap;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.f33033x;
        if (!arrayList.contains(numValueOf)) {
            p(this.f33032w.f19696b, p0.b.f30758e, i);
            p(this.f33032w.f19698d, p0.b.f30760g, i);
            o(this.f33032w.f19700f, i, null);
            o(this.f33032w.f19701g, i, i0.b.f20759a);
            o(this.f33032w.f19702h, i, i0.b.f20761c);
            HashMap map = this.f33032w.i;
            if (Build.VERSION.SDK_INT >= 31 && this.f33029t && (streamConfigurationMap = (StreamConfigurationMap) this.f33022m.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map.put(Integer.valueOf(i), f(streamConfigurationMap, i, true, null));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.f33032w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x059d A[PHI: r11 r17 r20
      0x059d: PHI (r11v56 int) = (r11v55 int), (r11v55 int), (r11v59 int), (r11v60 int) binds: [B:190:0x0572, B:192:0x057e, B:198:0x058b, B:201:0x0598] A[DONT_GENERATE, DONT_INLINE]
      0x059d: PHI (r17v7 java.util.List) = (r17v2 java.util.List), (r17v2 java.util.List), (r17v9 java.util.List), (r17v10 java.util.List) binds: [B:190:0x0572, B:192:0x057e, B:198:0x058b, B:201:0x0598] A[DONT_GENERATE, DONT_INLINE]
      0x059d: PHI (r20v2 int) = (r20v1 int), (r20v1 int), (r20v1 int), (r20v3 int) binds: [B:190:0x0572, B:192:0x057e, B:198:0x058b, B:201:0x0598] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028f  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73, types: [kotlin.collections.b0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g0.q2 n(final t.e r43, java.util.ArrayList r44, java.util.Map r45, final java.util.ArrayList r46, final java.util.ArrayList r47, java.util.HashMap r48) {
        /*
            Method dump skipped, instruction units count: 2703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d2.n(t.e, java.util.ArrayList, java.util.Map, java.util.ArrayList, java.util.ArrayList, java.util.HashMap):g0.q2");
    }

    public final void o(HashMap map, int i, Rational rational) {
        Size sizeF = f((StreamConfigurationMap) ((ni.i) this.f33022m.c().f2019c).f29407c, i, true, rational);
        if (sizeF != null) {
            map.put(Integer.valueOf(i), sizeF);
        }
    }

    public final void p(HashMap map, Size size, int i) {
        if (this.f33027r) {
            Size sizeF = f((StreamConfigurationMap) ((ni.i) this.f33022m.c().f2019c).f29407c, i, false, null);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeF != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeF), new i0.f(false));
            }
            map.put(numValueOf, size);
        }
    }
}
