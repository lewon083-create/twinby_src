package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class me0 implements r92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q92 f40887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c43 f40890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f40894h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f40896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f40897l;

    public me0(c43 c43Var, long j10, long j11, long j12, long j13, boolean z5) {
        ni.a(j10 >= 0 && j11 > j10);
        this.f40890d = c43Var;
        this.f40888b = j10;
        this.f40889c = j11;
        if (j12 == j11 - j10 || z5) {
            this.f40892f = j13;
            this.f40891e = 4;
        } else {
            this.f40891e = 0;
        }
        this.f40887a = new q92();
    }

    @Override // yads.r92
    public final yw2 a() {
        if (this.f40892f != 0) {
            return new le0(this);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    @Override // yads.r92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(yads.ld0 r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.me0.a(yads.ld0):long");
    }

    @Override // yads.r92
    public final void a(long j10) {
        long j11 = this.f40892f - 1;
        int i = lb3.f40466a;
        this.f40894h = Math.max(0L, Math.min(j10, j11));
        this.f40891e = 2;
        this.i = this.f40888b;
        this.f40895j = this.f40889c;
        this.f40896k = 0L;
        this.f40897l = this.f40892f;
    }
}
