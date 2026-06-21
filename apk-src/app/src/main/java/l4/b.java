package l4;

import ad.g0;
import ad.j0;
import android.os.SystemClock;
import j3.p0;
import java.util.ArrayList;
import java.util.List;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m4.e f27811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f27812h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f27813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f27815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f27816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f27817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j0 f27818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m3.t f27819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f27820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f27821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f27822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f27823t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j4.m f27824u;

    public b(p0 p0Var, int[] iArr, m4.e eVar, long j10, long j11, long j12, j0 j0Var) {
        super(p0Var, iArr);
        if (j12 < j10) {
            m3.b.s("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f27811g = eVar;
        this.f27812h = j10 * 1000;
        this.i = j11 * 1000;
        this.f27813j = j12 * 1000;
        this.f27814k = 1279;
        this.f27815l = 719;
        this.f27816m = 0.7f;
        this.f27817n = 0.75f;
        this.f27818o = j0.r(j0Var);
        this.f27819p = m3.t.f28598a;
        this.f27820q = 1.0f;
        this.f27822s = 0;
        this.f27823t = -9223372036854775807L;
    }

    public static void u(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            g0 g0Var = (g0) arrayList.get(i);
            if (g0Var != null) {
                g0Var.b(new a(j10, jArr[i]));
            }
        }
    }

    public static long w(List list) {
        if (!list.isEmpty()) {
            j4.m mVar = (j4.m) ad.q.j(list);
            long j10 = mVar.f26475h;
            if (j10 != -9223372036854775807L) {
                long j11 = mVar.i;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // l4.r
    public final int c() {
        return this.f27821r;
    }

    @Override // l4.c, l4.r
    public final void disable() {
        this.f27824u = null;
    }

    @Override // l4.c, l4.r
    public final void g() {
        this.f27823t = -9223372036854775807L;
        this.f27824u = null;
    }

    @Override // l4.c, l4.r
    public final int i(long j10, List list) {
        int i;
        int i10;
        this.f27819p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f27823t;
        if (j11 != -9223372036854775807L && jElapsedRealtime - j11 < 1000 && (list.isEmpty() || ((j4.m) ad.q.j(list)).equals(this.f27824u))) {
            return list.size();
        }
        this.f27823t = jElapsedRealtime;
        this.f27824u = list.isEmpty() ? null : (j4.m) ad.q.j(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jC = z.C(((j4.m) list.get(size - 1)).f26475h - j10, this.f27820q);
        long j12 = this.f27813j;
        if (jC >= j12) {
            w(list);
            j3.o oVar = this.f27828d[v(jElapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                j4.m mVar = (j4.m) list.get(i11);
                j3.o oVar2 = mVar.f26472e;
                if (z.C(mVar.f26475h - j10, this.f27820q) >= j12 && oVar2.f26331j < oVar.f26331j && (i = oVar2.f26343v) != -1 && i <= this.f27815l && (i10 = oVar2.f26342u) != -1 && i10 <= this.f27814k && i < oVar.f26343v) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override // l4.r
    public final int m() {
        return this.f27822s;
    }

    @Override // l4.c, l4.r
    public final void o(float f10) {
        this.f27820q = f10;
    }

    @Override // l4.r
    public final Object p() {
        return null;
    }

    @Override // l4.r
    public final void s(long j10, long j11, long j12, List list, j4.n[] nVarArr) {
        long jW;
        this.f27819p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.f27821r;
        if (i >= nVarArr.length || !nVarArr[i].next()) {
            int length = nVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    jW = w(list);
                    break;
                }
                j4.n nVar = nVarArr[i10];
                if (nVar.next()) {
                    jW = nVar.i() - nVar.b();
                    break;
                }
                i10++;
            }
        } else {
            j4.n nVar2 = nVarArr[this.f27821r];
            jW = nVar2.i() - nVar2.b();
        }
        int i11 = this.f27822s;
        if (i11 == 0) {
            this.f27822s = 1;
            this.f27821r = v(jElapsedRealtime);
            return;
        }
        int i12 = this.f27821r;
        int iK = list.isEmpty() ? -1 : k(((j4.m) ad.q.j(list)).f26472e);
        if (iK != -1) {
            i11 = ((j4.m) ad.q.j(list)).f26473f;
            i12 = iK;
        }
        int iV = v(jElapsedRealtime);
        if (iV != i12 && !a(i12, jElapsedRealtime)) {
            j3.o[] oVarArr = this.f27828d;
            j3.o oVar = oVarArr[i12];
            j3.o oVar2 = oVarArr[iV];
            long jMin = this.f27812h;
            if (j12 != -9223372036854775807L) {
                jMin = Math.min((long) ((jW != -9223372036854775807L ? j12 - jW : j12) * this.f27817n), jMin);
            }
            int i13 = oVar2.f26331j;
            int i14 = oVar.f26331j;
            if ((i13 > i14 && j11 < jMin) || (i13 < i14 && j11 >= this.i)) {
                iV = i12;
            }
        }
        if (iV != i12) {
            i11 = 3;
        }
        this.f27822s = i11;
        this.f27821r = iV;
    }

    public final int v(long j10) {
        long j11;
        m4.h hVar = (m4.h) this.f27811g;
        synchronized (hVar) {
            j11 = hVar.f28655l;
        }
        long j12 = (long) (j11 * this.f27816m);
        this.f27811g.getClass();
        long j13 = (long) (j12 / this.f27820q);
        if (!this.f27818o.isEmpty()) {
            int i = 1;
            while (i < this.f27818o.size() - 1 && ((a) this.f27818o.get(i)).f27809a < j13) {
                i++;
            }
            a aVar = (a) this.f27818o.get(i - 1);
            a aVar2 = (a) this.f27818o.get(i);
            long j14 = aVar.f27809a;
            long j15 = aVar.f27810b;
            j13 = j15 + ((long) (((j13 - j14) / (aVar2.f27809a - j14)) * (aVar2.f27810b - j15)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f27826b; i11++) {
            if (j10 == Long.MIN_VALUE || !a(i11, j10)) {
                if (this.f27828d[i11].f26331j <= j13) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
