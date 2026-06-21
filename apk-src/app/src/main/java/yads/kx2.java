package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class kx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rl2 f40377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40379c;

    public kx2(rl2 rl2Var, long j10, long j11) {
        this.f40377a = rl2Var;
        this.f40378b = j10;
        this.f40379c = j11;
    }

    public rl2 a(no2 no2Var) {
        return this.f40377a;
    }

    public final long a() {
        return lb3.a(this.f40379c, 1000000L, this.f40378b);
    }
}
