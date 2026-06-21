package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yd0 implements tf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f45013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45014d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45015e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45017g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45018h = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f45020k = 0.97f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f45019j = 1.03f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f45021l = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45022m = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45016f = -9223372036854775807L;
    public long i = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f45023n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f45024o = -9223372036854775807L;

    public yd0(long j10, long j11, float f10) {
        this.f45011a = j10;
        this.f45012b = j11;
        this.f45013c = f10;
    }

    public final void a() {
        long j10 = this.f45014d;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f45015e;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f45017g;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f45018h;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f45016f == j10) {
            return;
        }
        this.f45016f = j10;
        this.i = j10;
        this.f45023n = -9223372036854775807L;
        this.f45024o = -9223372036854775807L;
        this.f45022m = -9223372036854775807L;
    }
}
