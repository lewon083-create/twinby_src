package y3;

import ad.j0;
import android.net.Uri;
import android.os.Looper;
import com.google.android.gms.internal.measurement.h5;
import fh.nd;
import i4.a0;
import i4.c0;
import i4.f1;
import i4.i0;
import j3.u;
import j3.x;
import j3.y;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m3.z;
import p3.e0;
import t9.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i4.a {
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m4.d f36378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nd f36379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x3.h f36380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final le.a f36381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f36382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f36383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z3.c f36384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f36385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j3.t f36386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e0 f36387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x f36388t;

    static {
        y.a("media3.exoplayer.hls");
    }

    public l(x xVar, m4.d dVar, c cVar, nd ndVar, x3.h hVar, le.a aVar, z3.c cVar2, long j10, boolean z5, int i) {
        this.f36388t = xVar;
        this.f36386r = xVar.f26408c;
        this.f36378j = dVar;
        this.i = cVar;
        this.f36379k = ndVar;
        this.f36380l = hVar;
        this.f36381m = aVar;
        this.f36384p = cVar2;
        this.f36385q = j10;
        this.f36382n = z5;
        this.f36383o = i;
    }

    public static z3.g x(long j10, List list) {
        z3.g gVar = null;
        for (int i = 0; i < list.size(); i++) {
            z3.g gVar2 = (z3.g) list.get(i);
            long j11 = gVar2.f46092f;
            if (j11 > j10 || !gVar2.f46081m) {
                if (j11 > j10) {
                    break;
                }
            } else {
                gVar = gVar2;
            }
        }
        return gVar;
    }

    @Override // i4.a
    public final a0 b(c0 c0Var, bb.e eVar, long j10) {
        i0 i0VarA = a(c0Var);
        i0 i0Var = new i0(this.f20829e.f20928c, 0, c0Var);
        e0 e0Var = this.f36387s;
        t3.j jVar = this.f20832h;
        jVar.getClass();
        return new k(this.i, this.f36384p, this.f36378j, e0Var, this.f36380l, i0Var, this.f36381m, i0VarA, eVar, this.f36379k, this.f36382n, this.f36383o, jVar);
    }

    @Override // i4.a
    public final synchronized x j() {
        return this.f36388t;
    }

    @Override // i4.a
    public final void l() throws IOException {
        z3.c cVar = this.f36384p;
        m4.n nVar = cVar.f46032h;
        if (nVar != null) {
            nVar.a();
        }
        Uri uri = cVar.f46035l;
        if (uri != null) {
            z3.b bVar = (z3.b) cVar.f46029e.get(uri);
            bVar.f46015c.a();
            IOException iOException = bVar.f46022k;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // i4.a
    public final void p(e0 e0Var) {
        this.f36387s = e0Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        t3.j jVar = this.f20832h;
        jVar.getClass();
        x3.h hVar = this.f36380l;
        hVar.b(looperMyLooper, jVar);
        hVar.prepare();
        i0 i0VarA = a(null);
        u uVar = j().f26407b;
        uVar.getClass();
        Uri uri = uVar.f26396a;
        z3.c cVar = this.f36384p;
        cVar.getClass();
        cVar.i = z.o(null);
        cVar.f46031g = i0VarA;
        cVar.f46033j = this;
        Map map = Collections.EMPTY_MAP;
        h5.m(uri, "The uri must be set.");
        m4.q qVar = new m4.q(((p3.g) cVar.f46026b.f28630b).createDataSource(), new p3.l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, cVar.f46027c.e());
        h5.r(cVar.f46032h == null);
        m4.n nVar = new m4.n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f46032h = nVar;
        nVar.f(qVar, cVar, cVar.f46028d.e(qVar.f28676d));
    }

    @Override // i4.a
    public final void r(a0 a0Var) {
        k kVar = (k) a0Var;
        kVar.f36357c.f46030f.remove(kVar);
        for (q qVar : kVar.f36374u) {
            if (qVar.E) {
                for (p pVar : qVar.f36421w) {
                    pVar.k();
                    ni.i iVar = pVar.f20840h;
                    if (iVar != null) {
                        iVar.A(pVar.f20837e);
                        pVar.f20840h = null;
                        pVar.f20839g = null;
                    }
                }
            }
            i iVar2 = qVar.f36404e;
            z3.b bVar = (z3.b) iVar2.f36329g.f46029e.get(iVar2.f36327e[iVar2.f36339r.j()]);
            if (bVar != null) {
                bVar.f46023l = false;
            }
            iVar2.f36335n = null;
            qVar.f36409k.e(qVar);
            qVar.f36417s.removeCallbacksAndMessages(null);
            qVar.I = true;
            qVar.f36418t.clear();
        }
        kVar.f36371r = null;
    }

    @Override // i4.a
    public final void t() {
        z3.c cVar = this.f36384p;
        cVar.f46035l = null;
        cVar.f46036m = null;
        cVar.f46034k = null;
        cVar.f46038o = -9223372036854775807L;
        cVar.f46032h.e(null);
        cVar.f46032h = null;
        HashMap map = cVar.f46029e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((z3.b) it.next()).f46015c.e(null);
        }
        cVar.i.removeCallbacksAndMessages(null);
        cVar.i = null;
        map.clear();
        this.f36380l.release();
    }

    @Override // i4.a
    public final synchronized void w(x xVar) {
        this.f36388t = xVar;
    }

    public final void y(z3.l lVar) {
        long j10;
        f1 f1Var;
        boolean z5;
        long jM;
        long j11;
        long jM2;
        long j12;
        boolean z10 = lVar.f46114p;
        boolean z11 = lVar.f46106g;
        j0 j0Var = lVar.f46116r;
        long j13 = lVar.f46119u;
        long jM3 = lVar.f46104e;
        int i = lVar.f46103d;
        long j14 = lVar.f46107h;
        long jZ = z10 ? z.Z(j14) : -9223372036854775807L;
        long j15 = (i == 2 || i == 1) ? jZ : -9223372036854775807L;
        z3.c cVar = this.f36384p;
        cVar.f46034k.getClass();
        h0 h0Var = new h0();
        long j16 = 0;
        if (cVar.f46037n) {
            z3.k kVar = lVar.f46120v;
            long j17 = j14 - cVar.f46038o;
            boolean z12 = lVar.f46113o;
            long j18 = z12 ? j17 + j13 : -9223372036854775807L;
            if (lVar.f46114p) {
                z5 = z11;
                jM = z.M(z.A(this.f36385q)) - (j14 + j13);
            } else {
                z5 = z11;
                jM = 0;
            }
            long j19 = this.f36386r.f26386a;
            if (j19 != -9223372036854775807L) {
                jM2 = z.M(j19);
            } else {
                if (jM3 != -9223372036854775807L) {
                    j11 = j13 - jM3;
                } else {
                    j11 = kVar.f46101d;
                    if (j11 == -9223372036854775807L || lVar.f46112n == -9223372036854775807L) {
                        j11 = kVar.f46100c;
                        if (j11 == -9223372036854775807L) {
                            j11 = 3 * lVar.f46111m;
                        }
                    }
                }
                jM2 = j11 + jM;
            }
            long j20 = j13 + jM;
            long jK = z.k(jM2, jM, j20);
            j3.t tVar = j().f26408c;
            boolean z13 = tVar.f26389d == -3.4028235E38f && tVar.f26390e == -3.4028235E38f && kVar.f46100c == -9223372036854775807L && kVar.f46101d == -9223372036854775807L;
            j3.s sVarA = this.f36386r.a();
            sVarA.f26360a = z.Z(jK);
            sVarA.f26363d = z13 ? 1.0f : this.f36386r.f26389d;
            sVarA.f26364e = z13 ? 1.0f : this.f36386r.f26390e;
            j3.t tVar2 = new j3.t(sVarA);
            this.f36386r = tVar2;
            if (jM3 == -9223372036854775807L) {
                jM3 = j20 - z.M(tVar2.f26386a);
            }
            if (z5) {
                j16 = jM3;
            } else {
                z3.g gVarX = x(jM3, lVar.f46117s);
                if (gVarX != null) {
                    j12 = gVarX.f46092f;
                } else if (!j0Var.isEmpty()) {
                    z3.i iVar = (z3.i) j0Var.get(z.d(j0Var, Long.valueOf(jM3), true));
                    z3.g gVarX2 = x(jM3, iVar.f46087n);
                    j12 = gVarX2 != null ? gVarX2.f46092f : iVar.f46092f;
                }
                j16 = j12;
            }
            f1Var = new f1(j15, jZ, j18, lVar.f46119u, j17, j16, true, !z12, i == 2 && lVar.f46105f, h0Var, j(), this.f36386r);
        } else {
            if (jM3 == -9223372036854775807L || j0Var.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && jM3 != j13) {
                    jM3 = ((z3.i) j0Var.get(z.d(j0Var, Long.valueOf(jM3), true))).f46092f;
                }
                j10 = jM3;
            }
            long j21 = lVar.f46119u;
            f1Var = new f1(j15, jZ, j21, j21, 0L, j10, true, false, true, h0Var, j(), null);
        }
        q(f1Var);
    }
}
