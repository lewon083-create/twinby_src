package i4;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.measurement.h5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements a0, q4.m, m4.i, m4.l, z0 {
    public static final Map R;
    public static final j3.o S;
    public boolean A;
    public com.google.firebase.messaging.y B;
    public q4.t C;
    public long D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public boolean K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f21026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.h f21027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x3.h f21028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final le.a f21029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f21030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f21031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f21032h;
    public final bb.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f21033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j3.o f21034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f21035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m4.n f21036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bb.e f21037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m3.f f21038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f21039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f21040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f21041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f21042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d5.b f21043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r0[] f21044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a1[] f21045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u0[] f21046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f21047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f21048y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f21049z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        R = Collections.unmodifiableMap(map);
        j3.n nVar = new j3.n();
        nVar.f26281a = "icy";
        nVar.f26292m = j3.c0.n("application/x-icy");
        S = new j3.o(nVar);
    }

    public v0(Uri uri, p3.h hVar, bb.e eVar, x3.h hVar2, i0 i0Var, le.a aVar, i0 i0Var2, x0 x0Var, bb.e eVar2, int i, j3.o oVar, long j10, n4.a aVar2) {
        this.f21026b = uri;
        this.f21027c = hVar;
        this.f21028d = hVar2;
        this.f21031g = i0Var;
        this.f21029e = aVar;
        this.f21030f = i0Var2;
        this.f21032h = x0Var;
        this.i = eVar2;
        this.f21033j = i;
        this.f21034k = oVar;
        this.f21036m = aVar2 != null ? new m4.n(aVar2) : new m4.n("ProgressiveMediaPeriod");
        this.f21037n = eVar;
        this.f21035l = j10;
        this.f21038o = new m3.f();
        this.f21039p = new o0(this, 1);
        this.f21040q = new o0(this, 2);
        this.f21041r = m3.z.o(null);
        this.f21046w = new u0[0];
        this.f21045v = new a1[0];
        this.f21044u = new r0[0];
        this.M = -9223372036854775807L;
        this.F = 1;
    }

    @Override // q4.m
    public final void G() {
        this.f21047x = true;
        this.f21041r.post(this.f21039p);
    }

    @Override // q4.m
    public final q4.a0 P(int i, int i10) {
        return t(new u0(i, false));
    }

    @Override // i4.z0
    public final void a() {
        this.f21041r.post(this.f21039p);
    }

    @Override // i4.a0
    public final long b(long j10, s3.c1 c1Var) {
        d();
        if (!this.C.a()) {
            return 0L;
        }
        q4.s sVarE = this.C.e(j10);
        return c1Var.a(j10, sVarE.f31761a.f31764a, sVarE.f31762b.f31764a);
    }

    @Override // m4.l
    public final void c() {
        for (a1 a1Var : this.f21045v) {
            a1Var.D();
        }
        bb.e eVar = this.f21037n;
        q4.k kVar = (q4.k) eVar.f2020d;
        if (kVar != null) {
            kVar.release();
            eVar.f2020d = null;
        }
        eVar.f2021e = null;
    }

    public final void d() {
        h5.r(this.f21048y);
        this.B.getClass();
        this.C.getClass();
    }

    @Override // m4.i
    public final void e(m4.k kVar, long j10, long j11) {
        s0 s0Var = (s0) kVar;
        if (this.D == -9223372036854775807L && this.C != null) {
            long jN = n(true);
            long j12 = jN == Long.MIN_VALUE ? 0L : jN + 10000;
            this.D = j12;
            this.f21032h.y(j12, this.C, this.E);
        }
        p3.c0 c0Var = s0Var.f20997c;
        u uVar = new u(s0Var.f21004k, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        this.f21029e.getClass();
        this.f21030f.e(uVar, 1, -1, null, 0, null, s0Var.f21003j, this.D);
        this.P = true;
        z zVar = this.f21042s;
        zVar.getClass();
        zVar.d(this);
    }

    @Override // i4.a0
    public final long f(l4.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        l4.r rVar;
        d();
        com.google.firebase.messaging.y yVar = this.B;
        j1 j1Var = (j1) yVar.f14899b;
        boolean[] zArr3 = (boolean[]) yVar.f14901d;
        int i = this.J;
        int i10 = 0;
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            b1 b1Var = b1VarArr[i11];
            if (b1Var != null && (rVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((t0) b1Var).f21013b;
                h5.r(zArr3[i12]);
                this.J--;
                zArr3[i12] = false;
                b1VarArr[i11] = null;
            }
        }
        boolean z5 = !this.G ? j10 == 0 || this.A : i != 0;
        for (int i13 = 0; i13 < rVarArr.length; i13++) {
            if (b1VarArr[i13] == null && (rVar = rVarArr[i13]) != null) {
                h5.r(rVar.length() == 1);
                h5.r(rVar.h(0) == 0);
                int iB = j1Var.b(rVar.b());
                h5.r(!zArr3[iB]);
                this.J++;
                zArr3[iB] = true;
                this.I = rVar.l().f26341t | this.I;
                b1VarArr[i13] = new t0(this, iB);
                zArr2[i13] = true;
                if (!z5) {
                    a1 a1Var = this.f21045v[iB];
                    z5 = (a1Var.t() == 0 || a1Var.G(j10, true)) ? false : true;
                }
            }
        }
        if (this.J == 0) {
            this.N = false;
            this.H = false;
            this.I = false;
            m4.n nVar = this.f21036m;
            if (nVar.d()) {
                a1[] a1VarArr = this.f21045v;
                int length = a1VarArr.length;
                while (i10 < length) {
                    a1VarArr[i10].k();
                    i10++;
                }
                nVar.b();
            } else {
                this.P = false;
                for (a1 a1Var2 : this.f21045v) {
                    a1Var2.E(false);
                }
            }
        } else if (z5) {
            j10 = seekToUs(j10);
            while (i10 < b1VarArr.length) {
                if (b1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.G = true;
        return j10;
    }

    @Override // i4.a0
    public final void g(long j10) throws Throwable {
        if (this.A) {
            return;
        }
        d();
        if (p()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.B.f14901d;
        int length = this.f21045v.length;
        for (int i = 0; i < length; i++) {
            this.f21045v[i].j(j10, zArr[i]);
        }
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        long jN;
        boolean z5;
        d();
        if (this.P || this.J == 0) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.M;
        }
        if (this.f21049z) {
            int length = this.f21045v.length;
            jN = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                com.google.firebase.messaging.y yVar = this.B;
                if (((boolean[]) yVar.f14900c)[i] && ((boolean[]) yVar.f14901d)[i]) {
                    a1 a1Var = this.f21045v[i];
                    synchronized (a1Var) {
                        z5 = a1Var.f20854w;
                    }
                    if (!z5) {
                        jN = Math.min(jN, this.f21045v[i].q());
                    }
                }
            }
        } else {
            jN = Long.MAX_VALUE;
        }
        if (jN == Long.MAX_VALUE) {
            jN = n(false);
        }
        return jN == Long.MIN_VALUE ? this.L : jN;
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // i4.a0
    public final j1 getTrackGroups() {
        d();
        return (j1) this.B.f14899b;
    }

    public final int h() {
        int i = 0;
        for (a1 a1Var : this.f21045v) {
            i += a1Var.f20848q + a1Var.f20847p;
        }
        return i;
    }

    @Override // m4.i
    public final com.google.android.gms.internal.ads.o i(m4.k kVar, long j10, long j11, IOException iOException, int i) {
        long jMin;
        com.google.android.gms.internal.ads.o oVar;
        q4.t tVar;
        s0 s0Var = (s0) kVar;
        p3.c0 c0Var = s0Var.f20997c;
        u uVar = new u(s0Var.f21004k, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        String str = m3.z.f28608a;
        this.f21029e.getClass();
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof j3.d0) || (cause instanceof FileNotFoundException) || (cause instanceof p3.t) || (cause instanceof m4.m) || ((cause instanceof p3.i) && ((p3.i) cause).f31158b == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            oVar = m4.n.f28670g;
        } else {
            int iH = h();
            int i10 = iH > this.O ? 1 : 0;
            if (this.K || !((tVar = this.C) == null || tVar.g() == -9223372036854775807L)) {
                this.O = iH;
            } else if (!this.f21048y || w()) {
                this.H = this.f21048y;
                this.L = 0L;
                this.O = 0;
                for (a1 a1Var : this.f21045v) {
                    a1Var.E(false);
                }
                s0Var.f21001g.f4793b = 0L;
                s0Var.f21003j = 0L;
                s0Var.i = true;
                s0Var.f21006m = false;
            } else {
                this.N = true;
                oVar = m4.n.f28669f;
            }
            oVar = new com.google.android.gms.internal.ads.o(i10, jMin, false);
        }
        this.f21030f.f(uVar, 1, -1, null, 0, null, s0Var.f21003j, this.D, iOException, !oVar.a());
        return oVar;
    }

    @Override // i4.d1
    public final boolean isLoading() {
        boolean z5;
        if (!this.f21036m.d()) {
            return false;
        }
        m3.f fVar = this.f21038o;
        synchronized (fVar) {
            z5 = fVar.f28562b;
        }
        return z5;
    }

    @Override // q4.m
    public final void j(q4.t tVar) {
        this.f21041r.post(new e1.y(28, this, tVar));
    }

    @Override // i4.a0
    public final void k(z zVar, long j10) {
        this.f21042s = zVar;
        j3.o oVar = this.f21034k;
        if (oVar == null) {
            this.f21038o.c();
            v();
        } else {
            P(0, 3).a(oVar);
            u(new q4.r(-9223372036854775807L, new long[]{0}, new long[]{0}));
            G();
            this.M = j10;
        }
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        if (this.P) {
            return false;
        }
        m4.n nVar = this.f21036m;
        if (nVar.c() || this.N) {
            return false;
        }
        if ((this.f21048y || this.f21034k != null) && this.J == 0) {
            return false;
        }
        boolean zC = this.f21038o.c();
        if (nVar.d()) {
            return zC;
        }
        v();
        return true;
    }

    @Override // m4.i
    public final void m(m4.k kVar, long j10, long j11, boolean z5) {
        s0 s0Var = (s0) kVar;
        p3.c0 c0Var = s0Var.f20997c;
        u uVar = new u(s0Var.f21004k, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        this.f21029e.getClass();
        this.f21030f.c(uVar, 1, -1, null, 0, null, s0Var.f21003j, this.D);
        if (z5) {
            return;
        }
        for (a1 a1Var : this.f21045v) {
            a1Var.E(false);
        }
        if (this.J > 0) {
            z zVar = this.f21042s;
            zVar.getClass();
            zVar.d(this);
        }
    }

    @Override // i4.a0
    public final void maybeThrowPrepareError() throws IOException {
        int iE = this.f21029e.e(this.F);
        m4.n nVar = this.f21036m;
        IOException iOException = nVar.f28673d;
        if (iOException != null) {
            throw iOException;
        }
        m4.j jVar = nVar.f28672c;
        if (jVar != null) {
            if (iE == Integer.MIN_VALUE) {
                iE = jVar.f28659b;
            }
            IOException iOException2 = jVar.f28663f;
            if (iOException2 != null && jVar.f28664g > iE) {
                throw iOException2;
            }
        }
        if (this.P && !this.f21048y) {
            throw j3.d0.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            i4.a1[] r3 = r5.f21045v
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            com.google.firebase.messaging.y r3 = r5.B
            r3.getClass()
            java.lang.Object r3 = r3.f14901d
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            i4.a1[] r3 = r5.f21045v
            r3 = r3[r2]
            long r3 = r3.q()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.v0.n(boolean):long");
    }

    @Override // m4.i
    public final void o(m4.k kVar, long j10, long j11, int i) {
        s0 s0Var = (s0) kVar;
        p3.c0 c0Var = s0Var.f20997c;
        this.f21030f.h(i == 0 ? new u(j10, s0Var.f21004k) : new u(s0Var.f21004k, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c), 1, -1, null, 0, null, s0Var.f21003j, this.D, i);
    }

    public final boolean p() {
        return this.M != -9223372036854775807L;
    }

    public final void q() {
        long j10 = this.f21035l;
        if (this.Q || this.f21048y || !this.f21047x || this.C == null) {
            return;
        }
        for (a1 a1Var : this.f21045v) {
            if (a1Var.w() == null) {
                return;
            }
        }
        m3.f fVar = this.f21038o;
        synchronized (fVar) {
            fVar.f28562b = false;
        }
        int length = this.f21045v.length;
        j3.p0[] p0VarArr = new j3.p0[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            j3.o oVarW = this.f21045v[i].w();
            oVarW.getClass();
            String str = oVarW.f26335n;
            boolean zI = j3.c0.i(str);
            boolean z5 = zI || j3.c0.m(str);
            zArr[i] = z5;
            this.f21049z = z5 | this.f21049z;
            this.A = j10 != -9223372036854775807L && length == 1 && j3.c0.k(str);
            d5.b bVar = this.f21043t;
            if (bVar != null) {
                int i10 = bVar.f15561a;
                if (zI || this.f21046w[i].f21018b) {
                    j3.b0 b0Var = oVarW.f26333l;
                    j3.b0 b0Var2 = b0Var == null ? new j3.b0(bVar) : b0Var.a(bVar);
                    j3.n nVarA = oVarW.a();
                    nVarA.f26290k = b0Var2;
                    oVarW = new j3.o(nVarA);
                }
                if (zI && oVarW.f26330h == -1 && oVarW.i == -1 && i10 != -1) {
                    j3.n nVarA2 = oVarW.a();
                    nVarA2.f26288h = i10;
                    oVarW = new j3.o(nVarA2);
                }
            }
            int iA = this.f21028d.a(oVarW);
            j3.n nVarA3 = oVarW.a();
            nVarA3.N = iA;
            j3.o oVar = new j3.o(nVarA3);
            p0VarArr[i] = new j3.p0(Integer.toString(i), oVar);
            this.I = oVar.f26341t | this.I;
        }
        j1 j1Var = new j1(p0VarArr);
        com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
        yVar.f14899b = j1Var;
        yVar.f14900c = zArr;
        int i11 = j1Var.f20935a;
        yVar.f14901d = new boolean[i11];
        yVar.f14902e = new boolean[i11];
        this.B = yVar;
        if (this.A && this.D == -9223372036854775807L) {
            this.D = j10;
            this.C = new p0(this, this.C);
        }
        this.f21032h.y(this.D, this.C, this.E);
        this.f21048y = true;
        z zVar = this.f21042s;
        zVar.getClass();
        zVar.j(this);
    }

    public final void r(int i) {
        d();
        com.google.firebase.messaging.y yVar = this.B;
        boolean[] zArr = (boolean[]) yVar.f14902e;
        if (zArr[i]) {
            return;
        }
        j3.o oVar = ((j1) yVar.f14899b).a(i).f26354d[0];
        this.f21030f.b(j3.c0.h(oVar.f26335n), oVar, 0, null, this.L);
        zArr[i] = true;
    }

    @Override // i4.a0
    public final long readDiscontinuity() {
        if (this.I) {
            this.I = false;
            return this.L;
        }
        if (!this.H) {
            return -9223372036854775807L;
        }
        if (!this.P && h() <= this.O) {
            return -9223372036854775807L;
        }
        this.H = false;
        return this.L;
    }

    public final void s(int i) {
        d();
        if (this.N) {
            if ((!this.f21049z || ((boolean[]) this.B.f14900c)[i]) && !this.f21045v[i].x(false)) {
                this.M = 0L;
                this.N = false;
                this.H = true;
                this.L = 0L;
                this.O = 0;
                for (a1 a1Var : this.f21045v) {
                    a1Var.E(false);
                }
                z zVar = this.f21042s;
                zVar.getClass();
                zVar.d(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    @Override // i4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r11) {
        /*
            r10 = this;
            r10.d()
            com.google.firebase.messaging.y r0 = r10.B
            java.lang.Object r0 = r0.f14900c
            boolean[] r0 = (boolean[]) r0
            q4.t r1 = r10.C
            boolean r1 = r1.a()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r11 = 0
        L14:
            r1 = 0
            r10.H = r1
            long r2 = r10.L
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L20
            r2 = r3
            goto L21
        L20:
            r2 = r1
        L21:
            r10.L = r11
            boolean r4 = r10.p()
            if (r4 == 0) goto L2c
            r10.M = r11
            return r11
        L2c:
            int r4 = r10.F
            r5 = 7
            m4.n r6 = r10.f21036m
            if (r4 == r5) goto L81
            boolean r4 = r10.P
            if (r4 != 0) goto L3d
            boolean r4 = r6.d()
            if (r4 == 0) goto L81
        L3d:
            i4.a1[] r4 = r10.f21045v
            int r4 = r4.length
            r5 = r1
        L41:
            if (r5 >= r4) goto L7e
            i4.a1[] r7 = r10.f21045v
            r7 = r7[r5]
            i4.r0[] r8 = r10.f21044u
            r8 = r8[r5]
            java.util.concurrent.atomic.AtomicReference r8 = r8.f20994d
            java.lang.Object r8 = r8.get()
            i4.q0 r9 = i4.q0.f20987b
            if (r8 != r9) goto L7b
            int r8 = r7.t()
            if (r8 != 0) goto L5e
            if (r2 == 0) goto L5e
            goto L7b
        L5e:
            boolean r8 = r10.A
            if (r8 == 0) goto L69
            int r8 = r7.f20848q
            boolean r7 = r7.F(r8)
            goto L6f
        L69:
            boolean r8 = r10.P
            boolean r7 = r7.G(r11, r8)
        L6f:
            if (r7 != 0) goto L7b
            boolean r7 = r0[r5]
            if (r7 != 0) goto L79
            boolean r7 = r10.f21049z
            if (r7 != 0) goto L7b
        L79:
            r3 = r1
            goto L7e
        L7b:
            int r5 = r5 + 1
            goto L41
        L7e:
            if (r3 == 0) goto L81
            goto Lb1
        L81:
            r10.N = r1
            r10.M = r11
            r10.P = r1
            r10.I = r1
            boolean r0 = r6.d()
            if (r0 == 0) goto La0
            i4.a1[] r0 = r10.f21045v
            int r2 = r0.length
        L92:
            if (r1 >= r2) goto L9c
            r3 = r0[r1]
            r3.k()
            int r1 = r1 + 1
            goto L92
        L9c:
            r6.b()
            return r11
        La0:
            r0 = 0
            r6.f28673d = r0
            i4.a1[] r0 = r10.f21045v
            int r2 = r0.length
            r3 = r1
        La7:
            if (r3 >= r2) goto Lb1
            r4 = r0[r3]
            r4.E(r1)
            int r3 = r3 + 1
            goto La7
        Lb1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.v0.seekToUs(long):long");
    }

    public final q4.a0 t(u0 u0Var) {
        int length = this.f21045v.length;
        for (int i = 0; i < length; i++) {
            if (u0Var.equals(this.f21046w[i])) {
                return this.f21045v[i];
            }
        }
        if (this.f21047x) {
            m3.b.s("ProgressiveMediaPeriod", "Extractor added new track (id=" + u0Var.f21017a + ") after finishing tracks.");
            return new q4.j();
        }
        x3.h hVar = this.f21028d;
        hVar.getClass();
        a1 a1Var = new a1(this.i, hVar, this.f21031g);
        r0 r0Var = new r0(a1Var);
        a1Var.f20838f = this;
        int i10 = length + 1;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.f21046w, i10);
        u0VarArr[length] = u0Var;
        this.f21046w = u0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.f21045v, i10);
        a1VarArr[length] = a1Var;
        this.f21045v = a1VarArr;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.f21044u, i10);
        r0VarArr[length] = r0Var;
        this.f21044u = r0VarArr;
        return r0Var;
    }

    public final void u(q4.t tVar) {
        this.C = this.f21043t == null ? tVar : new q4.o(-9223372036854775807L);
        this.D = tVar.g();
        boolean z5 = !this.K && tVar.g() == -9223372036854775807L;
        this.E = z5;
        this.F = z5 ? 7 : 1;
        if (this.f21048y) {
            this.f21032h.y(this.D, tVar, z5);
        } else {
            q();
        }
    }

    public final void v() {
        s0 s0Var = new s0(this, this.f21026b, this.f21027c, this.f21037n, this, this.f21038o);
        if (this.f21048y) {
            h5.r(p());
            long j10 = this.D;
            if (j10 != -9223372036854775807L && this.M > j10) {
                this.P = true;
                this.M = -9223372036854775807L;
                return;
            }
            q4.t tVar = this.C;
            tVar.getClass();
            long j11 = tVar.e(this.M).f31761a.f31765b;
            long j12 = this.M;
            s0Var.f21001g.f4793b = j11;
            s0Var.f21003j = j12;
            s0Var.i = true;
            s0Var.f21006m = false;
            for (a1 a1Var : this.f21045v) {
                a1Var.f20851t = this.M;
            }
            this.M = -9223372036854775807L;
        }
        this.O = h();
        this.f21036m.f(s0Var, this, this.f21029e.e(this.F));
    }

    public final boolean w() {
        return this.H || p();
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
    }
}
