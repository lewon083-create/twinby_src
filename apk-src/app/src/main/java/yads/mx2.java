package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mx2 implements as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rj0 f41094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41098e;

    public mx2(rj0 rj0Var, long j10, int i, long j11, int i10) {
        this.f41094a = rj0Var;
        this.f41095b = j10;
        this.f41096c = i;
        this.f41097d = j11;
        this.f41098e = i10;
    }

    @Override // yads.as
    public final void a(long j10, long j11, long j12) {
        float f10;
        long j13 = this.f41097d + j12;
        this.f41097d = j13;
        rj0 rj0Var = this.f41094a;
        long j14 = this.f41095b;
        if (j14 == -1 || j14 == 0) {
            int i = this.f41096c;
            f10 = i != 0 ? (this.f41098e * 100.0f) / i : -1.0f;
        } else {
            f10 = (j13 * 100.0f) / j14;
        }
        ((mj0) rj0Var).a(j14, j13, f10);
    }
}
