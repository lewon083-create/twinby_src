package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f41982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f41983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f41984h;

    public pp(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f41977a = j10;
        this.f41978b = j11;
        this.f41980d = j12;
        this.f41981e = j13;
        this.f41982f = j14;
        this.f41983g = j15;
        this.f41979c = j16;
        this.f41984h = a(j11, j12, j13, j14, j15, j16);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        long j17 = j16 / 20;
        int i = lb3.f40466a;
        return Math.max(j13, Math.min(((j16 + j13) - j15) - j17, j14 - 1));
    }
}
