package yads;

import android.util.SparseArray;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class os2 implements p73 {
    public nx0 A;
    public nx0 B;
    public boolean C;
    public boolean D;
    public long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ks2 f41694a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tk0 f41697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pk0 f41698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ns2 f41699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nx0 f41700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nk0 f41701h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f41709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f41710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f41711s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f41715w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f41718z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls2 f41695b = new ls2();
    public int i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f41702j = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f41703k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f41706n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f41705m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f41704l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o73[] f41707o = new o73[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i23 f41696c = new i23(new zl.g0(15));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f41712t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f41713u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f41714v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f41717y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f41716x = true;

    public os2(qe qeVar, tk0 tk0Var, pk0 pk0Var) {
        this.f41697d = tk0Var;
        this.f41698e = pk0Var;
        this.f41694a = new ks2(qeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x001a, B:9:0x001f, B:12:0x0023, B:16:0x002c, B:21:0x0078, B:23:0x007c, B:25:0x0087, B:27:0x009d, B:29:0x00a5, B:30:0x00a8, B:31:0x00ad, B:32:0x00ae, B:34:0x00b6, B:37:0x00c5, B:38:0x00d6, B:39:0x00db, B:40:0x00dc, B:41:0x00e1, B:43:0x00ea, B:24:0x0085, B:19:0x005f), top: B:48:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(long r8, int r10, long r11, int r13, yads.o73 r14) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.os2.a(long, int, long, int, yads.o73):void");
    }

    public final long b(int i) {
        int i10 = this.f41709q;
        int i11 = this.f41708p;
        int i12 = (i10 + i11) - i;
        if (i12 < 0 || i12 > i11 - this.f41711s) {
            throw new IllegalArgumentException();
        }
        int i13 = i11 - i12;
        this.f41708p = i13;
        this.f41714v = Math.max(this.f41713u, d(i13));
        this.f41715w = i12 == 0 && this.f41715w;
        this.f41696c.a(i);
        int i14 = this.f41708p;
        if (i14 == 0) {
            return 0L;
        }
        int iE = e(i14 - 1);
        return this.f41703k[iE] + ((long) this.f41704l[iE]);
    }

    public final void c(int i) {
        ks2 ks2Var = this.f41694a;
        long jB = b(i);
        if (jB > ks2Var.f40319g) {
            throw new IllegalArgumentException();
        }
        ks2Var.f40319g = jB;
        if (jB != 0) {
            js2 js2Var = ks2Var.f40316d;
            if (jB != js2Var.f39968a) {
                while (ks2Var.f40319g > js2Var.f39969b) {
                    js2Var = js2Var.f39971d;
                }
                js2 js2Var2 = js2Var.f39971d;
                js2Var2.getClass();
                ks2Var.a(js2Var2);
                js2 js2Var3 = new js2(ks2Var.f40314b, js2Var.f39969b);
                js2Var.f39971d = js2Var3;
                if (ks2Var.f40319g == js2Var.f39969b) {
                    js2Var = js2Var3;
                }
                ks2Var.f40318f = js2Var;
                if (ks2Var.f40317e == js2Var2) {
                    ks2Var.f40317e = js2Var3;
                    return;
                }
                return;
            }
        }
        ks2Var.a(ks2Var.f40316d);
        js2 js2Var4 = new js2(ks2Var.f40314b, ks2Var.f40319g);
        ks2Var.f40316d = js2Var4;
        ks2Var.f40317e = js2Var4;
        ks2Var.f40318f = js2Var4;
    }

    public final long d(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iE = e(i - 1);
        for (int i10 = 0; i10 < i; i10++) {
            jMax = Math.max(jMax, this.f41706n[iE]);
            if ((this.f41705m[iE] & 1) != 0) {
                return jMax;
            }
            iE--;
            if (iE == -1) {
                iE = this.i - 1;
            }
        }
        return jMax;
    }

    public final int e(int i) {
        int i10 = this.f41710r + i;
        int i11 = this.i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized void e() {
        this.f41711s = 0;
        ks2 ks2Var = this.f41694a;
        ks2Var.f40317e = ks2Var.f40316d;
    }

    public final void d() {
        nk0 nk0Var = this.f41701h;
        if (nk0Var != null) {
            nk0Var.a(this.f41698e);
            this.f41701h = null;
            this.f41700g = null;
        }
    }

    public final synchronized long b() {
        return this.f41714v;
    }

    public final void b(boolean z5) {
        ks2 ks2Var = this.f41694a;
        ks2Var.a(ks2Var.f40316d);
        ks2Var.f40316d.a(ks2Var.f40314b, 0L);
        js2 js2Var = ks2Var.f40316d;
        ks2Var.f40317e = js2Var;
        ks2Var.f40318f = js2Var;
        ks2Var.f40319g = 0L;
        ((ib0) ks2Var.f40313a).c();
        this.f41708p = 0;
        this.f41709q = 0;
        this.f41710r = 0;
        this.f41711s = 0;
        this.f41716x = true;
        this.f41712t = Long.MIN_VALUE;
        this.f41713u = Long.MIN_VALUE;
        this.f41714v = Long.MIN_VALUE;
        this.f41715w = false;
        i23 i23Var = this.f41696c;
        for (int i = 0; i < i23Var.f39414b.size(); i++) {
            i23Var.f39415c.accept(i23Var.f39414b.valueAt(i));
        }
        i23Var.f39413a = -1;
        i23Var.f39414b.clear();
        if (z5) {
            this.A = null;
            this.B = null;
            this.f41717y = true;
        }
    }

    public final synchronized nx0 c() {
        return this.f41717y ? null : this.B;
    }

    public final synchronized boolean b(long j10, boolean z5) throws Throwable {
        try {
            try {
                e();
                int iE = e(this.f41711s);
                int i = this.f41711s;
                int i10 = this.f41708p;
                if (i != i10 && j10 >= this.f41706n[iE]) {
                    if (j10 <= this.f41714v || z5) {
                        int iA = a(iE, i10 - i, j10, true);
                        if (iA == -1) {
                            return false;
                        }
                        this.f41712t = j10;
                        this.f41711s += iA;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final long a(int i) {
        this.f41713u = Math.max(this.f41713u, d(i));
        this.f41708p -= i;
        int i10 = this.f41709q + i;
        this.f41709q = i10;
        int i11 = this.f41710r + i;
        this.f41710r = i11;
        int i12 = this.i;
        if (i11 >= i12) {
            this.f41710r = i11 - i12;
        }
        int i13 = this.f41711s - i;
        this.f41711s = i13;
        if (i13 < 0) {
            this.f41711s = 0;
        }
        this.f41696c.b(i10);
        if (this.f41708p == 0) {
            int i14 = this.f41710r;
            if (i14 == 0) {
                i14 = this.i;
            }
            int i15 = i14 - 1;
            return this.f41703k[i15] + ((long) this.f41704l[i15]);
        }
        return this.f41703k[this.f41710r];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r12, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            r11 = this;
            yads.ks2 r0 = r11.f41694a
            monitor-enter(r11)
            int r1 = r11.f41708p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f41706n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f41710r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r15 == 0) goto L1d
            int r15 = r11.f41711s     // Catch: java.lang.Throwable -> L22
            if (r15 == r1) goto L1d
            int r1 = r15 + 1
        L1d:
            r5 = r11
            r8 = r12
            r10 = r14
            r7 = r1
            goto L26
        L22:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L26:
            int r12 = r5.a(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.a(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.a(r2)
            return
        L40:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.os2.a(long, boolean, boolean):void");
    }

    public final void a() {
        long jA;
        ks2 ks2Var = this.f41694a;
        synchronized (this) {
            int i = this.f41708p;
            jA = i == 0 ? -1L : a(i);
        }
        ks2Var.a(jA);
    }

    public final int a(int i, int i10, long j10, boolean z5) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j11 = this.f41706n[i];
            if (j11 > j10) {
                break;
            }
            if (!z5 || (this.f41705m[i] & 1) != 0) {
                if (j11 == j10) {
                    return i12;
                }
                i11 = i12;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i11;
    }

    @Override // yads.p73
    public final void a(nx0 nx0Var) {
        nx0 nx0Var2;
        if (this.E == 0 || nx0Var.f41379q == Long.MAX_VALUE) {
            nx0Var2 = nx0Var;
        } else {
            mx0 mx0Var = new mx0(nx0Var);
            mx0Var.f41079o = nx0Var.f41379q + this.E;
            nx0Var2 = new nx0(mx0Var);
        }
        boolean z5 = false;
        this.f41718z = false;
        this.A = nx0Var;
        synchronized (this) {
            try {
                this.f41717y = false;
                if (!lb3.a(nx0Var2, this.B)) {
                    if (this.f41696c.f39414b.size() != 0) {
                        SparseArray sparseArray = this.f41696c.f39414b;
                        if (((ms2) sparseArray.valueAt(sparseArray.size() - 1)).f40998a.equals(nx0Var2)) {
                            SparseArray sparseArray2 = this.f41696c.f39414b;
                            this.B = ((ms2) sparseArray2.valueAt(sparseArray2.size() - 1)).f40998a;
                        }
                        nx0 nx0Var3 = this.B;
                        this.C = jt1.a(nx0Var3.f41375m, nx0Var3.f41372j);
                        this.D = false;
                        z5 = true;
                    }
                    this.B = nx0Var2;
                    nx0 nx0Var32 = this.B;
                    this.C = jt1.a(nx0Var32.f41375m, nx0Var32.f41372j);
                    this.D = false;
                    z5 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ns2 ns2Var = this.f41699f;
        if (ns2Var == null || !z5) {
            return;
        }
        gk2 gk2Var = (gk2) ns2Var;
        gk2Var.f38801q.post(gk2Var.f38799o);
    }

    public final synchronized int a(long j10, boolean z5) throws Throwable {
        try {
            try {
                int iE = e(this.f41711s);
                int i = this.f41711s;
                int i10 = this.f41708p;
                if (i == i10 || j10 < this.f41706n[iE]) {
                    return 0;
                }
                if (j10 > this.f41714v && z5) {
                    return i10 - i;
                }
                int iA = a(iE, i10 - i, j10, true);
                if (iA == -1) {
                    return 0;
                }
                return iA;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    public final synchronized boolean a(boolean z5) {
        nx0 nx0Var;
        int i = this.f41711s;
        boolean z10 = false;
        if (i != this.f41708p) {
            if (((ms2) this.f41696c.c(this.f41709q + i)).f40998a != this.f41700g) {
                return true;
            }
            int iE = e(this.f41711s);
            nk0 nk0Var = this.f41701h;
            if (nk0Var == null || nk0Var.getState() == 4 || ((this.f41705m[iE] & 1073741824) == 0 && this.f41701h.a())) {
                z10 = true;
            }
            return z10;
        }
        if (z5 || this.f41715w || ((nx0Var = this.B) != null && nx0Var != this.f41700g)) {
            z10 = true;
        }
        return z10;
    }

    public final void a(nx0 nx0Var, ox0 ox0Var) {
        nx0 nx0Var2;
        nx0 nx0Var3 = this.f41700g;
        boolean z5 = nx0Var3 == null;
        lk0 lk0Var = z5 ? null : nx0Var3.f41378p;
        this.f41700g = nx0Var;
        lk0 lk0Var2 = nx0Var.f41378p;
        tk0 tk0Var = this.f41697d;
        if (tk0Var != null) {
            int iA = tk0Var.a(nx0Var);
            mx0 mx0Var = new mx0(nx0Var);
            mx0Var.D = iA;
            nx0Var2 = new nx0(mx0Var);
        } else {
            nx0Var2 = nx0Var;
        }
        ox0Var.f41759b = nx0Var2;
        ox0Var.f41758a = this.f41701h;
        if (this.f41697d == null) {
            return;
        }
        if (z5 || !lb3.a(lk0Var, lk0Var2)) {
            nk0 nk0Var = this.f41701h;
            nk0 nk0VarB = this.f41697d.b(this.f41698e, nx0Var);
            this.f41701h = nk0VarB;
            ox0Var.f41758a = nk0VarB;
            if (nk0Var != null) {
                nk0Var.a(this.f41698e);
            }
        }
    }

    public final int a(ox0 ox0Var, sa0 sa0Var, int i, boolean z5) {
        int i10;
        boolean z10 = (i & 2) != 0;
        ls2 ls2Var = this.f41695b;
        synchronized (this) {
            try {
                sa0Var.f42865e = false;
                int i11 = this.f41711s;
                i10 = -5;
                if (i11 != this.f41708p) {
                    nx0 nx0Var = ((ms2) this.f41696c.c(this.f41709q + i11)).f40998a;
                    if (!z10 && nx0Var == this.f41700g) {
                        int iE = e(this.f41711s);
                        nk0 nk0Var = this.f41701h;
                        if (nk0Var != null && nk0Var.getState() != 4 && ((this.f41705m[iE] & 1073741824) != 0 || !this.f41701h.a())) {
                            sa0Var.f42865e = true;
                            i10 = -3;
                        }
                        int i12 = this.f41705m[iE];
                        sa0Var.f43049b = i12;
                        long j10 = this.f41706n[iE];
                        sa0Var.f42866f = j10;
                        if (j10 < this.f41712t) {
                            sa0Var.f43049b = i12 | VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                        }
                        ls2Var.f40654a = this.f41704l[iE];
                        ls2Var.f40655b = this.f41703k[iE];
                        ls2Var.f40656c = this.f41707o[iE];
                        i10 = -4;
                    }
                    a(nx0Var, ox0Var);
                } else {
                    if (!z5 && !this.f41715w) {
                        nx0 nx0Var2 = this.B;
                        if (nx0Var2 == null || (!z10 && nx0Var2 == this.f41700g)) {
                            i10 = -3;
                        } else {
                            a(nx0Var2, ox0Var);
                        }
                    }
                    sa0Var.f43049b = 4;
                    i10 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 == -4 && !sa0Var.b(4)) {
            boolean z11 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z11) {
                    ks2 ks2Var = this.f41694a;
                    ks2.a(ks2Var.f40317e, sa0Var, this.f41695b, ks2Var.f40315c);
                } else {
                    ks2 ks2Var2 = this.f41694a;
                    ks2Var2.f40317e = ks2.a(ks2Var2.f40317e, sa0Var, this.f41695b, ks2Var2.f40315c);
                }
            }
            if (!z11) {
                this.f41711s++;
            }
        }
        return i10;
    }

    @Override // yads.p73
    public final int a(l30 l30Var, int i, boolean z5) throws EOFException {
        ks2 ks2Var = this.f41694a;
        js2 js2Var = ks2Var.f40318f;
        if (js2Var.f39970c == null) {
            pe peVarA = ((ib0) ks2Var.f40313a).a();
            js2 js2Var2 = new js2(ks2Var.f40314b, ks2Var.f40318f.f39969b);
            js2Var.f39970c = peVarA;
            js2Var.f39971d = js2Var2;
        }
        int iMin = Math.min(i, (int) (ks2Var.f40318f.f39969b - ks2Var.f40319g));
        js2 js2Var3 = ks2Var.f40318f;
        pe peVar = js2Var3.f39970c;
        int i10 = l30Var.read(peVar.f41903a, ((int) (ks2Var.f40319g - js2Var3.f39968a)) + peVar.f41904b, iMin);
        if (i10 == -1) {
            if (z5) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = ks2Var.f40319g + ((long) i10);
        ks2Var.f40319g = j10;
        js2 js2Var4 = ks2Var.f40318f;
        if (j10 == js2Var4.f39969b) {
            ks2Var.f40318f = js2Var4.f39971d;
        }
        return i10;
    }

    @Override // yads.p73
    public final void a(int i, lb2 lb2Var) {
        ks2 ks2Var = this.f41694a;
        while (i > 0) {
            js2 js2Var = ks2Var.f40318f;
            if (js2Var.f39970c == null) {
                pe peVarA = ((ib0) ks2Var.f40313a).a();
                js2 js2Var2 = new js2(ks2Var.f40314b, ks2Var.f40318f.f39969b);
                js2Var.f39970c = peVarA;
                js2Var.f39971d = js2Var2;
            }
            int iMin = Math.min(i, (int) (ks2Var.f40318f.f39969b - ks2Var.f40319g));
            js2 js2Var3 = ks2Var.f40318f;
            pe peVar = js2Var3.f39970c;
            lb2Var.a(peVar.f41903a, ((int) (ks2Var.f40319g - js2Var3.f39968a)) + peVar.f41904b, iMin);
            i -= iMin;
            long j10 = ks2Var.f40319g + ((long) iMin);
            ks2Var.f40319g = j10;
            js2 js2Var4 = ks2Var.f40318f;
            if (j10 == js2Var4.f39969b) {
                ks2Var.f40318f = js2Var4.f39971d;
            }
        }
        ks2Var.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    @Override // yads.p73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r10, int r12, int r13, int r14, yads.o73 r15) {
        /*
            r9 = this;
            boolean r1 = r9.f41718z
            if (r1 == 0) goto L12
            yads.nx0 r1 = r9.A
            if (r1 == 0) goto Lc
            r9.a(r1)
            goto L12
        Lc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L12:
            r1 = r12 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            r4 = r3
            goto L1b
        L1a:
            r4 = r2
        L1b:
            boolean r5 = r9.f41716x
            if (r5 == 0) goto L24
            if (r4 != 0) goto L22
            goto L31
        L22:
            r9.f41716x = r2
        L24:
            long r4 = r9.E
            long r4 = r4 + r10
            boolean r2 = r9.C
            if (r2 == 0) goto L53
            long r6 = r9.f41712t
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L32
        L31:
            return
        L32:
            if (r1 != 0) goto L53
            boolean r1 = r9.D
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Overriding unexpected non-sync sample for format: "
            r1.<init>(r2)
            yads.nx0 r2 = r9.B
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SampleQueue"
            yads.kh1.d(r2, r1)
            r9.D = r3
        L4f:
            r1 = r12 | 1
            r3 = r1
            goto L54
        L53:
            r3 = r12
        L54:
            yads.ks2 r1 = r9.f41694a
            long r1 = r1.f40319g
            long r7 = (long) r13
            long r1 = r1 - r7
            r7 = r14
            long r7 = (long) r7
            long r1 = r1 - r7
            r6 = r4
            r4 = r1
            r1 = r6
            r0 = r9
            r6 = r13
            r7 = r15
            r0.a(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.os2.a(long, int, int, int, yads.o73):void");
    }

    public static os2 a(qe qeVar) {
        return new os2(qeVar, null, null);
    }

    public static os2 a(qe qeVar, tk0 tk0Var, pk0 pk0Var) {
        tk0Var.getClass();
        pk0Var.getClass();
        return new os2(qeVar, tk0Var, pk0Var);
    }
}
