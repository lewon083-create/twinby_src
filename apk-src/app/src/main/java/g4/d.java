package g4;

import a0.d1;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bb.e;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.i4;
import fh.nd;
import i4.a0;
import i4.c0;
import i4.f1;
import i4.i0;
import j3.d0;
import j3.u;
import j3.x;
import j3.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import m3.z;
import m4.i;
import m4.k;
import m4.m;
import m4.n;
import m4.o;
import m4.p;
import m4.q;
import p3.e0;
import p3.g;
import p3.l;
import p3.t;
import t3.j;
import x3.h;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i4.a implements i {
    public x A;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f19982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f19983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i4 f19984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nd f19985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f19986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final le.a f19987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f19988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f19989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f19990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f19991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p3.h f19992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f19993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f19994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e0 f19995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f19996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h4.c f19997y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Handler f19998z;

    static {
        y.a("media3.exoplayer.smoothstreaming");
    }

    public d(x xVar, g gVar, p pVar, i4 i4Var, nd ndVar, h hVar, le.a aVar, long j10) {
        this.A = xVar;
        u uVar = xVar.f26407b;
        uVar.getClass();
        Uri uriWithAppendedPath = uVar.f26396a;
        this.f19997y = null;
        if (uriWithAppendedPath.equals(Uri.EMPTY)) {
            uriWithAppendedPath = null;
        } else {
            String path = uriWithAppendedPath.getPath();
            if (path != null) {
                Matcher matcher = z.f28614g.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
                }
            }
        }
        this.f19982j = uriWithAppendedPath;
        this.f19983k = gVar;
        this.f19990r = pVar;
        this.f19984l = i4Var;
        this.f19985m = ndVar;
        this.f19986n = hVar;
        this.f19987o = aVar;
        this.f19988p = j10;
        this.f19989q = a(null);
        this.i = false;
        this.f19991s = new ArrayList();
    }

    @Override // i4.a
    public final a0 b(c0 c0Var, e eVar, long j10) {
        i0 i0VarA = a(c0Var);
        i0 i0Var = new i0(this.f20829e.f20928c, 0, c0Var);
        c cVar = new c(this.f19997y, this.f19984l, this.f19995w, this.f19985m, this.f19986n, i0Var, this.f19987o, i0VarA, this.f19994v, eVar);
        this.f19991s.add(cVar);
        return cVar;
    }

    @Override // m4.i
    public final void e(k kVar, long j10, long j11) {
        q qVar = (q) kVar;
        long j12 = qVar.f28674b;
        l lVar = qVar.f28675c;
        p3.c0 c0Var = qVar.f28677e;
        i4.u uVar = new i4.u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        this.f19987o.getClass();
        this.f19989q.d(uVar, qVar.f28676d);
        this.f19997y = (h4.c) qVar.f28679g;
        this.f19996x = j10 - j11;
        x();
        if (this.f19997y.f20398d) {
            this.f19998z.postDelayed(new d1(23, this), Math.max(0L, (this.f19996x + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // m4.i
    public final com.google.android.gms.internal.ads.o i(k kVar, long j10, long j11, IOException iOException, int i) {
        long jMin;
        q qVar = (q) kVar;
        long j12 = qVar.f28674b;
        l lVar = qVar.f28675c;
        p3.c0 c0Var = qVar.f28677e;
        i4.u uVar = new i4.u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        int i10 = qVar.f28676d;
        this.f19987o.getClass();
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof d0) || (cause instanceof FileNotFoundException) || (cause instanceof t) || (cause instanceof m) || ((cause instanceof p3.i) && ((p3.i) cause).f31158b == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        com.google.android.gms.internal.ads.o oVar = jMin == -9223372036854775807L ? n.f28670g : new com.google.android.gms.internal.ads.o(0, jMin, false);
        this.f19989q.g(uVar, i10, iOException, !oVar.a());
        return oVar;
    }

    @Override // i4.a
    public final synchronized x j() {
        return this.A;
    }

    @Override // i4.a
    public final void l() {
        this.f19994v.a();
    }

    @Override // m4.i
    public final void m(k kVar, long j10, long j11, boolean z5) {
        q qVar = (q) kVar;
        long j12 = qVar.f28674b;
        l lVar = qVar.f28675c;
        p3.c0 c0Var = qVar.f28677e;
        i4.u uVar = new i4.u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        this.f19987o.getClass();
        this.f19989q.c(uVar, qVar.f28676d, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // m4.i
    public final void o(k kVar, long j10, long j11, int i) {
        i4.u uVar;
        q qVar = (q) kVar;
        if (i == 0) {
            long j12 = qVar.f28674b;
            uVar = new i4.u(j10, qVar.f28675c);
        } else {
            long j13 = qVar.f28674b;
            l lVar = qVar.f28675c;
            p3.c0 c0Var = qVar.f28677e;
            uVar = new i4.u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        }
        this.f19989q.h(uVar, qVar.f28676d, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // i4.a
    public final void p(e0 e0Var) {
        this.f19995w = e0Var;
        Looper looperMyLooper = Looper.myLooper();
        j jVar = this.f20832h;
        jVar.getClass();
        h hVar = this.f19986n;
        hVar.b(looperMyLooper, jVar);
        hVar.prepare();
        if (this.i) {
            this.f19994v = new l7.b(2);
            x();
            return;
        }
        this.f19992t = this.f19983k.createDataSource();
        n nVar = new n("SsMediaSource");
        this.f19993u = nVar;
        this.f19994v = nVar;
        this.f19998z = z.o(null);
        y();
    }

    @Override // i4.a
    public final void r(a0 a0Var) {
        c cVar = (c) a0Var;
        for (j4.i iVar : cVar.f19980n) {
            iVar.t(null);
        }
        cVar.f19978l = null;
        this.f19991s.remove(a0Var);
    }

    @Override // i4.a
    public final void t() {
        this.f19997y = this.i ? this.f19997y : null;
        this.f19992t = null;
        this.f19996x = 0L;
        n nVar = this.f19993u;
        if (nVar != null) {
            nVar.e(null);
            this.f19993u = null;
        }
        Handler handler = this.f19998z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f19998z = null;
        }
        this.f19986n.release();
    }

    @Override // i4.a
    public final synchronized void w(x xVar) {
        this.A = xVar;
    }

    public final void x() {
        f1 f1Var;
        char c8;
        h4.b[] bVarArr;
        char c9 = 0;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19991s;
            if (i >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i);
            h4.c cVar2 = this.f19997y;
            cVar.f19979m = cVar2;
            for (j4.i iVar : cVar.f19980n) {
                b bVar = (b) iVar.f26486f;
                h4.b[] bVarArr2 = bVar.f19966f.f20400f;
                int i10 = bVar.f19962b;
                h4.b bVar2 = bVarArr2[i10];
                int i11 = bVar2.f20389k;
                long[] jArr = bVar2.f20393o;
                h4.b bVar3 = cVar2.f20400f[i10];
                if (i11 == 0 || bVar3.f20389k == 0) {
                    bVar.f19967g += i11;
                } else {
                    int i12 = i11 - 1;
                    long jB = bVar2.b(i12) + jArr[i12];
                    long j10 = bVar3.f20393o[0];
                    if (jB <= j10) {
                        bVar.f19967g += i11;
                    } else {
                        bVar.f19967g = z.f(jArr, j10, true) + bVar.f19967g;
                    }
                }
                bVar.f19966f = cVar2;
            }
            i4.z zVar = cVar.f19978l;
            zVar.getClass();
            zVar.d(cVar);
            i++;
        }
        h4.b[] bVarArr3 = this.f19997y.f20400f;
        int length = bVarArr3.length;
        long jMax = Long.MIN_VALUE;
        int i13 = 0;
        long jMax2 = Long.MAX_VALUE;
        while (i13 < length) {
            h4.b bVar4 = bVarArr3[i13];
            int i14 = bVar4.f20389k;
            long[] jArr2 = bVar4.f20393o;
            if (i14 > 0) {
                c8 = c9;
                bVarArr = bVarArr3;
                jMax2 = Math.min(jMax2, jArr2[c8]);
                int i15 = bVar4.f20389k - 1;
                jMax = Math.max(jMax, bVar4.b(i15) + jArr2[i15]);
            } else {
                c8 = c9;
                bVarArr = bVarArr3;
            }
            i13++;
            c9 = c8;
            bVarArr3 = bVarArr;
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j11 = this.f19997y.f20398d ? -9223372036854775807L : 0L;
            h4.c cVar3 = this.f19997y;
            boolean z5 = cVar3.f20398d;
            f1Var = new f1(j11, 0L, 0L, 0L, true, z5, z5, cVar3, j());
        } else {
            h4.c cVar4 = this.f19997y;
            if (cVar4.f20398d) {
                long j12 = cVar4.f20402h;
                if (j12 != -9223372036854775807L && j12 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j12);
                }
                long j13 = jMax2;
                long j14 = jMax - j13;
                long jM = j14 - z.M(this.f19988p);
                if (jM < 5000000) {
                    jM = Math.min(5000000L, j14 / 2);
                }
                f1Var = new f1(-9223372036854775807L, j14, j13, jM, true, true, true, this.f19997y, j());
            } else {
                long j15 = cVar4.f20401g;
                if (j15 == -9223372036854775807L) {
                    j15 = jMax - jMax2;
                }
                long j16 = j15;
                long j17 = jMax2;
                f1Var = new f1(-9223372036854775807L, -9223372036854775807L, j17 + j16, j16, j17, 0L, true, false, false, this.f19997y, j(), null);
            }
        }
        q(f1Var);
    }

    public final void y() {
        if (this.f19993u.c()) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.f19982j;
        h5.m(uri, "The uri must be set.");
        q qVar = new q(this.f19992t, new l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, this.f19990r);
        this.f19993u.f(qVar, this, this.f19987o.e(qVar.f28676d));
    }
}
