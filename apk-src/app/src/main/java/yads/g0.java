package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements vl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb2 f38585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f38586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p73 f38589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38592h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public nx0 f38593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f38595l;

    public g0() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f0  */
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.lb2 r23) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.g0.a(yads.lb2):void");
    }

    public g0(String str) {
        byte[] bArr = new byte[128];
        this.f38585a = new kb2(bArr);
        this.f38586b = new lb2(bArr);
        this.f38590f = 0;
        this.f38595l = -9223372036854775807L;
        this.f38587c = str;
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, o93 o93Var) {
        o93Var.a();
        o93Var.b();
        this.f38588d = o93Var.f41502e;
        o93Var.b();
        this.f38589e = qq0Var.a(o93Var.f41501d, 1);
    }

    @Override // yads.vl0
    public final void a(int i, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f38595l = j10;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.f38590f = 0;
        this.f38591g = 0;
        this.f38592h = false;
        this.f38595l = -9223372036854775807L;
    }
}
