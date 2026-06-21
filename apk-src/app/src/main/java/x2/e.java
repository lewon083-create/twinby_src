package x2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35728b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f35727a = 0L;
            this.f35728b = 1L;
        } else {
            this.f35727a = j10;
            this.f35728b = j11;
        }
    }

    public final String toString() {
        return this.f35727a + "/" + this.f35728b;
    }
}
