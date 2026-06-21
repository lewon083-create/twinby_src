package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yv0 implements r92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw0 f45154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bw0 f45155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45156c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45157d = -1;

    public yv0(cw0 cw0Var, bw0 bw0Var) {
        this.f45154a = cw0Var;
        this.f45155b = bw0Var;
    }

    @Override // yads.r92
    public final yw2 a() {
        long j10 = this.f45156c;
        if (j10 != -1) {
            return new aw0(this.f45154a, j10);
        }
        throw new IllegalStateException();
    }

    @Override // yads.r92
    public final long a(ld0 ld0Var) {
        long j10 = this.f45157d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f45157d = -1L;
        return j11;
    }

    @Override // yads.r92
    public final void a(long j10) {
        long[] jArr = this.f45155b.f37161a;
        this.f45157d = jArr[lb3.b(jArr, j10, true)];
    }
}
