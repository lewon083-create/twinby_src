package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nw1 {
    public static final AtomicInteger X = new AtomicInteger();
    public long A;
    public int B;
    public boolean C;
    public boolean D;
    public long E;
    public float F;
    public ByteBuffer G;
    public int H;
    public ByteBuffer I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public ne0 P;
    public AudioDeviceInfo Q;
    public int R;
    public long S;
    public long T;
    public long U;
    public Handler V;
    public final l91 W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gw1 f8463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sw1 f8464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f40 f8465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rw1 f8466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r51 f8467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f8468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public iw1 f8469h;
    public final mw1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mw1 f8470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fv1 f8471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public pp0 f8472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public rh0 f8473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public rh0 f8474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a00 f8475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.c f8476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public kw1 f8477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ew1 f8478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s50 f8479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lw1 f8480t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public lw1 f8481u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public pc f8482v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f8484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f8485y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f8486z;

    public nw1(jw1 jw1Var) {
        int deviceId;
        Context context = (Context) jw1Var.f6954a;
        this.f8462a = context == null ? null : context.getApplicationContext();
        this.f8479s = s50.f10178b;
        this.W = (l91) jw1Var.f6959f;
        this.f8476p = (com.google.android.gms.internal.consent_sdk.c) jw1Var.f6958e;
        gw1 gw1Var = new gw1();
        this.f8463b = gw1Var;
        sw1 sw1Var = new sw1();
        sw1Var.f10421m = cq0.f4294b;
        this.f8464c = sw1Var;
        this.f8465d = new f40();
        this.f8466e = new rw1();
        this.f8467f = x41.r(sw1Var, gw1Var);
        this.F = 1.0f;
        this.N = 0;
        this.P = new ne0();
        pc pcVar = pc.f9009d;
        this.f8481u = new lw1(pcVar, 0L, 0L);
        this.f8482v = pcVar;
        this.f8483w = false;
        this.f8468g = new ArrayDeque();
        this.i = new mw1();
        this.f8470j = new mw1();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.R = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r9, java.nio.ByteBuffer r10) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nw1.c(int, java.nio.ByteBuffer):int");
    }

    public final void a() {
        if (k()) {
            this.f8484x = 0L;
            this.f8485y = 0L;
            this.f8486z = 0L;
            this.A = 0L;
            this.B = 0;
            this.f8481u = new lw1(this.f8482v, 0L, 0L);
            this.E = 0L;
            this.f8480t = null;
            this.f8468g.clear();
            this.G = null;
            this.H = 0;
            this.I = null;
            this.K = false;
            this.J = false;
            this.L = false;
            this.f8464c.f10423o = 0L;
            a00 a00Var = (a00) this.f8474n.f9942g;
            this.f8475o = a00Var;
            a00Var.b(y00.f12433b);
            this.f8469h = null;
            rh0 rh0Var = this.f8473m;
            if (rh0Var != null) {
                this.f8474n = rh0Var;
                this.f8473m = null;
            }
            X.incrementAndGet();
            ew1 ew1Var = this.f8478r;
            if (ew1Var.f5112d.f5468d.getPlayState() == 3) {
                ew1Var.f5109a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && ew1Var.b()) {
                l91 l91Var = ew1Var.f5115g;
                l91Var.getClass();
                ((ew1) l91Var.f7467e).f5109a.unregisterStreamEventCallback((dw1) l91Var.f7466d);
                ((Handler) l91Var.f7465c).removeCallbacksAndMessages(null);
            }
            na1 na1Var = ew1Var.f5111c;
            if (na1Var != null) {
                aw1 aw1Var = (aw1) na1Var.f8261e;
                aw1Var.getClass();
                ((AudioTrack) na1Var.f8259c).removeOnRoutingChangedListener(aw1Var);
                na1Var.f8261e = null;
                ew1Var.f5111c = null;
            }
            AudioTrack audioTrack = ew1Var.f5109a;
            yf0 yf0Var = ew1Var.f5116h;
            Handler handlerN = cq0.n();
            synchronized (ew1.f5106o) {
                try {
                    if (ew1.f5107p == null) {
                        ew1.f5107p = Executors.newSingleThreadScheduledExecutor(new lp0());
                    }
                    ew1.f5108q++;
                    ew1.f5107p.schedule(new d1(audioTrack, handlerN, yf0Var, 15), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f8478r = null;
        }
        mw1 mw1Var = this.f8470j;
        mw1Var.f8029a = null;
        mw1Var.f8030b = -9223372036854775807L;
        mw1Var.f8031c = -9223372036854775807L;
        mw1 mw1Var2 = this.i;
        mw1Var2.f8029a = null;
        mw1Var2.f8030b = -9223372036854775807L;
        mw1Var2.f8031c = -9223372036854775807L;
        this.T = 0L;
        this.U = 0L;
        Handler handler = this.V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void b() {
        a();
        r51 r51Var = this.f8467f;
        int i = r51Var.f9715e;
        for (int i10 = 0; i10 < i; i10++) {
            ((t10) r51Var.get(i10)).d();
        }
        this.f8465d.d();
        this.f8466e.d();
        a00 a00Var = this.f8475o;
        if (a00Var != null) {
            int i11 = 0;
            while (true) {
                x41 x41Var = a00Var.f2669a;
                if (i11 >= x41Var.size()) {
                    break;
                }
                t10 t10Var = (t10) x41Var.get(i11);
                y00 y00Var = y00.f12433b;
                t10Var.f();
                t10Var.d();
                i11++;
            }
            a00Var.f2671c = new ByteBuffer[0];
            l00 l00Var = l00.f7359e;
            a00Var.f2672d = false;
        }
        this.M = false;
    }

    public final ew1 d(sv1 sv1Var) throws wv1 {
        try {
            return this.f8476p.w(sv1Var);
        } catch (rv1 e3) {
            int i = sv1Var.f10410b;
            int i10 = sv1Var.f10411c;
            int i11 = sv1Var.f10409a;
            int i12 = sv1Var.f10412d;
            String strValueOf = String.valueOf((jx1) this.f8474n.f9939d);
            int length = String.valueOf(i).length();
            int length2 = String.valueOf(i10).length();
            int length3 = String.valueOf(i11).length();
            StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i12).length() + 2 + strValueOf.length());
            om1.u(sb2, "AudioTrack init failed 0 Config(", i, ", ", i10);
            om1.u(sb2, ", ", i11, ", ", i12);
            wv1 wv1Var = new wv1(t.z.g(sb2, ") ", strValueOf, ""), e3);
            pp0 pp0Var = this.f8472l;
            if (pp0Var == null) {
                throw wv1Var;
            }
            pp0Var.e(wv1Var);
            throw wv1Var;
        }
    }

    public final void e(long j10) throws Exception {
        ByteBuffer byteBuffer;
        h(j10);
        if (this.I != null) {
            return;
        }
        if (!this.f8475o.c()) {
            ByteBuffer byteBuffer2 = this.G;
            if (byteBuffer2 != null) {
                g(byteBuffer2);
                h(j10);
                return;
            }
            return;
        }
        while (!this.f8475o.d()) {
            do {
                a00 a00Var = this.f8475o;
                if (a00Var.c()) {
                    ByteBuffer byteBuffer3 = a00Var.f2671c[a00Var.f()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        a00Var.e(t10.f10463a);
                        byteBuffer = a00Var.f2671c[a00Var.f()];
                    }
                } else {
                    byteBuffer = t10.f10463a;
                }
                if (byteBuffer.hasRemaining()) {
                    g(byteBuffer);
                    h(j10);
                } else {
                    ByteBuffer byteBuffer4 = this.G;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    a00 a00Var2 = this.f8475o;
                    ByteBuffer byteBuffer5 = this.G;
                    if (a00Var2.c() && !a00Var2.f2672d) {
                        a00Var2.e(byteBuffer5);
                    }
                }
            } while (this.I == null);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() throws java.lang.Exception {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.a00 r0 = r6.f8475o
            boolean r0 = r0.c()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.h(r1)
            java.nio.ByteBuffer r0 = r6.I
            if (r0 != 0) goto L45
            goto L44
        L14:
            com.google.android.gms.internal.ads.a00 r0 = r6.f8475o
            boolean r5 = r0.c()
            if (r5 == 0) goto L2e
            boolean r5 = r0.f2672d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.f2672d = r4
            java.util.ArrayList r0 = r0.f2670b
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.t10 r0 = (com.google.android.gms.internal.ads.t10) r0
            r0.i()
        L2e:
            r6.e(r1)
            com.google.android.gms.internal.ads.a00 r0 = r6.f8475o
            boolean r0 = r0.d()
            if (r0 == 0) goto L45
            java.nio.ByteBuffer r0 = r6.I
            if (r0 == 0) goto L44
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L44
            goto L45
        L44:
            return r4
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nw1.f():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nw1.g(java.nio.ByteBuffer):void");
    }

    public final void h(long j10) throws Exception {
        if (this.I == null) {
            return;
        }
        mw1 mw1Var = this.f8470j;
        if (mw1Var.f8029a != null && (X.get() > 0 || SystemClock.elapsedRealtime() < mw1Var.f8031c)) {
            return;
        }
        int iRemaining = this.I.remaining();
        try {
            boolean zA = this.f8478r.a(this.H, this.I);
            this.S = SystemClock.elapsedRealtime();
            mw1Var.f8029a = null;
            mw1Var.f8030b = -9223372036854775807L;
            mw1Var.f8031c = -9223372036854775807L;
            this.f8478r.b();
            if (this.f8474n.c()) {
                this.f8486z += (long) (iRemaining - this.I.remaining());
            }
            if (zA) {
                if (!this.f8474n.c()) {
                    ix.k0(this.I == this.G);
                    this.A = (((long) this.B) * ((long) this.H)) + this.A;
                }
                this.I = null;
            }
        } catch (mv1 e3) {
            boolean z5 = e3.f8028c;
            if (z5) {
                if (l() > 0) {
                    z = true;
                } else if (this.f8478r.b()) {
                    this.f8474n.getClass();
                    z = true;
                }
            }
            xv1 xv1Var = new xv1(e3.f8027b, (jx1) this.f8474n.f9939d, z);
            pp0 pp0Var = this.f8472l;
            if (pp0Var != null) {
                pp0Var.e(xv1Var);
            }
            if (z5) {
                throw xv1Var;
            }
            mw1Var.b(xv1Var);
        }
    }

    public final void i() {
        if (this.f8474n != null) {
            rh0 rh0Var = this.f8473m;
            if (rh0Var != null) {
                this.f8474n = rh0Var;
                this.f8473m = null;
            }
            try {
                sv1 sv1VarS = this.f8476p.s(m((jx1) this.f8474n.f9940e));
                rh0 rh0Var2 = this.f8474n;
                this.f8474n = new rh0((jx1) rh0Var2.f9939d, (jx1) rh0Var2.f9940e, rh0Var2.f9937b, rh0Var2.f9938c, sv1VarS, (a00) rh0Var2.f9942g);
            } catch (nv1 e3) {
                throw new IllegalStateException(new vv1(e3, (jx1) this.f8474n.f9939d));
            }
        }
        a();
    }

    public final void j(long j10) {
        pc pcVar;
        boolean zC = this.f8474n.c();
        boolean z5 = false;
        l91 l91Var = this.W;
        if (zC) {
            int i = ((jx1) this.f8474n.f9939d).G;
            pcVar = this.f8482v;
            w30 w30Var = (w30) l91Var.f7467e;
            float f10 = pcVar.f9010a;
            w30Var.getClass();
            ix.o(f10 > 0.0f);
            if (w30Var.f11614c != f10) {
                w30Var.f11614c = f10;
                w30Var.i = true;
            }
            float f11 = pcVar.f9011b;
            ix.o(f11 > 0.0f);
            if (w30Var.f11615d != f11) {
                w30Var.f11615d = f11;
                w30Var.i = true;
            }
        } else {
            pcVar = pc.f9009d;
        }
        pc pcVar2 = pcVar;
        this.f8482v = pcVar2;
        if (this.f8474n.c()) {
            int i10 = ((jx1) this.f8474n.f9939d).G;
            z5 = this.f8483w;
            ((qw1) l91Var.f7466d).f9611j = z5;
        }
        this.f8483w = z5;
        this.f8468g.add(new lw1(pcVar2, Math.max(0L, j10), cq0.t(((sv1) this.f8474n.f9941f).f10410b, l())));
        a00 a00Var = (a00) this.f8474n.f9942g;
        this.f8475o = a00Var;
        a00Var.b(y00.f12433b);
        pp0 pp0Var = this.f8472l;
        if (pp0Var != null) {
            boolean z10 = this.f8483w;
            g1 g1Var = ((pw1) pp0Var.f9149c).B0;
            Handler handler = g1Var.f5590a;
            if (handler != null) {
                handler.post(new aa.h0(3, g1Var, z10));
            }
        }
    }

    public final boolean k() {
        return this.f8478r != null;
    }

    public final long l() {
        if (!this.f8474n.c()) {
            return this.A;
        }
        long j10 = this.f8486z;
        long j11 = this.f8474n.f9938c;
        String str = cq0.f4293a;
        return ((j10 + j11) - 1) / j11;
    }

    public final ov1 m(jx1 jx1Var) {
        ov1 ov1Var = new ov1(jx1Var);
        ov1Var.f8816b = this.f8479s;
        ov1Var.f8817c = this.Q;
        ov1Var.f8818d = this.N;
        ov1Var.f8820f = -1;
        ov1Var.f8819e = this.R;
        return new ov1(ov1Var);
    }

    public final void n() {
        if (this.K) {
            return;
        }
        this.K = true;
        if (this.f8478r.b()) {
            this.L = false;
        }
        ew1 ew1Var = this.f8478r;
        if (ew1Var.i) {
            return;
        }
        ew1Var.i = true;
        fw1 fw1Var = ew1Var.f5112d;
        long jC = ew1Var.c();
        fw1Var.f5486w = fw1Var.d();
        fw1Var.f5466b.getClass();
        fw1Var.f5484u = cq0.s(SystemClock.elapsedRealtime());
        fw1Var.f5487x = jC;
        ew1Var.f5109a.stop();
    }

    public final void o(jx1 jx1Var, int[] iArr) throws vv1 {
        a00 a00Var;
        int iD;
        jx1 jx1Var2;
        int i;
        kw1 kw1Var = this.f8477q;
        com.google.android.gms.internal.consent_sdk.c cVar = this.f8476p;
        if (kw1Var == null && this.f8462a != null) {
            kw1 kw1Var2 = new kw1(this);
            this.f8477q = kw1Var2;
            cVar.z();
            if (((yf0) cVar.f13339c) == null) {
                yf0 yf0Var = new yf0(Thread.currentThread(), 0);
                cVar.f13339c = yf0Var;
                yf0Var.f12609b = false;
            }
            ((yf0) cVar.f13339c).g(kw1Var2);
        }
        if ("audio/raw".equals(jx1Var.f6975m)) {
            int i10 = jx1Var.G;
            ix.o(cq0.a(i10));
            int i11 = jx1Var.E;
            int iD2 = cq0.d(i10) * i11;
            u41 u41Var = new u41(4);
            u41Var.b(this.f8467f);
            u41Var.a(this.f8465d);
            t10[] t10VarArr = (t10[]) this.W.f7465c;
            vv.j(2, t10VarArr);
            u41Var.e(2);
            System.arraycopy(t10VarArr, 0, u41Var.f10174a, u41Var.f10175b, 2);
            u41Var.f10175b += 2;
            a00Var = new a00(u41Var.f());
            if (a00Var.equals(this.f8475o)) {
                a00Var = this.f8475o;
            }
            int i12 = jx1Var.H;
            int i13 = jx1Var.I;
            sw1 sw1Var = this.f8464c;
            sw1Var.i = i12;
            sw1Var.f10418j = i13;
            this.f8463b.i = iArr;
            try {
                l00 l00VarA = a00Var.a(new l00(jx1Var.F, i11, i10));
                ow1 ow1Var = new ow1(jx1Var);
                int i14 = l00VarA.f7362c;
                ow1Var.F = i14;
                ow1Var.E = l00VarA.f7360a;
                int i15 = l00VarA.f7361b;
                ow1Var.D = i15;
                jx1Var2 = new jx1(ow1Var);
                iD = cq0.d(i14) * i15;
                i = iD2;
            } catch (i10 e3) {
                throw new vv1(e3, jx1Var);
            }
        } else {
            a00Var = new a00(r51.f9713f);
            iD = -1;
            jx1Var2 = jx1Var;
            i = -1;
        }
        ov1 ov1VarM = m(jx1Var2);
        jx1 jx1Var3 = (jx1) ov1VarM.f8815a;
        try {
            sv1 sv1VarS = cVar.s(ov1VarM);
            if (sv1VarS.f10409a == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 36);
                sb2.append("Invalid output encoding (isOffload=false)");
                throw new vv1(sb2.toString(), jx1Var3);
            }
            if (sv1VarS.f10411c == 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(false).length() + 42);
                sb3.append("Invalid output channel config (isOffload=false)");
                throw new vv1(sb3.toString(), jx1Var3);
            }
            rh0 rh0Var = new rh0(jx1Var, jx1Var2, i, iD, sv1VarS, a00Var);
            if (k()) {
                this.f8473m = rh0Var;
            } else {
                this.f8474n = rh0Var;
            }
        } catch (nv1 e7) {
            throw new vv1(e7, jx1Var);
        }
    }

    public final void p() {
        this.M = true;
        if (k()) {
            ew1 ew1Var = this.f8478r;
            fw1 fw1Var = ew1Var.f5112d;
            if (fw1Var.f5484u != -9223372036854775807L) {
                fw1Var.f5466b.getClass();
                fw1Var.f5484u = cq0.s(SystemClock.elapsedRealtime());
            }
            fw1Var.f5473j = cq0.t(fw1Var.f5469e, fw1Var.d());
            fw1Var.f5472h.b(0);
            if (!ew1Var.i || ew1Var.b()) {
                ew1Var.f5109a.play();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0280, code lost:
    
        if (r0 != 0) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(long r22, java.nio.ByteBuffer r24, int r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nw1.q(long, java.nio.ByteBuffer, int):boolean");
    }

    public final boolean r() {
        if (!k()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.f8478r.b() && this.L) {
            return false;
        }
        long jL = l();
        long jA = this.f8478r.f5112d.a();
        ew1 ew1Var = this.f8478r;
        ew1Var.getClass();
        return jL > cq0.u(jA, (long) ew1Var.f5109a.getSampleRate(), 1000000L, RoundingMode.UP);
    }
}
