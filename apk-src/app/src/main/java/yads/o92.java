package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o92 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qq0 f41495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c43 f41496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41497c;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f41495a = qq0Var;
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        c43 c43Var = this.f41496b;
        if (c43Var != null) {
            p92 p92Var = c43Var.f37279a;
            q92 q92Var = p92Var.f41846a;
            q92Var.f42229a = 0;
            q92Var.f42230b = 0L;
            q92Var.f42231c = 0;
            q92Var.f42232d = 0;
            q92Var.f42233e = 0;
            p92Var.f41847b.c(0);
            p92Var.f41848c = -1;
            p92Var.f41850e = false;
            if (j10 == 0) {
                c43Var.a(!c43Var.f37289l);
                return;
            }
            if (c43Var.f37286h != 0) {
                long j12 = (((long) c43Var.i) * j11) / 1000000;
                c43Var.f37283e = j12;
                r92 r92Var = c43Var.f37282d;
                int i = lb3.f40466a;
                r92Var.a(j12);
                c43Var.f37286h = 2;
            }
        }
    }

    @Override // yads.nq0
    public final int a(oq0 oq0Var, ig2 ig2Var) throws qb2 {
        int i;
        if (this.f41495a == null) {
            throw new IllegalStateException();
        }
        if (this.f41496b == null) {
            ld0 ld0Var = (ld0) oq0Var;
            if (!a(ld0Var)) {
                throw new qb2("Failed to determine bitstream type", null, true, 1);
            }
            ld0Var.f40507f = 0;
        }
        if (!this.f41497c) {
            p73 p73VarA = this.f41495a.a(0, 1);
            this.f41495a.a();
            c43 c43Var = this.f41496b;
            c43Var.f37281c = this.f41495a;
            c43Var.f37280b = p73VarA;
            c43Var.a(true);
            this.f41497c = true;
        }
        c43 c43Var2 = this.f41496b;
        if (c43Var2.f37280b == null) {
            throw new IllegalStateException();
        }
        int i10 = lb3.f40466a;
        int i11 = c43Var2.f37286h;
        if (i11 == 0) {
            while (true) {
                ld0 ld0Var2 = (ld0) oq0Var;
                if (!c43Var2.f37279a.a(ld0Var2)) {
                    c43Var2.f37286h = 3;
                    break;
                }
                long j10 = ld0Var2.f40505d;
                long j11 = c43Var2.f37284f;
                c43Var2.f37288k = j10 - j11;
                if (!c43Var2.a(c43Var2.f37279a.f41847b, j11, c43Var2.f37287j)) {
                    nx0 nx0Var = c43Var2.f37287j.f36630a;
                    c43Var2.i = nx0Var.A;
                    if (!c43Var2.f37290m) {
                        c43Var2.f37280b.a(nx0Var);
                        c43Var2.f37290m = true;
                    }
                    yv0 yv0Var = c43Var2.f37287j.f36631b;
                    if (yv0Var != null) {
                        c43Var2.f37282d = yv0Var;
                    } else {
                        long j12 = ld0Var2.f40504c;
                        if (j12 != -1) {
                            q92 q92Var = c43Var2.f37279a.f41846a;
                            i = 2;
                            c43Var2.f37282d = new me0(c43Var2, c43Var2.f37284f, j12, q92Var.f42232d + q92Var.f42233e, q92Var.f42230b, (q92Var.f42229a & 4) != 0);
                            c43Var2.f37286h = i;
                            c43Var2.f37279a.a();
                            return 0;
                        }
                        c43Var2.f37282d = new b43();
                    }
                    i = 2;
                    c43Var2.f37286h = i;
                    c43Var2.f37279a.a();
                    return 0;
                }
                c43Var2.f37284f = ld0Var2.f40505d;
            }
        } else {
            if (i11 == 1) {
                ((ld0) oq0Var).a((int) c43Var2.f37284f);
                c43Var2.f37286h = 2;
                return 0;
            }
            if (i11 == 2) {
                ld0 ld0Var3 = (ld0) oq0Var;
                long jA = c43Var2.f37282d.a(ld0Var3);
                if (jA >= 0) {
                    ig2Var.f39538a = jA;
                    return 1;
                }
                if (jA < -1) {
                    c43Var2.a(-(jA + 2));
                }
                if (!c43Var2.f37289l) {
                    yw2 yw2VarA = c43Var2.f37282d.a();
                    if (yw2VarA == null) {
                        throw new IllegalStateException();
                    }
                    c43Var2.f37281c.a(yw2VarA);
                    c43Var2.f37289l = true;
                }
                if (c43Var2.f37288k <= 0 && !c43Var2.f37279a.a(ld0Var3)) {
                    c43Var2.f37286h = 3;
                    return -1;
                }
                c43Var2.f37288k = 0L;
                lb2 lb2Var = c43Var2.f37279a.f41847b;
                long jA2 = c43Var2.a(lb2Var);
                if (jA2 >= 0) {
                    long j13 = c43Var2.f37285g;
                    if (j13 + jA2 >= c43Var2.f37283e) {
                        long j14 = (j13 * 1000000) / ((long) c43Var2.i);
                        c43Var2.f37280b.a(lb2Var.f40465c, lb2Var);
                        c43Var2.f37280b.a(j14, 1, lb2Var.f40465c, 0, null);
                        c43Var2.f37283e = -1L;
                    }
                }
                c43Var2.f37285g += jA2;
                return 0;
            }
            if (i11 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        try {
            return a((ld0) oq0Var);
        } catch (qb2 unused) {
            return false;
        }
    }

    public static /* synthetic */ nq0[] a() {
        return new nq0[]{new o92()};
    }

    public final boolean a(ld0 ld0Var) {
        q92 q92Var = new q92();
        if (q92Var.a(ld0Var, true) && (q92Var.f42229a & 2) == 2) {
            int iMin = Math.min(q92Var.f42233e, 8);
            lb2 lb2Var = new lb2(iMin);
            ld0Var.b(lb2Var.f40463a, 0, iMin, false);
            lb2Var.e(0);
            if (lb2Var.f40465c - lb2Var.f40464b >= 5 && lb2Var.m() == 127 && lb2Var.n() == 1179402563) {
                this.f41496b = new zv0();
            } else {
                lb2Var.e(0);
                if (gn3.a(1, lb2Var, true)) {
                    this.f41496b = new cn3();
                } else {
                    lb2Var.e(0);
                    if (sa2.a(lb2Var, sa2.f42869o)) {
                        this.f41496b = new sa2();
                    }
                }
            }
            return true;
        }
        return false;
    }
}
