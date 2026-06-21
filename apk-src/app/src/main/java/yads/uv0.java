package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uv0 implements nq0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qq0 f43784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p73 f43785f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vs1 f43787h;
    public cw0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public tv0 f43790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f43791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f43792n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f43780a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f43781b = new lb2(0, new byte[32768]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43782c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vv0 f43783d = new vv0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43786g = 0;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f43784e = qq0Var;
        this.f43785f = qq0Var.a(0, 1);
        qq0Var.a();
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f43786g = 0;
        } else {
            tv0 tv0Var = this.f43790l;
            if (tv0Var != null) {
                tv0Var.a(j11);
            }
        }
        this.f43792n = j11 != 0 ? -1L : 0L;
        this.f43791m = 0;
        this.f43781b.c(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02bb  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r27, yads.ig2 r28) throws yads.qb2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.uv0.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ld0 ld0Var = (ld0) oq0Var;
        vs1 vs1VarA = new x21().a(ld0Var, v21.f43856b);
        if (vs1VarA != null) {
            int length = vs1VarA.f44117b.length;
        }
        byte[] bArr = new byte[4];
        ld0Var.b(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    public static nq0[] a() {
        return new nq0[]{new uv0()};
    }
}
