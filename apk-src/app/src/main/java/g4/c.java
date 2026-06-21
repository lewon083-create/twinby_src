package g4;

import ad.b1;
import ad.h0;
import ad.j0;
import ad.q;
import bb.e;
import com.google.android.gms.internal.measurement.i4;
import fh.nd;
import fj.k0;
import i4.a0;
import i4.c1;
import i4.d1;
import i4.i0;
import i4.j1;
import i4.n;
import i4.z;
import j3.c0;
import j3.p0;
import j4.i;
import java.util.AbstractList;
import java.util.ArrayList;
import l4.r;
import m4.o;
import p3.e0;
import p3.g;
import x3.h;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a0, c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4 f19969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f19970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f19971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f19972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f19973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final le.a f19974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f19975h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j1 f19976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nd f19977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z f19978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h4.c f19979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i[] f19980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n f19981o;

    public c(h4.c cVar, i4 i4Var, e0 e0Var, nd ndVar, h hVar, i0 i0Var, le.a aVar, i0 i0Var2, o oVar, e eVar) {
        this.f19979m = cVar;
        this.f19969b = i4Var;
        this.f19970c = e0Var;
        this.f19971d = oVar;
        this.f19972e = hVar;
        this.f19973f = i0Var;
        this.f19974g = aVar;
        this.f19975h = i0Var2;
        this.i = eVar;
        this.f19977k = ndVar;
        p0[] p0VarArr = new p0[cVar.f20400f.length];
        int i = 0;
        while (true) {
            h4.b[] bVarArr = cVar.f20400f;
            if (i >= bVarArr.length) {
                this.f19976j = new j1(p0VarArr);
                this.f19980n = new i[0];
                ndVar.getClass();
                h0 h0Var = j0.f818c;
                b1 b1Var = b1.f768f;
                this.f19981o = new n(b1Var, b1Var);
                return;
            }
            j3.o[] oVarArr = bVarArr[i].f20388j;
            j3.o[] oVarArr2 = new j3.o[oVarArr.length];
            for (int i10 = 0; i10 < oVarArr.length; i10++) {
                j3.o oVar2 = oVarArr[i10];
                j3.n nVarA = oVar2.a();
                nVarA.N = hVar.a(oVar2);
                j3.o oVar3 = new j3.o(nVarA);
                if (i4Var.f13781b && ((l7.i) i4Var.f13783d).c(oVar3)) {
                    j3.n nVarA2 = oVar3.a();
                    nVarA2.f26292m = c0.n("application/x-media3-cues");
                    nVarA2.K = ((l7.i) i4Var.f13783d).a(oVar3);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(oVar3.f26335n);
                    String str = oVar3.f26332k;
                    sb2.append(str != null ? " ".concat(str) : "");
                    nVarA2.f26289j = sb2.toString();
                    nVarA2.f26297r = Long.MAX_VALUE;
                    oVar3 = new j3.o(nVarA2);
                }
                oVarArr2[i10] = oVar3;
            }
            p0VarArr[i] = new p0(Integer.toString(i), oVarArr2);
            i++;
        }
    }

    @Override // i4.a0
    public final long b(long j10, s3.c1 c1Var) {
        for (i iVar : this.f19980n) {
            if (iVar.f26482b == 2) {
                return iVar.f26486f.b(j10, c1Var);
            }
        }
        return j10;
    }

    @Override // i4.c1
    public final void d(d1 d1Var) {
        z zVar = this.f19978l;
        zVar.getClass();
        zVar.d(this);
    }

    @Override // i4.a0
    public final long f(r[] rVarArr, boolean[] zArr, i4.b1[] b1VarArr, boolean[] zArr2, long j10) {
        ArrayList arrayList;
        int i;
        r rVar;
        r[] rVarArr2 = rVarArr;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (i10 < rVarArr2.length) {
            i4.b1 b1Var = b1VarArr[i10];
            if (b1Var != null) {
                i iVar = (i) b1Var;
                r rVar2 = rVarArr2[i10];
                if (rVar2 == null || !zArr[i10]) {
                    iVar.t(null);
                    b1VarArr[i10] = null;
                } else {
                    ((b) iVar.f26486f).f19965e = rVar2;
                    arrayList2.add(iVar);
                }
            }
            if (b1VarArr[i10] != null || (rVar = rVarArr2[i10]) == null) {
                arrayList = arrayList2;
                i = i10;
            } else {
                int iB = this.f19976j.b(rVar.b());
                h4.c cVar = this.f19979m;
                i4 i4Var = this.f19969b;
                p3.h hVarCreateDataSource = ((g) i4Var.f13782c).createDataSource();
                e0 e0Var = this.f19970c;
                if (e0Var != null) {
                    hVarCreateDataSource.addTransferListener(e0Var);
                }
                i = i10;
                arrayList = arrayList2;
                i iVar2 = new i(this.f19979m.f20400f[iB].f20380a, null, null, new b(this.f19971d, cVar, iB, rVar, hVarCreateDataSource, (l7.i) i4Var.f13783d, i4Var.f13781b), this, this.i, j10, this.f19972e, this.f19973f, this.f19974g, this.f19975h, false, null);
                arrayList.add(iVar2);
                b1VarArr[i] = iVar2;
                zArr2[i] = true;
            }
            i10 = i + 1;
            arrayList2 = arrayList;
            rVarArr2 = rVarArr;
        }
        ArrayList arrayList3 = arrayList2;
        i[] iVarArr = new i[arrayList3.size()];
        this.f19980n = iVarArr;
        arrayList3.toArray(iVarArr);
        AbstractList abstractListU = q.u(arrayList3, new k0(11));
        this.f19977k.getClass();
        this.f19981o = new n(arrayList3, abstractListU);
        return j10;
    }

    @Override // i4.a0
    public final void g(long j10) {
        for (i iVar : this.f19980n) {
            iVar.g(j10);
        }
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        return this.f19981o.getBufferedPositionUs();
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        return this.f19981o.getNextLoadPositionUs();
    }

    @Override // i4.a0
    public final j1 getTrackGroups() {
        return this.f19976j;
    }

    @Override // i4.d1
    public final boolean isLoading() {
        return this.f19981o.isLoading();
    }

    @Override // i4.a0
    public final void k(z zVar, long j10) {
        this.f19978l = zVar;
        zVar.j(this);
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        return this.f19981o.l(h0Var);
    }

    @Override // i4.a0
    public final void maybeThrowPrepareError() {
        this.f19971d.a();
    }

    @Override // i4.a0
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
        this.f19981o.reevaluateBuffer(j10);
    }

    @Override // i4.a0
    public final long seekToUs(long j10) {
        for (i iVar : this.f19980n) {
            iVar.u(j10);
        }
        return j10;
    }
}
