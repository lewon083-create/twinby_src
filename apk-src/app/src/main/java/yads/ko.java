package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ko implements ak1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40298d;

    public ko(long j10, long j11) {
        this.f40296b = j10;
        this.f40297c = j11;
        c();
    }

    public final void c() {
        this.f40298d = this.f40296b - 1;
    }

    @Override // yads.ak1
    public final boolean next() {
        long j10 = this.f40298d + 1;
        this.f40298d = j10;
        return !(j10 > this.f40297c);
    }
}
