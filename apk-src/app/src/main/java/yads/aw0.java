package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class aw0 implements yw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw0 f36871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36872b;

    public aw0(cw0 cw0Var, long j10) {
        this.f36871a = cw0Var;
        this.f36872b = j10;
    }

    @Override // yads.yw2
    public final boolean b() {
        return true;
    }

    @Override // yads.yw2
    public final long c() {
        return this.f36871a.b();
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        cw0 cw0Var = this.f36871a;
        bw0 bw0Var = cw0Var.f37540k;
        if (bw0Var == null) {
            throw new IllegalStateException();
        }
        long[] jArr = bw0Var.f37161a;
        long[] jArr2 = bw0Var.f37162b;
        int iB = lb3.b(jArr, cw0Var.a(j10), false);
        long j11 = iB == -1 ? 0L : jArr[iB];
        long j12 = iB != -1 ? jArr2[iB] : 0L;
        long j13 = this.f36871a.f37535e;
        long j14 = (j11 * 1000000) / j13;
        long j15 = this.f36872b;
        ax2 ax2Var = new ax2(j14, j12 + j15);
        if (j14 == j10 || iB == jArr.length - 1) {
            return new ww2(ax2Var, ax2Var);
        }
        int i = iB + 1;
        return new ww2(ax2Var, new ax2((jArr[i] * 1000000) / j13, j15 + jArr2[i]));
    }
}
