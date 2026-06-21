package na;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends UnsupportedOperationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ma.d f29201b;

    public m(ma.d dVar) {
        this.f29201b = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f29201b));
    }
}
