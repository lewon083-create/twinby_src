package bf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7.f f2108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f2109b;

    public f(v7.f fVar, Runnable runnable) {
        this.f2108a = fVar;
        this.f2109b = runnable;
    }

    public final Integer a() {
        v7.f fVar = this.f2108a;
        if (fVar != null) {
            return Integer.valueOf(((e) fVar.f34767c).f2098c);
        }
        return null;
    }
}
