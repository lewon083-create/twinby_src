package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class on3 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qq0 f41658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p73 f41659b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mn3 f41662e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41660c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41661d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41663f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f41664g = -1;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f41658a = qq0Var;
        this.f41659b = qq0Var.a(0, 1);
        qq0Var.a();
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        this.f41660c = j10 == 0 ? 0 : 4;
        mn3 mn3Var = this.f41662e;
        if (mn3Var != null) {
            mn3Var.a(j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x017c, code lost:
    
        if (r12 != 65534) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r25, yads.ig2 r26) throws yads.qb2 {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.on3.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        return rn3.a((ld0) oq0Var);
    }

    public static /* synthetic */ nq0[] a() {
        return new nq0[]{new on3()};
    }
}
