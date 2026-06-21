package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k61 implements yw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f40080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f40081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f40083d;

    public k61(long j10, long[] jArr, long[] jArr2) {
        ni.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z5 = length > 0;
        this.f40083d = z5;
        if (!z5 || jArr2[0] <= 0) {
            this.f40080a = jArr;
            this.f40081b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f40080a = jArr3;
            long[] jArr4 = new long[i];
            this.f40081b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f40082c = j10;
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        if (!this.f40083d) {
            ax2 ax2Var = ax2.f36874c;
            return new ww2(ax2Var, ax2Var);
        }
        int iB = lb3.b(this.f40081b, j10, true);
        long[] jArr = this.f40081b;
        long j11 = jArr[iB];
        long[] jArr2 = this.f40080a;
        ax2 ax2Var2 = new ax2(j11, jArr2[iB]);
        if (j11 == j10 || iB == jArr.length - 1) {
            return new ww2(ax2Var2, ax2Var2);
        }
        int i = iB + 1;
        return new ww2(ax2Var2, new ax2(jArr[i], jArr2[i]));
    }

    @Override // yads.yw2
    public final long c() {
        return this.f40082c;
    }

    @Override // yads.yw2
    public final boolean b() {
        return this.f40083d;
    }
}
