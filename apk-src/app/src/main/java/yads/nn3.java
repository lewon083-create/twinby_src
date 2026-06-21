package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nn3 implements mn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qq0 f41300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p73 f41301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pn3 f41302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nx0 f41303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f41305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f41307h;

    public nn3(qq0 qq0Var, p73 p73Var, pn3 pn3Var, String str, int i) throws qb2 {
        this.f41300a = qq0Var;
        this.f41301b = p73Var;
        this.f41302c = pn3Var;
        int i10 = (pn3Var.f41962a * pn3Var.f41965d) / 8;
        if (pn3Var.f41964c != i10) {
            StringBuilder sbM = l7.o.m(i10, "Expected block size: ", "; got: ");
            sbM.append(pn3Var.f41964c);
            throw qb2.a(sbM.toString());
        }
        int i11 = pn3Var.f41963b * i10;
        int i12 = i11 * 8;
        int iMax = Math.max(i10, i11 / 10);
        this.f41304e = iMax;
        this.f41303d = new mx0().d(str).a(i12).e(i12).c(iMax).b(pn3Var.f41962a).g(pn3Var.f41963b).d(i).a();
    }

    @Override // yads.mn3
    public final void a(int i, long j10) {
        this.f41300a.a(new sn3(this.f41302c, 1, i, j10));
        this.f41301b.a(this.f41303d);
    }

    @Override // yads.mn3
    public final void a(long j10) {
        this.f41305f = j10;
        this.f41306g = 0;
        this.f41307h = 0L;
    }

    @Override // yads.mn3
    public final boolean a(ld0 ld0Var, long j10) {
        int i;
        int i10;
        long j11 = j10;
        while (j11 > 0 && (i = this.f41306g) < (i10 = this.f41304e)) {
            int iA = this.f41301b.a(ld0Var, (int) Math.min(i10 - i, j11), true);
            if (iA == -1) {
                j11 = 0;
            } else {
                this.f41306g += iA;
                j11 -= (long) iA;
            }
        }
        int i11 = this.f41302c.f41964c;
        int i12 = this.f41306g / i11;
        if (i12 > 0) {
            long jA = this.f41305f + lb3.a(this.f41307h, 1000000L, r1.f41963b);
            int i13 = i12 * i11;
            int i14 = this.f41306g - i13;
            this.f41301b.a(jA, 1, i13, i14, null);
            this.f41307h += (long) i12;
            this.f41306g = i14;
        }
        return j11 <= 0;
    }
}
