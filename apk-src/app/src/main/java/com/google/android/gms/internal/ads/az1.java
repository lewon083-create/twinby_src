package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class az1 implements gy1, b2, r {
    public static final Map P;
    public static final jx1 Q;
    public o2 A;
    public long B;
    public boolean C;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public long J;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f3496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g91 f3497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c6 f3498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n90 f3499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ly1 f3500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cz1 f3501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f3502h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f3503j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l91 f3505l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public fy1 f3510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d4 f3511r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3518y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public na1 f3519z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final oq0 f3504k = new oq0(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cb0 f3506m = new cb0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xy1 f3507n = new xy1(this, 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final xy1 f3508o = new xy1(this, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f3509p = cq0.n();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zy1[] f3514u = new zy1[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public fz1[] f3513t = new fz1[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public vy1[] f3512s = new vy1[0];
    public long K = -9223372036854775807L;
    public int D = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        P = Collections.unmodifiableMap(map);
        ow1 ow1Var = new ow1();
        ow1Var.f8822a = "icy";
        ow1Var.e("application/x-icy");
        Q = new jx1(ow1Var);
    }

    public az1(Uri uri, g91 g91Var, l91 l91Var, c6 c6Var, ly1 ly1Var, n90 n90Var, cz1 cz1Var, i iVar, int i, long j10) {
        this.f3496b = uri;
        this.f3497c = g91Var;
        this.f3498d = c6Var;
        this.f3500f = ly1Var;
        this.f3499e = n90Var;
        this.f3501g = cz1Var;
        this.f3502h = iVar;
        this.i = i;
        this.f3505l = l91Var;
        this.f3503j = j10;
    }

    @Override // com.google.android.gms.internal.ads.b2
    public final w2 O(int i, int i10) {
        return s(new zy1(i, false));
    }

    @Override // com.google.android.gms.internal.ads.b2
    public final void U(o2 o2Var) {
        this.f3509p.post(new my1(1, this, o2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // com.google.android.gms.internal.ads.gy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r12) {
        /*
            r11 = this;
            boolean r0 = r11.f3518y
            if (r0 == 0) goto L5
            goto L5d
        L5:
            r11.z()
            boolean r0 = r11.y()
            if (r0 != 0) goto L5d
            com.google.android.gms.internal.ads.na1 r0 = r11.f3519z
            java.lang.Object r0 = r0.f8261e
            boolean[] r0 = (boolean[]) r0
            com.google.android.gms.internal.ads.fz1[] r1 = r11.f3513t
            int r1 = r1.length
            r2 = 0
        L18:
            if (r2 >= r1) goto L5d
            com.google.android.gms.internal.ads.fz1[] r3 = r11.f3513t
            r4 = r3[r2]
            boolean r3 = r0[r2]
            com.google.android.gms.internal.ads.dz1 r10 = r4.f5527a
            monitor-enter(r4)
            int r5 = r4.f5540o     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L32
            long[] r6 = r4.f5538m     // Catch: java.lang.Throwable -> L3e
            r7 = r5
            int r5 = r4.f5542q     // Catch: java.lang.Throwable -> L3e
            r8 = r6[r5]     // Catch: java.lang.Throwable -> L3e
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 >= 0) goto L34
        L32:
            r7 = r12
            goto L51
        L34:
            if (r3 == 0) goto L41
            int r3 = r4.f5543r     // Catch: java.lang.Throwable -> L3e
            if (r3 == r7) goto L41
            int r3 = r3 + 1
            r6 = r3
            goto L42
        L3e:
            r0 = move-exception
            r12 = r0
            goto L5b
        L41:
            r6 = r7
        L42:
            r9 = 0
            r7 = r12
            int r12 = r4.h(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L3e
            r13 = -1
            if (r12 == r13) goto L51
            long r12 = r4.i(r12)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r4)
            goto L54
        L51:
            monitor-exit(r4)
            r12 = -1
        L54:
            r10.b(r12)
            int r2 = r2 + 1
            r12 = r7
            goto L18
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            throw r12
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.az1.a(long):void");
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long b(d[] dVarArr, boolean[] zArr, gz1[] gz1VarArr, boolean[] zArr2, long j10) {
        d dVar;
        z();
        na1 na1Var = this.f3519z;
        mz1 mz1Var = (mz1) na1Var.f8259c;
        boolean[] zArr3 = (boolean[]) na1Var.f8261e;
        int i = this.H;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            gz1 gz1Var = gz1VarArr[i10];
            if (gz1Var != null && (dVarArr[i10] == null || !zArr[i10])) {
                int i11 = ((yy1) gz1Var).f12799a;
                ix.k0(zArr3[i11]);
                this.H--;
                zArr3[i11] = false;
                gz1VarArr[i10] = null;
            }
        }
        boolean z5 = !this.E ? j10 == 0 || this.f3518y : i != 0;
        for (int i12 = 0; i12 < dVarArr.length; i12++) {
            if (gz1VarArr[i12] == null && (dVar = dVarArr[i12]) != null) {
                ix.k0(dVar.i() == 1);
                ix.k0(dVar.t(0) == 0);
                int iIndexOf = mz1Var.f8056b.indexOf(dVar.h());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                ix.k0(!zArr3[iIndexOf]);
                this.H++;
                zArr3[iIndexOf] = true;
                this.G = dVar.l().f6981s | this.G;
                gz1VarArr[i12] = new yy1(this, iIndexOf);
                zArr2[i12] = true;
                if (!z5) {
                    fz1 fz1Var = this.f3513t[iIndexOf];
                    z5 = (fz1Var.f5541p + fz1Var.f5543r == 0 || fz1Var.m(j10, true)) ? false : true;
                }
            }
        }
        if (this.H == 0) {
            this.L = false;
            this.F = false;
            this.G = false;
            oq0 oq0Var = this.f3504k;
            if (((q) oq0Var.f8763d) != null) {
                for (fz1 fz1Var2 : this.f3513t) {
                    fz1Var2.n();
                }
                q qVar = (q) oq0Var.f8763d;
                qVar.getClass();
                qVar.a(false);
            } else {
                this.N = false;
                for (fz1 fz1Var3 : this.f3513t) {
                    fz1Var3.k(false);
                }
            }
        } else if (z5) {
            j10 = k(j10);
            for (int i13 = 0; i13 < gz1VarArr.length; i13++) {
                if (gz1VarArr[i13] != null) {
                    zArr2[i13] = true;
                }
            }
        }
        this.E = true;
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.gy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(long r26, com.google.android.gms.internal.ads.uu1 r28) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.az1.c(long, com.google.android.gms.internal.ads.uu1):long");
    }

    public final void d(wy1 wy1Var, boolean z5) {
        Uri uri = wy1Var.f11926b.f9550c;
        zx1 zx1Var = new zx1();
        long j10 = wy1Var.i;
        long j11 = this.B;
        n90 n90Var = this.f3499e;
        n90Var.q(new ky1(n90Var, zx1Var, new ey1(-1, null, cq0.r(j10), cq0.r(j11)), 1));
        if (z5) {
            return;
        }
        for (fz1 fz1Var : this.f3513t) {
            fz1Var.k(false);
        }
        if (this.H > 0) {
            fy1 fy1Var = this.f3510q;
            fy1Var.getClass();
            fy1Var.d(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long e() {
        return f();
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long f() {
        long jX;
        boolean z5;
        long j10;
        z();
        if (this.N || this.H == 0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.K;
        }
        if (this.f3517x) {
            int length = this.f3513t.length;
            jX = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                na1 na1Var = this.f3519z;
                if (((boolean[]) na1Var.f8260d)[i] && ((boolean[]) na1Var.f8261e)[i]) {
                    fz1 fz1Var = this.f3513t[i];
                    synchronized (fz1Var) {
                        z5 = fz1Var.f5547v;
                    }
                    if (z5) {
                        continue;
                    } else {
                        fz1 fz1Var2 = this.f3513t[i];
                        synchronized (fz1Var2) {
                            j10 = fz1Var2.f5546u;
                        }
                        jX = Math.min(jX, j10);
                    }
                }
            }
        } else {
            jX = Long.MAX_VALUE;
        }
        if (jX == Long.MAX_VALUE) {
            jX = x(false);
        }
        return jX == Long.MIN_VALUE ? this.J : jX;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final mz1 g() {
        z();
        return (mz1) this.f3519z.f8259c;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void h() throws IOException {
        IOException iOException;
        int i = this.D == 7 ? 6 : 3;
        oq0 oq0Var = this.f3504k;
        IOException iOException2 = (IOException) oq0Var.f8764e;
        if (iOException2 != null) {
            throw iOException2;
        }
        q qVar = (q) oq0Var.f8763d;
        if (qVar != null && (iOException = qVar.f9246d) != null && qVar.f9247e > i) {
            throw iOException;
        }
        if (this.N && !this.f3516w) {
            throw eb.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final void i(wy1 wy1Var) {
        if (this.B == -9223372036854775807L && this.A != null) {
            long jX = x(true);
            long j10 = jX == Long.MIN_VALUE ? 0L : jX + 10000;
            this.B = j10;
            this.f3501g.s(j10, this.A, this.C);
        }
        Uri uri = wy1Var.f11926b.f9550c;
        zx1 zx1Var = new zx1();
        long j11 = wy1Var.i;
        long j12 = this.B;
        n90 n90Var = this.f3499e;
        n90Var.q(new ky1(n90Var, zx1Var, new ey1(-1, null, cq0.r(j11), cq0.r(j12)), 0));
        this.N = true;
        fy1 fy1Var = this.f3510q;
        fy1Var.getClass();
        fy1Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean j(yt1 yt1Var) {
        if (this.N) {
            return false;
        }
        oq0 oq0Var = this.f3504k;
        if (((IOException) oq0Var.f8764e) != null || this.L) {
            return false;
        }
        if (this.f3516w && this.H == 0) {
            return false;
        }
        boolean zA = this.f3506m.a();
        if (((q) oq0Var.f8763d) != null) {
            return zA;
        }
        v();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    @Override // com.google.android.gms.internal.ads.gy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(long r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.az1.k(long):long");
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void l(fy1 fy1Var, long j10) {
        this.f3510q = fy1Var;
        this.f3506m.a();
        v();
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long m() {
        if (this.G) {
            this.G = false;
        } else {
            if (!this.F) {
                return -9223372036854775807L;
            }
            if (!this.N && w() <= this.M) {
                return -9223372036854775807L;
            }
            this.F = false;
        }
        return this.J;
    }

    public final void o(int i) {
        z();
        na1 na1Var = this.f3519z;
        boolean[] zArr = (boolean[]) na1Var.f8262f;
        if (zArr[i]) {
            return;
        }
        jx1 jx1Var = ((mz1) na1Var.f8259c).a(i).f9073d[0];
        ey1 ey1Var = new ey1(ra.f(jx1Var.f6975m), jx1Var, cq0.r(this.J), -9223372036854775807L);
        n90 n90Var = this.f3499e;
        n90Var.q(new ly1(n90Var, ey1Var));
        zArr[i] = true;
    }

    public final void p(int i) {
        z();
        if (this.L) {
            if ((!this.f3517x || ((boolean[]) this.f3519z.f8260d)[i]) && !this.f3513t[i].l(false)) {
                this.K = 0L;
                this.L = false;
                this.F = true;
                this.J = 0L;
                this.M = 0;
                for (fz1 fz1Var : this.f3513t) {
                    fz1Var.k(false);
                }
                fy1 fy1Var = this.f3510q;
                fy1Var.getClass();
                fy1Var.d(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean q() {
        boolean z5;
        if (((q) this.f3504k.f8763d) == null) {
            return false;
        }
        cb0 cb0Var = this.f3506m;
        synchronized (cb0Var) {
            z5 = cb0Var.f4133a;
        }
        return z5;
    }

    public final boolean r() {
        return this.F || y();
    }

    public final w2 s(zy1 zy1Var) {
        int length = this.f3513t.length;
        for (int i = 0; i < length; i++) {
            if (zy1Var.equals(this.f3514u[i])) {
                return this.f3513t[i];
            }
        }
        if (this.f3515v) {
            int i10 = zy1Var.f13149a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
            sb2.append("Extractor added new track (id=");
            sb2.append(i10);
            sb2.append(") after finishing tracks.");
            rs.r("ProgressiveMediaPeriod", sb2.toString());
            return new y1();
        }
        fz1 fz1Var = new fz1(this.f3502h, this.f3498d, this.f3500f);
        vy1 vy1Var = new vy1(fz1Var);
        fz1Var.f5531e = this;
        int i11 = length + 1;
        zy1[] zy1VarArr = (zy1[]) Arrays.copyOf(this.f3514u, i11);
        zy1VarArr[length] = zy1Var;
        String str = cq0.f4293a;
        this.f3514u = zy1VarArr;
        fz1[] fz1VarArr = (fz1[]) Arrays.copyOf(this.f3513t, i11);
        fz1VarArr[length] = fz1Var;
        this.f3513t = fz1VarArr;
        vy1[] vy1VarArr = (vy1[]) Arrays.copyOf(this.f3512s, i11);
        vy1VarArr[length] = vy1Var;
        this.f3512s = vy1VarArr;
        return vy1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        jx1 jx1Var;
        f9 f9VarC;
        int i;
        jx1 jx1Var2;
        long j10 = this.f3503j;
        if (this.O || this.f3516w || !this.f3515v || this.A == null) {
            return;
        }
        fz1[] fz1VarArr = this.f3513t;
        int length = fz1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                cb0 cb0Var = this.f3506m;
                synchronized (cb0Var) {
                    cb0Var.f4133a = false;
                }
                int length2 = this.f3513t.length;
                pi[] piVarArr = new pi[length2];
                boolean[] zArr = new boolean[length2];
                int i12 = 0;
                while (true) {
                    int i13 = 1;
                    if (i12 >= length2) {
                        break;
                    }
                    fz1 fz1Var = this.f3513t[i12];
                    synchronized (fz1Var) {
                        jx1Var = fz1Var.f5549x ? null : fz1Var.f5550y;
                    }
                    jx1Var.getClass();
                    String str = jx1Var.f6975m;
                    boolean zA = ra.a(str);
                    boolean z5 = (zA || ra.b(str)) ? true : i10;
                    zArr[i12] = z5;
                    int i14 = i10;
                    this.f3517x = (this.f3517x ? 1 : 0) | (z5 ? 1 : 0);
                    this.f3518y = (j10 != -9223372036854775807L && length2 == 1 && ra.c(str)) ? 1 : i14;
                    d4 d4Var = this.f3511r;
                    if (d4Var != null) {
                        if (zA || this.f3514u[i12].f13150b) {
                            f9 f9Var = jx1Var.f6973k;
                            if (f9Var == null) {
                                k8[] k8VarArr = new k8[1];
                                k8VarArr[i14] = d4Var;
                                f9VarC = new f9(k8VarArr);
                            } else {
                                k8[] k8VarArr2 = new k8[1];
                                k8VarArr2[i14] = d4Var;
                                f9VarC = f9Var.c(k8VarArr2);
                            }
                            ow1 ow1Var = new ow1(jx1Var);
                            ow1Var.f8830j = f9VarC;
                            jx1Var = new jx1(ow1Var);
                        }
                        if (zA && jx1Var.f6970g == -1 && jx1Var.f6971h == -1 && (i = d4Var.f4445a) != -1) {
                            ow1 ow1Var2 = new ow1(jx1Var);
                            ow1Var2.f8828g = i;
                            jx1Var = new jx1(ow1Var2);
                        }
                    }
                    this.f3498d.getClass();
                    if (jx1Var.f6979q == null) {
                        i13 = i14;
                    }
                    ow1 ow1Var3 = new ow1(jx1Var);
                    ow1Var3.K = i13;
                    jx1 jx1Var3 = new jx1(ow1Var3);
                    piVarArr[i12] = new pi(Integer.toString(i12), jx1Var3);
                    this.G |= jx1Var3.f6981s;
                    i12++;
                    i10 = i14;
                }
                this.f3519z = new na1(new mz1(piVarArr), zArr);
                if (this.f3518y && this.B == -9223372036854775807L) {
                    this.B = j10;
                    this.A = new ty1(this, this.A);
                }
                this.f3501g.s(this.B, this.A, this.C);
                this.f3516w = true;
                fy1 fy1Var = this.f3510q;
                fy1Var.getClass();
                fy1Var.i(this);
                return;
            }
            fz1 fz1Var2 = fz1VarArr[i11];
            synchronized (fz1Var2) {
                jx1Var2 = fz1Var2.f5549x ? null : fz1Var2.f5550y;
            }
            if (jx1Var2 == null) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b2
    public final void u() {
        this.f3515v = true;
        this.f3509p.post(this.f3507n);
    }

    public final void v() {
        wy1 wy1Var = new wy1(this, this.f3496b, this.f3497c, this.f3505l, this, this.f3506m);
        if (this.f3516w) {
            ix.k0(y());
            long j10 = this.B;
            if (j10 != -9223372036854775807L && this.K > j10) {
                this.N = true;
                this.K = -9223372036854775807L;
                return;
            }
            o2 o2Var = this.A;
            o2Var.getClass();
            p2 p2Var = o2Var.b(this.K).f8151a;
            long j11 = this.K;
            wy1Var.f11930f.f4793b = p2Var.f8888b;
            wy1Var.i = j11;
            wy1Var.f11932h = true;
            wy1Var.f11935l = false;
            for (fz1 fz1Var : this.f3513t) {
                fz1Var.f5544s = this.K;
            }
            this.K = -9223372036854775807L;
        }
        this.M = w();
        oq0 oq0Var = this.f3504k;
        oq0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        oq0Var.f8764e = null;
        q qVar = new q(oq0Var, looperMyLooper, wy1Var, this, SystemClock.elapsedRealtime());
        oq0 oq0Var2 = qVar.i;
        ix.k0(((q) oq0Var2.f8763d) == null);
        oq0Var2.f8763d = qVar;
        qVar.b();
    }

    public final int w() {
        int i = 0;
        for (fz1 fz1Var : this.f3513t) {
            i += fz1Var.f5541p + fz1Var.f5540o;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long x(boolean r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.fz1[] r3 = r6.f3513t
            int r4 = r3.length
            if (r0 >= r4) goto L27
            if (r7 != 0) goto L17
            com.google.android.gms.internal.ads.na1 r4 = r6.f3519z
            r4.getClass()
            java.lang.Object r4 = r4.f8261e
            boolean[] r4 = (boolean[]) r4
            boolean r4 = r4[r0]
            if (r4 == 0) goto L21
        L17:
            r3 = r3[r0]
            monitor-enter(r3)
            long r4 = r3.f5546u     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            long r1 = java.lang.Math.max(r1, r4)
        L21:
            int r0 = r0 + 1
            goto L3
        L24:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r7
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.az1.x(boolean):long");
    }

    public final boolean y() {
        return this.K != -9223372036854775807L;
    }

    public final void z() {
        ix.k0(this.f3516w);
        this.f3519z.getClass();
        this.A.getClass();
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final void n(long j10) {
    }
}
