package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jx2 extends kx2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40009e;

    public jx2(rl2 rl2Var, long j10, long j11, long j12, long j13) {
        super(rl2Var, j10, j11);
        this.f40008d = j12;
        this.f40009e = j13;
    }

    public final rl2 b() {
        long j10 = this.f40009e;
        if (j10 <= 0) {
            return null;
        }
        return new rl2(null, this.f40008d, j10);
    }
}
