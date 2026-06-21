package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class xw2 implements yw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ww2 f44829b;

    public xw2() {
        this(-9223372036854775807L, 0L);
    }

    @Override // yads.yw2
    public final boolean b() {
        return false;
    }

    @Override // yads.yw2
    public final long c() {
        return this.f44828a;
    }

    public xw2(long j10, long j11) {
        this.f44828a = j10;
        this.f44829b = new ww2(j11 == 0 ? ax2.f36874c : new ax2(0L, j11));
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        return this.f44829b;
    }
}
