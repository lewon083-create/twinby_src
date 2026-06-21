package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class np implements yw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp f41330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41332c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f41334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f41335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f41336g;

    public np(qp qpVar, long j10, long j11, long j12, long j13, long j14) {
        this.f41330a = qpVar;
        this.f41331b = j10;
        this.f41333d = j11;
        this.f41334e = j12;
        this.f41335f = j13;
        this.f41336g = j14;
    }

    @Override // yads.yw2
    public final boolean b() {
        return true;
    }

    @Override // yads.yw2
    public final long c() {
        return this.f41331b;
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        ax2 ax2Var = new ax2(j10, pp.a(this.f41330a.a(j10), this.f41332c, this.f41333d, this.f41334e, this.f41335f, this.f41336g));
        return new ww2(ax2Var, ax2Var);
    }
}
