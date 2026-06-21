package v3;

import ad.m0;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.h5;
import fh.nd;
import i4.a0;
import i4.c0;
import i4.i0;
import j3.t;
import j3.u;
import j3.x;
import j3.y;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k6.t0;
import m3.z;
import m4.n;
import m4.o;
import m4.p;
import m4.q;
import p3.e0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i4.a {
    public p3.h A;
    public n B;
    public e0 C;
    public IOException D;
    public Handler E;
    public Uri F;
    public final Uri G;
    public w3.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public x P;
    public t Q;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p3.g f34685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m0 f34686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nd f34687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x3.h f34688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final le.a f34689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s7.g f34690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f34691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f34692q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0 f34693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f34694s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ni.i f34695t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f34696u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SparseArray f34697v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f34698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f34699x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m7.a f34700y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o f34701z;

    static {
        y.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [v3.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [v3.c] */
    public f(x xVar, p3.g gVar, p pVar, m0 m0Var, nd ndVar, x3.h hVar, le.a aVar, long j10, long j11) {
        this.P = xVar;
        this.Q = xVar.f26408c;
        u uVar = xVar.f26407b;
        uVar.getClass();
        Uri uri = uVar.f26396a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f34685j = gVar;
        this.f34694s = pVar;
        this.f34686k = m0Var;
        this.f34688m = hVar;
        this.f34689n = aVar;
        this.f34691p = j10;
        this.f34692q = j11;
        this.f34687l = ndVar;
        this.f34690o = new s7.g(19);
        this.i = false;
        this.f34693r = a(null);
        this.f34696u = new Object();
        this.f34697v = new SparseArray();
        this.f34700y = new m7.a(23, this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f34695t = new ni.i(18, this);
        this.f34701z = new t0(17, this);
        final int i = 0;
        this.f34698w = new Runnable(this) { // from class: v3.c

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f34674c;

            {
                this.f34674c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f34674c.D();
                        break;
                    default:
                        f fVar = this.f34674c;
                        fVar.getClass();
                        try {
                            fVar.B(false);
                        } catch (Exception e3) {
                            fVar.D = new IOException(e3);
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f34699x = new Runnable(this) { // from class: v3.c

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f34674c;

            {
                this.f34674c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f34674c.D();
                        break;
                    default:
                        f fVar = this.f34674c;
                        fVar.getClass();
                        try {
                            fVar.B(false);
                        } catch (Exception e3) {
                            fVar.D = new IOException(e3);
                        }
                        break;
                }
            }
        };
    }

    public static boolean x(w3.h hVar) {
        List list = hVar.f35062c;
        for (int i = 0; i < list.size(); i++) {
            int i10 = ((w3.a) list.get(i)).f35020b;
            if (i10 == 1 || i10 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(IOException iOException) {
        m3.b.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        B(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a0, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.f.B(boolean):void");
    }

    public final void C(d8.a aVar, p pVar) {
        p3.h hVar = this.A;
        Uri uri = Uri.parse(aVar.f15577c);
        Map map = Collections.EMPTY_MAP;
        h5.m(uri, "The uri must be set.");
        this.B.f(new q(hVar, new p3.l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 5, pVar), new e4.p(2, this), 1);
    }

    public final void D() {
        Uri uri;
        this.E.removeCallbacks(this.f34698w);
        if (this.B.c()) {
            return;
        }
        if (this.B.d()) {
            this.I = true;
            return;
        }
        synchronized (this.f34696u) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        h5.m(uri, "The uri must be set.");
        q qVar = new q(this.A, new p3.l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, this.f34694s);
        ni.i iVar = this.f34695t;
        this.f34689n.getClass();
        this.B.f(qVar, iVar, 3);
    }

    @Override // i4.a
    public final a0 b(c0 c0Var, bb.e eVar, long j10) {
        int iIntValue = ((Integer) c0Var.f20861a).intValue() - this.O;
        i0 i0VarA = a(c0Var);
        i0 i0Var = new i0(this.f20829e.f20928c, 0, c0Var);
        int i = this.O + iIntValue;
        w3.c cVar = this.H;
        e0 e0Var = this.C;
        long j11 = this.L;
        t3.j jVar = this.f20832h;
        jVar.getClass();
        b bVar = new b(i, cVar, this.f34690o, iIntValue, this.f34686k, e0Var, this.f34688m, i0Var, this.f34689n, i0VarA, j11, this.f34701z, eVar, this.f34687l, this.f34700y, jVar);
        this.f34697v.put(i, bVar);
        return bVar;
    }

    @Override // i4.a
    public final synchronized x j() {
        return this.P;
    }

    @Override // i4.a
    public final void l() {
        this.f34701z.a();
    }

    @Override // i4.a
    public final void p(e0 e0Var) {
        this.C = e0Var;
        Looper looperMyLooper = Looper.myLooper();
        t3.j jVar = this.f20832h;
        jVar.getClass();
        x3.h hVar = this.f34688m;
        hVar.b(looperMyLooper, jVar);
        hVar.prepare();
        if (this.i) {
            B(false);
            return;
        }
        this.A = this.f34685j.createDataSource();
        this.B = new n("DashMediaSource");
        this.E = z.o(null);
        D();
    }

    @Override // i4.a
    public final void r(a0 a0Var) {
        b bVar = (b) a0Var;
        l lVar = bVar.f34660n;
        lVar.f34736j = true;
        lVar.f34732e.removeCallbacksAndMessages(null);
        for (j4.i iVar : bVar.f34665s) {
            iVar.t(bVar);
        }
        bVar.f34664r = null;
        this.f34697v.remove(bVar.f34649b);
    }

    @Override // i4.a
    public final void t() {
        this.I = false;
        this.A = null;
        n nVar = this.B;
        if (nVar != null) {
            nVar.e(null);
            this.B = null;
        }
        t tVar = j().f26408c;
        synchronized (this) {
            this.Q = tVar;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.f34697v.clear();
        s7.g gVar = this.f34690o;
        ((HashMap) gVar.f32795b).clear();
        ((HashMap) gVar.f32796c).clear();
        ((HashMap) gVar.f32797d).clear();
        this.f34688m.release();
    }

    @Override // i4.a
    public final synchronized void w(x xVar) {
        this.P = xVar;
        this.Q = xVar.f26408c;
    }

    public final void y() {
        boolean z5;
        n nVar = this.B;
        m4.d dVar = new m4.d(this);
        synchronized (n4.b.f29098b) {
            z5 = n4.b.f29099c;
        }
        if (z5) {
            dVar.i();
            return;
        }
        if (nVar == null) {
            nVar = new n("SntpClient");
        }
        nVar.f(new l7.i(3), new e4.p(1, dVar), 1);
    }

    public final void z(q qVar, long j10, long j11) {
        long j12 = qVar.f28674b;
        p3.l lVar = qVar.f28675c;
        p3.c0 c0Var = qVar.f28677e;
        i4.u uVar = new i4.u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        this.f34689n.getClass();
        this.f34693r.c(uVar, qVar.f28676d, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
