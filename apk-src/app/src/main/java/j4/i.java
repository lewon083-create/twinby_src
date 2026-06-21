package j4;

import com.google.android.gms.internal.measurement.h5;
import d8.e0;
import i4.a1;
import i4.b1;
import i4.c1;
import i4.d1;
import i4.i0;
import i4.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.z;
import p3.c0;
import s3.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements b1, d1, m4.i, m4.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f26483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j3.o[] f26484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f26485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f26486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f26487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f26488h;
    public final le.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m4.n f26489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ac.c f26490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f26491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f26492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a1 f26493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a1[] f26494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h3.e f26495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f26496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j3.o f26497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f26498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f26499t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f26500u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f26501v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f26502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f26503x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f26504y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f26505z;

    public i(int i, int[] iArr, j3.o[] oVarArr, j jVar, c1 c1Var, bb.e eVar, long j10, x3.h hVar, i0 i0Var, le.a aVar, i0 i0Var2, boolean z5, n4.a aVar2) {
        this.f26482b = i;
        int i10 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f26483c = iArr;
        this.f26484d = oVarArr == null ? new j3.o[0] : oVarArr;
        this.f26486f = jVar;
        this.f26487g = c1Var;
        this.f26488h = i0Var2;
        this.i = aVar;
        this.f26503x = z5;
        this.f26489j = aVar2 != null ? new m4.n(aVar2) : new m4.n("ChunkSampleStream");
        this.f26490k = new ac.c();
        ArrayList arrayList = new ArrayList();
        this.f26491l = arrayList;
        this.f26492m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f26494o = new a1[length];
        this.f26485e = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        a1[] a1VarArr = new a1[i11];
        hVar.getClass();
        a1 a1Var = new a1(eVar, hVar, i0Var);
        this.f26493n = a1Var;
        iArr2[0] = i;
        a1VarArr[0] = a1Var;
        while (i10 < length) {
            a1 a1Var2 = new a1(eVar, null, null);
            this.f26494o[i10] = a1Var2;
            int i12 = i10 + 1;
            a1VarArr[i12] = a1Var2;
            iArr2[i12] = this.f26483c[i10];
            i10 = i12;
        }
        this.f26495p = new h3.e(20, iArr2, a1VarArr);
        this.f26499t = j10;
        this.f26500u = j10;
    }

    @Override // i4.b1
    public final void a() throws x3.c {
        m4.n nVar = this.f26489j;
        nVar.a();
        this.f26493n.z();
        if (nVar.d()) {
            return;
        }
        this.f26486f.a();
    }

    @Override // m4.l
    public final void c() {
        this.f26493n.D();
        for (a1 a1Var : this.f26494o) {
            a1Var.D();
        }
        this.f26486f.release();
        h hVar = this.f26498s;
        if (hVar != null) {
            v3.b bVar = (v3.b) hVar;
            synchronized (bVar) {
                v3.k kVar = (v3.k) bVar.f34661o.remove(this);
                if (kVar != null) {
                    kVar.f34724a.D();
                }
            }
        }
    }

    @Override // i4.b1
    public final int d(r3.b bVar, r3.e eVar, int i) {
        if (q()) {
            return -3;
        }
        a aVar = this.f26502w;
        a1 a1Var = this.f26493n;
        if (aVar != null && aVar.c(0) <= a1Var.t()) {
            return -3;
        }
        r();
        return a1Var.C(bVar, eVar, i, this.f26505z);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [i4.c1, java.lang.Object] */
    @Override // m4.i
    public final void e(m4.k kVar, long j10, long j11) {
        f fVar = (f) kVar;
        this.f26496q = null;
        this.f26486f.g(fVar);
        long j12 = fVar.f26469b;
        p3.l lVar = fVar.f26470c;
        c0 c0Var = fVar.f26476j;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        this.i.getClass();
        this.f26488h.e(uVar, fVar.f26471d, this.f26482b, fVar.f26472e, fVar.f26473f, fVar.f26474g, fVar.f26475h, fVar.i);
        this.f26487g.d(this);
    }

    public final void g(long j10) {
        long j11;
        if (q()) {
            return;
        }
        a1 a1Var = this.f26493n;
        int i = a1Var.f20848q;
        a1Var.j(j10, true);
        a1 a1Var2 = this.f26493n;
        int i10 = a1Var2.f20848q;
        if (i10 > i) {
            synchronized (a1Var2) {
                j11 = a1Var2.f20847p == 0 ? Long.MIN_VALUE : a1Var2.f20845n[a1Var2.f20849r];
            }
            int i11 = 0;
            while (true) {
                a1[] a1VarArr = this.f26494o;
                if (i11 >= a1VarArr.length) {
                    break;
                }
                a1VarArr[i11].j(j11, this.f26485e[i11]);
                i11++;
            }
        }
        int iMin = Math.min(s(i10, 0), this.f26501v);
        if (iMin > 0) {
            z.R(this.f26491l, 0, iMin);
            this.f26501v -= iMin;
        }
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        if (this.f26505z) {
            return Long.MIN_VALUE;
        }
        if (q()) {
            return this.f26499t;
        }
        long jMax = this.f26500u;
        a aVarN = n();
        if (!aVarN.b()) {
            ArrayList arrayList = this.f26491l;
            aVarN = arrayList.size() > 1 ? (a) gf.a.g(2, arrayList) : null;
        }
        if (aVarN != null) {
            jMax = Math.max(jMax, aVarN.i);
        }
        return Math.max(jMax, this.f26493n.q());
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        if (q()) {
            return this.f26499t;
        }
        if (this.f26505z) {
            return Long.MIN_VALUE;
        }
        return n().i;
    }

    @Override // i4.b1
    public final int h(long j10) {
        if (q()) {
            return 0;
        }
        boolean z5 = this.f26505z;
        a1 a1Var = this.f26493n;
        int iV = a1Var.v(j10, z5);
        a aVar = this.f26502w;
        if (aVar != null) {
            iV = Math.min(iV, aVar.c(0) - a1Var.t());
        }
        a1Var.H(iV);
        r();
        return iV;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [i4.c1, java.lang.Object] */
    @Override // m4.i
    public final com.google.android.gms.internal.ads.o i(m4.k kVar, long j10, long j11, IOException iOException, int i) {
        com.google.android.gms.internal.ads.o oVar;
        f fVar = (f) kVar;
        long j12 = fVar.f26476j.f31132c;
        boolean z5 = fVar instanceof a;
        ArrayList arrayList = this.f26491l;
        int size = arrayList.size() - 1;
        boolean z10 = (j12 != 0 && z5 && p(size)) ? false : true;
        p3.l lVar = fVar.f26470c;
        c0 c0Var = fVar.f26476j;
        boolean z11 = z10;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, j12);
        z.Z(fVar.f26475h);
        z.Z(fVar.i);
        e0 e0Var = new e0(iOException, i, 14);
        j jVar = this.f26486f;
        le.a aVar = this.i;
        if (!jVar.d(fVar, z11, e0Var, aVar)) {
            oVar = null;
        } else if (z11) {
            if (z5) {
                h5.r(j(size) == fVar);
                if (arrayList.isEmpty()) {
                    this.f26499t = this.f26500u;
                }
            }
            oVar = m4.n.f28669f;
        } else {
            m3.b.s("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            oVar = null;
        }
        if (oVar == null) {
            aVar.getClass();
            long jG = le.a.g(e0Var);
            oVar = jG != -9223372036854775807L ? new com.google.android.gms.internal.ads.o(0, jG, false) : m4.n.f28670g;
        }
        boolean zA = oVar.a();
        this.f26488h.f(uVar, fVar.f26471d, this.f26482b, fVar.f26472e, fVar.f26473f, fVar.f26474g, fVar.f26475h, fVar.i, iOException, !zA);
        if (!zA) {
            this.f26496q = null;
            aVar.getClass();
            this.f26487g.d(this);
        }
        return oVar;
    }

    @Override // i4.d1
    public final boolean isLoading() {
        return this.f26489j.d();
    }

    @Override // i4.b1
    public final boolean isReady() {
        return !q() && this.f26493n.x(this.f26505z);
    }

    public final a j(int i) {
        ArrayList arrayList = this.f26491l;
        a aVar = (a) arrayList.get(i);
        z.R(arrayList, i, arrayList.size());
        this.f26501v = Math.max(this.f26501v, arrayList.size());
        int i10 = 0;
        this.f26493n.n(aVar.c(0));
        while (true) {
            a1[] a1VarArr = this.f26494o;
            if (i10 >= a1VarArr.length) {
                return aVar;
            }
            a1 a1Var = a1VarArr[i10];
            i10++;
            a1Var.n(aVar.c(i10));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // i4.d1
    public final boolean l(h0 h0Var) {
        long j10;
        List list;
        if (!this.f26505z) {
            m4.n nVar = this.f26489j;
            if (!nVar.d() && !nVar.c()) {
                boolean zQ = q();
                if (zQ) {
                    list = Collections.EMPTY_LIST;
                    j10 = this.f26499t;
                } else {
                    j10 = n().i;
                    list = this.f26492m;
                }
                this.f26486f.f(h0Var, j10, list, this.f26490k);
                ac.c cVar = this.f26490k;
                boolean z5 = cVar.f738b;
                f fVar = (f) cVar.f739c;
                cVar.f739c = null;
                cVar.f738b = false;
                if (z5) {
                    this.f26499t = -9223372036854775807L;
                    this.f26505z = true;
                    return true;
                }
                if (fVar != null) {
                    this.f26496q = fVar;
                    boolean z10 = fVar instanceof a;
                    h3.e eVar = this.f26495p;
                    if (z10) {
                        a aVar = (a) fVar;
                        if (zQ) {
                            long j11 = aVar.f26475h;
                            long j12 = this.f26499t;
                            if (j11 < j12) {
                                this.f26493n.f20851t = j12;
                                for (a1 a1Var : this.f26494o) {
                                    a1Var.f20851t = this.f26499t;
                                }
                                if (this.f26503x) {
                                    j3.o oVar = aVar.f26472e;
                                    this.f26504y = !j3.c0.a(oVar.f26335n, oVar.f26332k);
                                }
                            }
                            this.f26503x = false;
                            this.f26499t = -9223372036854775807L;
                        }
                        aVar.f26446n = eVar;
                        a1[] a1VarArr = (a1[]) eVar.f20376d;
                        int[] iArr = new int[a1VarArr.length];
                        for (int i = 0; i < a1VarArr.length; i++) {
                            a1 a1Var2 = a1VarArr[i];
                            iArr[i] = a1Var2.f20848q + a1Var2.f20847p;
                        }
                        aVar.f26447o = iArr;
                        this.f26491l.add(aVar);
                    } else if (fVar instanceof l) {
                        ((l) fVar).f26513l = eVar;
                    }
                    nVar.f(fVar, this, this.i.e(fVar.f26471d));
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [i4.c1, java.lang.Object] */
    @Override // m4.i
    public final void m(m4.k kVar, long j10, long j11, boolean z5) {
        f fVar = (f) kVar;
        this.f26496q = null;
        this.f26502w = null;
        long j12 = fVar.f26469b;
        p3.l lVar = fVar.f26470c;
        c0 c0Var = fVar.f26476j;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        this.i.getClass();
        this.f26488h.c(uVar, fVar.f26471d, this.f26482b, fVar.f26472e, fVar.f26473f, fVar.f26474g, fVar.f26475h, fVar.i);
        if (z5) {
            return;
        }
        if (q()) {
            this.f26493n.E(false);
            for (a1 a1Var : this.f26494o) {
                a1Var.E(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.f26491l;
            j(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f26499t = this.f26500u;
            }
        }
        this.f26487g.d(this);
    }

    public final a n() {
        return (a) gf.a.g(1, this.f26491l);
    }

    @Override // m4.i
    public final void o(m4.k kVar, long j10, long j11, int i) {
        u uVar;
        f fVar = (f) kVar;
        if (i == 0) {
            long j12 = fVar.f26469b;
            uVar = new u(j10, fVar.f26470c);
        } else {
            long j13 = fVar.f26469b;
            p3.l lVar = fVar.f26470c;
            c0 c0Var = fVar.f26476j;
            uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        }
        this.f26488h.h(uVar, fVar.f26471d, this.f26482b, fVar.f26472e, fVar.f26473f, fVar.f26474g, fVar.f26475h, fVar.i, i);
    }

    public final boolean p(int i) {
        int iT;
        a aVar = (a) this.f26491l.get(i);
        if (this.f26493n.t() > aVar.c(0)) {
            return true;
        }
        int i10 = 0;
        do {
            a1[] a1VarArr = this.f26494o;
            if (i10 >= a1VarArr.length) {
                return false;
            }
            iT = a1VarArr[i10].t();
            i10++;
        } while (iT <= aVar.c(i10));
        return true;
    }

    public final boolean q() {
        return this.f26499t != -9223372036854775807L;
    }

    public final void r() {
        int iS = s(this.f26493n.t(), this.f26501v - 1);
        while (true) {
            int i = this.f26501v;
            if (i > iS) {
                return;
            }
            this.f26501v = i + 1;
            a aVar = (a) this.f26491l.get(i);
            j3.o oVar = aVar.f26472e;
            if (!oVar.equals(this.f26497r)) {
                this.f26488h.b(this.f26482b, oVar, aVar.f26473f, aVar.f26474g, aVar.f26475h);
            }
            this.f26497r = oVar;
        }
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
        m4.n nVar = this.f26489j;
        if (nVar.c() || q()) {
            return;
        }
        boolean zD = nVar.d();
        List list = this.f26492m;
        j jVar = this.f26486f;
        ArrayList arrayList = this.f26491l;
        if (zD) {
            f fVar = this.f26496q;
            fVar.getClass();
            boolean z5 = fVar instanceof a;
            if (!(z5 && p(arrayList.size() - 1)) && jVar.c(j10, fVar, list)) {
                nVar.b();
                if (z5) {
                    this.f26502w = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int iE = jVar.e(j10, list);
        if (iE < arrayList.size()) {
            h5.r(!nVar.d());
            int size = arrayList.size();
            while (true) {
                if (iE >= size) {
                    iE = -1;
                    break;
                } else if (!p(iE)) {
                    break;
                } else {
                    iE++;
                }
            }
            if (iE == -1) {
                return;
            }
            long j11 = n().i;
            a aVarJ = j(iE);
            if (arrayList.isEmpty()) {
                this.f26499t = this.f26500u;
            }
            this.f26505z = false;
            this.f26488h.i(this.f26482b, aVarJ.f26475h, j11);
        }
    }

    public final int s(int i, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.f26491l;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).c(0) <= i);
        return i10 - 1;
    }

    public final void t(v3.b bVar) {
        this.f26498s = bVar;
        a1 a1Var = this.f26493n;
        a1Var.k();
        ni.i iVar = a1Var.f20840h;
        if (iVar != null) {
            iVar.A(a1Var.f20837e);
            a1Var.f20840h = null;
            a1Var.f20839g = null;
        }
        for (a1 a1Var2 : this.f26494o) {
            a1Var2.k();
            ni.i iVar2 = a1Var2.f20840h;
            if (iVar2 != null) {
                iVar2.A(a1Var2.f20837e);
                a1Var2.f20840h = null;
                a1Var2.f20839g = null;
            }
        }
        this.f26489j.e(this);
    }

    public final void u(long j10) {
        ArrayList arrayList;
        a aVar;
        boolean zG;
        this.f26500u = j10;
        int i = 0;
        this.f26503x = false;
        if (q()) {
            this.f26499t = j10;
            return;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.f26491l;
            if (i10 >= arrayList.size()) {
                break;
            }
            aVar = (a) arrayList.get(i10);
            long j11 = aVar.f26475h;
            if (j11 == j10 && aVar.f26444l == -9223372036854775807L) {
                break;
            } else if (j11 > j10) {
                break;
            } else {
                i10++;
            }
        }
        aVar = null;
        a1 a1Var = this.f26493n;
        if (aVar != null) {
            zG = a1Var.F(aVar.c(0));
        } else {
            long nextLoadPositionUs = getNextLoadPositionUs();
            zG = a1Var.G(j10, nextLoadPositionUs == Long.MIN_VALUE || j10 < nextLoadPositionUs);
        }
        a1[] a1VarArr = this.f26494o;
        if (zG) {
            this.f26501v = s(a1Var.t(), 0);
            int length = a1VarArr.length;
            while (i < length) {
                a1VarArr[i].G(j10, true);
                i++;
            }
            return;
        }
        this.f26499t = j10;
        this.f26505z = false;
        arrayList.clear();
        this.f26501v = 0;
        m4.n nVar = this.f26489j;
        if (nVar.d()) {
            a1Var.k();
            int length2 = a1VarArr.length;
            while (i < length2) {
                a1VarArr[i].k();
                i++;
            }
            nVar.b();
            return;
        }
        nVar.f28673d = null;
        a1Var.E(false);
        for (a1 a1Var2 : a1VarArr) {
            a1Var2.E(false);
        }
    }
}
