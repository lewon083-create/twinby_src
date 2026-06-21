package s3;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.ads.cu1;
import com.google.android.gms.internal.ads.gn0;
import com.google.android.gms.internal.ads.lw;
import com.google.android.gms.internal.ads.st1;
import com.google.android.gms.internal.ads.su1;
import com.google.android.gms.internal.ads.xj0;
import com.google.android.gms.internal.ads.xt1;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import i4.d1;
import i4.e1;
import i4.j1;
import io.appmetrica.analytics.impl.lp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Handler.Callback, i4.z, v0, o4.q {
    public static final long h0 = m3.z.Z(10000);
    public final lw A;
    public final boolean B;
    public c1 C;
    public boolean E;
    public boolean F;
    public d0 G;
    public int H;
    public u0 I;
    public st1 J;
    public boolean K;
    public boolean M;
    public boolean N;
    public boolean P;
    public int Q;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public d0 W;
    public long X;
    public long Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f32494a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final su1[] f32495b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public i f32496b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a[] f32497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f32499d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public k f32500d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l4.u f32501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l4.v f32503f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f32504f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f32505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m4.e f32507h;
    public final m3.v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final la.m f32508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Looper f32509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j3.n0 f32510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j3.m0 f32511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f32512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final gn0 f32513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f32514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m3.t f32515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f32516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cu1 f32517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xj0 f32518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f32519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f32520v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t3.j f32521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t3.d f32522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m3.v f32523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f32524z;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f32502e0 = -9223372036854775807L;
    public boolean R = false;
    public boolean L = false;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f32506g0 = 1.0f;
    public b1 D = b1.f32457b;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f32498c0 = -9223372036854775807L;
    public long O = -9223372036854775807L;

    public e0(Context context, a[] aVarArr, a[] aVarArr2, l4.u uVar, l4.v vVar, g0 g0Var, m4.e eVar, int i, t3.d dVar, c1 c1Var, d dVar2, long j10, Looper looper, m3.t tVar, p pVar, t3.j jVar, k kVar, final o4.q qVar, boolean z5) {
        Looper looper2;
        this.f32516r = pVar;
        this.f32501e = uVar;
        this.f32503f = vVar;
        this.f32505g = g0Var;
        this.f32507h = eVar;
        this.Q = i;
        boolean z10 = false;
        this.C = c1Var;
        this.f32519u = dVar2;
        this.f32520v = j10;
        this.f32515q = tVar;
        this.f32521w = jVar;
        this.f32500d0 = kVar;
        this.f32522x = dVar;
        this.B = z5;
        this.f32512n = ((f) g0Var).f32538n;
        j3.l0 l0Var = j3.o0.f26348a;
        u0 u0VarK = u0.k(vVar);
        this.I = u0VarK;
        this.J = new st1(2, u0VarK);
        this.f32497c = new a[aVarArr.length];
        this.f32499d = new boolean[aVarArr.length];
        l4.p pVar2 = (l4.p) uVar;
        pVar2.getClass();
        this.f32495b = new su1[aVarArr.length];
        boolean z11 = false;
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            aVar.f32434f = i10;
            aVar.f32435g = jVar;
            aVar.f32436h = tVar;
            this.f32497c[i10] = aVar;
            a aVar2 = this.f32497c[i10];
            synchronized (aVar2.f32430b) {
                aVar2.f32446s = pVar2;
            }
            a aVar3 = aVarArr2[i10];
            if (aVar3 != null) {
                aVar3.f32434f = i10;
                aVar3.f32435g = jVar;
                aVar3.f32436h = tVar;
                z11 = true;
            }
            this.f32495b[i10] = new su1(i10, aVarArr[i10], aVar3);
        }
        this.f32524z = z11;
        this.f32513o = new gn0(this, tVar);
        this.f32514p = new ArrayList();
        this.f32510l = new j3.n0();
        this.f32511m = new j3.m0();
        h5.r(uVar.f27917a == null);
        uVar.f27917a = this;
        uVar.f27918b = eVar;
        this.f32494a0 = true;
        m3.v vVarA = tVar.a(looper, null);
        this.f32523y = vVarA;
        this.f32517s = new cu1(dVar, vVarA, new q(2, this), kVar);
        this.f32518t = new xj0(this, dVar, vVarA, jVar);
        la.m mVar = new la.m(7, (byte) 0);
        this.f32508j = mVar;
        synchronized (mVar.f28099d) {
            try {
                if (((Looper) mVar.f28100e) == null) {
                    if (mVar.f28098c == 0 && ((HandlerThread) mVar.f28101f) == null) {
                        z10 = true;
                    }
                    h5.r(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    mVar.f28101f = handlerThread;
                    handlerThread.start();
                    mVar.f28100e = ((HandlerThread) mVar.f28101f).getLooper();
                }
                mVar.f28098c++;
                looper2 = (Looper) mVar.f28100e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f32509k = looper2;
        m3.v vVarA2 = tVar.a(looper2, this);
        this.i = vVarA2;
        this.A = new lw(context, looper2, this);
        vVarA2.a(35, new o4.q() { // from class: s3.z
            @Override // o4.q
            public final void a(long j11, long j12, j3.o oVar, MediaFormat mediaFormat) {
                e0 e0Var = this.f32722b;
                e0Var.getClass();
                qVar.a(j11, j12, oVar, mediaFormat);
                e0Var.a(j11, j12, oVar, mediaFormat);
            }
        }).b();
    }

    public static Pair S(j3.o0 o0Var, d0 d0Var, boolean z5, int i, boolean z10, j3.n0 n0Var, j3.m0 m0Var) {
        int iT;
        j3.o0 o0Var2 = d0Var.f32487a;
        if (o0Var.p()) {
            return null;
        }
        j3.o0 o0Var3 = o0Var2.p() ? o0Var : o0Var2;
        try {
            Pair pairI = o0Var3.i(n0Var, m0Var, d0Var.f32488b, d0Var.f32489c);
            if (!o0Var.equals(o0Var3)) {
                if (o0Var.b(pairI.first) == -1) {
                    if (!z5 || (iT = T(n0Var, m0Var, i, z10, pairI.first, o0Var3, o0Var)) == -1) {
                        return null;
                    }
                    return o0Var.i(n0Var, m0Var, iT, -9223372036854775807L);
                }
                if (o0Var3.g(pairI.first, m0Var).f26279f && o0Var3.m(m0Var.f26276c, n0Var, 0L).f26320n == o0Var3.b(pairI.first)) {
                    return o0Var.i(n0Var, m0Var, o0Var.g(pairI.first, m0Var).f26276c, d0Var.f32489c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(j3.n0 n0Var, j3.m0 m0Var, int i, boolean z5, Object obj, j3.o0 o0Var, j3.o0 o0Var2) {
        j3.n0 n0Var2 = n0Var;
        j3.o0 o0Var3 = o0Var;
        Object obj2 = o0Var3.m(o0Var3.g(obj, m0Var).f26276c, n0Var, 0L).f26308a;
        for (int i10 = 0; i10 < o0Var2.o(); i10++) {
            if (o0Var2.m(i10, n0Var, 0L).f26308a.equals(obj2)) {
                return i10;
            }
        }
        int iB = o0Var3.b(obj);
        int iH = o0Var3.h();
        int iB2 = -1;
        int i11 = 0;
        while (i11 < iH && iB2 == -1) {
            j3.o0 o0Var4 = o0Var3;
            int iD = o0Var4.d(iB, m0Var, n0Var2, i, z5);
            if (iD == -1) {
                break;
            }
            iB2 = o0Var2.b(o0Var4.l(iD));
            i11++;
            o0Var3 = o0Var4;
            iB = iD;
            n0Var2 = n0Var;
        }
        if (iB2 == -1) {
            return -1;
        }
        return o0Var2.f(iB2, m0Var, false).f26276c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i4.a0, i4.d1, java.lang.Object] */
    public static boolean z(j0 j0Var) {
        if (j0Var != null) {
            try {
                ?? r12 = j0Var.f32582a;
                if (j0Var.f32586e) {
                    for (i4.b1 b1Var : j0Var.f32584c) {
                        if (b1Var != null) {
                            b1Var.a();
                        }
                    }
                } else {
                    r12.maybeThrowPrepareError();
                }
                if ((!j0Var.f32586e ? 0L : r12.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, i4.c0 c0Var) {
        cu1 cu1Var = this.f32517s;
        j0 j0Var = (j0) cu1Var.f4333o;
        if (j0Var != null && j0Var.f32588g.f32598a.equals(c0Var)) {
            su1 su1Var = this.f32495b[i];
            j0 j0Var2 = (j0) cu1Var.f4333o;
            int i10 = su1Var.f10396b;
            boolean z5 = (i10 == 2 || i10 == 4) && su1Var.d(j0Var2) == ((a) su1Var.f10399e);
            boolean z10 = su1Var.f10396b == 3 && su1Var.d(j0Var2) == ((a) su1Var.f10400f);
            if (z5 || z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Type inference failed for: r2v21, types: [i4.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0() {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e0.A0():void");
    }

    public final boolean B() {
        j0 j0Var = (j0) this.f32517s.f4331m;
        long j10 = j0Var.f32588g.f32602e;
        if (j0Var.f32586e) {
            return j10 == -9223372036854775807L || this.I.f32674s < j10 || !q0();
        }
        return false;
    }

    public final void B0(j3.o0 o0Var, i4.c0 c0Var, j3.o0 o0Var2, i4.c0 c0Var2, long j10, boolean z5) {
        boolean zR0 = r0(o0Var, c0Var);
        Object obj = c0Var.f20861a;
        if (!zR0) {
            j3.f0 f0Var = c0Var.b() ? j3.f0.f26236d : this.I.f32670o;
            gn0 gn0Var = this.f32513o;
            if (gn0Var.getPlaybackParameters().equals(f0Var)) {
                return;
            }
            this.i.d(16);
            gn0Var.a(f0Var);
            x(this.I.f32670o, f0Var.f26237a, false, false);
            return;
        }
        j3.m0 m0Var = this.f32511m;
        int i = o0Var.g(obj, m0Var).f26276c;
        j3.n0 n0Var = this.f32510l;
        o0Var.n(i, n0Var);
        j3.t tVar = n0Var.f26316j;
        d dVar = this.f32519u;
        dVar.getClass();
        dVar.f32476c = m3.z.M(tVar.f26386a);
        dVar.f32479f = m3.z.M(tVar.f26387b);
        dVar.f32480g = m3.z.M(tVar.f26388c);
        float f10 = tVar.f26389d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        dVar.f32482j = f10;
        float f11 = tVar.f26390e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        dVar.i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            dVar.f32476c = -9223372036854775807L;
        }
        dVar.a();
        if (j10 != -9223372036854775807L) {
            dVar.f32477d = m(o0Var, obj, j10);
            dVar.a();
            return;
        }
        if (!Objects.equals(!o0Var2.p() ? o0Var2.m(o0Var2.g(c0Var2.f20861a, m0Var).f26276c, n0Var, 0L).f26308a : null, n0Var.f26308a) || z5) {
            dVar.f32477d = -9223372036854775807L;
            dVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [i4.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [i4.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [i4.d1, java.lang.Object] */
    public final void C() {
        boolean zB;
        if (z((j0) this.f32517s.f4334p)) {
            j0 j0Var = (j0) this.f32517s.f4334p;
            long jP = p(!j0Var.f32586e ? 0L : j0Var.f32582a.getNextLoadPositionUs());
            Object obj = this.f32517s.f4331m;
            long j10 = r0(this.I.f32657a, j0Var.f32588g.f32598a) ? this.f32519u.f32481h : -9223372036854775807L;
            t3.j jVar = this.f32521w;
            j3.o0 o0Var = this.I.f32657a;
            i4.c0 c0Var = j0Var.f32588g.f32598a;
            float f10 = this.f32513o.getPlaybackParameters().f26237a;
            boolean z5 = this.I.f32667l;
            f0 f0Var = new f0(jVar, o0Var, c0Var, jP, f10, this.N, j10);
            zB = ((f) this.f32505g).b(f0Var);
            j0 j0Var2 = (j0) this.f32517s.f4331m;
            if (!zB && j0Var2.f32586e && jP < 500000 && this.f32512n > 0) {
                j0Var2.f32582a.g(this.I.f32674s);
                zB = ((f) this.f32505g).b(f0Var);
            }
        } else {
            zB = false;
        }
        this.P = zB;
        if (zB) {
            j0 j0Var3 = (j0) this.f32517s.f4334p;
            j0Var3.getClass();
            xt1 xt1Var = new xt1();
            xt1Var.f12328a = this.X - j0Var3.f32596p;
            float f11 = this.f32513o.getPlaybackParameters().f26237a;
            h5.h(f11 > 0.0f || f11 == -3.4028235E38f);
            xt1Var.f12329b = f11;
            long j11 = this.O;
            h5.h(j11 >= 0 || j11 == -9223372036854775807L);
            xt1Var.f12330c = j11;
            h0 h0Var = new h0(xt1Var);
            h5.r(j0Var3.f32593m == null);
            j0Var3.f32582a.l(h0Var);
        }
        v0();
    }

    public final void C0(boolean z5, boolean z10) {
        long jElapsedRealtime;
        this.N = z5;
        if (!z5 || z10) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f32515q.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.O = jElapsedRealtime;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i4.a0, i4.d1, java.lang.Object] */
    public final void D() {
        cu1 cu1Var = this.f32517s;
        cu1Var.k();
        j0 j0Var = (j0) cu1Var.f4335q;
        if (j0Var != null) {
            ?? r12 = j0Var.f32582a;
            if ((!j0Var.f32585d || j0Var.f32586e) && !r12.isLoading()) {
                j3.o0 o0Var = this.I.f32657a;
                if (j0Var.f32586e) {
                    r12.getBufferedPositionUs();
                }
                Iterator it = ((f) this.f32505g).f32540p.values().iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).f32491b) {
                        return;
                    }
                }
                if (!j0Var.f32585d) {
                    long j10 = j0Var.f32588g.f32599b;
                    j0Var.f32585d = true;
                    r12.k(this, j10);
                    return;
                }
                xt1 xt1Var = new xt1();
                xt1Var.f12328a = this.X - j0Var.f32596p;
                float f10 = this.f32513o.getPlaybackParameters().f26237a;
                h5.h(f10 > 0.0f || f10 == -3.4028235E38f);
                xt1Var.f12329b = f10;
                long j11 = this.O;
                h5.h(j11 >= 0 || j11 == -9223372036854775807L);
                xt1Var.f12330c = j11;
                h0 h0Var = new h0(xt1Var);
                h5.r(j0Var.f32593m == null);
                r12.l(h0Var);
            }
        }
    }

    public final void E() {
        st1 st1Var = this.J;
        u0 u0Var = this.I;
        boolean z5 = st1Var.f10388d | (((u0) st1Var.f10390f) != u0Var);
        st1Var.f10388d = z5;
        st1Var.f10390f = u0Var;
        if (z5) {
            y yVar = this.f32516r.f32624b;
            yVar.f32703k.c(new m3.c0(23, yVar, st1Var));
            this.J = new st1(2, this.I);
        }
    }

    public final void F(int i) {
        su1 su1Var = this.f32495b[i];
        try {
            j0 j0Var = (j0) this.f32517s.f4331m;
            j0Var.getClass();
            a aVarD = su1Var.d(j0Var);
            aVarD.getClass();
            i4.b1 b1Var = aVarD.f32437j;
            b1Var.getClass();
            b1Var.a();
        } catch (IOException | RuntimeException e3) {
            int i10 = ((a) su1Var.f10399e).f32431c;
            if (i10 != 3 && i10 != 5) {
                throw e3;
            }
            l4.v vVar = ((j0) this.f32517s.f4331m).f32595o;
            m3.b.f("ExoPlayerImplInternal", "Disabling track due to error: " + j3.o.c(vVar.f27921c[i].l()), e3);
            l4.v vVar2 = new l4.v((a1[]) vVar.f27920b.clone(), (l4.r[]) vVar.f27921c.clone(), vVar.f27922d, vVar.f27923e);
            vVar2.f27920b[i] = null;
            vVar2.f27921c[i] = null;
            h(i);
            j0 j0Var2 = (j0) this.f32517s.f4331m;
            j0Var2.a(vVar2, this.I.f32674s, false, new boolean[j0Var2.f32590j.length]);
        }
    }

    public final void G(int i, boolean z5) {
        boolean[] zArr = this.f32499d;
        if (zArr[i] != z5) {
            zArr[i] = z5;
            this.f32523y.c(new a1.q(this, i, z5));
        }
    }

    public final void H() throws Throwable {
        v(this.f32518t.c(), true);
    }

    public final void I() {
        this.J.d(1);
        throw null;
    }

    public final void J() {
        this.J.d(1);
        O(false, false, false, true);
        f fVar = (f) this.f32505g;
        ConcurrentHashMap concurrentHashMap = fVar.f32540p;
        long id2 = Thread.currentThread().getId();
        long j10 = fVar.f32541q;
        h5.q("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j10 == -1 || j10 == id2);
        fVar.f32541q = id2;
        t3.j jVar = this.f32521w;
        e eVar = (e) concurrentHashMap.get(jVar);
        if (eVar == null) {
            e eVar2 = new e();
            eVar2.f32490a = 1;
            concurrentHashMap.put(jVar, eVar2);
        } else {
            eVar.f32490a++;
        }
        e eVar3 = (e) concurrentHashMap.get(jVar);
        eVar3.getClass();
        Integer num = (Integer) fVar.f32539o.get(jVar.f33466a);
        int iIntValue = (num == null || num.intValue() == -1) ? fVar.f32536l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        eVar3.f32492c = iIntValue;
        eVar3.f32491b = false;
        m0(this.I.f32657a.p() ? 4 : 2);
        u0 u0Var = this.I;
        boolean z5 = u0Var.f32667l;
        z0(this.A.d(u0Var.f32661e, z5), u0Var.f32669n, u0Var.f32668m, z5);
        m4.h hVar = (m4.h) this.f32507h;
        hVar.getClass();
        xj0 xj0Var = this.f32518t;
        ArrayList arrayList = (ArrayList) xj0Var.f12161d;
        h5.r(!xj0Var.f12159b);
        xj0Var.f12169m = hVar;
        for (int i = 0; i < arrayList.size(); i++) {
            t0 t0Var = (t0) arrayList.get(i);
            xj0Var.h(t0Var);
            ((HashSet) xj0Var.i).add(t0Var);
        }
        xj0Var.f12159b = true;
        this.i.e(2);
    }

    public final void K(m3.f fVar) {
        la.m mVar = this.f32508j;
        m3.v vVar = this.i;
        try {
            O(true, false, true, false);
            L();
            g0 g0Var = this.f32505g;
            t3.j jVar = this.f32521w;
            f fVar2 = (f) g0Var;
            ConcurrentHashMap concurrentHashMap = fVar2.f32540p;
            e eVar = (e) concurrentHashMap.get(jVar);
            if (eVar != null) {
                int i = eVar.f32490a - 1;
                eVar.f32490a = i;
                if (i == 0) {
                    concurrentHashMap.remove(jVar);
                    fVar2.c();
                }
            }
            if (fVar2.f32540p.isEmpty()) {
                fVar2.f32541q = -1L;
            }
            lw lwVar = this.A;
            lwVar.f7659f = null;
            lwVar.a();
            lwVar.c(0);
            this.f32501e.a();
            m0(1);
        } finally {
            vVar.f28601a.removeCallbacksAndMessages(null);
            mVar.h();
            fVar.c();
        }
    }

    public final void L() {
        for (int i = 0; i < this.f32495b.length; i++) {
            a aVar = this.f32497c[i];
            synchronized (aVar.f32430b) {
                aVar.f32446s = null;
            }
            su1 su1Var = this.f32495b[i];
            a aVar2 = (a) su1Var.f10399e;
            h5.r(aVar2.i == 0);
            aVar2.q();
            su1Var.f10397c = false;
            a aVar3 = (a) su1Var.f10400f;
            if (aVar3 != null) {
                h5.r(aVar3.i == 0);
                aVar3.q();
                su1Var.f10398d = false;
            }
        }
    }

    public final void M(int i, int i10, e1 e1Var) throws Throwable {
        this.J.d(1);
        xj0 xj0Var = this.f32518t;
        xj0Var.getClass();
        h5.h(i >= 0 && i <= i10 && i10 <= ((ArrayList) xj0Var.f12161d).size());
        xj0Var.f12168l = e1Var;
        xj0Var.k(i, i10);
        v(xj0Var.c(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() throws s3.i {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e0.N():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e0.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        j0 j0Var = (j0) this.f32517s.f4331m;
        this.M = j0Var != null && j0Var.f32588g.i && this.L;
    }

    public final void Q(long j10, boolean z5) {
        cu1 cu1Var = this.f32517s;
        j0 j0Var = (j0) cu1Var.f4331m;
        long j11 = j10 + (j0Var == null ? 1000000000000L : j0Var.f32596p);
        this.X = j11;
        ((ob.y0) this.f32513o.f5875d).b(j11);
        for (su1 su1Var : this.f32495b) {
            long j12 = this.X;
            a aVarD = su1Var.d(j0Var);
            if (aVarD != null) {
                aVarD.z(j12, false, z5);
            }
        }
        for (j0 j0Var2 = (j0) cu1Var.f4331m; j0Var2 != null; j0Var2 = j0Var2.f32593m) {
            for (l4.r rVar : j0Var2.f32595o.f27921c) {
                if (rVar != null) {
                    rVar.q();
                }
            }
        }
    }

    public final void R(j3.o0 o0Var, j3.o0 o0Var2) {
        if (o0Var.p() && o0Var2.p()) {
            return;
        }
        ArrayList arrayList = this.f32514p;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a0.u.q(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j10) {
        boolean z5 = this.E;
        long j11 = h0;
        if (z5) {
            this.D.getClass();
            jMin = this.I.f32661e != 3 ? j11 : 1000L;
            for (su1 su1Var : this.f32495b) {
                long j12 = this.X;
                long j13 = this.Y;
                a aVar = (a) su1Var.f10400f;
                a aVar2 = (a) su1Var.f10399e;
                long jG = su1.h(aVar2) ? aVar2.g(j12, j13) : Long.MAX_VALUE;
                if (aVar != null && aVar.i != 0) {
                    jG = Math.min(jG, aVar.g(j12, j13));
                }
                jMin = Math.min(jMin, m3.z.Z(jG));
            }
            if (this.I.m()) {
                j0 j0Var = (j0) this.f32517s.f4331m;
                if ((j0Var != null ? j0Var.f32593m : null) != null) {
                    if ((m3.z.M(jMin) * this.I.f32670o.f26237a) + this.X >= r1.e()) {
                        jMin = Math.min(jMin, j11);
                    }
                }
            }
        } else if (this.I.f32661e != 3 || q0()) {
            jMin = j11;
        }
        this.i.f28601a.sendEmptyMessageAtTime(2, j10 + jMin);
    }

    public final void V(boolean z5) throws i {
        i4.c0 c0Var = ((j0) this.f32517s.f4331m).f32588g.f32598a;
        long jX = X(c0Var, this.I.f32674s, true, false);
        if (jX != this.I.f32674s) {
            u0 u0Var = this.I;
            this.I = y(c0Var, jX, u0Var.f32659c, u0Var.f32660d, z5, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:40|41|(10:(10:43|126|44|(1:56)(3:50|(1:54)|55)|57|(1:64)|65|66|67|68)(1:71)|124|102|103|137|104|105|106|67|68)|135|72|(4:131|74|(4:76|(2:144|84)(2:142|80)|122|123)|141)|85|86|(1:88)(1:89)|133|90|(1:92)(1:93)|94|95|(1:97)(1:98)|99|128|100|101) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01bc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Type inference failed for: r0v37, types: [i4.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(s3.d0 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e0.W(s3.d0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Type inference failed for: r10v14, types: [i4.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [i4.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [i4.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [i4.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long X(i4.c0 r10, long r11, boolean r13, boolean r14) throws s3.i {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e0.X(i4.c0, long, boolean, boolean):long");
    }

    public final void Y(x0 x0Var) {
        x0Var.getClass();
        m3.v vVar = this.i;
        if (x0Var.f32685e != this.f32509k) {
            vVar.a(15, x0Var).b();
            return;
        }
        synchronized (x0Var) {
        }
        try {
            x0Var.f32681a.handleMessage(x0Var.f32683c, x0Var.f32684d);
            x0Var.a(true);
            int i = this.I.f32661e;
            if (i == 3 || i == 2) {
                vVar.e(2);
            }
        } catch (Throwable th2) {
            x0Var.a(true);
            throw th2;
        }
    }

    public final void Z(x0 x0Var) {
        Looper looper = x0Var.f32685e;
        if (looper.getThread().isAlive()) {
            this.f32515q.a(looper, null).c(new lp(this, x0Var));
        } else {
            m3.b.s("TAG", "Trying to send message on a dead thread.");
            x0Var.a(false);
        }
    }

    @Override // o4.q
    public final void a(long j10, long j11, j3.o oVar, MediaFormat mediaFormat) {
        if (this.F) {
            m3.v vVar = this.i;
            vVar.getClass();
            m3.u uVarB = m3.v.b();
            uVarB.f28599a = vVar.f28601a.obtainMessage(37);
            uVarB.b();
        }
    }

    public final void a0(j3.d dVar, boolean z5) {
        l4.p pVar = (l4.p) this.f32501e;
        if (!pVar.i.equals(dVar)) {
            pVar.i = dVar;
            pVar.e();
        }
        if (!z5) {
            dVar = null;
        }
        lw lwVar = this.A;
        if (!Objects.equals((j3.d) lwVar.f7660g, dVar)) {
            lwVar.f7660g = dVar;
            int i = dVar == null ? 0 : 1;
            lwVar.f7656c = i;
            h5.g("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        u0 u0Var = this.I;
        boolean z10 = u0Var.f32667l;
        z0(lwVar.d(u0Var.f32661e, z10), u0Var.f32669n, u0Var.f32668m, z10);
    }

    public final void b(b0 b0Var, int i) throws Throwable {
        this.J.d(1);
        xj0 xj0Var = this.f32518t;
        if (i == -1) {
            i = ((ArrayList) xj0Var.f12161d).size();
        }
        v(xj0Var.a(i, b0Var.f32453a, b0Var.f32454b), false);
    }

    public final void b0(boolean z5, m3.f fVar) {
        if (this.S != z5) {
            this.S = z5;
            if (!z5) {
                for (su1 su1Var : this.f32495b) {
                    su1Var.k();
                }
            }
        }
        if (fVar != null) {
            fVar.c();
        }
    }

    public final void c() {
        for (su1 su1Var : this.f32495b) {
            b1 b1Var = this.E ? this.D : null;
            ((a) su1Var.f10399e).handleMessage(18, b1Var);
            a aVar = (a) su1Var.f10400f;
            if (aVar != null) {
                aVar.handleMessage(18, b1Var);
            }
        }
    }

    public final void c0(b0 b0Var) throws Throwable {
        this.J.d(1);
        int i = b0Var.f32455c;
        e1 e1Var = b0Var.f32454b;
        ArrayList arrayList = b0Var.f32453a;
        if (i != -1) {
            this.W = new d0(new z0(arrayList, e1Var), b0Var.f32455c, b0Var.f32456d);
        }
        xj0 xj0Var = this.f32518t;
        ArrayList arrayList2 = (ArrayList) xj0Var.f12161d;
        xj0Var.k(0, arrayList2.size());
        v(xj0Var.a(arrayList2.size(), arrayList, e1Var), false);
    }

    @Override // i4.c1
    public final void d(d1 d1Var) {
        this.i.a(9, (i4.a0) d1Var).b();
    }

    public final void d0(boolean z5) throws i {
        this.L = z5;
        P();
        if (this.M) {
            cu1 cu1Var = this.f32517s;
            if (((j0) cu1Var.f4332n) != ((j0) cu1Var.f4331m)) {
                V(true);
                u(false);
            }
        }
    }

    public final boolean e() {
        if (!this.f32524z) {
            return false;
        }
        for (su1 su1Var : this.f32495b) {
            if (su1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(j3.f0 f0Var) {
        this.i.d(16);
        gn0 gn0Var = this.f32513o;
        gn0Var.a(f0Var);
        j3.f0 playbackParameters = gn0Var.getPlaybackParameters();
        x(playbackParameters, playbackParameters.f26237a, true, true);
    }

    public final void f() throws i {
        N();
        V(true);
    }

    public final void f0(k kVar) {
        this.f32500d0 = kVar;
        j3.o0 o0Var = this.I.f32657a;
        cu1 cu1Var = this.f32517s;
        cu1Var.getClass();
        kVar.getClass();
        if (cu1Var.f4326g.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cu1Var.f4326g.size(); i++) {
            ((j0) cu1Var.f4326g.get(i)).i();
        }
        cu1Var.f4326g = arrayList;
        cu1Var.f4335q = null;
        cu1Var.k();
    }

    public final void g() {
        a aVar;
        if (this.f32524z && e()) {
            for (su1 su1Var : this.f32495b) {
                int iC = su1Var.c();
                if (su1Var.f()) {
                    int i = su1Var.f10396b;
                    boolean z5 = i == 4 || i == 2;
                    int i10 = i != 4 ? 0 : 1;
                    if (z5) {
                        aVar = (a) su1Var.f10399e;
                    } else {
                        aVar = (a) su1Var.f10400f;
                        aVar.getClass();
                    }
                    su1Var.a(aVar, this.f32513o);
                    su1Var.i(z5);
                    su1Var.f10396b = i10;
                }
                this.V -= iC - su1Var.c();
            }
            this.f32502e0 = -9223372036854775807L;
        }
    }

    public final void g0(int i) throws i {
        this.Q = i;
        j3.o0 o0Var = this.I.f32657a;
        cu1 cu1Var = this.f32517s;
        cu1Var.f4321b = i;
        int iR = cu1Var.r(o0Var);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            g();
        }
        u(false);
    }

    public final void h(int i) {
        su1[] su1VarArr = this.f32495b;
        int iC = su1VarArr[i].c();
        su1 su1Var = su1VarArr[i];
        a aVar = (a) su1Var.f10399e;
        gn0 gn0Var = this.f32513o;
        su1Var.a(aVar, gn0Var);
        a aVar2 = (a) su1Var.f10400f;
        if (aVar2 != null) {
            boolean z5 = (aVar2.i == 0 || su1Var.f10396b == 3) ? false : true;
            su1Var.a(aVar2, gn0Var);
            su1Var.i(false);
            if (z5) {
                a aVar3 = (a) su1Var.f10399e;
                aVar2.getClass();
                aVar2.handleMessage(17, aVar3);
            }
        }
        su1Var.f10396b = 0;
        G(i, false);
        this.V -= iC;
    }

    public final void h0(boolean z5) throws Throwable {
        if (!z5) {
            d0 d0Var = this.G;
            m3.v vVar = this.i;
            if (d0Var != null && this.F && !vVar.f28601a.hasMessages(37)) {
                this.H++;
            }
            int i = this.H;
            if (i > 0) {
                this.f32523y.c(new lp(this, i));
            }
            this.H = 0;
            this.F = false;
            vVar.d(37);
            d0 d0Var2 = this.G;
            if (d0Var2 != null) {
                W(d0Var2);
                this.G = null;
                this.F = false;
            }
        }
        this.E = z5;
        c();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        j0 j0Var;
        i4.c0 c0Var;
        j0 j0Var2;
        int i10;
        try {
            switch (message.what) {
                case 1:
                    boolean z5 = message.arg1 != 0;
                    int i11 = message.arg2;
                    this.J.d(1);
                    z0(this.A.d(this.I.f32661e, z5), i11 >> 4, i11 & 15, z5);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((d0) message.obj);
                    break;
                case 4:
                    e0((j3.f0) message.obj);
                    break;
                case 5:
                    j0((c1) message.obj);
                    break;
                case 6:
                    t0(false, true);
                    break;
                case 7:
                    K((m3.f) message.obj);
                    return true;
                case 8:
                    w((i4.a0) message.obj);
                    break;
                case 9:
                    s((i4.a0) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    g0(message.arg1);
                    break;
                case 12:
                    k0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (m3.f) message.obj);
                    break;
                case 14:
                    Y((x0) message.obj);
                    break;
                case 15:
                    Z((x0) message.obj);
                    break;
                case 16:
                    j3.f0 f0Var = (j3.f0) message.obj;
                    x(f0Var, f0Var.f26237a, true, false);
                    break;
                case 17:
                    c0((b0) message.obj);
                    break;
                case 18:
                    b((b0) message.obj, message.arg1);
                    break;
                case 19:
                    a0.u.q(message.obj);
                    I();
                    throw null;
                case 20:
                    M(message.arg1, message.arg2, (e1) message.obj);
                    break;
                case 21:
                    l0((e1) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    d0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    f();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    x0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    f0((k) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    o0(pair.first, (m3.f) pair.second);
                    break;
                case 31:
                    a0((j3.d) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    p0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case 35:
                    n0((o4.q) message.obj);
                    break;
                case 36:
                    h0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.F = false;
                    d0 d0Var = this.G;
                    if (d0Var != null) {
                        W(d0Var);
                        this.G = null;
                    }
                    break;
                case 38:
                    i0((b1) message.obj);
                    break;
            }
        } catch (i4.b e3) {
            t(e3, 1002);
        } catch (j3.d0 e7) {
            boolean z10 = e7.f26227b;
            int i12 = e7.f26228c;
            if (i12 == 1) {
                i10 = z10 ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i10 = z10 ? 3002 : 3004;
                }
                t(e7, i);
            }
            i = i10;
            t(e7, i);
        } catch (IOException e10) {
            t(e10, 2000);
        } catch (RuntimeException e11) {
            i iVar = new i(2, e11, ((e11 instanceof IllegalStateException) || (e11 instanceof IllegalArgumentException)) ? VKApiCodes.CODE_PHONE_ALREADY_USED : 1000);
            m3.b.f("ExoPlayerImplInternal", "Playback error", iVar);
            t0(true, false);
            this.I = this.I.f(iVar);
        } catch (p3.i e12) {
            t(e12, e12.f31158b);
        } catch (i e13) {
            e = e13;
            int i13 = e.f32553d;
            cu1 cu1Var = this.f32517s;
            if (i13 == 1 && (j0Var2 = (j0) cu1Var.f4332n) != null && e.i == null) {
                e = e.a(j0Var2.f32588g.f32598a);
            }
            int i14 = e.f32553d;
            m3.v vVar = this.i;
            if (i14 == 1 && (c0Var = e.i) != null && A(e.f32555f, c0Var)) {
                this.f32504f0 = true;
                g();
                j0 j0VarG = cu1Var.g();
                j0 j0Var3 = (j0) cu1Var.f4331m;
                if (j0Var3 != j0VarG) {
                    while (j0Var3 != null) {
                        j0 j0Var4 = j0Var3.f32593m;
                        if (j0Var4 == j0VarG) {
                            break;
                        }
                        j0Var3 = j0Var4;
                    }
                }
                cu1Var.n(j0Var3);
                if (this.I.f32661e != 4) {
                    C();
                    vVar.e(2);
                }
            } else {
                i iVar2 = this.f32496b0;
                if (iVar2 != null) {
                    iVar2.addSuppressed(e);
                    e = this.f32496b0;
                }
                if (e.f32553d == 1 && ((j0) cu1Var.f4331m) != ((j0) cu1Var.f4332n)) {
                    while (true) {
                        j0Var = (j0) cu1Var.f4331m;
                        if (j0Var == ((j0) cu1Var.f4332n)) {
                            break;
                        }
                        cu1Var.a();
                    }
                    h5.n(j0Var);
                    E();
                    k0 k0Var = j0Var.f32588g;
                    i4.c0 c0Var2 = k0Var.f32598a;
                    long j10 = k0Var.f32599b;
                    this.I = y(c0Var2, j10, k0Var.f32600c, j10, true, 0);
                }
                if (e.f32558j && (this.f32496b0 == null || (i = e.f26229b) == 5004 || i == 5003)) {
                    m3.b.t("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f32496b0 == null) {
                        this.f32496b0 = e;
                    }
                    m3.u uVarA = vVar.a(25, e);
                    Handler handler = vVar.f28601a;
                    Message message2 = uVarA.f28599a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    uVarA.a();
                } else {
                    m3.b.f("ExoPlayerImplInternal", "Playback error", e);
                    t0(true, false);
                    this.I = this.I.f(e);
                }
            }
        } catch (x3.c e14) {
            t(e14, e14.f35760b);
        }
        E();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b  */
    /* JADX WARN: Type inference failed for: r4v1, types: [i4.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [i4.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() throws s3.i {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e0.i():void");
    }

    public final void i0(b1 b1Var) {
        this.D = b1Var;
        c();
    }

    @Override // i4.z
    public final void j(i4.a0 a0Var) {
        this.i.a(8, a0Var).b();
    }

    public final void j0(c1 c1Var) {
        this.C = c1Var;
    }

    public final void k(j0 j0Var, int i, boolean z5, long j10) throws i {
        su1 su1Var = this.f32495b[i];
        boolean zG = su1Var.g();
        a aVar = (a) su1Var.f10399e;
        if (zG) {
            return;
        }
        boolean z10 = j0Var == ((j0) this.f32517s.f4331m);
        l4.v vVar = j0Var.f32595o;
        a1 a1Var = vVar.f27920b[i];
        l4.r rVar = vVar.f27921c[i];
        boolean z11 = q0() && this.I.f32661e == 3;
        boolean z12 = !z5 && z11;
        this.V++;
        i4.b1 b1Var = j0Var.f32584c[i];
        long j11 = j0Var.f32596p;
        i4.c0 c0Var = j0Var.f32588g.f32598a;
        a aVar2 = (a) su1Var.f10400f;
        int length = rVar != null ? rVar.length() : 0;
        j3.o[] oVarArr = new j3.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            rVar.getClass();
            oVarArr[i10] = rVar.f(i10);
        }
        int i11 = su1Var.f10396b;
        gn0 gn0Var = this.f32513o;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            su1Var.f10397c = true;
            h5.r(aVar.i == 0);
            aVar.f32433e = a1Var;
            aVar.f32445r = c0Var;
            aVar.i = 1;
            aVar.o(z12, z10);
            aVar.y(oVarArr, b1Var, j10, j11, c0Var);
            aVar.z(j10, z12, true);
            gn0Var.i(aVar);
        } else {
            su1Var.f10398d = true;
            aVar2.getClass();
            h5.r(aVar2.i == 0);
            aVar2.f32433e = a1Var;
            aVar2.f32445r = c0Var;
            aVar2.i = 1;
            aVar2.o(z12, z10);
            aVar2.y(oVarArr, b1Var, j10, j11, c0Var);
            aVar2.z(j10, z12, true);
            gn0Var.i(aVar2);
        }
        a0 a0Var = new a0(this);
        a aVarD = su1Var.d(j0Var);
        aVarD.getClass();
        aVarD.handleMessage(11, a0Var);
        if (z11 && z10) {
            su1Var.m();
        }
    }

    public final void k0(boolean z5) throws i {
        this.R = z5;
        j3.o0 o0Var = this.I.f32657a;
        cu1 cu1Var = this.f32517s;
        cu1Var.f4322c = z5;
        int iR = cu1Var.r(o0Var);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            g();
        }
        u(false);
    }

    public final void l(boolean[] zArr, long j10) throws i {
        su1[] su1VarArr;
        long j11;
        j0 j0Var = (j0) this.f32517s.f4332n;
        l4.v vVar = j0Var.f32595o;
        int i = 0;
        while (true) {
            su1VarArr = this.f32495b;
            if (i >= su1VarArr.length) {
                break;
            }
            if (!vVar.b(i)) {
                su1VarArr[i].k();
            }
            i++;
        }
        int i10 = 0;
        while (i10 < su1VarArr.length) {
            if (vVar.b(i10) && su1VarArr[i10].d(j0Var) == null) {
                j11 = j10;
                k(j0Var, i10, zArr[i10], j11);
            } else {
                j11 = j10;
            }
            i10++;
            j10 = j11;
        }
    }

    public final void l0(e1 e1Var) throws Throwable {
        this.J.d(1);
        xj0 xj0Var = this.f32518t;
        int size = ((ArrayList) xj0Var.f12161d).size();
        if (e1Var.f20882b.length != size) {
            e1Var = new e1(new Random(e1Var.f20881a.nextLong())).a(size);
        }
        xj0Var.f12168l = e1Var;
        v(xj0Var.c(), false);
    }

    public final long m(j3.o0 o0Var, Object obj, long j10) {
        j3.m0 m0Var = this.f32511m;
        int i = o0Var.g(obj, m0Var).f26276c;
        j3.n0 n0Var = this.f32510l;
        o0Var.n(i, n0Var);
        if (n0Var.f26313f != -9223372036854775807L && n0Var.a() && n0Var.i) {
            return m3.z.M(m3.z.A(n0Var.f26314g) - n0Var.f26313f) - (j10 + m0Var.f26278e);
        }
        return -9223372036854775807L;
    }

    public final void m0(int i) {
        u0 u0Var = this.I;
        if (u0Var.f32661e != i) {
            if (i != 2) {
                this.f32498c0 = -9223372036854775807L;
            }
            if (i != 3 && u0Var.f32671p) {
                this.I = u0Var.i(false);
            }
            this.I = this.I.h(i);
        }
    }

    public final long n(j0 j0Var) {
        if (j0Var == null) {
            return 0L;
        }
        long jMax = j0Var.f32596p;
        if (!j0Var.f32586e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            su1[] su1VarArr = this.f32495b;
            if (i >= su1VarArr.length) {
                return jMax;
            }
            if (su1VarArr[i].d(j0Var) != null) {
                a aVarD = su1VarArr[i].d(j0Var);
                Objects.requireNonNull(aVarD);
                long j10 = aVarD.f32441n;
                if (j10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j10, jMax);
            }
            i++;
        }
    }

    public final void n0(o4.q qVar) {
        for (su1 su1Var : this.f32495b) {
            a aVar = (a) su1Var.f10399e;
            int i = aVar.f32431c;
            if (i == 2 || i == 4) {
                aVar.handleMessage(7, qVar);
                a aVar2 = (a) su1Var.f10400f;
                if (aVar2 != null) {
                    aVar2.handleMessage(7, qVar);
                }
            }
        }
    }

    public final Pair o(j3.o0 o0Var) {
        long j10 = 0;
        if (o0Var.p()) {
            return Pair.create(u0.f32656u, 0L);
        }
        int iA = o0Var.a(this.R);
        Pair pairI = o0Var.i(this.f32510l, this.f32511m, iA, -9223372036854775807L);
        i4.c0 c0VarP = this.f32517s.p(o0Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (c0VarP.b()) {
            Object obj = c0VarP.f20861a;
            j3.m0 m0Var = this.f32511m;
            o0Var.g(obj, m0Var);
            if (c0VarP.f20863c == m0Var.e(c0VarP.f20862b)) {
                m0Var.f26280g.getClass();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(c0VarP, Long.valueOf(j10));
    }

    public final void o0(Object obj, m3.f fVar) {
        for (su1 su1Var : this.f32495b) {
            a aVar = (a) su1Var.f10399e;
            if (aVar.f32431c == 2) {
                int i = su1Var.f10396b;
                if (i == 4 || i == 1) {
                    a aVar2 = (a) su1Var.f10400f;
                    aVar2.getClass();
                    aVar2.handleMessage(1, obj);
                } else {
                    aVar.handleMessage(1, obj);
                }
            }
        }
        int i10 = this.I.f32661e;
        if (i10 == 3 || i10 == 2) {
            this.i.e(2);
        }
        if (fVar != null) {
            fVar.c();
        }
    }

    public final long p(long j10) {
        j0 j0Var = (j0) this.f32517s.f4334p;
        if (j0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.X - j0Var.f32596p));
    }

    public final void p0(float f10) {
        this.f32506g0 = f10;
        float f11 = f10 * this.A.f7657d;
        for (su1 su1Var : this.f32495b) {
            a aVar = (a) su1Var.f10399e;
            if (aVar.f32431c == 1) {
                aVar.handleMessage(2, Float.valueOf(f11));
                a aVar2 = (a) su1Var.f10400f;
                if (aVar2 != null) {
                    aVar2.handleMessage(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void q(int i) {
        u0 u0Var = this.I;
        z0(i, u0Var.f32669n, u0Var.f32668m, u0Var.f32667l);
    }

    public final boolean q0() {
        u0 u0Var = this.I;
        return u0Var.f32667l && u0Var.f32669n == 0;
    }

    public final void r() {
        p0(this.f32506g0);
    }

    public final boolean r0(j3.o0 o0Var, i4.c0 c0Var) {
        if (c0Var.b() || o0Var.p()) {
            return false;
        }
        int i = o0Var.g(c0Var.f20861a, this.f32511m).f26276c;
        j3.n0 n0Var = this.f32510l;
        o0Var.n(i, n0Var);
        return n0Var.a() && n0Var.i && n0Var.f26313f != -9223372036854775807L;
    }

    public final void s(i4.a0 a0Var) {
        cu1 cu1Var = this.f32517s;
        j0 j0Var = (j0) cu1Var.f4334p;
        if (j0Var != null && j0Var.f32582a == a0Var) {
            cu1Var.m(this.X);
            C();
            return;
        }
        j0 j0Var2 = (j0) cu1Var.f4335q;
        if (j0Var2 == null || j0Var2.f32582a != a0Var) {
            return;
        }
        D();
    }

    public final void s0() {
        j0 j0Var = (j0) this.f32517s.f4331m;
        if (j0Var == null) {
            return;
        }
        l4.v vVar = j0Var.f32595o;
        int i = 0;
        while (true) {
            su1[] su1VarArr = this.f32495b;
            if (i >= su1VarArr.length) {
                return;
            }
            if (vVar.b(i)) {
                su1VarArr[i].m();
            }
            i++;
        }
    }

    public final void t(IOException iOException, int i) {
        i iVar = new i(0, iOException, i);
        j0 j0Var = (j0) this.f32517s.f4331m;
        if (j0Var != null) {
            iVar = iVar.a(j0Var.f32588g.f32598a);
        }
        m3.b.f("ExoPlayerImplInternal", "Playback error", iVar);
        t0(false, false);
        this.I = this.I.f(iVar);
    }

    public final void t0(boolean z5, boolean z10) {
        O(z5 || !this.S, false, true, false);
        this.J.d(z10 ? 1 : 0);
        f fVar = (f) this.f32505g;
        ConcurrentHashMap concurrentHashMap = fVar.f32540p;
        t3.j jVar = this.f32521w;
        e eVar = (e) concurrentHashMap.get(jVar);
        if (eVar != null) {
            int i = eVar.f32490a - 1;
            eVar.f32490a = i;
            if (i == 0) {
                concurrentHashMap.remove(jVar);
                fVar.c();
            }
        }
        this.A.d(1, this.I.f32667l);
        m0(1);
    }

    public final void u(boolean z5) {
        j0 j0Var = (j0) this.f32517s.f4334p;
        i4.c0 c0Var = j0Var == null ? this.I.f32658b : j0Var.f32588g.f32598a;
        boolean zEquals = this.I.f32666k.equals(c0Var);
        if (!zEquals) {
            this.I = this.I.c(c0Var);
        }
        u0 u0Var = this.I;
        u0Var.f32672q = j0Var == null ? u0Var.f32674s : j0Var.d();
        u0 u0Var2 = this.I;
        u0Var2.f32673r = p(u0Var2.f32672q);
        if ((!zEquals || z5) && j0Var != null && j0Var.f32586e) {
            w0(j0Var.f32588g.f32598a, j0Var.f32595o);
        }
    }

    public final void u0() {
        gn0 gn0Var = this.f32513o;
        gn0Var.f5874c = false;
        ob.y0 y0Var = (ob.y0) gn0Var.f5875d;
        if (y0Var.f30538b) {
            y0Var.b(y0Var.c());
            y0Var.f30538b = false;
        }
        for (su1 su1Var : this.f32495b) {
            a aVar = (a) su1Var.f10400f;
            a aVar2 = (a) su1Var.f10399e;
            if (su1.h(aVar2)) {
                su1.b(aVar2);
            }
            if (aVar != null && aVar.i != 0) {
                su1.b(aVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04d6  */
    /* JADX WARN: Type inference failed for: r10v10, types: [int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [j3.o0] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v7, types: [long] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [s3.d0] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15, types: [long] */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v26 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v29 */
    /* JADX WARN: Type inference failed for: r22v30 */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8, types: [long] */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [j3.o0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [s3.u0] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.google.android.gms.internal.ads.cu1] */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.google.android.gms.internal.ads.cu1] */
    /* JADX WARN: Type inference failed for: r43v0, types: [s3.e0] */
    /* JADX WARN: Type inference failed for: r5v34, types: [long] */
    /* JADX WARN: Type inference failed for: r5v46, types: [long] */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39, types: [long] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [long] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23, types: [j3.o0] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
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
    public final void v(j3.o0 r44, boolean r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e0.v(j3.o0, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [i4.d1, java.lang.Object] */
    public final void v0() {
        j0 j0Var = (j0) this.f32517s.f4334p;
        boolean z5 = this.P || (j0Var != null && j0Var.f32582a.isLoading());
        u0 u0Var = this.I;
        if (z5 != u0Var.f32663g) {
            this.I = u0Var.b(z5);
        }
    }

    public final void w(i4.a0 a0Var) throws i {
        j0 j0Var;
        cu1 cu1Var = this.f32517s;
        j0 j0Var2 = (j0) cu1Var.f4334p;
        gn0 gn0Var = this.f32513o;
        if (j0Var2 != null && j0Var2.f32582a == a0Var) {
            j0Var2.getClass();
            if (!j0Var2.f32586e) {
                float f10 = gn0Var.getPlaybackParameters().f26237a;
                u0 u0Var = this.I;
                j0Var2.f(f10, u0Var.f32657a, u0Var.f32667l);
            }
            w0(j0Var2.f32588g.f32598a, j0Var2.f32595o);
            if (j0Var2 == ((j0) cu1Var.f4331m)) {
                Q(j0Var2.f32588g.f32599b, true);
                l(new boolean[this.f32495b.length], ((j0) cu1Var.f4332n).e());
                j0Var2.f32589h = true;
                u0 u0Var2 = this.I;
                i4.c0 c0Var = u0Var2.f32658b;
                long j10 = j0Var2.f32588g.f32599b;
                this.I = y(c0Var, j10, u0Var2.f32659c, j10, false, 5);
            }
            C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= cu1Var.f4326g.size()) {
                j0Var = null;
                break;
            }
            j0Var = (j0) cu1Var.f4326g.get(i);
            if (j0Var.f32582a == a0Var) {
                break;
            } else {
                i++;
            }
        }
        if (j0Var != null) {
            h5.r(true ^ j0Var.f32586e);
            float f11 = gn0Var.getPlaybackParameters().f26237a;
            u0 u0Var3 = this.I;
            j0Var.f(f11, u0Var3.f32657a, u0Var3.f32667l);
            j0 j0Var3 = (j0) cu1Var.f4335q;
            if (j0Var3 == null || j0Var3.f32582a != a0Var) {
                return;
            }
            D();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w0(i4.c0 r10, l4.v r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e0.w0(i4.c0, l4.v):void");
    }

    public final void x(j3.f0 f0Var, float f10, boolean z5, boolean z10) {
        int i;
        if (z5) {
            if (z10) {
                this.J.d(1);
            }
            this.I = this.I.g(f0Var);
        }
        float f11 = f0Var.f26237a;
        j0 j0Var = (j0) this.f32517s.f4331m;
        while (true) {
            i = 0;
            if (j0Var == null) {
                break;
            }
            l4.r[] rVarArr = j0Var.f32595o.f27921c;
            int length = rVarArr.length;
            while (i < length) {
                l4.r rVar = rVarArr[i];
                if (rVar != null) {
                    rVar.o(f11);
                }
                i++;
            }
            j0Var = j0Var.f32593m;
        }
        su1[] su1VarArr = this.f32495b;
        int length2 = su1VarArr.length;
        while (i < length2) {
            su1 su1Var = su1VarArr[i];
            float f12 = f0Var.f26237a;
            ((a) su1Var.f10399e).A(f10, f12);
            a aVar = (a) su1Var.f10400f;
            if (aVar != null) {
                aVar.A(f10, f12);
            }
            i++;
        }
    }

    public final void x0(List list, int i, int i10) throws Throwable {
        this.J.d(1);
        xj0 xj0Var = this.f32518t;
        xj0Var.getClass();
        ArrayList arrayList = (ArrayList) xj0Var.f12161d;
        h5.h(i >= 0 && i <= i10 && i10 <= arrayList.size());
        h5.h(list.size() == i10 - i);
        for (int i11 = i; i11 < i10; i11++) {
            ((t0) arrayList.get(i11)).f32649a.w((j3.x) list.get(i11 - i));
        }
        v(xj0Var.c(), false);
    }

    public final u0 y(i4.c0 c0Var, long j10, long j11, long j12, boolean z5, int i) {
        ad.b1 b1VarG;
        boolean z10;
        this.f32494a0 = (!this.f32494a0 && j10 == this.I.f32674s && c0Var.equals(this.I.f32658b)) ? false : true;
        P();
        u0 u0Var = this.I;
        j1 j1Var = u0Var.f32664h;
        l4.v vVar = u0Var.i;
        List list = u0Var.f32665j;
        if (this.f32518t.f12159b) {
            j0 j0Var = (j0) this.f32517s.f4331m;
            j1Var = j0Var == null ? j1.f20934d : j0Var.f32594n;
            vVar = j0Var == null ? this.f32503f : j0Var.f32595o;
            l4.r[] rVarArr = vVar.f27921c;
            ad.g0 g0Var = new ad.g0(4);
            boolean z11 = false;
            for (l4.r rVar : rVarArr) {
                if (rVar != null) {
                    j3.b0 b0Var = rVar.f(0).f26333l;
                    if (b0Var == null) {
                        g0Var.b(new j3.b0(new j3.a0[0]));
                    } else {
                        g0Var.b(b0Var);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                b1VarG = g0Var.g();
            } else {
                ad.h0 h0Var = ad.j0.f818c;
                b1VarG = ad.b1.f768f;
            }
            list = b1VarG;
            if (j0Var != null) {
                k0 k0Var = j0Var.f32588g;
                if (k0Var.f32600c != j11) {
                    j0Var.f32588g = k0Var.a(j11);
                }
            }
            su1[] su1VarArr = this.f32495b;
            cu1 cu1Var = this.f32517s;
            j0 j0Var2 = (j0) cu1Var.f4331m;
            if (j0Var2 == ((j0) cu1Var.f4332n) && j0Var2 != null) {
                l4.v vVar2 = j0Var2.f32595o;
                int i10 = 0;
                boolean z12 = false;
                while (true) {
                    if (i10 >= su1VarArr.length) {
                        z10 = true;
                        break;
                    }
                    if (vVar2.b(i10)) {
                        if (((a) su1VarArr[i10].f10399e).f32431c != 1) {
                            z10 = false;
                            break;
                        }
                        if (vVar2.f27920b[i10].f32449a != 0) {
                            z12 = true;
                        }
                    }
                    i10++;
                }
                boolean z13 = z12 && z10;
                if (z13 != this.U) {
                    this.U = z13;
                    if (!z13 && this.I.f32671p) {
                        this.i.e(2);
                    }
                }
            }
        } else if (!c0Var.equals(u0Var.f32658b)) {
            j1Var = j1.f20934d;
            vVar = this.f32503f;
            list = ad.b1.f768f;
        }
        j1 j1Var2 = j1Var;
        l4.v vVar3 = vVar;
        List list2 = list;
        if (z5) {
            st1 st1Var = this.J;
            if (!st1Var.f10389e || st1Var.f10387c == 5) {
                st1Var.f10388d = true;
                st1Var.f10389e = true;
                st1Var.f10387c = i;
            } else {
                h5.h(i == 5);
            }
        }
        u0 u0Var2 = this.I;
        return u0Var2.d(c0Var, j10, j11, j12, p(u0Var2.f32672q), j1Var2, vVar3, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0575  */
    /* JADX WARN: Type inference failed for: r1v53, types: [i4.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [i4.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [i4.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0() throws s3.i {
        /*
            Method dump skipped, instruction units count: 1588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e0.y0():void");
    }

    public final void z0(int i, int i10, int i11, boolean z5) {
        boolean z10 = z5 && i != -1;
        if (i == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        boolean z11 = this.E;
        if (i == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            i10 = z11 ? 4 : 0;
        }
        u0 u0Var = this.I;
        if (u0Var.f32667l == z10 && u0Var.f32669n == i10 && u0Var.f32668m == i11) {
            return;
        }
        this.I = u0Var.e(i11, i10, z10);
        C0(false, false);
        cu1 cu1Var = this.f32517s;
        for (j0 j0Var = (j0) cu1Var.f4331m; j0Var != null; j0Var = j0Var.f32593m) {
            for (l4.r rVar : j0Var.f32595o.f27921c) {
                if (rVar != null) {
                    rVar.e(z10);
                }
            }
        }
        if (!q0()) {
            u0();
            A0();
            u0 u0Var2 = this.I;
            if (u0Var2.f32671p) {
                this.I = u0Var2.i(false);
            }
            cu1Var.m(this.X);
            return;
        }
        int i12 = this.I.f32661e;
        m3.v vVar = this.i;
        if (i12 != 3) {
            if (i12 == 2) {
                vVar.e(2);
            }
        } else {
            gn0 gn0Var = this.f32513o;
            gn0Var.f5874c = true;
            ((ob.y0) gn0Var.f5875d).d();
            s0();
            vVar.e(2);
        }
    }
}
