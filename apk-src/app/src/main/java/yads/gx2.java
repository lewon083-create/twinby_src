package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gx2 extends fx2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f38937j;

    public gx2(rl2 rl2Var, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(rl2Var, j10, j11, j12, j13, list, j14, j15, j16);
        this.f38937j = list2;
    }

    @Override // yads.fx2
    public final long a(long j10) {
        return this.f38937j.size();
    }

    @Override // yads.fx2
    public final boolean b() {
        return true;
    }

    @Override // yads.fx2
    public final rl2 a(long j10, no2 no2Var) {
        return (rl2) this.f38937j.get((int) (j10 - this.f38570d));
    }
}
