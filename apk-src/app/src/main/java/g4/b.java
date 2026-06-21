package g4;

import ad.b1;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.measurement.h5;
import d8.e0;
import hl.l;
import j4.e;
import j4.f;
import j4.j;
import j4.k;
import j4.m;
import j4.n;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k5.q;
import l4.r;
import l7.i;
import m3.z;
import m4.o;
import p3.h;
import s3.c1;
import s3.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f19961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e[] f19963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f19964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f19965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h4.c f19966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i4.b f19968h;

    public b(o oVar, h4.c cVar, int i, r rVar, h hVar, i iVar, boolean z5) {
        k5.r[] rVarArr;
        this.f19961a = oVar;
        this.f19966f = cVar;
        this.f19962b = i;
        this.f19965e = rVar;
        this.f19964d = hVar;
        h4.b bVar = cVar.f20400f[i];
        this.f19963c = new e[rVar.length()];
        for (int i10 = 0; i10 < this.f19963c.length; i10++) {
            int iH = rVar.h(i10);
            j3.o oVar2 = bVar.f20388j[iH];
            if (oVar2.f26339r != null) {
                h4.a aVar = cVar.f20399e;
                aVar.getClass();
                rVarArr = aVar.f20379c;
            } else {
                rVarArr = null;
            }
            k5.r[] rVarArr2 = rVarArr;
            int i11 = bVar.f20380a;
            int i12 = i11 == 2 ? 4 : 0;
            long j10 = bVar.f20382c;
            long j11 = cVar.f20401g;
            this.f19963c[i10] = new e(new k5.h(iVar, !z5 ? 35 : 3, null, new q(iH, i11, j10, -9223372036854775807L, j11, j11, oVar2, 0, rVarArr2, i12, null, null), b1.f768f, null), bVar.f20380a, oVar2);
        }
    }

    @Override // j4.j
    public final void a() throws i4.b {
        i4.b bVar = this.f19968h;
        if (bVar != null) {
            throw bVar;
        }
        this.f19961a.a();
    }

    @Override // j4.j
    public final long b(long j10, c1 c1Var) {
        h4.b bVar = this.f19966f.f20400f[this.f19962b];
        int iF = z.f(bVar.f20393o, j10, true);
        long[] jArr = bVar.f20393o;
        long j11 = jArr[iF];
        return c1Var.a(j10, j11, (j11 >= j10 || iF >= bVar.f20389k - 1) ? j11 : jArr[iF + 1]);
    }

    @Override // j4.j
    public final boolean c(long j10, f fVar, List list) {
        if (this.f19968h != null) {
            return false;
        }
        return this.f19965e.d(j10, fVar, list);
    }

    @Override // j4.j
    public final boolean d(f fVar, boolean z5, e0 e0Var, le.a aVar) {
        nl0 nl0VarI = l.i(this.f19965e);
        aVar.getClass();
        com.google.android.gms.internal.ads.o oVarD = le.a.d(nl0VarI, e0Var);
        if (!z5 || oVarD == null || oVarD.f8527a != 2) {
            return false;
        }
        r rVar = this.f19965e;
        return rVar.n(rVar.k(fVar.f26472e), oVarD.f8528b);
    }

    @Override // j4.j
    public final int e(long j10, List list) {
        return (this.f19968h != null || this.f19965e.length() < 2) ? list.size() : this.f19965e.i(j10, list);
    }

    @Override // j4.j
    public final void f(h0 h0Var, long j10, List list, ac.c cVar) {
        List list2;
        int iA;
        long jB;
        if (this.f19968h != null) {
            return;
        }
        h4.b[] bVarArr = this.f19966f.f20400f;
        int i = this.f19962b;
        h4.b bVar = bVarArr[i];
        int i10 = bVar.f20389k;
        long[] jArr = bVar.f20393o;
        if (i10 == 0) {
            cVar.f738b = !r4.f20398d;
            return;
        }
        if (list.isEmpty()) {
            iA = z.f(jArr, j10, true);
            list2 = list;
        } else {
            list2 = list;
            iA = (int) (((m) list2.get(list.size() - 1)).a() - ((long) this.f19967g));
            if (iA < 0) {
                this.f19968h = new i4.b();
                return;
            }
        }
        if (iA >= bVar.f20389k) {
            cVar.f738b = !this.f19966f.f20398d;
            return;
        }
        long j11 = h0Var.f32550a;
        long j12 = j10 - j11;
        h4.c cVar2 = this.f19966f;
        if (cVar2.f20398d) {
            h4.b bVar2 = cVar2.f20400f[i];
            int i11 = bVar2.f20389k - 1;
            jB = (bVar2.b(i11) + bVar2.f20393o[i11]) - j11;
        } else {
            jB = -9223372036854775807L;
        }
        int length = this.f19965e.length();
        n[] nVarArr = new n[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.f19965e.h(i12);
            nVarArr[i12] = new a(bVar, iA);
        }
        this.f19965e.s(j11, j12, jB, list2, nVarArr);
        long j13 = jArr[iA];
        long jB2 = bVar.b(iA) + j13;
        long j14 = list.isEmpty() ? j10 : -9223372036854775807L;
        int i13 = this.f19967g + iA;
        int iC = this.f19965e.c();
        e eVar = this.f19963c[iC];
        int iH = this.f19965e.h(iC);
        List list3 = bVar.f20392n;
        j3.o[] oVarArr = bVar.f20388j;
        h5.r(oVarArr != null);
        h5.r(list3 != null);
        h5.r(iA < list3.size());
        String string = Integer.toString(oVarArr[iH].f26331j);
        String string2 = ((Long) list3.get(iA)).toString();
        Uri uriQ = m3.b.q(bVar.f20390l, bVar.f20391m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        SystemClock.elapsedRealtime();
        j3.o oVarL = this.f19965e.l();
        int iM = this.f19965e.m();
        Object objP = this.f19965e.p();
        Map map = Collections.EMPTY_MAP;
        h5.m(uriQ, "The uri must be set.");
        cVar.f739c = new k(this.f19964d, new p3.l(uriQ, 0L, 1, null, map, 0L, -1L, null, 0), oVarL, iM, objP, j13, jB2, j14, -9223372036854775807L, i13, 1, j13, eVar);
    }

    @Override // j4.j
    public final void release() {
        for (e eVar : this.f19963c) {
            eVar.f26460b.release();
        }
    }

    @Override // j4.j
    public final void g(f fVar) {
    }
}
