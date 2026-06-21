package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f4326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4327h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f4328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f4329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f4330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f4331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f4332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f4333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f4334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f4335q;

    public cu1(bv1 bv1Var, lo0 lo0Var, xo0 xo0Var, et1 et1Var) {
        this.f4328j = bv1Var;
        this.f4329k = lo0Var;
        this.f4335q = xo0Var;
        this.f4327h = new bh();
        this.i = new nh();
        this.f4326g = new ArrayList();
    }

    public static i4.c0 o(j3.o0 o0Var, Object obj, long j10, long j11, j3.n0 n0Var, j3.m0 m0Var) {
        o0Var.g(obj, m0Var);
        o0Var.n(m0Var.f26276c, n0Var);
        o0Var.b(obj);
        int i = m0Var.f26280g.f26220a;
        if (i != 0) {
            if (i == 1) {
                m0Var.f(0);
            }
            m0Var.f26280g.getClass();
            m0Var.g(0);
        }
        o0Var.g(obj, m0Var);
        int iC = m0Var.c(j10);
        return iC == -1 ? new i4.c0(obj, j11, m0Var.b(j10)) : new i4.c0(obj, iC, m0Var.e(iC), j11, -1);
    }

    public static hy1 t(ci ciVar, Object obj, long j10, nh nhVar, bh bhVar) {
        ciVar.o(obj, bhVar);
        ciVar.b(bhVar.f3786c, nhVar, 0L);
        ciVar.e(obj);
        bhVar.f3789f.getClass();
        ciVar.o(obj, bhVar);
        bhVar.f3789f.a(-1);
        return new hy1(obj, j10, -1);
    }

    public bu1 A(ci ciVar, Object obj, long j10, long j11, long j12) {
        bh bhVar = (bh) this.f4327h;
        ciVar.o(obj, bhVar);
        bhVar.getClass();
        bhVar.f3789f.getClass();
        hy1 hy1Var = new hy1(obj, j12, -1);
        boolean z5 = !hy1Var.b();
        boolean zB = B(ciVar, hy1Var);
        boolean zC = C(ciVar, hy1Var, z5);
        long j13 = bhVar.f3787d;
        return new bu1(hy1Var, (j13 == -9223372036854775807L || j10 < j13) ? j10 : Math.max(0L, (-1) + j13), j11, -9223372036854775807L, j13, z5, zB, zC);
    }

    public boolean B(ci ciVar, hy1 hy1Var) {
        if (!hy1Var.b() && hy1Var.f6303e == -1) {
            Object obj = hy1Var.f6299a;
            int i = ciVar.o(obj, (bh) this.f4327h).f3786c;
            if (ciVar.b(i, (nh) this.i, 0L).f8308l == ciVar.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean C(ci ciVar, hy1 hy1Var, boolean z5) {
        int iE = ciVar.e(hy1Var.f6299a);
        bh bhVar = (bh) this.f4327h;
        int i = ciVar.d(iE, bhVar, false).f3786c;
        nh nhVar = (nh) this.i;
        return !ciVar.b(i, nhVar, 0L).f8304g && ciVar.l(iE, bhVar, nhVar, this.f4321b, this.f4322c) == -1 && z5;
    }

    public int D(ci ciVar, int i) {
        this.f4321b = i;
        return w(ciVar);
    }

    public int E(ci ciVar, boolean z5) {
        this.f4322c = z5;
        return w(ciVar);
    }

    public void F(et1 et1Var) {
        et1Var.getClass();
        K();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.hz1, java.lang.Object] */
    public void G(long j10) {
        au1 au1Var = (au1) this.f4333o;
        if (au1Var != null) {
            ix.k0(au1Var.f3429m == null);
            if (au1Var.f3422e) {
                au1Var.f3418a.n(j10 - au1Var.f3432p);
            }
        }
    }

    public boolean H() {
        au1 au1Var = (au1) this.f4333o;
        if (au1Var != null) {
            return !au1Var.f3424g.f3913h && au1Var.b() && ((au1) this.f4333o).f3424g.f3910e != -9223372036854775807L && this.f4323d < 100;
        }
        return true;
    }

    public bu1 I(long j10, lu1 lu1Var) {
        au1 au1Var = (au1) this.f4333o;
        return au1Var == null ? y(lu1Var.f7632a, lu1Var.f7633b, lu1Var.f7634c, lu1Var.f7648r) : x(lu1Var.f7632a, au1Var, j10);
    }

    public au1 J(bu1 bu1Var) {
        au1 au1Var;
        long j10 = bu1Var.f3907b;
        au1 au1Var2 = (au1) this.f4333o;
        long j11 = au1Var2 == null ? 1000000000000L : (au1Var2.f3432p + au1Var2.f3424g.f3910e) - j10;
        int i = 0;
        while (true) {
            if (i >= this.f4326g.size()) {
                au1Var = null;
                break;
            }
            bu1 bu1Var2 = ((au1) this.f4326g.get(i)).f3424g;
            long j12 = bu1Var2.f3910e;
            long j13 = bu1Var.f3910e;
            if ((j12 == -9223372036854775807L || j12 == j13) && bu1Var2.f3907b == j10 && bu1Var2.f3906a.equals(bu1Var.f3906a)) {
                au1Var = (au1) this.f4326g.remove(i);
                break;
            }
            i++;
        }
        if (au1Var == null) {
            ut1 ut1Var = (ut1) ((xo0) this.f4335q).f12221c;
            i iVarI = ut1Var.f11080g.i(ut1Var.f11094v);
            ut1Var.Z.getClass();
            au1Var = new au1(ut1Var.f11074c, j11, ut1Var.f11078e, iVarI, ut1Var.f11092t, bu1Var, ut1Var.f11079f);
        } else {
            au1Var.f3424g = bu1Var;
            au1Var.f3432p = j11;
        }
        au1 au1Var3 = (au1) this.f4333o;
        if (au1Var3 == null) {
            this.f4330l = au1Var;
            this.f4331m = au1Var;
            this.f4332n = au1Var;
        } else if (au1Var != au1Var3.f3429m) {
            au1Var3.l();
            au1Var3.f3429m = au1Var;
        }
        this.f4324e = null;
        this.f4333o = au1Var;
        this.f4323d++;
        u();
        return au1Var;
    }

    public void K() {
        if (this.f4326g.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f4326g.size(); i++) {
            ((au1) this.f4326g.get(i)).h();
        }
        this.f4326g = arrayList;
        this.f4334p = null;
        S();
    }

    public au1 L() {
        return (au1) this.f4330l;
    }

    public au1 M() {
        return (au1) this.f4331m;
    }

    public au1 N() {
        return (au1) this.f4332n;
    }

    public au1 O() {
        au1 au1Var = (au1) this.f4332n;
        au1 au1Var2 = (au1) this.f4331m;
        if (au1Var == au1Var2) {
            au1Var2.getClass();
            this.f4332n = au1Var2.f3429m;
        }
        au1Var2.getClass();
        this.f4331m = au1Var2.f3429m;
        u();
        au1 au1Var3 = (au1) this.f4331m;
        au1Var3.getClass();
        return au1Var3;
    }

    public void P() {
        au1 au1Var = (au1) this.f4332n;
        au1Var.getClass();
        this.f4332n = au1Var.f3429m;
        u();
        ((au1) this.f4332n).getClass();
    }

    public au1 Q() {
        au1 au1Var = (au1) this.f4330l;
        if (au1Var == null) {
            return null;
        }
        if (au1Var == ((au1) this.f4331m)) {
            this.f4331m = au1Var.f3429m;
        }
        if (au1Var == ((au1) this.f4332n)) {
            this.f4332n = au1Var.f3429m;
        }
        au1Var.h();
        int i = this.f4323d - 1;
        this.f4323d = i;
        if (i == 0) {
            this.f4333o = null;
            au1 au1Var2 = (au1) this.f4330l;
            this.f4324e = au1Var2.f3419b;
            this.f4325f = au1Var2.f3424g.f3906a.f6302d;
        }
        this.f4330l = ((au1) this.f4330l).f3429m;
        u();
        return (au1) this.f4330l;
    }

    public int R(au1 au1Var) {
        au1Var.getClass();
        int i = 0;
        if (au1Var.equals((au1) this.f4333o)) {
            return 0;
        }
        this.f4333o = au1Var;
        int i10 = 0;
        while (true) {
            au1Var = au1Var.f3429m;
            if (au1Var == null) {
                break;
            }
            if (au1Var == ((au1) this.f4331m)) {
                au1 au1Var2 = (au1) this.f4330l;
                this.f4331m = au1Var2;
                this.f4332n = au1Var2;
                i10 = 3;
            }
            if (au1Var == ((au1) this.f4332n)) {
                this.f4332n = (au1) this.f4331m;
                i10 |= 2;
            }
            au1Var.h();
            this.f4323d--;
        }
        au1 au1Var3 = (au1) this.f4333o;
        au1Var3.getClass();
        if (au1Var3.f3429m != null) {
            au1Var3.l();
            au1Var3.f3429m = null;
            while (true) {
                g gVar = au1Var3.f3431o;
                if (i >= gVar.f5552b) {
                    break;
                }
                gVar.b(i);
                d dVar = ((d[]) au1Var3.f3431o.f5554d)[i];
                i++;
            }
        }
        u();
        return i10;
    }

    public void S() {
        au1 au1Var = (au1) this.f4334p;
        if (au1Var == null || au1Var.c()) {
            this.f4334p = null;
            for (int i = 0; i < this.f4326g.size(); i++) {
                au1 au1Var2 = (au1) this.f4326g.get(i);
                if (!au1Var2.c()) {
                    this.f4334p = au1Var2;
                    return;
                }
            }
        }
    }

    public au1 T(gy1 gy1Var) {
        for (int i = 0; i < this.f4326g.size(); i++) {
            au1 au1Var = (au1) this.f4326g.get(i);
            if (au1Var.f3418a == gy1Var) {
                return au1Var;
            }
        }
        return null;
    }

    public void U() {
        if (this.f4323d == 0) {
            return;
        }
        au1 au1Var = (au1) this.f4330l;
        au1Var.getClass();
        this.f4324e = au1Var.f3419b;
        this.f4325f = au1Var.f3424g.f3906a.f6302d;
        while (au1Var != null) {
            au1Var.h();
            au1Var = au1Var.f3429m;
        }
        this.f4330l = null;
        this.f4333o = null;
        this.f4331m = null;
        this.f4332n = null;
        this.f4323d = 0;
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00af, code lost:
    
        return R(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int V(com.google.android.gms.internal.ads.ci r17, long r18, long r20, long r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.Object r2 = r0.f4330l
            com.google.android.gms.internal.ads.au1 r2 = (com.google.android.gms.internal.ads.au1) r2
            r3 = 0
        L9:
            r4 = 0
            if (r2 == 0) goto Lb0
            com.google.android.gms.internal.ads.bu1 r5 = r2.f3424g
            if (r3 != 0) goto L17
            com.google.android.gms.internal.ads.bu1 r3 = r0.W(r1, r5)
            r6 = r18
            goto L32
        L17:
            r6 = r18
            com.google.android.gms.internal.ads.bu1 r8 = r0.x(r1, r3, r6)
            if (r8 == 0) goto Lab
            long r9 = r5.f3907b
            long r11 = r8.f3907b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto Lab
            com.google.android.gms.internal.ads.hy1 r9 = r5.f3906a
            com.google.android.gms.internal.ads.hy1 r10 = r8.f3906a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lab
            r3 = r8
        L32:
            long r8 = r5.f3908c
            com.google.android.gms.internal.ads.bu1 r8 = r3.b(r8)
            r2.f3424g = r8
            long r9 = r5.f3910e
            long r11 = r3.f3910e
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto La4
            java.lang.Object r1 = r2.f3418a
            boolean r3 = r1 instanceof com.google.android.gms.internal.ads.px1
            r5 = -9223372036854775808
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L5a
            long r7 = r8.f3909d
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 != 0) goto L56
            r7 = r5
        L56:
            com.google.android.gms.internal.ads.px1 r1 = (com.google.android.gms.internal.ads.px1) r1
            r1.f9205f = r7
        L5a:
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 != 0) goto L64
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L67
        L64:
            long r7 = r2.f3432p
            long r7 = r7 + r11
        L67:
            java.lang.Object r1 = r0.f4331m
            com.google.android.gms.internal.ads.au1 r1 = (com.google.android.gms.internal.ads.au1) r1
            r3 = 1
            if (r2 != r1) goto L78
            int r1 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r1 == 0) goto L76
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L78
        L76:
            r1 = r3
            goto L79
        L78:
            r1 = r4
        L79:
            java.lang.Object r11 = r0.f4332n
            com.google.android.gms.internal.ads.au1 r11 = (com.google.android.gms.internal.ads.au1) r11
            if (r2 != r11) goto L89
            int r5 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r5 == 0) goto L87
            int r5 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r5 < 0) goto L89
        L87:
            r5 = r3
            goto L8a
        L89:
            r5 = r4
        L8a:
            int r2 = r0.R(r2)
            if (r2 == 0) goto L91
            return r2
        L91:
            int r2 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r2 != 0) goto L96
            r9 = r13
        L96:
            if (r1 == 0) goto L9e
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 != 0) goto L9d
            goto L9e
        L9d:
            r4 = r3
        L9e:
            if (r5 == 0) goto La3
            r1 = r4 | 2
            return r1
        La3:
            return r4
        La4:
            com.google.android.gms.internal.ads.au1 r3 = r2.f3429m
            r15 = r3
            r3 = r2
            r2 = r15
            goto L9
        Lab:
            int r1 = r0.R(r3)
            return r1
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cu1.V(com.google.android.gms.internal.ads.ci, long, long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.bu1 W(com.google.android.gms.internal.ads.ci r19, com.google.android.gms.internal.ads.bu1 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.hy1 r3 = r2.f3906a
            boolean r4 = r3.b()
            int r5 = r3.f6303e
            r6 = -1
            if (r4 != 0) goto L16
            if (r5 != r6) goto L16
            r4 = 1
        L14:
            r11 = r4
            goto L18
        L16:
            r4 = 0
            goto L14
        L18:
            int r4 = r3.f6300b
            boolean r12 = r0.B(r1, r3)
            boolean r13 = r0.C(r1, r3, r11)
            java.lang.Object r7 = r3.f6299a
            java.lang.Object r8 = r0.f4327h
            com.google.android.gms.internal.ads.bh r8 = (com.google.android.gms.internal.ads.bh) r8
            r1.o(r7, r8)
            boolean r1 = r3.b()
            r9 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L3a
            if (r5 != r6) goto L3d
        L3a:
            r16 = r14
            goto L48
        L3d:
            com.google.android.gms.internal.ads.ou r1 = r8.f3789f
            com.google.android.gms.internal.ads.a r1 = r1.a(r5)
            r1.getClass()
            r16 = r9
        L48:
            boolean r1 = r3.b()
            if (r1 == 0) goto L58
            int r1 = r3.f6301c
            long r9 = r8.b(r4, r1)
        L54:
            r14 = r9
            r9 = r16
            goto L61
        L58:
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 == 0) goto L5e
            r14 = r9
            goto L61
        L5e:
            long r9 = r8.f3787d
            goto L54
        L61:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6b
            r8.c(r4)
            goto L70
        L6b:
            if (r5 == r6) goto L70
            r8.c(r5)
        L70:
            com.google.android.gms.internal.ads.bu1 r1 = new com.google.android.gms.internal.ads.bu1
            r5 = r3
            long r3 = r2.f3907b
            long r6 = r2.f3908c
            r2 = r5
            r5 = r6
            r7 = r9
            r9 = r14
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cu1.W(com.google.android.gms.internal.ads.ci, com.google.android.gms.internal.ads.bu1):com.google.android.gms.internal.ads.bu1");
    }

    public hy1 X(ci ciVar, Object obj) {
        long jV;
        int iE;
        bh bhVar = (bh) this.f4327h;
        int i = ciVar.o(obj, bhVar).f3786c;
        Object obj2 = this.f4324e;
        if (obj2 == null || (iE = ciVar.e(obj2)) == -1 || ciVar.d(iE, bhVar, false).f3786c != i) {
            au1 au1Var = (au1) this.f4330l;
            while (true) {
                if (au1Var == null) {
                    au1 au1Var2 = (au1) this.f4330l;
                    while (true) {
                        if (au1Var2 != null) {
                            int iE2 = ciVar.e(au1Var2.f3419b);
                            if (iE2 != -1 && ciVar.d(iE2, bhVar, false).f3786c == i) {
                                jV = au1Var2.f3424g.f3906a.f6302d;
                                break;
                            }
                            au1Var2 = au1Var2.f3429m;
                        } else {
                            jV = v(obj);
                            if (jV == -1) {
                                jV = this.f4320a;
                                this.f4320a = 1 + jV;
                                if (((au1) this.f4330l) == null) {
                                    this.f4324e = obj;
                                    this.f4325f = jV;
                                }
                            }
                        }
                    }
                } else {
                    if (au1Var.f3419b.equals(obj)) {
                        jV = au1Var.f3424g.f3906a.f6302d;
                        break;
                    }
                    au1Var = au1Var.f3429m;
                }
            }
        } else {
            jV = this.f4325f;
        }
        long j10 = jV;
        ciVar.o(obj, bhVar);
        int i10 = bhVar.f3786c;
        nh nhVar = (nh) this.i;
        ciVar.b(i10, nhVar, 0L);
        for (int iE3 = ciVar.e(obj); iE3 >= nhVar.f8307k; iE3--) {
            ciVar.d(iE3, bhVar, true);
            bhVar.f3789f.getClass();
            bhVar.f3789f.a(-1);
        }
        return t(ciVar, obj, j10, nhVar, bhVar);
    }

    public s3.j0 a() {
        s3.j0 j0Var = (s3.j0) this.f4331m;
        if (j0Var == null) {
            return null;
        }
        if (j0Var == ((s3.j0) this.f4332n)) {
            this.f4332n = j0Var.f32593m;
        }
        if (j0Var == ((s3.j0) this.f4333o)) {
            this.f4333o = j0Var.f32593m;
        }
        j0Var.i();
        int i = this.f4323d - 1;
        this.f4323d = i;
        if (i == 0) {
            this.f4334p = null;
            s3.j0 j0Var2 = (s3.j0) this.f4331m;
            this.f4324e = j0Var2.f32583b;
            this.f4325f = j0Var2.f32588g.f32598a.f20864d;
        }
        this.f4331m = ((s3.j0) this.f4331m).f32593m;
        l();
        return (s3.j0) this.f4331m;
    }

    public void b() {
        if (this.f4323d == 0) {
            return;
        }
        s3.j0 j0Var = (s3.j0) this.f4331m;
        j0Var.getClass();
        this.f4324e = j0Var.f32583b;
        this.f4325f = j0Var.f32588g.f32598a.f20864d;
        while (j0Var != null) {
            j0Var.i();
            j0Var = j0Var.f32593m;
        }
        this.f4331m = null;
        this.f4334p = null;
        this.f4332n = null;
        this.f4333o = null;
        this.f4323d = 0;
        l();
    }

    public s3.k0 c(j3.o0 o0Var, s3.j0 j0Var, long j10) {
        j3.m0 m0Var;
        long j11;
        j3.o0 o0Var2;
        Object obj;
        long j12;
        long j13;
        long j14;
        long jQ;
        j3.m0 m0Var2 = (j3.m0) this.f4327h;
        s3.k0 k0Var = j0Var.f32588g;
        long j15 = (j0Var.f32596p + k0Var.f32602e) - j10;
        if (k0Var.f32605h) {
            j3.m0 m0Var3 = (j3.m0) this.f4327h;
            s3.k0 k0Var2 = j0Var.f32588g;
            i4.c0 c0Var = k0Var2.f32598a;
            long j16 = k0Var2.f32600c;
            int iD = o0Var.d(o0Var.b(c0Var.f20861a), (j3.m0) this.f4327h, (j3.n0) this.i, this.f4321b, this.f4322c);
            if (iD != -1) {
                int i = o0Var.f(iD, m0Var3, true).f26276c;
                Object obj2 = m0Var3.f26275b;
                obj2.getClass();
                long j17 = c0Var.f20864d;
                if (o0Var.m(i, (j3.n0) this.i, 0L).f26320n == iD) {
                    Pair pairJ = o0Var.j((j3.n0) this.i, (j3.m0) this.f4327h, i, -9223372036854775807L, Math.max(0L, j15));
                    if (pairJ != null) {
                        Object obj3 = pairJ.first;
                        long jLongValue = ((Long) pairJ.second).longValue();
                        s3.j0 j0Var2 = j0Var.f32593m;
                        if (j0Var2 == null || !j0Var2.f32583b.equals(obj3)) {
                            jQ = q(obj3);
                            if (jQ == -1) {
                                jQ = this.f4320a;
                                this.f4320a = 1 + jQ;
                            }
                        } else {
                            jQ = j0Var2.f32588g.f32598a.f20864d;
                        }
                        obj = obj3;
                        j12 = jLongValue;
                        j14 = jQ;
                        j13 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j12 = 0;
                    j13 = 0;
                    j14 = j17;
                }
                i4.c0 c0VarO = o(o0Var, obj, j12, j14, (j3.n0) this.i, (j3.m0) this.f4327h);
                if (j13 != -9223372036854775807L && j16 != -9223372036854775807L) {
                    int i10 = o0Var.g(c0Var.f20861a, m0Var3).f26280g.f26220a;
                    m0Var3.f26280g.getClass();
                    if (i10 > 0) {
                        m0Var3.g(0);
                    }
                }
                return d(o0Var, c0VarO, j13, j12);
            }
            return null;
        }
        i4.c0 c0Var2 = k0Var.f32598a;
        Object obj4 = c0Var2.f20861a;
        int i11 = c0Var2.f20865e;
        o0Var.g(obj4, m0Var2);
        boolean z5 = k0Var.f32604g;
        if (!c0Var2.b()) {
            if (i11 != -1) {
                m0Var2.f(i11);
            }
            int iE = m0Var2.e(i11);
            m0Var2.g(i11);
            if (iE != m0Var2.f26280g.a(i11).f26208a) {
                return e(o0Var, c0Var2.f20861a, c0Var2.f20865e, iE, k0Var.f32602e, c0Var2.f20864d, z5);
            }
            o0Var.g(obj4, m0Var2);
            m0Var2.d(i11);
            m0Var2.f26280g.a(i11).getClass();
            return f(o0Var, c0Var2.f20861a, 0L, k0Var.f32602e, c0Var2.f20864d, false);
        }
        int i12 = c0Var2.f20862b;
        int i13 = m0Var2.f26280g.a(i12).f26208a;
        if (i13 == -1) {
            return null;
        }
        int iA = m0Var2.f26280g.a(i12).a(c0Var2.f20863c);
        if (iA < i13) {
            return e(o0Var, c0Var2.f20861a, i12, iA, k0Var.f32600c, c0Var2.f20864d, z5);
        }
        long jLongValue2 = k0Var.f32600c;
        if (jLongValue2 == -9223372036854775807L) {
            j3.n0 n0Var = (j3.n0) this.i;
            int i14 = m0Var2.f26276c;
            long jMax = Math.max(0L, j15);
            j11 = 0;
            Pair pairJ2 = o0Var.j(n0Var, m0Var2, i14, -9223372036854775807L, jMax);
            m0Var = m0Var2;
            o0Var2 = o0Var;
            if (pairJ2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairJ2.second).longValue();
        } else {
            m0Var = m0Var2;
            j11 = 0;
            o0Var2 = o0Var;
        }
        int i15 = c0Var2.f20862b;
        o0Var2.g(obj4, m0Var);
        m0Var.d(i15);
        m0Var.f26280g.a(i15).getClass();
        return f(o0Var, c0Var2.f20861a, Math.max(j11, jLongValue2), k0Var.f32600c, c0Var2.f20864d, z5);
    }

    public s3.k0 d(j3.o0 o0Var, i4.c0 c0Var, long j10, long j11) {
        o0Var.g(c0Var.f20861a, (j3.m0) this.f4327h);
        return c0Var.b() ? e(o0Var, c0Var.f20861a, c0Var.f20862b, c0Var.f20863c, j10, c0Var.f20864d, false) : f(o0Var, c0Var.f20861a, j11, j10, c0Var.f20864d, false);
    }

    public s3.k0 e(j3.o0 o0Var, Object obj, int i, int i10, long j10, long j11, boolean z5) {
        i4.c0 c0Var = new i4.c0(obj, i, i10, j11, -1);
        j3.m0 m0Var = (j3.m0) this.f4327h;
        long jA = o0Var.g(obj, m0Var).a(i, i10);
        if (i10 == m0Var.e(i)) {
            m0Var.f26280g.getClass();
        }
        m0Var.g(i);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new s3.k0(c0Var, jMax, j10, -9223372036854775807L, jA, z5, false, false, false, false);
    }

    public s3.k0 f(j3.o0 o0Var, Object obj, long j10, long j11, long j12, boolean z5) {
        long j13;
        j3.m0 m0Var = (j3.m0) this.f4327h;
        o0Var.g(obj, m0Var);
        int iB = m0Var.b(j10);
        boolean z10 = false;
        if (iB != -1) {
            m0Var.g(iB);
        } else if (m0Var.f26280g.f26220a > 0) {
            m0Var.g(0);
        }
        i4.c0 c0Var = new i4.c0(obj, j12, iB);
        if (!c0Var.b() && iB == -1) {
            z10 = true;
        }
        boolean zJ = j(o0Var, c0Var);
        boolean zI = i(o0Var, c0Var, z10);
        if (iB != -1) {
            m0Var.g(iB);
        }
        if (iB != -1) {
            m0Var.f(iB);
        }
        if (iB != -1) {
            m0Var.d(iB);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        long j14 = (j13 == -9223372036854775807L || j13 == Long.MIN_VALUE) ? m0Var.f26277d : j13;
        return new s3.k0(c0Var, (j14 == -9223372036854775807L || j10 < j14) ? j10 : Math.max(0L, j14 - ((long) 1)), j11, j13, j14, z5, false, z10, zJ, zI);
    }

    public s3.j0 g() {
        return (s3.j0) this.f4333o;
    }

    public s3.k0 h(j3.o0 o0Var, s3.k0 k0Var) {
        long j10;
        i4.c0 c0Var = k0Var.f32598a;
        boolean zB = c0Var.b();
        int i = c0Var.f20865e;
        boolean z5 = !zB && i == -1;
        int i10 = c0Var.f20862b;
        boolean zJ = j(o0Var, c0Var);
        boolean zI = i(o0Var, c0Var, z5);
        Object obj = c0Var.f20861a;
        j3.m0 m0Var = (j3.m0) this.f4327h;
        o0Var.g(obj, m0Var);
        if (c0Var.b() || i == -1) {
            j10 = -9223372036854775807L;
        } else {
            m0Var.d(i);
            j10 = 0;
        }
        long jA = c0Var.b() ? m0Var.a(i10, c0Var.f20863c) : (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? m0Var.f26277d : j10;
        if (c0Var.b()) {
            m0Var.g(i10);
        } else if (i != -1) {
            m0Var.g(i);
        }
        return new s3.k0(c0Var, k0Var.f32599b, k0Var.f32600c, j10, jA, k0Var.f32603f, false, z5, zJ, zI);
    }

    public boolean i(j3.o0 o0Var, i4.c0 c0Var, boolean z5) {
        int iB = o0Var.b(c0Var.f20861a);
        return !o0Var.m(o0Var.f(iB, (j3.m0) this.f4327h, false).f26276c, (j3.n0) this.i, 0L).i && o0Var.d(iB, (j3.m0) this.f4327h, (j3.n0) this.i, this.f4321b, this.f4322c) == -1 && z5;
    }

    public boolean j(j3.o0 o0Var, i4.c0 c0Var) {
        boolean z5 = !c0Var.b() && c0Var.f20865e == -1;
        Object obj = c0Var.f20861a;
        if (z5) {
            if (o0Var.m(o0Var.g(obj, (j3.m0) this.f4327h).f26276c, (j3.n0) this.i, 0L).f26321o == o0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public void k() {
        s3.j0 j0Var = (s3.j0) this.f4335q;
        if (j0Var == null || j0Var.h()) {
            this.f4335q = null;
            for (int i = 0; i < this.f4326g.size(); i++) {
                s3.j0 j0Var2 = (s3.j0) this.f4326g.get(i);
                if (!j0Var2.h()) {
                    this.f4335q = j0Var2;
                    return;
                }
            }
        }
    }

    public void l() {
        ad.g0 g0VarQ = ad.j0.q();
        for (s3.j0 j0Var = (s3.j0) this.f4331m; j0Var != null; j0Var = j0Var.f32593m) {
            g0VarQ.b(j0Var.f32588g.f32598a);
        }
        s3.j0 j0Var2 = (s3.j0) this.f4332n;
        ((m3.v) this.f4329k).c(new q0.o(this, g0VarQ, j0Var2 == null ? null : j0Var2.f32588g.f32598a, 4));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [i4.d1, java.lang.Object] */
    public void m(long j10) {
        s3.j0 j0Var = (s3.j0) this.f4334p;
        if (j0Var != null) {
            com.google.android.gms.internal.measurement.h5.r(j0Var.f32593m == null);
            if (j0Var.f32586e) {
                j0Var.f32582a.reevaluateBuffer(j10 - j0Var.f32596p);
            }
        }
    }

    public int n(s3.j0 j0Var) {
        j0Var.getClass();
        int i = 0;
        if (j0Var.equals((s3.j0) this.f4334p)) {
            return 0;
        }
        this.f4334p = j0Var;
        while (true) {
            j0Var = j0Var.f32593m;
            if (j0Var == null) {
                break;
            }
            if (j0Var == ((s3.j0) this.f4332n)) {
                s3.j0 j0Var2 = (s3.j0) this.f4331m;
                this.f4332n = j0Var2;
                this.f4333o = j0Var2;
                i = 3;
            }
            if (j0Var == ((s3.j0) this.f4333o)) {
                this.f4333o = (s3.j0) this.f4332n;
                i |= 2;
            }
            j0Var.i();
            this.f4323d--;
        }
        s3.j0 j0Var3 = (s3.j0) this.f4334p;
        j0Var3.getClass();
        if (j0Var3.f32593m != null) {
            j0Var3.b();
            j0Var3.f32593m = null;
            j0Var3.c();
        }
        l();
        return i;
    }

    public i4.c0 p(j3.o0 o0Var, Object obj, long j10) {
        long jQ;
        int iB;
        Object obj2 = obj;
        j3.n0 n0Var = (j3.n0) this.i;
        j3.m0 m0Var = (j3.m0) this.f4327h;
        int i = o0Var.g(obj2, m0Var).f26276c;
        Object obj3 = this.f4324e;
        if (obj3 == null || (iB = o0Var.b(obj3)) == -1 || o0Var.f(iB, m0Var, false).f26276c != i) {
            s3.j0 j0Var = (s3.j0) this.f4331m;
            while (true) {
                if (j0Var == null) {
                    s3.j0 j0Var2 = (s3.j0) this.f4331m;
                    while (true) {
                        if (j0Var2 != null) {
                            int iB2 = o0Var.b(j0Var2.f32583b);
                            if (iB2 != -1 && o0Var.f(iB2, m0Var, false).f26276c == i) {
                                jQ = j0Var2.f32588g.f32598a.f20864d;
                                break;
                            }
                            j0Var2 = j0Var2.f32593m;
                        } else {
                            jQ = q(obj2);
                            if (jQ == -1) {
                                jQ = this.f4320a;
                                this.f4320a = 1 + jQ;
                                if (((s3.j0) this.f4331m) == null) {
                                    this.f4324e = obj2;
                                    this.f4325f = jQ;
                                }
                            }
                        }
                    }
                } else {
                    if (j0Var.f32583b.equals(obj2)) {
                        jQ = j0Var.f32588g.f32598a.f20864d;
                        break;
                    }
                    j0Var = j0Var.f32593m;
                }
            }
        } else {
            jQ = this.f4325f;
        }
        o0Var.g(obj2, m0Var);
        o0Var.n(m0Var.f26276c, n0Var);
        boolean z5 = false;
        for (int iB3 = o0Var.b(obj); iB3 >= n0Var.f26320n; iB3--) {
            o0Var.f(iB3, m0Var, true);
            boolean z10 = m0Var.f26280g.f26220a > 0;
            z5 |= z10;
            if (m0Var.c(m0Var.f26277d) != -1) {
                obj2 = m0Var.f26275b;
                obj2.getClass();
            }
            if (z5 && (!z10 || m0Var.f26277d != 0)) {
                break;
            }
        }
        return o(o0Var, obj2, j10, jQ, (j3.n0) this.i, (j3.m0) this.f4327h);
    }

    public long q(Object obj) {
        for (int i = 0; i < this.f4326g.size(); i++) {
            s3.j0 j0Var = (s3.j0) this.f4326g.get(i);
            if (j0Var.f32583b.equals(obj)) {
                return j0Var.f32588g.f32598a.f20864d;
            }
        }
        return -1L;
    }

    public int r(j3.o0 o0Var) {
        j3.o0 o0Var2;
        s3.j0 j0Var;
        s3.j0 j0Var2 = (s3.j0) this.f4331m;
        if (j0Var2 == null) {
            return 0;
        }
        int iB = o0Var.b(j0Var2.f32583b);
        while (true) {
            o0Var2 = o0Var;
            iB = o0Var2.d(iB, (j3.m0) this.f4327h, (j3.n0) this.i, this.f4321b, this.f4322c);
            while (true) {
                j0Var2.getClass();
                j0Var = j0Var2.f32593m;
                if (j0Var == null || j0Var2.f32588g.f32605h) {
                    break;
                }
                j0Var2 = j0Var;
            }
            if (iB == -1 || j0Var == null || o0Var2.b(j0Var.f32583b) != iB) {
                break;
            }
            j0Var2 = j0Var;
            o0Var = o0Var2;
        }
        int iN = n(j0Var2);
        j0Var2.f32588g = h(o0Var2, j0Var2.f32588g);
        return iN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
    
        return n(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int s(j3.o0 r18, long r19, long r21, long r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Object r2 = r0.f4331m
            s3.j0 r2 = (s3.j0) r2
            r3 = 0
        L9:
            r4 = 0
            if (r2 == 0) goto Lbb
            s3.k0 r5 = r2.f32588g
            if (r3 != 0) goto L17
            s3.k0 r3 = r0.h(r1, r5)
            r6 = r19
            goto L32
        L17:
            r6 = r19
            s3.k0 r8 = r0.c(r1, r3, r6)
            if (r8 == 0) goto Lb6
            long r9 = r5.f32599b
            long r11 = r8.f32599b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto Lb6
            i4.c0 r9 = r5.f32598a
            i4.c0 r10 = r8.f32598a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb6
            r3 = r8
        L32:
            long r8 = r3.f32602e
            long r10 = r5.f32600c
            long r12 = r5.f32602e
            s3.k0 r10 = r3.a(r10)
            r2.f32588g = r10
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 == 0) goto Lad
            r2.k()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L54
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L57
        L54:
            long r10 = r2.f32596p
            long r8 = r8 + r10
        L57:
            java.lang.Object r1 = r0.f4332n
            s3.j0 r1 = (s3.j0) r1
            r10 = 1
            r14 = -9223372036854775808
            if (r2 != r1) goto L70
            s3.k0 r1 = r2.f32588g
            boolean r1 = r1.f32604g
            if (r1 != 0) goto L70
            int r1 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r1 == 0) goto L6e
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 < 0) goto L70
        L6e:
            r1 = r10
            goto L71
        L70:
            r1 = r4
        L71:
            java.lang.Object r11 = r0.f4333o
            s3.j0 r11 = (s3.j0) r11
            if (r2 != r11) goto L81
            int r11 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r11 == 0) goto L7f
            int r8 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r8 < 0) goto L81
        L7f:
            r8 = r10
            goto L82
        L81:
            r8 = r4
        L82:
            int r2 = r0.n(r2)
            if (r2 == 0) goto L89
            return r2
        L89:
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 != 0) goto L9f
            long r11 = r5.f32601d
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 != 0) goto L9f
            long r11 = r3.f32601d
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 == 0) goto L9f
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 == 0) goto L9f
            r3 = r10
            goto La0
        L9f:
            r3 = r4
        La0:
            if (r1 == 0) goto La7
            if (r2 != 0) goto La6
            if (r3 == 0) goto La7
        La6:
            r4 = r10
        La7:
            if (r8 == 0) goto Lac
            r1 = r4 | 2
            return r1
        Lac:
            return r4
        Lad:
            s3.j0 r3 = r2.f32593m
            r16 = r3
            r3 = r2
            r2 = r16
            goto L9
        Lb6:
            int r1 = r0.n(r3)
            return r1
        Lbb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cu1.s(j3.o0, long, long, long):int");
    }

    public void u() {
        v41 v41Var = x41.f12018c;
        u41 u41Var = new u41(4);
        for (au1 au1Var = (au1) this.f4330l; au1Var != null; au1Var = au1Var.f3429m) {
            u41Var.a(au1Var.f3424g.f3906a);
        }
        au1 au1Var2 = (au1) this.f4331m;
        ((lo0) this.f4329k).e(new d1(this, u41Var, au1Var2 == null ? null : au1Var2.f3424g.f3906a, 12));
    }

    public long v(Object obj) {
        for (int i = 0; i < this.f4326g.size(); i++) {
            au1 au1Var = (au1) this.f4326g.get(i);
            if (au1Var.f3419b.equals(obj)) {
                return au1Var.f3424g.f3906a.f6302d;
            }
        }
        return -1L;
    }

    public int w(ci ciVar) {
        ci ciVar2;
        au1 au1Var;
        au1 au1Var2 = (au1) this.f4330l;
        if (au1Var2 == null) {
            return 0;
        }
        int iE = ciVar.e(au1Var2.f3419b);
        while (true) {
            ciVar2 = ciVar;
            iE = ciVar2.l(iE, (bh) this.f4327h, (nh) this.i, this.f4321b, this.f4322c);
            while (true) {
                au1Var = au1Var2.f3429m;
                if (au1Var == null || au1Var2.f3424g.f3911f) {
                    break;
                }
                au1Var2 = au1Var;
            }
            if (iE == -1 || au1Var == null || ciVar2.e(au1Var.f3419b) != iE) {
                break;
            }
            au1Var2 = au1Var;
            ciVar = ciVar2;
        }
        int iR = R(au1Var2);
        au1Var2.f3424g = W(ciVar2, au1Var2.f3424g);
        return iR;
    }

    public bu1 x(ci ciVar, au1 au1Var, long j10) {
        int i;
        ci ciVar2;
        long jLongValue;
        long j11;
        int i10;
        ci ciVar3;
        nh nhVar;
        Object obj;
        long j12;
        bh bhVar = (bh) this.f4327h;
        bu1 bu1Var = au1Var.f3424g;
        long j13 = au1Var.f3432p;
        long j14 = bu1Var.f3910e;
        long j15 = bu1Var.f3908c;
        hy1 hy1Var = bu1Var.f3906a;
        long j16 = (j13 + j14) - j10;
        long jLongValue2 = 0;
        if (bu1Var.f3911f) {
            Object obj2 = hy1Var.f6299a;
            int iE = ciVar.e(obj2);
            int i11 = this.f4321b;
            boolean z5 = this.f4322c;
            nh nhVar2 = (nh) this.i;
            bh bhVar2 = (bh) this.f4327h;
            int iL = ciVar.l(iE, bhVar2, nhVar2, i11, z5);
            if (iL != -1) {
                int i12 = ciVar.d(iL, bhVar2, true).f3786c;
                Object obj3 = bhVar2.f3785b;
                obj3.getClass();
                long j17 = hy1Var.f6302d;
                if (ciVar.b(i12, nhVar2, 0L).f8307k == iL) {
                    Pair pairN = ciVar.n(nhVar2, bhVar2, i12, -9223372036854775807L, Math.max(0L, j16));
                    if (pairN != null) {
                        Object obj4 = pairN.first;
                        jLongValue2 = ((Long) pairN.second).longValue();
                        au1 au1Var2 = au1Var.f3429m;
                        if (au1Var2 == null || !au1Var2.f3419b.equals(obj4)) {
                            long jV = v(obj4);
                            if (jV == -1) {
                                jV = this.f4320a;
                                this.f4320a = 1 + jV;
                            }
                            j17 = jV;
                        } else {
                            j17 = au1Var2.f3424g.f3906a.f6302d;
                        }
                        ciVar3 = ciVar;
                        nhVar = nhVar2;
                        obj = obj4;
                        j12 = -9223372036854775807L;
                    }
                } else {
                    ciVar3 = ciVar;
                    nhVar = nhVar2;
                    obj = obj3;
                    j12 = 0;
                }
                hy1 hy1VarT = t(ciVar3, obj, j17, nhVar, bhVar2);
                if (j12 != -9223372036854775807L && j15 != -9223372036854775807L) {
                    ciVar3.o(obj2, bhVar2).f3789f.getClass();
                    bhVar2.f3789f.getClass();
                }
                return y(ciVar3, hy1VarT, j12, jLongValue2);
            }
            return null;
        }
        Object obj5 = hy1Var.f6299a;
        ciVar.o(obj5, bhVar);
        if (!hy1Var.b()) {
            int i13 = hy1Var.f6303e;
            if (i13 != -1) {
                bhVar.f3789f.getClass();
                if (i13 == -1) {
                    bhVar.f3789f.a(-1);
                }
            }
            a aVarA = bhVar.f3789f.a(i13);
            int i14 = 0;
            while (true) {
                int[] iArr = aVarA.f2663d;
                if (i14 >= iArr.length || (i = iArr[i14]) == 0 || i == 1) {
                    break;
                }
                i14++;
            }
            bhVar.c(i13);
            if (i14 != bhVar.f3789f.a(i13).f2660a) {
                return z(ciVar, obj5, i13, i14, j14, hy1Var.f6302d);
            }
            ciVar.o(obj5, bhVar);
            bhVar.f3789f.a(i13).getClass();
            bhVar.f3789f.a(i13).getClass();
            return A(ciVar, obj5, 0L, j14, hy1Var.f6302d);
        }
        int i15 = hy1Var.f6300b;
        if (bhVar.f3789f.a(i15).f2660a == -1) {
            return null;
        }
        int i16 = hy1Var.f6301c;
        a aVarA2 = bhVar.f3789f.a(i15);
        int i17 = 1;
        int i18 = i16 + 1;
        while (true) {
            int[] iArr2 = aVarA2.f2663d;
            if (i18 >= iArr2.length || (i10 = iArr2[i18]) == 0 || i10 == i17) {
                break;
            }
            i18++;
            i17 = 1;
        }
        if (i18 < 0) {
            return z(ciVar, obj5, i15, i18, bu1Var.f3908c, hy1Var.f6302d);
        }
        if (j15 == -9223372036854775807L) {
            ciVar2 = ciVar;
            Pair pairN2 = ciVar2.n((nh) this.i, bhVar, bhVar.f3786c, -9223372036854775807L, Math.max(0L, j16));
            if (pairN2 == null) {
                return null;
            }
            jLongValue = ((Long) pairN2.second).longValue();
            j11 = -9223372036854775807L;
        } else {
            ciVar2 = ciVar;
            jLongValue = j15;
            j11 = jLongValue;
        }
        ciVar2.o(obj5, bhVar);
        bhVar.f3789f.a(i15).getClass();
        bhVar.f3789f.a(i15).getClass();
        return A(ciVar2, obj5, Math.max(0L, jLongValue), j11, hy1Var.f6302d);
    }

    public bu1 y(ci ciVar, hy1 hy1Var, long j10, long j11) {
        Object obj = hy1Var.f6299a;
        ciVar.o(obj, (bh) this.f4327h);
        return hy1Var.b() ? z(ciVar, obj, hy1Var.f6300b, hy1Var.f6301c, j10, hy1Var.f6302d) : A(ciVar, obj, j11, j10, hy1Var.f6302d);
    }

    public bu1 z(ci ciVar, Object obj, int i, int i10, long j10, long j11) {
        int i11;
        hy1 hy1Var = new hy1(obj, i, i10, j11, -1);
        bh bhVar = (bh) this.f4327h;
        long jB = ciVar.o(obj, bhVar).b(i, i10);
        a aVarA = bhVar.f3789f.a(i);
        int i12 = 0;
        while (true) {
            int[] iArr = aVarA.f2663d;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        if (i10 == i12) {
            bhVar.f3789f.getClass();
        }
        bhVar.c(i);
        long jMax = 0;
        if (jB != -9223372036854775807L && jB <= 0) {
            jMax = Math.max(0L, (-1) + jB);
        }
        return new bu1(hy1Var, jMax, j10, -9223372036854775807L, jB, false, false, false);
    }

    public cu1(t3.d dVar, m3.v vVar, s3.q qVar, s3.k kVar) {
        this.f4328j = dVar;
        this.f4329k = vVar;
        this.f4330l = qVar;
        this.f4327h = new j3.m0();
        this.i = new j3.n0();
        this.f4326g = new ArrayList();
    }
}
