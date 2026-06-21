package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gx1 implements nu1 {
    public static final byte[] A0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final MediaCodec.BufferInfo A;
    public final ArrayDeque B;
    public final c5 C;
    public final AtomicInteger D;
    public jx1 E;
    public jx1 F;
    public nu0 G;
    public nu0 H;
    public pt1 I;
    public final long J;
    public float K;
    public float L;
    public bx1 M;
    public jx1 N;
    public MediaFormat O;
    public boolean P;
    public float Q;
    public ArrayDeque R;
    public ex1 S;
    public dx1 T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f5930a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f5932b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5933c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f5934c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ByteBuffer f5936d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ru1 f5937e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f5938e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5939f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f5940f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fv1 f5941g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f5942g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c6 f5943h;
    public boolean h0;
    public int i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f5944i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gz1 f5945j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f5946j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public jx1[] f5947k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f5948k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5949l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f5950l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5951m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f5952m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f5954n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5955o;
    public boolean o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5956p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f5957p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f5959q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public hy1 f5960r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f5961r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f5962s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f5963s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zk f5964t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public vs1 f5965t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final bw1 f5966u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public fx1 f5967u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f5968v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f5969v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zq1 f5970w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f5971w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zq1 f5972x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f5973x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zq1 f5974y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f5975y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final zw1 f5976z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public long f5977z0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5931b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zd1 f5935d = new zd1(28, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5953n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ci f5958q = ci.f4215a;

    public gx1(int i, zk zkVar, bw1 bw1Var, float f10) {
        this.f5933c = i;
        this.f5964t = zkVar;
        bw1Var.getClass();
        this.f5966u = bw1Var;
        this.f5968v = f10;
        this.D = new AtomicInteger();
        this.f5970w = new zq1(0);
        this.f5972x = new zq1(0);
        this.f5974y = new zq1(2);
        zw1 zw1Var = new zw1(2);
        zw1Var.f13139m = 32;
        this.f5976z = zw1Var;
        this.A = new MediaCodec.BufferInfo();
        this.K = 1.0f;
        this.L = 1.0f;
        this.J = -9223372036854775807L;
        this.B = new ArrayDeque();
        this.f5967u0 = fx1.f5494f;
        zw1Var.s(0);
        zw1Var.f13079f.order(ByteOrder.nativeOrder());
        c5 c5Var = new c5();
        c5Var.f4029d = t10.f10463a;
        c5Var.f4028c = 0;
        c5Var.f4027b = 2;
        this.C = c5Var;
        this.Q = -1.0f;
        this.U = 0;
        this.f5946j0 = 0;
        this.f5932b0 = -1;
        this.f5934c0 = -1;
        this.f5930a0 = -9223372036854775807L;
        this.f5957p0 = -9223372036854775807L;
        this.f5969v0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
        this.f5948k0 = 0;
        this.f5950l0 = 0;
        this.f5965t0 = new vs1(0);
        this.f5975y0 = false;
        this.f5977z0 = 0L;
    }

    public static boolean I(int i, boolean z5) {
        int i10 = i & 7;
        if (i10 != 4) {
            return z5 && i10 == 3;
        }
        return true;
    }

    public void A() {
        this.f5932b0 = -1;
        this.f5972x.f13079f = null;
        this.f5934c0 = -1;
        this.f5936d0 = null;
        this.f5957p0 = -9223372036854775807L;
        j0().f5499e = -9223372036854775807L;
        this.f5969v0 = -9223372036854775807L;
        this.f5930a0 = -9223372036854775807L;
        this.f5954n0 = false;
        this.Z = -9223372036854775807L;
        this.f5952m0 = false;
        this.W = false;
        this.X = false;
        this.f5938e0 = false;
        this.f5948k0 = 0;
        this.f5950l0 = 0;
        this.f5946j0 = this.f5944i0 ? 1 : 0;
        this.f5975y0 = false;
        this.f5977z0 = 0L;
    }

    public final void B() {
        A();
        this.R = null;
        this.T = null;
        this.N = null;
        this.O = null;
        this.P = false;
        this.o0 = false;
        this.Q = -1.0f;
        this.U = 0;
        this.V = false;
        this.Y = false;
        this.f5944i0 = false;
        this.f5946j0 = 0;
    }

    public cx1 C(IllegalStateException illegalStateException, dx1 dx1Var) {
        return new cx1(illegalStateException, dx1Var);
    }

    public int F(zq1 zq1Var) {
        return 0;
    }

    public boolean G(zq1 zq1Var) {
        return false;
    }

    public void H(long j10) {
        this.f5969v0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.B;
            if (arrayDeque.isEmpty() || j10 < ((fx1) arrayDeque.peek()).f5495a) {
                return;
            }
            fx1 fx1Var = (fx1) arrayDeque.poll();
            fx1Var.getClass();
            i0(fx1Var);
            X();
        }
    }

    public final int J(jx1 jx1Var) throws bt1 {
        try {
            return K(this.f5966u, jx1Var);
        } catch (ix1 e3) {
            throw l(e3, jx1Var, false, 4002);
        }
    }

    public abstract int K(bw1 bw1Var, jx1 jx1Var);

    public final void L(long j10, boolean z5, boolean z10) {
        this.f5955o = false;
        this.f5951m = j10;
        this.f5953n = j10;
        if (!z10) {
            gz1 gz1Var = this.f5945j;
            gz1Var.getClass();
            z10 = gz1Var.m(j10 - this.f5949l) != 0;
        }
        a(j10, z5, z10);
    }

    public abstract ArrayList M(bw1 bw1Var, jx1 jx1Var);

    public boolean N(jx1 jx1Var) {
        return false;
    }

    public abstract z7 O(dx1 dx1Var, jx1 jx1Var, float f10);

    public abstract ws1 P(dx1 dx1Var, jx1 jx1Var, jx1 jx1Var2);

    public long Q(long j10, long j11) {
        if (this.i == 1) {
            return (t() || u()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public abstract float R(float f10, jx1 jx1Var, jx1[] jx1VarArr);

    public abstract void S(long j10, long j11, String str);

    public abstract void T(String str);

    public abstract void U(Exception exc);

    public ws1 V(zd1 zd1Var) {
        int i;
        boolean z5 = true;
        this.f5963s0 = true;
        jx1 jx1Var = (jx1) zd1Var.f12972d;
        jx1Var.getClass();
        String str = jx1Var.f6975m;
        if (str == null) {
            throw l(new IllegalArgumentException("Sample MIME type is null."), jx1Var, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !jx1Var.f6978p.isEmpty()) {
            ow1 ow1Var = new ow1(jx1Var);
            ow1Var.f8835o = null;
            jx1Var = new jx1(ow1Var);
        }
        jx1 jx1Var2 = jx1Var;
        this.H = (nu0) zd1Var.f12971c;
        this.E = jx1Var2;
        if (this.f5940f0) {
            this.h0 = true;
            return null;
        }
        bx1 bx1Var = this.M;
        if (bx1Var == null) {
            this.R = null;
            v();
            return null;
        }
        dx1 dx1Var = this.T;
        dx1Var.getClass();
        jx1 jx1Var3 = this.N;
        jx1Var3.getClass();
        nu0 nu0Var = this.G;
        nu0 nu0Var2 = this.H;
        if (nu0Var != nu0Var2) {
            g0();
            return new ws1(dx1Var.f4712a, jx1Var3, jx1Var2, 0, 128);
        }
        ws1 ws1VarP = P(dx1Var, jx1Var3, jx1Var2);
        int i10 = ws1VarP.f11891d;
        if (i10 != 0) {
            if (i10 == 1) {
                if (e0(jx1Var2)) {
                    this.N = jx1Var2;
                    if (nu0Var2 != nu0Var) {
                        f0();
                    } else if (this.f5952m0) {
                        this.f5948k0 = 1;
                        this.f5950l0 = 1;
                    }
                }
                i = 16;
            } else if (i10 != 2) {
                if (e0(jx1Var2)) {
                    this.N = jx1Var2;
                    if (nu0Var2 != nu0Var) {
                        f0();
                    }
                }
                i = 16;
            } else {
                if (e0(jx1Var2)) {
                    this.f5944i0 = true;
                    this.f5946j0 = 1;
                    int i11 = this.U;
                    if (i11 != 2 && (i11 != 1 || jx1Var2.f6982t != jx1Var3.f6982t || jx1Var2.f6983u != jx1Var3.f6983u)) {
                        z5 = false;
                    }
                    this.W = z5;
                    this.N = jx1Var2;
                    if (nu0Var2 != nu0Var) {
                        f0();
                    }
                }
                i = 16;
            }
            return (i10 != 0 || (this.M == bx1Var && this.f5950l0 != 3)) ? ws1VarP : new ws1(dx1Var.f4712a, jx1Var3, jx1Var2, 0, i);
        }
        g0();
        i = 0;
        if (i10 != 0) {
        }
    }

    public abstract void W(jx1 jx1Var, MediaFormat mediaFormat);

    public abstract void X();

    public abstract boolean Y(long j10, long j11, bx1 bx1Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j12, boolean z5, boolean z10, jx1 jx1Var);

    public abstract void Z();

    public void a(long j10, boolean z5, boolean z10) {
        ArrayDeque arrayDeque = this.B;
        if (!arrayDeque.isEmpty()) {
            this.f5967u0 = (fx1) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z10) {
            this.f5959q0 = false;
            this.f5961r0 = false;
            if (this.f5940f0) {
                b0();
            } else if (this.M != null) {
                if (y()) {
                    x();
                    v();
                } else if (z()) {
                    c0();
                } else {
                    this.f5975y0 = true;
                }
            }
            ro0 ro0Var = this.f5967u0.f5498d;
            if (ro0Var.h() > 0) {
                this.f5963s0 = true;
            }
            synchronized (ro0Var) {
                ro0Var.f10007c = 0;
                ro0Var.f10008d = 0;
                Arrays.fill(ro0Var.f10006b, (Object) null);
            }
        }
    }

    public abstract void a0(zq1 zq1Var);

    public final void b0() {
        this.f5957p0 = -9223372036854775807L;
        j0().f5499e = -9223372036854775807L;
        this.f5969v0 = -9223372036854775807L;
        this.h0 = false;
        this.f5976z.r();
        this.f5974y.r();
        this.f5942g0 = false;
        c5 c5Var = this.C;
        c5Var.getClass();
        c5Var.f4029d = t10.f10463a;
        c5Var.f4028c = 0;
        c5Var.f4027b = 2;
    }

    public final void c0() {
        try {
            bx1 bx1Var = this.M;
            if (bx1Var == null) {
                throw null;
            }
            bx1Var.n();
        } finally {
            A();
        }
    }

    public final boolean d0(int i) {
        zd1 zd1Var = this.f5935d;
        zd1Var.f12971c = null;
        zd1Var.f12972d = null;
        zq1 zq1Var = this.f5970w;
        zq1Var.r();
        int iN = n(zd1Var, zq1Var, i | 4);
        if (iN == -5) {
            V(zd1Var);
            return true;
        }
        if (iN != -4 || !zq1Var.q(4)) {
            return false;
        }
        this.f5959q0 = true;
        h0();
        return false;
    }

    public abstract void e();

    public final boolean e0(jx1 jx1Var) {
        if (this.M != null && this.f5950l0 != 3 && this.i != 0) {
            float f10 = this.L;
            jx1Var.getClass();
            jx1[] jx1VarArr = this.f5947k;
            jx1VarArr.getClass();
            float fR = R(f10, jx1Var, jx1VarArr);
            float f11 = this.Q;
            if (f11 != fR) {
                if (fR == -1.0f) {
                    g0();
                    return false;
                }
                if (f11 != -1.0f || fR > this.f5968v) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fR);
                    bx1 bx1Var = this.M;
                    bx1Var.getClass();
                    bx1Var.j(bundle);
                    this.Q = fR;
                }
            }
        }
        return true;
    }

    public abstract void f();

    public final boolean f0() {
        if (this.f5952m0) {
            this.f5948k0 = 1;
            this.f5950l0 = 2;
            return true;
        }
        nu0 nu0Var = this.H;
        nu0Var.getClass();
        this.G = nu0Var;
        this.f5948k0 = 0;
        this.f5950l0 = 0;
        return true;
    }

    public void g() {
        this.E = null;
        i0(fx1.f5494f);
        this.B.clear();
        if (this.f5940f0) {
            this.f5940f0 = false;
            b0();
        } else {
            if (this.M == null) {
                return;
            }
            if (y()) {
                x();
            } else if (z()) {
                c0();
            } else {
                this.f5975y0 = true;
            }
        }
    }

    public final void g0() {
        if (this.f5952m0) {
            this.f5948k0 = 1;
            this.f5950l0 = 3;
        } else {
            x();
            v();
        }
    }

    public abstract void h();

    public final void h0() {
        int i = this.f5950l0;
        if (i == 1) {
            c0();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.f5961r0 = true;
                Z();
                return;
            } else {
                x();
                v();
                return;
            }
        }
        c0();
        nu0 nu0Var = this.H;
        nu0Var.getClass();
        this.G = nu0Var;
        this.f5948k0 = 0;
        this.f5950l0 = 0;
    }

    public abstract void i();

    public final void i0(fx1 fx1Var) {
        this.f5967u0 = fx1Var;
        if (fx1Var.f5497c != -9223372036854775807L) {
            this.f5971w0 = true;
        }
    }

    public final void j() {
        this.f5937e.getClass();
    }

    public final fx1 j0() {
        ArrayDeque arrayDeque = this.B;
        return !arrayDeque.isEmpty() ? (fx1) arrayDeque.getLast() : this.f5967u0;
    }

    public final boolean k0(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        jx1 jx1Var = this.F;
        return jx1Var == null || !Objects.equals(jx1Var.f6975m, "audio/opus") || j10 - j11 > 80000;
    }

    public final bt1 l(Exception exc, jx1 jx1Var, boolean z5, int i) {
        int iJ;
        if (jx1Var == null || this.f5956p) {
            iJ = 4;
        } else {
            this.f5956p = true;
            try {
                iJ = J(jx1Var) & 7;
            } catch (bt1 unused) {
                iJ = 4;
            } finally {
                this.f5956p = false;
            }
        }
        return new bt1(1, exc, i, o(), this.f5939f, jx1Var, jx1Var == null ? 4 : iJ, this.f5960r, z5);
    }

    public final void l0(jx1[] jx1VarArr, gz1 gz1Var, long j10, long j11, hy1 hy1Var) {
        ix.k0(!this.f5955o);
        this.f5945j = gz1Var;
        this.f5960r = hy1Var;
        if (this.f5953n == Long.MIN_VALUE) {
            this.f5953n = j10;
        }
        this.f5947k = jx1VarArr;
        this.f5949l = j11;
        q0(jx1VarArr, j10, j11, hy1Var);
    }

    public final boolean m0() {
        return this.f5953n == Long.MIN_VALUE;
    }

    public final int n(zd1 zd1Var, zq1 zq1Var, int i) {
        gz1 gz1Var = this.f5945j;
        gz1Var.getClass();
        int iA = gz1Var.a(zd1Var, zq1Var, i);
        if (iA == -4) {
            if (zq1Var.q(4)) {
                this.f5953n = Long.MIN_VALUE;
                return this.f5955o ? -4 : -3;
            }
            long j10 = zq1Var.f13081h + this.f5949l;
            zq1Var.f13081h = j10;
            this.f5953n = Math.max(this.f5953n, j10);
            return iA;
        }
        if (iA == -5) {
            jx1 jx1Var = (jx1) zd1Var.f12972d;
            jx1Var.getClass();
            long j11 = jx1Var.f6980r;
            if (j11 != Long.MAX_VALUE) {
                ow1 ow1Var = new ow1(jx1Var);
                ow1Var.f8837q = j11 + this.f5949l;
                zd1Var.f12972d = new jx1(ow1Var);
                return -5;
            }
        }
        return iA;
    }

    public zt1 n0() {
        return null;
    }

    public abstract String o();

    public final void o0() {
        synchronized (this.f5931b) {
            this.f5962s = null;
        }
    }

    public boolean p(long j10) {
        return false;
    }

    public abstract void p0(boolean z5, boolean z10);

    public void q(float f10, float f11) {
        this.K = f10;
        this.L = f11;
        e0(this.N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q0(com.google.android.gms.internal.ads.jx1[] r12, long r13, long r15, com.google.android.gms.internal.ads.hy1 r17) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.fx1 r12 = r11.f5967u0
            long r0 = r12.f5497c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.fx1 r4 = new com.google.android.gms.internal.ads.fx1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.i0(r4)
            boolean r12 = r11.f5973x0
            if (r12 == 0) goto L56
            r11.X()
            return
        L24:
            java.util.ArrayDeque r12 = r11.B
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.f5957p0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.f5969v0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.fx1 r4 = new com.google.android.gms.internal.ads.fx1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.i0(r4)
            com.google.android.gms.internal.ads.fx1 r12 = r11.f5967u0
            long r12 = r12.f5497c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.X()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.fx1 r0 = new com.google.android.gms.internal.ads.fx1
            long r1 = r11.f5957p0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx1.q0(com.google.android.gms.internal.ads.jx1[], long, long, com.google.android.gms.internal.ads.hy1):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0444, code lost:
    
        if (r31.Y != false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0446, code lost:
    
        r31.f5954n0 = true;
        r4.C(r31.f5932b0, 0, 0, 4);
        r31.f5932b0 = r3;
        r11.f13079f = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0459, code lost:
    
        r31.f5948k0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e3 A[Catch: IllegalStateException -> 0x00a6, CryptoException -> 0x00ab, TryCatch #4 {CryptoException -> 0x00ab, blocks: (B:130:0x022a, B:46:0x00a3, B:56:0x00b6, B:58:0x00ba, B:60:0x00c0, B:64:0x00d8, B:65:0x00e7, B:69:0x00f4, B:71:0x00fa, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:125:0x021b, B:127:0x021f, B:73:0x010c, B:75:0x0113, B:76:0x0127, B:78:0x0137, B:82:0x0146, B:83:0x014e, B:86:0x0154, B:88:0x0158, B:90:0x0162, B:92:0x016c, B:93:0x0194, B:94:0x019c, B:95:0x019d, B:97:0x01a4, B:99:0x01ac, B:101:0x01b4, B:102:0x01bb, B:107:0x01ce, B:109:0x01dc, B:114:0x01f3, B:118:0x01fe, B:112:0x01e3, B:119:0x0201, B:133:0x0235, B:135:0x0242, B:136:0x0250, B:138:0x0254, B:144:0x0267, B:148:0x0270, B:150:0x0276, B:152:0x027e, B:154:0x0288, B:156:0x0290, B:158:0x029e, B:159:0x02a3, B:160:0x02a4, B:162:0x02a8, B:164:0x02ac, B:166:0x02b0, B:167:0x02b3, B:169:0x02b9, B:171:0x02ca, B:174:0x02da, B:176:0x02e7, B:179:0x02fc, B:181:0x0300, B:183:0x0306, B:184:0x0314, B:186:0x031e, B:187:0x032d, B:189:0x033b, B:191:0x033f, B:193:0x0343, B:195:0x034f, B:200:0x035a, B:202:0x035e, B:205:0x036c, B:207:0x0370, B:211:0x037b, B:213:0x0383, B:217:0x038c, B:203:0x0368, B:196:0x0352, B:198:0x0356), top: B:410:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fa A[LOOP:4: B:65:0x00e7->B:117:0x01fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e9 A[Catch: CryptoException -> 0x0010, IllegalStateException -> 0x007e, TryCatch #2 {CryptoException -> 0x0010, blocks: (B:3:0x0003, B:5:0x0007, B:12:0x0014, B:14:0x0019, B:16:0x001f, B:23:0x0041, B:25:0x0060, B:27:0x0074, B:38:0x0091, B:33:0x0086, B:237:0x03e9, B:246:0x0412, B:248:0x0416, B:250:0x041b, B:254:0x0423, B:256:0x0427, B:258:0x042f, B:260:0x043d, B:263:0x0442, B:265:0x0446, B:268:0x0459, B:269:0x045c, B:220:0x03b0, B:222:0x03b6, B:227:0x03c6, B:229:0x03ca, B:231:0x03ce, B:232:0x03d9, B:234:0x03e1), top: B:407:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03ff A[LOOP:0: B:136:0x0250->B:244:0x03ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0614 A[LOOP:1: B:246:0x0412->B:371:0x0614, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x061c A[EDGE_INSN: B:435:0x061c->B:373:0x061c BREAK  A[LOOP:1: B:246:0x0412->B:371:0x0614], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0154 A[Catch: IllegalStateException -> 0x00a6, CryptoException -> 0x00ab, TRY_ENTER, TryCatch #4 {CryptoException -> 0x00ab, blocks: (B:130:0x022a, B:46:0x00a3, B:56:0x00b6, B:58:0x00ba, B:60:0x00c0, B:64:0x00d8, B:65:0x00e7, B:69:0x00f4, B:71:0x00fa, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:125:0x021b, B:127:0x021f, B:73:0x010c, B:75:0x0113, B:76:0x0127, B:78:0x0137, B:82:0x0146, B:83:0x014e, B:86:0x0154, B:88:0x0158, B:90:0x0162, B:92:0x016c, B:93:0x0194, B:94:0x019c, B:95:0x019d, B:97:0x01a4, B:99:0x01ac, B:101:0x01b4, B:102:0x01bb, B:107:0x01ce, B:109:0x01dc, B:114:0x01f3, B:118:0x01fe, B:112:0x01e3, B:119:0x0201, B:133:0x0235, B:135:0x0242, B:136:0x0250, B:138:0x0254, B:144:0x0267, B:148:0x0270, B:150:0x0276, B:152:0x027e, B:154:0x0288, B:156:0x0290, B:158:0x029e, B:159:0x02a3, B:160:0x02a4, B:162:0x02a8, B:164:0x02ac, B:166:0x02b0, B:167:0x02b3, B:169:0x02b9, B:171:0x02ca, B:174:0x02da, B:176:0x02e7, B:179:0x02fc, B:181:0x0300, B:183:0x0306, B:184:0x0314, B:186:0x031e, B:187:0x032d, B:189:0x033b, B:191:0x033f, B:193:0x0343, B:195:0x034f, B:200:0x035a, B:202:0x035e, B:205:0x036c, B:207:0x0370, B:211:0x037b, B:213:0x0383, B:217:0x038c, B:203:0x0368, B:196:0x0352, B:198:0x0356), top: B:410:0x002b }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.internal.ads.gx1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(long r32, long r34) {
        /*
            Method dump skipped, instruction units count: 1696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx1.s(long, long):void");
    }

    public abstract boolean t();

    public abstract boolean u();

    /* JADX WARN: Can't wrap try/catch for region: R(15:51|(11:194|52|53|54|(1:56)|57|58|59|208|60|61)|(5:198|63|e8|70|(1:72))(1:80)|200|81|206|82|196|83|84|(1:86)|87|88|(6:101|102|103|(1:108)(1:107)|109|(3:(1:135)(1:114)|136|(5:138|(1:140)|141|142|220)(3:218|147|148))(0))(5:92|(1:100)(0)|102|103|(4:105|108|109|(3:111|113|(10:116|118|120|122|124|126|128|135|136|(0)(0))(4:128|135|136|(0)(0)))(0))(0))|143) */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0254, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0255, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0256, code lost:
    
        r3 = r0;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x025a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x025b, code lost:
    
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x025c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0227 A[Catch: Exception -> 0x0254, TRY_LEAVE, TryCatch #8 {Exception -> 0x0254, blocks: (B:82:0x0140, B:84:0x0148, B:87:0x017b, B:102:0x01b1, B:109:0x01c3, B:136:0x0221, B:138:0x0227, B:141:0x0239, B:128:0x0207), top: B:206:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ad A[Catch: ex1 -> 0x02c7, TryCatch #10 {ex1 -> 0x02c7, blocks: (B:164:0x027b, B:166:0x02ad, B:169:0x02ba, B:171:0x02c4, B:175:0x02de, B:178:0x02e6, B:179:0x02e8, B:174:0x02c9, B:181:0x02ec, B:182:0x02ed, B:184:0x02f4, B:185:0x02f5, B:186:0x02ff, B:188:0x0302), top: B:210:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c4 A[Catch: ex1 -> 0x02c7, TryCatch #10 {ex1 -> 0x02c7, blocks: (B:164:0x027b, B:166:0x02ad, B:169:0x02ba, B:171:0x02c4, B:175:0x02de, B:178:0x02e6, B:179:0x02e8, B:174:0x02c9, B:181:0x02ec, B:182:0x02ed, B:184:0x02f4, B:185:0x02f5, B:186:0x02ff, B:188:0x0302), top: B:210:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c9 A[Catch: ex1 -> 0x02c7, TryCatch #10 {ex1 -> 0x02c7, blocks: (B:164:0x027b, B:166:0x02ad, B:169:0x02ba, B:171:0x02c4, B:175:0x02de, B:178:0x02e6, B:179:0x02e8, B:174:0x02c9, B:181:0x02ec, B:182:0x02ed, B:184:0x02f4, B:185:0x02f5, B:186:0x02ff, B:188:0x0302), top: B:210:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.gms.internal.ads.gx1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gx1.v():void");
    }

    public boolean w(dx1 dx1Var) {
        return true;
    }

    public final void x() {
        try {
            bx1 bx1Var = this.M;
            if (bx1Var != null) {
                bx1Var.e();
                this.f5965t0.f11454c++;
                dx1 dx1Var = this.T;
                if (dx1Var == null) {
                    throw null;
                }
                T(dx1Var.f4712a);
            }
            this.M = null;
            this.G = null;
            B();
        } catch (Throwable th2) {
            this.M = null;
            this.G = null;
            B();
            throw th2;
        }
    }

    public boolean y() {
        int i = this.f5950l0;
        if (i == 3 || (this.V && !this.o0)) {
            return true;
        }
        if (i == 2) {
            try {
                nu0 nu0Var = this.H;
                nu0Var.getClass();
                this.G = nu0Var;
                this.f5948k0 = 0;
                this.f5950l0 = 0;
            } catch (bt1 e3) {
                rs.w("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e3);
                return true;
            }
        }
        return false;
    }

    public boolean z() {
        return true;
    }

    public void r() {
    }

    public void D(jx1 jx1Var) {
    }

    public void E(zq1 zq1Var) {
    }
}
