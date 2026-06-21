package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zq implements p73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nx0 f45512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bl0 f45513c = new bl0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nx0 f45514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p73 f45515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45516f;

    public zq(int i, int i10, nx0 nx0Var) {
        this.f45511a = i10;
        this.f45512b = nx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    @Override // yads.p73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.nx0 r23) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zq.a(yads.nx0):void");
    }

    @Override // yads.p73
    public final int a(l30 l30Var, int i, boolean z5) {
        p73 p73Var = this.f45515e;
        int i10 = lb3.f40466a;
        return p73Var.b(l30Var, i, z5);
    }

    @Override // yads.p73
    public final void a(int i, lb2 lb2Var) {
        p73 p73Var = this.f45515e;
        int i10 = lb3.f40466a;
        p73Var.a(i, lb2Var);
    }

    @Override // yads.p73
    public final void a(long j10, int i, int i10, int i11, o73 o73Var) {
        long j11 = this.f45516f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f45515e = this.f45513c;
        }
        p73 p73Var = this.f45515e;
        int i12 = lb3.f40466a;
        p73Var.a(j10, i, i10, i11, o73Var);
    }
}
