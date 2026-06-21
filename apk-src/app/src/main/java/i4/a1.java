package i4;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.m6;
import com.google.android.gms.internal.ads.sn0;
import com.google.android.gms.internal.measurement.h5;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class a1 implements q4.a0 {
    public j3.o A;
    public j3.o B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn0 f20833a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x3.h f20836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f20837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f20838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j3.o f20839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ni.i f20840h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20850s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20854w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20857z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.g f20834b = new a4.g(7);
    public int i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f20841j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f20842k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f20845n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f20844m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f20843l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q4.z[] f20846o = new q4.z[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ad.m0 f20835c = new ad.m0(new hf.a(28));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20851t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f20852u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f20853v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20856y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20855x = true;
    public boolean D = true;

    public a1(bb.e eVar, x3.h hVar, i0 i0Var) {
        this.f20836d = hVar;
        this.f20837e = i0Var;
        this.f20833a = new sn0(eVar);
    }

    public final void A(j3.o oVar, r3.b bVar) {
        j3.o oVar2;
        j3.o oVar3 = this.f20839g;
        boolean z5 = oVar3 == null;
        j3.l lVar = oVar3 == null ? null : oVar3.f26339r;
        this.f20839g = oVar;
        j3.l lVar2 = oVar.f26339r;
        x3.h hVar = this.f20836d;
        if (hVar != null) {
            int iA = hVar.a(oVar);
            j3.n nVarA = oVar.a();
            nVarA.N = iA;
            oVar2 = new j3.o(nVarA);
        } else {
            oVar2 = oVar;
        }
        bVar.f32189d = oVar2;
        bVar.f32188c = this.f20840h;
        if (hVar == null) {
            return;
        }
        if (z5 || !Objects.equals(lVar, lVar2)) {
            ni.i iVar = this.f20840h;
            i0 i0Var = this.f20837e;
            ni.i iVarC = hVar.c(i0Var, oVar);
            this.f20840h = iVarC;
            bVar.f32188c = iVarC;
            if (iVar != null) {
                iVar.A(i0Var);
            }
        }
    }

    public final synchronized long B() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20850s != this.f20847p ? this.f20841j[u(this.f20850s)] : this.C;
    }

    public final int C(r3.b bVar, r3.e eVar, int i, boolean z5) {
        int i10;
        boolean z10 = (i & 2) != 0;
        a4.g gVar = this.f20834b;
        synchronized (this) {
            try {
                eVar.f32193g = false;
                i10 = -3;
                if (this.f20850s != this.f20847p) {
                    j3.o oVar = ((y0) this.f20835c.j(t())).f21079a;
                    if (!z10 && oVar == this.f20839g) {
                        int iU = u(this.f20850s);
                        if (y(iU)) {
                            eVar.f7316c = this.f20844m[iU];
                            if (this.f20850s == this.f20847p - 1 && (z5 || this.f20854w)) {
                                eVar.a(536870912);
                            }
                            eVar.f32194h = this.f20845n[iU];
                            gVar.f431d = this.f20843l[iU];
                            gVar.f430c = this.f20842k[iU];
                            gVar.f432e = this.f20846o[iU];
                            i10 = -4;
                        } else {
                            eVar.f32193g = true;
                        }
                    }
                    A(oVar, bVar);
                    i10 = -5;
                } else {
                    if (!z5 && !this.f20854w) {
                        j3.o oVar2 = this.B;
                        if (oVar2 == null || (!z10 && oVar2 == this.f20839g)) {
                        }
                        A(oVar2, bVar);
                        i10 = -5;
                    }
                    eVar.f7316c = 4;
                    eVar.f32194h = Long.MIN_VALUE;
                    i10 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 == -4 && !eVar.c(4)) {
            boolean z11 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z11) {
                    sn0 sn0Var = this.f20833a;
                    sn0.e((m6) sn0Var.f10350f, eVar, this.f20834b, (m3.p) sn0Var.f10348d);
                } else {
                    sn0 sn0Var2 = this.f20833a;
                    sn0Var2.f10350f = sn0.e((m6) sn0Var2.f10350f, eVar, this.f20834b, (m3.p) sn0Var2.f10348d);
                }
            }
            if (!z11) {
                this.f20850s++;
            }
        }
        return i10;
    }

    public final void D() {
        E(true);
        ni.i iVar = this.f20840h;
        if (iVar != null) {
            iVar.A(this.f20837e);
            this.f20840h = null;
            this.f20839g = null;
        }
    }

    public final void E(boolean z5) {
        sn0 sn0Var = this.f20833a;
        m6 m6Var = (m6) sn0Var.f10349e;
        if (((m4.a) m6Var.f7790d) != null) {
            bb.e eVar = (bb.e) sn0Var.f10347c;
            synchronized (eVar) {
                ((s3.f) eVar.f2021e).f32528c.b(m6Var);
                m6 m6Var2 = m6Var;
                while (m6Var2 != null) {
                    m4.a aVar = (m4.a) m6Var2.f7790d;
                    aVar.getClass();
                    eVar.C(aVar);
                    m6Var2 = (m6) m6Var2.f7791e;
                    if (m6Var2 == null || ((m4.a) m6Var2.f7790d) == null) {
                        m6Var2 = null;
                    }
                }
            }
            m6Var.f7790d = null;
            m6Var.f7791e = null;
        }
        m6 m6Var3 = (m6) sn0Var.f10349e;
        int i = sn0Var.f10345a;
        h5.r(((m4.a) m6Var3.f7790d) == null);
        m6Var3.f7788b = 0L;
        m6Var3.f7789c = i;
        m6 m6Var4 = (m6) sn0Var.f10349e;
        sn0Var.f10350f = m6Var4;
        sn0Var.f10351g = m6Var4;
        sn0Var.f10346b = 0L;
        bb.e eVar2 = (bb.e) sn0Var.f10347c;
        synchronized (eVar2) {
            ((s3.f) eVar2.f2021e).f32528c.d();
        }
        this.f20847p = 0;
        this.f20848q = 0;
        this.f20849r = 0;
        this.f20850s = 0;
        this.f20855x = true;
        this.f20851t = Long.MIN_VALUE;
        this.f20852u = Long.MIN_VALUE;
        this.f20853v = Long.MIN_VALUE;
        this.f20854w = false;
        ad.m0 m0Var = this.f20835c;
        SparseArray sparseArray = (SparseArray) m0Var.f840d;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((hf.a) m0Var.f841e).accept(sparseArray.valueAt(i10));
        }
        m0Var.f839c = -1;
        sparseArray.clear();
        if (z5) {
            this.A = null;
            this.B = null;
            this.f20856y = true;
            this.D = true;
        }
    }

    public final synchronized boolean F(int i) {
        synchronized (this) {
            this.f20850s = 0;
            sn0 sn0Var = this.f20833a;
            sn0Var.f10350f = (m6) sn0Var.f10349e;
        }
        int i10 = this.f20848q;
        if (i >= i10 && i <= this.f20847p + i10) {
            this.f20851t = Long.MIN_VALUE;
            this.f20850s = i - i10;
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean G(long j10, boolean z5) throws Throwable {
        Throwable th2;
        a1 a1Var;
        long j11;
        int iO;
        try {
        } catch (Throwable th3) {
            th = th3;
        }
        synchronized (this) {
            try {
                try {
                    this.f20850s = 0;
                    sn0 sn0Var = this.f20833a;
                    sn0Var.f10350f = (m6) sn0Var.f10349e;
                    int iU = u(0);
                    int i = this.f20850s;
                    int i10 = this.f20847p;
                    if (!(i != i10) || j10 < this.f20845n[iU] || (j10 > this.f20853v && !z5)) {
                        return false;
                    }
                    if (this.D) {
                        iO = i10 - i;
                        int i11 = 0;
                        while (true) {
                            if (i11 < iO) {
                                try {
                                    if (this.f20845n[iU] >= j10) {
                                        iO = i11;
                                        break;
                                    }
                                    iU++;
                                    if (iU == this.i) {
                                        iU = 0;
                                    }
                                    i11++;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                }
                            } else if (!z5) {
                                iO = -1;
                            }
                        }
                        a1Var = this;
                        j11 = j10;
                    } else {
                        a1Var = this;
                        j11 = j10;
                        iO = a1Var.o(iU, i10 - i, j11, true);
                    }
                    if (iO == -1) {
                        return false;
                    }
                    a1Var.f20851t = j11;
                    a1Var.f20850s += iO;
                    return true;
                } catch (Throwable th5) {
                    th = th5;
                    th2 = th;
                }
            } catch (Throwable th6) {
                th = th6;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
            }
            th2 = th;
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void H(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f20850s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f20847p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            com.google.android.gms.internal.measurement.h5.h(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f20850s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f20850s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.a1.H(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:18:0x0059), top: B:29:0x000a }] */
    @Override // q4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(j3.o r5) {
        /*
            r4 = this;
            j3.o r0 = r4.p(r5)
            r1 = 0
            r4.f20857z = r1
            r4.A = r5
            monitor-enter(r4)
            r4.f20856y = r1     // Catch: java.lang.Throwable -> L57
            j3.o r5 = r4.B     // Catch: java.lang.Throwable -> L57
            boolean r5 = java.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L16
            monitor-exit(r4)
            goto L6e
        L16:
            ad.m0 r5 = r4.f20835c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.f840d     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L57
            r2 = 1
            if (r5 != 0) goto L25
            r5 = r2
            goto L26
        L25:
            r5 = r1
        L26:
            if (r5 != 0) goto L59
            ad.m0 r5 = r4.f20835c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.f840d     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L57
            int r3 = r3 - r2
            java.lang.Object r5 = r5.valueAt(r3)     // Catch: java.lang.Throwable -> L57
            i4.y0 r5 = (i4.y0) r5     // Catch: java.lang.Throwable -> L57
            j3.o r5 = r5.f21079a     // Catch: java.lang.Throwable -> L57
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L59
            ad.m0 r5 = r4.f20835c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.f840d     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L57
            int r0 = r0 - r2
            java.lang.Object r5 = r5.valueAt(r0)     // Catch: java.lang.Throwable -> L57
            i4.y0 r5 = (i4.y0) r5     // Catch: java.lang.Throwable -> L57
            j3.o r5 = r5.f21079a     // Catch: java.lang.Throwable -> L57
            r4.B = r5     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r5 = move-exception
            goto L78
        L59:
            r4.B = r0     // Catch: java.lang.Throwable -> L57
        L5b:
            boolean r5 = r4.D     // Catch: java.lang.Throwable -> L57
            j3.o r0 = r4.B     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r0.f26335n     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.f26332k     // Catch: java.lang.Throwable -> L57
            boolean r0 = j3.c0.a(r3, r0)     // Catch: java.lang.Throwable -> L57
            r5 = r5 & r0
            r4.D = r5     // Catch: java.lang.Throwable -> L57
            r4.E = r1     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)
            r1 = r2
        L6e:
            i4.z0 r5 = r4.f20838f
            if (r5 == 0) goto L77
            if (r1 == 0) goto L77
            r5.a()
        L77:
            return
        L78:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.a1.a(j3.o):void");
    }

    @Override // q4.a0
    public final void e(m3.p pVar, int i, int i10) {
        while (true) {
            sn0 sn0Var = this.f20833a;
            if (i <= 0) {
                sn0Var.getClass();
                return;
            }
            int iB = sn0Var.b(i);
            m6 m6Var = (m6) sn0Var.f10351g;
            m4.a aVar = (m4.a) m6Var.f7790d;
            pVar.k(aVar.f28620a, ((int) (sn0Var.f10346b - m6Var.f7788b)) + aVar.f28621b, iB);
            i -= iB;
            long j10 = sn0Var.f10346b + ((long) iB);
            sn0Var.f10346b = j10;
            m6 m6Var2 = (m6) sn0Var.f10351g;
            if (j10 == m6Var2.f7789c) {
                sn0Var.f10351g = (m6) m6Var2.f7791e;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x010c A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016c, B:98:0x0175, B:75:0x010c, B:77:0x0115, B:79:0x011d, B:81:0x0132, B:85:0x013b, B:86:0x0140, B:88:0x0146, B:92:0x0154, B:94:0x0159, B:95:0x0169, B:78:0x011b), top: B:104:0x008d }] */
    @Override // q4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(long r10, int r12, int r13, int r14, q4.z r15) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.a1.f(long, int, int, int, q4.z):void");
    }

    @Override // q4.a0
    public final int g(j3.h hVar, int i, boolean z5) throws EOFException {
        sn0 sn0Var = this.f20833a;
        int iB = sn0Var.b(i);
        m6 m6Var = (m6) sn0Var.f10351g;
        m4.a aVar = (m4.a) m6Var.f7790d;
        int i10 = hVar.read(aVar.f28620a, ((int) (sn0Var.f10346b - m6Var.f7788b)) + aVar.f28621b, iB);
        if (i10 == -1) {
            if (z5) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = sn0Var.f10346b + ((long) i10);
        sn0Var.f10346b = j10;
        m6 m6Var2 = (m6) sn0Var.f10351g;
        if (j10 == m6Var2.f7789c) {
            sn0Var.f10351g = (m6) m6Var2.f7791e;
        }
        return i10;
    }

    public final int h(long j10) {
        int i = this.f20847p;
        int iU = u(i - 1);
        while (i > this.f20850s && this.f20845n[iU] >= j10) {
            i--;
            iU--;
            if (iU == -1) {
                iU = this.i - 1;
            }
        }
        return i;
    }

    public final long i(int i) {
        this.f20852u = Math.max(this.f20852u, s(i));
        this.f20847p -= i;
        int i10 = this.f20848q + i;
        this.f20848q = i10;
        int i11 = this.f20849r + i;
        this.f20849r = i11;
        int i12 = this.i;
        if (i11 >= i12) {
            this.f20849r = i11 - i12;
        }
        int i13 = this.f20850s - i;
        this.f20850s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.f20850s = 0;
        }
        ad.m0 m0Var = this.f20835c;
        SparseArray sparseArray = (SparseArray) m0Var.f840d;
        while (i14 < sparseArray.size() - 1) {
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((hf.a) m0Var.f841e).accept(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = m0Var.f839c;
            if (i16 > 0) {
                m0Var.f839c = i16 - 1;
            }
            i14 = i15;
        }
        if (this.f20847p != 0) {
            return this.f20842k[this.f20849r];
        }
        int i17 = this.f20849r;
        if (i17 == 0) {
            i17 = this.i;
        }
        int i18 = i17 - 1;
        return this.f20842k[i18] + ((long) this.f20843l[i18]);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.sn0 r0 = r11.f20833a
            monitor-enter(r11)
            int r1 = r11.f20847p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f20845n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f20849r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r14 == 0) goto L1d
            int r14 = r11.f20850s     // Catch: java.lang.Throwable -> L1f
            if (r14 == r1) goto L1d
            int r1 = r14 + 1
        L1d:
            r7 = r1
            goto L23
        L1f:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L23:
            r10 = 0
            r5 = r11
            r8 = r12
            int r12 = r5.o(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.i(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.a(r2)
            return
        L40:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L35
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.a1.j(long, boolean):void");
    }

    public final void k() {
        long jI;
        sn0 sn0Var = this.f20833a;
        synchronized (this) {
            int i = this.f20847p;
            jI = i == 0 ? -1L : i(i);
        }
        sn0Var.a(jI);
    }

    public final void l(long j10) {
        if (this.f20847p == 0) {
            return;
        }
        h5.h(j10 > r());
        n(this.f20848q + h(j10));
    }

    public final long m(int i) {
        int i10 = this.f20848q;
        int i11 = this.f20847p;
        int i12 = (i10 + i11) - i;
        boolean z5 = false;
        h5.h(i12 >= 0 && i12 <= i11 - this.f20850s);
        int i13 = this.f20847p - i12;
        this.f20847p = i13;
        this.f20853v = Math.max(this.f20852u, s(i13));
        if (i12 == 0 && this.f20854w) {
            z5 = true;
        }
        this.f20854w = z5;
        ad.m0 m0Var = this.f20835c;
        SparseArray sparseArray = (SparseArray) m0Var.f840d;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((hf.a) m0Var.f841e).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        m0Var.f839c = sparseArray.size() > 0 ? Math.min(m0Var.f839c, sparseArray.size() - 1) : -1;
        int i14 = this.f20847p;
        if (i14 == 0) {
            return 0L;
        }
        int iU = u(i14 - 1);
        return this.f20842k[iU] + ((long) this.f20843l[iU]);
    }

    public final void n(int i) {
        sn0 sn0Var = this.f20833a;
        long jM = m(i);
        int i10 = sn0Var.f10345a;
        h5.h(jM <= sn0Var.f10346b);
        sn0Var.f10346b = jM;
        if (jM != 0) {
            m6 m6Var = (m6) sn0Var.f10349e;
            if (jM != m6Var.f7788b) {
                while (sn0Var.f10346b > m6Var.f7789c) {
                    m6Var = (m6) m6Var.f7791e;
                }
                m6 m6Var2 = (m6) m6Var.f7791e;
                m6Var2.getClass();
                if (((m4.a) m6Var2.f7790d) != null) {
                    bb.e eVar = (bb.e) sn0Var.f10347c;
                    synchronized (eVar) {
                        ((s3.f) eVar.f2021e).f32528c.b(m6Var2);
                        m6 m6Var3 = m6Var2;
                        while (m6Var3 != null) {
                            m4.a aVar = (m4.a) m6Var3.f7790d;
                            aVar.getClass();
                            eVar.C(aVar);
                            m6Var3 = (m6) m6Var3.f7791e;
                            if (m6Var3 == null || ((m4.a) m6Var3.f7790d) == null) {
                                m6Var3 = null;
                            }
                        }
                    }
                    m6Var2.f7790d = null;
                    m6Var2.f7791e = null;
                }
                m6 m6Var4 = new m6(m6Var.f7789c, i10);
                m6Var.f7791e = m6Var4;
                if (sn0Var.f10346b == m6Var.f7789c) {
                    m6Var = m6Var4;
                }
                sn0Var.f10351g = m6Var;
                if (((m6) sn0Var.f10350f) == m6Var2) {
                    sn0Var.f10350f = m6Var4;
                    return;
                }
                return;
            }
        }
        m6 m6Var5 = (m6) sn0Var.f10349e;
        if (((m4.a) m6Var5.f7790d) != null) {
            bb.e eVar2 = (bb.e) sn0Var.f10347c;
            synchronized (eVar2) {
                ((s3.f) eVar2.f2021e).f32528c.b(m6Var5);
                m6 m6Var6 = m6Var5;
                while (m6Var6 != null) {
                    m4.a aVar2 = (m4.a) m6Var6.f7790d;
                    aVar2.getClass();
                    eVar2.C(aVar2);
                    m6Var6 = (m6) m6Var6.f7791e;
                    if (m6Var6 == null || ((m4.a) m6Var6.f7790d) == null) {
                        m6Var6 = null;
                    }
                }
            }
            m6Var5.f7790d = null;
            m6Var5.f7791e = null;
        }
        m6 m6Var7 = new m6(sn0Var.f10346b, i10);
        sn0Var.f10349e = m6Var7;
        sn0Var.f10350f = m6Var7;
        sn0Var.f10351g = m6Var7;
    }

    public final int o(int i, int i10, long j10, boolean z5) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j11 = this.f20845n[i];
            if (j11 > j10) {
                break;
            }
            if (!z5 || (this.f20844m[i] & 1) != 0) {
                if (j11 == j10) {
                    return i12;
                }
                i11 = i12;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i11;
    }

    public j3.o p(j3.o oVar) {
        if (this.F == 0 || oVar.f26340s == Long.MAX_VALUE) {
            return oVar;
        }
        j3.n nVarA = oVar.a();
        nVarA.f26297r = oVar.f26340s + this.F;
        return new j3.o(nVarA);
    }

    public final synchronized long q() {
        return this.f20853v;
    }

    public final synchronized long r() {
        return Math.max(this.f20852u, s(this.f20850s));
    }

    public final long s(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iU = u(i - 1);
        for (int i10 = 0; i10 < i; i10++) {
            jMax = Math.max(jMax, this.f20845n[iU]);
            if ((this.f20844m[iU] & 1) != 0) {
                return jMax;
            }
            iU--;
            if (iU == -1) {
                iU = this.i - 1;
            }
        }
        return jMax;
    }

    public final int t() {
        return this.f20848q + this.f20850s;
    }

    public final int u(int i) {
        int i10 = this.f20849r + i;
        int i11 = this.i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized int v(long j10, boolean z5) {
        try {
            try {
                int iU = u(this.f20850s);
                int i = this.f20850s;
                int i10 = this.f20847p;
                if (!(i != i10) || j10 < this.f20845n[iU]) {
                    return 0;
                }
                if (j10 > this.f20853v && z5) {
                    return i10 - i;
                }
                int iO = o(iU, i10 - i, j10, true);
                if (iO == -1) {
                    return 0;
                }
                return iO;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    public final synchronized j3.o w() {
        return this.f20856y ? null : this.B;
    }

    public final synchronized boolean x(boolean z5) {
        j3.o oVar;
        boolean z10 = false;
        if (this.f20850s != this.f20847p) {
            if (((y0) this.f20835c.j(t())).f21079a != this.f20839g) {
                return true;
            }
            return y(u(this.f20850s));
        }
        if (z5 || this.f20854w || ((oVar = this.B) != null && oVar != this.f20839g)) {
            z10 = true;
        }
        return z10;
    }

    public final boolean y(int i) {
        ni.i iVar = this.f20840h;
        if (iVar == null || iVar.u() == 4) {
            return true;
        }
        if ((this.f20844m[i] & 1073741824) != 0) {
            return false;
        }
        this.f20840h.getClass();
        return false;
    }

    public final void z() throws x3.c {
        ni.i iVar = this.f20840h;
        if (iVar == null || iVar.u() != 1) {
            return;
        }
        x3.c cVarP = this.f20840h.p();
        cVarP.getClass();
        throw cVarP;
    }
}
