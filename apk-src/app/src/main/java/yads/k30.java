package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k30 implements i30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hu f40057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40058b;

    public k30(hu huVar, long j10) {
        this.f40057a = huVar;
        this.f40058b = j10;
    }

    @Override // yads.i30
    public final boolean a() {
        return true;
    }

    @Override // yads.i30
    public final long b() {
        return 0L;
    }

    @Override // yads.i30
    public final long c(long j10, long j11) {
        return 0L;
    }

    @Override // yads.i30
    public final long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // yads.i30
    public final long e(long j10, long j11) {
        return this.f40057a.f39322a;
    }

    @Override // yads.i30
    public final long a(long j10, long j11) {
        hu huVar = this.f40057a;
        return lb3.b(huVar.f39326e, j10 + this.f40058b, true);
    }

    @Override // yads.i30
    public final long b(long j10, long j11) {
        return this.f40057a.f39325d[(int) j10];
    }

    @Override // yads.i30
    public final long c(long j10) {
        return this.f40057a.f39322a;
    }

    @Override // yads.i30
    public final rl2 b(long j10) {
        return new rl2(null, this.f40057a.f39324c[(int) j10], r1.f39323b[r7]);
    }

    @Override // yads.i30
    public final long a(long j10) {
        return this.f40057a.f39326e[(int) j10] - this.f40058b;
    }
}
