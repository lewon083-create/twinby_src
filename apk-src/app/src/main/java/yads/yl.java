package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yl implements nq0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45092c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zl f45094e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45097h;
    public iu i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45102n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb2 f45090a = new lb2(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl f45091b = new xl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qq0 f45093d = new al0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public iu[] f45096g = new iu[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f45099k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45100l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45098j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45095f = -9223372036854775807L;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f45092c = 0;
        this.f45093d = qq0Var;
        this.f45097h = -1L;
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        this.f45097h = -1L;
        this.i = null;
        for (iu iuVar : this.f45096g) {
            if (iuVar.f39641j == 0) {
                iuVar.f39640h = 0;
            } else {
                iuVar.f39640h = iuVar.f39643l[lb3.b(iuVar.f39642k, j10, true)];
            }
        }
        if (j10 != 0) {
            this.f45092c = 6;
        } else if (this.f45096g.length == 0) {
            this.f45092c = 0;
        } else {
            this.f45092c = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r29, yads.ig2 r30) throws yads.qb2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yl.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        ((ld0) oq0Var).b(this.f45090a.f40463a, 0, 12, false);
        this.f45090a.e(0);
        if (this.f45090a.d() != 1179011410) {
            return false;
        }
        lb2 lb2Var = this.f45090a;
        lb2Var.e(lb2Var.f40464b + 4);
        return this.f45090a.d() == 541677121;
    }
}
