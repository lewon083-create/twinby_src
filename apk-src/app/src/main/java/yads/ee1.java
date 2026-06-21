package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ee1 implements nq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qq0 f38086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38089e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public jv1 f38091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public oq0 f38092h;
    public p33 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mv1 f38093j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb2 f38085a = new lb2(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f38090f = -1;

    public final void a() {
        qq0 qq0Var = this.f38086b;
        qq0Var.getClass();
        p73 p73VarA = qq0Var.a(1024, 4);
        mx0 mx0Var = new mx0();
        mx0Var.f41074j = "image/jpeg";
        mx0Var.i = new vs1(new us1[0]);
        p73VarA.a(new nx0(mx0Var));
        qq0 qq0Var2 = this.f38086b;
        qq0Var2.getClass();
        qq0Var2.a();
        this.f38086b.a(new xw2(-9223372036854775807L, 0L));
        this.f38087c = 6;
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f38087c = 0;
            this.f38093j = null;
        } else if (this.f38087c == 5) {
            mv1 mv1Var = this.f38093j;
            mv1Var.getClass();
            mv1Var.seek(j10, j11);
        }
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f38086b = qq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r26, yads.ig2 r27) throws yads.qb2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ee1.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var = (ld0) oq0Var;
        this.f38085a.c(2);
        ld0Var.b(this.f38085a.f40463a, 0, 2, false);
        if (this.f38085a.r() != 65496) {
            return false;
        }
        this.f38085a.c(2);
        ld0Var.b(this.f38085a.f40463a, 0, 2, false);
        int iR = this.f38085a.r();
        this.f38088d = iR;
        if (iR == 65504) {
            this.f38085a.c(2);
            ld0Var.b(this.f38085a.f40463a, 0, 2, false);
            ld0Var.a(false, this.f38085a.r() - 2);
            this.f38085a.c(2);
            ld0Var.b(this.f38085a.f40463a, 0, 2, false);
            this.f38088d = this.f38085a.r();
        }
        if (this.f38088d != 65505) {
            return false;
        }
        ld0Var.a(false, 2);
        this.f38085a.c(6);
        ld0Var.b(this.f38085a.f40463a, 0, 6, false);
        return this.f38085a.n() == 1165519206 && this.f38085a.r() == 0;
    }
}
