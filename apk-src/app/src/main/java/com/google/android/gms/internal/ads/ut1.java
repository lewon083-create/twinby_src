package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ut1 implements Handler.Callback, fy1, mu1, t0 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final long f11070e0 = cq0.r(10000);
    public uu1 A;
    public boolean C;
    public boolean D;
    public tt1 E;
    public int F;
    public lu1 G;
    public st1 H;
    public boolean I;
    public boolean K;
    public boolean L;
    public boolean N;
    public boolean Q;
    public int R;
    public tt1 S;
    public long T;
    public long U;
    public int V;
    public boolean W;
    public bt1 X;
    public et1 Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final su1[] f11072b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f11073b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gx1[] f11074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f11076d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final xs1 f11077d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f11078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f11079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wt1 f11080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f11081h;
    public final lo0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fc f11082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Looper f11083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nh f11084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bh f11085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f11086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final gn0 f11087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f11088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c6 f11089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final in0 f11090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cu1 f11091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xj0 f11092t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f11093u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fv1 f11094v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final bv1 f11095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final lo0 f11096x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f11097y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final lw f11098z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f11071a0 = -9223372036854775807L;
    public int O = 0;
    public boolean P = false;
    public boolean J = false;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f11075c0 = 1.0f;
    public tu1 B = tu1.f10719b;
    public long Y = -9223372036854775807L;
    public long M = -9223372036854775807L;

    public ut1(Context context, gx1[] gx1VarArr, gx1[] gx1VarArr2, b bVar, g gVar, wt1 wt1Var, l lVar, bv1 bv1Var, uu1 uu1Var, xs1 xs1Var, long j10, Looper looper, c6 c6Var, in0 in0Var, fv1 fv1Var, et1 et1Var) {
        Looper looper2;
        this.f11090r = in0Var;
        this.f11078e = bVar;
        this.f11079f = gVar;
        this.f11080g = wt1Var;
        this.f11081h = lVar;
        boolean z5 = false;
        this.A = uu1Var;
        this.f11077d0 = xs1Var;
        this.f11093u = j10;
        this.f11089q = c6Var;
        this.f11094v = fv1Var;
        this.Z = et1Var;
        this.f11095w = bv1Var;
        this.f11086n = wt1Var.c();
        jg jgVar = ci.f4215a;
        lu1 lu1VarA = lu1.a(gVar);
        this.G = lu1VarA;
        this.H = new st1(0, lu1VarA);
        int length = gx1VarArr.length;
        this.f11074c = new gx1[2];
        this.f11076d = new boolean[2];
        bVar.getClass();
        this.f11072b = new su1[2];
        boolean z10 = false;
        for (int i = 0; i < 2; i++) {
            gx1 gx1Var = gx1VarArr[i];
            gx1Var.f5939f = i;
            gx1Var.f5941g = fv1Var;
            gx1Var.f5943h = c6Var;
            gx1[] gx1VarArr3 = this.f11074c;
            gx1Var.getClass();
            gx1VarArr3[i] = gx1Var;
            gx1 gx1Var2 = this.f11074c[i];
            synchronized (gx1Var2.f5931b) {
                gx1Var2.f5962s = bVar;
            }
            gx1 gx1Var3 = gx1VarArr2[i];
            if (gx1Var3 != null) {
                gx1Var3.f5939f = i;
                gx1Var3.f5941g = fv1Var;
                gx1Var3.f5943h = c6Var;
                z10 = true;
            }
            this.f11072b[i] = new su1(i, gx1VarArr[i], gx1Var3);
        }
        this.f11097y = z10;
        this.f11087o = new gn0(this);
        this.f11088p = new ArrayList();
        this.f11084l = new nh();
        this.f11085m = new bh();
        ix.k0(bVar.f3521a == null);
        bVar.f3521a = this;
        bVar.f3522b = lVar;
        this.W = true;
        lo0 lo0VarY = c6Var.y(looper, null);
        this.f11096x = lo0VarY;
        this.f11091s = new cu1(bv1Var, lo0VarY, new xo0(11, this), et1Var);
        this.f11092t = new xj0(this, bv1Var, lo0VarY, fv1Var);
        fc fcVar = new fc();
        fcVar.f5320c = new Object();
        fcVar.f5321d = null;
        fcVar.f5322e = null;
        fcVar.f5319b = 0;
        this.f11082j = fcVar;
        synchronized (fcVar.f5320c) {
            try {
                if (((Looper) fcVar.f5321d) == null) {
                    if (fcVar.f5319b == 0 && ((HandlerThread) fcVar.f5322e) == null) {
                        z5 = true;
                    }
                    ix.k0(z5);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    fcVar.f5322e = handlerThread;
                    handlerThread.start();
                    fcVar.f5321d = ((HandlerThread) fcVar.f5322e).getLooper();
                }
                fcVar.f5319b++;
                looper2 = (Looper) fcVar.f5321d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11083k = looper2;
        lo0 lo0VarY2 = c6Var.y(looper2, this);
        this.i = lo0VarY2;
        this.f11098z = new lw(context, looper2, this);
        lo0VarY2.b(35, new t0() { // from class: com.google.android.gms.internal.ads.qt1
            @Override // com.google.android.gms.internal.ads.t0
            public final /* synthetic */ void a(long j11, long j12, jx1 jx1Var, MediaFormat mediaFormat) {
                this.f9588b.a(j11, j12, jx1Var, mediaFormat);
            }
        }).a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.gy1, com.google.android.gms.internal.ads.hz1, java.lang.Object] */
    public static final boolean A(au1 au1Var) {
        if (au1Var != null) {
            try {
                ?? r12 = au1Var.f3418a;
                if (au1Var.f3422e) {
                    gz1[] gz1VarArr = au1Var.f3420c;
                    for (int i = 0; i < 2; i++) {
                        gz1 gz1Var = gz1VarArr[i];
                        if (gz1Var != null) {
                            gz1Var.l();
                        }
                    }
                } else {
                    r12.h();
                }
                if ((!au1Var.f3422e ? 0L : r12.e()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int W(nh nhVar, bh bhVar, int i, boolean z5, Object obj, ci ciVar, ci ciVar2) {
        nh nhVar2 = nhVar;
        ci ciVar3 = ciVar;
        Object obj2 = ciVar3.b(ciVar3.o(obj, bhVar).f3786c, nhVar, 0L).f8298a;
        for (int i10 = 0; i10 < ciVar2.a(); i10++) {
            if (ciVar2.b(i10, nhVar, 0L).f8298a.equals(obj2)) {
                return i10;
            }
        }
        int iE = ciVar3.e(obj);
        int iC = ciVar3.c();
        int iE2 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= iC || iE2 != -1) {
                break;
            }
            ci ciVar4 = ciVar3;
            int iL = ciVar4.l(iE, bhVar, nhVar2, i, z5);
            if (iL == -1) {
                iE2 = -1;
                break;
            }
            iE2 = ciVar2.e(ciVar4.f(iL));
            i11++;
            ciVar3 = ciVar4;
            iE = iL;
            nhVar2 = nhVar;
        }
        if (iE2 == -1) {
            return -1;
        }
        return ciVar2.d(iE2, bhVar, false).f3786c;
    }

    public static Pair z(ci ciVar, tt1 tt1Var, int i, boolean z5, nh nhVar, bh bhVar) {
        ci ciVar2 = tt1Var.f10715a;
        if (ciVar.g()) {
            return null;
        }
        ci ciVar3 = true == ciVar2.g() ? ciVar : ciVar2;
        try {
            Pair pairM = ciVar3.m(nhVar, bhVar, tt1Var.f10716b, tt1Var.f10717c);
            if (!ciVar.equals(ciVar3)) {
                if (ciVar.e(pairM.first) == -1) {
                    int iW = W(nhVar, bhVar, i, z5, pairM.first, ciVar3, ciVar);
                    if (iW != -1) {
                        return ciVar.m(nhVar, bhVar, iW, -9223372036854775807L);
                    }
                    return null;
                }
                if (ciVar3.o(pairM.first, bhVar).f3788e && ciVar3.b(bhVar.f3786c, nhVar, 0L).f8307k == ciVar3.e(pairM.first)) {
                    return ciVar.m(nhVar, bhVar, ciVar.o(pairM.first, bhVar).f3786c, tt1Var.f10717c);
                }
            }
            return pairM;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final void B() {
        for (int i = 0; i < 2; i++) {
            su1[] su1VarArr = this.f11072b;
            int iE = su1VarArr[i].E();
            su1 su1Var = su1VarArr[i];
            gx1 gx1Var = (gx1) su1Var.f10399e;
            gx1 gx1Var2 = (gx1) su1Var.f10400f;
            gn0 gn0Var = this.f11087o;
            su1Var.v(gx1Var, gn0Var);
            if (gx1Var2 != null) {
                boolean z5 = (gx1Var2.i == 0 || su1Var.f10396b == 3) ? false : true;
                su1Var.v(gx1Var2, gn0Var);
                su1Var.w(false);
                if (z5) {
                    gx1 gx1Var3 = (gx1) su1Var.f10399e;
                    gx1Var2.getClass();
                    gx1Var2.c(17, gx1Var3);
                }
            }
            su1Var.f10396b = 0;
            m(i, false);
            this.R -= iE;
        }
        this.f11071a0 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            r10 = this;
            boolean r0 = r10.f11097y
            if (r0 == 0) goto L5e
            boolean r0 = r10.V()
            if (r0 != 0) goto Lb
            goto L5e
        Lb:
            r0 = 0
            r1 = r0
        Ld:
            r2 = 2
            if (r1 >= r2) goto L57
            com.google.android.gms.internal.ads.su1[] r3 = r10.f11072b
            r3 = r3[r1]
            int r4 = r3.E()
            boolean r5 = r3.D()
            if (r5 != 0) goto L1f
            goto L4a
        L1f:
            int r5 = r3.f10396b
            r6 = 1
            r7 = 4
            if (r5 == r7) goto L2c
            if (r5 != r2) goto L29
        L27:
            r5 = r6
            goto L2e
        L29:
            r2 = r5
            r5 = r0
            goto L2e
        L2c:
            r2 = r5
            goto L27
        L2e:
            if (r5 == 0) goto L35
            java.lang.Object r8 = r3.f10399e
            com.google.android.gms.internal.ads.gx1 r8 = (com.google.android.gms.internal.ads.gx1) r8
            goto L3c
        L35:
            java.lang.Object r8 = r3.f10400f
            com.google.android.gms.internal.ads.gx1 r8 = (com.google.android.gms.internal.ads.gx1) r8
            r8.getClass()
        L3c:
            com.google.android.gms.internal.ads.gn0 r9 = r10.f11087o
            r3.v(r8, r9)
            r3.w(r5)
            if (r2 != r7) goto L47
            goto L48
        L47:
            r6 = r0
        L48:
            r3.f10396b = r6
        L4a:
            int r2 = r10.R
            int r3 = r3.E()
            int r4 = r4 - r3
            int r2 = r2 - r4
            r10.R = r2
            int r1 = r1 + 1
            goto Ld
        L57:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.f11071a0 = r0
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut1.C():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D() throws com.google.android.gms.internal.ads.bt1 {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut1.D():void");
    }

    public final boolean E() {
        au1 au1Var = (au1) this.f11091s.f4330l;
        long j10 = au1Var.f3424g.f3910e;
        if (au1Var.f3422e) {
            return j10 == -9223372036854775807L || this.G.f7648r < j10 || !T();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a2 A[PHI: r27
      0x01a2: PHI (r27v0 boolean) = (r27v24 boolean), (r27v25 boolean) binds: [B:67:0x0196, B:69:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(com.google.android.gms.internal.ads.ci r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1145
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut1.F(com.google.android.gms.internal.ads.ci, boolean):void");
    }

    public final void G(ci ciVar, hy1 hy1Var, ci ciVar2, hy1 hy1Var2, long j10, boolean z5) {
        if (!o(ciVar, hy1Var)) {
            pc pcVar = hy1Var.b() ? pc.f9009d : this.G.f7645o;
            gn0 gn0Var = this.f11087o;
            if (gn0Var.d().equals(pcVar)) {
                return;
            }
            this.i.d(16);
            gn0Var.b(pcVar);
            K(this.G.f7645o, pcVar.f9010a, false, false);
            return;
        }
        Object obj = hy1Var.f6299a;
        bh bhVar = this.f11085m;
        int i = ciVar.o(obj, bhVar).f3786c;
        nh nhVar = this.f11084l;
        ciVar.b(i, nhVar, 0L);
        c2 c2Var = nhVar.f8305h;
        String str = cq0.f4293a;
        xs1 xs1Var = this.f11077d0;
        xs1Var.getClass();
        c2Var.getClass();
        long jS = cq0.s(-9223372036854775807L);
        xs1Var.f12298c = jS;
        xs1Var.f12301f = jS;
        xs1Var.f12302g = jS;
        xs1Var.c();
        if (j10 != -9223372036854775807L) {
            xs1Var.f12299d = n(ciVar, obj, j10);
            xs1Var.c();
            return;
        }
        if (!Objects.equals(!ciVar2.g() ? ciVar2.b(ciVar2.o(hy1Var2.f6299a, bhVar).f3786c, nhVar, 0L).f8298a : null, nhVar.f8298a) || z5) {
            xs1Var.f12299d = -9223372036854775807L;
            xs1Var.c();
        }
    }

    public final long H(au1 au1Var) {
        if (au1Var == null) {
            return 0L;
        }
        long jMax = au1Var.f3432p;
        if (au1Var.f3422e) {
            for (int i = 0; i < 2; i++) {
                su1[] su1VarArr = this.f11072b;
                if (su1VarArr[i].z(au1Var) != null) {
                    gx1 gx1VarZ = su1VarArr[i].z(au1Var);
                    Objects.requireNonNull(gx1VarZ);
                    long j10 = gx1VarZ.f5953n;
                    if (j10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j10, jMax);
                }
            }
        }
        return jMax;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.gy1, com.google.android.gms.internal.ads.hz1, java.lang.Object] */
    public final void I() {
        boolean z5;
        cu1 cu1Var = this.f11091s;
        cu1Var.S();
        au1 au1Var = (au1) cu1Var.f4334p;
        if (au1Var != null) {
            ?? r12 = au1Var.f3418a;
            if ((!au1Var.f3421d || au1Var.f3422e) && !r12.q()) {
                ci ciVar = this.G.f7632a;
                if (au1Var.f3422e) {
                    r12.f();
                }
                if (this.f11080g.d()) {
                    if (!au1Var.f3421d) {
                        long j10 = au1Var.f3424g.f3907b;
                        au1Var.f3421d = true;
                        r12.l(this, j10);
                        return;
                    }
                    xt1 xt1Var = new xt1();
                    xt1Var.f12328a = this.T - au1Var.f3432p;
                    float f10 = this.f11087o.d().f9010a;
                    ix.o(f10 > 0.0f || f10 == -3.4028235E38f);
                    xt1Var.f12329b = f10;
                    long j11 = this.M;
                    if (j11 >= 0) {
                        z5 = true;
                    } else if (j11 == -9223372036854775807L) {
                        j11 = -9223372036854775807L;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    ix.o(z5);
                    xt1Var.f12330c = j11;
                    yt1 yt1Var = new yt1(xt1Var);
                    ix.k0(au1Var.f3429m == null);
                    r12.j(yt1Var);
                }
            }
        }
    }

    public final void J() {
        au1 au1Var = (au1) this.f11091s.f4330l;
        boolean z5 = false;
        if (au1Var != null && au1Var.f3424g.f3912g && this.J) {
            z5 = true;
        }
        this.K = z5;
    }

    public final void K(pc pcVar, float f10, boolean z5, boolean z10) {
        int i;
        if (z5) {
            if (z10) {
                this.H.f(1);
            }
            lu1 lu1Var = this.G;
            this.G = new lu1(lu1Var.f7632a, lu1Var.f7633b, lu1Var.f7634c, lu1Var.f7635d, lu1Var.f7636e, lu1Var.f7637f, lu1Var.f7638g, lu1Var.f7639h, lu1Var.i, lu1Var.f7640j, lu1Var.f7641k, lu1Var.f7642l, lu1Var.f7643m, lu1Var.f7644n, pcVar, lu1Var.f7646p, lu1Var.f7647q, lu1Var.f7648r, lu1Var.f7649s);
        }
        float f11 = pcVar.f9010a;
        au1 au1Var = (au1) this.f11091s.f4330l;
        while (true) {
            i = 0;
            if (au1Var == null) {
                break;
            }
            d[] dVarArr = (d[]) au1Var.f3431o.f5554d;
            int length = dVarArr.length;
            while (i < length) {
                d dVar = dVarArr[i];
                i++;
            }
            au1Var = au1Var.f3429m;
        }
        su1[] su1VarArr = this.f11072b;
        while (i < 2) {
            su1 su1Var = su1VarArr[i];
            ((gx1) su1Var.f10399e).q(f10, f11);
            gx1 gx1Var = (gx1) su1Var.f10400f;
            if (gx1Var != null) {
                gx1Var.q(f10, f11);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.hz1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.gms.internal.ads.hz1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut1.L():void");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.hz1, java.lang.Object] */
    public final void M() {
        au1 au1Var = (au1) this.f11091s.f4333o;
        boolean z5 = true;
        if (!this.N && (au1Var == null || !au1Var.f3418a.q())) {
            z5 = false;
        }
        lu1 lu1Var = this.G;
        if (z5 != lu1Var.f7638g) {
            this.G = lu1Var.f(z5);
        }
    }

    public final lu1 N(hy1 hy1Var, long j10, long j11, long j12, boolean z5, int i) {
        mz1 mz1Var;
        g gVar;
        List list;
        r51 r51VarF;
        mz1 mz1Var2;
        this.W = (!this.W && j10 == this.G.f7648r && hy1Var.equals(this.G.f7633b)) ? false : true;
        J();
        lu1 lu1Var = this.G;
        mz1 mz1Var3 = lu1Var.f7639h;
        g gVar2 = lu1Var.i;
        List list2 = lu1Var.f7640j;
        if (this.f11092t.f12159b) {
            cu1 cu1Var = this.f11091s;
            au1 au1Var = (au1) cu1Var.f4330l;
            mz1 mz1Var4 = au1Var == null ? mz1.f8054d : au1Var.f3430n;
            g gVar3 = au1Var == null ? this.f11079f : au1Var.f3431o;
            d[] dVarArr = (d[]) gVar3.f5554d;
            u41 u41Var = new u41(4);
            int length = dVarArr.length;
            int i10 = 0;
            boolean z10 = false;
            while (i10 < length) {
                d dVar = dVarArr[i10];
                if (dVar != null) {
                    f9 f9Var = dVar.u(0).f6973k;
                    if (f9Var == null) {
                        mz1Var2 = mz1Var4;
                        u41Var.a(new f9(new k8[0]));
                    } else {
                        mz1Var2 = mz1Var4;
                        u41Var.a(f9Var);
                        z10 = true;
                    }
                } else {
                    mz1Var2 = mz1Var4;
                }
                i10++;
                mz1Var4 = mz1Var2;
            }
            mz1 mz1Var5 = mz1Var4;
            if (z10) {
                r51VarF = u41Var.f();
            } else {
                v41 v41Var = x41.f12018c;
                r51VarF = r51.f9713f;
            }
            if (au1Var != null) {
                bu1 bu1Var = au1Var.f3424g;
                if (bu1Var.f3908c != j11) {
                    au1Var.f3424g = bu1Var.b(j11);
                }
            }
            au1 au1Var2 = (au1) cu1Var.f4330l;
            if (au1Var2 == ((au1) cu1Var.f4331m) && au1Var2 != null) {
                g gVar4 = au1Var2.f3431o;
                int i11 = 0;
                while (true) {
                    su1[] su1VarArr = this.f11072b;
                    if (i11 >= 2) {
                        break;
                    }
                    if (gVar4.b(i11)) {
                        if (((gx1) su1VarArr[i11].f10399e).f5933c != 1) {
                            break;
                        }
                        ((ru1[]) gVar4.f5553c)[i11].getClass();
                    }
                    i11++;
                }
            }
            list = r51VarF;
            gVar = gVar3;
            mz1Var = mz1Var5;
        } else {
            if (!hy1Var.equals(lu1Var.f7633b)) {
                gVar2 = this.f11079f;
                mz1Var3 = mz1.f8054d;
                list2 = r51.f9713f;
            }
            mz1Var = mz1Var3;
            gVar = gVar2;
            list = list2;
        }
        if (z5) {
            st1 st1Var = this.H;
            if (!st1Var.f10389e || st1Var.f10387c == 5) {
                st1Var.f10388d = true;
                st1Var.f10389e = true;
                st1Var.f10387c = i;
            } else {
                ix.o(i == 5);
            }
        }
        lu1 lu1Var2 = this.G;
        return lu1Var2.b(hy1Var, j10, j11, j12, R(lu1Var2.f7646p), mz1Var, gVar, list);
    }

    public final void O(boolean[] zArr, long j10) throws bt1 {
        su1[] su1VarArr;
        long j11;
        au1 au1Var = (au1) this.f11091s.f4331m;
        g gVar = au1Var.f3431o;
        int i = 0;
        while (true) {
            su1VarArr = this.f11072b;
            if (i >= 2) {
                break;
            }
            if (!gVar.b(i)) {
                su1VarArr[i].o();
            }
            i++;
        }
        int i10 = 0;
        while (i10 < 2) {
            if (gVar.b(i10) && su1VarArr[i10].z(au1Var) == null) {
                j11 = j10;
                P(au1Var, i10, zArr[i10], j11);
            } else {
                j11 = j10;
            }
            i10++;
            j10 = j11;
        }
    }

    public final void P(au1 au1Var, int i, boolean z5, long j10) throws bt1 {
        int i10;
        int i11;
        su1 su1Var = this.f11072b[i];
        if (su1Var.t()) {
            return;
        }
        boolean z10 = au1Var == ((au1) this.f11091s.f4330l);
        g gVar = au1Var.f3431o;
        ru1 ru1Var = ((ru1[]) gVar.f5553c)[i];
        d dVar = ((d[]) gVar.f5554d)[i];
        boolean z11 = T() && this.G.f7636e == 3;
        boolean z12 = !z5 && z11;
        this.R++;
        gz1 gz1Var = au1Var.f3420c[i];
        long j11 = au1Var.f3432p;
        hy1 hy1Var = au1Var.f3424g.f3906a;
        if (dVar != null) {
            i10 = dVar.i();
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        jx1[] jx1VarArr = new jx1[i10];
        while (i11 < i10) {
            dVar.getClass();
            jx1VarArr[i11] = dVar.u(i11);
            i11++;
        }
        int i12 = su1Var.f10396b;
        gn0 gn0Var = this.f11087o;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            su1Var.f10397c = true;
            gx1 gx1Var = (gx1) su1Var.f10399e;
            ix.k0(gx1Var.i == 0);
            gx1Var.f5937e = ru1Var;
            gx1Var.f5960r = hy1Var;
            gx1Var.i = 1;
            gx1Var.p0(z12, z10);
            gx1Var.l0(jx1VarArr, gz1Var, j10, j11, hy1Var);
            gx1Var.L(j10, z12, true);
            gn0Var.o(gx1Var);
        } else {
            su1Var.f10398d = true;
            gx1 gx1Var2 = (gx1) su1Var.f10400f;
            gx1Var2.getClass();
            ix.k0(gx1Var2.i == 0);
            gx1Var2.f5937e = ru1Var;
            gx1Var2.f5960r = hy1Var;
            gx1Var2.i = 1;
            gx1Var2.p0(z12, z10);
            gx1Var2.l0(jx1VarArr, gz1Var, j10, j11, hy1Var);
            gx1Var2.L(j10, z12, true);
            gn0Var.o(gx1Var2);
        }
        pt1 pt1Var = new pt1(this);
        gx1 gx1VarZ = su1Var.z(au1Var);
        gx1VarZ.getClass();
        gx1VarZ.c(11, pt1Var);
        if (z11 && z10) {
            su1Var.Q();
        }
    }

    public final void Q(boolean z5) {
        au1 au1Var = (au1) this.f11091s.f4333o;
        hy1 hy1Var = au1Var == null ? this.G.f7633b : au1Var.f3424g.f3906a;
        boolean zEquals = this.G.f7641k.equals(hy1Var);
        if (!zEquals) {
            this.G = this.G.g(hy1Var);
        }
        lu1 lu1Var = this.G;
        lu1Var.f7646p = au1Var == null ? lu1Var.f7648r : au1Var.d();
        lu1 lu1Var2 = this.G;
        lu1Var2.f7647q = R(lu1Var2.f7646p);
        if ((!zEquals || z5) && au1Var != null && au1Var.f3422e) {
            S(au1Var.f3424g.f3906a, au1Var.f3430n, au1Var.f3431o);
        }
    }

    public final long R(long j10) {
        au1 au1Var = (au1) this.f11091s.f4333o;
        if (au1Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.T - au1Var.f3432p));
    }

    public final void S(hy1 hy1Var, mz1 mz1Var, g gVar) {
        au1 au1Var = (au1) this.f11091s.f4333o;
        au1Var.getClass();
        long jR = R(au1Var.d());
        long j10 = o(this.G.f7632a, au1Var.f3424g.f3906a) ? this.f11077d0.f12303h : -9223372036854775807L;
        ci ciVar = this.G.f7632a;
        float f10 = this.f11087o.d().f9010a;
        boolean z5 = this.G.f7642l;
        this.f11080g.h(new vt1(this.f11094v, ciVar, hy1Var, jR, f10, this.L, j10), (d[]) gVar.f5554d);
    }

    public final boolean T() {
        lu1 lu1Var = this.G;
        return lu1Var.f7642l && lu1Var.f7644n == 0;
    }

    public final void U(int i) {
        su1 su1Var = this.f11072b[i];
        try {
            au1 au1Var = (au1) this.f11091s.f4330l;
            if (au1Var == null) {
                throw null;
            }
            gx1 gx1VarZ = su1Var.z(au1Var);
            gx1VarZ.getClass();
            gz1 gz1Var = gx1VarZ.f5945j;
            gz1Var.getClass();
            gz1Var.l();
        } catch (IOException | RuntimeException e3) {
            int i10 = ((gx1) su1Var.f10399e).f5933c;
            throw e3;
        }
    }

    public final boolean V() {
        if (!this.f11097y) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (this.f11072b[i].D()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t0
    public final void a(long j10, long j11, jx1 jx1Var, MediaFormat mediaFormat) {
        if (this.D) {
            Handler handler = this.i.f7588a;
            go0 go0VarG = lo0.g();
            go0VarG.f5884a = handler.obtainMessage(37);
            go0VarG.a();
        }
    }

    public final void b(IOException iOException, int i) {
        bt1 bt1Var = new bt1(0, iOException, i);
        au1 au1Var = (au1) this.f11091s.f4330l;
        if (au1Var != null) {
            bt1Var = bt1Var.a(au1Var.f3424g.f3906a);
        }
        rs.H("ExoPlayerImplInternal", "Playback error", bt1Var);
        u(false, false);
        this.G = this.G.e(bt1Var);
    }

    public final void c(int i) {
        lu1 lu1Var = this.G;
        if (lu1Var.f7636e != i) {
            if (i != 2) {
                this.Y = -9223372036854775807L;
            }
            this.G = lu1Var.d(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public final /* bridge */ /* synthetic */ void d(hz1 hz1Var) {
        this.i.b(9, (gy1) hz1Var).a();
    }

    public final void e() {
        st1 st1Var = this.H;
        lu1 lu1Var = this.G;
        boolean z5 = st1Var.f10388d | (((lu1) st1Var.f10390f) != lu1Var);
        st1Var.f10388d = z5;
        st1Var.f10390f = lu1Var;
        if (z5) {
            ot1 ot1Var = (ot1) this.f11090r.f6553c;
            ot1Var.f8784l.e(new th0(18, ot1Var, st1Var));
            this.H = new st1(0, this.G);
        }
    }

    public final void f(float f10) {
        this.f11075c0 = f10;
        float f11 = f10 * this.f11098z.f7657d;
        for (int i = 0; i < 2; i++) {
            su1 su1Var = this.f11072b[i];
            gx1 gx1Var = (gx1) su1Var.f10399e;
            if (gx1Var.f5933c == 1) {
                Float fValueOf = Float.valueOf(f11);
                gx1Var.c(2, fValueOf);
                gx1 gx1Var2 = (gx1) su1Var.f10400f;
                if (gx1Var2 != null) {
                    gx1Var2.c(2, fValueOf);
                }
            }
        }
    }

    public final void g(int i, int i10, int i11, boolean z5) {
        boolean z10;
        if (!z5) {
            z10 = false;
        } else if (i != -1) {
            z10 = true;
        } else {
            i = -1;
            z10 = false;
        }
        if (i == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        boolean z11 = this.C;
        if (i == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            i10 = z11 ? 4 : 0;
        }
        lu1 lu1Var = this.G;
        if (lu1Var.f7642l == z10 && lu1Var.f7644n == i10 && lu1Var.f7643m == i11) {
            return;
        }
        this.G = lu1Var.h(i11, i10, z10);
        y(false, false);
        cu1 cu1Var = this.f11091s;
        for (au1 au1Var = (au1) cu1Var.f4330l; au1Var != null; au1Var = au1Var.f3429m) {
            for (d dVar : (d[]) au1Var.f3431o.f5554d) {
            }
        }
        if (!T()) {
            k();
            l();
            this.G.getClass();
            cu1Var.G(this.T);
            return;
        }
        int i12 = this.G.f7636e;
        lo0 lo0Var = this.i;
        if (i12 != 3) {
            if (i12 == 2) {
                lo0Var.c(2);
                return;
            }
            return;
        }
        gn0 gn0Var = this.f11087o;
        gn0Var.f5874c = true;
        wu1 wu1Var = (wu1) gn0Var.f5875d;
        if (!wu1Var.f11900b) {
            wu1Var.f11902d = SystemClock.elapsedRealtime();
            wu1Var.f11900b = true;
        }
        j();
        lo0Var.c(2);
    }

    public final void h(boolean z5) throws bt1 {
        hy1 hy1Var = ((au1) this.f11091s.f4330l).f3424g.f3906a;
        long jR = r(hy1Var, this.G.f7648r, true, false);
        if (jR != this.G.f7648r) {
            lu1 lu1Var = this.G;
            this.G = N(hy1Var, jR, lu1Var.f7634c, lu1Var.f7635d, z5, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0663 A[Catch: IOException -> 0x0028, t91 -> 0x002b, eb -> 0x002e, tw1 -> 0x0031, RuntimeException -> 0x0605, bt1 -> 0x0608, TRY_LEAVE, TryCatch #25 {bt1 -> 0x0608, RuntimeException -> 0x0605, blocks: (B:285:0x0601, B:293:0x061c, B:294:0x0624, B:296:0x0631, B:298:0x063f, B:303:0x0657, B:396:0x07da, B:398:0x07e0, B:400:0x07e6, B:403:0x07eb, B:404:0x07f6, B:406:0x07fa, B:410:0x081f, B:412:0x0825, B:417:0x0833, B:418:0x083b, B:419:0x083e, B:421:0x0847, B:469:0x0915, B:470:0x091a, B:475:0x0927, B:477:0x092f, B:478:0x0935, B:480:0x0943, B:481:0x095c, B:483:0x0960, B:485:0x0968, B:499:0x0992, B:486:0x096d, B:488:0x0976, B:492:0x097f, B:498:0x098f, B:501:0x099c, B:503:0x09a2, B:507:0x09af, B:516:0x09eb, B:518:0x09f1, B:520:0x09f5, B:547:0x0a8a, B:549:0x0a96, B:551:0x0aa7, B:552:0x0ab0, B:571:0x0afa, B:574:0x0b01, B:576:0x0b05, B:581:0x0b12, B:582:0x0b15, B:583:0x0b18, B:585:0x0b1e, B:587:0x0b27, B:589:0x0b31, B:591:0x0b37, B:593:0x0b3d, B:600:0x0b5f, B:602:0x0b65, B:606:0x0b6e, B:615:0x0b88, B:612:0x0b81, B:614:0x0b85, B:594:0x0b44, B:597:0x0b52, B:598:0x0b5a, B:599:0x0b5b, B:553:0x0ab4, B:555:0x0aba, B:557:0x0abe, B:561:0x0ac7, B:563:0x0ad6, B:565:0x0adc, B:567:0x0ae8, B:568:0x0aed, B:569:0x0af2, B:570:0x0af7, B:523:0x0a03, B:525:0x0a07, B:527:0x0a19, B:529:0x0a24, B:531:0x0a2e, B:535:0x0a37, B:537:0x0a41, B:543:0x0a4c, B:509:0x09b7, B:511:0x09bb, B:512:0x09d5, B:514:0x09db, B:500:0x0995, B:424:0x0850, B:426:0x0854, B:428:0x085a, B:430:0x0860, B:432:0x086a, B:435:0x0870, B:436:0x0873, B:438:0x087c, B:440:0x088e, B:442:0x0897, B:444:0x089f, B:449:0x08ab, B:451:0x08d3, B:453:0x08d9, B:455:0x08de, B:456:0x08e6, B:458:0x08ec, B:459:0x08ef, B:460:0x08f8, B:462:0x08fc, B:464:0x0902, B:465:0x0907, B:468:0x0914, B:306:0x0663, B:316:0x0680, B:321:0x0691, B:325:0x06a3, B:332:0x06c8, B:349:0x06ff, B:351:0x0732, B:353:0x0736, B:357:0x0746, B:359:0x074a, B:363:0x0751, B:365:0x0757, B:367:0x0776, B:370:0x077f, B:372:0x0784, B:374:0x078a, B:375:0x0792, B:377:0x0798, B:355:0x073c, B:379:0x07a5, B:380:0x07b0, B:382:0x07b6, B:384:0x07ba, B:386:0x07bf, B:395:0x07d7, B:392:0x07ce, B:394:0x07d4, B:616:0x0b8d, B:620:0x0b97), top: B:700:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07a5 A[Catch: IOException -> 0x0028, t91 -> 0x002b, eb -> 0x002e, tw1 -> 0x0031, RuntimeException -> 0x0605, bt1 -> 0x0608, LOOP:18: B:378:0x07a3->B:379:0x07a5, LOOP_END, TryCatch #25 {bt1 -> 0x0608, RuntimeException -> 0x0605, blocks: (B:285:0x0601, B:293:0x061c, B:294:0x0624, B:296:0x0631, B:298:0x063f, B:303:0x0657, B:396:0x07da, B:398:0x07e0, B:400:0x07e6, B:403:0x07eb, B:404:0x07f6, B:406:0x07fa, B:410:0x081f, B:412:0x0825, B:417:0x0833, B:418:0x083b, B:419:0x083e, B:421:0x0847, B:469:0x0915, B:470:0x091a, B:475:0x0927, B:477:0x092f, B:478:0x0935, B:480:0x0943, B:481:0x095c, B:483:0x0960, B:485:0x0968, B:499:0x0992, B:486:0x096d, B:488:0x0976, B:492:0x097f, B:498:0x098f, B:501:0x099c, B:503:0x09a2, B:507:0x09af, B:516:0x09eb, B:518:0x09f1, B:520:0x09f5, B:547:0x0a8a, B:549:0x0a96, B:551:0x0aa7, B:552:0x0ab0, B:571:0x0afa, B:574:0x0b01, B:576:0x0b05, B:581:0x0b12, B:582:0x0b15, B:583:0x0b18, B:585:0x0b1e, B:587:0x0b27, B:589:0x0b31, B:591:0x0b37, B:593:0x0b3d, B:600:0x0b5f, B:602:0x0b65, B:606:0x0b6e, B:615:0x0b88, B:612:0x0b81, B:614:0x0b85, B:594:0x0b44, B:597:0x0b52, B:598:0x0b5a, B:599:0x0b5b, B:553:0x0ab4, B:555:0x0aba, B:557:0x0abe, B:561:0x0ac7, B:563:0x0ad6, B:565:0x0adc, B:567:0x0ae8, B:568:0x0aed, B:569:0x0af2, B:570:0x0af7, B:523:0x0a03, B:525:0x0a07, B:527:0x0a19, B:529:0x0a24, B:531:0x0a2e, B:535:0x0a37, B:537:0x0a41, B:543:0x0a4c, B:509:0x09b7, B:511:0x09bb, B:512:0x09d5, B:514:0x09db, B:500:0x0995, B:424:0x0850, B:426:0x0854, B:428:0x085a, B:430:0x0860, B:432:0x086a, B:435:0x0870, B:436:0x0873, B:438:0x087c, B:440:0x088e, B:442:0x0897, B:444:0x089f, B:449:0x08ab, B:451:0x08d3, B:453:0x08d9, B:455:0x08de, B:456:0x08e6, B:458:0x08ec, B:459:0x08ef, B:460:0x08f8, B:462:0x08fc, B:464:0x0902, B:465:0x0907, B:468:0x0914, B:306:0x0663, B:316:0x0680, B:321:0x0691, B:325:0x06a3, B:332:0x06c8, B:349:0x06ff, B:351:0x0732, B:353:0x0736, B:357:0x0746, B:359:0x074a, B:363:0x0751, B:365:0x0757, B:367:0x0776, B:370:0x077f, B:372:0x0784, B:374:0x078a, B:375:0x0792, B:377:0x0798, B:355:0x073c, B:379:0x07a5, B:380:0x07b0, B:382:0x07b6, B:384:0x07ba, B:386:0x07bf, B:395:0x07d7, B:392:0x07ce, B:394:0x07d4, B:616:0x0b8d, B:620:0x0b97), top: B:700:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08de A[Catch: IOException -> 0x0028, t91 -> 0x002b, eb -> 0x002e, tw1 -> 0x0031, RuntimeException -> 0x0605, bt1 -> 0x0608, LOOP:8: B:454:0x08dc->B:455:0x08de, LOOP_END, TryCatch #25 {bt1 -> 0x0608, RuntimeException -> 0x0605, blocks: (B:285:0x0601, B:293:0x061c, B:294:0x0624, B:296:0x0631, B:298:0x063f, B:303:0x0657, B:396:0x07da, B:398:0x07e0, B:400:0x07e6, B:403:0x07eb, B:404:0x07f6, B:406:0x07fa, B:410:0x081f, B:412:0x0825, B:417:0x0833, B:418:0x083b, B:419:0x083e, B:421:0x0847, B:469:0x0915, B:470:0x091a, B:475:0x0927, B:477:0x092f, B:478:0x0935, B:480:0x0943, B:481:0x095c, B:483:0x0960, B:485:0x0968, B:499:0x0992, B:486:0x096d, B:488:0x0976, B:492:0x097f, B:498:0x098f, B:501:0x099c, B:503:0x09a2, B:507:0x09af, B:516:0x09eb, B:518:0x09f1, B:520:0x09f5, B:547:0x0a8a, B:549:0x0a96, B:551:0x0aa7, B:552:0x0ab0, B:571:0x0afa, B:574:0x0b01, B:576:0x0b05, B:581:0x0b12, B:582:0x0b15, B:583:0x0b18, B:585:0x0b1e, B:587:0x0b27, B:589:0x0b31, B:591:0x0b37, B:593:0x0b3d, B:600:0x0b5f, B:602:0x0b65, B:606:0x0b6e, B:615:0x0b88, B:612:0x0b81, B:614:0x0b85, B:594:0x0b44, B:597:0x0b52, B:598:0x0b5a, B:599:0x0b5b, B:553:0x0ab4, B:555:0x0aba, B:557:0x0abe, B:561:0x0ac7, B:563:0x0ad6, B:565:0x0adc, B:567:0x0ae8, B:568:0x0aed, B:569:0x0af2, B:570:0x0af7, B:523:0x0a03, B:525:0x0a07, B:527:0x0a19, B:529:0x0a24, B:531:0x0a2e, B:535:0x0a37, B:537:0x0a41, B:543:0x0a4c, B:509:0x09b7, B:511:0x09bb, B:512:0x09d5, B:514:0x09db, B:500:0x0995, B:424:0x0850, B:426:0x0854, B:428:0x085a, B:430:0x0860, B:432:0x086a, B:435:0x0870, B:436:0x0873, B:438:0x087c, B:440:0x088e, B:442:0x0897, B:444:0x089f, B:449:0x08ab, B:451:0x08d3, B:453:0x08d9, B:455:0x08de, B:456:0x08e6, B:458:0x08ec, B:459:0x08ef, B:460:0x08f8, B:462:0x08fc, B:464:0x0902, B:465:0x0907, B:468:0x0914, B:306:0x0663, B:316:0x0680, B:321:0x0691, B:325:0x06a3, B:332:0x06c8, B:349:0x06ff, B:351:0x0732, B:353:0x0736, B:357:0x0746, B:359:0x074a, B:363:0x0751, B:365:0x0757, B:367:0x0776, B:370:0x077f, B:372:0x0784, B:374:0x078a, B:375:0x0792, B:377:0x0798, B:355:0x073c, B:379:0x07a5, B:380:0x07b0, B:382:0x07b6, B:384:0x07ba, B:386:0x07bf, B:395:0x07d7, B:392:0x07ce, B:394:0x07d4, B:616:0x0b8d, B:620:0x0b97), top: B:700:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x08ec A[Catch: IOException -> 0x0028, t91 -> 0x002b, eb -> 0x002e, tw1 -> 0x0031, RuntimeException -> 0x0605, bt1 -> 0x0608, TryCatch #25 {bt1 -> 0x0608, RuntimeException -> 0x0605, blocks: (B:285:0x0601, B:293:0x061c, B:294:0x0624, B:296:0x0631, B:298:0x063f, B:303:0x0657, B:396:0x07da, B:398:0x07e0, B:400:0x07e6, B:403:0x07eb, B:404:0x07f6, B:406:0x07fa, B:410:0x081f, B:412:0x0825, B:417:0x0833, B:418:0x083b, B:419:0x083e, B:421:0x0847, B:469:0x0915, B:470:0x091a, B:475:0x0927, B:477:0x092f, B:478:0x0935, B:480:0x0943, B:481:0x095c, B:483:0x0960, B:485:0x0968, B:499:0x0992, B:486:0x096d, B:488:0x0976, B:492:0x097f, B:498:0x098f, B:501:0x099c, B:503:0x09a2, B:507:0x09af, B:516:0x09eb, B:518:0x09f1, B:520:0x09f5, B:547:0x0a8a, B:549:0x0a96, B:551:0x0aa7, B:552:0x0ab0, B:571:0x0afa, B:574:0x0b01, B:576:0x0b05, B:581:0x0b12, B:582:0x0b15, B:583:0x0b18, B:585:0x0b1e, B:587:0x0b27, B:589:0x0b31, B:591:0x0b37, B:593:0x0b3d, B:600:0x0b5f, B:602:0x0b65, B:606:0x0b6e, B:615:0x0b88, B:612:0x0b81, B:614:0x0b85, B:594:0x0b44, B:597:0x0b52, B:598:0x0b5a, B:599:0x0b5b, B:553:0x0ab4, B:555:0x0aba, B:557:0x0abe, B:561:0x0ac7, B:563:0x0ad6, B:565:0x0adc, B:567:0x0ae8, B:568:0x0aed, B:569:0x0af2, B:570:0x0af7, B:523:0x0a03, B:525:0x0a07, B:527:0x0a19, B:529:0x0a24, B:531:0x0a2e, B:535:0x0a37, B:537:0x0a41, B:543:0x0a4c, B:509:0x09b7, B:511:0x09bb, B:512:0x09d5, B:514:0x09db, B:500:0x0995, B:424:0x0850, B:426:0x0854, B:428:0x085a, B:430:0x0860, B:432:0x086a, B:435:0x0870, B:436:0x0873, B:438:0x087c, B:440:0x088e, B:442:0x0897, B:444:0x089f, B:449:0x08ab, B:451:0x08d3, B:453:0x08d9, B:455:0x08de, B:456:0x08e6, B:458:0x08ec, B:459:0x08ef, B:460:0x08f8, B:462:0x08fc, B:464:0x0902, B:465:0x0907, B:468:0x0914, B:306:0x0663, B:316:0x0680, B:321:0x0691, B:325:0x06a3, B:332:0x06c8, B:349:0x06ff, B:351:0x0732, B:353:0x0736, B:357:0x0746, B:359:0x074a, B:363:0x0751, B:365:0x0757, B:367:0x0776, B:370:0x077f, B:372:0x0784, B:374:0x078a, B:375:0x0792, B:377:0x0798, B:355:0x073c, B:379:0x07a5, B:380:0x07b0, B:382:0x07b6, B:384:0x07ba, B:386:0x07bf, B:395:0x07d7, B:392:0x07ce, B:394:0x07d4, B:616:0x0b8d, B:620:0x0b97), top: B:700:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x08fc A[Catch: IOException -> 0x0028, t91 -> 0x002b, eb -> 0x002e, tw1 -> 0x0031, RuntimeException -> 0x0605, bt1 -> 0x0608, TryCatch #25 {bt1 -> 0x0608, RuntimeException -> 0x0605, blocks: (B:285:0x0601, B:293:0x061c, B:294:0x0624, B:296:0x0631, B:298:0x063f, B:303:0x0657, B:396:0x07da, B:398:0x07e0, B:400:0x07e6, B:403:0x07eb, B:404:0x07f6, B:406:0x07fa, B:410:0x081f, B:412:0x0825, B:417:0x0833, B:418:0x083b, B:419:0x083e, B:421:0x0847, B:469:0x0915, B:470:0x091a, B:475:0x0927, B:477:0x092f, B:478:0x0935, B:480:0x0943, B:481:0x095c, B:483:0x0960, B:485:0x0968, B:499:0x0992, B:486:0x096d, B:488:0x0976, B:492:0x097f, B:498:0x098f, B:501:0x099c, B:503:0x09a2, B:507:0x09af, B:516:0x09eb, B:518:0x09f1, B:520:0x09f5, B:547:0x0a8a, B:549:0x0a96, B:551:0x0aa7, B:552:0x0ab0, B:571:0x0afa, B:574:0x0b01, B:576:0x0b05, B:581:0x0b12, B:582:0x0b15, B:583:0x0b18, B:585:0x0b1e, B:587:0x0b27, B:589:0x0b31, B:591:0x0b37, B:593:0x0b3d, B:600:0x0b5f, B:602:0x0b65, B:606:0x0b6e, B:615:0x0b88, B:612:0x0b81, B:614:0x0b85, B:594:0x0b44, B:597:0x0b52, B:598:0x0b5a, B:599:0x0b5b, B:553:0x0ab4, B:555:0x0aba, B:557:0x0abe, B:561:0x0ac7, B:563:0x0ad6, B:565:0x0adc, B:567:0x0ae8, B:568:0x0aed, B:569:0x0af2, B:570:0x0af7, B:523:0x0a03, B:525:0x0a07, B:527:0x0a19, B:529:0x0a24, B:531:0x0a2e, B:535:0x0a37, B:537:0x0a41, B:543:0x0a4c, B:509:0x09b7, B:511:0x09bb, B:512:0x09d5, B:514:0x09db, B:500:0x0995, B:424:0x0850, B:426:0x0854, B:428:0x085a, B:430:0x0860, B:432:0x086a, B:435:0x0870, B:436:0x0873, B:438:0x087c, B:440:0x088e, B:442:0x0897, B:444:0x089f, B:449:0x08ab, B:451:0x08d3, B:453:0x08d9, B:455:0x08de, B:456:0x08e6, B:458:0x08ec, B:459:0x08ef, B:460:0x08f8, B:462:0x08fc, B:464:0x0902, B:465:0x0907, B:468:0x0914, B:306:0x0663, B:316:0x0680, B:321:0x0691, B:325:0x06a3, B:332:0x06c8, B:349:0x06ff, B:351:0x0732, B:353:0x0736, B:357:0x0746, B:359:0x074a, B:363:0x0751, B:365:0x0757, B:367:0x0776, B:370:0x077f, B:372:0x0784, B:374:0x078a, B:375:0x0792, B:377:0x0798, B:355:0x073c, B:379:0x07a5, B:380:0x07b0, B:382:0x07b6, B:384:0x07ba, B:386:0x07bf, B:395:0x07d7, B:392:0x07ce, B:394:0x07d4, B:616:0x0b8d, B:620:0x0b97), top: B:700:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0a96 A[Catch: IOException -> 0x0028, t91 -> 0x002b, eb -> 0x002e, tw1 -> 0x0031, RuntimeException -> 0x0605, bt1 -> 0x0608, TryCatch #25 {bt1 -> 0x0608, RuntimeException -> 0x0605, blocks: (B:285:0x0601, B:293:0x061c, B:294:0x0624, B:296:0x0631, B:298:0x063f, B:303:0x0657, B:396:0x07da, B:398:0x07e0, B:400:0x07e6, B:403:0x07eb, B:404:0x07f6, B:406:0x07fa, B:410:0x081f, B:412:0x0825, B:417:0x0833, B:418:0x083b, B:419:0x083e, B:421:0x0847, B:469:0x0915, B:470:0x091a, B:475:0x0927, B:477:0x092f, B:478:0x0935, B:480:0x0943, B:481:0x095c, B:483:0x0960, B:485:0x0968, B:499:0x0992, B:486:0x096d, B:488:0x0976, B:492:0x097f, B:498:0x098f, B:501:0x099c, B:503:0x09a2, B:507:0x09af, B:516:0x09eb, B:518:0x09f1, B:520:0x09f5, B:547:0x0a8a, B:549:0x0a96, B:551:0x0aa7, B:552:0x0ab0, B:571:0x0afa, B:574:0x0b01, B:576:0x0b05, B:581:0x0b12, B:582:0x0b15, B:583:0x0b18, B:585:0x0b1e, B:587:0x0b27, B:589:0x0b31, B:591:0x0b37, B:593:0x0b3d, B:600:0x0b5f, B:602:0x0b65, B:606:0x0b6e, B:615:0x0b88, B:612:0x0b81, B:614:0x0b85, B:594:0x0b44, B:597:0x0b52, B:598:0x0b5a, B:599:0x0b5b, B:553:0x0ab4, B:555:0x0aba, B:557:0x0abe, B:561:0x0ac7, B:563:0x0ad6, B:565:0x0adc, B:567:0x0ae8, B:568:0x0aed, B:569:0x0af2, B:570:0x0af7, B:523:0x0a03, B:525:0x0a07, B:527:0x0a19, B:529:0x0a24, B:531:0x0a2e, B:535:0x0a37, B:537:0x0a41, B:543:0x0a4c, B:509:0x09b7, B:511:0x09bb, B:512:0x09d5, B:514:0x09db, B:500:0x0995, B:424:0x0850, B:426:0x0854, B:428:0x085a, B:430:0x0860, B:432:0x086a, B:435:0x0870, B:436:0x0873, B:438:0x087c, B:440:0x088e, B:442:0x0897, B:444:0x089f, B:449:0x08ab, B:451:0x08d3, B:453:0x08d9, B:455:0x08de, B:456:0x08e6, B:458:0x08ec, B:459:0x08ef, B:460:0x08f8, B:462:0x08fc, B:464:0x0902, B:465:0x0907, B:468:0x0914, B:306:0x0663, B:316:0x0680, B:321:0x0691, B:325:0x06a3, B:332:0x06c8, B:349:0x06ff, B:351:0x0732, B:353:0x0736, B:357:0x0746, B:359:0x074a, B:363:0x0751, B:365:0x0757, B:367:0x0776, B:370:0x077f, B:372:0x0784, B:374:0x078a, B:375:0x0792, B:377:0x0798, B:355:0x073c, B:379:0x07a5, B:380:0x07b0, B:382:0x07b6, B:384:0x07ba, B:386:0x07bf, B:395:0x07d7, B:392:0x07ce, B:394:0x07d4, B:616:0x0b8d, B:620:0x0b97), top: B:700:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0aba A[Catch: IOException -> 0x0028, t91 -> 0x002b, eb -> 0x002e, tw1 -> 0x0031, RuntimeException -> 0x0605, bt1 -> 0x0608, TryCatch #25 {bt1 -> 0x0608, RuntimeException -> 0x0605, blocks: (B:285:0x0601, B:293:0x061c, B:294:0x0624, B:296:0x0631, B:298:0x063f, B:303:0x0657, B:396:0x07da, B:398:0x07e0, B:400:0x07e6, B:403:0x07eb, B:404:0x07f6, B:406:0x07fa, B:410:0x081f, B:412:0x0825, B:417:0x0833, B:418:0x083b, B:419:0x083e, B:421:0x0847, B:469:0x0915, B:470:0x091a, B:475:0x0927, B:477:0x092f, B:478:0x0935, B:480:0x0943, B:481:0x095c, B:483:0x0960, B:485:0x0968, B:499:0x0992, B:486:0x096d, B:488:0x0976, B:492:0x097f, B:498:0x098f, B:501:0x099c, B:503:0x09a2, B:507:0x09af, B:516:0x09eb, B:518:0x09f1, B:520:0x09f5, B:547:0x0a8a, B:549:0x0a96, B:551:0x0aa7, B:552:0x0ab0, B:571:0x0afa, B:574:0x0b01, B:576:0x0b05, B:581:0x0b12, B:582:0x0b15, B:583:0x0b18, B:585:0x0b1e, B:587:0x0b27, B:589:0x0b31, B:591:0x0b37, B:593:0x0b3d, B:600:0x0b5f, B:602:0x0b65, B:606:0x0b6e, B:615:0x0b88, B:612:0x0b81, B:614:0x0b85, B:594:0x0b44, B:597:0x0b52, B:598:0x0b5a, B:599:0x0b5b, B:553:0x0ab4, B:555:0x0aba, B:557:0x0abe, B:561:0x0ac7, B:563:0x0ad6, B:565:0x0adc, B:567:0x0ae8, B:568:0x0aed, B:569:0x0af2, B:570:0x0af7, B:523:0x0a03, B:525:0x0a07, B:527:0x0a19, B:529:0x0a24, B:531:0x0a2e, B:535:0x0a37, B:537:0x0a41, B:543:0x0a4c, B:509:0x09b7, B:511:0x09bb, B:512:0x09d5, B:514:0x09db, B:500:0x0995, B:424:0x0850, B:426:0x0854, B:428:0x085a, B:430:0x0860, B:432:0x086a, B:435:0x0870, B:436:0x0873, B:438:0x087c, B:440:0x088e, B:442:0x0897, B:444:0x089f, B:449:0x08ab, B:451:0x08d3, B:453:0x08d9, B:455:0x08de, B:456:0x08e6, B:458:0x08ec, B:459:0x08ef, B:460:0x08f8, B:462:0x08fc, B:464:0x0902, B:465:0x0907, B:468:0x0914, B:306:0x0663, B:316:0x0680, B:321:0x0691, B:325:0x06a3, B:332:0x06c8, B:349:0x06ff, B:351:0x0732, B:353:0x0736, B:357:0x0746, B:359:0x074a, B:363:0x0751, B:365:0x0757, B:367:0x0776, B:370:0x077f, B:372:0x0784, B:374:0x078a, B:375:0x0792, B:377:0x0798, B:355:0x073c, B:379:0x07a5, B:380:0x07b0, B:382:0x07b6, B:384:0x07ba, B:386:0x07bf, B:395:0x07d7, B:392:0x07ce, B:394:0x07d4, B:616:0x0b8d, B:620:0x0b97), top: B:700:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0ad6 A[Catch: IOException -> 0x0028, t91 -> 0x002b, eb -> 0x002e, tw1 -> 0x0031, RuntimeException -> 0x0605, bt1 -> 0x0608, TryCatch #25 {bt1 -> 0x0608, RuntimeException -> 0x0605, blocks: (B:285:0x0601, B:293:0x061c, B:294:0x0624, B:296:0x0631, B:298:0x063f, B:303:0x0657, B:396:0x07da, B:398:0x07e0, B:400:0x07e6, B:403:0x07eb, B:404:0x07f6, B:406:0x07fa, B:410:0x081f, B:412:0x0825, B:417:0x0833, B:418:0x083b, B:419:0x083e, B:421:0x0847, B:469:0x0915, B:470:0x091a, B:475:0x0927, B:477:0x092f, B:478:0x0935, B:480:0x0943, B:481:0x095c, B:483:0x0960, B:485:0x0968, B:499:0x0992, B:486:0x096d, B:488:0x0976, B:492:0x097f, B:498:0x098f, B:501:0x099c, B:503:0x09a2, B:507:0x09af, B:516:0x09eb, B:518:0x09f1, B:520:0x09f5, B:547:0x0a8a, B:549:0x0a96, B:551:0x0aa7, B:552:0x0ab0, B:571:0x0afa, B:574:0x0b01, B:576:0x0b05, B:581:0x0b12, B:582:0x0b15, B:583:0x0b18, B:585:0x0b1e, B:587:0x0b27, B:589:0x0b31, B:591:0x0b37, B:593:0x0b3d, B:600:0x0b5f, B:602:0x0b65, B:606:0x0b6e, B:615:0x0b88, B:612:0x0b81, B:614:0x0b85, B:594:0x0b44, B:597:0x0b52, B:598:0x0b5a, B:599:0x0b5b, B:553:0x0ab4, B:555:0x0aba, B:557:0x0abe, B:561:0x0ac7, B:563:0x0ad6, B:565:0x0adc, B:567:0x0ae8, B:568:0x0aed, B:569:0x0af2, B:570:0x0af7, B:523:0x0a03, B:525:0x0a07, B:527:0x0a19, B:529:0x0a24, B:531:0x0a2e, B:535:0x0a37, B:537:0x0a41, B:543:0x0a4c, B:509:0x09b7, B:511:0x09bb, B:512:0x09d5, B:514:0x09db, B:500:0x0995, B:424:0x0850, B:426:0x0854, B:428:0x085a, B:430:0x0860, B:432:0x086a, B:435:0x0870, B:436:0x0873, B:438:0x087c, B:440:0x088e, B:442:0x0897, B:444:0x089f, B:449:0x08ab, B:451:0x08d3, B:453:0x08d9, B:455:0x08de, B:456:0x08e6, B:458:0x08ec, B:459:0x08ef, B:460:0x08f8, B:462:0x08fc, B:464:0x0902, B:465:0x0907, B:468:0x0914, B:306:0x0663, B:316:0x0680, B:321:0x0691, B:325:0x06a3, B:332:0x06c8, B:349:0x06ff, B:351:0x0732, B:353:0x0736, B:357:0x0746, B:359:0x074a, B:363:0x0751, B:365:0x0757, B:367:0x0776, B:370:0x077f, B:372:0x0784, B:374:0x078a, B:375:0x0792, B:377:0x0798, B:355:0x073c, B:379:0x07a5, B:380:0x07b0, B:382:0x07b6, B:384:0x07ba, B:386:0x07bf, B:395:0x07d7, B:392:0x07ce, B:394:0x07d4, B:616:0x0b8d, B:620:0x0b97), top: B:700:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0b5b A[Catch: IOException -> 0x0028, t91 -> 0x002b, eb -> 0x002e, tw1 -> 0x0031, RuntimeException -> 0x0605, bt1 -> 0x0608, TryCatch #25 {bt1 -> 0x0608, RuntimeException -> 0x0605, blocks: (B:285:0x0601, B:293:0x061c, B:294:0x0624, B:296:0x0631, B:298:0x063f, B:303:0x0657, B:396:0x07da, B:398:0x07e0, B:400:0x07e6, B:403:0x07eb, B:404:0x07f6, B:406:0x07fa, B:410:0x081f, B:412:0x0825, B:417:0x0833, B:418:0x083b, B:419:0x083e, B:421:0x0847, B:469:0x0915, B:470:0x091a, B:475:0x0927, B:477:0x092f, B:478:0x0935, B:480:0x0943, B:481:0x095c, B:483:0x0960, B:485:0x0968, B:499:0x0992, B:486:0x096d, B:488:0x0976, B:492:0x097f, B:498:0x098f, B:501:0x099c, B:503:0x09a2, B:507:0x09af, B:516:0x09eb, B:518:0x09f1, B:520:0x09f5, B:547:0x0a8a, B:549:0x0a96, B:551:0x0aa7, B:552:0x0ab0, B:571:0x0afa, B:574:0x0b01, B:576:0x0b05, B:581:0x0b12, B:582:0x0b15, B:583:0x0b18, B:585:0x0b1e, B:587:0x0b27, B:589:0x0b31, B:591:0x0b37, B:593:0x0b3d, B:600:0x0b5f, B:602:0x0b65, B:606:0x0b6e, B:615:0x0b88, B:612:0x0b81, B:614:0x0b85, B:594:0x0b44, B:597:0x0b52, B:598:0x0b5a, B:599:0x0b5b, B:553:0x0ab4, B:555:0x0aba, B:557:0x0abe, B:561:0x0ac7, B:563:0x0ad6, B:565:0x0adc, B:567:0x0ae8, B:568:0x0aed, B:569:0x0af2, B:570:0x0af7, B:523:0x0a03, B:525:0x0a07, B:527:0x0a19, B:529:0x0a24, B:531:0x0a2e, B:535:0x0a37, B:537:0x0a41, B:543:0x0a4c, B:509:0x09b7, B:511:0x09bb, B:512:0x09d5, B:514:0x09db, B:500:0x0995, B:424:0x0850, B:426:0x0854, B:428:0x085a, B:430:0x0860, B:432:0x086a, B:435:0x0870, B:436:0x0873, B:438:0x087c, B:440:0x088e, B:442:0x0897, B:444:0x089f, B:449:0x08ab, B:451:0x08d3, B:453:0x08d9, B:455:0x08de, B:456:0x08e6, B:458:0x08ec, B:459:0x08ef, B:460:0x08f8, B:462:0x08fc, B:464:0x0902, B:465:0x0907, B:468:0x0914, B:306:0x0663, B:316:0x0680, B:321:0x0691, B:325:0x06a3, B:332:0x06c8, B:349:0x06ff, B:351:0x0732, B:353:0x0736, B:357:0x0746, B:359:0x074a, B:363:0x0751, B:365:0x0757, B:367:0x0776, B:370:0x077f, B:372:0x0784, B:374:0x078a, B:375:0x0792, B:377:0x0798, B:355:0x073c, B:379:0x07a5, B:380:0x07b0, B:382:0x07b6, B:384:0x07ba, B:386:0x07bf, B:395:0x07d7, B:392:0x07ce, B:394:0x07d4, B:616:0x0b8d, B:620:0x0b97), top: B:700:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0bbb  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0c21  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0c90  */
    /* JADX WARN: Type inference failed for: r0v106, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v101, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v66, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut1.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public final void i(gy1 gy1Var) {
        this.i.b(8, gy1Var).a();
    }

    public final void j() {
        au1 au1Var = (au1) this.f11091s.f4330l;
        if (au1Var == null) {
            return;
        }
        g gVar = au1Var.f3431o;
        for (int i = 0; i < 2; i++) {
            if (gVar.b(i)) {
                this.f11072b[i].Q();
            }
        }
    }

    public final void k() {
        gn0 gn0Var = this.f11087o;
        gn0Var.f5874c = false;
        wu1 wu1Var = (wu1) gn0Var.f5875d;
        if (wu1Var.f11900b) {
            wu1Var.a(wu1Var.k());
            wu1Var.f11900b = false;
        }
        for (int i = 0; i < 2; i++) {
            su1 su1Var = this.f11072b[i];
            gx1 gx1Var = (gx1) su1Var.f10399e;
            if (su1.y(gx1Var)) {
                su1.A(gx1Var);
            }
            gx1 gx1Var2 = (gx1) su1Var.f10400f;
            if (gx1Var2 != null && gx1Var2.i != 0) {
                su1.A(gx1Var2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut1.l():void");
    }

    public final void m(int i, boolean z5) {
        boolean[] zArr = this.f11076d;
        if (zArr[i] != z5) {
            zArr[i] = z5;
            this.f11096x.e(new pf(this, i, z5));
        }
    }

    public final long n(ci ciVar, Object obj, long j10) {
        int i = ciVar.o(obj, this.f11085m).f3786c;
        nh nhVar = this.f11084l;
        ciVar.b(i, nhVar, 0L);
        if (nhVar.f8301d == -9223372036854775807L || !nhVar.b() || !nhVar.f8304g) {
            return -9223372036854775807L;
        }
        long j11 = nhVar.f8302e;
        String str = cq0.f4293a;
        return cq0.s((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - nhVar.f8301d) - j10;
    }

    public final boolean o(ci ciVar, hy1 hy1Var) {
        if (hy1Var.b() || ciVar.g()) {
            return false;
        }
        int i = ciVar.o(hy1Var.f6299a, this.f11085m).f3786c;
        nh nhVar = this.f11084l;
        ciVar.b(i, nhVar, 0L);
        return nhVar.b() && nhVar.f8304g && nhVar.f8301d != -9223372036854775807L;
    }

    public final void p(long j10) {
        boolean z5 = this.C;
        long j11 = f11070e0;
        if (z5) {
            this.B.getClass();
            jMin = this.G.f7636e != 3 ? j11 : 1000L;
            for (int i = 0; i < 2; i++) {
                su1 su1Var = this.f11072b[i];
                long j12 = this.T;
                long j13 = this.U;
                gx1 gx1Var = (gx1) su1Var.f10399e;
                long jQ = su1.y(gx1Var) ? gx1Var.Q(j12, j13) : Long.MAX_VALUE;
                gx1 gx1Var2 = (gx1) su1Var.f10400f;
                if (gx1Var2 != null && gx1Var2.i != 0) {
                    jQ = Math.min(jQ, gx1Var2.Q(j12, j13));
                }
                jMin = Math.min(jMin, cq0.r(jQ));
            }
            if (this.G.i()) {
                au1 au1Var = (au1) this.f11091s.f4330l;
                if ((au1Var != null ? au1Var.f3429m : null) != null) {
                    if (this.T + (cq0.s(jMin) * this.G.f7645o.f9010a) >= r0.a()) {
                        jMin = Math.min(jMin, j11);
                    }
                }
            }
        } else if (this.G.f7636e != 3 || T()) {
            jMin = j11;
        }
        this.i.f7588a.sendEmptyMessageAtTime(2, jMin + j10);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    public final void q(tt1 tt1Var) throws Throwable {
        long jLongValue;
        long j10;
        hy1 hy1VarX;
        boolean z5;
        int i;
        long j11;
        boolean z10;
        long j12;
        long j13;
        ci ciVar;
        long j14;
        long j15;
        boolean z11;
        long j16;
        long jC;
        lu1 lu1Var;
        int i10;
        if (this.D) {
            if (this.E != null) {
                this.F++;
                this.H.f(1);
            }
            this.E = tt1Var;
            return;
        }
        this.H.f(1);
        ci ciVar2 = this.G.f7632a;
        int i11 = this.O;
        boolean z12 = this.P;
        nh nhVar = this.f11084l;
        bh bhVar = this.f11085m;
        Pair pairZ = z(ciVar2, tt1Var, i11, z12, nhVar, bhVar);
        long jMax = -9223372036854775807L;
        if (pairZ == null) {
            Pair pairW = w(this.G.f7632a);
            hy1 hy1Var = (hy1) pairW.first;
            jLongValue = ((Long) pairW.second).longValue();
            z5 = !this.G.f7632a.g();
            hy1VarX = hy1Var;
            j10 = -9223372036854775807L;
        } else {
            Object obj = pairZ.first;
            jLongValue = ((Long) pairZ.second).longValue();
            long j17 = tt1Var.f10717c;
            if (j17 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = -9223372036854775807L;
                jMax = jLongValue;
            }
            hy1VarX = this.f11091s.X(this.G.f7632a, obj);
            if (hy1VarX.b()) {
                this.G.f7632a.o(hy1VarX.f6299a, bhVar);
                a aVarA = bhVar.f3789f.a(-1);
                int i12 = 0;
                while (true) {
                    int[] iArr = aVarA.f2663d;
                    if (i12 >= iArr.length || (i = iArr[i12]) == 0 || i == 1) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 == -1) {
                    bhVar.f3789f.getClass();
                }
                bhVar.f3789f.a(-1).getClass();
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j17 != -9223372036854775807L) {
                z5 = false;
            }
            z5 = true;
        }
        try {
            if (this.G.f7632a.g()) {
                this.S = tt1Var;
            } else if (pairZ == null) {
                if (this.G.f7636e != 1) {
                    c(4);
                }
                v(false, true, false, true);
            } else {
                if (hy1VarX.equals(this.G.f7633b)) {
                    au1 au1Var = (au1) this.f11091s.f4330l;
                    if (au1Var == null || !au1Var.f3422e || jLongValue == 0) {
                        jC = jLongValue;
                    } else {
                        ?? r42 = au1Var.f3418a;
                        long j18 = nhVar.f8306j;
                        if (this.C && j18 != j10) {
                            this.B.getClass();
                        }
                        jC = r42.c(jLongValue, this.A);
                    }
                    long j19 = jC;
                    if (cq0.r(jC) == cq0.r(this.G.f7648r) && ((i10 = (lu1Var = this.G).f7636e) == 2 || i10 == 3)) {
                        jLongValue = lu1Var.f7648r;
                    } else {
                        j13 = j19;
                    }
                } else {
                    j13 = jLongValue;
                }
                if (this.C) {
                    su1[] su1VarArr = this.f11072b;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= 2) {
                            break;
                        }
                        su1 su1Var = su1VarArr[i13];
                        if (su1Var.t() && ((gx1) su1Var.f10399e).f5933c == 2) {
                            this.D = true;
                            break;
                        }
                        i13++;
                    }
                }
                boolean z13 = this.G.f7636e == 4;
                cu1 cu1Var = this.f11091s;
                long jR = r(hy1VarX, j13, ((au1) cu1Var.f4330l) != ((au1) cu1Var.f4331m), z13);
                boolean z14 = z5 | (jLongValue != jR);
                try {
                    lu1 lu1Var2 = this.G;
                    hy1 hy1Var2 = hy1VarX;
                    try {
                        ciVar = lu1Var2.f7632a;
                        j14 = jMax;
                    } catch (Throwable th2) {
                        th = th2;
                        hy1VarX = hy1Var2;
                        j11 = jMax;
                        z10 = z14;
                        j12 = jR;
                        this.G = N(hy1VarX, j12, j11, j12, z10, 2);
                        throw th;
                    }
                    try {
                        G(ciVar, hy1Var2, ciVar, lu1Var2.f7633b, j14, true);
                        hy1VarX = hy1Var2;
                        j15 = j14;
                        z11 = z14;
                        j16 = jR;
                        this.G = N(hy1VarX, j16, j15, j16, z11, 2);
                    } catch (Throwable th3) {
                        th = th3;
                        hy1VarX = hy1Var2;
                        j11 = j14;
                        z10 = z14;
                        j12 = jR;
                        this.G = N(hy1VarX, j12, j11, j12, z10, 2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            j15 = jMax;
            j16 = jLongValue;
            z11 = z5;
            this.G = N(hy1VarX, j16, j15, j16, z11, 2);
        } catch (Throwable th5) {
            th = th5;
            j11 = jMax;
            z10 = z5;
            j12 = jLongValue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Type inference failed for: r10v10, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19, types: [com.google.android.gms.internal.ads.gy1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r(com.google.android.gms.internal.ads.hy1 r10, long r11, boolean r13, boolean r14) throws com.google.android.gms.internal.ads.bt1 {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut1.r(com.google.android.gms.internal.ads.hy1, long, boolean, boolean):long");
    }

    public final void s(long j10, boolean z5) {
        cu1 cu1Var = this.f11091s;
        au1 au1Var = (au1) cu1Var.f4330l;
        long j11 = j10 + (au1Var == null ? 1000000000000L : au1Var.f3432p);
        this.T = j11;
        ((wu1) this.f11087o.f5875d).a(j11);
        for (int i = 0; i < 2; i++) {
            su1 su1Var = this.f11072b[i];
            long j12 = this.T;
            gx1 gx1VarZ = su1Var.z(au1Var);
            if (gx1VarZ != null) {
                gx1VarZ.L(j12, false, z5);
            }
        }
        for (au1 au1Var2 = (au1) cu1Var.f4330l; au1Var2 != null; au1Var2 = au1Var2.f3429m) {
            for (d dVar : (d[]) au1Var2.f3431o.f5554d) {
            }
        }
    }

    public final void t() {
        for (int i = 0; i < 2; i++) {
            su1 su1Var = this.f11072b[i];
            tu1 tu1Var = this.C ? this.B : null;
            ((gx1) su1Var.f10399e).c(18, tu1Var);
            gx1 gx1Var = (gx1) su1Var.f10400f;
            if (gx1Var != null) {
                gx1Var.c(18, tu1Var);
            }
        }
    }

    public final void u(boolean z5, boolean z10) {
        v(z5 || !this.Q, false, true, false);
        this.H.f(z10 ? 1 : 0);
        this.f11080g.f(this.f11094v);
        this.f11098z.f(1, this.G.f7642l);
        c(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb A[PHI: r2 r7 r9
      0x00bb: PHI (r2v2 com.google.android.gms.internal.ads.hy1) = (r2v1 com.google.android.gms.internal.ads.hy1), (r2v8 com.google.android.gms.internal.ads.hy1) binds: [B:33:0x0091, B:35:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r7v4 long) = (r7v3 long), (r7v18 long) binds: [B:33:0x0091, B:35:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r9v2 long) = (r9v1 long), (r9v10 long) binds: [B:33:0x0091, B:35:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut1.v(boolean, boolean, boolean, boolean):void");
    }

    public final Pair w(ci ciVar) {
        int i;
        long j10 = 0;
        if (ciVar.g()) {
            return Pair.create(lu1.f7631t, 0L);
        }
        int iK = ciVar.k(this.P);
        nh nhVar = this.f11084l;
        bh bhVar = this.f11085m;
        Pair pairM = ciVar.m(nhVar, bhVar, iK, -9223372036854775807L);
        hy1 hy1VarX = this.f11091s.X(ciVar, pairM.first);
        long jLongValue = ((Long) pairM.second).longValue();
        if (hy1VarX.b()) {
            ciVar.o(hy1VarX.f6299a, bhVar);
            a aVarA = bhVar.f3789f.a(-1);
            int i10 = 0;
            while (true) {
                int[] iArr = aVarA.f2663d;
                if (i10 >= iArr.length || (i = iArr[i10]) == 0 || i == 1) {
                    break;
                }
                i10++;
            }
            if (-1 == i10) {
                bhVar.f3789f.getClass();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(hy1VarX, Long.valueOf(j10));
    }

    public final void x(ci ciVar, ci ciVar2) {
        if (ciVar.g() && ciVar2.g()) {
            return;
        }
        ArrayList arrayList = this.f11088p;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void y(boolean z5, boolean z10) {
        this.L = z5;
        long jElapsedRealtime = -9223372036854775807L;
        if (z5 && !z10) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.M = jElapsedRealtime;
    }
}
