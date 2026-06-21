package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class js2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pe f39970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public js2 f39971d;

    public js2(int i, long j10) {
        a(i, j10);
    }

    public final void a(int i, long j10) {
        if (this.f39970c != null) {
            throw new IllegalStateException();
        }
        this.f39968a = j10;
        this.f39969b = j10 + ((long) i);
    }
}
