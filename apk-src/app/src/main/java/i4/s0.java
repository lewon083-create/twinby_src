package i4;

import android.net.Uri;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements m4.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f20996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.c0 f20997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bb.e f20998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f20999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.f f21000f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f21002h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p3.l f21004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q4.a0 f21005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v0 f21007n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e2 f21001g = new e2();
    public boolean i = true;

    public s0(v0 v0Var, Uri uri, p3.h hVar, bb.e eVar, v0 v0Var2, m3.f fVar) {
        this.f21007n = v0Var;
        this.f20996b = uri;
        this.f20997c = new p3.c0(hVar);
        this.f20998d = eVar;
        this.f20999e = v0Var2;
        this.f21000f = fVar;
        u.f21015b.getAndIncrement();
        this.f21004k = a(0L, null);
    }

    public final p3.l a(long j10, String str) {
        Map mapD = v0.R;
        if (str != null && !str.startsWith("W/")) {
            ad.m0 m0Var = new ad.m0(4, 0);
            m0Var.o(mapD.entrySet());
            m0Var.n("If-Range", str);
            mapD = m0Var.d(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.f20996b;
        h5.m(uri, "The uri must be set.");
        return new p3.l(uri, 0L, 1, null, mapD, j10, -1L, null, 6);
    }

    @Override // m4.k
    public final void d() {
        this.f21002h = true;
    }

    @Override // m4.k
    public final void load() {
        p3.h tVar;
        q4.k kVar;
        int i;
        int iA = 0;
        String str = null;
        while (iA == 0 && !this.f21002h) {
            try {
                long j10 = this.f21001g.f4793b;
                p3.l lVarA = a(j10, str);
                this.f21004k = lVarA;
                long jOpen = this.f20997c.open(lVarA);
                if (this.f21002h) {
                    if (iA != 1 && this.f20998d.s() != -1) {
                        this.f21001g.f4793b = this.f20998d.s();
                    }
                    j4.g(this.f20997c);
                    return;
                }
                List list = (List) this.f20997c.f31131b.getResponseHeaders().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jOpen != -1) {
                    jOpen += j10;
                    v0 v0Var = this.f21007n;
                    v0Var.f21041r.post(new o0(v0Var, 0));
                }
                long j11 = jOpen;
                this.f21007n.f21043t = d5.b.d(this.f20997c.f31131b.getResponseHeaders());
                p3.c0 c0Var = this.f20997c;
                d5.b bVar = this.f21007n.f21043t;
                if (bVar == null || (i = bVar.f15566f) == -1) {
                    tVar = c0Var;
                } else {
                    tVar = new t(c0Var, i, this);
                    q4.a0 a0VarT = this.f21007n.t(new u0(0, true));
                    this.f21005l = a0VarT;
                    a0VarT.a(v0.S);
                }
                this.f20998d.w(tVar, this.f20996b, this.f20997c.f31131b.getResponseHeaders(), j10, j11, this.f20999e);
                if (this.f21007n.f21043t != null && (kVar = (q4.k) this.f20998d.f2020d) != null && (kVar instanceof j5.d)) {
                    ((j5.d) kVar).f26553s = true;
                }
                if (this.i) {
                    bb.e eVar = this.f20998d;
                    long j12 = this.f21003j;
                    q4.k kVar2 = (q4.k) eVar.f2020d;
                    kVar2.getClass();
                    kVar2.seek(j10, j12);
                    this.i = false;
                }
                while (iA == 0 && !this.f21002h) {
                    try {
                        m3.f fVar = this.f21000f;
                        synchronized (fVar) {
                            while (!fVar.f28562b) {
                                fVar.f28561a.getClass();
                                fVar.wait();
                            }
                        }
                        bb.e eVar2 = this.f20998d;
                        e2 e2Var = this.f21001g;
                        q4.k kVar3 = (q4.k) eVar2.f2020d;
                        kVar3.getClass();
                        q4.h hVar = (q4.h) eVar2.f2021e;
                        hVar.getClass();
                        iA = kVar3.a(hVar, e2Var);
                        long jS = this.f20998d.s();
                        if (jS > this.f21007n.f21033j + j10) {
                            m3.f fVar2 = this.f21000f;
                            synchronized (fVar2) {
                                fVar2.f28562b = false;
                            }
                            v0 v0Var2 = this.f21007n;
                            v0Var2.f21041r.post(v0Var2.f21040q);
                            j10 = jS;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iA == 1) {
                    iA = 0;
                } else if (this.f20998d.s() != -1) {
                    this.f21001g.f4793b = this.f20998d.s();
                }
                j4.g(this.f20997c);
            } catch (Throwable th2) {
                if (iA != 1 && this.f20998d.s() != -1) {
                    this.f21001g.f4793b = this.f20998d.s();
                }
                j4.g(this.f20997c);
                throw th2;
            }
        }
    }
}
