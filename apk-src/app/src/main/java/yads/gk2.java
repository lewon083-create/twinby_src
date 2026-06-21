package yads;

import android.net.Uri;
import android.os.Handler;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gk2 implements rm1, qq0, ag1, eg1, ns2 {
    public static final Map N;
    public static final nx0 O;
    public boolean B;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f38787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p30 f38788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tk0 f38789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ae0 f38790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dn1 f38791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pk0 f38792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ck2 f38793h;
    public final qe i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f38794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f38795k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cr f38797m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public qm1 f38802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q21 f38803s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f38806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f38807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f38808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public fk2 f38809y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public yw2 f38810z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hg1 f38796l = new hg1("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vy f38798n = new vy();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f38799o = new zl.p(this, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f38800p = new zl.p(this, 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f38801q = lb3.a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ek2[] f38805u = new ek2[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public os2[] f38804t = new os2[0];
    public long I = -9223372036854775807L;
    public long A = -9223372036854775807L;
    public int C = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        N = Collections.unmodifiableMap(map);
        mx0 mx0Var = new mx0();
        mx0Var.f41066a = "icy";
        mx0Var.f41075k = "application/x-icy";
        O = new nx0(mx0Var);
    }

    public gk2(Uri uri, p30 p30Var, cr crVar, tk0 tk0Var, pk0 pk0Var, ae0 ae0Var, dn1 dn1Var, ck2 ck2Var, qe qeVar, String str, int i) {
        this.f38787b = uri;
        this.f38788c = p30Var;
        this.f38789d = tk0Var;
        this.f38792g = pk0Var;
        this.f38790e = ae0Var;
        this.f38791f = dn1Var;
        this.f38793h = ck2Var;
        this.i = qeVar;
        this.f38794j = str;
        this.f38795k = i;
        this.f38797m = crVar;
    }

    @Override // yads.qq0
    public final void a() {
        this.f38806v = true;
        this.f38801q.post(this.f38799o);
    }

    public final void b(yw2 yw2Var) {
        this.f38810z = this.f38803s == null ? yw2Var : new xw2(-9223372036854775807L, 0L);
        this.A = yw2Var.c();
        boolean z5 = !this.G && yw2Var.c() == -9223372036854775807L;
        this.B = z5;
        this.C = z5 ? 7 : 1;
        ck2 ck2Var = this.f38793h;
        long j10 = this.A;
        boolean zB = yw2Var.b();
        boolean z10 = this.B;
        jk2 jk2Var = (jk2) ck2Var;
        if (j10 == -9223372036854775807L) {
            j10 = jk2Var.f39893p;
        }
        if (jk2Var.f39892o || jk2Var.f39893p != j10 || jk2Var.f39894q != zB || jk2Var.f39895r != z10) {
            jk2Var.f39893p = j10;
            jk2Var.f39894q = zB;
            jk2Var.f39895r = z10;
            jk2Var.f39892o = false;
            long j11 = jk2Var.f39893p;
            sz2 sz2Var = new sz2(j11, j11, jk2Var.f39894q, jk2Var.f39895r, jk2Var.f39886h);
            v63 hk2Var = sz2Var;
            if (jk2Var.f39892o) {
                hk2Var = new hk2(sz2Var);
            }
            jk2Var.a(hk2Var);
        }
        if (this.f38807w) {
            return;
        }
        g();
    }

    public final void c() {
        if (!this.f38807w) {
            throw new IllegalStateException();
        }
        this.f38809y.getClass();
        this.f38810z.getClass();
    }

    @Override // yads.ux2
    public final boolean continueLoading(long j10) {
        if (this.L || this.f38796l.f39175c != null || this.J) {
            return false;
        }
        if (this.f38807w && this.F == 0) {
            return false;
        }
        boolean zD = this.f38798n.d();
        if (this.f38796l.b()) {
            return zD;
        }
        i();
        return true;
    }

    public final int d() {
        int i = 0;
        for (os2 os2Var : this.f38804t) {
            i += os2Var.f41709q + os2Var.f41708p;
        }
        return i;
    }

    @Override // yads.rm1
    public final void discardBuffer(long j10, boolean z5) throws Throwable {
        c();
        if (this.I != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = this.f38809y.f38470c;
        int length = this.f38804t.length;
        for (int i = 0; i < length; i++) {
            this.f38804t[i].a(j10, z5, zArr[i]);
        }
    }

    public final void e() {
        if (this.M) {
            return;
        }
        qm1 qm1Var = this.f38802r;
        qm1Var.getClass();
        qm1Var.a((ux2) this);
    }

    public final /* synthetic */ void f() {
        this.G = true;
    }

    public final void g() {
        if (this.M || this.f38807w || !this.f38806v || this.f38810z == null) {
            return;
        }
        for (os2 os2Var : this.f38804t) {
            if (os2Var.c() == null) {
                return;
            }
        }
        vy vyVar = this.f38798n;
        synchronized (vyVar) {
            vyVar.f44222a = false;
        }
        int length = this.f38804t.length;
        k73[] k73VarArr = new k73[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            nx0 nx0VarC = this.f38804t[i].c();
            nx0VarC.getClass();
            String str = nx0VarC.f41375m;
            boolean zEquals = "audio".equals(jt1.c(str));
            boolean z5 = zEquals || RRWebVideoEvent.EVENT_TAG.equals(jt1.c(str));
            zArr[i] = z5;
            this.f38808x = z5 | this.f38808x;
            q21 q21Var = this.f38803s;
            if (q21Var != null) {
                if (zEquals || this.f38805u[i].f38159b) {
                    vs1 vs1Var = nx0VarC.f41373k;
                    vs1 vs1Var2 = vs1Var == null ? new vs1(q21Var) : new vs1((us1[]) lb3.a((Object[]) vs1Var.f44117b, (Object[]) new us1[]{q21Var}));
                    mx0 mx0Var = new mx0(nx0VarC);
                    mx0Var.i = vs1Var2;
                    nx0VarC = new nx0(mx0Var);
                }
                if (zEquals && nx0VarC.f41370g == -1 && nx0VarC.f41371h == -1 && q21Var.f42141b != -1) {
                    mx0 mx0Var2 = new mx0(nx0VarC);
                    mx0Var2.f41071f = q21Var.f42141b;
                    nx0VarC = new nx0(mx0Var2);
                }
            }
            int iA = this.f38789d.a(nx0VarC);
            mx0 mx0Var3 = new mx0(nx0VarC);
            mx0Var3.D = iA;
            k73VarArr[i] = new k73(Integer.toString(i), new nx0(mx0Var3));
        }
        this.f38809y = new fk2(new l73(k73VarArr), zArr);
        this.f38807w = true;
        qm1 qm1Var = this.f38802r;
        qm1Var.getClass();
        qm1Var.a((rm1) this);
    }

    @Override // yads.ux2
    public final long getBufferedPositionUs() {
        long jA;
        boolean z5;
        c();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        long j10 = this.I;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        if (this.f38808x) {
            int length = this.f38804t.length;
            jA = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                fk2 fk2Var = this.f38809y;
                if (fk2Var.f38469b[i] && fk2Var.f38470c[i]) {
                    os2 os2Var = this.f38804t[i];
                    synchronized (os2Var) {
                        z5 = os2Var.f41715w;
                    }
                    if (!z5) {
                        jA = Math.min(jA, this.f38804t[i].b());
                    }
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == Long.MAX_VALUE) {
            jA = a(false);
        }
        return jA == Long.MIN_VALUE ? this.H : jA;
    }

    @Override // yads.ux2
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // yads.rm1
    public final l73 getTrackGroups() {
        c();
        return this.f38809y.f38468a;
    }

    public final void h() {
        this.f38801q.post(new zl.p(this, 0));
    }

    public final void i() {
        bk2 bk2Var = new bk2(this, this.f38787b, this.f38788c, this.f38797m, this, this.f38798n);
        if (this.f38807w) {
            long j10 = this.I;
            if (j10 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j11 = this.A;
            if (j11 != -9223372036854775807L && j10 > j11) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            yw2 yw2Var = this.f38810z;
            yw2Var.getClass();
            long j12 = yw2Var.b(this.I).f44509a.f36876b;
            long j13 = this.I;
            bk2Var.f37080f.f39538a = j12;
            bk2Var.i = j13;
            bk2Var.f37082h = true;
            bk2Var.f37085l = false;
            for (os2 os2Var : this.f38804t) {
                os2Var.f41712t = this.I;
            }
            this.I = -9223372036854775807L;
        }
        this.K = d();
        this.f38796l.a(bk2Var, this, this.f38790e.a(this.C));
        u30 u30Var = bk2Var.f37083j;
        dn1 dn1Var = this.f38791f;
        Uri uri = u30Var.f43533a;
        dn1Var.c(new xf1(), new jm1(1, -1, null, 0, null, dn1Var.a(bk2Var.i), dn1Var.a(this.A)));
    }

    @Override // yads.ux2
    public final boolean isLoading() {
        boolean z5;
        if (!this.f38796l.b()) {
            return false;
        }
        vy vyVar = this.f38798n;
        synchronized (vyVar) {
            z5 = vyVar.f44222a;
        }
        return z5;
    }

    @Override // yads.rm1
    public final void maybeThrowPrepareError() throws IOException {
        this.f38796l.a(this.f38790e.a(this.C));
        if (this.L && !this.f38807w) {
            throw new qb2("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // yads.rm1
    public final long readDiscontinuity() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && d() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    @Override // yads.rm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r7) {
        /*
            r6 = this;
            r6.c()
            yads.fk2 r0 = r6.f38809y
            boolean[] r0 = r0.f38469b
            yads.yw2 r1 = r6.f38810z
            boolean r1 = r1.b()
            if (r1 == 0) goto L10
            goto L12
        L10:
            r7 = 0
        L12:
            r1 = 0
            r6.E = r1
            r6.H = r7
            long r2 = r6.I
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            r6.I = r7
            return r7
        L25:
            int r2 = r6.C
            r3 = 7
            if (r2 == r3) goto L46
            yads.os2[] r2 = r6.f38804t
            int r2 = r2.length
            r3 = r1
        L2e:
            if (r3 >= r2) goto L85
            yads.os2[] r4 = r6.f38804t
            r4 = r4[r3]
            boolean r4 = r4.b(r7, r1)
            if (r4 != 0) goto L43
            boolean r4 = r0[r3]
            if (r4 != 0) goto L46
            boolean r4 = r6.f38808x
            if (r4 != 0) goto L43
            goto L46
        L43:
            int r3 = r3 + 1
            goto L2e
        L46:
            r6.J = r1
            r6.I = r7
            r6.L = r1
            yads.hg1 r0 = r6.f38796l
            boolean r0 = r0.b()
            if (r0 == 0) goto L72
            yads.os2[] r0 = r6.f38804t
            int r2 = r0.length
            r3 = r1
        L58:
            if (r3 >= r2) goto L62
            r4 = r0[r3]
            r4.a()
            int r3 = r3 + 1
            goto L58
        L62:
            yads.hg1 r0 = r6.f38796l
            yads.cg1 r0 = r0.f39174b
            if (r0 == 0) goto L6c
            r0.a(r1)
            return r7
        L6c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L72:
            yads.hg1 r0 = r6.f38796l
            r2 = 0
            r0.f39175c = r2
            yads.os2[] r0 = r6.f38804t
            int r2 = r0.length
            r3 = r1
        L7b:
            if (r3 >= r2) goto L85
            r4 = r0[r3]
            r4.b(r1)
            int r3 = r3 + 1
            goto L7b
        L85:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gk2.seekToUs(long):long");
    }

    @Override // yads.rm1
    public final long a(long j10, zw2 zw2Var) {
        c();
        if (!this.f38810z.b()) {
            return 0L;
        }
        ww2 ww2VarB = this.f38810z.b(j10);
        return zw2Var.a(j10, ww2VarB.f44509a.f36875a, ww2VarB.f44510b.f36875a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r7) {
        /*
            r6 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            yads.os2[] r3 = r6.f38804t
            int r3 = r3.length
            if (r2 >= r3) goto L27
            if (r7 != 0) goto L15
            yads.fk2 r3 = r6.f38809y
            r3.getClass()
            boolean[] r3 = r3.f38470c
            boolean r3 = r3[r2]
            if (r3 == 0) goto L21
        L15:
            yads.os2[] r3 = r6.f38804t
            r3 = r3[r2]
            monitor-enter(r3)
            long r4 = r3.f41714v     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            long r0 = java.lang.Math.max(r0, r4)
        L21:
            int r2 = r2 + 1
            goto L3
        L24:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gk2.a(boolean):long");
    }

    public final void a(int i) {
        c();
        boolean[] zArr = this.f38809y.f38469b;
        if (this.J && zArr[i] && !this.f38804t[i].a(false)) {
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (os2 os2Var : this.f38804t) {
                os2Var.b(false);
            }
            qm1 qm1Var = this.f38802r;
            qm1Var.getClass();
            qm1Var.a((ux2) this);
        }
    }

    @Override // yads.eg1
    public final void b() {
        for (os2 os2Var : this.f38804t) {
            os2Var.b(true);
            os2Var.d();
        }
        cr crVar = this.f38797m;
        nq0 nq0Var = crVar.f37479b;
        if (nq0Var != null) {
            nq0Var.release();
            crVar.f37479b = null;
        }
        crVar.f37480c = null;
    }

    @Override // yads.ux2
    public final void reevaluateBuffer(long j10) {
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11, boolean z5) {
        bk2 bk2Var = (bk2) dg1Var;
        Uri uri = bk2Var.f37076b.f43545c;
        xf1 xf1Var = new xf1();
        this.f38790e.getClass();
        dn1 dn1Var = this.f38791f;
        dn1Var.a(xf1Var, new jm1(1, -1, null, 0, null, dn1Var.a(bk2Var.i), dn1Var.a(this.A)));
        if (z5) {
            return;
        }
        for (os2 os2Var : this.f38804t) {
            os2Var.b(false);
        }
        if (this.F > 0) {
            qm1 qm1Var = this.f38802r;
            qm1Var.getClass();
            qm1Var.a((ux2) this);
        }
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11) {
        yw2 yw2Var;
        bk2 bk2Var = (bk2) dg1Var;
        if (this.A == -9223372036854775807L && (yw2Var = this.f38810z) != null) {
            boolean zB = yw2Var.b();
            long jA = a(true);
            long j12 = jA == Long.MIN_VALUE ? 0L : jA + 10000;
            this.A = j12;
            ck2 ck2Var = this.f38793h;
            boolean z5 = this.B;
            jk2 jk2Var = (jk2) ck2Var;
            if (j12 == -9223372036854775807L) {
                j12 = jk2Var.f39893p;
            }
            if (jk2Var.f39892o || jk2Var.f39893p != j12 || jk2Var.f39894q != zB || jk2Var.f39895r != z5) {
                jk2Var.f39893p = j12;
                jk2Var.f39894q = zB;
                jk2Var.f39895r = z5;
                jk2Var.f39892o = false;
                long j13 = jk2Var.f39893p;
                sz2 sz2Var = new sz2(j13, j13, jk2Var.f39894q, jk2Var.f39895r, jk2Var.f39886h);
                v63 hk2Var = sz2Var;
                if (jk2Var.f39892o) {
                    hk2Var = new hk2(sz2Var);
                }
                jk2Var.a(hk2Var);
            }
        }
        Uri uri = bk2Var.f37076b.f43545c;
        xf1 xf1Var = new xf1();
        this.f38790e.getClass();
        dn1 dn1Var = this.f38791f;
        dn1Var.b(xf1Var, new jm1(1, -1, null, 0, null, dn1Var.a(bk2Var.i), dn1Var.a(this.A)));
        this.L = true;
        qm1 qm1Var = this.f38802r;
        qm1Var.getClass();
        qm1Var.a((ux2) this);
    }

    @Override // yads.ag1
    public final bg1 a(dg1 dg1Var, long j10, long j11, IOException iOException, int i) {
        long jMin;
        bg1 bg1Var;
        yw2 yw2Var;
        bk2 bk2Var = (bk2) dg1Var;
        Uri uri = bk2Var.f37076b.f43545c;
        xf1 xf1Var = new xf1();
        int i10 = lb3.f40466a;
        this.f38790e.getClass();
        boolean z5 = true;
        if ((iOException instanceof qb2) || (iOException instanceof FileNotFoundException) || (iOException instanceof q11) || (iOException instanceof gg1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i11 = q30.f42159c;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof q30) && ((q30) cause).f42160b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            bg1Var = hg1.f39172e;
        } else {
            int iD = d();
            int i12 = iD > this.K ? 1 : 0;
            if (!this.G && ((yw2Var = this.f38810z) == null || yw2Var.c() == -9223372036854775807L)) {
                boolean z10 = this.f38807w;
                if (z10 && !this.E && this.I == -9223372036854775807L) {
                    this.J = true;
                    bg1Var = hg1.f39171d;
                } else {
                    this.E = z10;
                    this.H = 0L;
                    this.K = 0;
                    for (os2 os2Var : this.f38804t) {
                        os2Var.b(false);
                    }
                    bk2Var.f37080f.f39538a = 0L;
                    bk2Var.i = 0L;
                    bk2Var.f37082h = true;
                    bk2Var.f37085l = false;
                }
            } else {
                this.K = iD;
            }
            bg1Var = new bg1(i12, jMin);
        }
        int i13 = bg1Var.f37011a;
        if (i13 != 0 && i13 != 1) {
            z5 = false;
        }
        dn1 dn1Var = this.f38791f;
        dn1Var.a(xf1Var, new jm1(1, -1, null, 0, null, dn1Var.a(bk2Var.i), dn1Var.a(this.A)), iOException, !z5);
        if (!z5) {
            this.f38790e.getClass();
        }
        return bg1Var;
    }

    @Override // yads.rm1
    public final void a(qm1 qm1Var, long j10) {
        this.f38802r = qm1Var;
        this.f38798n.d();
        i();
    }

    public final os2 a(ek2 ek2Var) {
        int length = this.f38804t.length;
        for (int i = 0; i < length; i++) {
            if (ek2Var.equals(this.f38805u[i])) {
                return this.f38804t[i];
            }
        }
        os2 os2VarA = os2.a(this.i, this.f38789d, this.f38792g);
        os2VarA.f41699f = this;
        int i10 = length + 1;
        ek2[] ek2VarArr = (ek2[]) Arrays.copyOf(this.f38805u, i10);
        ek2VarArr[length] = ek2Var;
        this.f38805u = ek2VarArr;
        os2[] os2VarArr = (os2[]) Arrays.copyOf(this.f38804t, i10);
        os2VarArr[length] = os2VarA;
        this.f38804t = os2VarArr;
        return os2VarA;
    }

    @Override // yads.qq0
    public final void a(yw2 yw2Var) {
        this.f38801q.post(new zl.n(2, this, yw2Var));
    }

    @Override // yads.rm1
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ps2[] ps2VarArr, boolean[] zArr2, long j10) {
        pp0 pp0Var;
        c();
        fk2 fk2Var = this.f38809y;
        l73 l73Var = fk2Var.f38468a;
        boolean[] zArr3 = fk2Var.f38470c;
        int i = this.F;
        for (int i10 = 0; i10 < pp0VarArr.length; i10++) {
            ps2 ps2Var = ps2VarArr[i10];
            if (ps2Var != null && (pp0VarArr[i10] == null || !zArr[i10])) {
                int i11 = ((dk2) ps2Var).f37794b;
                if (zArr3[i11]) {
                    this.F--;
                    zArr3[i11] = false;
                    ps2VarArr[i10] = null;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        boolean z5 = !this.D ? j10 == 0 : i != 0;
        for (int i12 = 0; i12 < pp0VarArr.length; i12++) {
            if (ps2VarArr[i12] == null && (pp0Var = pp0VarArr[i12]) != null) {
                if (pp0Var.f() == 1) {
                    if (pp0Var.b(0) == 0) {
                        int iIndexOf = l73Var.f40445c.indexOf(pp0Var.b());
                        if (iIndexOf < 0) {
                            iIndexOf = -1;
                        }
                        if (!zArr3[iIndexOf]) {
                            this.F++;
                            zArr3[iIndexOf] = true;
                            ps2VarArr[i12] = new dk2(this, iIndexOf);
                            zArr2[i12] = true;
                            if (!z5) {
                                os2 os2Var = this.f38804t[iIndexOf];
                                z5 = (os2Var.b(j10, true) || os2Var.f41709q + os2Var.f41711s == 0) ? false : true;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f38796l.b()) {
                for (os2 os2Var2 : this.f38804t) {
                    os2Var2.a();
                }
                cg1 cg1Var = this.f38796l.f39174b;
                if (cg1Var != null) {
                    cg1Var.a(false);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                for (os2 os2Var3 : this.f38804t) {
                    os2Var3.b(false);
                }
            }
        } else if (z5) {
            j10 = seekToUs(j10);
            for (int i13 = 0; i13 < ps2VarArr.length; i13++) {
                if (ps2VarArr[i13] != null) {
                    zArr2[i13] = true;
                }
            }
        }
        this.D = true;
        return j10;
    }

    @Override // yads.qq0
    public final p73 a(int i, int i10) {
        return a(new ek2(false, i));
    }
}
