package y3;

import ad.j0;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.xt1;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.i4;
import d8.e0;
import i4.d1;
import i4.i0;
import i4.j1;
import i4.u;
import i4.z0;
import j3.b0;
import j3.c0;
import j3.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m3.z;
import p3.w;
import q4.a0;
import s3.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements m4.i, m4.l, d1, q4.m, z0 {
    public static final Set Z = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public o A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public j3.o G;
    public j3.o H;
    public boolean I;
    public j1 J;
    public Set K;
    public int[] L;
    public int M;
    public boolean N;
    public boolean[] O;
    public boolean[] P;
    public long Q;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public long W;
    public j3.l X;
    public j Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ni.i f36403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f36404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bb.e f36405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j3.o f36406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x3.h f36407h;
    public final i0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final le.a f36408j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m4.n f36409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0 f36410l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f36411m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i4 f36412n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f36413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f36414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f36415q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f36416r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f36417s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f36418t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Map f36419u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j4.f f36420v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p[] f36421w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f36422x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashSet f36423y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SparseIntArray f36424z;

    /* JADX WARN: Type inference failed for: r2v13, types: [y3.n] */
    /* JADX WARN: Type inference failed for: r2v14, types: [y3.n] */
    public q(String str, int i, ni.i iVar, i iVar2, Map map, bb.e eVar, long j10, j3.o oVar, x3.h hVar, i0 i0Var, le.a aVar, i0 i0Var2, int i10, n4.a aVar2) {
        this.f36401b = str;
        this.f36402c = i;
        this.f36403d = iVar;
        this.f36404e = iVar2;
        this.f36419u = map;
        this.f36405f = eVar;
        this.f36406g = oVar;
        this.f36407h = hVar;
        this.i = i0Var;
        this.f36408j = aVar;
        this.f36410l = i0Var2;
        this.f36411m = i10;
        this.f36409k = aVar2 != null ? new m4.n(aVar2) : new m4.n("Loader:HlsSampleStreamWrapper");
        i4 i4Var = new i4();
        i4Var.f13782c = null;
        final int i11 = 0;
        i4Var.f13781b = false;
        i4Var.f13783d = null;
        this.f36412n = i4Var;
        this.f36422x = new int[0];
        Set set = Z;
        this.f36423y = new HashSet(set.size());
        this.f36424z = new SparseIntArray(set.size());
        this.f36421w = new p[0];
        this.P = new boolean[0];
        this.O = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f36413o = arrayList;
        this.f36414p = Collections.unmodifiableList(arrayList);
        this.f36418t = new ArrayList();
        this.f36415q = new Runnable(this) { // from class: y3.n

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f36393c;

            {
                this.f36393c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f36393c.v();
                        break;
                    default:
                        q qVar = this.f36393c;
                        qVar.D = true;
                        qVar.v();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.f36416r = new Runnable(this) { // from class: y3.n

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f36393c;

            {
                this.f36393c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f36393c.v();
                        break;
                    default:
                        q qVar = this.f36393c;
                        qVar.D = true;
                        qVar.v();
                        break;
                }
            }
        };
        this.f36417s = z.o(null);
        this.Q = j10;
        this.R = j10;
    }

    public static q4.j n(int i, int i10) {
        m3.b.s("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i10);
        return new q4.j();
    }

    public static j3.o q(j3.o oVar, j3.o oVar2, boolean z5) {
        String strB;
        if (oVar == null) {
            return oVar2;
        }
        String str = oVar.f26332k;
        String strD = oVar2.f26335n;
        int iH = c0.h(strD);
        if (z.u(iH, str) == 1) {
            strB = z.v(iH, str);
            strD = c0.d(strB);
        } else {
            strB = c0.b(str, strD);
        }
        j3.n nVarA = oVar2.a();
        nVarA.f26281a = oVar.f26323a;
        nVarA.f26282b = oVar.f26324b;
        nVarA.f26283c = j0.r(oVar.f26325c);
        nVarA.f26284d = oVar.f26326d;
        nVarA.f26285e = oVar.f26327e;
        nVarA.f26286f = oVar.f26328f;
        nVarA.f26288h = z5 ? oVar.f26330h : -1;
        nVarA.i = z5 ? oVar.i : -1;
        nVarA.f26289j = strB;
        if (iH == 2) {
            nVarA.f26299t = oVar.f26342u;
            nVarA.f26300u = oVar.f26343v;
            nVarA.f26303x = oVar.f26346y;
        }
        if (strD != null) {
            nVarA.f26292m = c0.n(strD);
        }
        int i = oVar.F;
        if (i != -1 && iH == 1) {
            nVarA.E = i;
        }
        b0 b0VarB = oVar.f26333l;
        if (b0VarB != null) {
            b0 b0Var = oVar2.f26333l;
            if (b0Var != null) {
                b0VarB = b0Var.b(b0VarB);
            }
            nVarA.f26290k = b0VarB;
        }
        return new j3.o(nVarA);
    }

    public static int t(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // q4.m
    public final void G() {
        this.V = true;
        this.f36417s.post(this.f36416r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [y3.p[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [y3.p[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [q4.a0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [i4.a1, y3.p] */
    /* JADX WARN: Type inference failed for: r5v6, types: [q4.j] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // q4.m
    public final a0 P(int i, int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        Set set = Z;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f36423y;
        SparseIntArray sparseIntArray = this.f36424z;
        ?? pVar = 0;
        pVar = 0;
        if (zContains) {
            h5.h(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.f36422x[i11] = i;
                }
                pVar = this.f36422x[i11] == i ? this.f36421w[i11] : n(i, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.f36421w;
                if (i12 >= r12.length) {
                    break;
                }
                if (this.f36422x[i12] == i) {
                    pVar = r12[i12];
                    break;
                }
                i12++;
            }
        }
        if (pVar == 0) {
            if (this.V) {
                return n(i, i10);
            }
            int length = this.f36421w.length;
            boolean z5 = i10 == 1 || i10 == 2;
            pVar = new p(this.f36405f, this.f36407h, this.i, this.f36419u);
            pVar.f20851t = this.Q;
            if (z5) {
                pVar.I = this.X;
                pVar.f20857z = true;
            }
            long j10 = this.W;
            if (pVar.F != j10) {
                pVar.F = j10;
                pVar.f20857z = true;
            }
            if (this.Y != null) {
                pVar.C = r6.f36341l;
            }
            pVar.f20838f = this;
            int i13 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f36422x, i13);
            this.f36422x = iArrCopyOf;
            iArrCopyOf[length] = i;
            p[] pVarArr = this.f36421w;
            String str = z.f28608a;
            ?? CopyOf = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            CopyOf[pVarArr.length] = pVar;
            this.f36421w = (p[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.P, i13);
            this.P = zArrCopyOf;
            zArrCopyOf[length] = z5;
            this.N |= z5;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (t(i10) > t(this.B)) {
                this.C = length;
                this.B = i10;
            }
            this.O = Arrays.copyOf(this.O, i13);
        }
        if (i10 != 5) {
            return pVar;
        }
        if (this.A == null) {
            this.A = new o(pVar, this.f36411m);
        }
        return this.A;
    }

    @Override // i4.z0
    public final void a() {
        this.f36417s.post(this.f36415q);
    }

    @Override // m4.l
    public final void c() {
        for (p pVar : this.f36421w) {
            pVar.D();
        }
    }

    public final void d() {
        h5.r(this.E);
        this.J.getClass();
        this.K.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.i
    public final void e(m4.k kVar, long j10, long j11) {
        j4.f fVar = (j4.f) kVar;
        this.f36420v = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.f36313k;
            i iVar = this.f36404e;
            iVar.f36334m = bArr;
            xi.d dVar = iVar.f36331j;
            Uri uri = eVar.f26470c.f31172a;
            byte[] bArr2 = eVar.f36315m;
            bArr2.getClass();
            d dVar2 = (d) dVar.f36218b;
            uri.getClass();
        }
        long j12 = fVar.f26469b;
        p3.l lVar = fVar.f26470c;
        p3.c0 c0Var = fVar.f26476j;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        this.f36408j.getClass();
        this.f36410l.e(uVar, fVar.f26471d, this.f36402c, fVar.f26472e, fVar.f26473f, fVar.f26474g, fVar.f26475h, fVar.i);
        if (this.E) {
            this.f36403d.d(this);
            return;
        }
        xt1 xt1Var = new xt1();
        xt1Var.f12328a = this.Q;
        l(new h0(xt1Var));
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        if (this.U) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.R;
        }
        long jMax = this.Q;
        j jVarS = s();
        if (!jVarS.I) {
            ArrayList arrayList = this.f36413o;
            jVarS = arrayList.size() > 1 ? (j) gf.a.g(2, arrayList) : null;
        }
        if (jVarS != null) {
            jMax = Math.max(jMax, jVarS.i);
        }
        if (this.D) {
            for (p pVar : this.f36421w) {
                jMax = Math.max(jMax, pVar.q());
            }
        }
        return jMax;
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        if (u()) {
            return this.R;
        }
        if (this.U) {
            return Long.MIN_VALUE;
        }
        return s().i;
    }

    public final boolean h(int i) {
        int i10 = i;
        while (true) {
            ArrayList arrayList = this.f36413o;
            if (i10 >= arrayList.size()) {
                j jVar = (j) arrayList.get(i);
                for (int i11 = 0; i11 < this.f36421w.length; i11++) {
                    if (this.f36421w[i11].t() > jVar.f(i11)) {
                        return false;
                    }
                }
                return true;
            }
            if (((j) arrayList.get(i10)).M) {
                return false;
            }
            i10++;
        }
    }

    @Override // m4.i
    public final com.google.android.gms.internal.ads.o i(m4.k kVar, long j10, long j11, IOException iOException, int i) {
        boolean zN;
        com.google.android.gms.internal.ads.o oVar;
        int i10;
        j4.f fVar = (j4.f) kVar;
        boolean z5 = fVar instanceof j;
        if (z5 && !((j) fVar).g() && (iOException instanceof w) && ((i10 = ((w) iOException).f31206d) == 410 || i10 == 404)) {
            return m4.n.f28668e;
        }
        long j12 = fVar.f26476j.f31132c;
        p3.l lVar = fVar.f26470c;
        p3.c0 c0Var = fVar.f26476j;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, j12);
        z.Z(fVar.f26475h);
        z.Z(fVar.i);
        e0 e0Var = new e0(iOException, i, 14);
        i iVar = this.f36404e;
        nl0 nl0VarI = hl.l.i(iVar.f36339r);
        this.f36408j.getClass();
        com.google.android.gms.internal.ads.o oVarD = le.a.d(nl0VarI, e0Var);
        if (oVarD == null || oVarD.f8527a != 2) {
            zN = false;
        } else {
            long j13 = oVarD.f8528b;
            l4.r rVar = iVar.f36339r;
            zN = rVar.n(rVar.t(iVar.f36330h.a(fVar.f26472e)), j13);
        }
        if (zN) {
            if (z5 && j12 == 0) {
                ArrayList arrayList = this.f36413o;
                h5.r(((j) arrayList.remove(arrayList.size() - 1)) == fVar);
                if (arrayList.isEmpty()) {
                    this.R = this.Q;
                } else {
                    ((j) ad.q.j(arrayList)).K = true;
                }
            }
            oVar = m4.n.f28669f;
        } else {
            long jG = le.a.g(e0Var);
            oVar = jG != -9223372036854775807L ? new com.google.android.gms.internal.ads.o(0, jG, false) : m4.n.f28670g;
        }
        com.google.android.gms.internal.ads.o oVar2 = oVar;
        boolean zA = oVar2.a();
        this.f36410l.f(uVar, fVar.f26471d, this.f36402c, fVar.f26472e, fVar.f26473f, fVar.f26474g, fVar.f26475h, fVar.i, iOException, !zA);
        if (!zA) {
            this.f36420v = null;
        }
        if (zN) {
            if (!this.E) {
                xt1 xt1Var = new xt1();
                xt1Var.f12328a = this.Q;
                l(new h0(xt1Var));
                return oVar2;
            }
            this.f36403d.d(this);
        }
        return oVar2;
    }

    @Override // i4.d1
    public final boolean isLoading() {
        return this.f36409k.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0203  */
    @Override // i4.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(s3.h0 r75) {
        /*
            Method dump skipped, instruction units count: 1343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.q.l(s3.h0):boolean");
    }

    @Override // m4.i
    public final void m(m4.k kVar, long j10, long j11, boolean z5) {
        j4.f fVar = (j4.f) kVar;
        this.f36420v = null;
        long j12 = fVar.f26469b;
        p3.l lVar = fVar.f26470c;
        p3.c0 c0Var = fVar.f26476j;
        u uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        this.f36408j.getClass();
        this.f36410l.c(uVar, fVar.f26471d, this.f36402c, fVar.f26472e, fVar.f26473f, fVar.f26474g, fVar.f26475h, fVar.i);
        if (z5) {
            return;
        }
        if (u() || this.F == 0) {
            y();
        }
        if (this.F > 0) {
            this.f36403d.d(this);
        }
    }

    @Override // m4.i
    public final void o(m4.k kVar, long j10, long j11, int i) {
        u uVar;
        j4.f fVar = (j4.f) kVar;
        if (i == 0) {
            long j12 = fVar.f26469b;
            uVar = new u(j10, fVar.f26470c);
        } else {
            long j13 = fVar.f26469b;
            p3.l lVar = fVar.f26470c;
            p3.c0 c0Var = fVar.f26476j;
            uVar = new u(lVar, c0Var.f31133d, c0Var.f31134e, j10, j11, c0Var.f31132c);
        }
        this.f36410l.h(uVar, fVar.f26471d, this.f36402c, fVar.f26472e, fVar.f26473f, fVar.f26474g, fVar.f26475h, fVar.i, i);
    }

    public final j1 p(p0[] p0VarArr) {
        for (int i = 0; i < p0VarArr.length; i++) {
            p0 p0Var = p0VarArr[i];
            j3.o[] oVarArr = new j3.o[p0Var.f26351a];
            for (int i10 = 0; i10 < p0Var.f26351a; i10++) {
                j3.o oVar = p0Var.f26354d[i10];
                int iA = this.f36407h.a(oVar);
                j3.n nVarA = oVar.a();
                nVarA.N = iA;
                oVarArr[i10] = new j3.o(nVarA);
            }
            p0VarArr[i] = new p0(p0Var.f26352b, oVarArr);
        }
        return new j1(p0VarArr);
    }

    public final void r(int i) {
        ArrayList arrayList;
        h5.r(!this.f36409k.d());
        while (true) {
            arrayList = this.f36413o;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (h(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j10 = s().i;
        j jVar = (j) arrayList.get(i);
        z.R(arrayList, i, arrayList.size());
        for (int i10 = 0; i10 < this.f36421w.length; i10++) {
            this.f36421w[i10].n(jVar.f(i10));
        }
        if (arrayList.isEmpty()) {
            this.R = this.Q;
        } else {
            ((j) ad.q.j(arrayList)).K = true;
        }
        this.U = false;
        this.f36410l.i(this.B, jVar.f26475h, j10);
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
        m4.n nVar = this.f36409k;
        if (nVar.c() || u()) {
            return;
        }
        boolean zD = nVar.d();
        i iVar = this.f36404e;
        List list = this.f36414p;
        if (zD) {
            this.f36420v.getClass();
            if (iVar.f36335n != null ? false : iVar.f36339r.d(j10, this.f36420v, list)) {
                nVar.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((j) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            r(size);
        }
        int size2 = (iVar.f36335n != null || iVar.f36339r.length() < 2) ? list.size() : iVar.f36339r.i(j10, list);
        if (size2 < this.f36413o.size()) {
            r(size2);
        }
    }

    public final j s() {
        return (j) gf.a.g(1, this.f36413o);
    }

    public final boolean u() {
        return this.R != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        int i;
        if (!this.I && this.L == null && this.D) {
            int i10 = 0;
            for (p pVar : this.f36421w) {
                if (pVar.w() == null) {
                    return;
                }
            }
            j1 j1Var = this.J;
            if (j1Var != null) {
                int i11 = j1Var.f20935a;
                int[] iArr = new int[i11];
                this.L = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        p[] pVarArr = this.f36421w;
                        if (i13 < pVarArr.length) {
                            j3.o oVarW = pVarArr[i13].w();
                            oVarW.getClass();
                            j3.o oVar = this.J.a(i12).f26354d[0];
                            String str = oVarW.f26335n;
                            String str2 = oVar.f26335n;
                            int iH = c0.h(str);
                            if (iH != 3) {
                                if (iH == c0.h(str2)) {
                                    break;
                                } else {
                                    i13++;
                                }
                            } else if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || oVarW.K == oVar.K)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    this.L[i12] = i13;
                }
                Iterator it = this.f36418t.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).b();
                }
                return;
            }
            int length = this.f36421w.length;
            int i14 = 0;
            int i15 = -1;
            int i16 = -2;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                j3.o oVarW2 = this.f36421w[i14].w();
                oVarW2.getClass();
                String str3 = oVarW2.f26335n;
                if (c0.m(str3)) {
                    i17 = 2;
                } else if (!c0.i(str3)) {
                    i17 = c0.l(str3) ? 3 : -2;
                }
                if (t(i17) > t(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            p0 p0Var = this.f36404e.f36330h;
            int i18 = p0Var.f26351a;
            this.M = -1;
            this.L = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.L[i19] = i19;
            }
            p0[] p0VarArr = new p0[length];
            int i20 = 0;
            while (i20 < length) {
                j3.o oVarW3 = this.f36421w[i20].w();
                oVarW3.getClass();
                String str4 = this.f36401b;
                j3.o oVar2 = this.f36406g;
                if (i20 == i15) {
                    j3.o[] oVarArr = new j3.o[i18];
                    for (int i21 = i10; i21 < i18; i21++) {
                        j3.o oVarD = p0Var.f26354d[i21];
                        if (i16 == 1 && oVar2 != null) {
                            oVarD = oVarD.d(oVar2);
                        }
                        oVarArr[i21] = i18 == 1 ? oVarW3.d(oVarD) : q(oVarD, oVarW3, true);
                    }
                    p0VarArr[i20] = new p0(str4, oVarArr);
                    this.M = i20;
                    i = 0;
                } else {
                    if (i16 != 2 || !c0.i(oVarW3.f26335n)) {
                        oVar2 = null;
                    }
                    StringBuilder sbK = pe.a.k(str4, ":muxed:");
                    sbK.append(i20 < i15 ? i20 : i20 - 1);
                    i = 0;
                    p0VarArr[i20] = new p0(sbK.toString(), q(oVar2, oVarW3, false));
                }
                i20++;
                i10 = i;
            }
            int i22 = i10;
            this.J = p(p0VarArr);
            h5.r(this.K == null ? 1 : i22);
            this.K = Collections.EMPTY_SET;
            this.E = true;
            this.f36403d.y();
        }
    }

    public final void w() throws IOException {
        this.f36409k.a();
        i iVar = this.f36404e;
        i4.b bVar = iVar.f36335n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = iVar.f36336o;
        if (uri == null || !uri.equals(iVar.f36337p)) {
            return;
        }
        z3.c cVar = iVar.f36329g;
        z3.b bVar2 = (z3.b) cVar.f46029e.get(iVar.f36336o);
        bVar2.f46015c.a();
        IOException iOException = bVar2.f46022k;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void x(p0[] p0VarArr, int... iArr) {
        this.J = p(p0VarArr);
        this.K = new HashSet();
        for (int i : iArr) {
            this.K.add(this.J.a(i));
        }
        this.M = 0;
        this.f36417s.post(new t.a0(15, this.f36403d));
        this.E = true;
    }

    public final void y() {
        for (p pVar : this.f36421w) {
            pVar.E(this.S);
        }
        this.S = false;
    }

    public final boolean z(long j10, boolean z5) throws Throwable {
        j jVar;
        boolean z10;
        boolean zG;
        this.Q = j10;
        if (u()) {
            this.R = j10;
            return true;
        }
        boolean z11 = this.f36404e.f36338q;
        ArrayList arrayList = this.f36413o;
        if (z11) {
            for (int i = 0; i < arrayList.size(); i++) {
                jVar = (j) arrayList.get(i);
                if (jVar.f26475h == j10) {
                    break;
                }
            }
            jVar = null;
        } else {
            jVar = null;
        }
        if (this.D && !z5 && !arrayList.isEmpty()) {
            int length = this.f36421w.length;
            for (int i10 = 0; i10 < length; i10++) {
                p pVar = this.f36421w[i10];
                if (jVar != null) {
                    zG = pVar.F(jVar.f(i10));
                } else {
                    long nextLoadPositionUs = getNextLoadPositionUs();
                    zG = pVar.G(j10, nextLoadPositionUs == Long.MIN_VALUE || j10 < nextLoadPositionUs);
                }
                if (!zG && (this.P[i10] || !this.N)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return false;
            }
        }
        this.R = j10;
        this.U = false;
        arrayList.clear();
        m4.n nVar = this.f36409k;
        if (!nVar.d()) {
            nVar.f28673d = null;
            y();
            return true;
        }
        if (this.D) {
            for (p pVar2 : this.f36421w) {
                pVar2.k();
            }
        }
        nVar.b();
        return true;
    }

    @Override // q4.m
    public final void j(q4.t tVar) {
    }
}
