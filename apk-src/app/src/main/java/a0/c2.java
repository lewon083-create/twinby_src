package a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c2 f53d = new c2(0, false, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c2 f54e = new c2(500, true, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c2 f55f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58c;

    static {
        new c2(100L, true, false);
        f55f = new c2(0L, false, true);
    }

    public c2(long j10, boolean z5, boolean z10) {
        this.f57b = z5;
        this.f56a = j10;
        if (z10) {
            f2.g.a("shouldRetry must be false when completeWithoutFailure is set to true", !z5);
        }
        this.f58c = z10;
    }
}
