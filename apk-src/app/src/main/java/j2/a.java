package j2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f26177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f26181h;
    public int i;

    public final float a(long j10) {
        if (j10 < this.f26178e) {
            return 0.0f;
        }
        long j11 = this.f26180g;
        if (j11 < 0 || j10 < j11) {
            return d.b((j10 - r0) / this.f26174a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f26181h;
        return (d.b((j10 - j11) / this.i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
