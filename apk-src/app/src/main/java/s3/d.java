package s3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f32476c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f32477d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f32479f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f32480g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f32482j = 0.97f;
    public float i = 1.03f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f32483k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f32484l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f32478e = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f32481h = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f32485m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f32486n = -9223372036854775807L;

    public d(long j10, long j11) {
        this.f32474a = j10;
        this.f32475b = j11;
    }

    public final void a() {
        long j10;
        long j11 = this.f32476c;
        if (j11 != -9223372036854775807L) {
            j10 = this.f32477d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f32479f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f32480g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f32478e == j10) {
            return;
        }
        this.f32478e = j10;
        this.f32481h = j10;
        this.f32485m = -9223372036854775807L;
        this.f32486n = -9223372036854775807L;
        this.f32484l = -9223372036854775807L;
    }
}
