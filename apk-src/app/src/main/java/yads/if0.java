package yads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import yads.nx0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class if0 extends oi1 {
    public static final ua2 i = new ey(new d2.a(28));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ua2 f39525j = new ey(new d2.a(29));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final op0 f39527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final af0 f39529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final df0 f39530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pk f39531h;

    public if0(Context context, af0 af0Var, dc dcVar) {
        this(af0Var, dcVar, context);
    }

    public static boolean a(boolean z5, int i10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z5 && i11 == 3;
        }
        return true;
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public if0(af0 af0Var, dc dcVar, Context context) {
        this.f39526c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f39527d = dcVar;
        this.f39529f = af0Var;
        this.f39531h = pk.f41937h;
        boolean z5 = context != null && lb3.d(context);
        this.f39528e = z5;
        if (!z5 && context != null && lb3.f40466a >= 32) {
            this.f39530g = df0.a(context);
        }
        if (af0Var.L && context == null) {
            kh1.d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(l73 l73Var, af0 af0Var, HashMap map) {
        for (int i10 = 0; i10 < l73Var.f40444b; i10++) {
        }
    }

    public final void b() {
        boolean z5;
        u73 u73Var;
        df0 df0Var;
        synchronized (this.f39526c) {
            try {
                z5 = this.f39529f.L && !this.f39528e && lb3.f40466a >= 32 && (df0Var = this.f39530g) != null && df0Var.f37745b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z5 || (u73Var = this.f43923a) == null) {
            return;
        }
        ((ho0) u73Var).i.f40427a.sendEmptyMessage(10);
    }

    public static int a(nx0 nx0Var, String str, boolean z5) {
        if (!TextUtils.isEmpty(str) && str.equals(nx0Var.f41367d)) {
            return 4;
        }
        String strB = b(str);
        String strB2 = b(nx0Var.f41367d);
        if (strB2 == null || strB == null) {
            return (z5 && strB2 == null) ? 1 : 0;
        }
        if (strB2.startsWith(strB) || strB.startsWith(strB2)) {
            return 3;
        }
        int i10 = lb3.f40466a;
        return strB2.split("-", 2)[0].equals(strB.split("-", 2)[0]) ? 2 : 0;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int a(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x005e A[Catch: all -> 0x0083, FALL_THROUGH, TryCatch #0 {all -> 0x0083, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x000e, B:10:0x0013, B:34:0x0052, B:36:0x0056, B:38:0x005a, B:40:0x005e, B:42:0x0062, B:44:0x0066, B:46:0x006a, B:48:0x0070, B:50:0x0078, B:56:0x0086), top: B:60:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(yads.nx0 r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f39526c
            monitor-enter(r0)
            yads.af0 r1 = r8.f39529f     // Catch: java.lang.Throwable -> L83
            boolean r1 = r1.L     // Catch: java.lang.Throwable -> L83
            r2 = 1
            if (r1 == 0) goto L86
            boolean r1 = r8.f39528e     // Catch: java.lang.Throwable -> L83
            if (r1 != 0) goto L86
            int r1 = r9.f41388z     // Catch: java.lang.Throwable -> L83
            r3 = 2
            if (r1 <= r3) goto L86
            java.lang.String r1 = r9.f41375m     // Catch: java.lang.Throwable -> L83
            r4 = 0
            r5 = 32
            if (r1 != 0) goto L1b
            goto L5e
        L1b:
            int r6 = r1.hashCode()
            r7 = -1
            switch(r6) {
                case -2123537834: goto L44;
                case 187078296: goto L39;
                case 187078297: goto L30;
                case 1504578661: goto L25;
                default: goto L23;
            }
        L23:
            r3 = r7
            goto L4e
        L25:
            java.lang.String r3 = "audio/eac3"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2e
            goto L23
        L2e:
            r3 = 3
            goto L4e
        L30:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L4e
            goto L23
        L39:
            java.lang.String r3 = "audio/ac3"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L42
            goto L23
        L42:
            r3 = r2
            goto L4e
        L44:
            java.lang.String r3 = "audio/eac3-joc"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4d
            goto L23
        L4d:
            r3 = r4
        L4e:
            switch(r3) {
                case 0: goto L52;
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                default: goto L51;
            }
        L51:
            goto L5e
        L52:
            int r1 = yads.lb3.f40466a     // Catch: java.lang.Throwable -> L83
            if (r1 < r5) goto L86
            yads.df0 r1 = r8.f39530g     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L86
            boolean r1 = r1.f37745b     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L86
        L5e:
            int r1 = yads.lb3.f40466a     // Catch: java.lang.Throwable -> L83
            if (r1 < r5) goto L85
            yads.df0 r1 = r8.f39530g     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L85
            boolean r3 = r1.f37745b     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L85
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L85
            yads.df0 r1 = r8.f39530g     // Catch: java.lang.Throwable -> L83
            boolean r1 = r1.b()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L85
            yads.df0 r1 = r8.f39530g     // Catch: java.lang.Throwable -> L83
            yads.pk r3 = r8.f39531h     // Catch: java.lang.Throwable -> L83
            boolean r9 = r1.a(r9, r3)     // Catch: java.lang.Throwable -> L83
            if (r9 == 0) goto L85
            goto L86
        L83:
            r9 = move-exception
            goto L88
        L85:
            r2 = r4
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            return r2
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.if0.a(yads.nx0):boolean");
    }

    public final List a(af0 af0Var, boolean z5, int i10, k73 k73Var, int[] iArr) {
        qg2 qg2Var = new qg2() { // from class: zl.t
            @Override // yads.qg2
            public final boolean apply(Object obj) {
                return this.f46638b.a((nx0) obj);
            }
        };
        o51 o51Var = r51.f42498c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < k73Var.f40095b) {
            af0 af0Var2 = af0Var;
            boolean z10 = z5;
            int i13 = i10;
            k73 k73Var2 = k73Var;
            xe0 xe0Var = new xe0(i13, k73Var2, i11, af0Var2, iArr[i11], z10, qg2Var);
            int i14 = i12 + 1;
            if (objArrCopyOf.length < i14) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, k51.a(objArrCopyOf.length, i14));
            }
            objArrCopyOf[i12] = xe0Var;
            i11++;
            i12 = i14;
            i10 = i13;
            k73Var = k73Var2;
            af0Var = af0Var2;
            z5 = z10;
        }
        return r51.b(i12, objArrCopyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List a(yads.af0 r17, int[] r18, int r19, yads.k73 r20, int[] r21) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.if0.a(yads.af0, int[], int, yads.k73, int[]):java.util.List");
    }

    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @Override // yads.v73
    public final void a() {
        df0 df0Var;
        synchronized (this.f39526c) {
            try {
                if (lb3.f40466a >= 32 && (df0Var = this.f39530g) != null) {
                    df0Var.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f43923a = null;
        this.f43924b = null;
    }

    public final Pair a(ni1 ni1Var, int[][][] iArr, af0 af0Var) {
        boolean z5 = false;
        int i10 = 0;
        while (true) {
            if (i10 < ni1Var.f41249a) {
                if (2 == ni1Var.f41250b[i10] && ni1Var.f41251c[i10].f40444b > 0) {
                    z5 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return a(1, ni1Var, iArr, new com.google.firebase.messaging.h(this, af0Var, z5), new d2.a(25));
    }

    public static Pair a(ni1 ni1Var, int[][][] iArr, af0 af0Var, String str) {
        return a(3, ni1Var, iArr, new zl.s(0, af0Var, str), new d2.a(26));
    }

    public static Pair a(int i10, ni1 ni1Var, int[][][] iArr, ff0 ff0Var, Comparator comparator) {
        int i11;
        RandomAccess randomAccessA;
        ni1 ni1Var2 = ni1Var;
        ArrayList arrayList = new ArrayList();
        int i12 = ni1Var2.f41249a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == ni1Var2.f41250b[i13]) {
                l73 l73Var = ni1Var2.f41251c[i13];
                for (int i14 = 0; i14 < l73Var.f40444b; i14++) {
                    k73 k73VarA = l73Var.a(i14);
                    List listA = ff0Var.a(i13, k73VarA, iArr[i13][i14]);
                    boolean[] zArr = new boolean[k73VarA.f40095b];
                    int i15 = 0;
                    while (i15 < k73VarA.f40095b) {
                        gf0 gf0Var = (gf0) listA.get(i15);
                        int iA = gf0Var.a();
                        if (zArr[i15] || iA == 0) {
                            i11 = i12;
                        } else {
                            if (iA == 1) {
                                randomAccessA = r51.a(gf0Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gf0Var);
                                int i16 = i15 + 1;
                                while (i16 < k73VarA.f40095b) {
                                    gf0 gf0Var2 = (gf0) listA.get(i16);
                                    int i17 = i12;
                                    if (gf0Var2.a() == 2 && gf0Var.a(gf0Var2)) {
                                        arrayList2.add(gf0Var2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    i12 = i17;
                                }
                                randomAccessA = arrayList2;
                            }
                            i11 = i12;
                            arrayList.add(randomAccessA);
                        }
                        i15++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            ni1Var2 = ni1Var;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((gf0) list.get(i18)).f38752d;
        }
        gf0 gf0Var3 = (gf0) list.get(0);
        return Pair.create(new np0(0, gf0Var3.f38751c, iArr2), Integer.valueOf(gf0Var3.f38750b));
    }

    public static Pair a(ni1 ni1Var, int[][][] iArr, int[] iArr2, af0 af0Var) {
        return a(2, ni1Var, iArr, new zl.s(1, af0Var, iArr2), new d2.a(27));
    }

    @Override // yads.v73
    public final void a(pk pkVar) {
        boolean zEquals;
        synchronized (this.f39526c) {
            zEquals = this.f39531h.equals(pkVar);
            this.f39531h = pkVar;
        }
        if (zEquals) {
            return;
        }
        b();
    }

    public static List a(af0 af0Var, String str, int i10, k73 k73Var, int[] iArr) {
        o51 o51Var = r51.f42498c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < k73Var.f40095b) {
            af0 af0Var2 = af0Var;
            String str2 = str;
            int i13 = i10;
            k73 k73Var2 = k73Var;
            ef0 ef0Var = new ef0(i13, k73Var2, i11, af0Var2, iArr[i11], str2);
            int i14 = i12 + 1;
            if (objArrCopyOf.length < i14) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, k51.a(objArrCopyOf.length, i14));
            }
            objArrCopyOf[i12] = ef0Var;
            i11++;
            i12 = i14;
            i10 = i13;
            k73Var = k73Var2;
            af0Var = af0Var2;
            str = str2;
        }
        return r51.b(i12, objArrCopyOf);
    }
}
