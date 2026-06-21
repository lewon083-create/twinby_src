package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n41 f3520k = new n41();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ut1 f3521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f3522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f3524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public uz1 f3525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f3526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b7 f3527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s50 f3528h;
    public Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bw1 f3529j;

    public b(Context context) {
        bw1 bw1Var = new bw1(8);
        uz1 uz1Var = uz1.F;
        this.f3523c = new Object();
        this.f3524d = context != null ? context.getApplicationContext() : null;
        this.f3529j = bw1Var;
        if (uz1Var != null) {
            this.f3525e = uz1Var;
        } else {
            tz1 tz1Var = new tz1(uz1Var);
            tz1Var.b(uz1Var);
            this.f3525e = new uz1(tz1Var);
        }
        this.f3528h = s50.f10178b;
        if (this.f3525e.A && context == null) {
            rs.r("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int d(jx1 jx1Var, String str, boolean z5) {
        if (!TextUtils.isEmpty(str) && str.equals(jx1Var.f6967d)) {
            return 4;
        }
        String strC = c(str);
        String strC2 = c(jx1Var.f6967d);
        if (strC2 == null || strC == null) {
            return (z5 && strC2 == null) ? 1 : 0;
        }
        if (strC2.startsWith(strC) || strC.startsWith(strC2)) {
            return 3;
        }
        String str2 = cq0.f4293a;
        return strC2.split("-", 2)[0].equals(strC.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int e(com.google.android.gms.internal.ads.jx1 r5, com.google.android.gms.internal.ads.x41 r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            com.google.android.gms.internal.ads.x41 r3 = r5.f6966c
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.qy1 r3 = (com.google.android.gms.internal.ads.qy1) r3
            java.lang.String r3 = r3.f9640b
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b.e(com.google.android.gms.internal.ads.jx1, com.google.android.gms.internal.ads.x41):int");
    }

    public static final Pair g(int i, f fVar, int[][][] iArr, yz1 yz1Var, Comparator comparator) {
        RandomAccess randomAccessQ;
        f fVar2 = fVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < 2) {
            if (i == fVar2.f5154a[i10]) {
                mz1 mz1Var = fVar2.f5155b[i10];
                for (int i11 = 0; i11 < mz1Var.f8055a; i11++) {
                    pi piVarA = mz1Var.a(i11);
                    r51 r51VarB = yz1Var.b(i10, piVarA, iArr[i10][i11]);
                    int i12 = piVarA.f9070a;
                    boolean[] zArr = new boolean[i12];
                    int i13 = 0;
                    while (i13 < i12) {
                        int i14 = i13 + 1;
                        zz1 zz1Var = (zz1) r51VarB.get(i13);
                        int iA = zz1Var.a();
                        if (!zArr[i13] && iA != 0) {
                            if (iA == 1) {
                                randomAccessQ = x41.q(zz1Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zz1Var);
                                for (int i15 = i14; i15 < i12; i15++) {
                                    zz1 zz1Var2 = (zz1) r51VarB.get(i15);
                                    if (zz1Var2.a() == 2 && zz1Var.b(zz1Var2)) {
                                        arrayList2.add(zz1Var2);
                                        zArr[i15] = true;
                                    }
                                }
                                randomAccessQ = arrayList2;
                            }
                            arrayList.add(randomAccessQ);
                        }
                        i13 = i14;
                    }
                }
            }
            i10++;
            fVar2 = fVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((zz1) list.get(i16)).f13162d;
        }
        zz1 zz1Var3 = (zz1) list.get(0);
        return Pair.create(new c(zz1Var3.f13161c, iArr2), Integer.valueOf(zz1Var3.f13160b));
    }

    public final void a() {
        b7 b7Var;
        vz1 vz1Var;
        Handler handler;
        synchronized (this.f3523c) {
            try {
                Thread thread = this.f3526f;
                if (thread != null) {
                    ix.l0("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (b7Var = this.f3527g) != null) {
            Spatializer spatializer = (Spatializer) b7Var.f3658c;
            if (spatializer != null && (vz1Var = (vz1) b7Var.f3660e) != null && (handler = (Handler) b7Var.f3659d) != null) {
                spatializer.removeOnSpatializerStateChangedListener(vz1Var);
                handler.removeCallbacksAndMessages(null);
            }
            this.f3527g = null;
        }
        this.f3521a = null;
        this.f3522b = null;
    }

    public final void b(s50 s50Var) {
        if (this.f3528h.equals(s50Var)) {
            return;
        }
        this.f3528h = s50Var;
        f();
    }

    public final void f() {
        boolean z5;
        ut1 ut1Var;
        b7 b7Var;
        synchronized (this.f3523c) {
            try {
                z5 = false;
                if (this.f3525e.A && Build.VERSION.SDK_INT >= 32 && (b7Var = this.f3527g) != null && b7Var.f3657b) {
                    z5 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z5 || (ut1Var = this.f3521a) == null) {
            return;
        }
        ut1Var.i.c(10);
    }
}
