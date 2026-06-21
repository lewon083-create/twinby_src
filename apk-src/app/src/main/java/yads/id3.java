package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class id3 implements cx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f39507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f39508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39510d;

    public id3(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f39507a = jArr;
        this.f39508b = jArr2;
        this.f39509c = j10;
        this.f39510d = j11;
    }

    @Override // yads.cx2
    public final long a() {
        return this.f39510d;
    }

    @Override // yads.yw2
    public final boolean b() {
        return true;
    }

    @Override // yads.yw2
    public final long c() {
        return this.f39509c;
    }

    @Override // yads.cx2
    public final long a(long j10) {
        return this.f39507a[lb3.b(this.f39508b, j10, true)];
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        int iB = lb3.b(this.f39507a, j10, true);
        long[] jArr = this.f39507a;
        long j11 = jArr[iB];
        long[] jArr2 = this.f39508b;
        ax2 ax2Var = new ax2(j11, jArr2[iB]);
        if (j11 >= j10 || iB == jArr.length - 1) {
            return new ww2(ax2Var, ax2Var);
        }
        int i = iB + 1;
        return new ww2(ax2Var, new ax2(jArr[i], jArr2[i]));
    }
}
