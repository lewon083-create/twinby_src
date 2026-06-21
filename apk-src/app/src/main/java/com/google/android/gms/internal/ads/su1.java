package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class su1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10396b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10397c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10398d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10400f;

    public /* synthetic */ su1(int i, Object obj, Object obj2) {
        this.f10399e = obj;
        this.f10395a = i;
        this.f10400f = obj2;
    }

    public static final void A(gx1 gx1Var) {
        int i = gx1Var.i;
        if (i == 2) {
            ix.k0(i == 2);
            gx1Var.i = 1;
            gx1Var.f();
        }
    }

    public static void b(s3.a aVar) {
        int i = aVar.i;
        if (i == 2) {
            com.google.android.gms.internal.measurement.h5.r(i == 2);
            aVar.i = 1;
            aVar.t();
        }
    }

    public static boolean h(s3.a aVar) {
        return aVar.i != 0;
    }

    public static void l(s3.a aVar, long j10) {
        aVar.f32442o = true;
        if (aVar instanceof k4.e) {
            k4.e eVar = (k4.e) aVar;
            com.google.android.gms.internal.measurement.h5.r(eVar.f32442o);
            eVar.L = j10;
        }
    }

    public static boolean y(gx1 gx1Var) {
        return gx1Var.i != 0;
    }

    public boolean B() {
        return ((gx1) this.f10400f) != null;
    }

    public void C() {
        int i;
        ix.k0(!D());
        if (y((gx1) this.f10399e)) {
            i = 3;
        } else {
            gx1 gx1Var = (gx1) this.f10400f;
            i = (gx1Var == null || gx1Var.i == 0) ? 2 : 4;
        }
        this.f10396b = i;
    }

    public boolean D() {
        int i = this.f10396b;
        return i == 2 || i == 4 || i == 3;
    }

    public int E() {
        gx1 gx1Var = (gx1) this.f10400f;
        boolean zY = y((gx1) this.f10399e);
        int i = 0;
        if (gx1Var != null && gx1Var.i != 0) {
            i = 1;
        }
        return (zY ? 1 : 0) + i;
    }

    public void F() {
        int i = ((gx1) this.f10399e).f5933c;
    }

    public boolean G(au1 au1Var) {
        gx1 gx1VarZ = z(au1Var);
        gx1VarZ.getClass();
        return gx1VarZ.m0();
    }

    public void H(au1 au1Var) {
        gx1 gx1VarZ = z(au1Var);
        gx1VarZ.getClass();
        gx1VarZ.f5955o = true;
    }

    public void I(g gVar, g gVar2) {
        int i;
        gx1 gx1Var = (gx1) this.f10399e;
        int i10 = this.f10395a;
        boolean zB = gVar.b(i10);
        boolean zB2 = gVar2.b(i10);
        gx1 gx1Var2 = (gx1) this.f10400f;
        if (gx1Var2 == null || (i = this.f10396b) == 3 || (i == 0 && y(gx1Var))) {
            gx1Var2 = gx1Var;
        }
        if (!zB || gx1Var2.f5955o) {
            return;
        }
        int i11 = gx1Var.f5933c;
        ru1 ru1Var = ((ru1[]) gVar.f5553c)[i10];
        ru1 ru1Var2 = ((ru1[]) gVar2.f5553c)[i10];
        if (zB2 && Objects.equals(ru1Var2, ru1Var) && !D()) {
            return;
        }
        gx1Var2.f5955o = true;
    }

    public void J() {
        int i;
        gx1 gx1Var = (gx1) this.f10399e;
        if (y(gx1Var) && (i = this.f10396b) != 4 && i != 2) {
            gx1Var.f5955o = true;
        }
        gx1 gx1Var2 = (gx1) this.f10400f;
        if (gx1Var2 == null || gx1Var2.i == 0 || this.f10396b == 3) {
            return;
        }
        gx1Var2.f5955o = true;
    }

    public void K() {
        gx1 gx1Var = (gx1) this.f10399e;
        if (y(gx1Var)) {
            gx1Var.r();
            return;
        }
        gx1 gx1Var2 = (gx1) this.f10400f;
        if (gx1Var2 == null || gx1Var2.i == 0) {
            return;
        }
        gx1Var2.r();
    }

    public boolean L() {
        gx1 gx1Var = (gx1) this.f10399e;
        boolean zU = y(gx1Var) ? gx1Var.u() : true;
        gx1 gx1Var2 = (gx1) this.f10400f;
        return (gx1Var2 == null || gx1Var2.i == 0) ? zU : zU & gx1Var2.u();
    }

    public boolean M(au1 au1Var) {
        int i = this.f10396b;
        return ((i == 2 || i == 4) && z(au1Var) == ((gx1) this.f10399e)) || (this.f10396b == 3 && z(au1Var) == ((gx1) this.f10400f));
    }

    public boolean N(au1 au1Var) {
        return u(au1Var, (gx1) this.f10399e) && u(au1Var, (gx1) this.f10400f);
    }

    public void O(long j10, long j11) {
        gx1 gx1Var = (gx1) this.f10399e;
        if (y(gx1Var)) {
            gx1Var.s(j10, j11);
        }
        gx1 gx1Var2 = (gx1) this.f10400f;
        if (gx1Var2 == null || gx1Var2.i == 0) {
            return;
        }
        gx1Var2.s(j10, j11);
    }

    public boolean P(au1 au1Var) {
        gx1 gx1VarZ = z(au1Var);
        return gx1VarZ == null || gx1VarZ.m0() || gx1VarZ.t() || gx1VarZ.u();
    }

    public void Q() {
        int i;
        gx1 gx1Var = (gx1) this.f10399e;
        int i10 = gx1Var.i;
        if (i10 == 1 && this.f10396b != 4) {
            ix.k0(i10 == 1);
            gx1Var.i = 2;
            gx1Var.e();
            return;
        }
        gx1 gx1Var2 = (gx1) this.f10400f;
        if (gx1Var2 == null || (i = gx1Var2.i) != 1 || this.f10396b == 3) {
            return;
        }
        ix.k0(i == 1);
        gx1Var2.i = 2;
        gx1Var2.e();
    }

    public void a(s3.a aVar, gn0 gn0Var) {
        com.google.android.gms.internal.measurement.h5.r(((s3.a) this.f10399e) == aVar || ((s3.a) this.f10400f) == aVar);
        if (h(aVar)) {
            if (aVar == ((s3.a) gn0Var.f5877f)) {
                gn0Var.f5878g = null;
                gn0Var.f5877f = null;
                gn0Var.f5873b = true;
            }
            b(aVar);
            com.google.android.gms.internal.measurement.h5.r(aVar.i == 1);
            aVar.f32432d.r();
            aVar.i = 0;
            aVar.f32437j = null;
            aVar.f32438k = null;
            aVar.f32442o = false;
            aVar.n();
            aVar.f32445r = null;
        }
    }

    public int c() {
        boolean zH = h((s3.a) this.f10399e);
        s3.a aVar = (s3.a) this.f10400f;
        return (zH ? 1 : 0) + ((aVar == null || !h(aVar)) ? 0 : 1);
    }

    public s3.a d(s3.j0 j0Var) {
        i4.b1 b1Var;
        if (j0Var != null && (b1Var = j0Var.f32584c[this.f10395a]) != null) {
            s3.a aVar = (s3.a) this.f10399e;
            if (aVar.f32437j == b1Var) {
                return aVar;
            }
            s3.a aVar2 = (s3.a) this.f10400f;
            if (aVar2 != null && aVar2.f32437j == b1Var) {
                return aVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(s3.j0 r8, s3.a r9) {
        /*
            r7 = this;
            int r0 = r7.f10395a
            r1 = 1
            if (r9 != 0) goto L6
            goto L49
        L6:
            i4.b1[] r2 = r8.f32584c
            r2 = r2[r0]
            i4.b1 r3 = r9.f32437j
            if (r3 == 0) goto L49
            if (r3 != r2) goto L3a
            if (r2 == 0) goto L49
            boolean r2 = r9.j()
            if (r2 != 0) goto L49
            s3.j0 r2 = r8.f32593m
            s3.k0 r3 = r8.f32588g
            boolean r3 = r3.f32604g
            if (r3 == 0) goto L3a
            if (r2 == 0) goto L3a
            boolean r3 = r2.f32586e
            if (r3 == 0) goto L3a
            boolean r3 = r9 instanceof k4.e
            if (r3 != 0) goto L39
            boolean r3 = r9 instanceof c4.b
            if (r3 != 0) goto L39
            long r3 = r9.f32441n
            long r5 = r2.e()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L3a
            goto L49
        L39:
            return r1
        L3a:
            s3.j0 r8 = r8.f32593m
            if (r8 == 0) goto L47
            i4.b1[] r8 = r8.f32584c
            r8 = r8[r0]
            i4.b1 r9 = r9.f32437j
            if (r8 != r9) goto L47
            goto L49
        L47:
            r8 = 0
            return r8
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.su1.e(s3.j0, s3.a):boolean");
    }

    public boolean f() {
        int i = this.f10396b;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean g() {
        int i = this.f10396b;
        if (i == 0 || i == 2 || i == 4) {
            return h((s3.a) this.f10399e);
        }
        s3.a aVar = (s3.a) this.f10400f;
        aVar.getClass();
        return aVar.i != 0;
    }

    public void i(boolean z5) {
        if (z5) {
            if (this.f10397c) {
                s3.a aVar = (s3.a) this.f10399e;
                com.google.android.gms.internal.measurement.h5.r(aVar.i == 0);
                aVar.f32432d.r();
                aVar.r();
                this.f10397c = false;
                return;
            }
            return;
        }
        if (this.f10398d) {
            s3.a aVar2 = (s3.a) this.f10400f;
            aVar2.getClass();
            com.google.android.gms.internal.measurement.h5.r(aVar2.i == 0);
            aVar2.f32432d.r();
            aVar2.r();
            this.f10398d = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(s3.a aVar, s3.j0 j0Var, l4.v vVar, gn0 gn0Var) {
        int i;
        s3.a aVar2 = (s3.a) this.f10399e;
        int i10 = this.f10395a;
        if (aVar == null || aVar.i == 0 || (aVar == aVar2 && ((i = this.f10396b) == 2 || i == 4))) {
            return 1;
        }
        if (aVar == ((s3.a) this.f10400f) && this.f10396b == 3) {
            return 1;
        }
        byte b2 = aVar.f32437j != j0Var.f32584c[i10];
        boolean zB = vVar.b(i10);
        if (!zB || b2 != false) {
            if (!aVar.f32442o) {
                l4.r rVar = vVar.f27921c[i10];
                int length = rVar != null ? rVar.length() : 0;
                j3.o[] oVarArr = new j3.o[length];
                for (int i11 = 0; i11 < length; i11++) {
                    rVar.getClass();
                    oVarArr[i11] = rVar.f(i11);
                }
                i4.b1 b1Var = j0Var.f32584c[i10];
                b1Var.getClass();
                aVar.y(oVarArr, b1Var, j0Var.e(), j0Var.f32596p, j0Var.f32588g.f32598a);
                return 3;
            }
            if (!aVar.k()) {
                return 0;
            }
            a(aVar, gn0Var);
            if (!zB || f()) {
                i(aVar == aVar2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((s3.a) this.f10399e)) {
            i(true);
        }
        s3.a aVar = (s3.a) this.f10400f;
        if (aVar == null || aVar.i != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i;
        s3.a aVar = (s3.a) this.f10399e;
        int i10 = aVar.i;
        if (i10 == 1 && this.f10396b != 4) {
            com.google.android.gms.internal.measurement.h5.r(i10 == 1);
            aVar.i = 2;
            aVar.s();
            return;
        }
        s3.a aVar2 = (s3.a) this.f10400f;
        if (aVar2 == null || (i = aVar2.i) != 1 || this.f10396b == 3) {
            return;
        }
        com.google.android.gms.internal.measurement.h5.r(i == 1);
        aVar2.i = 2;
        aVar2.s();
    }

    public void n() {
        int i = this.f10396b;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.f10396b = 0;
                return;
            }
            return;
        }
        boolean z5 = i == 4;
        gx1 gx1Var = (gx1) this.f10399e;
        gx1 gx1Var2 = (gx1) this.f10400f;
        if (z5) {
            gx1Var2.getClass();
            gx1Var2.c(17, gx1Var);
        } else {
            gx1Var2.getClass();
            gx1Var.c(17, gx1Var2);
        }
        this.f10396b = this.f10396b != 4 ? 1 : 0;
    }

    public void o() {
        if (!y((gx1) this.f10399e)) {
            w(true);
        }
        gx1 gx1Var = (gx1) this.f10400f;
        if (gx1Var == null || gx1Var.i != 0) {
            return;
        }
        w(false);
    }

    public int p(au1 au1Var, g gVar, gn0 gn0Var) {
        int iX = x((gx1) this.f10399e, au1Var, gVar, gn0Var);
        return iX == 1 ? x((gx1) this.f10400f, au1Var, gVar, gn0Var) : iX;
    }

    public void q() {
        gx1 gx1Var = (gx1) this.f10399e;
        ix.k0(gx1Var.i == 0);
        gx1Var.i();
        this.f10397c = false;
        gx1 gx1Var2 = (gx1) this.f10400f;
        if (gx1Var2 != null) {
            ix.k0(gx1Var2.i == 0);
            gx1Var2.i();
            this.f10398d = false;
        }
    }

    public void r(Object obj) {
        gx1 gx1Var = (gx1) this.f10399e;
        if (gx1Var.f5933c != 2) {
            return;
        }
        int i = this.f10396b;
        if (i != 4 && i != 1) {
            gx1Var.c(1, obj);
            return;
        }
        gx1 gx1Var2 = (gx1) this.f10400f;
        gx1Var2.getClass();
        gx1Var2.c(1, obj);
    }

    public void s(t0 t0Var) {
        gx1 gx1Var = (gx1) this.f10399e;
        if (gx1Var.f5933c == 2) {
            gx1Var.c(7, t0Var);
            gx1 gx1Var2 = (gx1) this.f10400f;
            if (gx1Var2 != null) {
                gx1Var2.c(7, t0Var);
            }
        }
    }

    public boolean t() {
        int i = this.f10396b;
        if (i == 0 || i == 2 || i == 4) {
            return y((gx1) this.f10399e);
        }
        gx1 gx1Var = (gx1) this.f10400f;
        gx1Var.getClass();
        return gx1Var.i != 0;
    }

    public boolean u(au1 au1Var, gx1 gx1Var) {
        if (gx1Var == null) {
            return true;
        }
        gz1[] gz1VarArr = au1Var.f3420c;
        int i = this.f10395a;
        gz1 gz1Var = gz1VarArr[i];
        gz1 gz1Var2 = gx1Var.f5945j;
        if (gz1Var2 == null) {
            return true;
        }
        if (gz1Var2 == gz1Var && (gz1Var == null || gx1Var.m0())) {
            return true;
        }
        au1 au1Var2 = au1Var.f3429m;
        return au1Var2 != null && au1Var2.f3420c[i] == gx1Var.f5945j;
    }

    public void v(gx1 gx1Var, gn0 gn0Var) {
        ix.k0(((gx1) this.f10399e) == gx1Var || ((gx1) this.f10400f) == gx1Var);
        if (y(gx1Var)) {
            if (gx1Var == ((gx1) gn0Var.f5877f)) {
                gn0Var.f5878g = null;
                gn0Var.f5877f = null;
                gn0Var.f5873b = true;
            }
            A(gx1Var);
            ix.k0(gx1Var.i == 1);
            zd1 zd1Var = gx1Var.f5935d;
            zd1Var.f12971c = null;
            zd1Var.f12972d = null;
            gx1Var.i = 0;
            gx1Var.f5945j = null;
            gx1Var.f5947k = null;
            gx1Var.f5955o = false;
            gx1Var.g();
            gx1Var.f5960r = null;
        }
    }

    public void w(boolean z5) {
        if (z5) {
            if (this.f10397c) {
                gx1 gx1Var = (gx1) this.f10399e;
                ix.k0(gx1Var.i == 0);
                zd1 zd1Var = gx1Var.f5935d;
                zd1Var.f12971c = null;
                zd1Var.f12972d = null;
                gx1Var.h();
                this.f10397c = false;
                return;
            }
            return;
        }
        if (this.f10398d) {
            gx1 gx1Var2 = (gx1) this.f10400f;
            gx1Var2.getClass();
            ix.k0(gx1Var2.i == 0);
            zd1 zd1Var2 = gx1Var2.f5935d;
            zd1Var2.f12971c = null;
            zd1Var2.f12972d = null;
            gx1Var2.h();
            this.f10398d = false;
        }
    }

    public int x(gx1 gx1Var, au1 au1Var, g gVar, gn0 gn0Var) {
        int i;
        if (gx1Var != null && gx1Var.i != 0) {
            gx1 gx1Var2 = (gx1) this.f10399e;
            boolean z5 = gx1Var != gx1Var2;
            if (gx1Var == gx1Var2 && ((i = this.f10396b) == 2 || i == 4)) {
                return 1;
            }
            if (gx1Var == ((gx1) this.f10400f) && this.f10396b == 3) {
                return 1;
            }
            gz1 gz1Var = gx1Var.f5945j;
            gz1[] gz1VarArr = au1Var.f3420c;
            int i10 = this.f10395a;
            gz1 gz1Var2 = gz1VarArr[i10];
            boolean zB = gVar.b(i10);
            if (!zB || gz1Var != gz1Var2) {
                if (!gx1Var.f5955o) {
                    d dVar = ((d[]) gVar.f5554d)[i10];
                    int i11 = dVar != null ? dVar.i() : 0;
                    jx1[] jx1VarArr = new jx1[i11];
                    for (int i12 = 0; i12 < i11; i12++) {
                        dVar.getClass();
                        jx1VarArr[i12] = dVar.u(i12);
                    }
                    gz1 gz1Var3 = gz1VarArr[i10];
                    gz1Var3.getClass();
                    gx1Var.l0(jx1VarArr, gz1Var3, au1Var.a(), au1Var.f3432p, au1Var.f3424g.f3906a);
                    return 3;
                }
                if (!gx1Var.u()) {
                    return 0;
                }
                v(gx1Var, gn0Var);
                if (!zB || D()) {
                    w(!z5);
                    return 1;
                }
            }
        }
        return 1;
    }

    public gx1 z(au1 au1Var) {
        if (au1Var != null) {
            gz1 gz1Var = au1Var.f3420c[this.f10395a];
            if (gz1Var != null) {
                gx1 gx1Var = (gx1) this.f10399e;
                if (gx1Var.f5945j == gz1Var) {
                    return gx1Var;
                }
                gx1 gx1Var2 = (gx1) this.f10400f;
                if (gx1Var2 != null && gx1Var2.f5945j == gz1Var) {
                    return gx1Var2;
                }
            }
        }
        return null;
    }
}
