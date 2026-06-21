package u3;

import ad.b1;
import ad.g0;
import ad.h0;
import ad.j0;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.dw1;
import com.google.android.gms.internal.ads.jw1;
import com.google.android.gms.internal.ads.mw1;
import com.google.android.gms.internal.ads.rh0;
import com.google.android.gms.internal.ads.yf0;
import com.google.android.gms.internal.measurement.h5;
import j3.f0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k6.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final AtomicInteger f34214c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public j3.e S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34215a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f34216a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb.e f34217b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Handler f34218b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f34219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f34220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k3.o f34221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f34222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1 f34223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f34224h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f34225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mw1 f34226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mw1 f34227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t3.j f34228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t0 f34229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public rh0 f34230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public rh0 f34231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k3.g f34232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f34233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v f34234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r f34235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j3.d f34236u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x f34237v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x f34238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f0 f34239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f34240y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f34241z;

    public y(jw1 jw1Var) {
        int deviceId;
        Context context = (Context) jw1Var.f6954a;
        this.f34215a = context == null ? null : context.getApplicationContext();
        this.f34236u = j3.d.f26224c;
        this.f34217b = (bb.e) jw1Var.f6957d;
        this.i = 0;
        this.f34233r = (s) jw1Var.f6959f;
        u uVar = new u();
        this.f34219c = uVar;
        e0 e0Var = new e0();
        e0Var.f34103m = m3.z.f28609b;
        this.f34220d = e0Var;
        this.f34221e = new k3.o();
        this.f34222f = new d0();
        this.f34223g = j0.x(e0Var, uVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new j3.e();
        f0 f0Var = f0.f26236d;
        this.f34238w = new x(f0Var, 0L, 0L);
        this.f34239x = f0Var;
        this.f34240y = false;
        this.f34224h = new ArrayDeque();
        this.f34226k = new mw1();
        this.f34227l = new mw1();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.U = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int i(int r10, java.nio.ByteBuffer r11) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.y.i(int, java.nio.ByteBuffer):int");
    }

    public final void a(long j10) {
        f0 f0Var;
        boolean zV = v();
        boolean z5 = false;
        bb.e eVar = this.f34217b;
        if (zV) {
            f0Var = f0.f26236d;
        } else {
            if (this.V || !rh0.b(this.f34231p)) {
                f0Var = f0.f26236d;
            } else {
                int i = ((j3.o) this.f34231p.f9939d).H;
                f0Var = this.f34239x;
                k3.n nVar = (k3.n) eVar.f2021e;
                float f10 = f0Var.f26237a;
                nVar.getClass();
                h5.h(f10 > 0.0f);
                if (nVar.f26875c != f10) {
                    nVar.f26875c = f10;
                    nVar.i = true;
                }
                float f11 = f0Var.f26238b;
                h5.h(f11 > 0.0f);
                if (nVar.f26876d != f11) {
                    nVar.f26876d = f11;
                    nVar.i = true;
                }
            }
            this.f34239x = f0Var;
        }
        f0 f0Var2 = f0Var;
        if (!this.V && rh0.b(this.f34231p)) {
            int i10 = ((j3.o) this.f34231p.f9939d).H;
            z5 = this.f34240y;
            ((c0) eVar.f2020d).f34090o = z5;
        }
        this.f34240y = z5;
        this.f34224h.add(new x(f0Var2, Math.max(0L, j10), m3.z.S(((j) this.f34231p.f9941f).f34129b, j())));
        k3.g gVar = (k3.g) this.f34231p.f9942g;
        this.f34232q = gVar;
        gVar.a();
        t0 t0Var = this.f34229n;
        if (t0Var != null) {
            boolean z10 = this.f34240y;
            o4.v vVar = ((a0) t0Var.f27180c).K0;
            Handler handler = vVar.f29700a;
            if (handler != null) {
                handler.post(new a1.b(5, vVar, z10));
            }
        }
    }

    public final r b(j jVar) throws m {
        try {
            return this.f34233r.a(jVar);
        } catch (h e3) {
            m mVar = new m(jVar.f34129b, jVar.f34130c, jVar.f34128a, jVar.f34133f, (j3.o) this.f34231p.f9939d, jVar.f34132e, e3);
            t0 t0Var = this.f34229n;
            if (t0Var == null) {
                throw mVar;
            }
            t0Var.m(mVar);
            throw mVar;
        }
    }

    public final void c(j3.o oVar, int[] iArr) throws l {
        k3.g gVar;
        j3.o oVar2;
        int i;
        int iS;
        if (this.f34234s == null && this.f34215a != null) {
            v vVar = new v(this);
            this.f34234s = vVar;
            s sVar = this.f34233r;
            sVar.f();
            if (sVar.f34176e == null) {
                yf0 yf0Var = new yf0(Thread.currentThread(), 2);
                sVar.f34176e = yf0Var;
                yf0Var.f12609b = false;
            }
            sVar.f34176e.a(vVar);
        }
        String str = oVar.f26335n;
        int i10 = oVar.F;
        int i11 = oVar.H;
        if ("audio/raw".equals(str)) {
            h5.h(m3.z.H(i11));
            int iS2 = m3.z.s(i11) * i10;
            g0 g0Var = new g0(4);
            g0Var.d(this.f34223g);
            g0Var.b(this.f34221e);
            g0Var.c((k3.k[]) this.f34217b.f2019c);
            gVar = new k3.g(g0Var.g());
            if (gVar.equals(this.f34232q)) {
                gVar = this.f34232q;
            }
            int i12 = oVar.I;
            int i13 = oVar.J;
            e0 e0Var = this.f34220d;
            e0Var.i = i12;
            e0Var.f34100j = i13;
            this.f34219c.i = iArr;
            k3.h hVar = new k3.h(oVar.G, i10, i11);
            try {
                j0 j0Var = gVar.f26855a;
                if (hVar.equals(k3.h.f26859e)) {
                    throw new k3.j(hVar);
                }
                for (int i14 = 0; i14 < j0Var.size(); i14++) {
                    k3.k kVar = (k3.k) j0Var.get(i14);
                    k3.h hVarE = kVar.e(hVar);
                    if (kVar.isActive()) {
                        h5.r(!hVarE.equals(k3.h.f26859e));
                        hVar = hVarE;
                    }
                }
                int i15 = hVar.f26861b;
                int i16 = hVar.f26862c;
                j3.n nVarA = oVar.a();
                nVarA.G = i16;
                nVarA.F = hVar.f26860a;
                nVarA.E = i15;
                oVar2 = new j3.o(nVarA);
                i = iS2;
                iS = m3.z.s(i16) * i15;
            } catch (k3.j e3) {
                throw new l(e3, oVar);
            }
        } else {
            gVar = new k3.g(b1.f768f);
            oVar2 = oVar;
            i = -1;
            iS = -1;
        }
        k3.g gVar2 = gVar;
        f fVarG = g(oVar2);
        j3.o oVar3 = fVarG.f34106a;
        try {
            j jVarC = this.f34233r.c(fVarG);
            boolean z5 = jVarC.f34132e;
            if (jVarC.f34128a == 0) {
                throw new l("Invalid output encoding (isOffload=" + z5 + ")", oVar3);
            }
            if (jVarC.f34130c == 0) {
                throw new l("Invalid output channel config (isOffload=" + z5 + ")", oVar3);
            }
            this.X = false;
            rh0 rh0Var = new rh0(oVar, oVar2, i, iS, jVarC, gVar2);
            if (n()) {
                this.f34230o = rh0Var;
            } else {
                this.f34231p = rh0Var;
            }
        } catch (e e7) {
            throw new l(e7, oVar);
        }
    }

    public final void d(long j10) throws Exception {
        t0 t0Var;
        s3.a0 a0Var;
        if (this.K == null) {
            return;
        }
        mw1 mw1Var = this.f34227l;
        if (mw1Var.f8029a != null && (f34214c0.get() > 0 || SystemClock.elapsedRealtime() < mw1Var.f8031c)) {
            return;
        }
        int iRemaining = this.K.remaining();
        try {
            boolean zD = this.f34235t.d(j10, this.K, this.J);
            this.W = SystemClock.elapsedRealtime();
            mw1Var.f8029a = null;
            mw1Var.f8030b = -9223372036854775807L;
            mw1Var.f8031c = -9223372036854775807L;
            if (this.f34235t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (t0Var = this.f34229n) != null && !zD && !this.Y && (a0Var = ((a0) t0Var.f27180c).K) != null) {
                    a0Var.f32447a.T = true;
                }
            }
            if (rh0.b(this.f34231p)) {
                this.B += (long) (iRemaining - this.K.remaining());
            }
            if (zD) {
                if (!rh0.b(this.f34231p)) {
                    h5.r(this.K == this.I);
                    this.C = (((long) this.D) * ((long) this.J)) + this.C;
                }
                this.K = null;
            }
        } catch (d e3) {
            boolean z5 = e3.f34099c;
            if (z5) {
                if (j() > 0) {
                    z = true;
                } else if (this.f34235t.c()) {
                    if (((j) this.f34231p.f9941f).f34132e) {
                        this.X = true;
                    }
                    z = true;
                }
            }
            n nVar = new n(e3.f34098b, (j3.o) this.f34231p.f9939d, z);
            t0 t0Var2 = this.f34229n;
            if (t0Var2 != null) {
                t0Var2.m(nVar);
            }
            if (z5) {
                throw nVar;
            }
            mw1Var.a(nVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws java.lang.Exception {
        /*
            r6 = this;
            k3.g r0 = r6.f34232q
            boolean r0 = r0.d()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.d(r1)
            java.nio.ByteBuffer r0 = r6.K
            if (r0 != 0) goto L44
            goto L43
        L14:
            k3.g r0 = r6.f34232q
            boolean r5 = r0.d()
            if (r5 == 0) goto L2e
            boolean r5 = r0.f26858d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.f26858d = r4
            java.util.ArrayList r0 = r0.f26856b
            java.lang.Object r0 = r0.get(r3)
            k3.k r0 = (k3.k) r0
            r0.c()
        L2e:
            r6.q(r1)
            k3.g r0 = r6.f34232q
            boolean r0 = r0.c()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r0 = r6.K
            if (r0 == 0) goto L43
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.y.e():boolean");
    }

    public final void f() {
        if (n()) {
            this.f34241z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f34238w = new x(this.f34239x, 0L, 0L);
            this.G = 0L;
            this.f34237v = null;
            this.f34224h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.f34220d.f34105o = 0L;
            k3.g gVar = (k3.g) this.f34231p.f9942g;
            this.f34232q = gVar;
            gVar.a();
            this.f34225j = null;
            rh0 rh0Var = this.f34230o;
            if (rh0Var != null) {
                this.f34231p = rh0Var;
                this.f34230o = null;
            }
            f34214c0.incrementAndGet();
            r rVar = this.f34235t;
            if (rVar.f34160e.f34184d.getPlayState() == 3) {
                rVar.f34156a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && rVar.c()) {
                ka.k kVar = rVar.f34163h;
                kVar.getClass();
                ((r) kVar.f27326e).f34156a.unregisterStreamEventCallback((dw1) kVar.f27325d);
                ((Handler) kVar.f27324c).removeCallbacksAndMessages(null);
            }
            s7.g gVar2 = rVar.f34159d;
            if (gVar2 != null) {
                AudioTrack audioTrack = (AudioTrack) gVar2.f32795b;
                p pVar = (p) gVar2.f32798e;
                pVar.getClass();
                audioTrack.removeOnRoutingChangedListener(pVar);
                gVar2.f32798e = null;
                rVar.f34159d = null;
            }
            AudioTrack audioTrack2 = rVar.f34156a;
            yf0 yf0Var = rVar.i;
            Handler handlerO = m3.z.o(null);
            synchronized (r.f34153r) {
                try {
                    if (r.f34154s == null) {
                        r.f34154s = Executors.newSingleThreadScheduledExecutor(new m3.y());
                    }
                    r.f34155t++;
                    r.f34154s.schedule(new q0.o(audioTrack2, handlerO, yf0Var, 11), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f34235t = null;
        }
        mw1 mw1Var = this.f34227l;
        mw1Var.f8029a = null;
        mw1Var.f8030b = -9223372036854775807L;
        mw1Var.f8031c = -9223372036854775807L;
        mw1 mw1Var2 = this.f34226k;
        mw1Var2.f8029a = null;
        mw1Var2.f8030b = -9223372036854775807L;
        mw1Var2.f8031c = -9223372036854775807L;
        this.Z = 0L;
        this.f34216a0 = 0L;
        Handler handler = this.f34218b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final f g(j3.o oVar) {
        f fVar = new f(oVar);
        fVar.f34107b = this.f34236u;
        fVar.f34109d = this.i != 0;
        fVar.f34108c = this.T;
        fVar.f34110e = this.Q;
        fVar.f34112g = this.V;
        fVar.f34113h = -1;
        fVar.f34111f = this.U;
        return new f(fVar);
    }

    public final int h(j3.o oVar) {
        boolean z5;
        if (!m3.z.H(oVar.H) || oVar.H == 2) {
            z5 = false;
        } else {
            j3.n nVarA = oVar.a();
            nVarA.G = 2;
            oVar = new j3.o(nVarA);
            z5 = true;
        }
        int i = this.f34233r.b(g(oVar)).f34117d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z5) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!rh0.b(this.f34231p)) {
            return this.C;
        }
        long j10 = this.B;
        long j11 = this.f34231p.f9938c;
        return ((j10 + j11) - 1) / j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x011b, code lost:
    
        if (r5 == 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(long r21, java.nio.ByteBuffer r23, int r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.y.k(long, java.nio.ByteBuffer, int):boolean");
    }

    public final boolean l() {
        if (!n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.f34235t.c() && this.N) {
            return false;
        }
        long j10 = j();
        long jA = this.f34235t.a();
        r rVar = this.f34235t;
        rVar.getClass();
        return j10 > m3.z.U(jA, (long) rVar.f34156a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() throws u3.m {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.y.m():boolean");
    }

    public final boolean n() {
        return this.f34235t != null;
    }

    public final void o() {
        this.O = true;
        if (n()) {
            r rVar = this.f34235t;
            t tVar = rVar.f34160e;
            if (tVar.f34200u != -9223372036854775807L) {
                tVar.f34182b.getClass();
                tVar.f34200u = m3.z.M(SystemClock.elapsedRealtime());
            }
            tVar.f34189j = m3.z.S(tVar.f34185e, tVar.a());
            tVar.f34188h.a(0);
            if (!rVar.f34164j || rVar.c()) {
                rVar.f34156a.play();
            }
        }
    }

    public final void p() {
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.f34235t.c()) {
            this.N = false;
        }
        r rVar = this.f34235t;
        if (rVar.f34164j) {
            return;
        }
        rVar.f34164j = true;
        t tVar = rVar.f34160e;
        long jB = rVar.b();
        tVar.f34202w = tVar.a();
        tVar.f34182b.getClass();
        tVar.f34200u = m3.z.M(SystemClock.elapsedRealtime());
        tVar.f34203x = jB;
        rVar.f34156a.stop();
        rVar.f34169o = 0;
    }

    public final void q(long j10) throws Exception {
        ByteBuffer byteBuffer;
        d(j10);
        if (this.K != null) {
            return;
        }
        if (!this.f34232q.d()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                u(byteBuffer2);
                d(j10);
                return;
            }
            return;
        }
        while (!this.f34232q.c()) {
            do {
                k3.g gVar = this.f34232q;
                if (gVar.d()) {
                    ByteBuffer byteBuffer3 = gVar.f26857c[gVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        gVar.e(k3.k.f26866a);
                        byteBuffer = gVar.f26857c[gVar.b()];
                    }
                } else {
                    byteBuffer = k3.k.f26866a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer);
                    d(j10);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    k3.g gVar2 = this.f34232q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (gVar2.d() && !gVar2.f26858d) {
                        gVar2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void r() {
        if (this.f34231p != null) {
            rh0 rh0Var = this.f34230o;
            if (rh0Var != null) {
                this.f34231p = rh0Var;
                this.f34230o = null;
            }
            try {
                j jVarC = this.f34233r.c(g((j3.o) this.f34231p.f9940e));
                rh0 rh0Var2 = this.f34231p;
                this.f34231p = new rh0((j3.o) rh0Var2.f9939d, (j3.o) rh0Var2.f9940e, rh0Var2.f9937b, rh0Var2.f9938c, jVarC, (k3.g) rh0Var2.f9942g);
            } catch (e e3) {
                throw new IllegalStateException(new l(e3, (j3.o) this.f34231p.f9939d));
            }
        }
        f();
    }

    public final void s() {
        f();
        h0 h0VarListIterator = this.f34223g.listIterator(0);
        while (h0VarListIterator.hasNext()) {
            ((k3.k) h0VarListIterator.next()).reset();
        }
        this.f34221e.reset();
        this.f34222f.reset();
        k3.g gVar = this.f34232q;
        if (gVar != null) {
            j0 j0Var = gVar.f26855a;
            for (int i = 0; i < j0Var.size(); i++) {
                k3.k kVar = (k3.k) j0Var.get(i);
                k3.i iVar = k3.i.f26864b;
                kVar.flush();
                kVar.reset();
            }
            gVar.f26856b.clear();
            gVar.f26857c = new ByteBuffer[0];
            k3.h hVar = k3.h.f26859e;
            gVar.f26858d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void t() {
        if (n()) {
            r rVar = this.f34235t;
            f0 f0Var = this.f34239x;
            AudioTrack audioTrack = rVar.f34156a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(f0Var.f26237a).setPitch(f0Var.f26238b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e3) {
                m3.b.t("AudioTrackAudioOutput", "Failed to set playback params", e3);
            }
            t tVar = rVar.f34160e;
            tVar.i = audioTrack.getPlaybackParams().getSpeed();
            tVar.f34188h.a(0);
            tVar.f34190k = 0L;
            tVar.f34199t = 0;
            tVar.f34198s = 0;
            tVar.f34191l = 0L;
            tVar.f34204y = -9223372036854775807L;
            tVar.f34205z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f34235t.f34156a.getPlaybackParams();
            this.f34239x = new f0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.y.u(java.nio.ByteBuffer):void");
    }

    public final boolean v() {
        rh0 rh0Var = this.f34231p;
        return rh0Var != null && ((j) rh0Var.f9941f).f34136j;
    }
}
