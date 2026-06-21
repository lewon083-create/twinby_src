package yads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wv extends ry {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mo f44481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f44482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f44483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f44484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f44485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f44486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f44487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u63 f44488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public uv f44489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public vv f44490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f44491u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f44492v;

    public wv(mo moVar, long j10, long j11, boolean z5, boolean z10, boolean z11) {
        ni.a(j10 >= 0);
        this.f44481k = (mo) ni.a(moVar);
        this.f44482l = j10;
        this.f44483m = j11;
        this.f44484n = z5;
        this.f44485o = z10;
        this.f44486p = z11;
        this.f44487q = new ArrayList();
        this.f44488r = new u63();
    }

    @Override // yads.mo
    public final void a(u83 u83Var) {
        this.f42764j = u83Var;
        this.i = lb3.a((Handler.Callback) null);
        a((Object) null, this.f44481k);
    }

    @Override // yads.ry
    /* JADX INFO: renamed from: b */
    public final void a(Object obj, mo moVar, v63 v63Var) {
        if (this.f44490t != null) {
            return;
        }
        b(v63Var);
    }

    @Override // yads.mo
    public final hm1 c() {
        return this.f44481k.c();
    }

    @Override // yads.ry, yads.mo
    public final void d() throws vv {
        vv vvVar = this.f44490t;
        if (vvVar != null) {
            throw vvVar;
        }
        super.d();
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        super.e();
        this.f44490t = null;
        this.f44489s = null;
    }

    public final void b(v63 v63Var) {
        long j10;
        long j11;
        long j12;
        v63Var.a(0, this.f44488r, 0L);
        long j13 = this.f44488r.f43594r;
        if (this.f44489s != null && !this.f44487q.isEmpty() && !this.f44485o) {
            long j14 = this.f44491u - j13;
            j12 = this.f44483m != Long.MIN_VALUE ? this.f44492v - j13 : Long.MIN_VALUE;
            j11 = j14;
        } else {
            long j15 = this.f44482l;
            long j16 = this.f44483m;
            if (this.f44486p) {
                long j17 = this.f44488r.f43590n;
                j15 += j17;
                j10 = j17 + j16;
            } else {
                j10 = j16;
            }
            this.f44491u = j13 + j15;
            this.f44492v = j16 != Long.MIN_VALUE ? j13 + j10 : Long.MIN_VALUE;
            int size = this.f44487q.size();
            for (int i = 0; i < size; i++) {
                tv tvVar = (tv) this.f44487q.get(i);
                long j18 = this.f44491u;
                long j19 = this.f44492v;
                tvVar.f43449f = j18;
                tvVar.f43450g = j19;
            }
            j11 = j15;
            j12 = j10;
        }
        try {
            uv uvVar = new uv(v63Var, j11, j12);
            this.f44489s = uvVar;
            a(uvVar);
        } catch (vv e3) {
            this.f44490t = e3;
            for (int i10 = 0; i10 < this.f44487q.size(); i10++) {
                ((tv) this.f44487q.get(i10)).f43451h = this.f44490t;
            }
        }
    }

    @Override // yads.mo
    public final void a(rm1 rm1Var) {
        if (this.f44487q.remove(rm1Var)) {
            this.f44481k.a(((tv) rm1Var).f43445b);
            if (!this.f44487q.isEmpty() || this.f44485o) {
                return;
            }
            uv uvVar = this.f44489s;
            uvVar.getClass();
            b(uvVar.f42417c);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final rm1 a(an1 an1Var, qe qeVar, long j10) {
        tv tvVar = new tv(this.f44481k.a(an1Var, qeVar, j10), this.f44484n, this.f44491u, this.f44492v);
        this.f44487q.add(tvVar);
        return tvVar;
    }
}
