package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fz1 implements w2 {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz1 f5527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.g f5528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ya f5529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c6 f5530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public az1 f5531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jx1 f5532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nu0 f5533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5534h;
    public long[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f5535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f5536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f5537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f5538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v2[] f5539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public jx1 f5550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5551z;

    public fz1(i iVar, c6 c6Var, ly1 ly1Var) {
        this.f5530d = c6Var;
        dz1 dz1Var = new dz1();
        dz1Var.f4768b = iVar;
        dz1Var.f4769c = new tk0(32);
        m6 m6Var = new m6(0L);
        dz1Var.f4770d = m6Var;
        dz1Var.f4771e = m6Var;
        dz1Var.f4772f = m6Var;
        this.f5527a = dz1Var;
        this.f5528b = new a4.g(3);
        this.f5534h = 1000;
        this.i = new long[1000];
        this.f5535j = new long[1000];
        this.f5538m = new long[1000];
        this.f5537l = new int[1000];
        this.f5536k = new int[1000];
        this.f5539n = new v2[1000];
        this.f5529c = new ya(9, false);
        this.f5544s = Long.MIN_VALUE;
        this.f5545t = Long.MIN_VALUE;
        this.f5546u = Long.MIN_VALUE;
        this.f5549x = true;
        this.f5548w = true;
        this.f5551z = true;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b(tk0 tk0Var, int i, int i10) {
        while (true) {
            dz1 dz1Var = this.f5527a;
            if (i <= 0) {
                dz1Var.getClass();
                return;
            }
            int iC = dz1Var.c(i);
            m6 m6Var = (m6) dz1Var.f4772f;
            h hVar = (h) m6Var.f7790d;
            byte[] bArr = hVar.f5993a;
            long j10 = dz1Var.f4767a - m6Var.f7788b;
            hVar.getClass();
            tk0Var.H(bArr, (int) j10, iC);
            i -= iC;
            long j11 = dz1Var.f4767a + ((long) iC);
            dz1Var.f4767a = j11;
            m6 m6Var2 = (m6) dz1Var.f4772f;
            if (j11 == m6Var2.f7789c) {
                dz1Var.f4772f = (m6) m6Var2.f7791e;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:21:0x003f, B:23:0x0044, B:27:0x005a, B:30:0x0061, B:34:0x0069, B:39:0x00a4, B:60:0x010d, B:62:0x0116, B:41:0x00bd, B:43:0x00c1, B:45:0x00d3, B:49:0x00dc, B:50:0x00e1, B:52:0x00e7, B:56:0x00f5, B:58:0x00fa, B:59:0x010a, B:68:0x0184), top: B:71:0x003f }] */
    @Override // com.google.android.gms.internal.ads.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r10, int r12, int r13, int r14, com.google.android.gms.internal.ads.v2 r15) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz1.c(long, int, int, int, com.google.android.gms.internal.ads.v2):void");
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final int d(ct1 ct1Var, int i, boolean z5) throws EOFException {
        dz1 dz1Var = this.f5527a;
        int iC = dz1Var.c(i);
        m6 m6Var = (m6) dz1Var.f4772f;
        h hVar = (h) m6Var.f7790d;
        byte[] bArr = hVar.f5993a;
        long j10 = dz1Var.f4767a - m6Var.f7788b;
        hVar.getClass();
        int iC2 = ct1Var.C(bArr, (int) j10, iC);
        if (iC2 == -1) {
            if (z5) {
                return -1;
            }
            throw new EOFException();
        }
        long j11 = dz1Var.f4767a + ((long) iC2);
        dz1Var.f4767a = j11;
        m6 m6Var2 = (m6) dz1Var.f4772f;
        if (j11 == m6Var2.f7789c) {
            dz1Var.f4772f = (m6) m6Var2.f7791e;
        }
        return iC2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0038, B:19:0x0051, B:18:0x004f), top: B:29:0x0002 }] */
    @Override // com.google.android.gms.internal.ads.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.ads.jx1 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r5.f5549x = r0     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.jx1 r1 = r5.f5550y     // Catch: java.lang.Throwable -> L4d
            boolean r1 = java.util.Objects.equals(r6, r1)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto Le
            monitor-exit(r5)
            goto L64
        Le:
            com.google.android.gms.internal.ads.ya r1 = r5.f5529c     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r2 = r1.f12556c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L4d
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L4d
            r3 = 1
            if (r2 != 0) goto L1d
            r2 = r3
            goto L1e
        L1d:
            r2 = r0
        L1e:
            if (r2 != 0) goto L4f
            java.lang.Object r2 = r1.f12556c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L4d
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + (-1)
            java.lang.Object r2 = r2.valueAt(r4)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.ez1 r2 = (com.google.android.gms.internal.ads.ez1) r2     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.jx1 r2 = r2.f5153a     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L4f
            java.lang.Object r6 = r1.f12556c     // Catch: java.lang.Throwable -> L4d
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.lang.Throwable -> L4d
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L4d
            int r1 = r1 + (-1)
            java.lang.Object r6 = r6.valueAt(r1)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.ez1 r6 = (com.google.android.gms.internal.ads.ez1) r6     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.jx1 r6 = r6.f5153a     // Catch: java.lang.Throwable -> L4d
            r5.f5550y = r6     // Catch: java.lang.Throwable -> L4d
            goto L51
        L4d:
            r6 = move-exception
            goto L72
        L4f:
            r5.f5550y = r6     // Catch: java.lang.Throwable -> L4d
        L51:
            boolean r6 = r5.f5551z     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.jx1 r1 = r5.f5550y     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r1.f6975m     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.f6972j     // Catch: java.lang.Throwable -> L4d
            boolean r1 = com.google.android.gms.internal.ads.ra.d(r2, r1)     // Catch: java.lang.Throwable -> L4d
            r6 = r6 & r1
            r5.f5551z = r6     // Catch: java.lang.Throwable -> L4d
            r5.A = r0     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r5)
            r0 = r3
        L64:
            com.google.android.gms.internal.ads.az1 r6 = r5.f5531e
            if (r6 == 0) goto L71
            if (r0 == 0) goto L71
            android.os.Handler r0 = r6.f3509p
            com.google.android.gms.internal.ads.xy1 r6 = r6.f3507n
            r0.post(r6)
        L71:
            return
        L72:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz1.e(com.google.android.gms.internal.ads.jx1):void");
    }

    public final void g(jx1 jx1Var, zd1 zd1Var) {
        jx1 jx1Var2 = this.f5532f;
        lv1 lv1Var = jx1Var2 == null ? null : jx1Var2.f6979q;
        this.f5532f = jx1Var;
        lv1 lv1Var2 = jx1Var.f6979q;
        this.f5530d.getClass();
        int i = lv1Var2 != null ? 1 : 0;
        ow1 ow1Var = new ow1(jx1Var);
        ow1Var.K = i;
        zd1Var.f12972d = new jx1(ow1Var);
        zd1Var.f12971c = this.f5533g;
        if (jx1Var2 == null || !Objects.equals(lv1Var, lv1Var2)) {
            nu0 nu0Var = lv1Var2 != null ? new nu0(11, new tw1(new ww1())) : null;
            this.f5533g = nu0Var;
            zd1Var.f12971c = nu0Var;
        }
    }

    public final int h(int i, int i10, long j10, boolean z5) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j11 = this.f5538m[i];
            if (j11 > j10) {
                break;
            }
            if (!z5 || (this.f5537l[i] & 1) != 0) {
                if (j11 == j10) {
                    return i12;
                }
                i11 = i12;
            }
            i++;
            if (i == this.f5534h) {
                i = 0;
            }
        }
        return i11;
    }

    public final long i(int i) {
        long j10 = this.f5545t;
        long jMax = Long.MIN_VALUE;
        int i10 = 0;
        if (i != 0) {
            int iJ = j(i - 1);
            for (int i11 = 0; i11 < i; i11++) {
                jMax = Math.max(jMax, this.f5538m[iJ]);
                if ((this.f5537l[iJ] & 1) != 0) {
                    break;
                }
                iJ--;
                if (iJ == -1) {
                    iJ = this.f5534h - 1;
                }
            }
        }
        this.f5545t = Math.max(j10, jMax);
        this.f5540o -= i;
        int i12 = this.f5541p + i;
        this.f5541p = i12;
        int i13 = this.f5542q + i;
        this.f5542q = i13;
        int i14 = this.f5534h;
        if (i13 >= i14) {
            this.f5542q = i13 - i14;
        }
        int i15 = this.f5543r - i;
        this.f5543r = i15;
        if (i15 < 0) {
            this.f5543r = 0;
        }
        while (true) {
            ya yaVar = this.f5529c;
            SparseArray sparseArray = (SparseArray) yaVar.f12556c;
            if (i10 >= sparseArray.size() - 1) {
                break;
            }
            int i16 = i10 + 1;
            if (i12 < sparseArray.keyAt(i16)) {
                break;
            }
            ((bw1) yaVar.f12557d).mo0a(sparseArray.valueAt(i10));
            sparseArray.removeAt(i10);
            int i17 = yaVar.f12555b;
            if (i17 > 0) {
                yaVar.f12555b = i17 - 1;
            }
            i10 = i16;
        }
        if (this.f5540o != 0) {
            return this.f5535j[this.f5542q];
        }
        int i18 = this.f5542q;
        if (i18 == 0) {
            i18 = this.f5534h;
        }
        int i19 = i18 - 1;
        return this.f5535j[i19] + ((long) this.f5536k[i19]);
    }

    public final int j(int i) {
        int i10 = this.f5542q + i;
        int i11 = this.f5534h;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final void k(boolean z5) {
        ya yaVar;
        SparseArray sparseArray;
        dz1 dz1Var = this.f5527a;
        i iVar = (i) dz1Var.f4768b;
        m6 m6Var = (m6) dz1Var.f4770d;
        if (((h) m6Var.f7790d) != null) {
            iVar.j(m6Var);
            m6Var.f7790d = null;
            m6Var.f7791e = null;
        }
        m6 m6Var2 = (m6) dz1Var.f4770d;
        int i = 0;
        ix.k0(((h) m6Var2.f7790d) == null);
        m6Var2.f7788b = 0L;
        m6Var2.f7789c = 65536L;
        m6 m6Var3 = (m6) dz1Var.f4770d;
        dz1Var.f4771e = m6Var3;
        dz1Var.f4772f = m6Var3;
        dz1Var.f4767a = 0L;
        iVar.g();
        this.f5540o = 0;
        this.f5541p = 0;
        this.f5542q = 0;
        this.f5543r = 0;
        this.f5548w = true;
        this.f5544s = Long.MIN_VALUE;
        this.f5545t = Long.MIN_VALUE;
        this.f5546u = Long.MIN_VALUE;
        this.f5547v = false;
        while (true) {
            yaVar = this.f5529c;
            sparseArray = (SparseArray) yaVar.f12556c;
            if (i >= sparseArray.size()) {
                break;
            }
            ((bw1) yaVar.f12557d).mo0a(sparseArray.valueAt(i));
            i++;
        }
        yaVar.f12555b = -1;
        sparseArray.clear();
        if (z5) {
            this.f5550y = null;
            this.f5549x = true;
            this.f5551z = true;
        }
    }

    public final synchronized boolean l(boolean z5) {
        int i = this.f5543r;
        boolean z10 = false;
        if (i != this.f5540o) {
            if (((ez1) this.f5529c.f(this.f5541p + i)).f5153a != this.f5532f) {
                return true;
            }
            int iJ = j(this.f5543r);
            if (this.f5533g != null) {
                int i10 = this.f5537l[iJ];
            } else {
                z10 = true;
            }
            return z10;
        }
        if (z5 || this.f5547v) {
            z10 = true;
        } else {
            jx1 jx1Var = this.f5550y;
            if (jx1Var != null) {
                if (jx1Var == this.f5532f) {
                    return false;
                }
                z10 = true;
            }
        }
        return z10;
    }

    public final synchronized boolean m(long j10, boolean z5) {
        fz1 fz1Var;
        long j11;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f5543r = 0;
                        dz1 dz1Var = this.f5527a;
                        dz1Var.f4771e = (m6) dz1Var.f4770d;
                        int iJ = j(0);
                        int i = this.f5543r;
                        int iH = this.f5540o;
                        if ((i != iH) && j10 >= this.f5538m[iJ]) {
                            if (j10 > this.f5546u) {
                                if (z5) {
                                    z5 = true;
                                }
                            }
                            if (this.f5551z) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < iH) {
                                        try {
                                            if (this.f5538m[iJ] >= j10) {
                                                fz1Var = this;
                                                j11 = j10;
                                                iH = i10;
                                                break;
                                            }
                                            iJ++;
                                            if (iJ == this.f5534h) {
                                                iJ = 0;
                                            }
                                            i10++;
                                        } catch (Throwable th2) {
                                            Throwable th3 = th2;
                                            throw th3;
                                        }
                                    } else {
                                        fz1Var = this;
                                        j11 = j10;
                                        if (!z5) {
                                            iH = -1;
                                        }
                                    }
                                }
                            } else {
                                fz1Var = this;
                                j11 = j10;
                                iH = fz1Var.h(iJ, iH, j11, true);
                            }
                            if (iH != -1) {
                                fz1Var.f5544s = j11;
                                fz1Var.f5543r += iH;
                                return true;
                            }
                        }
                        return false;
                    } catch (Throwable th4) {
                        th = th4;
                        throw th3;
                    }
                } finally {
                    th = th;
                    while (true) {
                        Throwable th5 = th;
                        try {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void n() {
        long jI;
        dz1 dz1Var = this.f5527a;
        synchronized (this) {
            int i = this.f5540o;
            jI = i == 0 ? -1L : i(i);
        }
        dz1Var.b(jI);
    }
}
